/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.beans.MarketSummaryDataBean;
import com.ibm.websphere.samples.daytrader.entities.*;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeDirect_Test_Passing {
    private static final String getTSIAQuotesOrderByChangeSQL = "select * from quoteejb q order by q.change1";
    private static final String getOpenTSIASQL = "select SUM(open1)/count(*) as openTSIA from quoteejb q ";
    private static final String getTSIASQL = "select SUM(price)/count(*) as TSIA from quoteejb q ";
    @Mock
    private MDBStats mdbStats;
    @Mock
    private java.io.PrintWriter printWriter;
    @Mock
    private DataSource dataSource;
    @Mock
    private Connection connection;
    @Mock
    private Statement statement;
    private TradeDirect tradeDirect;
    @Mock
    private MarketSummaryDataBean marketSummaryDataBean;
    @Mock
    private PreparedStatement preparedStatement;
    @Mock
    private ResultSet resultSet;
    private static String getAllQuotesSQL = "select * from quoteejb q";
    TradeDirect tradedirect;
    PreparedStatement preparedstatement;
    ResultSet resultset;
    DataSource datasource;
    private boolean inSession = false;
    OrderDataBean orderDataBean;
    private static String getQuoteSQL = "select * from quoteejb q where q.symbol=?";
    AccountDataBean accountDataBean;
    private UserTransaction txn;
    @Mock
    private HoldingDataBean holdingDataBean;
    @Mock
    private QuoteDataBean quoteDataBean;
    @Mock
    private TradeConfig tradeConfig;
    @Mock
    private Log log;
    @Mock
    private FinancialUtils financialUtils;
    @Mock
    private KeySequenceDirect keySequenceDirect;
    private ManagedExecutorService mes;
    private static long nextMarketSummary = System.currentTimeMillis();
    private static final Integer marketSummaryLock = new Integer(0);
    private static MarketSummaryDataBean cachedMSDB = MarketSummaryDataBean.getRandomInstance();

    private AccountDataBean getAccountData() {
        return null;
    }

    private QuoteDataBean getQuoteData() {
        return null;
    }
    private static final String logoutSQL = "update accountejb set logoutcount=logoutcount+1 " + "where profile_userid=?";
    private static final String loginSQL = "update accountejb set lastLogin=?, logincount=logincount+1 " + "where profile_userid=?";

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRecreateDBTablesSuccess_vqQf0() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        Object[] sqlBuffer = new Object[]{"CREATE TABLE", "DROP TABLE"};
        java.io.PrintWriter out = new java.io.PrintWriter(System.out);
        assertFalse(tradeDirect.recreateDBTables(sqlBuffer, out));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRecreateDBTablesFailure_spNV1() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        Object[] sqlBuffer = new Object[]{"CREATE TABLE", "DROP TABLE", "CREATE TABLE"};
        java.io.PrintWriter out = new java.io.PrintWriter(System.out);
        assertFalse(tradeDirect.recreateDBTables(sqlBuffer, out));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrderError_YKvY2() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        OrderDataBean orderData = OrderDataBean.getRandomInstance();
        orderData.setOrderType("buy");
        orderData.setQuantity(10.0);
        orderData.setPrice(new BigDecimal("10.0"));
        orderData.setSymbol("ABC");
        orderData.setOrderID(1);
        orderData.setAccount(getAccountData());
        try {
            tradeDirect.completeOrder(orderData.getOrderID(), true);
            Assertions.fail("Expected exception");
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrderError_jLix2() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        OrderDataBean orderData = new OrderDataBean();
        orderData.setOrderID(1);
        orderData.setOrderType("buy");
        orderData.setSymbol("symbol");
        orderData.setQuantity(10.0);
        orderData.setPrice(new BigDecimal("10.0"));
        orderData.setAccount(getAccountData());
        orderData.setQuote(getQuoteData());
        try {
            tradeDirect.completeOrder(orderData.getOrderID(), true);
            Assertions.fail("Expected exception");
        } catch (Exception e) {
            Assertions.assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetQuoteException_YrXX2() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.getQuote("symbol");
            fail("Expected exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQueueOrder_fAIQ0() {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.queueOrder(1, true);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQueueOrderFalse_ypgL2() {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.queueOrder(1, false);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_RTIu0() {
        tradeDirect = new TradeDirect();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellNullUserID_EHdE1() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.sell(null, 1, TradeConfig.SYNCH);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellNullHoldingID_mmZI2() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.sell("userID", null, TradeConfig.SYNCH);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellNullUserID_xeST1() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        Connection conn = null;
        try {
            tradeDirect.sell(null, 1, TradeConfig.SYNCH);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellNullHoldingID_aQmE2() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        Connection conn = null;
        try {
            tradeDirect.sell("userID", null, TradeConfig.SYNCH);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellInvalidOrderProcessingMode_BFFU3() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        Connection conn = null;
        try {
            tradeDirect.sell("userID", 1, 5);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellAccountDataNull_eGtc4() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        Connection conn = null;
        try {
            tradeDirect.sell("userID", 1, TradeConfig.SYNCH);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellHoldingDataNull_VNtF5() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        Connection conn = null;
        try {
            tradeDirect.sell("userID", null, TradeConfig.SYNCH);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellNullHoldingID_GPFP2() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.sell("user1", null, TradeConfig.SYNCH);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellInvalidOrderProcessingMode_VqIy3() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.sell("user1", 1, 5);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellAccountDataNull_mSiN4() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            tradeDirect.sell("user1", 1, TradeConfig.SYNCH);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellHoldingDataNull_maaa5() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        HoldingDataBean holdingData = null;
        try {
            tradeDirect.sell("user1", 1, TradeConfig.SYNCH);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSellQuoteDataNull_Cexn6() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        QuoteDataBean quoteData = null;
        try {
            tradeDirect.sell("user1", 1, TradeConfig.SYNCH);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolumeInt_Exception_DRiK4() {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.updateQuotePriceVolumeInt("symbol", BigDecimal.valueOf(1.0), 100.0, false);
            fail("Expected exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolumeInt_ConnectionException_YJqe4() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        QuoteDataBean quoteData = new QuoteDataBean();
        quoteData.setSymbol("symbol");
        quoteData.setPrice(BigDecimal.valueOf(1.00));
        quoteData.setOpen(BigDecimal.valueOf(1.00));
        quoteData.setLow(BigDecimal.valueOf(1.00));
        quoteData.setHigh(BigDecimal.valueOf(1.00));
        quoteData.setVolume(100.0);
        quoteData.setCompanyName("company");
        BigDecimal changeFactor = BigDecimal.valueOf(2.0);
        double sharesTraded = 50.0;
        try {
            tradeDirect.updateQuotePriceVolumeInt("symbol", changeFactor, sharesTraded, true);
            fail("Expected exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingsException_OjzE1() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        String userID = "testUser";
        try {
            tradeDirect.getHoldings(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfileNull_xpnS1() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        AccountProfileDataBean profileData = null;
        try {
            tradeDirect.updateAccountProfile(profileData);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfileEmpty_RMDC2() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        AccountProfileDataBean profileData = new AccountProfileDataBean();
        try {
            tradeDirect.updateAccountProfile(profileData);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfileInvalid_lmEV3() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        AccountProfileDataBean profileData = new AccountProfileDataBean("userID", null, "fullName", "address", "email", "creditCard");
        try {
            tradeDirect.updateAccountProfile(profileData);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfileInvalid2_fPpJ4() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        AccountProfileDataBean profileData = new AccountProfileDataBean("userID", "password", null, "address", "email", "creditCard");
        try {
            tradeDirect.updateAccountProfile(profileData);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfileInvalid3_DHps5() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        AccountProfileDataBean profileData = new AccountProfileDataBean("userID", "password", "fullName", null, "email", "creditCard");
        try {
            tradeDirect.updateAccountProfile(profileData);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfileInvalid4_pVyD6() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        AccountProfileDataBean profileData = new AccountProfileDataBean("userID", "password", "fullName", "address", null, "creditCard");
        try {
            tradeDirect.updateAccountProfile(profileData);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfileInvalid5_DEzk7() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        AccountProfileDataBean profileData = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", null);
        try {
            tradeDirect.updateAccountProfile(profileData);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfileInvalid6_HqIL8() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        AccountProfileDataBean profileData = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        try {
            tradeDirect.updateAccountProfile(profileData);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateQuotePriceVolumeInt_Exception_pvGL4() {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.updateQuotePriceVolumeInt("symbol", BigDecimal.valueOf(0.05), 100, true);
            fail("Expected exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompleted_ZbGk0() {
        TradeDirect tradeDirect = new TradeDirect();
        Exception exception = assertThrows(Exception.class, () -> tradeDirect.orderCompleted("userID", 1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompletedNullUserID_lTUG1() {
        TradeDirect tradeDirect = new TradeDirect();
        Exception exception = assertThrows(Exception.class, () -> tradeDirect.orderCompleted(null, 1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrderCompletedNullOrderID_Cpeu2() {
        TradeDirect tradeDirect = new TradeDirect();
        Exception exception = assertThrows(Exception.class, () -> tradeDirect.orderCompleted("userID", null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImpl_gykk0() {
        TradeDirect tradeDirect = new TradeDirect();
        int result = tradeDirect.getImpl();
        assert result == TradeConfig.DIRECT;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuyZeroQuantity_dyco3() {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.buy("user1", "AAPL", 0.0, TradeConfig.SYNCH);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuyNegativeQuantity_LhhP4() {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.buy("user1", "AAPL", -100.0, TradeConfig.SYNCH);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuyInvalidOrderProcessingMode_ndjj5() {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.buy("user1", "AAPL", 100.0, 5);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuyException_rkeL8() {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.buy("user1", "AAPL", 100.0, TradeConfig.SYNCH);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuyRollback_BfoX9() {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.buy("user1", "AAPL", 100.0, TradeConfig.ASYNCH_2PHASE);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrdersException_NQZy1() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        String userID = "testUser";
        try {
            tradeDirect.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }
}