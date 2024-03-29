package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;
import com.icplaza.evm.types.Token;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgDelegateValue {
    private Token amount;

    @JsonProperty("delegator_address")
    @SerializedName("delegator_address")
    private String delegatorAddress;
    @JsonProperty("recommander_address")
    @SerializedName("recommander_address")
    private String recommander_address;
    @JsonProperty("validator_address")
    @SerializedName("validator_address")
    private String validatorAddress;



    public String getRecommander_address() {
        return recommander_address;
    }

    public void setRecommander_address(String recommander_address) {
        this.recommander_address = recommander_address;
    }

    public String getDelegatorAddress() {
        return delegatorAddress;
    }

    public void setDelegatorAddress(String delegatorAddress) {
        this.delegatorAddress = delegatorAddress;
    }

    public String getValidatorAddress() {
        return validatorAddress;
    }
    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }

    public Token getAmount() {
        return amount;
    }

    public void setAmount(Token amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("delegator_address", delegatorAddress)
                .append("validator_address", validatorAddress)
            .append("amount", amount)
            .toString();
    }
}
