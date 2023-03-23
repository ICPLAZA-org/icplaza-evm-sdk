package com.icplaza.evm.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局记录-sequenceNumber accountNumber
 * key => {accountNumber, sequenceNumber}
 * 每取一次就自增
 */
public class GlobalCtx {
    private static Map<String, AccountInfo> map = new HashMap<>();
    private static boolean lock = false;

    /**
     * 获取账户信息
     */
    public synchronized static AccountInfo getSequence(String key) {
        if (map.get(key) == null) {
            return null;
        }
        AccountInfo accountInfo = map.get(key);
        AccountInfo accountInfo1 = accountInfo.clone();
        accountInfo1.setSequenceNumber(accountInfo1.getSequenceNumber() + 1);
        setSequence(key, accountInfo1);
        return accountInfo;
    }

    /**
     * 设置账户信息
     */
    public synchronized static boolean setSequence(String key, AccountInfo accountInfo) {
        if (map.put(key, accountInfo) == null) {
            return false;
        }
        return true;
    }

    /**
     * 重置
     */
    public synchronized static void reset(String key) {
        map.remove(key);
    }
}
