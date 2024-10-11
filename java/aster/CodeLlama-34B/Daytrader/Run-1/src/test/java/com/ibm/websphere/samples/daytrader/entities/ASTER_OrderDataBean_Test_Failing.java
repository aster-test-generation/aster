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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataBean_Test_Failing {
  private String symbol;
  private Integer orderID;
  private BigDecimal price;
  private HoldingDataBean holding;
  private BigDecimal orderFee;
  private String orderType;
  private QuoteDataBean quote;
  private String orderStatus;
  private AccountDataBean account;
  private Date openDate;
  private Date completionDate;
  private double quantity;

  public void testSetOrderID_rmkg0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(1);
    assertEquals(1, orderDataBean.getOrderID());
  }

  public void testSetOrderIDWithNull_PjDs1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(null);
    assertEquals(null, orderDataBean.getOrderID());
  }

  public void testSetOrderIDWithInvalidValue_znxy2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(-1);
    assertEquals(null, orderDataBean.getOrderID());
  }

  public void testSetOrderIDWithValidValue_TQNM3() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(1);
    assertEquals(1, orderDataBean.getOrderID());
  }

  public void testSetOrderIDWithDifferentValue_uOqC4() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(2);
    assertEquals(2, orderDataBean.getOrderID());
  }

  public void testSetOrderIDWithSameValue_YvYm5() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(1);
    assertEquals(1, orderDataBean.getOrderID());
  }

  public void testSetOrderIDWithDifferentObject_VOZe6() {
    OrderDataBean orderDataBean1 = new OrderDataBean();
    OrderDataBean orderDataBean2 = new OrderDataBean();
    orderDataBean1.setOrderID(1);
    orderDataBean2.setOrderID(2);
    assertEquals(1, orderDataBean1.getOrderID());
    assertEquals(2, orderDataBean2.getOrderID());
  }

  public void testSetOrderIDWithSameObject_TcEo7() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(1);
    assertEquals(1, orderDataBean.getOrderID());
  }

  public void testSetOrderIDWithDifferentClass_Mgeg8() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(1);
    assertEquals(1, orderDataBean.getOrderID());
  }

  public void testSetOrderIDWithSameClass_NBFX9() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderID(1);
    assertEquals(1, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance1_SjKv0_1() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(44887, orderDataBean.getOrderID().intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_mDfi1_1() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(85485, orderDataBean.getOrderID().intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance1_VrVx2_1() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(86834, orderDataBean.getOrderID().intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eVCE3_1() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(14367, orderDataBean.getOrderID().intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eVCE3_2() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals("buy", orderDataBean.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPriceWithZeroQuantity_bOly1() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertEquals(new BigDecimal(0.0), orderDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPriceWithNegativeQuantity_hequ2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertEquals(new BigDecimal(-10.0), orderDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPriceWithZeroQuantityAndFee_Mces8() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    assertEquals(new BigDecimal(0.0), orderDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_aqSd0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    BigDecimal orderFee = orderDataBean.getOrderFee();
    assertNull(BigDecimal.ZERO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFeeWithNullOrderDataBean_LiLB6() {
    OrderDataBean orderDataBean = null;
    BigDecimal orderFee = null;
    assertEquals(orderFee, orderDataBean.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccountWithDifferentAccount_tTLy2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    AccountDataBean accountDataBean1 = new AccountDataBean();
    AccountDataBean accountDataBean2 = new AccountDataBean();
    orderDataBean.setAccount(accountDataBean1);
    assertNotEquals(accountDataBean1, orderDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenDateWithNullOrderDataBean_iVIp2() {
    OrderDataBean orderDataBean = null;
    Date openDate = null;
    assertEquals(openDate, orderDataBean.getOpenDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance1_SjKv0_1_fid2() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals(100000, orderDataBean.getOrderID().intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPriceWithZeroQuantity_bOly1_fid2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 0.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertEquals(new BigDecimal(0.0), orderDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPriceWithNegativeQuantity_hequ2_fid2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), -100.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertEquals(new BigDecimal(-10.0), orderDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPriceWithNegativeFee_xTYr6_fid2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(-1.0), "AAPL");
    assertEquals(new BigDecimal(9.0), orderDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPriceWithZeroQuantityAndFee_Mces8_fid2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 0.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    assertEquals(new BigDecimal(0.0), orderDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_aqSd0_fid2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    BigDecimal orderFee = orderDataBean.getOrderFee();
    assertEquals(BigDecimal.ZERO, orderFee);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFeeWithNullOrderDataBean_LiLB6_fid2() {
    OrderDataBean orderDataBean = null;
    BigDecimal orderFee = orderDataBean.getOrderFee();
    assertNull(orderFee);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFeeWithNonNullOrderFeeAndNullOrderDataBean_ixnp8_fid2() {
    OrderDataBean orderDataBean = null;
    orderDataBean.setOrderFee(BigDecimal.TEN);
    BigDecimal orderFee = orderDataBean.getOrderFee();
    assertNull(orderFee);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFeeWithNullOrderFeeAndNullOrderDataBean_heSJ9_fid2() {
    OrderDataBean orderDataBean = null;
    orderDataBean.setOrderFee(null);
    BigDecimal orderFee = orderDataBean.getOrderFee();
    assertNull(orderFee);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentOrderType_zYak6_fid2() {
    OrderDataBean orderDataBean1 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    OrderDataBean orderDataBean2 = new OrderDataBean(1, "SELL", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    assertFalse(orderDataBean1.equals(orderDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccountWithDifferentAccount_tTLy2_fid2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    AccountDataBean accountDataBean1 = new AccountDataBean();
    AccountDataBean accountDataBean2 = new AccountDataBean();
    orderDataBean.setAccount(accountDataBean1);
    assertNotEquals(accountDataBean2, orderDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccountWithDifferentLoginCount_qJzu6_fid2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    AccountDataBean accountDataBean1 = new AccountDataBean();
    AccountDataBean accountDataBean2 = new AccountDataBean();
    accountDataBean1.setLoginCount(1);
    accountDataBean2.setLoginCount(2);
    orderDataBean.setAccount(accountDataBean1);
    assertNotEquals(accountDataBean2, orderDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccountWithDifferentLogoutCount_MpJg8_fid2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    AccountDataBean accountDataBean1 = new AccountDataBean();
    AccountDataBean accountDataBean2 = new AccountDataBean();
    accountDataBean1.setLogoutCount(1);
    accountDataBean2.setLogoutCount(2);
    orderDataBean.setAccount(accountDataBean1);
    assertNotEquals(accountDataBean2, orderDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenDateWithNullOrderDataBean_iVIp2_fid2() {
    OrderDataBean orderDataBean = null;
    Date openDate = orderDataBean.getOpenDate();
    assertNull(openDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionDateWithDifferentDate_FfgR2_DlMD2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    Date completionDate = new Date();
    orderDataBean.setCompletionDate(completionDate);
    assertNotEquals(completionDate, orderDataBean.getCompletionDate());
  }
}