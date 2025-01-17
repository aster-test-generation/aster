/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.ejb.EJBException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountDataBean_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLoginCount_ofRs1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, null);
    accountDataBean.setLoginCount(10);
    assertEquals(10, accountDataBean.getLoginCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_1() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_2() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLogoutCount_YMhJ1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, null);
    accountDataBean.setLogoutCount(5);
    assertEquals(5, accountDataBean.getLogoutCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastLogin_iuTB0() {
    AccountDataBean accountDataBean = new AccountDataBean();
    Date lastLogin = new Date();
    accountDataBean.setLastLogin(lastLogin);
    assertEquals(lastLogin, accountDataBean.getLastLogin());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_AccountIDNull_mVHi1() {
    AccountDataBean bean = new AccountDataBean(null, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    int hash = bean.hashCode();
    assertEquals(hash, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreationDate_YCVY0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "profileID");
    Date creationDate = accountDataBean.getCreationDate();
    assertEquals(new Date(), creationDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLoginNullProfile_aYsx2() {
    AccountDataBean account = new AccountDataBean(null, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, null);
    try {
        account.login("password");
        fail("Expected EJBException");
    } catch (EJBException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldings_qCee0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
        Collection<HoldingDataBean> holdings = new ArrayList<>();
        HoldingDataBean holdingDataBean = new HoldingDataBean();
        holdings.add(holdingDataBean);
        accountDataBean.setHoldings(holdings);
        assert accountDataBean.getHoldings().equals(holdings);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLogoutCount_AviY0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 10, 5, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    int logoutCount = accountDataBean.getLogoutCount();
    assertEquals(5, logoutCount);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccountID_yUqb1() {
    AccountDataBean accountDataBean = new AccountDataBean();
    accountDataBean.setAccountID(1);
    assertEquals(1, accountDataBean.getAccountID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLoginCount_YsRx0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 10, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    int loginCount = accountDataBean.getLoginCount();
    assertEquals(10, loginCount);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccountID2_BRtN1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    Integer accountID = accountDataBean.getAccountID();
    assertEquals(Integer.valueOf(1), accountID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTML_lyXg0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 10, 5, new java.util.Date(), new java.util.Date(), new java.math.BigDecimal("100.0"), new java.math.BigDecimal("100.0"), "profileID");
        String result = accountDataBean.toHTML();
        assertEquals("<BR>Account Data for account: <B>1</B><LI>   loginCount:10</LI><LI>  logoutCount:5</LI><LI>    lastLogin:" + accountDataBean.getLastLogin() + "</LI><LI> creationDate:" + accountDataBean.getCreationDate() + "</LI><LI>      balance:100.0</LI><LI>  openBalance:100.0</LI><LI>    profileID:profileID</LI>", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLogout_NBjk1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    accountDataBean.logout();
    assertEquals(1, accountDataBean.getLogoutCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpenBalance_NNLh1() {
    AccountDataBean accountDataBean = new AccountDataBean();
    BigDecimal openBalance = new BigDecimal("100.00");
    accountDataBean.setOpenBalance(openBalance);
    assertEquals(openBalance, accountDataBean.getOpenBalance());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetProfileID_zsUt1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "profileID");
    String profileID = accountDataBean.getProfileID();
    assertEquals("profileID", profileID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_WCYk0() {
    AccountDataBean bean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("1"), new BigDecimal("1"), "1");
    boolean result = bean.equals(bean);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObject_LXDD1() {
    AccountDataBean bean1 = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("1"), new BigDecimal("1"), "1");
    AccountDataBean bean2 = new AccountDataBean(2, 2, 2, new Date(), new Date(), new BigDecimal("2"), new BigDecimal("2"), "2");
    boolean result = bean1.equals(bean2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_xIaN2() {
    AccountDataBean bean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("1"), new BigDecimal("1"), "1");
    boolean result = bean.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_SAxq3() {
    AccountDataBean bean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("1"), new BigDecimal("1"), "1");
    Object obj = new Object();
    boolean result = bean.equals(obj);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetProfileID_IONZ1() {
    AccountDataBean accountDataBean = new AccountDataBean();
    accountDataBean.setProfileID("testProfileID");
    assertEquals("testProfileID", accountDataBean.getProfileID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDate_ylHM1() {
    AccountDataBean accountDataBean = new AccountDataBean();
    Date creationDate = new Date();
    accountDataBean.setCreationDate(creationDate);
    assertEquals(creationDate, accountDataBean.getCreationDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfile_sNic0() {
        AccountDataBean accountDataBean = new AccountDataBean();
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        accountDataBean.setProfile(accountProfileDataBean);
        assertEquals(accountProfileDataBean, accountDataBean.getProfile());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOrders_Arub0() {
    AccountDataBean accountDataBean = new AccountDataBean();
    Collection<OrderDataBean> orders = new ArrayList<>();
    OrderDataBean orderDataBean = new OrderDataBean();
    orders.add(orderDataBean);
    accountDataBean.setOrders(orders);
    assertEquals(orders, accountDataBean.getOrders());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBalance_YnYt1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal("100.0"), new BigDecimal("100.0"), "profileID");
    BigDecimal balance = accountDataBean.getBalance();
    assertEquals(new BigDecimal("100.0"), balance);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastLogin_dJpg1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(1), new BigDecimal(1), "profileID");
    Date lastLogin = accountDataBean.getLastLogin();
    assertEquals(lastLogin, accountDataBean.getLastLogin());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpenBalance_nKAC0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 0, 0, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
    BigDecimal openBalance = accountDataBean.getOpenBalance();
    assertEquals(BigDecimal.ZERO, openBalance);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalance_GWqw0() {
        AccountDataBean accountDataBean = new AccountDataBean(1, 1, null, null, BigDecimal.ZERO, BigDecimal.ZERO, "profileID");
        BigDecimal balance = BigDecimal.valueOf(100);
        accountDataBean.setBalance(balance);
        assertEquals(balance, accountDataBean.getBalance());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRandomInstance_fgMX0_5() {
    AccountDataBean result = AccountDataBean.getRandomInstance();
    assertEquals(new Date(), result.getLastLogin());}
}