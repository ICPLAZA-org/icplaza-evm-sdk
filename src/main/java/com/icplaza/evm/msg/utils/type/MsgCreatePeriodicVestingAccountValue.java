package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;
import com.icplaza.evm.types.Token;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgCreatePeriodicVestingAccountValue {

    private List<Token> amount;

    @JsonProperty("end_time")
    @SerializedName("end_time")
    private String endTime;

    @JsonProperty("from_address")
    @SerializedName("from_address")
    private String fromAddress;
    private String period;

    @JsonProperty("to_address")
    @SerializedName("to_address")
    private String toAddress;

    public List<Token> getAmount() {
        return amount;
    }

    public void setAmount(List<Token> amount) {
        this.amount = amount;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }
}
