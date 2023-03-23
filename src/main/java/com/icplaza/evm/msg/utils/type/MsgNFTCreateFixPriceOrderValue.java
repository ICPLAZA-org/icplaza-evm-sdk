package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;
import com.icplaza.evm.types.Token;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTCreateFixPriceOrderValue {
    @JsonProperty("end_price")
    @SerializedName("end_price")
    private Token endPrice;

    @JsonProperty("end_time")
    @SerializedName("end_time")
    private String endTime;

    @JsonProperty("pool_address")
    @SerializedName("pool_address")
    private String poolAddress;

    private String sender;

    @JsonProperty("start_price")
    @SerializedName("start_price")
    private Token startPrice;

    @JsonProperty("start_time")
    @SerializedName("start_time")
    private String startTime;

    @JsonProperty("token_id")
    @SerializedName("token_id")
    private String tokenId;

    public Token getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(Token endPrice) {
        this.endPrice = endPrice;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public Token getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Token startPrice) {
        this.startPrice = startPrice;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "MsgNFTCreateFixPriceOrderValue{" +
                "endPrice=" + endPrice +
                ", endTime='" + endTime + '\'' +
                ", poolAddress='" + poolAddress + '\'' +
                ", sender='" + sender + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", startPrice=" + startPrice +
                ", startTime='" + startTime + '\'' +
                '}';
    }
}
