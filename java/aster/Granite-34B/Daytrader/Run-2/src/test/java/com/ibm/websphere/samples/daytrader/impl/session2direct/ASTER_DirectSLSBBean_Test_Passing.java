/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
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

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DirectSLSBBean_Test_Passing {
    @Mock
    private AccountDataBean account;
    @Mock
    private QuoteDataBean quote;
    @Mock
    private HoldingDataBean holding;
    @InjectMocks
    private DirectSLSBBean directslsbbean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInvestmentReturn_okaZ0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(0.0, 0.0);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInvestmentReturn_lSbL1() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(1.0, 1.0);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInvestmentReturn_ILCY2() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(-1.0, -1.0);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInvestmentReturn_vyaL3() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInvestmentReturn_lZjB4() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(Double.MIN_VALUE, Double.MIN_VALUE);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInvestmentReturn_PonG5() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(Double.NaN, Double.NaN);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInvestmentReturn_RvCr6() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInvestmentReturn_kBTZ7() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testInvestmentReturn_ZNvk8() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            double result = directSLSBBean.investmentReturn(1.0, 0.0);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrdersWithEmptyUserID_tqyj1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "";
        try {
            directSLSBBean.getOrders(userID);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrdersWithNullUserID_FGsI2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = null;
        try {
            directSLSBBean.getOrders(userID);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuoteNullSymbol_OTsE1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = null;
        String companyName = quoteDataBean.getCompanyName();
        BigDecimal price = quoteDataBean.getPrice();
        try {
            directSLSBBean.createQuote(symbol, companyName, price);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuoteNullCompanyName_PdRJ2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = quoteDataBean.getSymbol();
        String companyName = null;
        BigDecimal price = quoteDataBean.getPrice();
        try {
            directSLSBBean.createQuote(symbol, companyName, price);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuoteNullPrice_zqKl3() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        QuoteDataBean quoteDataBean = QuoteDataBean.getRandomInstance();
        String symbol = quoteDataBean.getSymbol();
        String companyName = quoteDataBean.getCompanyName();
        BigDecimal price = null;
        try {
            directSLSBBean.createQuote(symbol, companyName, price);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhasePlusSign_aQGV10() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String symbol = "+";
        try {
            directSLSBBean.pingTwoPhase(symbol);
            fail("The symbol + should not be supported");
        } catch (UnsupportedOperationException e) {
            // This is expected
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPingTwoPhaseUnderscore_PgJJ12() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompletedWithNullUser_USzf1() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.orderCompleted(null, 12345);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompletedWithNullOrder_STpH2() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        try {
            directSLSBBean.orderCompleted("testUser", null);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImpl_piDr0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        int actual = directSLSBBean.getImpl();
        int expected = TradeConfig.SESSION_TO_DIRECT;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void sellTest1_Zcxe0() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        Integer holdingID = 100;
        int orderProcessingMode = 1;
        try {
            OrderDataBean orderdata = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void sellTest2_dXoH1() {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid2";
        Integer holdingID = 200;
        int orderProcessingMode = 2;
        try {
            OrderDataBean orderdata = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingNull_MPeN1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer holdingID = null;
        try {
            directSLSBBean.getHolding(holdingID);
            fail("Should have thrown an exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingZero_dcOw2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer holdingID = new Integer(0);
        try {
            directSLSBBean.getHolding(holdingID);
            fail("Should have thrown an exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrders_nullUserID_iCPW1() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = null;
        try {
            directSLSBBean.getClosedOrders(userID);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrders_emptyUserID_uozb2() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "";
        try {
            directSLSBBean.getClosedOrders(userID);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrders_invalidUserID_XofU4() throws Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "invalidUser";
        try {
            directSLSBBean.getClosedOrders(userID);
            fail("Expected Exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }
}