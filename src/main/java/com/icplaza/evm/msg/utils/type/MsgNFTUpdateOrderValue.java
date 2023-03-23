package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;
import com.icplaza.evm.types.Token;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTUpdateOrderValue {
    @JsonProperty("pool_address")
    @SerializedName("pool_address")
    private String poolAddress;

    @JsonProperty("pool_creator")
    @SerializedName("pool_creator")
    private String poolCreator;


    private Token price;

    @JsonProperty("token_id")
    @SerializedName("token_id")
    private String tokenId;

    public String getPoolAddress() {
        return poolAddress;
    }

    public void setPoolAddress(String poolAddress) {
        this.poolAddress = poolAddress;
    }

    public String getPoolCreator() {
        return poolCreator;
    }

    public void setPoolCreator(String poolCreator) {
        this.poolCreator = poolCreator;
    }

    public Token getPrice() {
        return price;
    }

    public void setPrice(Token price) {
        this.price = price;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Override
    public String toString() {
        return "MsgNFTUpdateOrderValue{" +
                "poolAddress='" + poolAddress + '\'' +
                ", poolCreator='" + poolCreator + '\'' +
                ", price=" + price +
                ", tokenId='" + tokenId + '\'' +
                '}';
    }
}
