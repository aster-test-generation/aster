/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OrderData_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderType_tEAX0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
    orderData.setOrderType("newType");
    assertEquals("newType", orderData.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderTypeWithNullInput_xxbc1() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
    orderData.setOrderType(null);
    assertEquals(null, orderData.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderTypeWithEmptyInput_UXsU2() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10.0), "type", 10.0, "symbol", new BigDecimal(10.0));
    orderData.setOrderType("");
    assertEquals("", orderData.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOrderIDTest1_qVLp0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100.00), "type", 100.00, "symbol", new BigDecimal(100.00));
    Integer expected = 1;
    Integer actual = orderData.getOrderID();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOrderIDTest2_nCJg1() {
    OrderData orderData = new OrderData(2, "status", new Date(), new Date(), new BigDecimal(200.00), "type", 200.00, "symbol");
    Integer expected = 2;
    Integer actual = orderData.getOrderID();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getSymbol_with_all_fields_XHAr0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(100));
    assertEquals("symbol", orderData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getSymbol_without_orderFee_kKfH1() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), null, "type", 100.0, "symbol");
    assertEquals("symbol", orderData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getSymbol_without_price_hIuo2() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol");
    assertEquals("symbol", orderData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderStatus_AKCB0() {
    OrderData orderData = new OrderData(1, "New", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL", new BigDecimal(150.00));
    assertEquals("New", orderData.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderStatusWithNoOrderType_JPVA1() {
    OrderData orderData = new OrderData(1, "New", new Date(), new Date(), new BigDecimal(100.00), null, 100.00, "AAPL");
    assertEquals("New", orderData.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderStatusWithNoPrice_hBrM2() {
    OrderData orderData = new OrderData(1, "New", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL");
    assertEquals("New", orderData.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenDate_Ihge0() {
    OrderData orderData = new OrderData(123, "Open", new Date(), null, new BigDecimal(100.00), "Limit", 100.00, "AAPL");
    Date openDate = orderData.getOpenDate();
    assertEquals(new Date(), openDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenDateWithNullOpenDate_elmK1() {
    OrderData orderData = new OrderData(123, "Open", null, null, new BigDecimal(100.00), "Limit", 100.00, "AAPL");
    Date openDate = orderData.getOpenDate();
    assertNull(openDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbol_LFcL0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(0), "type", 0, "symbol", new BigDecimal(0));
    orderData.setSymbol("newSymbol");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbolWithNull_XOeb1() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(0), "type", 0, "symbol", new BigDecimal(0));
    orderData.setSymbol(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbolWithEmpty_MOQm2() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(0), "type", 0, "symbol", new BigDecimal(0));
    orderData.setSymbol("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getPriceTest1_mxEC0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("1.0"), "type", 1.0, "symbol", new BigDecimal("1.0"));
    assertEquals(new BigDecimal("1.0"), orderData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getPriceTest2_IiBX1() {
    OrderData orderData = new OrderData(2, "status", new Date(), new Date(), new BigDecimal("2.0"), "type", 2.0, "symbol");
    assertEquals(null, orderData.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderFee_zUrI0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("100.00"), "type", 100.0, "symbol", new BigDecimal("10.00"));
    orderData.setOrderFee(new BigDecimal("200.00"));
    assertEquals(new BigDecimal("200.00"), orderData.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderFeeNull_MuOT1() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("100.00"), "type", 100.0, "symbol", new BigDecimal("10.00"));
    orderData.setOrderFee(null);
    assertEquals(null, orderData.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderFeeZero_TAZU2() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal("100.00"), "type", 100.0, "symbol", new BigDecimal("10.00"));
    orderData.setOrderFee(BigDecimal.ZERO);
    assertEquals(BigDecimal.ZERO, orderData.getOrderFee());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderStatus_mGfp0() {
    OrderData orderData = new OrderData(1, "Complete", new Date(), new Date(), new BigDecimal("100.00"), " LIMIT", 100.0, "AAPL", new BigDecimal("150.00"));
    orderData.setOrderStatus("New");
    assertEquals("New", orderData.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderStatusWithNull_MPjB1() {
    OrderData orderData = new OrderData(1, "Complete", new Date(), new Date(), new BigDecimal("100.00"), " LIMIT", 100.0, "AAPL", new BigDecimal("150.00"));
    orderData.setOrderStatus(null);
    assertNull(orderData.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderStatusWithEmpty_qMrV2() {
    OrderData orderData = new OrderData(1, "Complete", new Date(), new Date(), new BigDecimal("100.00"), " LIMIT", 100.0, "AAPL", new BigDecimal("150.00"));
    orderData.setOrderStatus("");
    assertEquals("", orderData.getOrderStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOrderTypeTest_EdzR0() {
    OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100.00), "limit", 100.00, "AAPL", new BigDecimal(100.00));
    assertEquals("limit", orderData.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOrderTypeTest2_SyXk1() {
    OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100.00), "market", 100.00, "AAPL");
    assertEquals("market", orderData.getOrderType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotal_XsGi0() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10), "type", 1.0, "symbol", new BigDecimal(100));
    BigDecimal total = orderData.getTotal();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalWithNullPrice_pLoO1() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10), "type", 1.0, "symbol");
    BigDecimal total = orderData.getTotal();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalWithZeroPrice_LtYK2() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10), "type", 1.0, "symbol", new BigDecimal(0));
    BigDecimal total = orderData.getTotal();
    assertEquals(new BigDecimal(0), total);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalWithNegativePrice_jzAq3() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(10), "type", 1.0, "symbol", new BigDecimal(-100));
    BigDecimal total = orderData.getTotal();
    assertEquals(new BigDecimal(-100), total);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenDate_GeFH0() {
    OrderData orderData = new OrderData(1, "OPEN", new Date(), new Date(), new BigDecimal(100.00), "MARKET", 100.0, "AAPL", new BigDecimal(150.00));
    Date openDate = new Date();
    orderData.setOpenDate(openDate);
    assertEquals(openDate, orderData.getOpenDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenDate_Null_HurI1() {
    OrderData orderData = new OrderData(1, "OPEN", new Date(), new Date(), new BigDecimal(100.00), "MARKET", 100.0, "AAPL", new BigDecimal(150.00));
    orderData.setOpenDate(null);
    assertNull(orderData.getOpenDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getCompletionDate_2_GxrK1() {
    OrderData orderData = new OrderData(1, "status", new Date(), new Date(), new BigDecimal(1), "type", 1, "symbol");
    Date completionDate = orderData.getCompletionDate();
    assertEquals(new Date(), completionDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getCompletionDate_3_Vila2() {
    OrderData orderData = new OrderData(2, "status2", new Date(2023, 1, 1), new Date(2023, 2, 1), new BigDecimal(2), "type2", 2, "symbol2", new BigDecimal(2));
    Date completionDate = orderData.getCompletionDate();
    assertEquals(new Date(2023, 2, 1), completionDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotal_XWyq0() {
    OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(10));
    orderData.setTotal(new BigDecimal(1000));
    assertEquals(new BigDecimal(1000), orderData.getTotal());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalWithNull_nCAf1() {
    OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(10));
    orderData.setTotal(null);
    assertEquals(null, orderData.getTotal());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalWithZero_QcZj2() {
    OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(10));
    orderData.setTotal(new BigDecimal(0));
    assertEquals(new BigDecimal(0), orderData.getTotal());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalWithNegativeValue_iYRv3() {
    OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(10));
    orderData.setTotal(new BigDecimal(-100));
    assertEquals(new BigDecimal(-100), orderData.getTotal());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalWithPositiveValue_iCFW4() {
    OrderData orderData = new OrderData(1, "open", new Date(), new Date(), new BigDecimal(100), "type", 100.0, "symbol", new BigDecimal(10));
    orderData.setTotal(new BigDecimal(100));
    assertEquals(new BigDecimal(100), orderData.getTotal());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getOrderFee_1_kEAh0() {
    OrderData orderData = new OrderData(1001, "Complete", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.0, "XYZ");
    BigDecimal result = orderData.getOrderFee();
    assertEquals(new BigDecimal(100.00), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantity_vgcG0() {
    OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL", new BigDecimal(150.00));
    orderData.setQuantity(50.00);
    assertEquals(50.00, orderData.getQuantity(), 0.01);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantityWithZeroValue_FUZI1() {
    OrderData orderData = new OrderData(1, "Open", new Date(), new Date(), new BigDecimal(100.00), "Limit", 100.00, "AAPL", new BigDecimal(150.00));
    orderData.setQuantity(0.00);
    assertEquals(0.00, orderData.getQuantity(), 0.01);
  }
}