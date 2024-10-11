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
    public void testSetLoginCount_YhuZ0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setLoginCount(10);
        assertEquals(10, account.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLoginCountWithZeroValue_DNVA1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setLoginCount(0);
        assertEquals(0, account.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLoginCountWithNegativeValue_ZhWx2() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(1 - 1 - 1. - 1 - 1), new BigDecimal(5 - 1. - 1 - 1), "profile1");
        account.setLoginCount(-1);
        assertEquals(-1, account.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLoginCountWithMaximumValue_KHVq3() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setLoginCount(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, account.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_Mwfz0_1() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_iVmj1() {
        AccountDataBean accountDataBean1 = new AccountDataBean();
        AccountDataBean accountDataBean2 = new AccountDataBean();
        assertEquals(accountDataBean1.hashCode(), accountDataBean2.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLogoutCount_nKIC3() {
        AccountDataBean accountDataBean = new AccountDataBean();
        int logoutCount = accountDataBean.getLogoutCount();
        assertTrue(logoutCount >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLoginCount_Frri5() {
        AccountDataBean accountDataBean = new AccountDataBean();
        int loginCount = accountDataBean.getLoginCount();
        assertTrue(loginCount >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCount_RdfK0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profileID");
        accountDataBean.setLogoutCount(2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCountWithZeroValue_Xaug1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profileID");
        accountDataBean.setLogoutCount(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCountWithNegativeValue_eXvB2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profileID");
        accountDataBean.setLogoutCount(-1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCountWithMaximumValue_BBtH3() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profileID");
        accountDataBean.setLogoutCount(Integer.MAX_VALUE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCountWithMinimumValue_QidL4() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profileID");
        accountDataBean.setLogoutCount(Integer.MIN_VALUE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastLogin_vqLM0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        Date lastLogin = new Date();
        account.setLastLogin(lastLogin);
        assertEquals(lastLogin, account.getLastLogin());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastLoginNull_AjkG1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setLastLogin(null);
        assertEquals(null, account.getLastLogin());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastLoginCoverage_TmcC2() {
        AccountDataBean account = new AccountDataBean();
        account.setLastLogin(new Date());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullPassword_MeOM2() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "profileID");
        boolean exceptionThrown = false;
        try {
            account.login(null);
        } catch (EJBException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithEmptyPassword_SKRl3() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "profileID");
        boolean exceptionThrown = false;
        try {
            account.login("");
        } catch (EJBException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullProfile_PwTU4() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), null);
        boolean exceptionThrown = false;
        try {
            account.login("password");
        } catch (EJBException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithEmptyProfile_NnLF5() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "");
        boolean exceptionThrown = false;
        try {
            account.login("password");
        } catch (EJBException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullPasswordAndProfile_Ahbx6() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), null);
        boolean exceptionThrown = false;
        try {
            account.login(null);
        } catch (EJBException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithEmptyPasswordAndProfile_ZqrD7() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "");
        boolean exceptionThrown = false;
        try {
            account.login("");
        } catch (EJBException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithAccountID_Uytb0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        int expectedHash = 1;
        int actualHash = account.hashCode();
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithoutAccountID_PBBU1() {
        AccountDataBean account = new AccountDataBean(2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        int expectedHash = 0;
        int actualHash = account.hashCode();
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsNull_SQPj1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "123456");
        accountDataBean.setHoldings(null);
        assertEquals(null, accountDataBean.getHoldings());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsCoverage_VrSz2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "123456");
        accountDataBean.setHoldings(null);
        accountDataBean.setHoldings(accountDataBean.getHoldings());
        accountDataBean.setHoldings(new ArrayList<>());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreationDate_KqGU0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        assertEquals(account.getCreationDate(), new Date());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreationDateWithNoParameters_PFxz1() {
        AccountDataBean account = new AccountDataBean();
        assertEquals(account.getCreationDate(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLogoutCount_jNcV0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        assertEquals(3, account.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTML_hktP0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 10, 5, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        String html = accountDataBean.toHTML();
        System.out.println(html);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithNoData_zLYr2() {
        AccountDataBean accountDataBean = new AccountDataBean();
        String html = accountDataBean.toHTML();
        System.out.println(html);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithInvalidData_NHIF5() {
        AccountDataBean accountDataBean = new AccountDataBean(-1, -10, -5, new Date(0), new Date(0), new BigDecimal(-100.00), new BigDecimal(-50.00), "invalidProfile");
        String html = accountDataBean.toHTML();
        System.out.println(html);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithZeroData_BhwD6() {
        AccountDataBean accountDataBean = new AccountDataBean(0, 0, 0, new Date(0), new Date(0), new BigDecimal(0.00), new BigDecimal(0.00), "profile0");
        String html = accountDataBean.toHTML();
        System.out.println(html);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithNegativeData_ZSQx7() {
        AccountDataBean accountDataBean = new AccountDataBean(-1, -10, -5, new Date(0), new Date(0), new BigDecimal(-100.00), new BigDecimal(-50.00), "profile-1");
        String html = accountDataBean.toHTML();
        System.out.println(html);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldings_HktE0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingsNull_GxWx1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        accountDataBean.setHoldings(null);
        Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
        assertNull(holdings);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldingsEmpty_urxE2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        accountDataBean.setHoldings(new ArrayList<HoldingDataBean>());
        Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
        assertTrue(holdings.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountID_gIdO0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        accountDataBean.setAccountID(1);
        assertEquals(1, accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDWithNull_GkRg1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        accountDataBean.setAccountID(null);
        assertEquals(null, accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDWithNegativeValue_Vthh2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        accountDataBean.setAccountID(-1);
        assertEquals(-1, accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDWithZeroValue_YHMk3() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        accountDataBean.setAccountID(0);
        assertEquals(0, accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDWithPositiveValue_VqWM4() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile1");
        accountDataBean.setAccountID(10);
        assertEquals(10, accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLoginCount_Zdub0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 10, 5, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile123");
        int loginCount = accountDataBean.getLoginCount();
        assertEquals(10, loginCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLoginCount_zero_GoFJ1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 0, 5, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile123");
        int loginCount = accountDataBean.getLoginCount();
        assertEquals(0, loginCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLoginCount_negative_RIhr2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, -10, 5, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile123");
        int loginCount = accountDataBean.getLoginCount();
        assertEquals(-10, loginCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_FBhd0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profileID");
        Integer expected = 1;
        Integer actual = accountDataBean.getAccountID();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountIDWithNoArguments_IBBx1() {
        AccountDataBean accountDataBean = new AccountDataBean();
        Integer expected = null;
        Integer actual = accountDataBean.getAccountID();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountIDWithSomeArguments_Ndig3() {
        AccountDataBean accountDataBean = new AccountDataBean(2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profileID");
        Integer expected = null;
        Integer actual = accountDataBean.getAccountID();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_OEjy0() {
        AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.logout();
        assertEquals(2, account.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalance_szYs0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "12345");
        accountDataBean.setOpenBalance(new BigDecimal(100.0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalanceWithNull_efkt1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), null, "12345");
        accountDataBean.setOpenBalance(new BigDecimal(100.0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalanceWithZero_iYBA2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(0.0), "12345");
        accountDataBean.setOpenBalance(new BigDecimal(100.0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileID_bgiB0() {
        AccountDataBean account = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "12345");
        assertEquals("12345", account.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileIDWithNullProfileID_PwsN1() {
        AccountDataBean account = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), null);
        assertEquals(null, account.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationDate_oacp0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        Date creationDate = new Date();
        account.setCreationDate(creationDate);
        assertEquals(creationDate, account.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileID_LZtS0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile123");
        accountDataBean.setProfileID("newProfileID");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileIDNull_pNQZ1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile123");
        accountDataBean.setProfileID(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileIDEmpty_aIXB2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(50.0), "profile123");
        accountDataBean.setProfileID("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfile_KvjI0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        AccountProfileDataBean profile = new AccountProfileDataBean("1", "2", "3", "4", "5", "6");
        account.setProfile(profile);
        assertEquals(profile, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileNull_Gahj1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        account.setProfile(null);
        assertEquals(null, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileCoverage_hnqE2() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "1");
        account.setProfile(account.getProfile());
        account.setProfile(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrdersWithNull_DpSi1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "12345");
        accountDataBean.setOrders(null);
        assertEquals(null, accountDataBean.getOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrders_ywek0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        Collection<OrderDataBean> orders = account.getOrders();
        assertEquals(orders, account.getOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastLogin_DCcK0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile123");
        Date expected = new Date();
        Date actual = account.getLastLogin();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastLoginWithNullLastLogin_LTiy1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, null, new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile123");
        Date expected = null;
        Date actual = account.getLastLogin();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBalance_uQUP0() {
        AccountDataBean account = new AccountDataBean(1, 10, 5, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        assertEquals(new BigDecimal(100.00), account.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBalanceWithZeroBalance_EvMq1() {
        AccountDataBean account = new AccountDataBean(2, 0, 0, new Date(), new Date(), new BigDecimal(0.00), new BigDecimal(0.00), "profile2");
        assertEquals(new BigDecimal(0.00), account.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBalanceWithNegativeBalance_bDyp2() {
        AccountDataBean account = new AccountDataBean(3, 5, 3, new Date(), new Date(), new BigDecimal(-50.00), new BigDecimal(-100.00), "profile3");
        assertEquals(new BigDecimal(-50.00), account.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_DRgx0() {
        AccountDataBean account = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "12345");
        AccountProfileDataBean profile = account.getProfile();
        assertEquals(profile, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileWithNullProfile_NgoU1() {
        AccountDataBean account = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), null);
        assertEquals(null, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenBalance_dHTK0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        BigDecimal balance = account.getOpenBalance();
        assertEquals(new BigDecimal(50.00), balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenBalanceWithZeroBalance_wVPM1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(0.00), new BigDecimal(0.00), "profile1");
        BigDecimal balance = account.getOpenBalance();
        assertEquals(new BigDecimal(0.00), balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenBalanceWithNegativeBalance_TqPW2() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(-100.00), new BigDecimal(-50.00), "profile1");
        BigDecimal balance = account.getOpenBalance();
        assertEquals(new BigDecimal(-50.00), balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalance_PXuJ0() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setBalance(new BigDecimal(200.00));
        assertEquals(new BigDecimal(200.00), account.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalanceWithNullBalance_hSYW1() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setBalance(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalanceWithZeroBalance_PhvI2() {
        AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
        account.setBalance(new BigDecimal(0.00));
        assertEquals(new BigDecimal(0.00), account.getBalance());
    }
}