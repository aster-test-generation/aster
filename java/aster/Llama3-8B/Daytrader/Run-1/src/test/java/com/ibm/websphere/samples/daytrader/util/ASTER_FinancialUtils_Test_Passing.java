/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FinancialUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintQuoteLink_fSLy0() {
        String symbol = "AAPL";
        String expected = "<A href=\"app?action=quotes&symbols=AAPL\">AAPL</A>";
        assertEquals(expected, FinancialUtils.printQuoteLink(symbol));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeGain_ctFa0() {
        BigDecimal currentBalance = new BigDecimal("100.00");
        BigDecimal openBalance = new BigDecimal("50.00");
        BigDecimal expected = new BigDecimal("50.00");
        BigDecimal result = FinancialUtils.computeGain(currentBalance, openBalance);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeGainPercentPositive_kKhn0() {
        BigDecimal currentBalance = new BigDecimal("100.0");
        BigDecimal openBalance = new BigDecimal("50.0");
        BigDecimal result = FinancialUtils.computeGainPercent(currentBalance, openBalance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeGainPercentZero_BNKJ1() {
        BigDecimal currentBalance = new BigDecimal("100.0");
        BigDecimal openBalance = new BigDecimal("0.0");
        BigDecimal result = FinancialUtils.computeGainPercent(currentBalance, openBalance);
        assertEquals(FinancialUtils.ZERO, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintChangeHTMLNegativeChange_HSOX0() {
        String result = FinancialUtils.printChangeHTML(-1.0);
        assertEquals("<FONT color=\"#ff0000\">-1.0</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintChangeHTMLPositiveChange_aemX1() {
        String result = FinancialUtils.printChangeHTML(1.0);
        assertEquals("<FONT color=\"#009900\">1.0</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeHoldingsTotal_EmptyCollection_ReturnsZero_vhZr0() {
        Collection<?> holdingDataBeans = new ArrayList<>();
        BigDecimal result = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
        assertEquals(new BigDecimal(0.0).setScale(FinancialUtils.SCALE), result);
    }
}