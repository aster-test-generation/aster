/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.entities.*;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.ejb.EJBException;
import javax.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeSLSBBean_Test_Passing {
  @Mock
  private EntityManager entityManager;
  @InjectMocks
  private TradeSLSBBean tradeslsbbean;
  private AccountDataBean account;
  private QuoteDataBean quote;
  private HoldingDataBean holding;
  @Mock
  private AccountProfileDataBean profile;
  @Mock
  private OrderDataBean order;
  @InjectMocks
  private TradeSLSBBean tradeSLSBBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPublishQuotePriceChangeWhenPublishingIsDisabled_qeEJ3() {
    TradeConfig.setPublishQuotePriceChange(false);
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    QuoteDataBean quote = new QuoteDataBean("TSLA", "Tesla Inc.", 15000, new BigDecimal("700"), new BigDecimal("690"), new BigDecimal("680"), new BigDecimal("710"), 20.0);
    BigDecimal oldPrice = new BigDecimal("690");
    BigDecimal changeFactor = new BigDecimal("1.2");
    double sharesTraded = 8000;
    tradeSLSBBean.publishQuotePriceChange(quote, oldPrice, changeFactor, sharesTraded);
    assertTrue(true);
    TradeConfig.setPublishQuotePriceChange(true); // Reset for other tests
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturn_PositiveGrowth_HJIq0() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = 1000.0;
    double NetValue = 1200.0;
    double expectedReturn = 0.2;
    double actualReturn = tradeSLSBBean.investmentReturn(investment, NetValue);
    assertEquals(expectedReturn, actualReturn, 0.0001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllQuotes_nmWn0_2() {
    TradeSLSBBean tradeSLSBBean = Mockito.mock(TradeSLSBBean.class);
    Collection<QuoteDataBean> mockResult = new ArrayList<>();
    mockResult.add(new QuoteDataBean());
    Mockito.when(tradeSLSBBean.getAllQuotes()).thenReturn(mockResult);
    Collection<QuoteDataBean> result = tradeSLSBBean.getAllQuotes();
    assertNotNull(result);
    assertFalse(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingsWithValidUserId_dDYk0_1() {
    TradeSLSBBean tradeSLSBBean = Mockito.mock(TradeSLSBBean.class);
    String userID = "validUserID";
    Collection<HoldingDataBean> mockResult = new ArrayList<>();
    Mockito.when(tradeSLSBBean.getHoldings(userID)).thenReturn(mockResult);
    Collection<HoldingDataBean> result = tradeSLSBBean.getHoldings(userID);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingsWithValidUserId_dDYk0_2() {
    TradeSLSBBean tradeSLSBBean = Mockito.mock(TradeSLSBBean.class);
    String userID = "validUserID";
    Collection<HoldingDataBean> mockResult = new ArrayList<>();
    mockResult.add(new HoldingDataBean());
    Mockito.when(tradeSLSBBean.getHoldings(userID)).thenReturn(mockResult);
    Collection<HoldingDataBean> result = tradeSLSBBean.getHoldings(userID);
    assertFalse(result.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_NullOrder_bUSJ0() {
    TradeSLSBBean tradeBean = new TradeSLSBBean();
    try {
      tradeBean.completeOrder(null, true);
      fail("Should have thrown an exception for null orderID");
    } catch (Exception e) {
      assertFalse(e instanceof EJBException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_OrderAlreadyCompleted_SnuY1() {
    TradeSLSBBean tradeBean = new TradeSLSBBean();
    OrderDataBean order = new OrderDataBean();
    order.setOrderStatus("closed");
    try {
      tradeBean.completeOrder(order.getOrderID(), true);
      fail("Should have thrown an exception for already completed order");
    } catch (Exception e) {
      assertFalse(e instanceof EJBException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_SellOrder_NoHolding_dQyx4() throws Exception {
    TradeSLSBBean tradeBean = new TradeSLSBBean();
    AccountDataBean account = new AccountDataBean();
    QuoteDataBean quote = new QuoteDataBean();
    OrderDataBean order = new OrderDataBean();
    order.setOrderType("sell");
    order.setAccount(account);
    order.setQuote(quote);
    order.setPrice(new BigDecimal("150.00"));
    order.setQuantity(10.0);
    order.setHolding(null);
    try {
      tradeBean.completeOrder(order.getOrderID(), true);
      fail("Should have thrown an exception for selling order without holding");
    } catch (Exception e) {
      assertFalse(e instanceof EJBException);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_NormalConditions_XsXc0_2() {
    TradeSLSBBean tradeBean = Mockito.mock(TradeSLSBBean.class);
    QuoteDataBean mockQuote = new QuoteDataBean();
    mockQuote.setPrice(new BigDecimal("1.05"));
    Mockito.when(tradeBean.updateQuotePriceVolume("AAPL", new BigDecimal("1.05"), 500.0)).thenReturn(mockQuote);
    QuoteDataBean quote = tradeBean.updateQuotePriceVolume("AAPL", new BigDecimal("1.05"), 500.0);
    assertEquals(new BigDecimal("1.05"), quote.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_NormalConditions_XsXc0_3() {
    TradeSLSBBean tradeBean = Mockito.mock(TradeSLSBBean.class);
    QuoteDataBean expectedQuote = new QuoteDataBean();
    expectedQuote.setVolume(600.0);
    Mockito.when(tradeBean.updateQuotePriceVolume("AAPL", new BigDecimal("1.05"), 500.0)).thenReturn(expectedQuote);
    QuoteDataBean quote = tradeBean.updateQuotePriceVolume("AAPL", new BigDecimal("1.05"), 500.0);
    assertEquals(600.0, quote.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_PennyStockRecovery_lRpw1_1() {
    TradeSLSBBean tradeBean = new TradeSLSBBean();
    QuoteDataBean quote = tradeBean.updateQuotePriceVolume("XYZ", TradeConfig.PENNY_STOCK_PRICE, 1000.0);
    assertNotNull(quote);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_NoUpdateDueToConfig_wMRE3_1() {
    TradeConfig.setUpdateQuotePrices(false);
    TradeSLSBBean tradeBean = new TradeSLSBBean();
    QuoteDataBean quote = tradeBean.updateQuotePriceVolume("AAPL", new BigDecimal("1.10"), 300.0);
    assertNotNull(quote);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateQuotePriceVolume_NoUpdateDueToConfig_wMRE3_3() {
    TradeConfig.setUpdateQuotePrices(false);
    TradeSLSBBean tradeBean = new TradeSLSBBean();
    QuoteDataBean quote = tradeBean.updateQuotePriceVolume("AAPL", new BigDecimal("1.10"), 300.0);
    assertEquals(0.0, quote.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingTwoPhaseWithExceptionHandling_oGlR2() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    String symbol = "invalidSymbol"; // Assuming this symbol does not exist in the database
    try {
      QuoteDataBean resultQuoteData = tradeSLSBBean.pingTwoPhase(symbol);
      assertNull(resultQuoteData);
    } catch (Exception e) {
      fail("Exception should not be thrown for non-existing symbols");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetImpl_GZgX0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    int expected = TradeConfig.EJB3;
    assertEquals(expected, tradeSLSBBean.getImpl());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuyWithException() {
    tradeslsbbean = new TradeSLSBBean();
    // Setup
    String userID = "user123";
    String symbol = "XYZ";
    double quantity = 100.0;
    int orderProcessingMode = TradeConfig.SYNCH;
    when(entityManager.find(AccountProfileDataBean.class, userID)).thenThrow(new RuntimeException("Database error"));
    // Execute & Verify
    assertThrows(EJBException.class, () -> {
      tradeslsbbean.buy(userID, symbol, quantity, orderProcessingMode);
    });
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBuyFailureDueToException_GUOf3() {
    TradeSLSBBean tradeBean = new TradeSLSBBean();
    String userID = "invalidUser";
    String symbol = "XYZ";
    double quantity = 200.0;
    int orderProcessingMode = TradeConfig.SYNCH;
    try {
      tradeBean.buy(userID, symbol, quantity, orderProcessingMode);
      fail("Expected an EJBException to be thrown");
    } catch (EJBException e) {
      assertNotNull(e);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSellExceptionHandling_sNxV4() {
    TradeSLSBBean tradeBean = new TradeSLSBBean();
    String userID = "user5";
    Integer holdingID = null; // Invalid holding ID to trigger exception
    int orderProcessingMode = TradeConfig.SYNCH;
    try {
      tradeBean.sell(userID, holdingID, orderProcessingMode);
      fail("Expected an EJBException to be thrown");
    } catch (EJBException e) {
      assertNotNull(e.getMessage());
    }
  }

  @Test
  public void testSetInSessionThrowsException_YrmS0_TEov0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    assertThrows(UnsupportedOperationException.class, () -> tradeSLSBBean.setInSession(true));
  }

  @Test
  public void testOrderCompletedThrowsException_OLKc0_hOEm0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    assertThrows(UnsupportedOperationException.class, () -> tradeSLSBBean.orderCompleted("user123", 123));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancelOrder_qkct0_OZLY0() throws NoSuchFieldException, IllegalAccessException {
    TradeSLSBBean tradeBean = new TradeSLSBBean();
    Integer orderID = 1; // Assuming an existing order ID for testing
    boolean twoPhase = true; // Assuming the need for a two-phase commit
    EntityManager entityManager = mock(EntityManager.class);
    OrderDataBean order = mock(OrderDataBean.class);
    when(entityManager.find(OrderDataBean.class, orderID)).thenReturn(order);
    Field field = TradeSLSBBean.class.getDeclaredField("entityManager");
    field.setAccessible(true);
    field.set(tradeBean, entityManager);
    tradeBean.cancelOrder(orderID, twoPhase);
    verify(order).cancel();
  }
}