package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;
import com.icplaza.evm.types.Token;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTUndelegateValue {
    @JsonProperty("amount")
    @SerializedName("amount")
    private Token amount;

    @JsonProperty("delegator")
    @SerializedName("delegator")
    private String delegator;

    @JsonProperty("pool_address")
    @SerializedName("pool_address")
    private String poolAddress;

    @JsonProperty("sender")
    @SerializedName("sender")
    private String sender;

    public Token getAmount() {
        return amount;
    }

    public void setAmount(Token amount) {
        this.amount = amount;
    }

    public String getDelegator() {
        return delegator;
    }

    public void setDelegator(String delegator) {
        this.delegator = delegator;
    }

    public String getPoolAddress() {
        return poolAddress;
    }

    public void setPoolAddress(String poolAddress) {
        this.poolAddress = poolAddress;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "MsgNFTUndelegateValue{" +
                "amount='" + amount + '\'' +
                ", delegator='" + delegator + '\'' +
                ", poolAddress='" + poolAddress + '\'' +
                ", sender='" + sender + '\'' +
                '}';
    }
}
