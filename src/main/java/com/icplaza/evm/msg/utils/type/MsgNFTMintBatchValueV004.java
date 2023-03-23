package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTMintBatchValueV004 {
    @JsonProperty("cate_id")
    @SerializedName("cate_id")
    private String cateId;

    @JsonProperty("company_uri")
    @SerializedName("company_uri")
    private String companyUri;

    @JsonProperty("copyright_tax")
    @SerializedName("copyright_tax")
    private String copyrightTax;

    @JsonProperty("end_id")
    @SerializedName("end_id")
    private String endId;


    private String recipient;
    private String sender;


    @JsonProperty("start_id")
    @SerializedName("start_id")
    private String startId;


    @JsonProperty("token_id")
    @SerializedName("token_id")
    private String tokenId;

    @JsonProperty("token_uri")
    @SerializedName("token_uri")
    private String tokenUri;

    @JsonProperty("value_added_tax")
    @SerializedName("value_added_tax")
    private String valueAddedTax;


    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public String getCompanyUri() {
        return companyUri;
    }

    public void setCompanyUri(String companyUri) {
        this.companyUri = companyUri;
    }

    public String getCopyrightTax() {
        return copyrightTax;
    }

    public void setCopyrightTax(String copyrightTax) {
        this.copyrightTax = copyrightTax;
    }

    public String getEndId() {
        return endId;
    }

    public void setEndId(String endId) {
        this.endId = endId;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getStartId() {
        return startId;
    }

    public void setStartId(String startId) {
        this.startId = startId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenUri() {
        return tokenUri;
    }

    public void setTokenUri(String tokenUri) {
        this.tokenUri = tokenUri;
    }

    public String getValueAddedTax() {
        return valueAddedTax;
    }

    public void setValueAddedTax(String valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }

    @Override
    public String toString() {
        return "MsgNFTMintBatchValue{" +
                "cateId='" + cateId + '\'' +
                ", companyUri='" + companyUri + '\'' +
                ", copyrightTax='" + copyrightTax + '\'' +
                ", endId='" + endId + '\'' +
                ", recipient='" + recipient + '\'' +
                ", sender='" + sender + '\'' +
                ", startId='" + startId + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", tokenUri='" + tokenUri + '\'' +
                ", valueAddedTax='" + valueAddedTax + '\'' +
                '}';
    }
}
