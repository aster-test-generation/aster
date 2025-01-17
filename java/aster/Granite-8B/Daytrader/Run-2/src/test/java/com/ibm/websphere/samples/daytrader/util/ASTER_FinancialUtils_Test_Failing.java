/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FinancialUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeGainPercentWhenOpenBalanceIsZero_nYzP1() {
        BigDecimal currentBalance = new BigDecimal("10.000.000.00.0.000.00");
        BigDecimal openBalance = BigDecimal.ZERO;
        BigDecimal expectedGainPercent = BigDecimal.ZERO;
        BigDecimal actualGainPercent = FinancialUtils.computeGainPercent(currentBalance, openBalance);
        assertEquals(expectedGainPercent, actualGainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeGainPercent_WrQU0_fid1() {
        BigDecimal currentBalance = new BigDecimal("1000.00");
        BigDecimal openBalance = new BigDecimal("500.00");
        BigDecimal expectedGainPercent = new BigDecimal("1.00");
        BigDecimal actualGainPercent = FinancialUtils.computeGainPercent(currentBalance, openBalance);
        assertEquals(expectedGainPercent, actualGainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeGainPercentWhenOpenBalanceIsZero_nYzP1_fid1() {
        BigDecimal currentBalance = new BigDecimal("1000.00");
        BigDecimal openBalance = BigDecimal.ZERO;
        BigDecimal expectedGainPercent = BigDecimal.ZERO;
        BigDecimal actualGainPercent = FinancialUtils.computeGainPercent(currentBalance, openBalance);
        assertEquals(expectedGainPercent, actualGainPercent);
    }
}