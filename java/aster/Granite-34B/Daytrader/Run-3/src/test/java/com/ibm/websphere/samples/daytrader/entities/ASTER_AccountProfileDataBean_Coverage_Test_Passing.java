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
  public void testEquals2_wGhN1_qJgF0() {
    AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean("1", "password", "fullName", "address", "email", "creditCard");
    AccountProfileDataBean accountProfileDataBean2 = new AccountProfileDataBean("2", "password", "fullName", "address", "email", "creditCard");
    assertFalse(accountProfileDataBean1.equals(accountProfileDataBean2));
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_HnxJ0_YMNS0() {
    AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean("1", "password", "fullName", "address", "email", "creditCard");
    AccountProfileDataBean accountProfileDataBean2 = new AccountProfileDataBean("1", "password", "fullName", "address", "email", "creditCard");
    assertTrue(accountProfileDataBean1.equals(accountProfileDataBean2));
  }
}