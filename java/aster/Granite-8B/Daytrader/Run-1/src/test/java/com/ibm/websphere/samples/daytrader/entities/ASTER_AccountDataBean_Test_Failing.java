/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountDataBean_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreationDate_bvjl1() {
        AccountDataBean account = new AccountDataBean();
        Date creationDate = account.getCreationDate();
        assertNull(new Date());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastLogin_EFgR8() {
        AccountDataBean account = new AccountDataBean();
        Date lastLogin = account.getLastLogin();
        assertNull(new Date());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBalance_jQXe9() {
        AccountDataBean account = new AccountDataBean();
        BigDecimal balance = account.getBalance();
        assertNotNull(balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenBalance_QlGg11() {
        AccountDataBean account = new AccountDataBean();
        BigDecimal openBalance = account.getOpenBalance();
        assertNotNull(openBalance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_gtWK0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        Integer expectedAccountID = 1;
        Integer actualAccountID = accountDataBean.getAccountID();
        assertNull(expectedAccountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_NegativeValues_GwhK3() {
        AccountDataBean accountDataBean = new AccountDataBean(-1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        Integer expectedAccountID = -1;
        Integer actualAccountID = accountDataBean.getAccountID();
        assertNull(expectedAccountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_OutofRangeValues_kDwu4() {
        AccountDataBean accountDataBean = new AccountDataBean(1000000000, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        Integer expectedAccountID = 1000000000;
        Integer actualAccountID = accountDataBean.getAccountID();
        assertNull(expectedAccountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_TXAD0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(1), new BigDecimal(2), "profileID");
        String expected = "\n\tAccount Data for account: 1\n\t\t   loginCount:2\n\t\t  logoutCount:2\n\t\t    lastLogin: sun.util.calendar.LocalGregorianCalendar@1111111\n\t\t creationDate: sun.util.calendar.LocalGregorianCalendar@2222222\n\t\t      balance: 1.00\n\t\t  openBalance: 2.00\n\t\t    profileID: profileID";
        assertEquals(expected, accountDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBalance_qZtP0() throws Exception {
        AccountDataBean accountDataBean = new AccountDataBean();
        BigDecimal balance = accountDataBean.getBalance();
        assertNotNull(balance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_HWWq0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertNotNull(profile);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreationDate_bvjl1_fid1() {
        AccountDataBean account = new AccountDataBean();
        Date creationDate = account.getCreationDate();
        assertEquals(new Date(), creationDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHoldings_xmgP3_fid1() {
        AccountDataBean account = new AccountDataBean();
        Collection<HoldingDataBean> holdings = account.getHoldings();
        assertNotNull(holdings);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_Qtdt5_fid1() {
        AccountDataBean account = new AccountDataBean();
        Integer accountID = account.getAccountID();
        assertNotNull(accountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileID_bcih6_fid1() {
        AccountDataBean account = new AccountDataBean();
        String profileID = account.getProfileID();
        assertNotNull(profileID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrders_bMQF7_fid1() {
        AccountDataBean account = new AccountDataBean();
        Collection<OrderDataBean> orders = account.getOrders();
        assertNotNull(orders);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastLogin_EFgR8_fid1() {
        AccountDataBean account = new AccountDataBean();
        Date lastLogin = account.getLastLogin();
        assertEquals(new Date(), lastLogin);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_cqCK10_fid1() {
        AccountDataBean account = new AccountDataBean();
        AccountProfileDataBean profile = account.getProfile();
        assertNotNull(profile);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetHoldings_Tpue0_fid1() {
        AccountDataBean accountDataBean = new AccountDataBean();
        accountDataBean.setHoldings(null);
        Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
        assertNotNull(holdings);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_gtWK0_fid1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        Integer expectedAccountID = 1;
        Integer actualAccountID = accountDataBean.getAccountID();
        assertEquals(expectedAccountID, actualAccountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_NegativeValues_GwhK3_fid1() {
        AccountDataBean accountDataBean = new AccountDataBean(-1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        Integer expectedAccountID = -1;
        Integer actualAccountID = accountDataBean.getAccountID();
        assertEquals(expectedAccountID, actualAccountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_OutofRangeValues_kDwu4_fid1() {
        AccountDataBean accountDataBean = new AccountDataBean(1000000000, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        Integer expectedAccountID = 1000000000;
        Integer actualAccountID = accountDataBean.getAccountID();
        assertEquals(expectedAccountID, actualAccountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentValues_AwUc4_fid1() {
        AccountDataBean accountDataBean1 = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        AccountDataBean accountDataBean2 = new AccountDataBean(2, 2, new Date(), new Date(), new BigDecimal(2), new BigDecimal(2), "2");
        boolean result = accountDataBean1.equals(accountDataBean2);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOrders_xaaD0_fid1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "1");
        Collection<OrderDataBean> orders = accountDataBean.getOrders();
        assertNotNull(orders);
    }
}