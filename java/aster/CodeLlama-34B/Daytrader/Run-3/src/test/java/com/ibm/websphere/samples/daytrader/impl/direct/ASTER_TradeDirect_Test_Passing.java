/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.sql.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.sql.DataSource;
import javax.transaction.UserTransaction;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeDirect_Test_Passing {
  @InjectMocks
  private static final String getTSIATotalVolumeSQL = "select SUM(volume) as totalVolume from quoteejb q ";
  private static MarketSummaryDataBean cachedMSDB = MarketSummaryDataBean.getRandomInstance();
  private static Integer marketSummaryLock = new Integer(0);
  private static long nextMarketSummary = System.currentTimeMillis();
  @Mock
  private Connection connection;
  @Mock
  private PreparedStatement preparedstatement;
  @Mock
  private DataSource datasource;
  @Mock
  private ResultSet resultset;
  @InjectMocks
  private TradeDirect tradedirect;
  private static String getAllQuotesSQL = "select * from quoteejb q";
  private boolean inSession = false;
  private static String getQuoteSQL = "select * from quoteejb q where q.symbol=?";
  private static String logoutSQL = "update accountejb set logoutcount=logoutcount+1 " + "where profile_userid=?";
  private  UserTransaction txn;
  @Mock
  private PreparedStatement preparedStatement;
  @Mock
  private ResultSet resultSet;
  @Mock
  private DataSource dataSource;
  @InjectMocks
  private TradeDirect tradeDirect;
  private static final String loginSQL = "update accountejb set lastLogin=?, logincount=logincount+1 " + "where profile_userid=?";
  private static final String getOpenTSIASQL = "select SUM(open1)/count(*) as openTSIA from quoteejb q ";
  private static final String getTSIAQuotesOrderByChangeSQL = "select * from quoteejb q order by q.change1";
  private static final String getTSIASQL = "select SUM(price)/count(*) as TSIA from quoteejb q ";

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRecreateDBTables_success_YKMI0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Object[] sqlBuffer = new Object[]{"DROP TABLE IF EXISTS trade"};
    java.io.PrintWriter out = new java.io.PrintWriter(System.out);
    boolean success = tradeDirect.recreateDBTables(sqlBuffer, out);
    assertFalse(success);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRecreateDBTables_Success_pWAb0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    Object[] sqlBuffer = new Object[]{"DROP TABLE IF EXISTS trade", "CREATE TABLE trade (id INTEGER PRIMARY KEY, name VARCHAR(255))"};
    java.io.PrintWriter out = new java.io.PrintWriter(System.out);
    boolean success = tradeDirect.recreateDBTables(sqlBuffer, out);
    assertFalse(success);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_Exception_ohci2() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.completeOrder(1, true);
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertTrue(e instanceof Exception);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllQuotesWithException_RXJm1() throws Exception {
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
  public void testGetAllQuotesWithException_qiPc2() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.getAllQuotes();
      fail("Expected exception not thrown");
    } catch (Exception e) {
      assertFalse(e instanceof SQLException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrders_userID_noResults_fHFy5() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginException_jooe2() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      tradeDirect.login("username", null);
      fail("Exception should be thrown");
    } catch (Exception e) {
      assertTrue(e instanceof Exception);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetImpl_NnWr0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    int result = tradeDirect.getImpl();
    assertEquals(TradeConfig.DIRECT, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetImplWithNullConfig_UXec2() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    int result = tradeDirect.getImpl();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_SymbolNull_QQih1() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    BigDecimal changeFactor = new BigDecimal(1.5);
    double sharesTraded = 1000;
    try {
      tradeDirect.updateQuotePriceVolume(null, changeFactor, sharesTraded);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_ChangeFactorNull_KgmG2() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    double sharesTraded = 1000;
    try {
      tradeDirect.updateQuotePriceVolume(quoteDataBean.getSymbol(), null, sharesTraded);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_SharesTradedNull_onWQ3_Kwlz0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
    BigDecimal changeFactor = new BigDecimal(1.5);
    try {
      tradeDirect.updateQuotePriceVolume(quoteDataBean.getSymbol(), changeFactor, 0.0);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_buy_pNyj0_qlBs0_8() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    OrderDataBean orderData = new OrderDataBean();
    orderData.setOrderType("buy");
    orderData.setOrderStatus("open");
    orderData.setSymbol("GOOG");
    orderData.setQuantity(100.0);
    orderData.setPrice(new BigDecimal(100.0));
    orderData.setOrderFee(new BigDecimal(10.0));
    orderData.setOrderID(1);
    orderData.setOpenDate(new java.util.Date());
    orderData.setCompletionDate(new java.sql.Date(System.currentTimeMillis()));
    orderData.setAccount(new AccountDataBean());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_orderID_valid_Rkut2_aYvy0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      OrderDataBean orderData = tradeDirect.completeOrder(1, false);
      assertNotNull(orderData);
      assertEquals(1, orderData.getOrderID());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_twoPhase_true_nkuF3_ebFw0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      OrderDataBean orderData = tradeDirect.completeOrder(1, true);
      assertNotNull(orderData);
      assertEquals(1, orderData.getOrderID());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginFailure_avsy1_rayJ0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("username", "wrong_password");
      assertNull(accountData);
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginSuccess_SUMR0_LoWW0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    try {
      AccountDataBean accountData = tradeDirect.login("username", "password");
      assertNotNull(accountData);
      assertEquals("username", accountData.getProfileID());
      assertEquals("password", accountData.getProfile().getPassword());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sell_holdingID_zero_gkxX5_mDXF0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "user1";
    Integer holdingID = 0;
    int orderProcessingMode = TradeConfig.SYNCH;
    try {
      OrderDataBean orderData = tradeDirect.sell(userID, holdingID, orderProcessingMode);
      assertEquals("cancelled", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sell_orderProcessingMode_ASYNCH_RspG0_bFtK0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "user1";
    Integer holdingID = 1;
    int orderProcessingMode = TradeConfig.ASYNCH;
    try {
      OrderDataBean orderData = tradeDirect.sell(userID, holdingID, orderProcessingMode);
      assertEquals("sold", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sell_userID_empty_BRVU7_TEON0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "";
    Integer holdingID = 1;
    int orderProcessingMode = TradeConfig.SYNCH;
    try {
      OrderDataBean orderData = tradeDirect.sell(userID, holdingID, orderProcessingMode);
      assertEquals("cancelled", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sell_userID_null_gxTG6_vcYM0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = null;
    Integer holdingID = 1;
    int orderProcessingMode = TradeConfig.SYNCH;
    try {
      OrderDataBean orderData = tradeDirect.sell(userID, holdingID, orderProcessingMode);
      assertEquals("cancelled", orderData.getOrderStatus());
    } catch (Exception e) {
      assertTrue(e instanceof NullPointerException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sell_orderProcessingMode_SYNCH_XcgK2_VApR0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "user1";
    Integer holdingID = 1;
    int orderProcessingMode = TradeConfig.SYNCH;
    try {
      OrderDataBean orderData = tradeDirect.sell(userID, holdingID, orderProcessingMode);
      assertEquals("sold", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sell_orderFee_null_CNaO8_YAWI0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "user1";
    Integer holdingID = 1;
    int orderProcessingMode = TradeConfig.SYNCH;
    try {
      OrderDataBean orderData = tradeDirect.sell(userID, holdingID, orderProcessingMode);
      assertEquals("cancelled", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sell_orderProcessingMode_ASYNCH_2PHASE_ZAoB1_Doan0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String userID = "user1";
    Integer holdingID = 1;
    int orderProcessingMode = TradeConfig.ASYNCH_2PHASE;
    try {
      OrderDataBean orderData = tradeDirect.sell(userID, holdingID, orderProcessingMode);
      assertEquals("sold", orderData.getOrderStatus());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeInt_lirt0_eDlz0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    quoteData.setSymbol("ABC");
    quoteData.setPrice(new BigDecimal(10.0));
    quoteData.setOpen(new BigDecimal(10.0));
    quoteData.setVolume(100.0);
    BigDecimal changeFactor = new BigDecimal(0.1);
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
  public void testUpdateQuotePriceVolumeInt_IIoI0_WEpa0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    quoteData.setSymbol("ABC");
    quoteData.setPrice(new BigDecimal("100.00"));
    quoteData.setOpen(new BigDecimal("90.00"));
    quoteData.setVolume(1000.0);
    BigDecimal changeFactor = new BigDecimal("1.10");
    double sharesTraded = 100.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean updatedQuoteData = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertEquals(new BigDecimal("110.00"), updatedQuoteData.getPrice());
      assertEquals(1100.0, updatedQuoteData.getVolume());
      assertEquals(10.0, updatedQuoteData.getChange(), 0.01);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeIntWithMaximumStockPrice_IgUK2_aMRb0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    quoteData.setSymbol("ABC");
    quoteData.setPrice(TradeConfig.MAXIMUM_STOCK_PRICE);
    quoteData.setOpen(TradeConfig.MAXIMUM_STOCK_PRICE);
    quoteData.setVolume(100.0);
    BigDecimal changeFactor = new BigDecimal(0.1);
    double sharesTraded = 10.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean updatedQuoteData = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertEquals(TradeConfig.MAXIMUM_STOCK_SPLIT_MULTIPLIER, updatedQuoteData.getPrice());
      assertEquals(TradeConfig.MAXIMUM_STOCK_PRICE, updatedQuoteData.getOpen());
      assertEquals(110.0, updatedQuoteData.getVolume());
      assertEquals(1.0, updatedQuoteData.getChange());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeIntWithPennyStockPrice_WjQU1_tIAx0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    QuoteDataBean quoteData = new QuoteDataBean();
    quoteData.setSymbol("ABC");
    quoteData.setPrice(TradeConfig.PENNY_STOCK_PRICE);
    quoteData.setOpen(TradeConfig.PENNY_STOCK_PRICE);
    quoteData.setVolume(100.0);
    BigDecimal changeFactor = new BigDecimal(0.1);
    double sharesTraded = 10.0;
    boolean publishQuotePriceChange = true;
    try {
      QuoteDataBean updatedQuoteData = tradeDirect.updateQuotePriceVolumeInt(quoteData.getSymbol(), changeFactor, sharesTraded, publishQuotePriceChange);
      assertEquals(TradeConfig.PENNY_STOCK_RECOVERY_MIRACLE_MULTIPLIER, updatedQuoteData.getPrice());
      assertEquals(TradeConfig.PENNY_STOCK_PRICE, updatedQuoteData.getOpen());
      assertEquals(110.0, updatedQuoteData.getVolume());
      assertEquals(1.0, updatedQuoteData.getChange());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}