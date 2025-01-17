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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FinancialUtils_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeGainPercent_iCrF0() {
    BigDecimal currentBalance = new BigDecimal("100.00");
    BigDecimal openBalance = new BigDecimal("50.00");
    BigDecimal expectedGainPercent = new BigDecimal("100.00");
    BigDecimal actualGainPercent = FinancialUtils.computeGainPercent(currentBalance, openBalance);
    assertEquals(expectedGainPercent, actualGainPercent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainPercentHTMLWithPositiveGain_gyjO0() {
    BigDecimal gain = new BigDecimal("10.5");
    String expected = "(<B><FONT color=\"#009900\">+10.5%<FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
    assertEquals(expected, FinancialUtils.printGainPercentHTML(gain));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainPercentHTMLWithNegativeGain_gwFR1() {
    BigDecimal gain = new BigDecimal("-10.5");
    String expected = "(<B><FONT color=\"#ff0000\">-10.5%<FONT></B>)<IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
    assertEquals(expected, FinancialUtils.printGainPercentHTML(gain));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainPercentHTMLWithZeroGain_aYon2() {
    BigDecimal gain = new BigDecimal("0.0");
    String expected = "(<B><FONT color=\"#009900\">+0.0%<FONT></B>)<IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
    assertEquals(expected, FinancialUtils.printGainPercentHTML(gain));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainHTMLWithPositiveGain_dKTV0() {
    BigDecimal gain = new BigDecimal(100.0);
    String expected = "<FONT color=\"#009900\">100.0</FONT><IMG src=\"images/arrowup.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
    assertEquals(expected, FinancialUtils.printGainHTML(gain));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintGainHTMLWithNegativeGain_GerO1() {
    BigDecimal gain = new BigDecimal(-50.0);
    String expected = "<FONT color=\"#ff0000\">-50.0</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>";
    assertEquals(expected, FinancialUtils.printGainHTML(gain));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeHoldingsTotal_ValidHoldingDataBeans_uGei2_lzrn0() {
    HoldingDataBean holdingData1 = new HoldingDataBean();
    holdingData1.setPurchasePrice(new BigDecimal(100.0));
    holdingData1.setQuantity(10);
    HoldingDataBean holdingData2 = new HoldingDataBean();
    holdingData2.setPurchasePrice(new BigDecimal(200.0));
    holdingData2.setQuantity(20);
    Collection<HoldingDataBean> holdingDataBeans = new ArrayList<>();
    holdingDataBeans.add(holdingData1);
    holdingDataBeans.add(holdingData2);
    BigDecimal holdingsTotal = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
    assertEquals(holdingsTotal, new BigDecimal(20000.0).setScale(FinancialUtils.SCALE));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testComputeHoldingsTotal_ValidHoldingDataBeans_uGei2_lzrn0_fid1() {
    HoldingDataBean holdingData1 = new HoldingDataBean();
    holdingData1.setPurchasePrice(new BigDecimal(100.0));
    holdingData1.setQuantity(10);
    HoldingDataBean holdingData2 = new HoldingDataBean();
    holdingData2.setPurchasePrice(new BigDecimal(200.0));
    holdingData2.setQuantity(20);
    Collection<HoldingDataBean> holdingDataBeans = new ArrayList<>();
    holdingDataBeans.add(holdingData1);
    holdingDataBeans.add(holdingData2);
    BigDecimal holdingsTotal = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
    assertEquals(holdingsTotal.setScale(FinancialUtils.SCALE), new BigDecimal(20000.0));
  }
}