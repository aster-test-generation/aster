/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FinancialUtils_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainHTML_NegativeGain_BRNl0() {
    BigDecimal gain = new BigDecimal(-0.5);
    String result = FinancialUtils.printGainHTML(gain);
    assertEquals("<FONT color=\"#ff0000\">-0.50</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainHTML_PositiveGain_ZQvS1() {
    BigDecimal gain = new BigDecimal(0.5);
    String result = FinancialUtils.printGainHTML(gain);
    assertEquals("<FONT color=\"#009900\">0.50</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintQuoteLink_kabA0() {
    String symbol = "AAPL";
    String expected = "<A href=\"app?action=quotes&symbols=" + symbol + "\">" + symbol + "</A>";
    String actual = FinancialUtils.printQuoteLink(symbol);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeGain_DNBo0() {
    BigDecimal currentBalance = new BigDecimal("100.0");
    BigDecimal openBalance = new BigDecimal("50.00");
    BigDecimal expected = new BigDecimal("50.00");
    assertEquals(expected, FinancialUtils.computeGain(currentBalance, openBalance));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeGainPercent_ZeroOpenBalance_PiKn1() {
    BigDecimal currentBalance = new BigDecimal("100.0");
    BigDecimal openBalance = new BigDecimal("0.0");
    BigDecimal result = FinancialUtils.computeGainPercent(currentBalance, openBalance);
    assertEquals(FinancialUtils.ZERO, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainPercentHTML_NegativeGain_bTUk0() {
    BigDecimal gain = new BigDecimal(-0.05);
    String result = FinancialUtils.printGainPercentHTML(gain);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainPercentHTML_PositiveGain_vuYH1() {
    BigDecimal gain = new BigDecimal(0.03);
    String result = FinancialUtils.printGainPercentHTML(gain);
    assertEquals("(<B><FONT color=\"#009900\">+0.03%</FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_printChangeHTML_PositiveChange_TsGF0() {
    String result = FinancialUtils.printChangeHTML(10.0);
    assertTrue(result.contains("<FONT color=\"#009900\">") && result.contains("arrowup.gif"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_printChangeHTML_NegativeChange_yeJZ1() {
    String result = FinancialUtils.printChangeHTML(-10.0);
    assertTrue(result.contains("<FONT color=\"#ff0000\">") && result.contains("arrowdown.gif"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeHoldingsTotal_iplI2() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean();
    holdingDataBean1.setPurchasePrice(new BigDecimal(10.0));
    holdingDataBean1.setQuantity(2);
    HoldingDataBean holdingDataBean2 = new HoldingDataBean();
    holdingDataBean2.setPurchasePrice(new BigDecimal(20.0));
    holdingDataBean2.setQuantity(3);
    Collection<HoldingDataBean> holdingDataBeans = new ArrayList<>();
    holdingDataBeans.add(holdingDataBean1);
    holdingDataBeans.add(holdingDataBean2);
    BigDecimal result = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
  }
}