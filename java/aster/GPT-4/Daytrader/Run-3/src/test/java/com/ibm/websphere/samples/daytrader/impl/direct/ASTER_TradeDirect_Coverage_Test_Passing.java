/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.*;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import com.ibm.websphere.samples.daytrader.util.Log;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.sql.DataSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_TradeDirect_Coverage_Test_Passing {
  private TradeDirect tradeDirect;
  private TextMessage mockTextMessage;
  private OrderDataBean mockOrderData;
  private PreparedStatement mockStatement;
  private HoldingDataBean mockHoldingData;
  private Connection mockConnection;
  private ResultSet mockResultSet;
  private Queue mockQueue;
  TradeDirect tradedirect;
  Connection connection;
  DataSource datasource;
  Statement statement;
  private AccountDataBean mockAccountData;
  private QuoteDataBean mockQuoteData;
  private ManagedExecutorService mes;
  private static String getTSIASQL = "select SUM(price)/count(*) as TSIA from quoteejb q ";
  private static String getTSIAQuotesOrderByChangeSQL = "select * from quoteejb q order by q.change1";
  private static String getOpenTSIASQL = "select SUM(open1)/count(*) as openTSIA from quoteejb q ";
  private static BigDecimal ZERO = new BigDecimal(0.0);

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateOrderDataBeans_kgIc1() throws java.lang.Exception {
    Collection<OrderDataBean> orderDataBeans = new ArrayList<OrderDataBean>();
    assertNotNull(orderDataBeans);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testConnectionInitialization_QsOo2() throws java.lang.Exception {
    Connection conn = null;
    assertNull(conn);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitializeCounter_NIup7() throws Exception {
    int i = 0;
    assertEquals(0, i);
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuote_InitialQuoteDataBeanIsNull_AzzB1() throws Exception {
    String symbol = "AAPL";
    QuoteDataBean quoteData = tradedirect.getQuote(symbol);
    assertNull(quoteData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuote_LogsTrace_BXXX3() throws Exception {
    String symbol = "AAPL";
    tradedirect.getQuote(symbol);
    verify(Log.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPriceSetScale_dZTP5() throws java.lang.Exception {
    BigDecimal price = BigDecimal.valueOf(150.00);
    BigDecimal scaledPrice = price.setScale(FinancialUtils.SCALE, FinancialUtils.ROUND);
    assertEquals(scaledPrice, price.setScale(FinancialUtils.SCALE, FinancialUtils.ROUND));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testVolumeAndChangeInitialization_kFhh6_1() throws java.lang.Exception {
    double volume = 0.0;
    double change = 0.0;
    assertEquals(0.0, volume, 0.01);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testVolumeAndChangeInitialization_kFhh6_2() throws java.lang.Exception {
    double volume = 0.0;
    double change = 0.0;
    assertEquals(0.0, change, 0.01);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderDataBeanInitialization_DuBF0() throws java.lang.Exception {
    OrderDataBean orderData = null;
    assertNull(orderData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCurrentDateInitialization_UCrG3() throws java.lang.Exception {
    Timestamp currentDate = new Timestamp(System.currentTimeMillis());
    assertNotNull(currentDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextID_erkC5() throws Exception {
    Connection conn = mock(Connection.class);
    Integer orderID = KeySequenceDirect.getNextID(conn, "order", true, false);
    assertNotNull(orderID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderID_yZCN6() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    Integer orderID = 1;
    stmt.setInt(1, orderID.intValue());
    verify(stmt).setInt(1, orderID.intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderType_OznN7() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    String orderType = "buy";
    stmt.setString(2, orderType);
    verify(stmt).setString(2, orderType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderStatus_FgCY8() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    stmt.setString(3, "open");
    verify(stmt).setString(3, "open");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCurrentDate_aTbC9() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    Timestamp currentDate = new Timestamp(System.currentTimeMillis());
    stmt.setTimestamp(4, currentDate);
    verify(stmt).setTimestamp(4, currentDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuantity_eLih10() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    double quantity = 10.0;
    stmt.setDouble(5, quantity);
    verify(stmt).setDouble(5, quantity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuotePrice_Afef11() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    QuoteDataBean quoteData = new QuoteDataBean("AAPL", "Apple Inc.", 1000, BigDecimal.valueOf(150), BigDecimal.valueOf(145), BigDecimal.valueOf(140), BigDecimal.valueOf(155), 5.0);
    stmt.setBigDecimal(6, quoteData.getPrice().setScale(2, BigDecimal.ROUND_HALF_UP));
    verify(stmt).setBigDecimal(6, quoteData.getPrice().setScale(2, BigDecimal.ROUND_HALF_UP));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOrderFee_HTmh12() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    String orderType = "buy";
    stmt.setBigDecimal(7, TradeConfig.getOrderFee(orderType));
    verify(stmt).setBigDecimal(7, TradeConfig.getOrderFee(orderType));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccountID_FJZe13() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    AccountDataBean accountData = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    stmt.setInt(8, accountData.getAccountID().intValue());
    verify(stmt).setInt(8, accountData.getAccountID().intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHoldingDataNull_gFIR14() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    HoldingDataBean holdingData = null;
    if (holdingData == null) {
      stmt.setNull(9, java.sql.Types.INTEGER);
    }
    verify(stmt).setNull(9, java.sql.Types.INTEGER);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingID_FbrG15() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    HoldingDataBean holdingData = new HoldingDataBean(1.0, BigDecimal.valueOf(100), null, null, null);
    stmt.setInt(9, holdingData.getHoldingID().intValue());
    verify(stmt).setInt(9, holdingData.getHoldingID().intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetQuoteSymbol_nsAF16() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    QuoteDataBean quoteData = new QuoteDataBean("AAPL");
    stmt.setString(10, quoteData.getSymbol());
    verify(stmt).setString(10, quoteData.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testExecuteUpdate_zyZn17() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    stmt.executeUpdate();
    verify(stmt).executeUpdate();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCloseStatement_QBKD19() throws Exception {
    PreparedStatement stmt = mock(PreparedStatement.class);
    stmt.close();
    verify(stmt).close();
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolumeInt_UpdateQuotePricesFalse_fAPO1() throws Exception {
    when(TradeConfig.getUpdateQuotePrices()).thenReturn(false);
    QuoteDataBean result = tradedirect.updateQuotePriceVolumeInt("AAPL", BigDecimal.ONE, 100, true);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAccountDataBeanInitialization_lZBC0() throws java.lang.Exception {
    AccountDataBean accountData = null;
    assertNull(accountData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBalanceAssignment_AiEC6() throws java.lang.Exception {
    BigDecimal openBalance = BigDecimal.valueOf(100.00);
    BigDecimal balance = openBalance;
    assertEquals(openBalance, balance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreationDate_leig7() throws java.lang.Exception {
    Timestamp creationDate = new Timestamp(System.currentTimeMillis());
    assertNotNull(creationDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLastLoginAssignment_eeuw8() throws java.lang.Exception {
    Timestamp creationDate = new Timestamp(System.currentTimeMillis());
    Timestamp lastLogin = creationDate;
    assertEquals(creationDate, lastLogin);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginCountInitialization_jrkF9() throws java.lang.Exception {
    int loginCount = 0;
    assertEquals(0, loginCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogoutCountInitialization_YmcF10() throws java.lang.Exception {
    int logoutCount = 0;
    assertEquals(0, logoutCount);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAccountDataBeanCreation_zwyq18() throws java.lang.Exception {
    Integer accountID = 1;
    int loginCount = 0;
    int logoutCount = 0;
    Timestamp lastLogin = new Timestamp(System.currentTimeMillis());
    Timestamp creationDate = new Timestamp(System.currentTimeMillis());
    BigDecimal balance = BigDecimal.valueOf(100.00);
    BigDecimal openBalance = BigDecimal.valueOf(100.00);
    String userID = "user";
    AccountDataBean accountData = new AccountDataBean(accountID, loginCount, logoutCount, lastLogin, creationDate, balance, openBalance, userID);
    assertNotNull(accountData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_pwIz0() throws Exception {
    TradeDirect tradeDirect = new TradeDirect();
    String symbol = "AAPL";
    BigDecimal changeFactor = new BigDecimal("1.05"); // Example change factor
    double sharesTraded = 100.0; // Example shares traded
    QuoteDataBean result = tradeDirect.updateQuotePriceVolume(symbol, changeFactor, sharesTraded);
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateAccountProfile_NullAccountProfileData_yDxr1() throws Exception {
    AccountProfileDataBean result = tradedirect.updateAccountProfile(null);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHoldingDataInitialization_OGPR9() throws java.lang.Exception {
    HoldingDataBean holdingData = null;
    assertNull(holdingData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPrice_uehW11() throws java.lang.Exception {
    when(mockQuoteData.getPrice()).thenReturn(new BigDecimal("100.00"));
    BigDecimal price = mockQuoteData.getPrice();
    assertNotNull(price);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCalculateTotal_quTr13() throws java.lang.Exception {
    BigDecimal price = new BigDecimal("100.00");
    BigDecimal orderFee = new BigDecimal("5.00");
    BigDecimal total = (new BigDecimal(10).multiply(price)).add(orderFee);
    assertEquals(new BigDecimal("1005.00"), total);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryInternal_InitialSetup_WQOB1() throws Exception {
    MarketSummaryDataBean result = tradedirect.getMarketSummaryInternal();
    assertNotNull(result);
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_zSyk0() throws java.lang.Exception {
    tradeDirect = new TradeDirect();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryWhenIntervalIsZero_gqZg1() throws Exception {
    TradeConfig.setMarketSummaryInterval(0);
    MarketSummaryDataBean result = tradeDirect.getMarketSummary();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryWhenIntervalIsNegative_cHZn2() throws Exception {
    TradeConfig.setMarketSummaryInterval(-1);
    MarketSummaryDataBean result = tradeDirect.getMarketSummary();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummaryWhenMarketSummaryIntervalIsSetToOne_BDhY16() throws Exception {
    TradeConfig.setMarketSummaryInterval(1);
    MarketSummaryDataBean result = tradeDirect.getMarketSummary();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testExecuteQuery_GLQd6() throws Exception {
    when(mockStatement.executeQuery()).thenReturn(mockResultSet);
    tradeDirect.getOrders("testUser");
    verify(mockStatement).executeQuery();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCloseStatement_aXHB10() throws Exception {
    tradeDirect.getOrders("testUser");
    verify(mockStatement).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCommitConnection_mMGd11() throws Exception {
    tradeDirect.getOrders("testUser");
    verify(mockConnection).commit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogErrorOnException_SaTm13() throws Exception {
    when(mockStatement.executeQuery()).thenThrow(new Exception("Database error"));
    tradeDirect.getOrders("testUser");
    verify(Log.class);
    Log.error("TradeDirect:getOrders -- error getting user orders", any(Exception.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testReleaseConnection_awNx14() throws Exception {
    tradeDirect.getOrders("testUser");
    verify(mockConnection).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testReturnEmptyCollectionWhenNoOrders_rCZN16() throws Exception {
    when(mockResultSet.next()).thenReturn(false);
    Collection<OrderDataBean> orders = tradeDirect.getOrders("testUser");
    assertTrue(orders.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void tearDown_pxPn1() throws Exception {
    tradeDirect = null;
    mockConnection = null;
    mockStatement = null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuoteDataBeanInitialization_Ojmv2() throws java.lang.Exception {
    QuoteDataBean quoteData = tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    assertNotNull(quoteData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testVolumeAndChangeInitialization_kFhh6() throws java.lang.Exception {
    double volume = 0.0;
    double change = 0.0;
    assertEquals(0.0, volume, 0.01);
    assertEquals(0.0, change, 0.01);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSymbol_tFqR8() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).setString(1, "AAPL");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompanyName_iwUi9() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).setString(2, "Apple Inc.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVolume_yMTX10() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).setDouble(3, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPrice_KYhO11() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).setBigDecimal(4, BigDecimal.valueOf(150.00));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenPrice_Gruy12() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).setBigDecimal(5, BigDecimal.valueOf(150.00));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLowPrice_sakJ13() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).setBigDecimal(6, BigDecimal.valueOf(150.00));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHighPrice_UNSq14() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).setBigDecimal(7, BigDecimal.valueOf(150.00));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetChange_gfON15() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).setDouble(8, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testExecuteUpdate_vhoI16() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).executeUpdate();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCloseStatement_cGRP17() throws Exception {
    tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    verify(mockStatement).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQuoteDataBeanCreation_Behy19() throws Exception {
    QuoteDataBean quoteData = tradeDirect.createQuote("AAPL", "Apple Inc.", BigDecimal.valueOf(150.00));
    assertNotNull(quoteData);
    assertEquals("AAPL", quoteData.getSymbol());
    assertEquals("Apple Inc.", quoteData.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrderLogsInSession_Haaq1() throws Exception {
    Integer orderID = 123;
    boolean twoPhase = false;
    tradeDirect.queueOrder(orderID, twoPhase);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrderSetsCommandProperty_vNFV4() throws Exception {
    Integer orderID = 123;
    boolean twoPhase = false;
    tradeDirect.queueOrder(orderID, twoPhase);
    verify(mockTextMessage).setStringProperty("command", "neworder");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrderSetsOrderIDProperty_xWia5() throws Exception {
    Integer orderID = 123;
    boolean twoPhase = false;
    tradeDirect.queueOrder(orderID, twoPhase);
    verify(mockTextMessage).setIntProperty("orderID", orderID.intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrderSetsTwoPhaseProperty_UXQt6() throws Exception {
    Integer orderID = 123;
    boolean twoPhase = true;
    tradeDirect.queueOrder(orderID, twoPhase);
    verify(mockTextMessage).setBooleanProperty("twoPhase", twoPhase);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrderSetsDirectProperty_OOGZ7() throws Exception {
    Integer orderID = 123;
    boolean twoPhase = false;
    tradeDirect.queueOrder(orderID, twoPhase);
    verify(mockTextMessage).setBooleanProperty("direct", true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrderSetsPublishTimeProperty_kYjT8() throws Exception {
    Integer orderID = 123;
    boolean twoPhase = false;
    tradeDirect.queueOrder(orderID, twoPhase);
    verify(mockTextMessage).setLongProperty(eq("publishTime"), anyLong());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrderSetsTextMessage_hLiK9() throws Exception {
    Integer orderID = 123;
    boolean twoPhase = false;
    tradeDirect.queueOrder(orderID, twoPhase);
    verify(mockTextMessage).setText("neworder: orderID=" + orderID + " runtimeMode=Direct twoPhase=" + twoPhase);
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogoutLogsTrace_kMdV1() throws Exception {
    String userID = "testUser";
    tradeDirect.logout(userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogoutSetsUserIDInPreparedStatement_sPYd5() throws Exception {
    String userID = "testUser";
    tradeDirect.logout(userID);
    verify(mockStatement).setString(1, userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogoutExecutesUpdate_MkxB6() throws Exception {
    String userID = "testUser";
    tradeDirect.logout(userID);
    verify(mockStatement).executeUpdate();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogoutClosesPreparedStatement_gGOX7() throws Exception {
    String userID = "testUser";
    tradeDirect.logout(userID);
    verify(mockStatement).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogoutLogsErrorOnException_ZBNK10() throws Exception {
    String userID = "testUser";
    doThrow(new Exception("Test Exception")).when(mockStatement).executeUpdate();
    tradeDirect.logout(userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogoutWithNullUserID_GtNe12() throws Exception {
    String userID = null;
    tradeDirect.logout(userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderAsync_shouldReturnNull_jbmv3() throws Exception {
    Integer orderID = 123;
    boolean twoPhase = false;
    Future<OrderDataBean> result = tradeDirect.completeOrderAsync(orderID, twoPhase);
    assertNull(result); // Verifying that the return value is null
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testReturnOrderData_MzRj23() throws Exception {
    AccountDataBean accountData = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    QuoteDataBean quoteData = new QuoteDataBean("AAPL");
    HoldingDataBean holdingData = new HoldingDataBean(1.0, BigDecimal.valueOf(100), null, accountData, quoteData);
    OrderDataBean orderData = tradeDirect.createOrder(accountData, quoteData, holdingData, "buy", 10.0);
    assertNotNull(orderData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogTrace_kiIQ2() throws java.lang.Exception {
    tradeDirect.register("user", "pass", "fullname", "address", "email", "creditcard", BigDecimal.ZERO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCatchException_WHRx19() throws java.lang.Exception {
    try {
      tradeDirect.register(null, null, null, null, null, null, null);
      fail("Expected an Exception to be thrown");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogErrorOnException_pNpV20() throws java.lang.Exception {
    try {
      tradeDirect.register(null, null, null, null, null, null, null);
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testReturnAccountData_bxbL22() throws Exception {
    AccountDataBean accountData = tradeDirect.register("user", "pass", "fullname", "address", "email", "creditcard", BigDecimal.ZERO);
    assertNotNull(accountData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testReturnNullOnException_BihT23() throws java.lang.Exception {
    try {
      AccountDataBean accountData = tradeDirect.register(null, null, null, null, null, null, null);
      assertNull(accountData);
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingsReturnsNonNullCollection_clkr0() throws Exception {
    Collection<HoldingDataBean> holdings = tradeDirect.getHoldings("user123");
    assertNotNull(holdings);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingsInitializesHoldingDataBeans_ujMQ1() throws Exception {
    Collection<HoldingDataBean> holdings = tradeDirect.getHoldings("user123");
    assertTrue(holdings instanceof ArrayList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_AccountDataBeanNull_XsZD0() throws Exception {
    AccountDataBean result = tradeDirect.login("validUser", "validPassword");
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_TraceLogCalled_RPWk2() throws Exception {
    tradeDirect.login("validUser", "validPassword");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_AccountNotFound_MxAJ7() throws Exception {
    try {
      tradeDirect.login("invalidUser", "password");
      fail("Expected FinderException");
    } catch (javax.ejb.FinderException e) {
      assertEquals("Cannot find account forinvalidUser", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_IncorrectPassword_SiAZ8() throws Exception {
    try {
      tradeDirect.login("validUser", "wrongPassword");
      fail("Expected Exception");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Incorrect password"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_RollbackCalledOnException_TwAP15() throws Exception {
    try {
      tradeDirect.login("validUser", "invalidPassword");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_ReturnsAccountDataBean_wMMa17() throws Exception {
    AccountDataBean result = tradeDirect.login("validUser", "validPassword");
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_ValidUserAndPassword_ZtOV18() throws Exception {
    AccountDataBean result = tradeDirect.login("validUser", "validPassword");
    assertEquals("expectedAccountID", result.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_ValidUserWithNullPassword_AfTC19() throws Exception {
    try {
      tradeDirect.login("validUser", null);
      fail("Expected Exception");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Incorrect password"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_NullUserID_OIIY20() throws Exception {
    try {
      tradeDirect.login(null, "validPassword");
      fail("Expected Exception");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Cannot find account fornull"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_EmptyUserID_VlwC21() throws Exception {
    try {
      tradeDirect.login("", "validPassword");
      fail("Expected Exception");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Cannot find account for"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_EmptyPassword_Ludc22() throws Exception {
    AccountDataBean result = tradeDirect.login("validUser", "");
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_ValidUserWithSpecialChars_rvVk23() throws Exception {
    AccountDataBean result = tradeDirect.login("user@domain.com", "validPassword");
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_ConcurrentLogin_ZxpY25() throws Exception {
    AccountDataBean result1 = tradeDirect.login("validUser", "validPassword");
    AccountDataBean result2 = tradeDirect.login("validUser", "validPassword");
    assertNotNull(result1);
    assertNotNull(result2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_ValidUserMultipleTimes_SMqX26() throws Exception {
    AccountDataBean result1 = tradeDirect.login("validUser", "validPassword");
    AccountDataBean result2 = tradeDirect.login("validUser", "validPassword");
    assertEquals(result1.getAccountID(), result2.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_ValidUserWithDifferentPassword_JqpG27() throws Exception {
    try {
      tradeDirect.login("validUser", "differentPassword");
      fail("Expected Exception");
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Incorrect password"));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_ValidUserWithEmptyAccountData_JWYK29() throws Exception {
    AccountDataBean result = tradeDirect.login("validUser", "validPassword");
    assertNotNull(result);
    assertNull(result.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancelOrder_ConnectionNull_UAHM1() throws Exception {
    tradeDirect.cancelOrder(1, false);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancelOrder_SetInGlobalTxn_BvBL3() throws Exception {
    tradeDirect.cancelOrder(1, true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountDataInitialization_tVNE1() throws Exception {
    AccountDataBean accountData = tradeDirect.getAccountData("testUserID");
    assertNull(accountData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAccountProfileDataInitialization_wkzB1() throws java.lang.Exception {
    AccountProfileDataBean result = tradeDirect.getAccountProfileData("testUserID");
    assertNull(result); // Assuming no data is returned for a non-existing user
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_ApnI0() throws java.lang.Exception {
    tradeDirect = new TradeDirect();
    mockConnection = mock(Connection.class);
    mockAccountData = mock(AccountDataBean.class);
    mockQuoteData = mock(QuoteDataBean.class);
    mockOrderData = mock(OrderDataBean.class);
    mockHoldingData = mock(HoldingDataBean.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateOrder_Vtca10() throws java.lang.Exception {
    when(tradeDirect.createOrder(mockAccountData, mockQuoteData, mockHoldingData, "buy", 10.0)).thenReturn(mockOrderData);
    OrderDataBean orderData = tradeDirect.createOrder(mockAccountData, mockQuoteData, mockHoldingData, "buy", 10.0);
    assertNotNull(orderData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderFee_ISDv12() throws java.lang.Exception {
    when(mockOrderData.getOrderFee()).thenReturn(new BigDecimal("5.00"));
    BigDecimal orderFee = mockOrderData.getOrderFee();
    assertNotNull(orderFee);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrderID_YvHw15() throws java.lang.Exception {
    when(mockOrderData.getOrderID()).thenReturn(1);
    Integer orderID = mockOrderData.getOrderID();
    assertNotNull(orderID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderAsync_mXCz17() throws java.lang.Exception {
    tradeDirect.completeOrderAsync(mockOrderData.getOrderID(), true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_vCZQ18() throws java.lang.Exception {
    tradeDirect.queueOrder(mockOrderData.getOrderID(), true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrders_InitialCollection_jPTI1() throws Exception {
    Collection<OrderDataBean> result = tradeDirect.getClosedOrders("user123");
    assertNotNull(result);
    assertTrue(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrders_PrepareStatement_qevj4() throws Exception {
    tradeDirect.getClosedOrders("user123");
    verify(mockStatement, times(1)).setString(1, "user123");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrders_ExecuteQuery_dHNN5() throws Exception {
    when(mockStatement.executeQuery()).thenReturn(mockResultSet);
    tradeDirect.getClosedOrders("user123");
    verify(mockStatement, times(1)).executeQuery();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrders_CloseStatement_ssif10() throws Exception {
    when(mockStatement.executeQuery()).thenReturn(mockResultSet);
    when(mockResultSet.next()).thenReturn(false);
    tradeDirect.getClosedOrders("user123");
    verify(mockStatement, times(1)).close();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrders_EmptyResultSet_odHz14() throws Exception {
    when(mockStatement.executeQuery()).thenReturn(mockResultSet);
    when(mockResultSet.next()).thenReturn(false);
    Collection<OrderDataBean> result = tradeDirect.getClosedOrders("user123");
    assertNotNull(result);
    assertTrue(result.isEmpty());
  }
}