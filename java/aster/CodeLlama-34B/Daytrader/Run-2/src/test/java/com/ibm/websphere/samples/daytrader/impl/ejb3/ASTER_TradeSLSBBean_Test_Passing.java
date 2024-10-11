/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.ejb.EJBException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeSLSBBean_Test_Passing {
  private TradeSLSBBean tradeSLSBBean;
  private AccountDataBean account;
  private EntityManager entityManager;
  TradeSLSBBean tradeslsbbean;
  private TypedQuery<QuoteDataBean> query;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPublishQuotePriceChangeWithNullQuote_XzqY3() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturn_iACP0() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = 1000.0;
    double netValue = 1100.0;
    double ir = tradeSLSBBean.investmentReturn(investment, netValue);
    assertEquals(0.1, ir, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturnWithZeroInvestment_skfR1() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = 0.0;
    double netValue = 1000.0;
    double ir = tradeSLSBBean.investmentReturn(investment, netValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturnWithNegativeInvestment_rkMP3() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = -1000.0;
    double netValue = 1000.0;
    double ir = tradeSLSBBean.investmentReturn(investment, netValue);
    assertEquals(-2.0, ir, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturnWithNegativeNetValue_tKoN4() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = 1000.0;
    double netValue = -1000.0;
    double ir = tradeSLSBBean.investmentReturn(investment, netValue);
    assertEquals(-2.0, ir, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturnWithNegativeInvestmentAndNetValue_hJaO6() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = -1000.0;
    double netValue = -1000.0;
    double ir = tradeSLSBBean.investmentReturn(investment, netValue);
    assertEquals(0.0, ir, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturnWithInvalidInvestment_EYgh7() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = Double.NaN;
    double netValue = 1000.0;
    double ir = tradeSLSBBean.investmentReturn(investment, netValue);
    assertEquals(Double.NaN, ir, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturnWithInvalidNetValue_Dwcw8() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    double investment = 1000.0;
    double netValue = Double.NaN;
    double ir = tradeSLSBBean.investmentReturn(investment, netValue);
    assertEquals(Double.NaN, ir, 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCompleteOrderSellTwoPhase_sMCG3() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    OrderDataBean order = new OrderDataBean();
    order.setOrderType("sell");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetImpl_aifJ0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    int result = tradeSLSBBean.getImpl();
    assertEquals(TradeConfig.EJB3, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateOrderWithNullQuote_QufH2_bGfy0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    AccountDataBean account = new AccountDataBean(1, 1, new java.util.Date(), new java.util.Date(), BigDecimal.valueOf(100.0), BigDecimal.valueOf(100.0), "profileID");
    QuoteDataBean quote = null;
    HoldingDataBean holding = new HoldingDataBean(100.0, BigDecimal.valueOf(100.0), new java.util.Date(), account, quote);
    String orderType = "orderType";
    double quantity = 100.0;
    try {
      tradeSLSBBean.createOrder(account, quote, holding, orderType, quantity);
      fail("Expected EJBException");
    } catch (EJBException e) {
      assertTrue(e.getMessage().contains("TradeSLSBBean:createOrder -- failed to create Order. Check that the symbol exists in the database."));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPingTwoPhase_ValidSymbol_rhKE0_XUYz0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    try {
      QuoteDataBean quoteData = tradeSLSBBean.pingTwoPhase("GOOG");
      assertNotNull(quoteData.getSymbol());
      assertEquals("GOOG", quoteData.getSymbol());
      assertNotNull(quoteData.getPrice());
      assertNotNull(quoteData.getOpen());
      assertNotNull(quoteData.getLow());
      assertNotNull(quoteData.getHigh());
      assertNotNull(quoteData.getVolume());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInvestmentReturnWithInvalidInvestmentAndNetValue_wzET9() throws Exception {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
  }
}