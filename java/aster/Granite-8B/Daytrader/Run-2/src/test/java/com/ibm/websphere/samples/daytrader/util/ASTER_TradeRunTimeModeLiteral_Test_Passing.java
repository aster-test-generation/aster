/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeRunTimeModeLiteral_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValue_DiIn0() {
        TradeRunTimeModeLiteral tradeRunTimeModeLiteral = new TradeRunTimeModeLiteral("value");
        String actualValue = tradeRunTimeModeLiteral.value();
        assertEquals("value", actualValue);
    }
}