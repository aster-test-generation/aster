/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountProfileDataBean_Test_Passing {
  public void testSetFullName_nSRa0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName("John Doe");
    assertEquals("John Doe", accountProfileDataBean.getFullName());
  }

  public void testSetFullNameWithNull_qKHV1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName(null);
    assertNull(accountProfileDataBean.getFullName());
  }

  public void testSetFullNameWithEmptyString_dBup2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName("");
    assertEquals("", accountProfileDataBean.getFullName());
  }

  public void testSetFullNameWithWhitespace_zqoK3() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName(" ");
    assertEquals(" ", accountProfileDataBean.getFullName());
  }

  public void testSetFullNameWithMultipleNames_WKOD4() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName("John Doe Jane Smith");
    assertEquals("John Doe Jane Smith", accountProfileDataBean.getFullName());
  }

  public void testSetFullNameWithSpecialCharacters_VWaa5() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName("John Doe!@#$%^&*()_+");
    assertEquals("John Doe!@#$%^&*()_+", accountProfileDataBean.getFullName());
  }

  public void testSetFullNameWithDifferentCasing_aHNJ6() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName("john doe");
    assertEquals("john doe", accountProfileDataBean.getFullName());
  }

  public void testSetFullNameWithDifferentCasingAndWhitespace_yUkX7() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName("john  doe");
    assertEquals("john  doe", accountProfileDataBean.getFullName());
  }

  public void testSetFullNameWithDifferentCasingAndSpecialCharacters_UPQg8() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName("john!@#$%^&*()_+ doe");
    assertEquals("john!@#$%^&*()_+ doe", accountProfileDataBean.getFullName());
  }

  public void testSetFullNameWithDifferentCasingAndWhitespaceAndSpecialCharacters_sOyB9() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
    accountProfileDataBean.setFullName("john!@#$%^&*()_+  doe");
    assertEquals("john!@#$%^&*()_+  doe", accountProfileDataBean.getFullName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCreditCard_xMnM0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    String creditCard = accountProfileDataBean.getCreditCard();
    assertEquals("creditCard", creditCard);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_tdwD0() {
    AccountProfileDataBean bean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    assertTrue(bean.equals(bean));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_IurX1() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password2", "fullName2", "address2", "email2", "creditCard2");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_aeLK2() {
    AccountProfileDataBean bean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    assertFalse(bean.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_INhZ3() {
    AccountProfileDataBean bean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    assertFalse(bean.equals("user1"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameValues_TgrC4() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    assertTrue(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullUserID_AWCJ6() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean(null, "password1", "fullName1", "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password2", "fullName2", "address2", "email2", "creditCard2");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullPassword_ZIUy7() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", null, "fullName1", "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password2", "fullName2", "address2", "email2", "creditCard2");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullFullName_YtIt8() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", null, "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password2", "fullName2", "address2", "email2", "creditCard2");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullAddress_dsOw9() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "fullName1", null, "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password2", "fullName2", "address2", "email2", "creditCard2");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmail_uFve0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("newEmail@example.com");
    assertEquals("newEmail@example.com", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithNull_hqgx1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail(null);
    assertNull(accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithEmptyString_xoVx2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("");
    assertEquals("", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithInvalidEmail_xIFr3() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("invalidEmail");
    assertEquals("invalidEmail", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithValidEmail_ITNs4() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("validEmail@example.com");
    assertEquals("validEmail@example.com", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithDifferentCase_eVIV5() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("ValidEmail@example.com");
    assertEquals("ValidEmail@example.com", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithSpecialCharacters_ZYDr6() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("specialEmail@example.com");
    assertEquals("specialEmail@example.com", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithLongEmail_XKbk7() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("verylongemail@example.com");
    assertEquals("verylongemail@example.com", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithShortEmail_lHxz8() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("short@example.com");
    assertEquals("short@example.com", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithNoAtSymbol_ncLu9() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("noatsymbol.com");
    assertEquals("noatsymbol.com", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithNoDotAfterAtSymbol_eDTD10() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setEmail("noatdot.com");
    assertEquals("noatdot.com", accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmailWithNoDotBeforeAtSymbol_TZlD11() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_QRkF0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    String expected = "\n\tAccount Profile Data for userID:userID\n\t\t   passwd:password\n\t\t   fullName:fullName\n\t\t    address:address\n\t\t      email:email\n\t\t creditCard:creditCard";
    assertEquals(expected, accountProfileDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullValues_WhQj1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean(null, null, null, null, null, null);
    String expected = "\n\tAccount Profile Data for userID:null\n\t\t   passwd:null\n\t\t   fullName:null\n\t\t    address:null\n\t\t      email:null\n\t\t creditCard:null";
    assertEquals(expected, accountProfileDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccountNull_DdZG1() {
    AccountProfileDataBean profile = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    profile.setAccount(null);
    assertNull(profile.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TGIx0_1() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TGIx0_2() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TGIx0_3() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TGIx0_4() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getFullName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TGIx0_5() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getAddress());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TGIx0_6() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TGIx0_7() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getCreditCard());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserID_xVMo0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    accountProfileDataBean.setUserID("user2");
    assertEquals("user2", accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithNull_WYrM1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    accountProfileDataBean.setUserID(null);
    assertEquals(null, accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithEmptyString_izvX2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    accountProfileDataBean.setUserID("");
    assertEquals("", accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithInvalidString_cGcv3() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    accountProfileDataBean.setUserID("invalidUserID");
    assertEquals("invalidUserID", accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithValidString_HdHj4() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    accountProfileDataBean.setUserID("validUserID");
    assertEquals("validUserID", accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmail_Bqod0() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String email = account.getEmail();
    assertEquals("johndoe@example.com", email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmailWithNullEmail_sEEu1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", null, "1234567890");
    String email = account.getEmail();
    assertNull(email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmailWithEmptyEmail_RBuz2() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "", "1234567890");
    String email = account.getEmail();
    assertEquals("", email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmailWithInvalidEmail_FZXi3() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe", "1234567890");
    String email = account.getEmail();
    assertEquals("johndoe", email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUserID_QPDF0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String userID = accountProfileDataBean.getUserID();
    assertEquals("user123", userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUserIDWithNullUserID_FAPY1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean(null, "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String userID = accountProfileDataBean.getUserID();
    assertNull(userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUserIDWithEmptyUserID_Nnjq2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("", "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String userID = accountProfileDataBean.getUserID();
    assertEquals("", userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUserIDWithInvalidUserID_RrZi4() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("invalidUserID", "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String userID = accountProfileDataBean.getUserID();
    assertEquals("invalidUserID", userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullUserID_Oxmd0() {
    AccountProfileDataBean account = new AccountProfileDataBean(null, "password", "fullName", "address", "email", "creditCard");
    assertEquals(0, account.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NonNullUserID_EFNN1() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    assertNotEquals(0, account.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_AllCombinations_ckgY2_1() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    account = new AccountProfileDataBean("userID", null, "fullName", "address", "email", "creditCard");
    account = new AccountProfileDataBean("userID", "password", null, "address", "email", "creditCard");
    account = new AccountProfileDataBean("userID", "password", "fullName", null, "email", "creditCard");
    account = new AccountProfileDataBean("userID", "password", "fullName", "address", null, "creditCard");
    account = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", null);
    assertNotEquals(0, account.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddress_HuoE0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String address = accountProfileDataBean.getAddress();
    assertEquals("123 Main St", address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddressWithNull_cbmk1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", null, "johndoe@example.com", "1234567890");
    String address = accountProfileDataBean.getAddress();
    assertNull(address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddressWithEmptyString_vRAZ2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", "", "johndoe@example.com", "1234567890");
    String address = accountProfileDataBean.getAddress();
    assertEquals("", address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddressWithDifferentAddress_lkOQ6() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", "456 Elm St", "johndoe@example.com", "1234567890");
    String address = accountProfileDataBean.getAddress();
    assertNotEquals("123 Main St", address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPassword_WIcr0() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String password = account.getPassword();
    assertEquals("password1", password);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPasswordWithNullPassword_gUfm1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", null, "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String password = account.getPassword();
    assertNull(password);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPasswordWithEmptyPassword_eQcN2() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String password = account.getPassword();
    assertEquals("", password);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCreditCard_zGbQ0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setCreditCard("newCreditCard");
    Assertions.assertEquals("newCreditCard", accountProfileDataBean.getCreditCard());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_JMoS0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    String html = accountProfileDataBean.toHTML();
    assertEquals("<BR>Account Profile Data for userID: <B>userID</B><LI>   passwd:password</LI><LI>   fullName:fullName</LI><LI>    address:address</LI><LI>      email:email</LI><LI> creditCard:creditCard</LI>", html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPassword_REFm0() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    account.setPassword("newPassword");
    assertEquals("newPassword", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithNull_RnGV1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    account.setPassword(null);
    assertNull(account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithEmptyString_Xzgu2() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    account.setPassword("");
    assertEquals("", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithValidPassword_GIIB4() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    account.setPassword("validPassword");
    assertEquals("validPassword", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithSpecialCharacters_qSgv6() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    account.setPassword("!@#$%^&*()");
    assertEquals("!@#$%^&*()", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullName_jDpj0() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String expected = "John Doe";
    String actual = account.getFullName();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithNull_YLej1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", null, "123 Main St", "johndoe@example.com", "1234567890");
    String expected = null;
    String actual = account.getFullName();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithEmptyString_oEEe2() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "", "123 Main St", "johndoe@example.com", "1234567890");
    String expected = "";
    String actual = account.getFullName();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithMultipleNames_rBbe4() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe Smith", "123 Main St", "johndoe@example.com", "1234567890");
    String expected = "John Doe Smith";
    String actual = account.getFullName();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithSpecialCharacters_nvcR5() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe!@#$%^&*()_+", "123 Main St", "johndoe@example.com", "1234567890");
    String expected = "John Doe!@#$%^&*()_+";
    String actual = account.getFullName();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithDifferentCasing_HNxR6() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "john doe", "123 Main St", "johndoe@example.com", "1234567890");
    String expected = "john doe";
    String actual = account.getFullName();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAddress_ofvo0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    String newAddress = "newAddress";
    accountProfileDataBean.setAddress(newAddress);
    assertEquals(newAddress, accountProfileDataBean.getAddress());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAddressNull_daBN2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setAddress(null);
    assertNull(accountProfileDataBean.getAddress());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAddressEmpty_sgyC3() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setAddress("");
    assertEquals("", accountProfileDataBean.getAddress());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountWithNullProfile_XxBm1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean(null, null, null, null, null, null);
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertNull(accountDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountWithInvalidProfile_CWGr3() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("invalidUserID", "invalidPassword", "invalidFullName", "invalidAddress", "invalidEmail", "invalidCreditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertNull(accountDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstanceWithNullAddress_WBvr4_JKAV0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", null, "email", "creditCard");
    assertNull(accountProfileDataBean.getAddress());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmailWithNullAccount_uhka4_fid1() {
    AccountProfileDataBean account = null;
    String email = null;
    assertNull(email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintWithInvalidValues_CXGi3_fid1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("invalidUserID", "invalidPassword", "invalidFullName", "invalidAddress", "invalidEmail", "invalidCreditCard");
    accountProfileDataBean.print();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintWithValidValues_DwOq4_fid1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("validUserID", "validPassword", "validFullName", "validAddress", "validEmail", "validCreditCard");
    accountProfileDataBean.print();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPasswordWithInvalidPassword_MjqV3_fid1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "invalid_password", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String password = account.getPassword();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPasswordWithInvalidAccount_vpVG5_fid1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String password = account.getPassword();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithInvalidPassword_iYcV3_fid1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "invalidPassword", "fullName1", "address1", "email1", "creditCard1");
    account.setPassword("invalidPassword");
    assertEquals("invalidPassword", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithDifferentCase_XTIB5_fid1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    account.setPassword("VALIDPASSWORD");
    assertEquals("VALIDPASSWORD", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_TGIx0() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean);
    assertNotNull(accountProfileDataBean.getUserID());
    assertNotNull(accountProfileDataBean.getPassword());
    assertNotNull(accountProfileDataBean.getFullName());
    assertNotNull(accountProfileDataBean.getAddress());
    assertNotNull(accountProfileDataBean.getEmail());
    assertNotNull(accountProfileDataBean.getCreditCard());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_AllCombinations_ckgY2() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    assertNotEquals(0, account.hashCode());
    account = new AccountProfileDataBean("userID", null, "fullName", "address", "email", "creditCard");
    assertNotEquals(0, account.hashCode());
    account = new AccountProfileDataBean("userID", "password", null, "address", "email", "creditCard");
    assertNotEquals(0, account.hashCode());
    account = new AccountProfileDataBean("userID", "password", "fullName", null, "email", "creditCard");
    assertNotEquals(0, account.hashCode());
    account = new AccountProfileDataBean("userID", "password", "fullName", "address", null, "creditCard");
    assertNotEquals(0, account.hashCode());
    account = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", null);
    assertNotEquals(0, account.hashCode());
  }
}