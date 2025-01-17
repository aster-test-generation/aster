/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.ejb.EJBException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountDataBean_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_NullProfile_jFcy0() {
    AccountDataBean account = new AccountDataBean();
    account.setProfile(null);
    try {
      account.login("password");
      fail("Expected EJBException");
    } catch (EJBException e) {
      assertEquals("AccountBean:Login failure for account: null null AccountProfile", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_NullPassword_TfRW3() {
    AccountDataBean account = new AccountDataBean();
    AccountProfileDataBean profile = new AccountProfileDataBean();
    profile.setPassword("password");
    account.setProfile(profile);
    try {
      account.login(null);
      fail("Expected EJBException");
    } catch (EJBException e) {
      assertEquals("AccountBean:Login failure for account: null null AccountProfile", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_EmptyPassword_nhxM4() {
    AccountDataBean account = new AccountDataBean();
    AccountProfileDataBean profile = new AccountProfileDataBean();
    profile.setPassword("password");
    account.setProfile(profile);
    try {
      account.login("");
      fail("Expected EJBException");
    } catch (EJBException e) {
      assertEquals("AccountBean:Login failure for account: null null AccountProfile", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentAccountID_arWz0() {
    AccountDataBean accountDataBean1 = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountDataBean accountDataBean2 = new AccountDataBean(2, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertFalse(accountDataBean1.equals(accountDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullAccountID_tEwe1_VsNP0() {
    AccountDataBean accountDataBean1 = new AccountDataBean(0, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    AccountDataBean accountDataBean2 = new AccountDataBean(2, 2, new Date(), new Date(), new BigDecimal(100), new BigDecimal(100), "profileID");
    assertFalse(accountDataBean1.equals(accountDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_NullPassword_TfRW3_fid2() {
    AccountDataBean account = new AccountDataBean();
    AccountProfileDataBean profile = new AccountProfileDataBean();
    profile.setPassword("password");
    account.setProfile(profile);
    try {
      account.login(null);
      fail("Expected EJBException");
    } catch (EJBException e) {
      assertEquals("AccountBean:Login failure for account: null	Incorrect password-->null:password", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_EmptyPassword_nhxM4_fid2() {
    AccountDataBean account = new AccountDataBean();
    AccountProfileDataBean profile = new AccountProfileDataBean();
    profile.setPassword("password");
    account.setProfile(profile);
    try {
      account.login("");
      fail("Expected EJBException");
    } catch (EJBException e) {
      assertEquals("AccountBean:Login failure for account: null	Incorrect password-->null:password", e.getMessage());
    }
  }
}