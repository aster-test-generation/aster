/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.ejb.EJBException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountDataBean_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLoginCount_VgJe0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        account.setLoginCount(10);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLoginCountWithCoverage_gnre1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        account.setLoginCount(10);
        account.setLoginCount(100);
        account.setLoginCount(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_wgpJ0_1() {
        AccountDataBean account = AccountDataBean.getRandomInstance();
        assertNotNull(account);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ILeN1() {
        AccountDataBean account1 = new AccountDataBean();
        AccountDataBean account2 = new AccountDataBean();
        assertEquals(account1.hashCode(), account2.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLogoutCount_kFxg3() {
        AccountDataBean account = new AccountDataBean();
        int logoutCount = account.getLogoutCount();
        assertTrue(logoutCount >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLoginCount_rWuN5() {
        AccountDataBean account = new AccountDataBean();
        int loginCount = account.getLoginCount();
        assertTrue(loginCount >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCount_Ntqi0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setLogoutCount(4);
        assertEquals(4, account.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastLogin_Bxsj0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        Date lastLogin = new Date();
        account.setLastLogin(lastLogin);
        assertEquals(lastLogin, account.getLastLogin());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastLoginNull_BHUs1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setLastLogin(null);
        assertEquals(null, account.getLastLogin());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithIncorrectPassword_iQdT1() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
        try {
            account.login(" incorrectPassword");
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginNullPassword_xhCe2() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
        try {
            account.login(null);
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginEmptyPassword_XHsA3() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
        try {
            account.login("");
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginNullProfile_TpJk4() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), null);
        try {
            account.login("password");
            fail("Expected EJBException");
        } catch (EJBException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithAccountID_fOdJ0() {
        AccountDataBean account = new AccountDataBean(123, 0, 0, null, null, null, null, null);
        int expected = 123;
        int actual = account.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithoutAccountID_RUwS1() {
        AccountDataBean account = new AccountDataBean(null, 0, 0, null, null, null, null, null);
        int expected = 0;
        int actual = account.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreationDate_pyuy0_1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "12345");
        Date creationDate = accountDataBean.getCreationDate();
        assertNotNull(creationDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreationDate_pyuy0_2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "12345");
        Date creationDate = accountDataBean.getCreationDate();
        assertEquals(new Date(), creationDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLogoutCount_aWtK0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "12345");
        int logoutCount = accountDataBean.getLogoutCount();
        assertEquals(3, logoutCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLogoutCountWithZeroLogoutCount_XYqj1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 0, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "12345");
        int logoutCount = accountDataBean.getLogoutCount();
        assertEquals(0, logoutCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLogoutCountWithNegativeLogoutCount_zHtH2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, -1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "12345");
        int logoutCount = accountDataBean.getLogoutCount();
        assertEquals(-1, logoutCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldings_pSnN0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "1");
        Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingsNull_nIFv1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "1");
        accountDataBean.setHoldings(null);
        Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
        assertNull(holdings);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingsCoverage_pKhA2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "1");
        accountDataBean.getHoldings();
        accountDataBean.setHoldings(null);
        accountDataBean.getHoldings();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountID_yNlN0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        accountDataBean.setAccountID(10);
        assertEquals(10, accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDWithNull_OaGF1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        accountDataBean.setAccountID(null);
        assertEquals(null, accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDWithNegativeValue_WjNM2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        accountDataBean.setAccountID(-1);
        assertEquals(-1, accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLoginCount_NFug0() {
        AccountDataBean account = new AccountDataBean(1, 10, 5, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        assertEquals(10, account.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLoginCountWithNoArguments_LUKh1() {
        AccountDataBean account = new AccountDataBean();
        assertEquals(0, account.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_jILY0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(200.0), "profileID");
        Integer accountID = accountDataBean.getAccountID();
        assertEquals(new Integer(1), accountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountIDWithNull_Pxwb1() {
        AccountDataBean accountDataBean = new AccountDataBean();
        Integer accountID = accountDataBean.getAccountID();
        assertNull(accountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountIDWithNegativeValue_NQZS2() {
        AccountDataBean accountDataBean = new AccountDataBean(-1, 2, 3, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(200.0), "profileID");
        Integer accountID = accountDataBean.getAccountID();
        assertEquals(new Integer(-1), accountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_xbOM0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.logout();
        assertEquals(4, account.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogoutCoverage_SOtT1() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(110.00), new BigDecimal(50.00), "profile1");
        account.logout();
        account.logout();
        account.logout();
        account.logout();
        account.logout();
        account.logout();
        account.logout();
        account.logout();
        account.logout();
        account.logout();
        assertEquals(11, account.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalance_misq0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setOpenBalance(new BigDecimal(150.00));
        assertEquals(new BigDecimal(150.00), account.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalanceNull_NjXY1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setOpenBalance(null);
        assertEquals(null, account.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalanceZero_kKAD2() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setOpenBalance(new BigDecimal(0.00));
        assertEquals(new BigDecimal(0.00), account.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalanceNegative_NhJv3() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setOpenBalance(new BigDecimal(-100.00));
        assertEquals(new BigDecimal(-100.00), account.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileID_LwgV0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "123456789");
        assertEquals("123456789", account.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDWithNullProfileID_CHbw1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), null);
        assertEquals(null, account.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDWithEmptyProfileID_MrkX2() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "");
        assertEquals("", account.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationDate_RnvE0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        Date creationDate = new Date();
        account.setCreationDate(creationDate);
        assertEquals(creationDate, account.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationDateNull_rWWI1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setCreationDate(null);
        assertEquals(null, account.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationDateMaxDate_XwMu2() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setCreationDate(new Date(Long.MAX_VALUE));
        assertEquals(new Date(Long.MAX_VALUE), account.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationDateMinDate_LSdm3() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setCreationDate(new Date(Long.MIN_VALUE));
        assertEquals(new Date(Long.MIN_VALUE), account.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileID_avVy0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profileID");
        accountDataBean.setProfileID("newProfileID");
        assertEquals("newProfileID", accountDataBean.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileIDNull_POaD1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profileID");
        accountDataBean.setProfileID(null);
        assertEquals(null, accountDataBean.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileIDEmpty_Mrvk2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profileID");
        accountDataBean.setProfileID("");
        assertEquals("", accountDataBean.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfile_vVkY0() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        AccountProfileDataBean profile = new AccountProfileDataBean("1", "1", "1", "1", "1", "1");
        account.setProfile(profile);
        assertEquals(profile, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileNull_QyAe1() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        account.setProfile(null);
        assertEquals(null, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileCoverage_WFWX2() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        AccountProfileDataBean profile = new AccountProfileDataBean("1", "1", "1", "1", "1", "1");
        account.setProfile(profile);
        account.setProfile(null);
        account.getProfile();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrdersWithNull_CpWc1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setOrders(null);
        assertEquals(null, account.getOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrders_MCzw0() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        Collection<OrderDataBean> orders = account.getOrders();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrdersWithNoOrders_KIui1() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        Collection<OrderDataBean> orders = account.getOrders();
        if (orders == null) {
            orders = new ArrayList<>();
        }
        assertTrue(orders.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastLogin_VrVt0() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "12345");
        Date expected = new Date();
        Date actual = account.getLastLogin();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastLoginWithNullLastLogin_XSkn1() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, null, new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "12345");
        Date expected = null;
        Date actual = account.getLastLogin();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastLoginWithEmptyLastLogin_xNuB2() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "12345");
        account.setLastLogin(null);
        Date expected = null;
        Date actual = account.getLastLogin();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBalance_Qiqk0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        BigDecimal balance = account.getBalance();
        assertEquals(new BigDecimal(100.00), balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBalanceWithZeroBalance_CJPL1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(0.00), new BigDecimal(50.00), "profile1");
        BigDecimal balance = account.getBalance();
        assertEquals(new BigDecimal(0.00), balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBalanceWithNegativeBalance_coNT2() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(-100.00), new BigDecimal(50.00), "profile1");
        BigDecimal balance = account.getBalance();
        assertEquals(new BigDecimal(-100.00), balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_TDFu0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        AccountProfileDataBean profile = new AccountProfileDataBean();
        account.setProfile(profile);
        assertEquals(profile, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileNull_opiA1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        assertEquals(null, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileNull_aDtq3() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        account.setProfile(null);
        assertEquals(null, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenBalance_TSnl0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        BigDecimal openBalance = accountDataBean.getOpenBalance();
        assertEquals(new BigDecimal(50.00), openBalance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalance_Axqa0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setBalance(new BigDecimal(200.00));
        assertEquals(new BigDecimal(200.00), account.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalanceWithZeroBalance_aDZz1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(0.00), new BigDecimal(50.00), "profile1");
        account.setBalance(new BigDecimal(0.00));
        assertEquals(new BigDecimal(0.00), account.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalanceWithNegativeBalance_numv2() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(-100.00), new BigDecimal(50.00), "profile1");
        account.setBalance(new BigDecimal(-200.00));
        assertEquals(new BigDecimal(-200.00), account.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreationDate_pyuy0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "12345");
        Date creationDate = accountDataBean.getCreationDate();
        assertNotNull(creationDate);
        assertEquals(new Date(), creationDate);
    }
}