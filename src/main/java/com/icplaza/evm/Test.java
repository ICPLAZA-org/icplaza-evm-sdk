package com.icplaza.evm;


import cn.hutool.http.HttpUtil;
import com.google.gson.Gson;
import com.icplaza.evm.utils.Address;

import java.util.HashMap;
import java.util.Map;

public class Test {

    //主网地址
    static String REST_API_URL = "https://nodemainnet.ic-plaza.org";

    public static void main(String[] args) throws Exception {


        // String json = "{\n" +
        //         "    \"chain_id\": \"icplaza_9000-4\",\n" +
        //         "    \"fee\": {\n" +
        //         "        \"amount\": [\n" +
        //         "            {\n" +
        //         "                \"amount\": \"5000\",\n" +
        //         "                \"denom\": \"uict\"\n" +
        //         "            }\n" +
        //         "        ],\n" +
        //         "        \"gas\": \"200000\"\n" +
        //         "    },\n" +
        //         "    \"sequence\": \"2\",\n" +
        //         "    \"msgs\": [\n" +
        //         "        {\n" +
        //         "            \"type\": \"cosmos-sdk/MsgSend\",\n" +
        //         "            \"value\": {\n" +
        //         "                \"amount\": [\n" +
        //         "                    {\n" +
        //         "                        \"denom\": \"uict\",\n" +
        //         "                        \"amount\": \"1000000000\"\n" +
        //         "                    }\n" +
        //         "                ],\n" +
        //         "                \"from_address\": \"icplaza103vzr6d7crmyvun2uk5jk0dt5wu7j0yynvzu0g\",\n" +
        //         "                \"to_address\": \"icplaza1434f9udjqmcgc9xtf9tdap34ml42wgdpz3xkyd\"\n" +
        //         "            }\n" +
        //         "        }\n" +
        //         "    ],\n" +
        //         "    \"memo\": \"\",\n" +
        //         "    \"account_number\": \"0\"\n" +
        //         "}";
        //

        //私钥
        //购买合约部署权限
        String privateKey = "35f56d7f1d5c982bc49f166eb092da24aed9a54367bbcd07dd5383d15858c5fe";
        String address = Address.fromPrivateKey(privateKey);

        Map m = getAccount(address);
        String sequence = (String) m.get("sequence");
        String account_number = (String) m.get("account_number");

        String fee = "3000000000000000000";

        String json = "{\n" +
                "    \"chain_id\": \"icplaza_9000-1\",\n" +
                "    \"fee\": {\n" +
                "        \"amount\": [\n" +
                "            {\n" +
                "                \"amount\": \"5000\",\n" +
                "                \"denom\": \"uict\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"gas\": \"200000\"\n" +
                "    },\n" +
                "    \"sequence\": \"" + sequence + "\",\n" +
                "    \"msgs\": [\n" +
                "        {\n" +
                "            \"type\": \"validatordao/ReqAuthorization\",\n" +
                "            \"value\": {\n" +
                "                \"authorizer\": \""+address+"\",\n" +
                "                \"biz_name\": \"issue-erc20\",\n" +
                "                \"creator\": \""+address+"\",\n" +
                "                \"fee\": " +
                "                    {\n" +
                "                        \"denom\": \"uict\",\n" +
                "                        \"amount\": \"" + fee + "\"\n" +
                "                    }\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"memo\": \"\",\n" +
                "    \"account_number\": \"" + account_number + "\"\n" +
                "}";

        String r = Transaction.signJson(json, privateKey);

        System.out.println(r);
        String rs = submit(r);

        System.out.println(rs);
    //    返回如下的类似结果
    //    {"txhash":"CD1C8D0F3EAE4A40DB7522BA905A6B36324CE8585D059D1256BA45716701EC2F","raw_log":"[]","logs":[],"events":null}

        //通过哈希判断是否成功
        System.out.println(success("CD1C8D0F3EAE4A40DB7522BA905A6B36324CE8585D059D1256BA45716701EC2F"));


    }


    /**
     * 获取account_number和sequence
     */
    public static Map getAccount(String address) {
        String url = REST_API_URL + "/icplaza/auth/v1beta1/accounts/" + address;
        String rs = HttpUtil.get(url);
        Map map = new HashMap();
        if (rs != null) {
            Map m = new Gson().fromJson(rs, Map.class);
            Map account = (Map) m.get("account");
            Map base_account = (Map) account.get("base_account");
            map.put("account_number", base_account.get("account_number"));
            map.put("sequence", base_account.get("sequence"));
        }
        return map;
    }

    /**
     * 发送消息到rest api
     */
    public static String submit(String json) {
        String url = REST_API_URL + "/txs";
        String rs = HttpUtil.post(url, json);
        System.out.println(rs);
        return rs;
    }

    /**
     * 通过txhash判断交易是否成功
     *
     * */
    public static boolean success(String txhash) {
        String url = REST_API_URL + "/icplaza/tx/v1beta1/txs/" + txhash;
        String rs = HttpUtil.get(url);
        if (rs != null) {
            Map m = new Gson().fromJson(rs, Map.class);
            Map tx_response = (Map) m.get("tx_response");
            Double code = (Double) tx_response.get("code");
            if (code == null || code == 0) {
                return true;
            }
        }
        return false;
    }
}


