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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OrderDataBean_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentOrderID_YubI0() {
    OrderDataBean order1 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    OrderDataBean order2 = new OrderDataBean(2, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertFalse(order1.equals(order2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullOrderID_GlTr1() {
    OrderDataBean order1 = new OrderDataBean(null, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    OrderDataBean order2 = new OrderDataBean(2, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertFalse(order1.equals(order2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsOpen_OpenStatus_VALa0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderStatus("open");
    assertTrue(orderDataBean.isOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsOpen_ProcessingStatus_pdfw1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderStatus("processing");
    assertTrue(orderDataBean.isOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsOpen_ClosedStatus_MVex2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderStatus("closed");
    assertFalse(orderDataBean.isOpen());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSell_bCwo0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderType("sell");
    assertTrue(orderDataBean.isSell());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsNotSell_VrWJ1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderType("buy");
    assertFalse(orderDataBean.isSell());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSellWithEmptyOrderType_NKkm3() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderType("");
    assertFalse(orderDataBean.isSell());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCompleted_completed_NDeN0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderStatus("completed");
    assertTrue(orderDataBean.isCompleted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCompleted_alertcompleted_VMnl1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderStatus("alertcompleted");
    assertTrue(orderDataBean.isCompleted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCompleted_cancelled_fEKH2() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderStatus("cancelled");
    assertTrue(orderDataBean.isCompleted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsBuy_orderTypeIsBuy_SPJZ0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderType("buy");
    assertTrue(orderDataBean.isBuy());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsBuy_orderTypeIsNotBuy_UsrG1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderType("sell");
    assertFalse(orderDataBean.isBuy());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsBuy_orderTypeIsEmpty_DPSb3() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderType("");
    assertFalse(orderDataBean.isBuy());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_orderStatusCancelled_Nuvn0() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderStatus("cancelled");
    assertTrue(orderDataBean.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsCancelled_orderStatusNotCancelled_azNu1() {
    OrderDataBean orderDataBean = new OrderDataBean();
    orderDataBean.setOrderStatus("not cancelled");
    assertFalse(orderDataBean.isCancelled());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentOrderType_JvKg2_fid1() {
    OrderDataBean order1 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    OrderDataBean order2 = new OrderDataBean(1, "SELL", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertTrue(order1.equals(order2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullOrderType_BWjg3_fid1() {
    OrderDataBean order1 = new OrderDataBean(1, null, "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    OrderDataBean order2 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertTrue(order1.equals(order2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentOrderStatus_DpuF4_fid1() {
    OrderDataBean order1 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    OrderDataBean order2 = new OrderDataBean(1, "BUY", "CLOSED", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertTrue(order1.equals(order2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullOrderStatus_iWan5_fid1() {
    OrderDataBean order1 = new OrderDataBean(1, "BUY", null, new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    OrderDataBean order2 = new OrderDataBean(1, "BUY", "OPEN", new Date(), new Date(), 10.0, new BigDecimal(10.0), new BigDecimal(1.0), "AAPL");
    assertTrue(order1.equals(order2));
  }
}