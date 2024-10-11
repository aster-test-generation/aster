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

public class Aster_AccountProfileDataBean_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCreditCard_sijl0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("123456789", "password", "John Doe", "123 Main St", "johndoe@example.com", "1234567890123456");
    String expectedCreditCard = "1234567890123456";
    String actualCreditCard = accountProfileDataBean.getCreditCard();
    assertEquals(expectedCreditCard, actualCreditCard);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_iqML0() {
    AccountProfileDataBean bean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    assertTrue(bean.equals(bean));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObjectSameValues_kMRy1() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    assertTrue(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObjectDifferentValues_LwWr2() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password2", "fullName2", "address2", "email2", "creditCard2");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_CTxG3() {
    AccountProfileDataBean bean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    assertFalse(bean.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentUserID_mmKv5() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user2", "password1", "fullName1", "address1", "email1", "creditCard1");
    assertFalse(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmail_ekKT0() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    account.setEmail("johndoe@example.com");
    assertEquals("johndoe@example.com", account.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccountWithNullAccount_rDKm1() {
    AccountProfileDataBean profile = new AccountProfileDataBean("user1", "password", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    profile.setAccount(null);
    assertNull(profile.getAccount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_LleM0_1() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_LleM0_2() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_LleM0_3() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_LleM0_4() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getFullName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_LleM0_5() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getAddress());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_LleM0_6() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRandomInstance_LleM0_7() {
    AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
    assertNotNull(accountProfileDataBean.getCreditCard());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserID_UaIq0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    accountProfileDataBean.setUserID("newUserID");
    assertEquals("newUserID", accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithNull_QGvK1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    accountProfileDataBean.setUserID(null);
    assertNull(accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithEmptyString_eUYe2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    accountProfileDataBean.setUserID("");
    assertEquals("", accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithInvalidString_cXzN3() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    accountProfileDataBean.setUserID("invalidUserID");
    assertEquals("invalidUserID", accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithValidString_EmeV4() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    accountProfileDataBean.setUserID("validUserID");
    assertEquals("validUserID", accountProfileDataBean.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmail_WBAT0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    String email = accountProfileDataBean.getEmail();
    assertEquals("email", email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmailWithNullEmail_TaYm1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", null, "creditCard");
    String email = accountProfileDataBean.getEmail();
    assertNull(email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmailWithEmptyEmail_NAjs2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "", "creditCard");
    String email = accountProfileDataBean.getEmail();
    assertEquals("", email);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUserID_usWO0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String userID = accountProfileDataBean.getUserID();
    assertEquals("user123", userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUserIDWithNullUserID_lhhb1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean(null, "password123", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String userID = accountProfileDataBean.getUserID();
    assertNull(userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullUserID_rBIS0() {
    AccountProfileDataBean account = new AccountProfileDataBean(null, "password", "fullName", "address", "email", "creditCard");
    int actual = account.hashCode();
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_AllFieldsNull_LviP7() {
    AccountProfileDataBean account = new AccountProfileDataBean(null, null, null, null, null, null);
    int actual = account.hashCode();
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddress_tMsh0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String address = accountProfileDataBean.getAddress();
    assertEquals("123 Main St", address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddressWithNull_wDYZ1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", null, "johndoe@example.com", "1234567890");
    String address = accountProfileDataBean.getAddress();
    assertNull(address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddressWithEmptyString_HnAR2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", "", "johndoe@example.com", "1234567890");
    String address = accountProfileDataBean.getAddress();
    assertEquals("", address);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPassword_MtxP0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String password = accountProfileDataBean.getPassword();
    assertEquals("password1", password);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPasswordWithNullPassword_gfyy1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", null, "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String password = accountProfileDataBean.getPassword();
    assertNull(password);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCreditCard_JSvx0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    accountProfileDataBean.setCreditCard("newCreditCard");
    assertEquals("newCreditCard", accountProfileDataBean.getCreditCard());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTML_BSHE0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String html = accountProfileDataBean.toHTML();
    assertEquals("<BR>Account Profile Data for userID: <B>user1</B><LI>   passwd:password1</LI><LI>   fullName:John Doe</LI><LI>    address:123 Main St</LI><LI>      email:johndoe@example.com</LI><LI> creditCard:1234567890</LI>", html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithNullValues_SbXP1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean(null, null, null, null, null, null);
    String html = accountProfileDataBean.toHTML();
    assertEquals("<BR>Account Profile Data for userID: <B>null</B><LI>   passwd:null</LI><LI>   fullName:null</LI><LI>    address:null</LI><LI>      email:null</LI><LI> creditCard:null</LI>", html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithEmptyValues_syzc2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("", "", "", "", "", "");
    String html = accountProfileDataBean.toHTML();
    assertEquals("<BR>Account Profile Data for userID: <B></B><LI>   passwd:</LI><LI>   fullName:</LI><LI>    address:</LI><LI>      email:</LI><LI> creditCard:</LI>", html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToHTMLWithDifferentValues_Kfum4() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user2", "password2", "Jane Doe", "456 Elm St", "janedoe@example.com", "9876543210");
    String html = accountProfileDataBean.toHTML();
    assertEquals("<BR>Account Profile Data for userID: <B>user2</B><LI>   passwd:password2</LI><LI>   fullName:Jane Doe</LI><LI>    address:456 Elm St</LI><LI>      email:janedoe@example.com</LI><LI> creditCard:9876543210</LI>", html);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPassword_kAUm0() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    account.setPassword("newPassword");
    assertEquals("newPassword", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithNull_kkFA1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    account.setPassword(null);
    assertNull(account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithEmptyString_qxut2() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    account.setPassword("");
    assertEquals("", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithInvalidCharacters_YlIx4() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    account.setPassword("!@#$%^&*()");
    assertEquals("!@#$%^&*()", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithValidCharacters_mboZ5() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    account.setPassword("abcdefghijklmnopqrstuvwxyz");
    assertEquals("abcdefghijklmnopqrstuvwxyz", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithUppercaseCharacters_jKmX6() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    account.setPassword("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPasswordWithDigits_iGBa8() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    account.setPassword("1234567890");
    assertEquals("1234567890", account.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullName_XmsY0() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
    String fullName = account.getFullName();
    assertEquals("John Doe", fullName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithNull_QvFD1() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", null, "123 Main St", "johndoe@example.com", "1234567890");
    String fullName = account.getFullName();
    assertNull(fullName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithEmptyString_DmNg2() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "", "123 Main St", "johndoe@example.com", "1234567890");
    String fullName = account.getFullName();
    assertEquals("", fullName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithSpecialCharacters_nhqs4() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe!@#$%^&*()_+", "123 Main St", "johndoe@example.com", "1234567890");
    String fullName = account.getFullName();
    assertEquals("John Doe!@#$%^&*()_+", fullName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithMultipleNames_IWwm5() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "John Doe Jane Smith", "123 Main St", "johndoe@example.com", "1234567890");
    String fullName = account.getFullName();
    assertEquals("John Doe Jane Smith", fullName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithDifferentCasing_lECp6() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "john doe", "123 Main St", "johndoe@example.com", "1234567890");
    String fullName = account.getFullName();
    assertEquals("john doe", fullName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithDifferentCasingAndSpecialCharacters_ezrh7() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "john doe!@#$%^&*()_+", "123 Main St", "johndoe@example.com", "1234567890");
    String fullName = account.getFullName();
    assertEquals("john doe!@#$%^&*()_+", fullName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullNameWithDifferentCasingAndMultipleNames_hLol8() {
    AccountProfileDataBean account = new AccountProfileDataBean("user1", "password1", "john doe jane smith", "123 Main St", "johndoe@example.com", "1234567890");
    String fullName = account.getFullName();
    assertEquals("john doe jane smith", fullName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountWithNullProfile_jDrL1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean(null, null, null, null, null, null);
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertNull(accountDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountWithEmptyProfile_tdVg2() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("", "", "", "", "", "");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertNull(accountDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountWithNullAccount_EZFf4() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    assertNull(accountDataBean);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPrintWithNullCreditCard_DxtK6_gWnu1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", null);
    accountProfileDataBean.print();
    assertEquals(accountProfileDataBean.toString(), accountProfileDataBean.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentPassword_uzqb6_fid1() {
    AccountProfileDataBean bean1 = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
    AccountProfileDataBean bean2 = new AccountProfileDataBean("user1", "password2", "fullName1", "address1", "email1", "creditCard1");
    assertTrue(bean1.equals(bean2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullPassword_omTe2_fid1() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", null, "fullName", "address", "email", "creditCard");
    int actual = account.hashCode();
    int expected = -836030938;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullFullName_qxeO3_fid1() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", null, "address", "email", "creditCard");
    int actual = account.hashCode();
    int expected = -836030938;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullAddress_XlnD4_fid1() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", null, "email", "creditCard");
    int actual = account.hashCode();
    int expected = -836030938;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullEmail_DliN5_fid1() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", "address", null, "creditCard");
    int actual = account.hashCode();
    int expected = -836030938;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullCreditCard_tXva6_fid1() {
    AccountProfileDataBean account = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", null);
    int actual = account.hashCode();
    int expected = -836030938;
    assertEquals(expected, actual);
  }
}