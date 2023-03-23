package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgOpenBoxValue {

    @JsonProperty("box_ids")
    @SerializedName("box_ids")
    private List<String> boxIds;

    private String creator;

    @JsonProperty("group_id")
    @SerializedName("group_id")
    private String groupId;

    public List<String> getBoxIds() {
        return boxIds;
    }

    public void setBoxIds(List<String> boxIds) {
        this.boxIds = boxIds;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
