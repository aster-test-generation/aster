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
    public void testPrintGainHTML_NegativeGain_fIhN0() {
        BigDecimal gain = new BigDecimal(-100.50);
        String expected = "<FONT color=\"#ff0000\">-100.50</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actual = FinancialUtils.printGainHTML(gain);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainHTML_PositiveGain_XWEH1() {
        BigDecimal gain = new BigDecimal(100.50);
        String expected = "<FONT color=\"#009900\">100.50</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actual = FinancialUtils.printGainHTML(gain);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintQuoteLink_KwFu0() {
        String symbol = "AAPL";
        String expected = "<A href=\"app?action=quotes&symbols=AAPL\">AAPL</A>";
        String actual = FinancialUtils.printQuoteLink(symbol);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testComputeGain_FzbE0() {
        BigDecimal currentBalance = new BigDecimal("1000.00");
        BigDecimal openBalance = new BigDecimal("500.00");
        BigDecimal expectedGain = new BigDecimal("500.00");
        BigDecimal actualGain = FinancialUtils.computeGain(currentBalance, openBalance);
        assertEquals(expectedGain, actualGain);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeGainPercent_WrQU0() {
        BigDecimal currentBalance = new BigDecimal("1000.00");
        BigDecimal openBalance = new BigDecimal("500.00");
        BigDecimal expectedGainPercent = new BigDecimal("100.0000");
        BigDecimal actualGainPercent = FinancialUtils.computeGainPercent(currentBalance, openBalance);
        assertEquals(expectedGainPercent, actualGainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainPercentHTMLWithNegativeGain_jhjZ0() {
        BigDecimal gain = new BigDecimal(-0.01);
        String expectedHtmlString = "(<B><FONT color=\"#ff0000\">-0.01%</FONT></B>)<IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHtmlString = FinancialUtils.printGainPercentHTML(gain);
        assertEquals(expectedHtmlString, actualHtmlString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainPercentHTMLWithPositiveGain_bzYp1() {
        BigDecimal gain = new BigDecimal(0.01);
        String expectedHtmlString = "(<B><FONT color=\"#009900\">+0.01%</FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHtmlString = FinancialUtils.printGainPercentHTML(gain);
        assertEquals(expectedHtmlString, actualHtmlString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintChangeHTMLPositiveChange_sfNx0() {
        double change = 100.0;
        String expectedHTML = "<FONT color=\"#009900\">100.0</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHTML = FinancialUtils.printChangeHTML(change);
        assertEquals(expectedHTML, actualHTML);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintChangeHTMLNegativeChange_dmbI1() {
        double change = -50.0;
        String expectedHTML = "<FONT color=\"#ff0000\">-50.0</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHTML = FinancialUtils.printChangeHTML(change);
        assertEquals(expectedHTML, actualHTML);
    }
}