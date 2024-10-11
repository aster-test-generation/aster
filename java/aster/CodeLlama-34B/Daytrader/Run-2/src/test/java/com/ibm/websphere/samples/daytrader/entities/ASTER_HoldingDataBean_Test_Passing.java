/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HoldingDataBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuoteWithNullQuote_qxTj1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(null, 100, new BigDecimal(100), new Date(), "AAPL");
    QuoteDataBean quote = holdingDataBean.getQuote();
    assertNull(quote);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_Oacc0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    assertTrue(holdingDataBean.equals(holdingDataBean));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_WOsY1() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(2, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    assertFalse(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_MspK2() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    assertFalse(holdingDataBean.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_GWAR3() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    assertFalse(holdingDataBean.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameValues_GJog4() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    assertTrue(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentQuantity_RTdh6() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(1, 20.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    assertTrue(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentPurchasePrice_ZIgs7() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(200.0), new Date(), "AAPL");
    assertTrue(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithZeroValues_WbVK2() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(0, 0.0, BigDecimal.ZERO, new Date(0), "");
    String expected = "\n\tHolding Data for holding: 0\n\t\t      quantity:0.0\n\t\t purchasePrice:0.0\n\t\t  purchaseDate:1970-01-01\n\t\t       quoteID:";
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNegativeValues_oQYv3() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(-1, -10.0, BigDecimal.valueOf(-100.0), new Date(-1), "AAPL");
    String expected = "\n\tHolding Data for holding: -1\n\t\t      quantity:-10.0\n\t\t purchasePrice:-100.0\n\t\t  purchaseDate:1969-12-31\n\t\t       quoteID:AAPL";
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithValidValues_cuOk5() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    String expected = "\n\tHolding Data for holding: 1\n\t\t      quantity:10.0\n\t\t purchasePrice:100.0\n\t\t  purchaseDate:2023-02-28\n\t\t       quoteID:AAPL";
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_zqBp0_1() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_zqBp0_2() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_zqBp0_3() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean.getQuantity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_zqBp0_4() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean.getPurchasePrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_zqBp0_5() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean.getPurchaseDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_zqBp0_6() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean.getQuoteID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_ZRVo0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    int expectedHashCode = 1;
    int actualHashCode = holdingDataBean.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeWithNegativeHoldingID_kkQr2() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(-1, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    int expectedHashCode = -1;
    int actualHashCode = holdingDataBean.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuote_ALmB0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    holdingDataBean.setQuote(quoteDataBean);
    assertEquals(quoteDataBean, holdingDataBean.getQuote());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuoteWithNull_aTUw1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.setQuote(null);
    assertNull(holdingDataBean.getQuote());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuoteWithDifferentQuote_QCRg2_1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    QuoteDataBean quoteDataBean1 = new QuoteDataBean();
    QuoteDataBean quoteDataBean2 = new QuoteDataBean();
    holdingDataBean.setQuote(quoteDataBean1);
    holdingDataBean.setQuote(quoteDataBean2);
    assertEquals(quoteDataBean1, holdingDataBean.getQuote());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuoteWithDifferentQuote_QCRg2_2() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    QuoteDataBean quoteDataBean1 = new QuoteDataBean();
    QuoteDataBean quoteDataBean2 = new QuoteDataBean();
    holdingDataBean.setQuote(quoteDataBean1);
    holdingDataBean.setQuote(quoteDataBean2);
    assertEquals(quoteDataBean2, holdingDataBean.getQuote());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuoteWithSameQuote_mktH3_1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    holdingDataBean.setQuote(quoteDataBean);
    holdingDataBean.setQuote(quoteDataBean);
    assertEquals(quoteDataBean, holdingDataBean.getQuote());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingID_zFUn0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    assertEquals(1, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithNull_wrFk1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(null, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    assertEquals(null, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithZero_cHkK2() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(0, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    assertEquals(0, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithNegative_vQdL3() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(-1, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    assertEquals(-1, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithMaxValue_lnvI4() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(Integer.MAX_VALUE, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    assertEquals(Integer.MAX_VALUE, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithMinValue_sDuQ5() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(Integer.MIN_VALUE, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    assertEquals(Integer.MIN_VALUE, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithNullQuote_eFVt7() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), null);
    assertEquals(1, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithNullDate_igWA9() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), null, "AAPL");
    assertEquals(1, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingID_NqVm0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.setHoldingID(1);
    assertEquals(1, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingIDWithNull_lshb1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.setHoldingID(null);
    assertNull(holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullPurchaseDate_NaQR2() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), null, "AAPL");
    String expected = "<BR>Holding Data for holding: 1</B>" + "<LI>      quantity:10.0</LI>" + "<LI> purchasePrice:10.0</LI>" + "<LI>  purchaseDate:null</LI>" + "<LI>       quoteID:AAPL</LI>";
    assertEquals(expected, holdingDataBean.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountWithNullAccount_WqQD1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(10, 100.0, new BigDecimal(100.0), new Date(), "AAPL");
    holdingDataBean.setAccount(null);
    AccountDataBean actualAccountDataBean = holdingDataBean.getAccount();
    assertNull(actualAccountDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintWithNullValues_pnmo1_PoJV0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.print();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingIDWithNullQuantity_QZKH11_TjSd0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    assertEquals(1, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuoteWithDifferentQuote_QCRg2() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    QuoteDataBean quoteDataBean1 = new QuoteDataBean();
    QuoteDataBean quoteDataBean2 = new QuoteDataBean();
    holdingDataBean.setQuote(quoteDataBean1);
    assertEquals(quoteDataBean1, holdingDataBean.getQuote());
    holdingDataBean.setQuote(quoteDataBean2);
    assertEquals(quoteDataBean2, holdingDataBean.getQuote());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuoteWithSameQuote_mktH3() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    holdingDataBean.setQuote(quoteDataBean);
    assertEquals(quoteDataBean, holdingDataBean.getQuote());
    holdingDataBean.setQuote(quoteDataBean);
    assertEquals(quoteDataBean, holdingDataBean.getQuote());
  }
}