/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.ejb.EJBException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountDataBean_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_BfJH0_2() {
        AccountDataBean result = AccountDataBean.getRandomInstance();
        assertEquals(29608, result.getAccountID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_BfJH0_2_fid1() {
        AccountDataBean result = AccountDataBean.getRandomInstance();
        assertEquals(100000, result.getAccountID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_BfJH0_3_fid1() {
        AccountDataBean result = AccountDataBean.getRandomInstance();
        assertEquals(10000, result.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_BfJH0_4() {
        AccountDataBean result = AccountDataBean.getRandomInstance();
        assertEquals(10000, result.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_BfJH0_6() {
        AccountDataBean result = AccountDataBean.getRandomInstance();
        assertEquals(new Date(Integer.MAX_VALUE), result.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_BfJH0_7() {
        AccountDataBean result = AccountDataBean.getRandomInstance();
        assertEquals(new BigDecimal("1000000.0"), result.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_BfJH0_8() {
        AccountDataBean result = AccountDataBean.getRandomInstance();
        assertEquals(new BigDecimal("1000000.0"), result.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_BfJH0_9() {
        AccountDataBean result = AccountDataBean.getRandomInstance();
        assertEquals(TradeConfig.rndUserID(), result.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginValidPassword_xlLs0_1() {
        AccountDataBean account = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        account.getProfile().setPassword("password");
        account.login("password");
        assertEquals(1, account.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginValidPassword_xlLs0_2() {
        AccountDataBean account = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        account.getProfile().setPassword("password");
        account.login("password");
        assertEquals(new Timestamp(System.currentTimeMillis()), account.getLastLogin());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginInvalidPassword_hFrq1() {
        AccountDataBean account = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        account.getProfile().setPassword("wrongPassword");
        try {
            account.login("wrongPassword");
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginNullPassword_yQIR3() {
        AccountDataBean account = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        account.getProfile().setPassword(null);
        try {
            account.login("password");
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrders_zCzQ0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        Collection<OrderDataBean> orders = accountDataBean.getOrders();
        Assertions.assertNotNull(orders);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_bJYn0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "profileID");
        AccountProfileDataBean result = accountDataBean.getProfile();
        assertEquals(AccountProfileDataBean.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_BfJH0() {
        AccountDataBean result = AccountDataBean.getRandomInstance();
        assertNotNull(result);
        assertEquals(100000, result.getAccountID().intValue());
        assertEquals(10000, result.getLoginCount());
        assertEquals(10000, result.getLogoutCount());
        assertEquals(new Date(), result.getLastLogin());
        assertEquals(new Date(Integer.MAX_VALUE), result.getCreationDate());
        assertEquals(new BigDecimal("1000000.0"), result.getBalance());
        assertEquals(new BigDecimal("1000000.0"), result.getOpenBalance());
        assertEquals(TradeConfig.rndUserID(), result.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginValidPassword_xlLs0() {
        AccountDataBean account = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        account.getProfile().setPassword("password");
        account.login("password");
        assertEquals(1, account.getLoginCount());
        assertEquals(new Timestamp(System.currentTimeMillis()), account.getLastLogin());
    }
}