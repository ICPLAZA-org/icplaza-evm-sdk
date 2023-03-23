package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTFrozenValue {
    @JsonProperty("cate_id")
    @SerializedName("cate_id")
    private String cateId;

    private String sender;

    @JsonProperty("token_id")
    @SerializedName("token_id")
    private String tokenId;

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
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

    @Override
    public String toString() {
        return "MsgNFTFrozenValue{" +
                "sender='" + sender + '\'' +
                ", cateId='" + cateId + '\'' +
                ", tokenId='" + tokenId + '\'' +
                '}';
    }
}
