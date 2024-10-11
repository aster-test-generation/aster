/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountProfileDataBean_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentPassword_uzqb6() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password2", "fullName1", "address1", "email1", "creditCard1");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_LleM0_8() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmailWithInvalidEmail_Rycy3() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "invalidEmail", "creditCard");
    String email = accountProfileDataBean.getEmail();
    assertNotEquals("invalidEmail", email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullPassword_omTe2() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", null, "fullName", "address", "email", "creditCard");
    int actual = account.hashCode();
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullFullName_qxeO3() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", null, "address", "email", "creditCard");
    int actual = account.hashCode();
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullAddress_XlnD4() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", null, "email", "creditCard");
    int actual = account.hashCode();
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullEmail_DliN5() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", "address", null, "creditCard");
    int actual = account.hashCode();
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullCreditCard_tXva6() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", null);
    int actual = account.hashCode();
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_AllFieldsNotNull_zxQh8() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    int actual = account.hashCode();
    int expected = account.getUserID().hashCode() + account.getPassword().hashCode() + account.getFullName().hashCode() + account.getAddress().hashCode() + account.getEmail().hashCode() + account.getCreditCard().hashCode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddressWithInvalidAddress_XmgT4() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String address = accountProfileDataBean.getAddress();
    assertNotEquals("123 Main St", address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccount_sVSr0_1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertNotNull(accountDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccount_sVSr0_2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertEquals("userID", accountDataBean.getProfileID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccount_sVSr0_3() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertEquals("password", accountDataBean.getProfile().getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccount_sVSr0_4() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertEquals("fullName", accountDataBean.getProfile().getFullName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccount_sVSr0_5() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertEquals("address", accountDataBean.getProfile().getAddress());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccount_sVSr0_6() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertEquals("email", accountDataBean.getProfile().getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccount_sVSr0_7() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertEquals("creditCard", accountDataBean.getProfile().getCreditCard());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmailWithInvalidEmail_Rycy3_fid1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "not equal", "creditCard");
    String email = accountProfileDataBean.getEmail();
    assertNotEquals("not equal", email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddressWithInvalidAddress_XmgT4_fid1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", "not equal", "johndoe@example.com", "1234567890");
    String address = accountProfileDataBean.getAddress();
    assertNotEquals("not equal", address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_LleM0() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean);
    assertNotNull(accountProfileDataBean.getUserID());
    assertNotNull(accountProfileDataBean.getPassword());
    assertNotNull(accountProfileDataBean.getFullName());
    assertNotNull(accountProfileDataBean.getAddress());
    assertNotNull(accountProfileDataBean.getEmail());
    assertNotNull(accountProfileDataBean.getCreditCard());
    assertNotNull(accountProfileDataBean.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccount_sVSr0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertNotNull(accountDataBean);
    assertEquals("userID", accountDataBean.getProfileID());
    assertEquals("password", accountDataBean.getProfile().getPassword());
    assertEquals("fullName", accountDataBean.getProfile().getFullName());
    assertEquals("address", accountDataBean.getProfile().getAddress());
    assertEquals("email", accountDataBean.getProfile().getEmail());
    assertEquals("creditCard", accountDataBean.getProfile().getCreditCard());
  }
}