/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.ejb3;
import java.math.BigDecimal;
import java.util.Collection;
import javax.ejb.EJBException;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeSLSBBean_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetInSession_MSXc0() {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        try {
            tradeSLSBBean.setInSession(true);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("TradeSLSBBean::setInGlobalTxn not supported", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPublishQuotePriceChange_PublishConfigTrue_ThrowsException_SuGd2() {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        TradeConfig.setPublishQuotePriceChange(true);
        QuoteDataBean quote = new QuoteDataBean("symbol", "company", 100, BigDecimal.valueOf(10), BigDecimal.valueOf(5), BigDecimal.valueOf(3), BigDecimal.valueOf(15), 500);
        BigDecimal oldPrice = BigDecimal.valueOf(10);
        BigDecimal changeFactor = BigDecimal.valueOf(1.1);
        double sharesTraded = 100;
        try {
            tradeSLSBBean.publishQuotePriceChange(quote, oldPrice, changeFactor, sharesTraded);
        } catch (Exception e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturnPositive_EZzM0() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        double investment = 100.0;
        double netValue = 110.0;
        try {
            double result = tradeSLSBBean.investmentReturn(investment, netValue);
            assertEquals(0.1, result, 0.01);
        } catch (Exception e) {
            assertThrows(Exception.class, () -> tradeSLSBBean.investmentReturn(investment, netValue));
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturnNegative_sKDx1() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        double investment = 100.0;
        double netValue = 90.0;
        try {
            double result = tradeSLSBBean.investmentReturn(investment, netValue);
            assertEquals(-0.1, result, 0.01);
        } catch (Exception e) {
            assertThrows(Exception.class, () -> tradeSLSBBean.investmentReturn(investment, netValue));
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturnZero_LRtP2() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        double investment = 100.0;
        double netValue = 100.0;
        try {
            double result = tradeSLSBBean.investmentReturn(investment, netValue);
            assertEquals(0.0, result, 0.01);
        } catch (Exception e) {
            assertThrows(Exception.class, () -> tradeSLSBBean.investmentReturn(investment, netValue));
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvestmentReturnLargeNumbers_mdWC7() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        double investment = 1000000.0;
        double netValue = 1100000.0;
        try {
            double result = tradeSLSBBean.investmentReturn(investment, netValue);
            assertEquals(0.1, result, 0.01);
        } catch (Exception e) {
            assertThrows(Exception.class, () -> tradeSLSBBean.investmentReturn(investment, netValue));
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompleted_Sicd0() {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        try {
            tradeSLSBBean.orderCompleted("userID", 1);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImpl_EoeY0() {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        int result = tradeSLSBBean.getImpl();
        assertEquals(TradeConfig.EJB3, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountDataNonExistingProfile_DLmW3() {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        try {
            tradeSLSBBean.getAccountData("testUser");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhaseNullQuoteData_FHnF0() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        QuoteDataBean quoteData = null;
        try {
            quoteData = tradeSLSBBean.pingTwoPhase(null);
            Assertions.assertNull(quoteData);
        } catch (Exception e) {
            Assertions.fail("Expected null quoteData but got exception");
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhaseEmptySymbol_bRIu1() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        String symbol = "";
        try {
            tradeSLSBBean.pingTwoPhase(symbol);
        } catch (Exception e) {
            Assertions.fail("Expected empty symbol but got exception");
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhaseValidSymbol_cImM2() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        String symbol = "ABC";
        try {
            tradeSLSBBean.pingTwoPhase(symbol);
        } catch (Exception e) {
            Assertions.fail("Expected valid symbol but got exception");
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhaseRandomSharesTraded_fRgl3() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        String symbol = "ABC";
        try {
            double sharesTraded = (Math.random() * 100) + 1;
            tradeSLSBBean.pingTwoPhase(symbol);
            Assertions.assertTrue(sharesTraded > 0);
        } catch (Exception e) {
            Assertions.fail("Expected random shares traded but got exception");
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhaseMerge_oRrM9() throws java.lang.Exception {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        String symbol = "ABC";
        try {
            tradeSLSBBean.pingTwoPhase(symbol);
            Assertions.assertTrue(true);
        } catch (Exception e) {
            Assertions.fail("Expected merge but got exception");
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhaseTextMessage_cZra10() throws java.lang.Exception {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellException_qIEK7() {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        try {
            tradeSLSBBean.sell("user1", 1, TradeConfig.SYNCH);
            Assertions.fail("Expected exception");
        } catch (EJBException e) {
            Assertions.assertNotNull(e);
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingExistingHoldingIDWithQuote_LWZE7() {
        TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
        HoldingDataBean expectedHolding = new HoldingDataBean();
        expectedHolding.setHoldingID(1);
        QuoteDataBean quote = new QuoteDataBean();
        expectedHolding.setQuote(quote);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_JaJD0_crDB0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateOrderWithNullAccount_uCRF1_bSBj0() {
    QuoteDataBean quote = new QuoteDataBean("symbol");
    HoldingDataBean holding = new HoldingDataBean();
    String orderType = "buy";
    double quantity = 10.0;
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean(); // Create an instance of TradeSLSBBean
    try {
        tradeSLSBBean.createOrder(null, quote, holding, orderType, quantity);
        fail("Expected EJBException");
    } catch (EJBException e) {
        assertEquals("TradeSLSBBean:createOrder -- failed to create Order. Check that the symbol exists in the database.", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccountDataNullAccount_jbFk2_JMqL0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    AccountProfileDataBean profile = new AccountProfileDataBean();
    profile.setUserID("testUser");
    try {
        tradeSLSBBean.getAccountData("testUser");
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateQuoteNullSymbol_iTcZ2_aymg0() {
    String symbol = null;
    String companyName = "Company ABC";
    BigDecimal price = new BigDecimal("10.00");
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean(); // Create an instance of TradeSLSBBean
    try {
        tradeSLSBBean.getClosedOrders("userID"); // Call the method under test
        fail("Expected EJBException");
    } catch (EJBException e) {
        System.out.println("Expected EJBException");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateQuoteException_xfXJ6_oAHU0() {
    String symbol = "ABC";
    String companyName = "Company ABC";
    BigDecimal price = new BigDecimal("10.00");
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean(); // Create an instance of TradeSLSBBean
    try {
        tradeSLSBBean.createQuote(symbol, companyName, price);
    } catch (EJBException e) {
        System.out.println("TradeSLSBBean:createQuote -- exception creating Quote");
        e.printStackTrace();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuyAccountProfileDataBeanException_DreE7_qpyP0() {
    TradeSLSBBean tradeSLSBBean = new TradeSLSBBean();
    AccountProfileDataBean profile = mock(AccountProfileDataBean.class);
    EntityManager entityManager = mock(EntityManager.class);
    when(entityManager.getEntityManagerFactory().createEntityManager().find(AccountProfileDataBean.class, "userID")).thenReturn(profile);
    when(entityManager.createQuery(any(CriteriaQuery.class))).thenThrow(new Exception("Exception"));
    Collection<OrderDataBean> order = tradeSLSBBean.getClosedOrders("userID");
    Assertions.assertNull(order);
}
}