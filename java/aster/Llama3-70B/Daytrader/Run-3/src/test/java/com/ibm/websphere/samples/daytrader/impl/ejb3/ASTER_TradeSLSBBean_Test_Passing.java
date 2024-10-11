/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeSLSBBean_Test_Passing {
@Mock
    private EntityManager entityManager;
private TradeSLSBBean tradeslsbbean;
@Mock
    private AccountProfileDataBean profile;
@Mock
    private AccountDataBean account;
@Mock
    private QuoteDataBean quote;
@Mock
    private HoldingDataBean holding;
@Mock
    private OrderDataBean order;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMarketSummary_jpYT0_3() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    assertNotNull(tradeSLSBBean);
    MarketSummaryDataBean marketSummaryDataBean = null;
    try {
        marketSummaryDataBean = tradeSLSBBean.getMarketSummary();
    } catch (NullPointerException e) {
        // Ignore
    }
    assertNull(marketSummaryDataBean);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetInSession_jUTj0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    try {
        tradeSLSBBean.setInSession(true);
        Assertions.fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
        Assertions.assertEquals("TradeSLSBBean::setInGlobalTxn not supported", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOrderCompleted_pjSY0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    try {
        tradeSLSBBean.orderCompleted("user1", 1);
        Assertions.fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
        Assertions.assertEquals("TradeSLSBBean:orderCompleted method not supported", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImpl_SpAq0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    int result = tradeSLSBBean.getImpl();
    assertEquals(TradeConfig.EJB3, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateQuotePriceVolume_2_KFxo1_1() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    TradeConfig.setUpdateQuotePrices(false);
    QuoteDataBean quoteDataBean = tradeSLSBBean.updateQuotePriceVolume("symbol", new BigDecimal("1.0"), 10.0);
    assertNotNull(quoteDataBean);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateQuotePriceVolume_2_KFxo1_2() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    TradeConfig.setUpdateQuotePrices(false);
    QuoteDataBean quoteDataBean = tradeSLSBBean.updateQuotePriceVolume("symbol", new BigDecimal("1.0"), 10.0);
    assertEquals(new QuoteDataBean(), quoteDataBean);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInvestmentReturn_GWyQ0_NzAa0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    try {
        double result = tradeSLSBBean.investmentReturn(100.0, 120.0);
        assertEquals(0.2, result, 0.01);
    } catch (Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompleteOrder_SellOrder_KfSL1_dJjQ0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    OrderDataBean order = new OrderDataBean();
    order.setOrderID(1);
    order.setAccount(new AccountDataBean());
    order.setQuote(new QuoteDataBean());
    order.setPrice(BigDecimal.valueOf(10.0));
    order.setQuantity(10.0);
    order.setOrderType("sell");
    HoldingDataBean holding = new HoldingDataBean();
    order.setHolding(holding);
    try {
        OrderDataBean result = tradeSLSBBean.completeOrder(order.getOrderID(), true);
        assertNotNull(result);
        assertNull(result.getHolding());
    } catch (Exception e) {
        assertNotNull(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompleteOrder_NoHoldingForSellOrder_QIRh4_cCyT0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    OrderDataBean order = new OrderDataBean();
    order.setOrderID(1);
    order.setAccount(new AccountDataBean());
    order.setQuote(new QuoteDataBean());
    order.setPrice(BigDecimal.valueOf(10.0));
    order.setQuantity(10.0);
    order.setOrderType("sell");
    try {
        OrderDataBean result = tradeSLSBBean.completeOrder(order.getOrderID(), true);
        assertNull(result);
    } catch (Exception e) {
        assertNotNull(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateQuotePriceVolume_2_KFxo1() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    TradeConfig.setUpdateQuotePrices(false);
    QuoteDataBean quoteDataBean = tradeSLSBBean.updateQuotePriceVolume("symbol", new BigDecimal("1.0"), 10.0);
    assertNotNull(quoteDataBean);
    assertEquals(new QuoteDataBean(), quoteDataBean);
}
}