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

public class Aster_AccountProfileDataBean_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_differentPassword_zFmn2_fid2() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "fullName", "address", "email", "creditCard");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password2", "fullName", "address", "email", "creditCard");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_nullPassword_fLXk3_fid2() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", null, "fullName", "address", "email", "creditCard");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_differentFullName_uacB4_fid2() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", "fullName1", "address", "email", "creditCard");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password", "fullName2", "address", "email", "creditCard");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_nullFullName_sDLt5_fid2() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", null, "address", "email", "creditCard");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_differentAddress_pvUd6_fid2() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", "fullName", "address1", "email", "creditCard");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password", "fullName", "address2", "email", "creditCard");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_nullAddress_YVMO7_fid2() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", "fullName", null, "email", "creditCard");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email", "creditCard");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_differentEmail_oTye8_fid2() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email1", "creditCard");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password", "fullName", "address", "email2", "creditCard");
    assertFalse(bean1.equals(bean2));
  }
}