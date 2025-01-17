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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountDataBean_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_YJMi0() {
    AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile1");
    String expected = "<BR>Account Data for account: <B>1</B>" + "<LI>   loginCount:2</LI>" + "<LI>  logoutCount:3</LI>" + "<LI>    lastLogin:</LI>" + "<LI> creationDate:</LI>" + "<LI>      balance:100.00</LI>" + "<LI>  openBalance:50.00</LI>" + "<LI>    profileID:profile1</LI>";
    assertEquals(expected, account.toHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginCorrectPassword_GsNg2_1() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "1");
    account.login("1");
    assertEquals(new Timestamp(System.currentTimeMillis()), account.getLastLogin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginCorrectPassword_GsNg2_2() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "1");
    account.login("1");
    assertEquals(2, account.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrders_jliL0() {
    AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(100.00), "profileID");
    Collection<OrderDataBean> orders = account.getOrders();
    assertNotNull(orders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenBalanceWithNoOpenBalance_hnQz1() {
    AccountDataBean account = new AccountDataBean(1, 10, 5, new Date(), new Date(), new BigDecimal(100.00), null, "profile123");
    assertNull(new BigDecimal(100.00));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_dTpy0() {
    AccountDataBean actual = AccountDataBean.getRandomInstance();
    AccountDataBean expected = new AccountDataBean(new Integer(TradeConfig.rndInt(100000)),
        TradeConfig.rndInt(10000), TradeConfig.rndInt(10000), new java.util.Date(),
        new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)), TradeConfig.rndBigDecimal(1000000.0f),
        TradeConfig.rndBigDecimal(1000000.0f), TradeConfig.rndUserID());
    assertEquals(expected.toString(), actual.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_GUCu0() {
    AccountDataBean account = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100.00), new BigDecimal(50.00), "profile123");
    String expected = "\n\tAccount Data for account: 1\n\t\t   loginCount:2\n\t\t  logoutCount:3\n\t\t    lastLogin:null\n\t\t creationDate:null\n\t\t      balance:100.00\n\t\t  openBalance:50.00\n\t\t    profileID:profile123";
    assertEquals(expected, account.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithEmptyValues_psAw2() {
    AccountDataBean account = new AccountDataBean(0, 0, 0, new Date(), new Date(), new BigDecimal(0.00), new BigDecimal(0.00), "");
    String expected = "\n\tAccount Data for account: 0\n\t\t   loginCount:0\n\t\t  logoutCount:0\n\t\t    lastLogin:null\n\t\t creationDate:null\n\t\t      balance:0.00\n\t\t  openBalance:0.00\n\t\t    profileID:";
    assertEquals(expected, account.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNegativeValues_Gjxn3() {
    AccountDataBean account = new AccountDataBean(-1, -2, -3, new Date(), new Date(), new BigDecimal(-100.00), new BigDecimal(-50.00), "profile-123");
    String expected = "\n\tAccount Data for account: -1\n\t\t   loginCount:-2\n\t\t  logoutCount:-3\n\t\t    lastLogin:null\n\t\t creationDate:null\n\t\t      balance:-100.00\n\t\t  openBalance:-50.00\n\t\t    profileID:profile-123";
    assertEquals(expected, account.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogout3_qrAN2() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "1");
    accountDataBean.logout();
    assertEquals(new Date(), accountDataBean.getLastLogin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldings_syOo0_fid1() {
    AccountDataBean account = new AccountDataBean(new Integer(1), 2, 3, new Date(4), new Date(5), new BigDecimal(6), new BigDecimal(7), "8");
    Collection<HoldingDataBean> holdings = account.getHoldings();
    Assertions.assertNotNull(holdings);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoginCorrectPassword_GsNg2() {
    AccountDataBean account = new AccountDataBean(1, 1, 1, new Date(), new Date(), new BigDecimal(100.0), new BigDecimal(100.0), "1");
    account.login("1");
    assertEquals(new Timestamp(System.currentTimeMillis()), account.getLastLogin());
    assertEquals(2, account.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenBalanceWithNoOpenBalance_hnQz1_fid1() {
    AccountDataBean account = new AccountDataBean(1, 10, 5, new Date(), new Date(), new BigDecimal(100.00), null, "profile123");
    assertEquals(new BigDecimal(100.00), account.getOpenBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_dTpy0_fid1() {
    AccountDataBean actual = AccountDataBean.getRandomInstance();
    AccountDataBean expected = new AccountDataBean(new Integer(TradeConfig.rndInt(100000)),
        TradeConfig.rndInt(10000), TradeConfig.rndInt(10000), new java.util.Date(),
        new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)), TradeConfig.rndBigDecimal(1000000.0f),
        TradeConfig.rndBigDecimal(1000000.0f), TradeConfig.rndUserID());
    assertEquals(expected, actual);
  }
}