/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.session2direct;

import com.ibm.websphere.samples.daytrader.entities.*;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DirectSLSBBean_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateOrderWithException_iBJl1() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountDataBean account = new AccountDataBean();
        QuoteDataBean quote = new QuoteDataBean();
        HoldingDataBean holding = new HoldingDataBean();
        String orderType = "BUY";
        double quantity = 100.0;
        try {
            directSLSBBean.setInSession(false);
            directSLSBBean.createOrder(account, quote, holding, orderType, quantity);
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
            assertEquals("DirectSLSBBean::setInGlobalTxn not supported", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrder_UioF0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer orderID = 1;
        boolean twoPhase = true;
        try {
            OrderDataBean orderDataBean = directSLSBBean.completeOrder(orderID, twoPhase);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompleteOrder2_qxWm1() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer orderID = 2;
        boolean twoPhase = false;
        try {
            OrderDataBean orderDataBean = directSLSBBean.completeOrder(orderID, twoPhase);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_GkOh0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountDataBean accountDataBean = null;
        try {
            accountDataBean = directSLSBBean.login("uid1", "uid1");
            Assertions.assertEquals(accountDataBean.getProfileID(), "uid1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin2_pczB1() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountDataBean accountDataBean = null;
        try {
            accountDataBean = directSLSBBean.login("uid2", "uid2");
            Assertions.assertEquals(accountDataBean.getProfileID(), "uid2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfile_CAWy0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        try {
            directSLSBBean.updateAccountProfile(accountProfileDataBean);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getHoldingTest1_YiNO0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer holdingID = 1;
        try {
            directSLSBBean.getHolding(holdingID);
            directSLSBBean.setInSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getHoldingTest2_LYgR1() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        Integer holdingID = 2;
        try {
            directSLSBBean.getHolding(holdingID);
            directSLSBBean.setInSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void sellTest1_eEtw0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        Integer holdingID = 1;
        int orderProcessingMode = 1;
        try {
            OrderDataBean orderDataBean = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
            Assertions.assertNotNull(orderDataBean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void sellTest2_Iuxd1() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        Integer holdingID = 1;
        int orderProcessingMode = 2;
        try {
            OrderDataBean orderDataBean = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
            Assertions.assertNotNull(orderDataBean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void sellTest3_vkDF2() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        Integer holdingID = 2;
        int orderProcessingMode = 1;
        try {
            OrderDataBean orderDataBean = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
            Assertions.assertNotNull(orderDataBean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void sellTest4_GWiF3() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        Integer holdingID = 2;
        int orderProcessingMode = 2;
        try {
            OrderDataBean orderDataBean = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
            Assertions.assertNotNull(orderDataBean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void sellTest5_Vgaj4() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        Integer holdingID = 3;
        int orderProcessingMode = 1;
        try {
            OrderDataBean orderDataBean = directSLSBBean.sell(userID, holdingID, orderProcessingMode);
            Assertions.assertNotNull(orderDataBean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuy1_lceH0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        String symbol = "s1";
        double quantity = 100.0;
        int orderProcessingMode = 1;
        try {
            OrderDataBean orderDataBean = directSLSBBean.buy(userID, symbol, quantity, orderProcessingMode);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuy2_pkOE1_JJoX0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        String symbol = "s1";
        double quantity = 100.0;
        int orderProcessingMode = 1;
        try {
            directSLSBBean.setInSession(true);
            OrderDataBean orderDataBean = directSLSBBean.buy(userID, symbol, quantity, orderProcessingMode);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuy3_sXxc2_ZrUw0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        String symbol = "s1";
        double quantity = 100.0;
        int orderProcessingMode = 1;
        try {
            directSLSBBean.setInSession(true);
            OrderDataBean orderDataBean = directSLSBBean.buy(userID, symbol, quantity, orderProcessingMode);
            if (orderProcessingMode == TradeConfig.ASYNCH) {
                directSLSBBean.completeOrder(orderDataBean.getOrderID(), false);
            }
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuy4_TMRl3_vZxC0() throws java.lang.Exception {
        DirectSLSBBean directSLSBBean = new DirectSLSBBean();
        String userID = "uid1";
        String symbol = "s1";
        double quantity = 100.0;
        int orderProcessingMode = 1;
        try {
            directSLSBBean.setInSession(true);
            OrderDataBean orderDataBean = directSLSBBean.buy(userID, symbol, quantity, orderProcessingMode);
            if (orderProcessingMode == TradeConfig.ASYNCH) {
                directSLSBBean.completeOrderAsync(orderDataBean.getOrderID(), false);
            }
            return;
        } catch (Exception e) {
        }
    }
}