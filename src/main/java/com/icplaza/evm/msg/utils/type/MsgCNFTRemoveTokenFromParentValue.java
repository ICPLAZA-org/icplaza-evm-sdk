package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgCNFTRemoveTokenFromParentValue {
    private String sender;

    @JsonProperty("token_id")
    @SerializedName("token_id")
    private String tokenId;

    @JsonProperty("from_token_id")
    @SerializedName("from_token_id")
    private String fromTokenId;

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

    public String getFromTokenId() {
        return fromTokenId;
    }

    public void setFromTokenId(String fromTokenId) {
        this.fromTokenId = fromTokenId;
    }

    @Override
    public String toString() {
        return "MsgCNFTRemoveTokenFromParentValue{" +
                "sender='" + sender + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", fromTokenId='" + fromTokenId + '\'' +
                '}';
    }
}
