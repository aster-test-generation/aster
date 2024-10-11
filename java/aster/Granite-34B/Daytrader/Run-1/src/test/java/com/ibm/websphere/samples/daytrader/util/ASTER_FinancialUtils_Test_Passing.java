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
    public void testPrintGainHTMLWithPositiveGain_CUHF0() {
        BigDecimal gain = new BigDecimal(100.0);
        String expectedHtmlString = "<FONT color=\"#009900\">100.00</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        String actualHtmlString = FinancialUtils.printGainHTML(gain);
        assertEquals(expectedHtmlString, actualHtmlString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintQuoteLink_zQjt0() {
        String symbol = "AAPL";
        String expected = "<A href=\"app?action=quotes&symbols=AAPL\">AAPL</A>";
        assertEquals(expected, FinancialUtils.printQuoteLink(symbol));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintQuoteLinkWithEmptySymbol_jSyy1() {
        String symbol = "";
        String expected = "<A href=\"app?action=quotes&symbols=\"></A>";
        assertEquals(expected, FinancialUtils.printQuoteLink(symbol));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintGainPercentHTMLWithPositiveGain_JVsY0() {
        BigDecimal gain = new BigDecimal(100.0);
        String expectedHtmlString = "(<B><FONT color=\"#009900\">+100.00%</FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        assertEquals(expectedHtmlString, FinancialUtils.printGainPercentHTML(gain));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintChangeHTML_positiveChange_vGUT0() {
        double change = 100.0;
        String expected = "<FONT color=\"#009900\">100.0</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        assertEquals(expected, FinancialUtils.printChangeHTML(change));
    }
}