/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import javax.ejb.EJBException;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountDataBean_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0() {
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
public void testLoginValidPassword_iJmY0() {
    AccountDataBean account = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    account.getProfile().setPassword("password");
    account.login("password");
    assertEquals(1, account.getLoginCount());
    assertEquals(new Timestamp(System.currentTimeMillis()), account.getLastLogin());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLoginInvalidPassword_gsLq1() {
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
public void testLoginNullPassword_nuMB3() {
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
public void testGetHoldings_uMVO0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
    assertEquals(0, holdings.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTMLWithoutAccountID_PMvi1() {
        AccountDataBean accountDataBean = new AccountDataBean(0, 10, 5, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        String result = accountDataBean.toHTML();
        assertEquals("<BR>Account Data for account: <B></B><LI>   loginCount:10</LI><LI>  logoutCount:5</LI><LI>    lastLogin:" + accountDataBean.getLastLogin() + "</LI><LI> creationDate:" + accountDataBean.getCreationDate() + "</LI><LI>      balance:100.0</LI><LI>  openBalance:100.0</LI><LI>    profileID:profileID</LI>", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentFields_vScs4() {
    AccountDataBean bean1 = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("1"), new BigDecimal("1"), "1");
    AccountDataBean bean2 = new AccountDataBean(1, 2, 1, new Date(), new Date(), new BigDecimal("1"), new BigDecimal("1"), "1");
    boolean result = bean1.equals(bean2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrders_YgTz1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
    Collection<OrderDataBean> orders = accountDataBean.getOrders();
    Assertions.assertNotNull(orders);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertNotNull(profile);
        assertEquals("getCreditCard", profile.getCreditCard());
        assertEquals("getEmail", profile.getEmail());
        assertEquals("getUserID", profile.getUserID());
        assertEquals(0, profile.hashCode());
        assertEquals("getAddress", profile.getAddress());
        assertEquals("getPassword", profile.getPassword());
        assertEquals("getFullName", profile.getFullName());
        assertEquals("getAccount", profile.getAccount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_2_fid2() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
    assertEquals(100000, result.getAccountID().intValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_3() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
    assertEquals(10000, result.getLoginCount());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_4() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
    assertEquals(10000, result.getLogoutCount());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_6() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
    assertEquals(new Date(Integer.MAX_VALUE), result.getCreationDate());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_7() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
    assertEquals(new BigDecimal("1000000.0"), result.getBalance());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_8() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
    assertEquals(new BigDecimal("1000000.0"), result.getOpenBalance());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_9() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
    assertEquals(TradeConfig.rndUserID(), result.getProfileID());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLoginValidPassword_iJmY0_1() {
    AccountDataBean account = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    account.getProfile().setPassword("password");
    account.login("password");
    assertEquals(1, account.getLoginCount());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLoginValidPassword_iJmY0_2() {
    AccountDataBean account = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    account.getProfile().setPassword("password");
    account.login("password");
    assertEquals(new Timestamp(System.currentTimeMillis()), account.getLastLogin());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0_1() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertNotNull(profile);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0_2() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertEquals("getCreditCard", profile.getCreditCard());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0_3() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertEquals("getEmail", profile.getEmail());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0_4() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertEquals("getUserID", profile.getUserID());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0_5() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertEquals(0, profile.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0_6() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertEquals("getAddress", profile.getAddress());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0_7() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertEquals("getPassword", profile.getPassword());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0_8() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertEquals("getFullName", profile.getFullName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfile_LzxD0_9() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        AccountProfileDataBean profile = accountDataBean.getProfile();
        assertEquals("getAccount", profile.getAccount());}
}