/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountDataBean_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLoginCount_nsVY0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        accountDataBean.setLoginCount(1);
        assertEquals(1, accountDataBean.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetLogoutCount_dEeq0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        accountDataBean.setLogoutCount(1);
        assertEquals(1, accountDataBean.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_1() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_2() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_3() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_4() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_5() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getHoldings());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_6() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_7() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_8() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_9() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_10() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getLastLogin());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_11() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0_12() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastLogin_qyxs0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        accountDataBean.setLastLogin(new Date());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrint_wFBH0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        accountDataBean.print();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLogoutCount_YaGe0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        assertEquals(1, accountDataBean.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldings_CKMt0_1() {
        AccountDataBean account = new AccountDataBean();
        Collection<HoldingDataBean> holdings = new ArrayList<>();
        HoldingDataBean holding1 = new HoldingDataBean();
        HoldingDataBean holding2 = new HoldingDataBean();
        holdings.add(holding1);
        holdings.add(holding2);
        account.setHoldings(holdings);
        assertNotNull(account.getHoldings());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldings_CKMt0_2() {
        AccountDataBean account = new AccountDataBean();
        Collection<HoldingDataBean> holdings = new ArrayList<>();
        HoldingDataBean holding1 = new HoldingDataBean();
        HoldingDataBean holding2 = new HoldingDataBean();
        holdings.add(holding1);
        holdings.add(holding2);
        account.setHoldings(holdings);
        assertEquals(2, account.getHoldings().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldings_CKMt0_3() {
        AccountDataBean account = new AccountDataBean();
        Collection<HoldingDataBean> holdings = new ArrayList<>();
        HoldingDataBean holding1 = new HoldingDataBean();
        HoldingDataBean holding2 = new HoldingDataBean();
        holdings.add(holding1);
        holdings.add(holding2);
        account.setHoldings(holdings);
        assertTrue(account.getHoldings().contains(holding1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldings_CKMt0_4() {
        AccountDataBean account = new AccountDataBean();
        Collection<HoldingDataBean> holdings = new ArrayList<>();
        HoldingDataBean holding1 = new HoldingDataBean();
        HoldingDataBean holding2 = new HoldingDataBean();
        holdings.add(holding1);
        holdings.add(holding2);
        account.setHoldings(holdings);
        assertTrue(account.getHoldings().contains(holding2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldings_XhTJ0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
        assertNotNull(holdings);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountID_htQi0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        accountDataBean.setAccountID(1);
        assertEquals(1, accountDataBean.getAccountID().intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDNull_xGXP1() {
        AccountDataBean accountDataBean = new AccountDataBean();
        accountDataBean.setAccountID(null);
        assertNull(accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountIDNegative_SjQe2() {
        AccountDataBean accountDataBean = new AccountDataBean();
        accountDataBean.setAccountID(-1);
        assertNotNull(accountDataBean.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTML_yfvT0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.0), "1");
        String expected = "<BR>Account Data for account: <B>1</B>" + "<LI>   loginCount:1</LI>" + "<LI>  logoutCount:2</LI>" + "<LI>    lastLogin:" + accountDataBean.getLastLogin() + "</LI>" + "<LI> creationDate:" + accountDataBean.getCreationDate() + "</LI>" + "<LI>      balance:1.0</LI>" + "<LI>  openBalance:2.0</LI>" + "<LI>    profileID:1</LI>";
        assertEquals(expected, accountDataBean.toHTML());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLoginCount_SewW0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), BigDecimal.ZERO, BigDecimal.ZERO, "1");
        assertEquals(1, accountDataBean.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetAccountID_HqBA0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        Integer accountID = accountDataBean.getAccountID();
        assertEquals(1, accountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetProfileID_CIKg0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "profileID");
        assertEquals("profileID", accountDataBean.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_XjxB0() {
        AccountDataBean accountDataBean = new AccountDataBean(123, 10, 5, new Date(), new Date(), new BigDecimal(100), new BigDecimal(50), "12345");
        String expected = "\n\tAccount Data for account: 123 \n\t\t   loginCount:10 \n\t\t  logoutCount:5 \n\t\t    lastLogin: sun.util.calendar.LocalGregorianCalendar@1 \n\t\t creationDate: sun.util.calendar.LocalGregorianCalendar@1 \n\t\t      balance: 100 \n\t\t  openBalance: 50 \n\t\t    profileID: 12345";
        assertEquals(expected, accountDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_knAc0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        boolean result = accountDataBean.equals(null);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_twEw1() {
        AccountDataBean accountDataBean = new AccountDataBean();
        boolean result = accountDataBean.equals(accountDataBean);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClass_llGp2() {
        AccountDataBean accountDataBean = new AccountDataBean();
        boolean result = accountDataBean.equals(new Object());
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameValues_Eomx3() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        AccountDataBean accountDataBean2 = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        boolean result = accountDataBean1.equals(accountDataBean2);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentValues_rKkz4() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        AccountDataBean accountDataBean2 = new AccountDataBean(2, 2, new Date(), new Date(), new BigDecimal(2), new BigDecimal(2), "2");
        boolean result = accountDataBean1.equals(accountDataBean2);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogout_AqaP0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        accountDataBean.logout();
        assertEquals(1, accountDataBean.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogoutWithNullObject_eBaK2() {
        AccountDataBean accountDataBean = null;
        accountDataBean.logout();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationDate_wZjk0() {
        AccountDataBean account = new AccountDataBean();
        Date creationDate = new Date();
        account.setCreationDate(creationDate);
        assertEquals(creationDate, account.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationDateNull_HJNA1() {
        AccountDataBean account = new AccountDataBean();
        account.setCreationDate(null);
        assertNull(account.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalance_Sxyn0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        BigDecimal openBalance = new BigDecimal(1000.00);
        accountDataBean.setOpenBalance(openBalance);
        assertEquals(openBalance, accountDataBean.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalanceWithNegativeBalance_YwJb1() {
        AccountDataBean accountDataBean = new AccountDataBean();
        BigDecimal openBalance = new BigDecimal(-1000.00);
        accountDataBean.setOpenBalance(openBalance);
        assertEquals(openBalance, accountDataBean.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalanceWithZeroBalance_QcxV2() {
        AccountDataBean accountDataBean = new AccountDataBean();
        BigDecimal openBalance = new BigDecimal(0.00);
        accountDataBean.setOpenBalance(openBalance);
        assertEquals(openBalance, accountDataBean.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfile_Xqcd0_1() {
        AccountDataBean account = new AccountDataBean();
        AccountProfileDataBean profile = new AccountProfileDataBean();
        account.setProfile(profile);
        assertNotNull(account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfile_Xqcd0_2() {
        AccountDataBean account = new AccountDataBean();
        AccountProfileDataBean profile = new AccountProfileDataBean();
        account.setProfile(profile);
        assertEquals(profile, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrders_vruu0_1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "profileID");
        Collection<OrderDataBean> orders = accountDataBean.getOrders();
        assertNotNull(orders);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrders_vruu0_2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "profileID");
        Collection<OrderDataBean> orders = accountDataBean.getOrders();
        assertTrue(orders.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastLogin_KwQH0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        assertEquals(new Date(), accountDataBean.getLastLogin());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrders_WDal0_1() {
        AccountDataBean account = new AccountDataBean();
        Collection<OrderDataBean> orders = new ArrayList<>();
        OrderDataBean order1 = new OrderDataBean();
        OrderDataBean order2 = new OrderDataBean();
        orders.add(order1);
        orders.add(order2);
        account.setOrders(orders);
        assertNotNull(account.getOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrders_WDal0_2() {
        AccountDataBean account = new AccountDataBean();
        Collection<OrderDataBean> orders = new ArrayList<>();
        OrderDataBean order1 = new OrderDataBean();
        OrderDataBean order2 = new OrderDataBean();
        orders.add(order1);
        orders.add(order2);
        account.setOrders(orders);
        assertEquals(2, account.getOrders().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrders_WDal0_3() {
        AccountDataBean account = new AccountDataBean();
        Collection<OrderDataBean> orders = new ArrayList<>();
        OrderDataBean order1 = new OrderDataBean();
        OrderDataBean order2 = new OrderDataBean();
        orders.add(order1);
        orders.add(order2);
        account.setOrders(orders);
        assertTrue(account.getOrders().contains(order1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrders_WDal0_4() {
        AccountDataBean account = new AccountDataBean();
        Collection<OrderDataBean> orders = new ArrayList<>();
        OrderDataBean order1 = new OrderDataBean();
        OrderDataBean order2 = new OrderDataBean();
        orders.add(order1);
        orders.add(order2);
        account.setOrders(orders);
        assertTrue(account.getOrders().contains(order2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetProfileID_ilFx0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        accountDataBean.setProfileID("profileID");
        assertEquals("profileID", accountDataBean.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_aemA0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertNotNull(profile);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalance_jkov0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        accountDataBean.setBalance(new BigDecimal(100));
        assertEquals(new BigDecimal(100), accountDataBean.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testgetOpenBalance_jBUn0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "1");
        assertEquals(new BigDecimal(100), accountDataBean.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBalance_owOV0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        BigDecimal balance = accountDataBean.getBalance();
        assertEquals(null, balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCreationDate_CDxx0_Jvof0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        Date creationDate = accountDataBean.getCreationDate();
        Assertions.assertNotNull(creationDate, "Creation date should not be null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_XGFf0() {
        AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
        assertNotNull(accountDataBean);
        assertNotNull(accountDataBean.getCreationDate());
        assertNotNull(accountDataBean.getProfileID());
        assertNotNull(accountDataBean.getOrders());
        assertNotNull(accountDataBean.getHoldings());
        assertNotNull(accountDataBean.getAccountID());
        assertNotNull(accountDataBean.getProfile());
        assertNotNull(accountDataBean.getOpenBalance());
        assertNotNull(accountDataBean.getBalance());
        assertNotNull(accountDataBean.getLastLogin());
        assertNotNull(accountDataBean.getLogoutCount());
        assertNotNull(accountDataBean.getLoginCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldings_CKMt0() {
        AccountDataBean account = new AccountDataBean();
        Collection<HoldingDataBean> holdings = new ArrayList<>();
        HoldingDataBean holding1 = new HoldingDataBean();
        HoldingDataBean holding2 = new HoldingDataBean();
        holdings.add(holding1);
        holdings.add(holding2);
        account.setHoldings(holdings);
        assertNotNull(account.getHoldings());
        assertEquals(2, account.getHoldings().size());
        assertTrue(account.getHoldings().contains(holding1));
        assertTrue(account.getHoldings().contains(holding2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfile_Xqcd0() {
        AccountDataBean account = new AccountDataBean();
        AccountProfileDataBean profile = new AccountProfileDataBean();
        account.setProfile(profile);
        assertNotNull(account.getProfile());
        assertEquals(profile, account.getProfile());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrders_vruu0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "profileID");
        Collection<OrderDataBean> orders = accountDataBean.getOrders();
        assertNotNull(orders);
        assertTrue(orders.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOrders_WDal0() {
        AccountDataBean account = new AccountDataBean();
        Collection<OrderDataBean> orders = new ArrayList<>();
        OrderDataBean order1 = new OrderDataBean();
        OrderDataBean order2 = new OrderDataBean();
        orders.add(order1);
        orders.add(order2);
        account.setOrders(orders);
        assertNotNull(account.getOrders());
        assertEquals(2, account.getOrders().size());
        assertTrue(account.getOrders().contains(order1));
        assertTrue(account.getOrders().contains(order2));
    }
}