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

public class Aster_FinancialUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintQuoteLink_aUKK0() {
        String symbol = "ABC";
        String expected = "<A href=\"app?action=quotes&symbols=ABC\">ABC</A>";
        String actual = FinancialUtils.printQuoteLink(symbol);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainHTMLWithNegativeGain_IBQX0() {
        BigDecimal gain = new BigDecimal(-100.50);
        String expectedHtmlString = "<FONT color=\"#ff0000\">-100.50</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHtmlString = FinancialUtils.printGainHTML(gain);
        assertEquals(expectedHtmlString, actualHtmlString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainHTMLWithPositiveGain_WeRQ1() {
        BigDecimal gain = new BigDecimal(100.50);
        String expectedHtmlString = "<FONT color=\"#009900\">100.50</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHtmlString = FinancialUtils.printGainHTML(gain);
        assertEquals(expectedHtmlString, actualHtmlString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testComputeGain_unBb0() {
        BigDecimal currentBalance = new BigDecimal("1000.00");
        BigDecimal openBalance = new BigDecimal("500.00");
        BigDecimal expectedGain = new BigDecimal("500.00");
        BigDecimal actualGain = FinancialUtils.computeGain(currentBalance, openBalance);
        assertEquals(expectedGain, actualGain);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeGainPercent_sGbA0() {
        BigDecimal currentBalance = new BigDecimal(1000);
        BigDecimal openBalance = new BigDecimal(500);
        BigDecimal expectedGainPercent = new BigDecimal(100);
        BigDecimal actualGainPercent = FinancialUtils.computeGainPercent(currentBalance, openBalance);
        assertEquals(expectedGainPercent, actualGainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeGainPercentWithZeroOpenBalance_izEl1() {
        BigDecimal currentBalance = new BigDecimal(1000);
        BigDecimal openBalance = BigDecimal.ZERO;
        BigDecimal expectedGainPercent = BigDecimal.ZERO;
        BigDecimal actualGainPercent = FinancialUtils.computeGainPercent(currentBalance, openBalance);
        assertEquals(expectedGainPercent, actualGainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintChangeHTMLWithNegativeChange_sJCO0() {
        double change = -10.5;
        String expectedHTML = "<FONT color=\"#ff0000\">-10.5</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHTML = FinancialUtils.printChangeHTML(change);
        assertEquals(expectedHTML, actualHTML);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintChangeHTMLWithPositiveChange_wetj1() {
        double change = 10.5;
        String expectedHTML = "<FONT color=\"#009900\">10.5</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHTML = FinancialUtils.printChangeHTML(change);
        assertEquals(expectedHTML, actualHTML);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainPercentHTML_PositiveGain_xEBz0() {
        BigDecimal gain = new BigDecimal(10.5);
        String expectedHtmlString = "(<B><FONT color=\"#009900\">+10.50%</FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHtmlString = FinancialUtils.printGainPercentHTML(gain);
        assertEquals(expectedHtmlString, actualHtmlString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainPercentHTML_NegativeGain_afeK1() {
        BigDecimal gain = new BigDecimal(-5.2);
        String expectedHtmlString = "(<B><FONT color=\"#ff0000\">-5.20%</FONT></B>)<IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHtmlString = FinancialUtils.printGainPercentHTML(gain);
        assertEquals(expectedHtmlString, actualHtmlString);
    }
}