/**
 * Copyright 2022 bejson.com
 */
package com.icplaza.evm.pojo;

import java.util.List;

/**
 * key顺序按照字母升序
 * {
 *     "account_number": "8",
 *     "chain_id": "icplaza_9000-4",
 *     "fee": {
 *         "amount": [
 *             {
 *                 "amount": "5000",
 *                 "denom": "uict"
 *             }
 *         ],
 *         "gas": "200000"
 *     },
 *     "memo": "",
 *     "msgs": [
 *         {
 *             "type": "cosmos-sdk/MsgSend",
 *             "value": {
 *                 "amount": [
 *                     {
 *                         "amount": "1000000",
 *                         "denom": "uict"
 *                     }
 *                 ],
 *                 "from_address": "icplaza1duknk0r5skrwj5gqwu8jdutjfxd33exu83hwnh",
 *                 "to_address": "icplaza1mspdk683zn8vxhrwmf62rwz8usxfcnvv536j8p"
 *             }
 *         }
 *     ],
 *     "sequence": "70"
 * }
 */
public class RequestJson {

    private String account_number;
    private String chain_id;
    private Fee fee;
    private String memo;
    private List<Msg> msgs;
    private String sequence;

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setChain_id(String chain_id) {
        this.chain_id = chain_id;
    }

    public String getChain_id() {
        return chain_id;
    }

    public void setFee(Fee fee) {
        this.fee = fee;
    }

    public Fee getFee() {
        return fee;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMsgs(List<Msg> msgs) {
        this.msgs = msgs;
    }

    public List<Msg> getMsgs() {
        return msgs;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }

}