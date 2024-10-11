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

public class Aster_FinancialUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainPercentHTMLWithNegativeGain_XuyH0() {
        BigDecimal gain = new BigDecimal("-10.5");
        String htmlString = FinancialUtils.printGainPercentHTML(gain);
        assertEquals("(<B><FONT color=\"#ff0000\">-10.5%)</FONT></B>)<IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", htmlString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainPercentHTMLWithZeroGain_mwKv1() {
        BigDecimal gain = new BigDecimal("0");
        String htmlString = FinancialUtils.printGainPercentHTML(gain);
        assertEquals("(<B><FONT color=\"#009900\">+0%)</FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", htmlString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainPercentHTMLWithPositiveGain_yLvr2() {
        BigDecimal gain = new BigDecimal("10.5");
        String htmlString = FinancialUtils.printGainPercentHTML(gain);
        assertEquals("(<B><FONT color=\"#009900\">+10.5%)</FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", htmlString);
    }
}