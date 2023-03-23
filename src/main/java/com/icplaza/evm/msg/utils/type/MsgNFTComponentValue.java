package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTComponentValue {
    @JsonProperty("class_id")
    @SerializedName("class_id")
    private String classId;

    @JsonProperty("max_amount")
    @SerializedName("max_amount")
    private String maxAmount;

    @JsonProperty("min_amount")
    @SerializedName("min_amount")
    private String minAmount;

    private String type;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("0")) {
            type = null;
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "MsgNFTComponentValue{" +
                "classId='" + classId + '\'' +
                ", maxAmount='" + maxAmount + '\'' +
                ", minAmount='" + minAmount + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
