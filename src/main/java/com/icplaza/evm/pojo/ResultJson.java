/**
 * Copyright 2022 bejson.com
 */
package com.icplaza.evm.pojo;

/**
 {
 *     "mode": "sync",
 *     "tx": {
 *         "memo": "",
 *         "msg": [
 *             {
 *                 "type": "cosmos-sdk/MsgSend",
 *                 "value": {
 *                     "amount": [
 *                         {
 *                             "amount": "1000000",
 *                             "denom": "uict"
 *                         }
 *                     ],
 *                     "from_address": "icplaza1duknk0r5skrwj5gqwu8jdutjfxd33exu83hwnh",
 *                     "to_address": "icplaza1mspdk683zn8vxhrwmf62rwz8usxfcnvv536j8p"
 *                 }
 *             }
 *         ],
 *         "fee": {
 *             "amount": [
 *                 {
 *                     "amount": "5000",
 *                     "denom": "uict"
 *                 }
 *             ],
 *             "gas": "200000"
 *         },
 *         "signatures": [
 *             {
 *                 "pub_key": {
 *                     "type": "ethermint/PubKeyEthSecp256k1",
 *                     "value": "A106FBAWXC4gxHntkpfcm/uXF/UWnILft7udaXKPCFBR"
 *                 },
 *                 "signature": "ZBFu0DCwL8IawvY8VhGyEDfLeAWC1cD9RMQxXUZIIbQko14sTKTGSlv0FxboSeSDXpt3z4ip+FRIsLORamgxiQA="
 *             }
 *         ],
 *         "type": "auth/StdTx"
 *     }
 * }
 */
public class ResultJson {

    private String mode;
    private Tx tx;

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void setTx(Tx tx) {
        this.tx = tx;
    }

    public Tx getTx() {
        return tx;
    }

}