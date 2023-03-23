package com.icplaza.evm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.icplaza.evm.common.EnvBase;
import com.icplaza.evm.common.EnvIcplaza;
import com.icplaza.evm.common.EnvInstance;
import com.icplaza.evm.common.HttpUtils;
import com.icplaza.evm.crypto.Crypto;
import com.icplaza.evm.crypto.encode.Sha256;
import com.icplaza.evm.msg.MsgSend;
import com.icplaza.evm.msg.utils.Message;
import com.icplaza.evm.msg.utils.type.MsgSendValue;
import com.icplaza.evm.pojo.Msg;
import com.icplaza.evm.pojo.Tx;
import com.icplaza.evm.utils.AddressUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MsgTest {

    /**
     * 发送转账交易
     * @throws Exception
     */
    @Test
    public void sendTest() throws Exception {
        EnvBase envBase=new EnvIcplaza("https://swagger.ic-plaza.org/");
        String gas = "200000";

        MsgSend msg = new MsgSend();
        msg.setMsgType("cosmos-sdk/MsgSend");
        String privateKey="0bc163bebbe675c9860102d98262705fbf436cb439a28d7f2b46e639ac55528c";
        msg.init(privateKey);
        BigInteger bigInteger = new BigDecimal(String.valueOf(1)).multiply(new BigDecimal(Math.pow(10,18))).toBigInteger();
        Message messages = msg.produceSendMsg(EnvInstance.getEnv().GetDenom(), String.valueOf(bigInteger), "icplaza1vc395tlf8hdxy6qafj0vszpe6arnp63j22j2w4");
        JSONObject jsonObject = msg.submit(messages, new BigDecimal("0.000002").multiply(new BigDecimal(Math.pow(10,18))).toBigInteger().toString(), gas, "");
        System.out.println(jsonObject);
    }
    /**
     * create Account
     * @throws Exception
     */
    @Test
    public void createAddress() throws Exception {
        EnvBase envBase=new EnvIcplaza("https://swagger.ic-plaza.org/");
        String privateKey= Crypto.generatePrivateKey();
        String icplazaAddress=AddressUtil.convertEthAddressToCosmos(Crypto.getAddress(privateKey),envBase.GetMainPrefix());
        System.out.println(privateKey);
        System.out.println(icplazaAddress);


    }
    /**
     * Query block information
     * @throws Exception
     */
    @Test
    public void getBlock(){
        long blockNumber=1403740;
        String blockUrl="https://swagger.ic-plaza.org/blocks/"+blockNumber;
        String s = HttpUtils.httpGet(blockUrl);
        JSONObject json= JSON.parseObject(s);
        System.out.println(s);
        JSONArray txs = json.getJSONObject("block").getJSONObject("data").getJSONArray("txs");
        System.out.println(txs);
        for (String tx:txs.toJavaList(String.class)
             ) {
            String hash= Sha256.tx2Sha256(tx).toUpperCase();
            System.out.println(hash);
        }
    }
    /**
     * Query transaction information
     * @throws Exception
     */
    @Test
    public void getTx(){
        String hash="89E5281B3880F317661F924CF8695CE17D3E7D2EDDA0ED4E665FBCEAC9762AF2";
        String txUrl="https://swagger.ic-plaza.org/icplaza/tx/v1beta1/txs/"+hash;
        String s = HttpUtils.httpGet(txUrl);
        JSONObject json=JSON.parseObject(s, Feature.DisableSpecialKeyDetect);
        System.out.println(json);
        boolean isTransferSuccess=false;
        //判断交易是否成功
        if(json.getJSONObject("tx_response").getInteger("code")==null||json.getJSONObject("tx_response").getInteger("code")==0){
            isTransferSuccess=true;
        }
        JSONArray messages = json.getJSONObject("tx").getJSONObject("body").getJSONArray("messages");
        for (JSONObject message:messages.toJavaList(JSONObject.class)) {
            //判断是不是转账交易
            if("/cosmos.bank.v1beta1.MsgSend".equalsIgnoreCase(message.getString("@type"))){
                message.remove("@type");
                MsgSendValue sendValue=message.toJavaObject(MsgSendValue.class);
                System.out.println(sendValue);
            }
        }


    }

}
