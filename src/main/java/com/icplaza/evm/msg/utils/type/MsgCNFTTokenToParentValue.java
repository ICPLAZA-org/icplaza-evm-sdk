package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgCNFTTokenToParentValue {
    private String sender;

    @JsonProperty("token_id")
    @SerializedName("token_id")
    private String tokenId;

    @JsonProperty("to_token_id")
    @SerializedName("to_token_id")
    private String toTokenId;

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

    public String getToTokenId() {
        return toTokenId;
    }

    public void setToTokenId(String toTokenId) {
        this.toTokenId = toTokenId;
    }

    @Override
    public String toString() {
        return "MsgCNFTTokenToParentValue{" +
                "sender='" + sender + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", toTokenId='" + toTokenId + '\'' +
                '}';
    }
}
