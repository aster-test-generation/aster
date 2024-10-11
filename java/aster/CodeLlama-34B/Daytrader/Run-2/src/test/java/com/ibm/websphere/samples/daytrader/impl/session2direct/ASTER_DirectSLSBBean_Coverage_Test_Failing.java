/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.impl.direct.TradeDirect;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_DirectSLSBBean_Coverage_Test_Failing {
  private TradeDirect tradeDirect;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllQuotes_yUpZ0_1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Collection<?> quotes = directSLSBBean.getAllQuotes();
    assertNotNull(quotes);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllQuotes_yUpZ0_2() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Collection<?> quotes = directSLSBBean.getAllQuotes();
    assertTrue(quotes.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllQuotesWithInSession_YoDC1_1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.setInSession(true);
    Collection<?> quotes = directSLSBBean.getAllQuotes();
    assertNotNull(quotes);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllQuotesWithInSession_YoDC1_2() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.setInSession(true);
    Collection<?> quotes = directSLSBBean.getAllQuotes();
    assertTrue(quotes.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldings_setInSession_HiQy0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.getHoldings("userID");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldings_getHoldings_KLCJ1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Collection<HoldingDataBean> holdings = directSLSBBean.getHoldings("userID");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_getMarketSummary_EDLE1_1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertNotNull(marketSummaryDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_getMarketSummary_EDLE1_2() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertEquals(marketSummaryDataBean.getOpenTSIA(), BigDecimal.ZERO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_getMarketSummary_EDLE1_3() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertEquals(marketSummaryDataBean.getGainPercent(), BigDecimal.ZERO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_getMarketSummary_EDLE1_4() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertEquals(marketSummaryDataBean.getSummaryDate(), new Date(0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_getMarketSummary_EDLE1_5() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertEquals(marketSummaryDataBean.getTSIA(), BigDecimal.ZERO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_getMarketSummary_EDLE1_6() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertEquals(marketSummaryDataBean.getVolume(), 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_getMarketSummary_EDLE1_7() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertEquals(marketSummaryDataBean.getTopGainers().size(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_getMarketSummary_EDLE1_8() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertEquals(marketSummaryDataBean.getTopLosers().size(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrder_WRtY0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    OrderDataBean orderDataBean = directSLSBBean.completeOrder(1, true);
    assertNotNull(orderDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderWithTwoPhase_WSpV1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    OrderDataBean orderDataBean = directSLSBBean.completeOrder(1, false);
    assertNotNull(orderDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancelOrder_setInSession_FTHd0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.cancelOrder(1, true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuote_DoPi0_1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    QuoteDataBean quoteDataBean = directSLSBBean.getQuote("GOOG");
    assertNotNull(quoteDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuote_DoPi0_2() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    QuoteDataBean quoteDataBean = directSLSBBean.getQuote("GOOG");
    assertEquals("GOOG", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testQueueOrder_setInSession_kGjG0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.queueOrder(1, true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuote_ULFd0_1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    String symbol = "ABC";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(10.0);
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    quoteDataBean.setCompanyName(companyName);
    quoteDataBean.setPrice(price);
    quoteDataBean.setSymbol(symbol);
    when(tradeDirect.createQuote(symbol, companyName, price)).thenReturn(quoteDataBean);
    QuoteDataBean actualQuoteDataBean = directSLSBBean.createQuote(symbol, companyName, price);
    assertNotNull(actualQuoteDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuote_ULFd0_2() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    String symbol = "ABC";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(10.0);
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    quoteDataBean.setCompanyName(companyName);
    quoteDataBean.setPrice(price);
    quoteDataBean.setSymbol(symbol);
    when(tradeDirect.createQuote(symbol, companyName, price)).thenReturn(quoteDataBean);
    QuoteDataBean actualQuoteDataBean = directSLSBBean.createQuote(symbol, companyName, price);
    assertEquals(companyName, actualQuoteDataBean.getCompanyName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuote_ULFd0_3() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    String symbol = "ABC";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(10.0);
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    quoteDataBean.setCompanyName(companyName);
    quoteDataBean.setPrice(price);
    quoteDataBean.setSymbol(symbol);
    when(tradeDirect.createQuote(symbol, companyName, price)).thenReturn(quoteDataBean);
    QuoteDataBean actualQuoteDataBean = directSLSBBean.createQuote(symbol, companyName, price);
    assertEquals(price, actualQuoteDataBean.getPrice());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuote_ULFd0_4() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    String symbol = "ABC";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(10.0);
    QuoteDataBean quoteDataBean = new QuoteDataBean();
    quoteDataBean.setCompanyName(companyName);
    quoteDataBean.setPrice(price);
    quoteDataBean.setSymbol(symbol);
    when(tradeDirect.createQuote(symbol, companyName, price)).thenReturn(quoteDataBean);
    QuoteDataBean actualQuoteDataBean = directSLSBBean.createQuote(symbol, companyName, price);
    assertEquals(symbol, actualQuoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateQuoteWithInvalidSymbol_PBAL1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    String symbol = "INVALID";
    String companyName = "ABC Company";
    BigDecimal price = new BigDecimal(10.0);
    when(tradeDirect.createQuote(symbol, companyName, price)).thenThrow(new Exception("Invalid symbol"));
    try {
      directSLSBBean.createQuote(symbol, companyName, price);
    } catch (Exception e) {
      assertEquals("Invalid symbol", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompleted_jFaE0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.orderCompleted("userID", 1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOrderCompletedWithInSession_umfo1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.tradeDirect.setInSession(true);
    directSLSBBean.orderCompleted("userID", 1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogout_MjVv0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.logout("userID");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogoutWithInSession_mEoC1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.tradeDirect.setInSession(true);
    directSLSBBean.logout("userID");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogoutWithoutInSession_ibHh2() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.tradeDirect.setInSession(false);
    directSLSBBean.logout("userID");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHolding_YYfL0_1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Integer holdingID = 1;
    HoldingDataBean holdingDataBean = directSLSBBean.getHolding(holdingID);
    assertNotNull(holdingDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHolding_YYfL0_2() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Integer holdingID = 1;
    HoldingDataBean holdingDataBean = directSLSBBean.getHolding(holdingID);
    assertEquals(holdingID, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingWithInSession_TMoM1_1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Integer holdingID = 1;
    directSLSBBean.setInSession(true);
    HoldingDataBean holdingDataBean = directSLSBBean.getHolding(holdingID);
    assertNotNull(holdingDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingWithInSession_TMoM1_2() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Integer holdingID = 1;
    directSLSBBean.setInSession(true);
    HoldingDataBean holdingDataBean = directSLSBBean.getHolding(holdingID);
    assertEquals(holdingID, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderAsync_submitOrder_HcVP0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Integer orderID = 123;
    boolean twoPhase = true;
    Future<OrderDataBean> future = directSLSBBean.completeOrderAsync(orderID, twoPhase);
    assertNull(future);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_sell_htKN1() throws java.lang.Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    String userID = "test_user";
    Integer holdingID = 1;
    int orderProcessingMode = TradeConfig.ASYNCH;
    OrderDataBean orderdata = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
    assertNotNull(orderdata);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSell_completeOrderAsync_mNrA2() throws java.lang.Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    String userID = "test_user";
    Integer holdingID = 1;
    int orderProcessingMode = TradeConfig.ASYNCH;
    OrderDataBean orderdata = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
    directSLSBBean.completeOrderAsync(orderdata.getOrderID(), false);
    assertTrue(orderdata.getOrderStatus().equals("COMPLETE"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllQuotes_yUpZ0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Collection<?> quotes = directSLSBBean.getAllQuotes();
    assertNotNull(quotes);
    assertTrue(quotes.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllQuotesWithInSession_YoDC1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    directSLSBBean.setInSession(true);
    Collection<?> quotes = directSLSBBean.getAllQuotes();
    assertNotNull(quotes);
    assertTrue(quotes.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMarketSummary_getMarketSummary_EDLE1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    MarketSummaryDataBean marketSummaryDataBean = directSLSBBean.getMarketSummary();
    assertNotNull(marketSummaryDataBean);
    assertEquals(marketSummaryDataBean.getOpenTSIA(), BigDecimal.ZERO);
    assertEquals(marketSummaryDataBean.getGainPercent(), BigDecimal.ZERO);
    assertEquals(marketSummaryDataBean.getSummaryDate(), new Date(0));
    assertEquals(marketSummaryDataBean.getTSIA(), BigDecimal.ZERO);
    assertEquals(marketSummaryDataBean.getVolume(), 0.0);
    assertEquals(marketSummaryDataBean.getTopGainers().size(), 0);
    assertEquals(marketSummaryDataBean.getTopLosers().size(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuote_DoPi0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    QuoteDataBean quoteDataBean = directSLSBBean.getQuote("GOOG");
    assertNotNull(quoteDataBean);
    assertEquals("GOOG", quoteDataBean.getSymbol());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetQuoteWithInvalidSymbol_FkOb1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    QuoteDataBean quoteDataBean = directSLSBBean.getQuote("INVALID");
    assertNull(quoteDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testUpdateAccountProfile_updateAccountProfile_nqnA1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    AccountProfileDataBean profileData = new AccountProfileDataBean();
    profileData.setUserID("testUser");
    profileData.setPassword("testPassword");
    profileData.setFullName("Test User");
    profileData.setAddress("Test Address");
    profileData.setEmail("test@email.com");
    profileData.setCreditCard("1234567890");
    AccountProfileDataBean updatedProfileData = directSLSBBean.updateAccountProfile(profileData);
    Assertions.assertEquals(profileData, updatedProfileData);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHolding_YYfL0() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Integer holdingID = 1;
    HoldingDataBean holdingDataBean = directSLSBBean.getHolding(holdingID);
    assertNotNull(holdingDataBean);
    assertEquals(holdingID, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingWithInSession_TMoM1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Integer holdingID = 1;
    directSLSBBean.setInSession(true);
    HoldingDataBean holdingDataBean = directSLSBBean.getHolding(holdingID);
    assertNotNull(holdingDataBean);
    assertEquals(holdingID, holdingDataBean.getHoldingID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderAsync_returnNull_csno1() throws Exception {
    DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    Integer orderID = 123;
    boolean twoPhase = true;
    Future<OrderDataBean> future = directSLSBBean.completeOrderAsync(orderID, twoPhase);
    assertTrue(future.isDone());
  }
}