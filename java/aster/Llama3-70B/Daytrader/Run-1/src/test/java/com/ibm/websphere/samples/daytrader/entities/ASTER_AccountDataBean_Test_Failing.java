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
  public void testGetLoginCount_qGqq0() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("20.0"), "profileID");
    assertEquals(2, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldings_tysX0_fid1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("10.0"), "profileID");
    Collection<HoldingDataBean> holdings = accountDataBean.getHoldings();
    assertNotNull(holdings);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCount_qGqq0_fid1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("20.0"), "profileID");
    assertEquals(2, accountDataBean.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentAccountID_tRyU3_fid1() {
    AccountDataBean accountDataBean1 = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("10.0"), "profileID");
    AccountDataBean accountDataBean2 = new AccountDataBean(2, 1, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("10.0"), "profileID");
    assertFalse(accountDataBean1.equals(accountDataBean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrders_MCjS0_fid1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("20.0"), "profileID");
    Collection<OrderDataBean> orders = accountDataBean.getOrders();
    assertNotNull(orders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrint_ssrO0_GRta0_fid1() {
    AccountDataBean accountDataBean = new AccountDataBean(1, 2, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("20.0"), "profileID");
    accountDataBean.setBalance(new BigDecimal("10.0"));
    accountDataBean.print();
    Date currentDate = new Date();
    assertEquals("AccountDataBean[accountID=1, loginCount=2, logoutCount=0, lastLogin=" + currentDate + ", creationDate=" + currentDate + ", balance=10.0, openBalance=20.0, profileID=profileID]", accountDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullAccountID_PpFX4_aSrS0_fid1() {
    AccountDataBean accountDataBean1 = new AccountDataBean(0, 1, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("10.0"), "profileID");
    AccountDataBean accountDataBean2 = new AccountDataBean(1, 1, new Date(), new Date(), new BigDecimal("10.0"), new BigDecimal("10.0"), "profileID");
    assertFalse(accountDataBean1.equals(accountDataBean2));
  }
}