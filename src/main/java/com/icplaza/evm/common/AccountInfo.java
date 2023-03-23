package com.icplaza.evm.common;

public class AccountInfo implements Cloneable {
    /**
     * 账户在链上的序号
     */
    private Long accountNumber;
    /**
     * 交易成功序号
     */
    private Long sequenceNumber;

    @Override
    public AccountInfo clone() {
        try {
            return (AccountInfo) super.clone();
        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
        }
        return null;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
}
