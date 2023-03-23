package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;
import com.icplaza.evm.types.Token;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTCreateAuctionOrderValue {


    @JsonProperty("auto_agree_period")
    @SerializedName("auto_agree_period")
    private String AutoAgreePeriod;


    @JsonProperty("end_time")
    @SerializedName("end_time")
    private String endTime;

    @JsonProperty("min_step")
    @SerializedName("min_step")
    private Token minStep;

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

    public String getAutoAgreePeriod() {
        return AutoAgreePeriod;
    }

    public void setAutoAgreePeriod(String autoAgreePeriod) {
        AutoAgreePeriod = autoAgreePeriod;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Token getMinStep() {
        return minStep;
    }

    public void setMinStep(Token minStep) {
        this.minStep = minStep;
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
}
