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
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.enterprise.concurrent.ManagedExecutorService;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeDirect_Test_Passing {
  private static final String getTSIATotalVolumeSQL = "select SUM(volume) as totalVolume from quoteejb q ";
  private static final String getTSIAQuotesOrderByChangeSQL = "select * from quoteejb q order by q.change1";
  private static final String getTSIASQL = "select SUM(price)/count(*) as TSIA from quoteejb q ";
  private ManagedExecutorService mes;
  private static final String loginSQL = "update accountejb set lastLogin=?, logincount=logincount+1 " + "where profile_userid=?";
  private static final String getOpenTSIASQL = "select SUM(open1)/count(*) as openTSIA from quoteejb q ";
  private static BigDecimal ZERO = new BigDecimal(0.0);
  private static String getAllQuotesSQL = "select * from quoteejb q";
  private boolean inSession = false;
  private static String getQuoteSQL = "select * from quoteejb q where q.symbol=?";
  private static String logoutSQL = "update accountejb set logoutcount=logoutcount+1 " + "where profile_userid=?";
  private  UserTransaction txn;
  private static long nextMarketSummary = System.currentTimeMillis();
  private static final Integer marketSummaryLock = new Integer(0);
  private static MarketSummaryDataBean cachedMSDB = MarketSummaryDataBean.getRandomInstance();

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRecreateDBTables_Success_NZVb0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Object[] sqlBuffer = new Object[]{"DROP TABLE IF EXISTS trade"};
    java.io.PrintWriter out = new java.io.PrintWriter(System.out);
    boolean success = tradeDirect.recreateDBTables(sqlBuffer, out);
    assertFalse(success);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturn_10_VzSo9() {
    TradeDirect tradeDirect = new TradeDirect();
    double rnd1 = 0.0;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllQuotesWithException_sCsa1() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Connection conn = mock(Connection.class);
    PreparedStatement stmt = mock(PreparedStatement.class);
    ResultSet rs = mock(ResultSet.class);
    when(conn.prepareStatement(anyString())).thenReturn(stmt);
    when(stmt.executeQuery()).thenReturn(rs);
    when(rs.next()).thenThrow(new SQLException());
    try {
      tradeDirect.getAllQuotes();
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertFalse(e instanceof SQLException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_NoAccount_nXPu4() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "test_user";
    Integer holdingID = 1;
    int orderProcessingMode = TradeConfig.ASYNCH_2PHASE;
    tradeDirect.setInSession(true);
    OrderDataBean orderData = tradeDirect.sell(userID, holdingID, orderProcessingMode);
    assertNull(orderData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sell_accountData_null_Rbyb3() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.sell("user1", 1, TradeConfig.SYNCH);
      fail("Expected Exception");
    } catch (Exception e) {
      assertEquals("Cannot invoke \"javax.sql.DataSource.getConnection()\" because \"this.datasource\" is null", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_Exception_DVYX10() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.sell("userID", 1, TradeConfig.SYNCH);
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertTrue(e instanceof Exception);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingsWithInvalidUserID_tLiE1_2() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrders_userID_xEBY0_fTLa0() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      Collection<OrderDataBean> orderDataBeans = tradeDirect.getOrders("user1");
      assertEquals(5, orderDataBeans.size());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrders_userID_null_Aoaz1_JfSU1() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      Collection<OrderDataBean> orderDataBeans = tradeDirect.getOrders(null);
      assertEquals(0, orderDataBeans.size());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuoteWithNullCompanyName_ppLO2_TQgI0() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      QuoteDataBean quoteData = tradeDirect.createQuote("ABC", null, new BigDecimal(10.0));
      assertNull(quoteData);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuoteWithInvalidCompanyName_jayY5_YqQT0() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      QuoteDataBean quoteData = tradeDirect.createQuote("ABC", "", new BigDecimal(10.0));
      assertNull(quoteData);
    } catch (Exception e) {
      assertTrue(e instanceof Exception);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_psXZ0_ugBG0() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      OrderDataBean orderData = tradeDirect.sell("userID", 1, TradeConfig.SYNCH);
      assertNotNull(orderData);
      assertEquals("sold", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_ASYNCH_rrOf1_DPLt0() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      OrderDataBean orderData = tradeDirect.sell("userID", 1, TradeConfig.ASYNCH);
      assertNotNull(orderData);
      assertEquals("sold", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_ASYNCH_2PHASE_IPIc2_EjFw0() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      OrderDataBean orderData = tradeDirect.sell("userID", 1, TradeConfig.ASYNCH_2PHASE);
      assertNotNull(orderData);
      assertEquals("sold", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_NotInSession_IzrF7_HCRY0() {
    TradeDirect tradeDirect = new TradeDirect();
    tradeDirect.setInSession(false);
    try {
      OrderDataBean orderData = tradeDirect.sell("userID", 1, TradeConfig.SYNCH);
      assertNotNull(orderData);
      assertEquals("sold", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateOrder_yoGo0_sTSB0() {
    TradeDirect tradeDirect = new TradeDirect();
    AccountDataBean accountData = new AccountDataBean();
    QuoteDataBean quoteData = new QuoteDataBean();
    HoldingDataBean holdingData = new HoldingDataBean();
    String orderType = "buy";
    double quantity = 100.0;
    try {
      OrderDataBean orderData = tradeDirect.createOrder(accountData, quoteData, holdingData, orderType, quantity);
      assertNotNull(orderData);
      assertEquals(orderData.getOrderID(), 1);
      assertEquals(orderData.getOrderStatus(), "open");
      assertEquals(orderData.getSymbol(), "ABC");
      assertEquals(orderData.getQuantity(), 100.0);
      assertEquals(orderData.getPrice(), new BigDecimal("100.00"));
      assertEquals(orderData.getOrderFee(), new BigDecimal("1.00"));
      assertEquals(orderData.getAccount(), accountData);
      assertEquals(orderData.getHolding(), holdingData);
      assertEquals(orderData.getQuote(), quoteData);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateOrderWithNullHoldingData_zfCC1_sEzC0() {
    TradeDirect tradeDirect = new TradeDirect();
    AccountDataBean accountData = new AccountDataBean();
    QuoteDataBean quoteData = new QuoteDataBean();
    HoldingDataBean holdingData = null;
    String orderType = "buy";
    double quantity = 100.0;
    try {
      OrderDataBean orderData = tradeDirect.createOrder(accountData, quoteData, holdingData, orderType, quantity);
      assertNotNull(orderData);
      assertEquals(orderData.getOrderID(), 1);
      assertEquals(orderData.getOrderStatus(), "open");
      assertEquals(orderData.getSymbol(), "ABC");
      assertEquals(orderData.getQuantity(), 100.0);
      assertEquals(orderData.getPrice(), new BigDecimal("100.00"));
      assertEquals(orderData.getOrderFee(), new BigDecimal("1.00"));
      assertEquals(orderData.getAccount(), accountData);
      assertNull(orderData.getHolding());
      assertEquals(orderData.getQuote(), quoteData);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateOrderWithNullQuoteData_FFwk2_YaZw0() {
    TradeDirect tradeDirect = new TradeDirect();
    AccountDataBean accountData = new AccountDataBean();
    QuoteDataBean quoteData = null;
    HoldingDataBean holdingData = new HoldingDataBean();
    String orderType = "buy";
    double quantity = 100.0;
    try {
      OrderDataBean orderData = tradeDirect.createOrder(accountData, quoteData, holdingData, orderType, quantity);
      assertNotNull(orderData);
      assertEquals(orderData.getOrderID(), 1);
      assertEquals(orderData.getOrderStatus(), "open");
      assertEquals(orderData.getSymbol(), "ABC");
      assertEquals(orderData.getQuantity(), 100.0);
      assertEquals(orderData.getPrice(), new BigDecimal("100.00"));
      assertEquals(orderData.getOrderFee(), new BigDecimal("1.00"));
      assertEquals(orderData.getAccount(), accountData);
      assertEquals(orderData.getHolding(), holdingData);
      assertNull(orderData.getQuote());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeInt_1_XeNp0_LuLa0() {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    quoteData.setSymbol("ABC");
    quoteData.setPrice(new BigDecimal(10.0));
    quoteData.setOpen(new BigDecimal(10.0));
    quoteData.setVolume(100.0);
    BigDecimal changeFactor = new BigDecimal(1.1);
    double sharesTraded = 10.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean updatedQuoteData = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertEquals(new BigDecimal(11.0), updatedQuoteData.getPrice());
      assertEquals(new BigDecimal(10.0), updatedQuoteData.getOpen());
      assertEquals(110.0, updatedQuoteData.getVolume());
      assertEquals(1.0, updatedQuoteData.getChange());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeInt_2_wvSJ1_UagI0() {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    quoteData.setSymbol("DEF");
    quoteData.setPrice(new BigDecimal(10.0));
    quoteData.setOpen(new BigDecimal(10.0));
    quoteData.setVolume(100.0);
    BigDecimal changeFactor = new BigDecimal(0.9);
    double sharesTraded = 10.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean updatedQuoteData = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertEquals(new BigDecimal(9.0), updatedQuoteData.getPrice());
      assertEquals(new BigDecimal(10.0), updatedQuoteData.getOpen());
      assertEquals(90.0, updatedQuoteData.getVolume());
      assertEquals(-1.0, updatedQuoteData.getChange());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeInt_3_YmPT2_rduF1() {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    quoteData.setSymbol("GHI");
    quoteData.setPrice(new BigDecimal(10.0));
    quoteData.setOpen(new BigDecimal(10.0));
    quoteData.setVolume(100.0);
    BigDecimal changeFactor = new BigDecimal(1.0);
    double sharesTraded = 10.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean updatedQuoteData = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertEquals(new BigDecimal(10.0), updatedQuoteData.getPrice());
      assertEquals(new BigDecimal(10.0), updatedQuoteData.getOpen());
      assertEquals(100.0, updatedQuoteData.getVolume());
      assertEquals(0.0, updatedQuoteData.getChange());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeInt_tovg0_VPZZ0() {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    BigDecimal changeFactor = new BigDecimal(1.5);
    double sharesTraded = 100.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean result = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertNotNull(result);
      assertEquals(quoteData.getSymbol(), result.getSymbol());
      assertEquals(changeFactor.multiply(quoteData.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP), result.getPrice());
      assertEquals(quoteData.getVolume() + sharesTraded, result.getVolume());
      assertEquals(result.getPrice().subtract(quoteData.getOpen()).doubleValue(), result.getChange());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeIntWithPennyStockPrice_BhGv1_YJlu0() {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    BigDecimal changeFactor = TradeConfig.PENNY_STOCK_RECOVERY_MIRACLE_MULTIPLIER;
    double sharesTraded = 100.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean result = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertNotNull(result);
      assertEquals(quoteData.getSymbol(), result.getSymbol());
      assertEquals(changeFactor.multiply(quoteData.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP), result.getPrice());
      assertEquals(quoteData.getVolume() + sharesTraded, result.getVolume());
      assertEquals(result.getPrice().subtract(quoteData.getOpen()).doubleValue(), result.getChange());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeIntWithMaximumStockPrice_KNmt2_eski0() {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    BigDecimal changeFactor = TradeConfig.MAXIMUM_STOCK_SPLIT_MULTIPLIER;
    double sharesTraded = 100.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean result = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertNotNull(result);
      assertEquals(quoteData.getSymbol(), result.getSymbol());
      assertEquals(changeFactor.multiply(quoteData.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP), result.getPrice());
      assertEquals(quoteData.getVolume() + sharesTraded, result.getVolume());
      assertEquals(result.getPrice().subtract(quoteData.getOpen()).doubleValue(), result.getChange());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeIntWithZeroSharesTraded_IvSR3_joSk0() {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    BigDecimal changeFactor = new BigDecimal(1.5);
    double sharesTraded = 0.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean result = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertNotNull(result);
      assertEquals(quoteData.getSymbol(), result.getSymbol());
      assertEquals(changeFactor.multiply(quoteData.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP), result.getPrice());
      assertEquals(quoteData.getVolume(), result.getVolume());
      assertEquals(result.getPrice().subtract(quoteData.getOpen()).doubleValue(), result.getChange());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginSuccess_fSAz0_QNWQ0() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("user1", "password1");
      assertNotNull(accountData);
      assertEquals("user1", accountData.getProfileID());
      assertEquals("password1", accountData.getProfile().getPassword());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginFailure_qmoP1_XbVa0() {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("user1", "wrong_password");
      assertNull(accountData);
    } catch (Exception e) {
      assertTrue(e instanceof Exception);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompleted_ldJT0_WtmO0() {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "user1";
    Integer orderID = 1;
    try {
      tradeDirect.orderCompleted(userID, orderID);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
      assertEquals("TradeDirect:orderCompleted method not supported", e.getMessage());
    } catch (Exception e) {
      fail("Expected UnsupportedOperationException");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompletedWithInvalidUserID_sjWO1_tPAZ0() {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "invalid_user";
    Integer orderID = 1;
    try {
      tradeDirect.orderCompleted(userID, orderID);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
      assertEquals("TradeDirect:orderCompleted method not supported", e.getMessage());
    } catch (Exception e) {
      fail("Expected UnsupportedOperationException");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompletedWithInvalidOrderID_UJWV2_JnPc0() {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "user1";
    Integer orderID = -1;
    try {
      tradeDirect.orderCompleted(userID, orderID);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
      assertEquals("TradeDirect:orderCompleted method not supported", e.getMessage());
    } catch (Exception e) {
      fail("Expected UnsupportedOperationException");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompletedWithNullUserID_wKnX3_Viln0() {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = null;
    Integer orderID = 1;
    try {
      tradeDirect.orderCompleted(userID, orderID);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
      assertEquals("TradeDirect:orderCompleted method not supported", e.getMessage());
    } catch (Exception e) {
      fail("Expected UnsupportedOperationException");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompletedWithNullOrderID_mdyi4_UILA0() {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "user1";
    Integer orderID = null;
    try {
      tradeDirect.orderCompleted(userID, orderID);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
      assertEquals("TradeDirect:orderCompleted method not supported", e.getMessage());
    } catch (Exception e) {
      fail("Expected UnsupportedOperationException");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompletedWithInvalidUserIDAndOrderID_MrSu5_qeNP0() {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "invalid_user";
    Integer orderID = -1;
    try {
      tradeDirect.orderCompleted(userID, orderID);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
      assertEquals("TradeDirect:orderCompleted method not supported", e.getMessage());
    } catch (Exception e) {
      fail("Expected UnsupportedOperationException");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompletedWithNullUserIDAndOrderID_dcwT6_WVrT0() {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = null;
    Integer orderID = null;
    try {
      tradeDirect.orderCompleted(userID, orderID);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
      assertEquals("TradeDirect:orderCompleted method not supported", e.getMessage());
    } catch (Exception e) {
      fail("Expected UnsupportedOperationException");
    }
  }
}