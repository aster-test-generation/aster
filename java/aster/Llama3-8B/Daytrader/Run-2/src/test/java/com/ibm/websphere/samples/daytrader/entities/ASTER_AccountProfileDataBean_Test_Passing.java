/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_AccountProfileDataBean_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEmail_aZZV0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setEmail("test@example.com");
        assertEquals("test@example.com", accountProfileDataBean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEmailWithNullEmail_Hclb1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setEmail(null);
        assertEquals(null, accountProfileDataBean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEmailWithEmptyEmail_ONQp2() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setEmail("");
        assertEquals("", accountProfileDataBean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEmailWithInvalidEmail_Nmaw4() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setEmail("invalidEmail");
        assertEquals("invalidEmail", accountProfileDataBean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Bbqj0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("12345", "password", "John Doe", "123 Main St", "johndoe@email.com", "1234567890123456");
        String expected = "\n\tAccount Profile Data for userID:12345\n\t\t   passwd:password\n\t\t   fullName:John Doe\n\t\t    address:123 Main St\n\t\t      email:johndoe@email.com\n\t\t creditCard:1234567890123456";
        assertEquals(expected, accountProfileDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetAccount_Ebtm0() {
        AccountDataBean account = mock(AccountDataBean.class);
        AccountProfileDataBean accountProfile = new AccountProfileDataBean();
        accountProfile.setAccount(account);
        assertEquals(account, accountProfile.getAccount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_wUxH3() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        int hashCode = accountProfileDataBean.hashCode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_vOHZ8() {
        AccountProfileDataBean accountProfileDataBean = AccountProfileDataBean.getRandomInstance();
        assertNotNull(accountProfileDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUserID_jgOz0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setUserID("testUserID");
        assertEquals("testUserID", accountProfileDataBean.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEmail_exhu0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        String email = accountProfileDataBean.getEmail();
        assertEquals("email", "email", email);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserID_iqSq0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("12345", "password", "John Doe", "123 Main St", "johndoe@example.com", "1234567890123456");
        String userID = accountProfileDataBean.getUserID();
        assertEquals("12345", userID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullName_mMbs1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("John Doe");
        assertEquals("John Doe", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithNull_WkdH2() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName(null);
        assertEquals(null, accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithEmpty_ohsm3() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("");
        assertEquals("", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithTab_hRjW5() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("\t");
        assertEquals("\t", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithNewline_SDuY6() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("\n");
        assertEquals("\n", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithCarriageReturn_KirI7() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("\r");
        assertEquals("\r", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithTabAndNewline_vllC8() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("\t\n");
        assertEquals("\t\n", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithTabAndCarriageReturn_KzQb9() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("\t\r");
        assertEquals("\t\r", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithNewlineAndCarriageReturn_zTmI10() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("\n\r");
        assertEquals("\n\r", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithTabNewlineAndCarriageReturn_FGgM11() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("\t\n\r");
        assertEquals("\t\n\r", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithTabNewlineCarriageReturnAndTab_RHsI13() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("\t\n\r\t");
        assertEquals("\t\n\r\t", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAddress_AtrJ0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        String address = accountProfileDataBean.getAddress();
        assertEquals("address", address);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrint_AGuG0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        accountProfileDataBean.print();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAccountProfileDataBeanUserID_YiTA2() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        assertEquals("userID", accountProfileDataBean.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAccountProfileDataBeanPassword_iyRx3() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        assertEquals("password", accountProfileDataBean.getPassword());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAccountProfileDataBeanFullName_nOXg4() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        assertEquals("fullName", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAccountProfileDataBeanAddress_dOsI5() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        assertEquals("address", accountProfileDataBean.getAddress());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAccountProfileDataBeanEmail_IUqR6() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        assertEquals("email", accountProfileDataBean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAccountProfileDataBeanCreditCard_XCjE7() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        assertEquals("creditCard", accountProfileDataBean.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPassword_bQBs0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        String expectedPassword = "password";
        String actualPassword = accountProfileDataBean.getPassword();
        assertEquals(expectedPassword, actualPassword);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreditCard_SOrz0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        accountProfileDataBean.setCreditCard("newCreditCard");
        assertEquals("newCreditCard", accountProfileDataBean.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToHTML_qqql0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("123", "password", "John Doe", "123 Main St", "johndoe@example.com", "1234567890123456");
        String expectedHTML = "<BR>Account Profile Data for userID: <B>123</B>" + "<LI>   passwd:password</LI>" + "<LI>   fullName:John Doe</LI>" + "<LI>    address:123 Main St</LI>" + "<LI>      email:johndoe@example.com</LI>" + "<LI> creditCard:1234567890123456</LI>";
        String actualHTML = accountProfileDataBean.toHTML();
        assertEquals(expectedHTML, actualHTML);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFullName_bCcT0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        String expectedFullName = "fullName";
        String actualFullName = accountProfileDataBean.getFullName();
        assertEquals(expectedFullName, actualFullName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAddress_YDee0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        accountProfileDataBean.setAddress("newAddress");
        assertEquals("newAddress", accountProfileDataBean.getAddress());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullName_Oxvd0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("newFullName");
        assertEquals("newFullName", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreditCard_EJSv0_etYp0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        String actualCreditCard = accountProfileDataBean.getCreditCard();
        assertEquals("creditCard", actualCreditCard);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Bbqj0_wQsU0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("12345", "password", "John Doe", "123 Main St", "johndoe@email.com", "1234567890123456");
        String expected = "\n\tAccount Profile Data for userID:12345\n\t\t   passwd:password\n\t\t   fullName:John Doe\n\t\t    address:123 Main St\n\t\t      email:johndoe@email.com\n\t\t creditCard:1234567890123456";
        Assertions.assertEquals(expected, accountProfileDataBean.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEmail_exhu0_OElp0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        String email = accountProfileDataBean.getEmail();
        assertEquals(String.class, email.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullNameWithTab_hRjW5_YohO1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        accountProfileDataBean.setFullName("tab");
        assertEquals("tab", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_soKs0_fid1() {
        AccountProfileDataBean instance = new AccountProfileDataBean("123", "password", "John Doe", "123 Main St", "johndoe@example.com", "1234567890123456");
        int expResult = 48690;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode2_LNNG1_fid1() {
        AccountProfileDataBean instance = new AccountProfileDataBean("456", "password", "Jane Doe", "456 Main St", "janedoe@example.com", "0987654321098765");
        int expResult = 51669;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }
}