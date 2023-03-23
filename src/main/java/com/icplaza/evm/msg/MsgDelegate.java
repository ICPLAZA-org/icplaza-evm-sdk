package com.icplaza.evm.msg;

import com.icplaza.evm.msg.utils.Message;
import com.icplaza.evm.msg.utils.type.MsgDelegateValue;
import com.icplaza.evm.types.Token;


public class MsgDelegate extends MsgBase {


    public Message produceDelegateMsg(String validatorAddress, String delegateDenom, String delegateAmount,String recommanderAddress) {

        MsgDelegateValue delegateValue = new MsgDelegateValue();
        delegateValue.setValidatorAddress(validatorAddress);
        delegateValue.setDelegatorAddress(address);
        delegateValue.setRecommander_address(recommanderAddress);
        //amount
        Token token = new Token();
        token.setDenom(delegateDenom);
        token.setAmount(delegateAmount);
        delegateValue.setAmount(token);
        Message<MsgDelegateValue> messageDelegateMulti = new Message<>();
        messageDelegateMulti.setType(msgType);
        messageDelegateMulti.setValue(delegateValue);

        return messageDelegateMulti;
    }



}
