/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.jms.TextMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_TradeDirect_Coverage_Test_Failing {
  private TradeConfig tradeConfig;
  private TextMessage textMessage;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_marketSummaryIntervalIsZero_IFOC0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    MarketSummaryDataBean marketSummaryDataBean = tradeDirect.getMarketSummary();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderAsync_inSession_XomN0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Future<OrderDataBean> future = tradeDirect.completeOrderAsync(1, true);
    assertNull(future);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderAsync_notInSession_nOSe1() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
    when(asyncOrderSubmitter.submitOrder(1, true)).thenReturn(null);
    Future<OrderDataBean> future = tradeDirect.completeOrderAsync(1, true);
    assertNull(future);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_TextMessage_gXGW2_1() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    tradeDirect.queueOrder(1, true);
    assertEquals("neworder: orderID=1 runtimeMode=Direct twoPhase=true", textMessage.getText());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_TextMessage_gXGW2_2() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    tradeDirect.queueOrder(1, true);
    assertEquals("command", textMessage.getStringProperty("command"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_TextMessage_gXGW2_3() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    tradeDirect.queueOrder(1, true);
    assertEquals(1, textMessage.getIntProperty("orderID"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_TextMessage_gXGW2_4() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    tradeDirect.queueOrder(1, true);
    assertTrue(textMessage.getBooleanProperty("twoPhase"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_TextMessage_gXGW2_5() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    tradeDirect.queueOrder(1, true);
    assertTrue(textMessage.getBooleanProperty("direct"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_TextMessage_gXGW2_6() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    tradeDirect.queueOrder(1, true);
    assertEquals(System.currentTimeMillis(), textMessage.getLongProperty("publishTime"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogout_iSCl0() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "test_user";
    try {
      tradeDirect.logout(userID);
    } catch (Exception e) {
      Assertions.fail("logout failed");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateOrder1_IeTV0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    AccountDataBean accountData = new AccountDataBean();
    QuoteDataBean quoteData = new QuoteDataBean();
    HoldingDataBean holdingData = new HoldingDataBean();
    String orderType = "test";
    double quantity = 10.0;
    OrderDataBean orderData = tradeDirect.createOrder(accountData, quoteData, holdingData, orderType, quantity);
    assertNotNull(orderData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrders_xZUL0() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Collection<OrderDataBean> orderDataBeans = tradeDirect.getClosedOrders("testUserID");
    Assertions.assertNotNull(orderDataBeans);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrdersWithInvalidUserID_JWil1() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Collection<OrderDataBean> orderDataBeans = tradeDirect.getClosedOrders("invalidUserID");
    Assertions.assertTrue(orderDataBeans.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrdersWithNullUserID_AUkF2() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Collection<OrderDataBean> orderDataBeans = tradeDirect.getClosedOrders(null);
    Assertions.assertTrue(orderDataBeans.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrdersWithEmptyUserID_rlzx3() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Collection<OrderDataBean> orderDataBeans = tradeDirect.getClosedOrders("");
    Assertions.assertTrue(orderDataBeans.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrdersWithInvalidSQL_rvWu4() throws java.lang.Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Collection<OrderDataBean> orderDataBeans = tradeDirect.getClosedOrders("testUserID");
    Assertions.assertTrue(orderDataBeans.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountData_ValidUserID_cdpk6_LlKN0() throws Exception {
    String userID = "testUser";
    TradeDirect tradeDirect = new TradeDirect();
    AccountDataBean accountData = tradeDirect.getAccountData(userID);
    Assertions.assertNotNull(accountData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_TextMessage_gXGW2() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    tradeDirect.queueOrder(1, true);
    assertEquals("neworder: orderID=1 runtimeMode=Direct twoPhase=true", textMessage.getText());
    assertEquals("command", textMessage.getStringProperty("command"));
    assertEquals(1, textMessage.getIntProperty("orderID"));
    assertTrue(textMessage.getBooleanProperty("twoPhase"));
    assertTrue(textMessage.getBooleanProperty("direct"));
    assertEquals(System.currentTimeMillis(), textMessage.getLongProperty("publishTime"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_NullOrderID_sUEi5_fid1() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.queueOrder(null, true);
      assertTrue(false);
    } catch (Exception e) {
      assertEquals("Order ID cannot be null", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_InvalidOrderID_bKIK7_fid1() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.queueOrder(0, true);
      assertTrue(false);
    } catch (Exception e) {
      assertEquals("Invalid order ID", e.getMessage());
    }
  }
}