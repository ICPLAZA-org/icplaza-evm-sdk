package com.icplaza.evm;


public class Test {

    public static void main(String[] args) throws Exception {

        String json = "{\n" +
                "    \"chain_id\": \"icplaza_9000-4\",\n" +
                "    \"fee\": {\n" +
                "        \"amount\": [\n" +
                "            {\n" +
                "                \"amount\": \"5000\",\n" +
                "                \"denom\": \"uict\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"gas\": \"200000\"\n" +
                "    },\n" +
                "    \"sequence\": \"2\",\n" +
                "    \"msgs\": [\n" +
                "        {\n" +
                "            \"type\": \"cosmos-sdk/MsgSend\",\n" +
                "            \"value\": {\n" +
                "                \"amount\": [\n" +
                "                    {\n" +
                "                        \"denom\": \"uict\",\n" +
                "                        \"amount\": \"1000000000\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"from_address\": \"icplaza103vzr6d7crmyvun2uk5jk0dt5wu7j0yynvzu0g\",\n" +
                "                \"to_address\": \"icplaza1434f9udjqmcgc9xtf9tdap34ml42wgdpz3xkyd\"\n" +
                "            }\n" +
                "        }\n" +
                "    ],\n" +
                "    \"memo\": \"\",\n" +
                "    \"account_number\": \"0\"\n" +
                "}";
        String privateKey = "930a1a4a2ef2d8184b5ad89b4fc67f4daa1945e16b386d99655af45f2444abf3";
        String r = Transaction.signJson(json, privateKey);

        System.out.println(r);
    }
}


