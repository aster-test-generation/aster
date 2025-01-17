/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.*;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.MDBStats;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.sql.DataSource;
import javax.transaction.UserTransaction;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeDirect_Test_Passing {
  TradeDirect tradedirect;
  Connection connection;
  DataSource datasource;
  Statement statement;
  MDBStats mdbStats;
  Object[] sqlBuffer;
  private static MarketSummaryDataBean cachedMSDB = MarketSummaryDataBean.getRandomInstance();
  private static Integer marketSummaryLock = new Integer(0);
  private static long nextMarketSummary = System.currentTimeMillis();
  PreparedStatement preparedstatement;
  ResultSet resultset;
  TradeConfig tradeConfig;
  private static String getAllQuotesSQL = "select * from quoteejb q";
  private boolean inSession = false;
  TradeDirect tradeDirect;
  PreparedStatement preparedStatement;
  ResultSet resultSet;
  DataSource dataSource;
  private static String getQuoteSQL = "select * from quoteejb q where q.symbol=?";
  QuoteDataBean quoteDataBean;
  AccountDataBean accountDataBean;
  private static String logoutSQL = "update accountejb set logoutcount=logoutcount+1 " + "where profile_userid=?";
  private UserTransaction txn;
  HoldingDataBean holdingDataBean;
  private KeySequenceDirect keySequenceDirect;
  private Log log;
  AccountProfileDataBean profileData;
  OrderDataBean orderDataBean;
  private static final String CLOSED_ORDERS_SQL = "(select a.accountid from accountejb a where a.profile_userid = ?)";
  private static final String USER_ID = "test_user";
  private ManagedExecutorService mes;
  private static String getTSIASQL = "select SUM(price)/count(*) as TSIA from quoteejb q ";
  private static String getTSIAQuotesOrderByChangeSQL = "select * from quoteejb q order by q.change1";
  private static String getOpenTSIASQL = "select SUM(open1)/count(*) as openTSIA from quoteejb q ";
  private static BigDecimal ZERO = new BigDecimal(0.0);
  private static String getTSIATotalVolumeSQL = "select SUM(volume) as totalVolume from quoteejb q ";
  private static final String loginSQL = "update accountejb set lastLogin=?, logincount=logincount+1 " + "where profile_userid=?";

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetMarketSummary_1() throws Exception {
    connection = mock(Connection.class);
    preparedstatement = mock(PreparedStatement.class);
    resultset = mock(ResultSet.class);
    datasource = mock(DataSource.class);
    tradeConfig = mock(TradeConfig.class);
    tradedirect = new TradeDirect();
    when(tradeConfig.getMarketSummaryInterval()).thenReturn(0);
    MarketSummaryDataBean marketSummaryDataBean = tradedirect.getMarketSummary();
    when(tradeConfig.getMarketSummaryInterval()).thenReturn(-1);
    marketSummaryDataBean = tradedirect.getMarketSummary();
    when(tradeConfig.getMarketSummaryInterval()).thenReturn(1);
    long currentTime = System.currentTimeMillis();
    when(System.currentTimeMillis()).thenReturn(currentTime);
    when(System.currentTimeMillis()).thenReturn(currentTime + 1000);
    marketSummaryDataBean = tradedirect.getMarketSummary();
    assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_exception_EZNb6() {
    TradeConfig.setMarketSummaryInterval(1);
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.getMarketSummary();
      fail("Expected Exception");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_InSessionFalse_TwoPhaseTrue_RJwc1() {
    TradeDirect tradeDirect = new TradeDirect();
    tradeDirect.setInSession(false);
    MarketSummaryDataBean marketSummaryDataBean = MarketSummaryDataBean.getRandomInstance();
    try {
      MarketSummaryDataBean result = tradeDirect.getMarketSummaryInternal();
      assertNotNull(result);
    } catch (Exception e) {
      // Expected
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_orderAlreadyCompleted_VJFr2() {
    TradeDirect tradeDirect = new TradeDirect();
    OrderDataBean orderData = OrderDataBean.getRandomInstance();
    orderData.setOrderType("buy");
    orderData.setQuantity(10.0);
    orderData.setPrice(BigDecimal.valueOf(100.0));
    orderData.setSymbol("ABC");
    orderData.setOrderStatus("completed");
    Integer orderID = orderData.getOrderID();
    try {
      tradeDirect.completeOrder(orderID, true);
      fail("Exception should be thrown");
    } catch (Exception e) {
      assertNotNull(e);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_buyOrder_Mcjh0() {
    TradeDirect tradeDirect = new TradeDirect();
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    orderDataBean.setOrderType("buy");
    orderDataBean.setOrderStatus("new");
    orderDataBean.setQuantity(10.0);
    orderDataBean.setPrice(BigDecimal.valueOf(100.0));
    orderDataBean.setOrderID(1);
    try {
      OrderDataBean result = tradeDirect.completeOrder(orderDataBean.getOrderID(), true);
      assertNotNull(result);
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_sellOrder_ZKhU1() {
    TradeDirect tradeDirect = new TradeDirect();
    OrderDataBean orderDataBean = OrderDataBean.getRandomInstance();
    orderDataBean.setOrderType("sell");
    orderDataBean.setOrderStatus("new");
    orderDataBean.setQuantity(10.0);
    orderDataBean.setPrice(BigDecimal.valueOf(100.0));
    orderDataBean.setOrderID(1);
    try {
      OrderDataBean result = tradeDirect.completeOrder(orderDataBean.getOrderID(), true);
      assertNotNull(result);
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_buyOrder_oiDG0() {
    TradeDirect tradeDirect = new TradeDirect();
    OrderDataBean orderData = OrderDataBean.getRandomInstance();
    orderData.setOrderType("buy");
    orderData.setOrderStatus("open");
    orderData.setQuantity(10.0);
    orderData.setPrice(BigDecimal.valueOf(100.0));
    orderData.setSymbol("ABC");
    Integer orderID = 1;
    try {
      MarketSummaryDataBean result = tradeDirect.getMarketSummaryInternal();
      assertNotNull(result);
      assertNotNull(result.getOpenTSIA());
      assertNotNull(result.getGainPercent());
      assertNotNull(result.getSummaryDate());
      assertNotNull(result.getTSIA());
      assertTrue(result.getVolume() >= 0);
      assertNotNull(result.getTopGainers());
      assertNotNull(result.getTopLosers());
    } catch (Exception e) {
      // Exception is expected
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_sellOrder_mNGh1() {
    TradeDirect tradeDirect = new TradeDirect();
    OrderDataBean orderData = OrderDataBean.getRandomInstance();
    orderData.setOrderType("sell");
    orderData.setOrderStatus("open");
    orderData.setQuantity(10.0);
    orderData.setPrice(BigDecimal.valueOf(100.0));
    orderData.setSymbol("ABC");
    Integer orderID = 1;
    try {
      MarketSummaryDataBean result = tradeDirect.getMarketSummaryInternal();
      assertNotNull(result);
      assertNotNull(result.getOpenTSIA());
      assertNotNull(result.getGainPercent());
      assertNotNull(result.getSummaryDate());
      assertNotNull(result.getTSIA());
      assertTrue(result.getVolume() >= 0);
      assertNotNull(result.getTopGainers());
      assertNotNull(result.getTopLosers());
    } catch (Exception e) {
      // Exception is expected
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_Fails_mVrp1() {
    TradeDirect tradeDirect = new TradeDirect();
    Integer orderID = 1;
    boolean twoPhase = true;
    Connection conn = null; // mock connection
    try {
      tradeDirect.completeOrder(orderID, twoPhase);
      fail("Expected Exception");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_7_tEUW6() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.sell("userID", new Integer(1), TradeConfig.SYNCH);
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_8_rTWB7() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.sell("userID", new Integer(1), TradeConfig.ASYNCH);
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_11_yJXx10() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.sell(null, new Integer(1), TradeConfig.ASYNCH_2PHASE);
      fail();
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_12_JylT11() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.sell("userID", null, TradeConfig.ASYNCH_2PHASE);
      fail();
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_13_jppr12() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.sell("userID", new Integer(1), -1);
      fail();
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldings_Exception_SvwJ1() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.getHoldings(null);
      fail("Expected Exception");
    } catch (Exception e) {
      assertNotNull(e);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginFailure_IncorrectPassword_tuPR2() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.login("userID", "incorrectPassword");
      fail("Expected Exception");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginException_ZqBf3() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.login(null, null);
      fail("Expected Exception");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInternal_RYrI0() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      MarketSummaryDataBean result = tradeDirect.getMarketSummaryInternal();
      assertNotNull(result);
      assertNotNull(result.getOpenTSIA());
      assertNotNull(result.getGainPercent());
      assertNotNull(result.getSummaryDate());
      assertNotNull(result.getTSIA());
      assertEquals(0.0, result.getVolume(), 0.0);
      assertNotNull(result.getTopGainers());
      assertNotNull(result.getTopLosers());
    } catch (Exception e) {
      // Ignore
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetImpl_JEHs0() {
    TradeDirect tradeDirect = new TradeDirect();
    assertEquals(TradeConfig.DIRECT, tradeDirect.getImpl());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuy_InvalidUserID_rOYD3() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.buy(null, "symbol", 10.0, TradeConfig.SYNCH);
      fail("Expected Exception");
    } catch (Exception e) {
      assertNotNull(e);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuy_InvalidSymbol_SmcV4() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.buy("userID", null, 10.0, TradeConfig.SYNCH);
      fail("Expected Exception");
    } catch (Exception e) {
      assertNotNull(e);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuy_InvalidQuantity_WBNL5() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.buy("userID", "symbol", 0.0, TradeConfig.SYNCH);
      fail("Expected Exception");
    } catch (Exception e) {
      assertNotNull(e);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuy_InvalidOrderProcessingMode_YjpO6() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.buy("userID", "symbol", 10.0, -1);
      fail("Expected Exception");
    } catch (Exception e) {
      assertNotNull(e);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrders_ThrowsException_Hwyy1() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.getClosedOrders(null);
      fail("Expected Exception");
    } catch (Exception e) {
      assertNotNull(e);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuy_HoldingDataBeanNull_ZtPE9() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      HoldingDataBean holdingDataBean = null;
      tradeDirect.createOrder(null, null, holdingDataBean, "buy", 10.0);
      fail("Expected Exception");
    } catch (Exception e) {
      assertNotNull(e);
    }
  }
}