/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountProfileDataBean_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_withNullUserID_DPrw0() {
    AccountProfileDataBean obj1 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
    AccountProfileDataBean obj2 = new AccountProfileDataBean(null, "password", "fullName", "address", "email", "creditCard");
    assertFalse(obj1.equals(obj2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_withDifferentUserID_KnRc1() {
    AccountProfileDataBean obj1 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
    AccountProfileDataBean obj2 = new AccountProfileDataBean("user2", "password", "fullName", "address", "email", "creditCard");
    assertFalse(obj1.equals(obj2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_withSameUserID_QfiY2() {
    AccountProfileDataBean obj1 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
    AccountProfileDataBean obj2 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
    assertTrue(obj1.equals(obj2));
  }
}