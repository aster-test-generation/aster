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

public class Aster_HoldingDataBean_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_Tqst0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    String expected = "\n\tHolding Data for holding: 1\n\t\t      quantity:10.0\n\t\t purchasePrice:100.0\n\t\t  purchaseDate:2023-02-28\n\t\t       quoteID:AAPL";
    assertEquals(expected, holdingDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_zqBp0_7() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean.getQuote());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_zqBp0_8() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_lSxM0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    String expected = "<BR>Holding Data for holding: 1</B>" + "<LI>      quantity:10.0</LI>" + "<LI> purchasePrice:10.0</LI>" + "<LI>  purchaseDate:2023-02-28</LI>" + "<LI>       quoteID:AAPL</LI>";
    assertEquals(expected, holdingDataBean.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullQuoteID_fygy1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(10.0), new Date(), null);
    String expected = "<BR>Holding Data for holding: 1</B>" + "<LI>      quantity:10.0</LI>" + "<LI> purchasePrice:10.0</LI>" + "<LI>  purchaseDate:2023-02-28</LI>" + "<LI>       quoteID:null</LI>";
    assertEquals(expected, holdingDataBean.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullPurchasePrice_mSRJ3() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 10.0, null, new Date(), "AAPL");
    String expected = "<BR>Holding Data for holding: 1</B>" + "<LI>      quantity:10.0</LI>" + "<LI> purchasePrice:null</LI>" + "<LI>  purchaseDate:2023-02-28</LI>" + "<LI>       quoteID:AAPL</LI>";
    assertEquals(expected, holdingDataBean.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullHoldingID_LEtc5() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(null, 10.0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    String expected = "<BR>Holding Data for holding: null</B>" + "<LI>      quantity:10.0</LI>" + "<LI> purchasePrice:10.0</LI>" + "<LI>  purchaseDate:2023-02-28</LI>" + "<LI>       quoteID:AAPL</LI>";
    assertEquals(expected, holdingDataBean.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullValues_yxjF1_cVVv0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    String expected = "\n\tHolding Data for holding: null\n\t\t      quantity:null\n\t\t purchasePrice:null\n\t\t  purchaseDate:null\n\t\t       quoteID:null";
    assertEquals(expected, holdingDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullQuantity_udHK4_SvuC0() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(1, 0, BigDecimal.valueOf(10.0), new Date(), "AAPL");
    String expected = "<BR>Holding Data for holding: 1</B>" + "<LI>      quantity:null</LI>" + "<LI> purchasePrice:10.0</LI>" + "<LI>  purchaseDate:2023-02-28</LI>" + "<LI>       quoteID:AAPL</LI>";
    assertEquals(expected, holdingDataBean.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentQuantity_RTdh6_fid1() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(1, 20.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    assertFalse(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentPurchasePrice_ZIgs7_fid1() {
    HoldingDataBean holdingDataBean1 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(100.0), new Date(), "AAPL");
    HoldingDataBean holdingDataBean2 = new HoldingDataBean(1, 10.0, BigDecimal.valueOf(200.0), new Date(), "AAPL");
    assertFalse(holdingDataBean1.equals(holdingDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithZeroValues_WbVK2_fid1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(0, 0.0, BigDecimal.ZERO, new Date(0), "");
    String expected = "\n\tHolding Data for holding: 0\n\t\t      quantity:0.0\n\t\t purchasePrice:0.0\n\t\t  purchaseDate:1970-01-01\n\t\t       quoteID:";
    assertEquals(expected, holdingDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNegativeValues_oQYv3_fid1() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(-1, -10.0, BigDecimal.valueOf(-100.0), new Date(-1), "AAPL");
    String expected = "\n\tHolding Data for holding: -1\n\t\t      quantity:-10.0\n\t\t purchasePrice:-100.0\n\t\t  purchaseDate:1969-12-31\n\t\t       quoteID:AAPL";
    assertEquals(expected, holdingDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithDifferentValues_HBpt6() {
    HoldingDataBean holdingDataBean = new HoldingDataBean(2, 20.0, BigDecimal.valueOf(200.0), new Date(), "GOOG");
    String expected = "\n\tHolding Data for holding: 2\n\t\t      quantity:20.0\n\t\t purchasePrice:200.0\n\t\t  purchaseDate:2023-02-28\n\t\t       quoteID:GOOG";
    assertEquals(expected, holdingDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_zqBp0() {
    HoldingDataBean holdingDataBean = HoldingDataBean.getRandomInstance();
    assertNotNull(holdingDataBean);
    assertNotNull(holdingDataBean.getHoldingID());
    assertNotNull(holdingDataBean.getQuantity());
    assertNotNull(holdingDataBean.getPurchasePrice());
    assertNotNull(holdingDataBean.getPurchaseDate());
    assertNotNull(holdingDataBean.getQuoteID());
    assertNotNull(holdingDataBean.getQuote());
    assertNotNull(holdingDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintWithNullValues_pnmo1_PoJV0_fid3() {
    HoldingDataBean holdingDataBean = new HoldingDataBean();
    holdingDataBean.print();
    assertEquals("HoldingDataBean[holdingID=null, quantity=null, purchasePrice=null, purchaseDate=null, account=null, quote=null]", holdingDataBean.toString());
  }
}