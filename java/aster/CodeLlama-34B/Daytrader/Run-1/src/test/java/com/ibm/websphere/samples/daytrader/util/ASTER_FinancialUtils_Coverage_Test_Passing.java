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

public class Aster_FinancialUtils_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainPercentHTML_NegativeGain_ErLS0() {
    BigDecimal gain = new BigDecimal("-10.5");
    String expected = "(<B><FONT color=\"#ff0000\">-10.50%</FONT></B>)<IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
    String actual = FinancialUtils.printGainPercentHTML(gain);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainPercentHTML_PositiveGain_qyPQ1() {
    BigDecimal gain = new BigDecimal("10.5");
    String expected = "(<B><FONT color=\"#009900\">+10.50%</FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
    String actual = FinancialUtils.printGainPercentHTML(gain);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainPercentHTML_ZeroGain_qwuw2() {
    BigDecimal gain = new BigDecimal("0.0");
    String expected = "(<B><FONT color=\"#009900\">+0.00%</FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
    String actual = FinancialUtils.printGainPercentHTML(gain);
    assertEquals(expected, actual);
  }
}