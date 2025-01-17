/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteData_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeHTMLNegativeChange_AQmn0() {
        QuoteData quoteData = new QuoteData(BigDecimal.valueOf(-0.1), BigDecimal.valueOf(10.0), "ABC");
        String result = quoteData.getChangeHTML();
        String expected = "<FONT color=\"#cc0000\">-0.10</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeHTMLPositiveChange_IxAo1() {
        QuoteData quoteData = new QuoteData(BigDecimal.valueOf(0.1), BigDecimal.valueOf(10.0), "ABC");
        String result = quoteData.getChangeHTML();
        String expected = "<FONT color=\"#009900\">0.10</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeHTMLZeroChange_HvxW2() {
        QuoteData quoteData = new QuoteData(BigDecimal.valueOf(0.0), BigDecimal.valueOf(10.0), "ABC");
        String result = quoteData.getChangeHTML();
        String expected = "<FONT color=\"#009900\">0.00</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeHTMLNegativeChangeDecimal_ufUB3() {
        QuoteData quoteData = new QuoteData(BigDecimal.valueOf(-0.123), BigDecimal.valueOf(10.0), "ABC");
        String result = quoteData.getChangeHTML();
        String expected = "<FONT color=\"#cc0000\">-0.12</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeHTMLPositiveChangeDecimal_UhRd4() {
        QuoteData quoteData = new QuoteData(BigDecimal.valueOf(0.123), BigDecimal.valueOf(10.0), "ABC");
        String result = quoteData.getChangeHTML();
        String expected = "<FONT color=\"#009900\">0.12</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeHTMLNegativeChangeDecimalFormat_nhgJ6() {
        QuoteData quoteData = new QuoteData(BigDecimal.valueOf(-0.123456), BigDecimal.valueOf(10.0), "ABC");
        String result = quoteData.getChangeHTML();
        String expected = "<FONT color=\"#cc0000\">-0.12</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeHTMLPositiveChangeDecimalFormat_xnLL7() {
        QuoteData quoteData = new QuoteData(BigDecimal.valueOf(0.123456), BigDecimal.valueOf(10.0), "ABC");
        String result = quoteData.getChangeHTML();
        String expected = "<FONT color=\"#009900\">0.12</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
        assertEquals(expected, result);
}
}