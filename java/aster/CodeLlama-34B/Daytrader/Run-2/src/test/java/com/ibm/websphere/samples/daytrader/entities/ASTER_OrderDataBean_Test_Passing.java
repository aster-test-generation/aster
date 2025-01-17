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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_OrderDataBean_Test_Passing {
  private Integer orderID;
  private BigDecimal price;
  private HoldingDataBean holding;
  private double quantity;
  private BigDecimal orderFee;
  private QuoteDataBean quote;
  private String orderStatus;
  private String symbol;
  private AccountDataBean account;
  private Date openDate;
  private Date completionDate;
  private String orderType;
  @Mock
  private OrderDataBean orderDataBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_1() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_3() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals("buy", orderDataBean.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_4() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals("open", orderDataBean.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_5() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getOpenDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_1_aOME0_6() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertNotNull(orderDataBean.getCompletionDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_2_tHys1_2() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_orderID_WMss0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    int expectedHashCode = 1;
    int actualHashCode = orderDataBean.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_orderID_null_AVTH1() {
    OrderDataBean orderDataBean = new OrderDataBean(null, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    int expectedHashCode = 0;
    int actualHashCode = orderDataBean.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancel_EDNl0() {
    OrderDataBean order = new OrderDataBean(1, "buy", "open", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    order.cancel();
    assertEquals("cancelled", order.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderIDPositive_CcvY0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    orderDataBean.setOrderID(100);
    assertEquals(100, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderIDNegative_UViR1() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    orderDataBean.setOrderID(-100);
    assertEquals(-100, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderIDZero_eYLN2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    orderDataBean.setOrderID(0);
    assertEquals(0, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantity_CWdG0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "GOOG");
    assertEquals(100.0, orderDataBean.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantityWithZeroQuantity_Htxi1() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 0.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "GOOG");
    assertEquals(0.0, orderDataBean.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantityWithNegativeQuantity_NSgo2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), -100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "GOOG");
    assertEquals(-100.0, orderDataBean.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantityWithInvalidQuantity_gTQb4() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), Double.NaN, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "GOOG");
    assertEquals(Double.NaN, orderDataBean.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantityWithInfinityQuantity_uNwC5() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), Double.POSITIVE_INFINITY, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "GOOG");
    assertEquals(Double.POSITIVE_INFINITY, orderDataBean.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuantityWithNegativeInfinityQuantity_RKZU6() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), Double.NEGATIVE_INFINITY, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "GOOG");
    assertEquals(Double.NEGATIVE_INFINITY, orderDataBean.getQuantity(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_hFfr0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), "GOOG");
    BigDecimal expected = new BigDecimal(0.0);
    BigDecimal actual = orderDataBean.getOrderFee();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFeeWithNegativeFee_RhQv1() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(-1.0), "GOOG");
    BigDecimal expected = new BigDecimal(-1.0);
    BigDecimal actual = orderDataBean.getOrderFee();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFeeWithPositiveFee_PqGG2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "GOOG");
    BigDecimal expected = new BigDecimal(1.0);
    BigDecimal actual = orderDataBean.getOrderFee();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_tfcc0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertTrue(orderDataBean.equals(orderDataBean));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_qqgd1() {
    OrderDataBean orderDataBean1 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    OrderDataBean orderDataBean2 = new OrderDataBean(2, "SELL", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(1.0), "GOOG");
    assertFalse(orderDataBean1.equals(orderDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_IcQJ2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertFalse(orderDataBean.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_tNpC3() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(10.0), "profile1");
    assertFalse(orderDataBean.equals(accountDataBean));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderStatus_FKNU0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    orderDataBean.setOrderStatus("CLOSED");
    assertEquals("CLOSED", orderDataBean.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderStatusWithNull_XoxC1() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    orderDataBean.setOrderStatus(null);
    assertEquals(null, orderDataBean.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderStatusWithEmptyString_vYUy2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    orderDataBean.setOrderStatus("");
    assertEquals("", orderDataBean.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderStatusWithInvalidString_zSpl3() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    orderDataBean.setOrderStatus("INVALID");
    assertEquals("INVALID", orderDataBean.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderStatusWithValidString_WTaz4() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, new BigDecimal(10.0), new BigDecimal(0.0), "AAPL");
    orderDataBean.setOrderStatus("VALID");
    assertEquals("VALID", orderDataBean.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderID_UkrS0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertEquals(1, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderIDWithNullOrderID_FbfP1() {
    OrderDataBean orderDataBean = new OrderDataBean(null, "BUY", "OPEN", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertNull(orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderIDWithInvalidOrderID_gHFj2() {
    OrderDataBean orderDataBean = new OrderDataBean(0, "BUY", "OPEN", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertEquals(0, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderIDWithNegativeOrderID_pHVo3() {
    OrderDataBean orderDataBean = new OrderDataBean(-1, "BUY", "OPEN", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertEquals(-1, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderIDWithMaxValueOrderID_UAqO4() {
    OrderDataBean orderDataBean = new OrderDataBean(Integer.MAX_VALUE, "BUY", "OPEN", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertEquals(Integer.MAX_VALUE, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderIDWithMinValueOrderID_rOQX5() {
    OrderDataBean orderDataBean = new OrderDataBean(Integer.MIN_VALUE, "BUY", "OPEN", new Date(), new Date(), 100.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(1.0), "AAPL");
    assertEquals(Integer.MIN_VALUE, orderDataBean.getOrderID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsOpen_Open_klPM0() {
    OrderDataBean order = new OrderDataBean(1, "open", "processing", new Date(), new Date(), 10.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(1.0), "AAPL");
    assertTrue(order.isOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsOpen_Processing_DxGl1() {
    OrderDataBean order = new OrderDataBean(1, "processing", "open", new Date(), new Date(), 10.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(1.0), "AAPL");
    assertTrue(order.isOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccount_UARf0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    AccountDataBean accountDataBean = new AccountDataBean();
    orderDataBean.setAccount(accountDataBean);
    assertEquals(accountDataBean, orderDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderFee_pPPw0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    orderDataBean.setOrderFee(new BigDecimal(1.0));
    assertEquals(new BigDecimal(1.0), orderDataBean.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderFeeWithNull_jOEj1() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    orderDataBean.setOrderFee(null);
    assertNull(orderDataBean.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderFeeWithZero_Nhic2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    orderDataBean.setOrderFee(new BigDecimal(0.0));
    assertEquals(new BigDecimal(0.0), orderDataBean.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenDate_MWKl0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    Date openDate = new Date();
    orderDataBean.setOpenDate(openDate);
    assertEquals(openDate, orderDataBean.getOpenDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenDateWithNull_WXmh1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOpenDate(null);
    assertEquals(null, orderDataBean.getOpenDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingWithNullArgument_gYwg1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setHolding(null);
    assertNull(orderDataBean.getHolding());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionDateWithValidCompletionDate_mwSD0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(1.0), "AAPL");
    Date completionDate = orderDataBean.getCompletionDate();
    assertEquals(new Date(), completionDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionDateWithNullCompletionDate_wosr1() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), null, 10.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(1.0), "AAPL");
    Date completionDate = orderDataBean.getCompletionDate();
    assertNull(completionDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionDateWithInvalidCompletionDate_ztnO2() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(0), 10.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(1.0), "AAPL");
    Date completionDate = orderDataBean.getCompletionDate();
    assertNotEquals(new Date(), completionDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuoteWithNullQuoteDataBean_qTjM1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setQuote(null);
    assertNull(orderDataBean.getQuote());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_cancelled_dyQI0() {
    OrderDataBean order = new OrderDataBean(1, "buy", "cancelled", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertTrue(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_notCancelled_FCwS1() {
    OrderDataBean order = new OrderDataBean(1, "buy", "open", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertFalse(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_emptyOrderStatus_eDVU3() {
    OrderDataBean order = new OrderDataBean(1, "buy", "", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertFalse(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_differentCaseOrderStatus_tVXW4() {
    OrderDataBean order = new OrderDataBean(1, "buy", "CANCELLED", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertTrue(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_differentCaseOrderStatus_2_acTc5() {
    OrderDataBean order = new OrderDataBean(1, "buy", "Cancelled", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertTrue(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_differentCaseOrderStatus_3_SJaq6() {
    OrderDataBean order = new OrderDataBean(1, "buy", "canceLled", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertTrue(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_differentCaseOrderStatus_4_NwqD7() {
    OrderDataBean order = new OrderDataBean(1, "buy", "CanceLled", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertTrue(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_differentCaseOrderStatus_5_Vwyn8() {
    OrderDataBean order = new OrderDataBean(1, "buy", "canceLLed", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertTrue(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_differentCaseOrderStatus_6_dSPq9() {
    OrderDataBean order = new OrderDataBean(1, "buy", "CanceLLed", new Date(), new Date(), 10.0, BigDecimal.valueOf(10.0), BigDecimal.valueOf(0.0), "AAPL");
    assertTrue(order.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_2_tHys1_3() {
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    assertEquals("sell", orderDataBean.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionDate() throws Exception {
    orderDataBean = new OrderDataBean();
    Date completionDate = new Date();
    orderDataBean.setCompletionDate(completionDate);
    assertEquals(completionDate, orderDataBean.getCompletionDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderTypeBuy_QGLZ0_Txra0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderType("BUY");
    assertEquals("BUY", orderDataBean.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderTypeSell_vFgM1_aVNu0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderType("SELL");
    assertEquals("SELL", orderDataBean.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderTypeHold_kiKX2_ydrP0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderType("HOLD");
    assertEquals("HOLD", orderDataBean.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderStatus_kjUy0_pvjn0() {
    AccountDataBean account = new AccountDataBean(1, 10, 5, new Date(), new Date(), new BigDecimal(1000), new BigDecimal(500), "profile1");
    QuoteDataBean quote = new QuoteDataBean("AAPL");
    HoldingDataBean holding = new HoldingDataBean(100, new BigDecimal(100), new Date(), account, quote);
    OrderDataBean order = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 100, new BigDecimal(100), new BigDecimal(10), "AAPL");
    assertEquals("OPEN", order.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_FNFe0_EMnr0() {
    OrderDataBean orderDataBean = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, BigDecimal.valueOf(100.0), BigDecimal.valueOf(1.0), "GOOG");
    String expected = "Order 1\n\t      orderType: BUY\n\t    orderStatus: OPEN\n\t       openDate: " + new Date() + "\n\t completionDate: " + new Date() + "\n\t       quantity: 10.0\n\t          price: 100.0\n\t       orderFee: 1.0\n\t         symbol: GOOG";
    assertEquals(expected, orderDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSell_SellOrder_nAZW0_sMMb0() {
    OrderDataBean order = new OrderDataBean("sell", "open", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), new AccountDataBean(), new QuoteDataBean(), new HoldingDataBean());
    assertTrue(order.isSell());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSell_InvalidOrderType_hdQq4_yYGy0() {
    OrderDataBean order = new OrderDataBean("invalid", "open", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(0.0), new AccountDataBean(), new QuoteDataBean(), new HoldingDataBean());
    assertFalse(order.isSell());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuote_PyBF0_cplC0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    orderDataBean.setQuote(quoteDataBean);
    assertEquals(quoteDataBean, orderDataBean.getQuote());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuoteWithNonNullSymbol_qAtD4_kFsE0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    QuoteDataBean quoteDataBean = new QuoteDataBean("AAPL");
    orderDataBean.setQuote(quoteDataBean);
    assertEquals("AAPL", orderDataBean.getQuote().getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionDate_VSvg0_VKYn0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    Date completionDate = new Date();
    orderDataBean.setCompletionDate(completionDate);
    assertEquals(completionDate, orderDataBean.getCompletionDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionDateNull_dRum1_pYCl0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setCompletionDate(null);
    assertNull(orderDataBean.getCompletionDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionDateDifferent_LWhH2_autz0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    Date completionDate = new Date();
    orderDataBean.setCompletionDate(completionDate);
    Date differentCompletionDate = new Date(completionDate.getTime() + 1000);
    orderDataBean.setCompletionDate(differentCompletionDate);
    assertEquals(differentCompletionDate, orderDataBean.getCompletionDate());
  }
}