/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountProfileDataBean_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsWithDifferentUserID_HNTz0_TjcF0() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "John Doe", "1234 Elm Street", "john@example.com", "1234567890123456");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password1", "John Doe", "1234 Elm Street", "john@example.com", "1234567890123456");
    assertFalse(bean1.equals(bean2), "Expected beans to be not equal due to different userID");
  }
}