/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
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
  public void testGetRandomInstance_xvGl0_10() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertNotNull(accountDataBean.getHoldings());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_xvGl0_11() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertNotNull(accountDataBean.getOrders());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_xvGl0_12() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertNotNull(accountDataBean.getProfile());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_1() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(14013, accountDataBean.getAccountID().intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_2() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(1971, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_3() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(7309, accountDataBean.getLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_4() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(new Date(), accountDataBean.getCreationDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_5() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(new Date(TradeConfig.rndInt(Integer.MAX_VALUE)), accountDataBean.getLastLogin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_6() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(TradeConfig.rndBigDecimal(1000000.0f), accountDataBean.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_7() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(TradeConfig.rndBigDecimal(1000000.0f), accountDataBean.getOpenBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_8() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(TradeConfig.rndUserID(), accountDataBean.getProfileID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_1_fid1() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(100000, accountDataBean.getAccountID().intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_2_fid1() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(10000, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1_3_fid1() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(10000, accountDataBean.getLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance3_GHZX2_5_fid1() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertNotSame(accountDataBean.getHoldings(), accountDataBean.getOrders());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance3_GHZX2_6() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertNotSame(accountDataBean.getProfile(), accountDataBean.getProfile());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_accountID_kPVH0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(50), "profileID");
    int expectedHashCode = 1;
    int actualHashCode = accountDataBean.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_accountID_loginCount_0_rFrP2() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 0, new Date(), new Date(), new BigDecimal(100), new BigDecimal(50), "profileID");
    int expectedHashCode = 1;
    int actualHashCode = accountDataBean.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintValidInput_xFdn0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    accountDataBean.print();
    assertEquals("AccountDataBean[accountID=1, loginCount=2, logoutCount=0, lastLogin=null, creationDate=null, balance=100, openBalance=100, profileID=profileID]", accountDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintInvalidInput_hNGk2() {
    AccountDataBean accountDataBean = new AccountDataBean(-1, -2, new Date(), new Date(), new BigDecimal(-100), new BigDecimal(-100), "profileID");
    accountDataBean.print();
    assertEquals("AccountDataBean[accountID=-1, loginCount=-2, logoutCount=0, lastLogin=null, creationDate=null, balance=-100, openBalance=-100, profileID=profileID]", accountDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCreationDateWithNullCreationDate_bBgd1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, null, new Date(), BigDecimal.valueOf(100), BigDecimal.valueOf(50), "profileID");
    Date creationDate = accountDataBean.getCreationDate();
    assertNull(creationDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCreationDateWithInvalidCreationDate_vqnl2() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), BigDecimal.valueOf(100), BigDecimal.valueOf(50), "profileID");
    Date creationDate = accountDataBean.getCreationDate();
    assertNotEquals(new Date(), creationDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCreationDateWithNullAccountDataBean_iPxI3() {
    AccountDataBean accountDataBean = null;
    Date creationDate = accountDataBean.getCreationDate();
    assertNull(creationDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldings_xBmb0_1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(50), "profileID");
    Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
    assertNotNull(holdings);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldings_xBmb0_2() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(50), "profileID");
    Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
    assertEquals(0, holdings.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCount_GdmU0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(2, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCountWithZeroLoginCount_ezsm1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 0, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(0, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCountWithNegativeLoginCount_YilG2() {
    AccountDataBean accountDataBean = new AccountDataBean(1, -1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(-1, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCountWithInvalidCreationDate_HgDL7() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, null, new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(0, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCountWithInvalidBalance_gQju8() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), null, new BigDecimal(100), "profileID");
    assertEquals(0, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCountWithInvalidOpenBalance_SVwI9() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), null, "profileID");
    assertEquals(0, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCountWithInvalidProfileID_vEzG10() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), null);
    assertEquals(0, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountID_adei0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(1, accountDataBean.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountIDWithZeroAccountID_jMgh2() {
    AccountDataBean accountDataBean = new AccountDataBean(0, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(0, accountDataBean.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountIDWithNegativeAccountID_YJIh3() {
    AccountDataBean accountDataBean = new AccountDataBean(-1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(-1, accountDataBean.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountIDWithMaxIntegerAccountID_gwBf4() {
    AccountDataBean accountDataBean = new AccountDataBean(Integer.MAX_VALUE, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(Integer.MAX_VALUE, accountDataBean.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountIDWithMinIntegerAccountID_xXrx5() {
    AccountDataBean accountDataBean = new AccountDataBean(Integer.MIN_VALUE, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(Integer.MIN_VALUE, accountDataBean.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountIDWithZeroDate_qCtp7() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(0), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(1, accountDataBean.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountIDWithNegativeDate_ypbP8() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(-1), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(1, accountDataBean.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountIDWithMaxDate_DpeZ9() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(Long.MAX_VALUE), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(1, accountDataBean.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountIDWithMinDate_VKEh10() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(Long.MIN_VALUE), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertEquals(1, accountDataBean.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_LfDG1() {
    AccountDataBean accountDataBean1 = new AccountDataBean(1, 2, new Date(), new Date(), BigDecimal.valueOf(100), BigDecimal.valueOf(50), "profileID");
    AccountDataBean accountDataBean2 = new AccountDataBean(2, 3, new Date(), new Date(), BigDecimal.valueOf(200), BigDecimal.valueOf(100), "profileID");
    assertFalse(accountDataBean1.equals(accountDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_vtzD0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, 3, new Date(), new Date(), new BigDecimal(100), new BigDecimal(50), "profileID");
    String expected = "\n\tAccount Data for account: 1\n\t\t   loginCount:2\n\t\t  logoutCount:3\n\t\t    lastLogin:2023-02-28 12:34:56\n\t\t creationDate:2023-02-28 12:34:56\n\t\t      balance:100\n\t\t  openBalance:50\n\t\t    profileID:profileID";
    String actual = accountDataBean.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithZeroValues_JVpO2() {
    AccountDataBean accountDataBean = new AccountDataBean(0, 0, 0, new Date(0), new Date(0), new BigDecimal(0), new BigDecimal(0), "");
    String expected = "\n\tAccount Data for account: 0\n\t\t   loginCount:0\n\t\t  logoutCount:0\n\t\t    lastLogin:1970-01-01 00:00:00\n\t\t creationDate:1970-01-01 00:00:00\n\t\t      balance:0\n\t\t  openBalance:0\n\t\t    profileID:";
    String actual = accountDataBean.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNegativeValues_DxIR3() {
    AccountDataBean accountDataBean = new AccountDataBean(-1, -2, -3, new Date(-1), new Date(-1), new BigDecimal(-100), new BigDecimal(-50), "profileID");
    String expected = "\n\tAccount Data for account: -1\n\t\t   loginCount:-2\n\t\t  logoutCount:-3\n\t\t    lastLogin:1969-12-31 23:59:59\n\t\t creationDate:1969-12-31 23:59:59\n\t\t      balance:-100\n\t\t  openBalance:-50\n\t\t    profileID:profileID";
    String actual = accountDataBean.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrders_Ztpq0_1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    Collection<OrderDataBean> orders = accountDataBean.getOrders();
    assertNotNull(orders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrders_Ztpq0_2() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    Collection<OrderDataBean> orders = accountDataBean.getOrders();
    assertEquals(0, orders.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProfile_komX0_1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountProfileDataBean profile = accountDataBean.getProfile();
    assertNotNull(profile);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProfile_komX0_2() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountProfileDataBean profile = accountDataBean.getProfile();
    assertEquals("profileID", profile.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProfile_komX0_3() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountProfileDataBean profile = accountDataBean.getProfile();
    assertEquals("email@example.com", profile.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProfile_komX0_4() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountProfileDataBean profile = accountDataBean.getProfile();
    assertEquals("password", profile.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProfile_komX0_5() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountProfileDataBean profile = accountDataBean.getProfile();
    assertEquals("fullName", profile.getFullName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProfile_komX0_6() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountProfileDataBean profile = accountDataBean.getProfile();
    assertEquals("address", profile.getAddress());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProfile_komX0_7() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountProfileDataBean profile = accountDataBean.getProfile();
    assertEquals("creditCard", profile.getCreditCard());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLoginCountWithNull_gkIX5_NPgv0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    accountDataBean.setLoginCount(0);
    assertNull(accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintNullInput_QMkK1_IRDx0() {
    AccountDataBean accountDataBean = new AccountDataBean(0, 0, null, null, null, null, null);
    accountDataBean.print();
    assertEquals("AccountDataBean[accountID=0, loginCount=0, logoutCount=null, lastLogin=null, creationDate=null, balance=null, openBalance=null, profileID=null]", accountDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCreationDateWithNullAccountID_Oxdu7_nIFq0() {
    AccountDataBean accountDataBean = new AccountDataBean(0, 2, new Date(), new Date(), BigDecimal.valueOf(100), BigDecimal.valueOf(50), "profileID");
    Date creationDate = accountDataBean.getCreationDate();
    assertNull(creationDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCountWithNullLoginCount_yXUU3_OYGS0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 0, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertNull(accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullAccountID_HbWv5_oTsy0() {
    AccountDataBean accountDataBean1 = new AccountDataBean(0, 2, new Date(), new Date(), BigDecimal.valueOf(100), BigDecimal.valueOf(50), "profileID");
    AccountDataBean accountDataBean2 = new AccountDataBean(1, 2, new Date(), new Date(), BigDecimal.valueOf(100), BigDecimal.valueOf(50), "profileID");
    assertFalse(accountDataBean1.equals(accountDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBalanceWithDifferentTypeAndZero_Trzn6_miRT0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    accountDataBean.setBalance(BigDecimal.ZERO);
    assertEquals(0, accountDataBean.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_xvGl0() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertNotNull(accountDataBean);
    assertNotNull(accountDataBean.getAccountID());
    assertNotNull(accountDataBean.getProfileID());
    assertNotNull(accountDataBean.getCreationDate());
    assertNotNull(accountDataBean.getLastLogin());
    assertNotNull(accountDataBean.getBalance());
    assertNotNull(accountDataBean.getOpenBalance());
    assertNotNull(accountDataBean.getLoginCount());
    assertNotNull(accountDataBean.getLogoutCount());
    assertNotNull(accountDataBean.getHoldings());
    assertNotNull(accountDataBean.getOrders());
    assertNotNull(accountDataBean.getProfile());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance2_eoXG1() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertEquals(100000, accountDataBean.getAccountID().intValue());
    assertEquals(10000, accountDataBean.getLoginCount());
    assertEquals(10000, accountDataBean.getLogoutCount());
    assertEquals(new Date(), accountDataBean.getCreationDate());
    assertEquals(new Date(TradeConfig.rndInt(Integer.MAX_VALUE)), accountDataBean.getLastLogin());
    assertEquals(TradeConfig.rndBigDecimal(1000000.0f), accountDataBean.getBalance());
    assertEquals(TradeConfig.rndBigDecimal(1000000.0f), accountDataBean.getOpenBalance());
    assertEquals(TradeConfig.rndUserID(), accountDataBean.getProfileID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance3_GHZX2() {
    AccountDataBean accountDataBean = AccountDataBean.getRandomInstance();
    assertNotSame(accountDataBean.getAccountID(), accountDataBean.getProfileID());
    assertNotSame(accountDataBean.getCreationDate(), accountDataBean.getLastLogin());
    assertNotSame(accountDataBean.getBalance(), accountDataBean.getOpenBalance());
    assertNotSame(accountDataBean.getLoginCount(), accountDataBean.getLogoutCount());
    assertNotSame(accountDataBean.getHoldings(), accountDataBean.getOrders());
    assertNotSame(accountDataBean.getProfile(), accountDataBean.getProfile());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldings_xBmb0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(50), "profileID");
    Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
    assertNotNull(holdings);
    assertEquals(0, holdings.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrders_Ztpq0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    Collection<OrderDataBean> orders = accountDataBean.getOrders();
    assertNotNull(orders);
    assertEquals(0, orders.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProfile_komX0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountProfileDataBean profile = accountDataBean.getProfile();
    assertNotNull(profile);
    assertEquals("profileID", profile.getUserID());
    assertEquals("email@example.com", profile.getEmail());
    assertEquals("password", profile.getPassword());
    assertEquals("fullName", profile.getFullName());
    assertEquals("address", profile.getAddress());
    assertEquals("creditCard", profile.getCreditCard());
  }
}