package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;
import com.icplaza.evm.types.Token;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgCreateBoxValue {

    @JsonProperty("box_price")
    @SerializedName("box_price")
    private Token boxPrice;

    @JsonProperty("box_size")
    @SerializedName("box_size")
    private String boxSize;


    private String creator;

    @JsonProperty("end_time")
    @SerializedName("end_time")
    private String endTime;

    @JsonProperty("fixed_nfts")
    @SerializedName("fixed_nfts")
    private List<String> fixedNfts = null;

    @JsonProperty("group_id")
    @SerializedName("group_id")
    private String groupId;

    @JsonProperty("pool_id")
    @SerializedName("pool_id")
    private String poolId;

    @JsonProperty("random_max")
    @SerializedName("random_max")
    private String randomMax = null;

    @JsonProperty("random_min")
    @SerializedName("random_min")
    private String randomMin = null;

    @JsonProperty("random_nfts")
    @SerializedName("random_nfts")
    private List<String> randomNfts = null;



    @JsonProperty("start_time")
    @SerializedName("start_time")
    private String startTime;

    public String getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(String boxSize) {
        this.boxSize = boxSize;
    }

    public Token getBoxPrice() {
        return boxPrice;
    }

    public void setBoxPrice(Token boxPrice) {
        this.boxPrice = boxPrice;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<String> getFixedNfts() {
        return fixedNfts;
    }

    public void setFixedNfts(List<String> fixedNfts) {
        this.fixedNfts = fixedNfts;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getRandomMax() {
        return randomMax;
    }

    public void setRandomMax(String randomMax) {
        this.randomMax = randomMax;
    }

    public String getRandomMin() {
        return randomMin;
    }

    public void setRandomMin(String randomMin) {
        this.randomMin = randomMin;
    }

    public List<String> getRandomNfts() {
        return randomNfts;
    }

    public void setRandomNfts(List<String> randomNfts) {
        this.randomNfts = randomNfts;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
