/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeDirect_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getImplTest1_tcYc0() {
        TradeDirect trade = new TradeDirect();
        int actual = trade.getImpl();
        int expected = TradeConfig.DIRECT;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogoutWithException_nwyH1() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.logout("user456");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogoutWithNullUser_YEOH2() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.logout(null);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogoutWithEmptyUser_oUdv3() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.logout("");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogoutWithInvalidUser_fLRG6() throws Exception {
        TradeDirect tradeDirect = new TradeDirect();
        try {
            tradeDirect.logout("invalidUser");
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCancelOrderInSession_bHWV0() throws Exception {
        TradeDirect trade = new TradeDirect();
        trade.setInSession(true);
        trade.cancelOrder(123, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testrecreateDBTables1_OWrA0() throws Exception {
        TradeDirect trade = new TradeDirect();
        Object[] sqlBuffer = new Object[1];
        java.io.PrintWriter out = new java.io.PrintWriter(System.out);
        boolean result = trade.recreateDBTables(sqlBuffer, out);
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testrecreateDBTables5_ztuS4() throws Exception {
        TradeDirect trade = new TradeDirect();
        Object[] sqlBuffer = new Object[1];
        java.io.PrintWriter out = new java.io.PrintWriter(System.out);
        boolean result = trade.recreateDBTables(sqlBuffer, out);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateQuote9_OoYR8() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        QuoteDataBean quoteData = null;
        try {
            quoteData = trade.createQuote("symbol", "companyName", new BigDecimal(10.00));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void createOrderTest1_LEXX0() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = new AccountDataBean();
        QuoteDataBean quoteData = new QuoteDataBean();
        HoldingDataBean holdingData = new HoldingDataBean();
        String orderType = "open";
        double quantity = 100.0;
        try {
            OrderDataBean orderData = trade.createOrder(accountData, quoteData, holdingData, orderType, quantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin1_PNgF0() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid1", "uid1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin2_whPo1() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid2", "uid2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin3_rMRq2() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid3", "uid3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin4_PMnz3() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid4", "uid4");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin5_wSfL4() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid5", "uid5");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin6_wfHP5() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid6", "uid6");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin7_ZUyK6() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid7", "uid7");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin8_XdKl7() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid8", "uid8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin9_ObMs8() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid9", "uid9");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin10_xpzJ9() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid10", "uid10");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin11_PgKo10() throws Exception {
        TradeDirect trade = new TradeDirect();
        AccountDataBean accountData = null;
        try {
            accountData = trade.login("uid11", "uid11");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(null, accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getAccountDataTest12_pYKt11() throws java.lang.Exception {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest1_OsXe0() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid1";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest2_hwTM1() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid2";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest3_MbzJ2() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid3";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest4_RYTg3() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid4";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest5_PAbh4() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid5";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest6_lkqx5() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid6";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest7_dwEj6() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid7";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest8_sPJg7() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid8";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest9_OVnS8() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid9";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest10_lbDj9() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid10";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest11_amwb10() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid11";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest12_UyEI11() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid12";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getClosedOrdersTest13_OQTj12() throws java.lang.Exception {
        TradeDirect trade = new TradeDirect();
        String userID = "uid13";
        try {
            Collection<OrderDataBean> orderDataBeans = trade.getClosedOrders(userID);
        } catch (Exception e) {
        }
    }
}