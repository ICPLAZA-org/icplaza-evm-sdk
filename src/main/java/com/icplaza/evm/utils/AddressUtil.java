package com.icplaza.evm.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.icplaza.evm.common.EnvBase;
import com.icplaza.evm.common.EnvIcplaza;
import com.icplaza.evm.crypto.Crypto;
import com.icplaza.evm.crypto.encode.ConvertBits;
import com.icplaza.evm.crypto.hash.Ripemd;
import com.icplaza.evm.exception.AddressFormatException;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// TODO 地址先转成eth，然后通过以太坊转成icplaza地址
public class AddressUtil {
    public static final String mainChainPrefix="icplaza";

    public static String createNewAddressSecp256k1(String mainPrefix, byte[] publickKey) throws Exception {
        String addressResult = null;
        try {
            byte[] pubKeyHash = sha256Hash(publickKey, 0, publickKey.length);
            byte[] address = Ripemd.ripemd160(pubKeyHash);
            byte[] bytes = encode(0, address);
            addressResult = com.icplaza.evm.crypto.encode.Bech32.encode(mainPrefix, bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return addressResult;

    }

    public static String getPubKey(String privateKey){
        String  pubKeyString = Hex.toHexString(Crypto.generatePubKeyFromPriv(privateKey));
        return pubKeyString;
    }

    public static byte[] getPubkeyValue(byte[] publickKey) throws Exception {
        try {
            byte[] pubKeyHash = sha256Hash(publickKey, 0, publickKey.length);
            byte[] value = Ripemd.ripemd160(pubKeyHash);
            return value;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static byte[] decodeAddress(String address) throws Exception {
        byte[] dec = Bech32.decode(address).getData();
        return ConvertBits.convertBits(dec, 0, dec.length, 5, 8, false);
    }

    private static byte[] sha256Hash(byte[] input, int offset, int length) throws NoSuchAlgorithmException {
        byte[] result = new byte[32];
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(input, offset, length);
        return digest.digest();
    }

    public static byte[] encode(int witnessVersion, byte[] witnessProgram) throws AddressFormatException {
        byte[] convertedProgram = ConvertBits.convertBits(witnessProgram, 0, witnessProgram.length, 8, 5, true);
        return convertedProgram;
    }
    /**
     * 从以太坊地址生成cosmos地址
     */
    public static String convertEthAddressToCosmos(String ethAddress, String prefix) throws Exception {
        if (ethAddress.startsWith("0x")) {
            ethAddress = ethAddress.substring(2);
        }
        byte[] bytes = Hex.decode(ethAddress);

        byte[] addr = ConvertBits.convertBits(bytes, 0, bytes.length, 8, 5, true);
        return Bech32.encode(prefix, addr);
    }
    public static String convertCosmosToEthAddress(String cosmosAddress) throws Exception {
        Bech32.Bech32Data data = Bech32.decode(cosmosAddress);
        byte[] dec = data.getData();
        dec = ConvertBits.convertBits(dec, 0, dec.length, 5, 8, false);
        return "0x" + Hex.toHexString(dec);
    }
    public static BigDecimal getBalance(String address, EnvBase env){
        String balance = env.getBalance(address);
        if(StringUtils.isBlank(balance)){
            return BigDecimal.ZERO;
        }
        JSONObject json= JSON.parseObject(balance);

        JSONArray balances=json.getJSONArray("balances");
        if(balances==null||balances.size()==0){
            return BigDecimal.ZERO;
        }
        BigDecimal bal=BigDecimal.ZERO;
        for (JSONObject b:balances.toJavaList(JSONObject.class)) {
            if(env.GetDenom().equalsIgnoreCase(b.getString("denom"))){
                bal=bal.add(b.getBigDecimal("amount"));
            }
        }
        bal=bal.divide(BigDecimal.TEN.pow(18),18,BigDecimal.ROUND_UP);
        return bal;
    }

    public static void main(String[] args) {
        System.out.println(getBalance("icplaza1ru8xvw4mrhan4xnujfjlvdleuhdlxhmc3hm0q3",new EnvIcplaza("http://192.168.3.23:1317/")));
    }
}
