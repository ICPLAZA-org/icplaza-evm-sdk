package com.icplaza.evm.msg.utils.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(alphabetic = true)
public class MsgNFTMintBatchValue {
    private List<MsgNFTMintBatchItemValue> items;
    private String recipient;
    private String sender;

    public List<MsgNFTMintBatchItemValue> getItems() {
        return items;
    }

    public void setItems(List<MsgNFTMintBatchItemValue> items) {
        this.items = items;
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

    @Override
    public String toString() {
        return "MsgNFTMintBatchValue{" +
                "items=" + items +
                ", recipient='" + recipient + '\'' +
                ", sender='" + sender + '\'' +
                '}';
    }
}
