package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;
import com.icplaza.evm.types.Token;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTBiddingValue {
    @JsonProperty("is_fixed_price")
    @SerializedName("is_fixed_price")
    private Boolean isFixedPrice;

    @JsonProperty("pool_address")
    @SerializedName("pool_address")
    private String poolAddress;
    private Token price;
    private String sender;

    @JsonProperty("token_id")
    @SerializedName("token_id")
    private String tokenId;

    public boolean isFixedPrice() {
        return isFixedPrice;
    }

    public void setFixedPrice(boolean fixedPrice) {
        isFixedPrice = fixedPrice;
    }

    public String getPoolAddress() {
        return poolAddress;
    }

    public void setPoolAddress(String poolAddress) {
        this.poolAddress = poolAddress;
    }

    public Token getPrice() {
        return price;
    }

    public void setPrice(Token price) {
        this.price = price;
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
        return "MsgNFTBiddingValue{" +
                "sender='" + sender + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", price=" + price +
                ", poolAddress='" + poolAddress + '\'' +
                ", isFixedPrice=" + isFixedPrice +
                '}';
    }
}
