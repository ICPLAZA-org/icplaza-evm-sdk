package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTMintBatchItemValue {
    @JsonProperty("cate_id")
    @SerializedName("cate_id")
    private String cateId;

    @JsonProperty("company_uri")
    @SerializedName("company_uri")
    private String companyUri;

    private List<MsgNFTComponentValue> components;

    @JsonProperty("copyright_tax")
    @SerializedName("copyright_tax")
    private String copyrightTax;

    private String name;

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

    public List<MsgNFTComponentValue> getComponents() {
        return components;
    }

    public void setComponents(List<MsgNFTComponentValue> components) {
        this.components = components;
    }

    public String getCopyrightTax() {
        return copyrightTax;
    }

    public void setCopyrightTax(String copyrightTax) {
        this.copyrightTax = copyrightTax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "MsgNFTMintBatchItemValue{" +
                "cateId='" + cateId + '\'' +
                ", companyUri='" + companyUri + '\'' +
                ", components=" + components +
                ", copyrightTax='" + copyrightTax + '\'' +
                ", name='" + name + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", tokenUri='" + tokenUri + '\'' +
                ", valueAddedTax='" + valueAddedTax + '\'' +
                '}';
    }
}
