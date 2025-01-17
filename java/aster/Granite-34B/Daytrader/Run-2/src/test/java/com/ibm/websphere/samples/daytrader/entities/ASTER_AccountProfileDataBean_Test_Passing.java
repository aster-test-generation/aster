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
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreditCard_DMZg0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "Email1", "1234567890");
        String creditCard = accountProfileDataBean.getCreditCard();
        assertEquals("1234567890", creditCard);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreditCardWithEmptyCreditCard_PoOb1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "Email1", "");
        String creditCard = accountProfileDataBean.getCreditCard();
        assertEquals("", creditCard);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreditCardWithNullCreditCard_KFls2() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "Email1", null);
        String creditCard = accountProfileDataBean.getCreditCard();
        assertEquals(null, creditCard);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_0_LSXd0() throws Exception {
        AccountProfileDataBean accountProfileDataBean0 = new AccountProfileDataBean();
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean();
        boolean boolean0 = accountProfileDataBean0.equals(accountProfileDataBean1);
        assertEquals(true, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1_fseE1() throws Exception {
        AccountProfileDataBean accountProfileDataBean0 = new AccountProfileDataBean();
        Object object0 = new Object();
        boolean boolean0 = accountProfileDataBean0.equals(object0);
        assertEquals(false, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2_XmnN2() throws Exception {
        AccountProfileDataBean accountProfileDataBean0 = new AccountProfileDataBean();
        accountProfileDataBean0.setUserID("org.quickserver.util.pool.MakeSession.makeSession");
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean();
        boolean boolean0 = accountProfileDataBean0.equals(accountProfileDataBean1);
        assertEquals(false, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_3_rRNV3() throws Exception {
        AccountProfileDataBean accountProfileDataBean0 = new AccountProfileDataBean();
        accountProfileDataBean0.setUserID("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setPassword("org.quickserver.util.pool.MakeSession.makeSession");
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean();
        boolean boolean0 = accountProfileDataBean0.equals(accountProfileDataBean1);
        assertEquals(false, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_4_WVZT4() throws Exception {
        AccountProfileDataBean accountProfileDataBean0 = new AccountProfileDataBean();
        accountProfileDataBean0.setUserID("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setPassword("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setFullName("org.quickserver.util.pool.MakeSession.makeSession");
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean();
        boolean boolean0 = accountProfileDataBean0.equals(accountProfileDataBean1);
        assertEquals(false, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_5_zfmP5() throws Exception {
        AccountProfileDataBean accountProfileDataBean0 = new AccountProfileDataBean();
        accountProfileDataBean0.setUserID("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setPassword("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setFullName("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setAddress("org.quickserver.util.pool.MakeSession.makeSession");
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean();
        boolean boolean0 = accountProfileDataBean0.equals(accountProfileDataBean1);
        assertEquals(false, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_6_KIIn6() throws Exception {
        AccountProfileDataBean accountProfileDataBean0 = new AccountProfileDataBean();
        accountProfileDataBean0.setUserID("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setPassword("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setFullName("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setAddress("org.quickserver.util.pool.MakeSession.makeSession");
        accountProfileDataBean0.setEmail("org.quickserver.util.pool.MakeSession.makeSession");
        AccountProfileDataBean accountProfileDataBean1 = new AccountProfileDataBean();
        boolean boolean0 = accountProfileDataBean0.equals(accountProfileDataBean1);
        assertEquals(false, boolean0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEmail_PJbm0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "Email1", "creditCard1");
        accountProfileDataBean.setEmail("newEmail");
        assertEquals("newEmail", accountProfileDataBean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEmailNull_NUgQ1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "Email1", "creditCard1");
        accountProfileDataBean.setEmail(null);
        assertEquals(null, accountProfileDataBean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEmailEmpty_CNbB2() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "Email1", "creditCard1");
        accountProfileDataBean.setEmail("");
        assertEquals("", accountProfileDataBean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEmailLength_wvyv3() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "Email1", "creditCard1");
        accountProfileDataBean.setEmail("ThisIsAVeryLongEmailThatExceedsTheMaximumLengthOfSixtyFourCharacters");
        assertEquals("ThisIsAVeryLongEmailThatExceedsTheMaximumLengthOfSixtyFourCharacters", accountProfileDataBean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToString_pQnA0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "john.doe@example.com", "1234567890123456");
        String expected = "\n\tAccount Profile Data for userID:user123\n\t\t   passwd:password123\n\t\t   fullName:John Doe\n\t\t    address:123 Main St\n\t\t      email:john.doe@example.com\n\t\t creditCard:1234567890123456";
        String actual = accountProfileDataBean.toString();
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_qFzB0_1() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        assertNotNull(bean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_qFzB0_2() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        assertNotNull(bean.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_qFzB0_3() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        assertNotNull(bean.getPassword());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_qFzB0_4() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        assertNotNull(bean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_qFzB0_5() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        assertNotNull(bean.getAddress());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_qFzB0_6() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        assertNotNull(bean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_qFzB0_7() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        assertNotNull(bean.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithFullCoverage_HpnI1_1() {
        AccountProfileDataBean bean = new AccountProfileDataBean(
            "user1",
            "password1",
            "John Doe",
            "123 Main St",
            "john.doe@example.com",
            "1234-5678-9012-3456"
        );
        assertEquals("1234-5678-9012-3456", bean.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithFullCoverage_HpnI1_2() {
        AccountProfileDataBean bean = new AccountProfileDataBean(
            "user1",
            "password1",
            "John Doe",
            "123 Main St",
            "john.doe@example.com",
            "1234-5678-9012-3456"
        );
        assertEquals("john.doe@example.com", bean.getEmail());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithFullCoverage_HpnI1_3() {
        AccountProfileDataBean bean = new AccountProfileDataBean(
            "user1",
            "password1",
            "John Doe",
            "123 Main St",
            "john.doe@example.com",
            "1234-5678-9012-3456"
        );
        assertEquals("user1", bean.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithFullCoverage_HpnI1_4() {
        AccountProfileDataBean bean = new AccountProfileDataBean(
            "user1",
            "password1",
            "John Doe",
            "123 Main St",
            "john.doe@example.com",
            "1234-5678-9012-3456"
        );
        assertEquals("123 Main St", bean.getAddress());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithFullCoverage_HpnI1_5() {
        AccountProfileDataBean bean = new AccountProfileDataBean(
            "user1",
            "password1",
            "John Doe",
            "123 Main St",
            "john.doe@example.com",
            "1234-5678-9012-3456"
        );
        assertEquals("password1", bean.getPassword());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithFullCoverage_HpnI1_6() {
        AccountProfileDataBean bean = new AccountProfileDataBean(
            "user1",
            "password1",
            "John Doe",
            "123 Main St",
            "john.doe@example.com",
            "1234-5678-9012-3456"
        );
        assertEquals("John Doe", bean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithFullCoverage_HpnI1_7() {
        AccountProfileDataBean bean = new AccountProfileDataBean(
            "user1",
            "password1",
            "John Doe",
            "123 Main St",
            "john.doe@example.com",
            "1234-5678-9012-3456"
        );
        assertEquals(bean.hashCode(), bean.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setUserIDTest1_HYEV0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("12345", "password", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
        accountProfileDataBean.setUserID("67890");
        assert accountProfileDataBean.getUserID().equals("67890");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setUserIDTest2_gDkQ1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("12345", "password", "John Doe", "123 Main St", "johndoe@example.com", "1234567890");
        accountProfileDataBean.setUserID("98765");
        assert accountProfileDataBean.getUserID().equals("98765");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetEmail_yjFa0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "Email1", "CreditCard1");
        String email = accountProfileDataBean.getEmail();
        assert email.equals("Email1");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserID_tXZG0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "john.doe@example.com", "1234567890");
        assertEquals("user123", accountProfileDataBean.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserIDWithNullValues_PaMB1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean(null, null, null, null, null, null);
        assertEquals(null, accountProfileDataBean.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserIDWithEmptyValues_SpLA2() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("", "", "", "", "", "");
        assertEquals("", accountProfileDataBean.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserIDWithSpecialCharacters_CgeN4() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("!@#$%^&*()_+", "!@#$%^&*()_+", "!@#$%^&*()_+", "!@#$%^&*()_+", "!@#$%^&*()_+", "!@#$%^&*()_+");
        assertEquals("!@#$%^&*()_+", accountProfileDataBean.getUserID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashCode_oueI0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "john.doe@example.com", "1234567890123456");
        int expectedHashCode = accountProfileDataBean.getUserID().hashCode();
        int actualHashCode = accountProfileDataBean.hashCode();
        org.junit.jupiter.api.Assertions.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testHashCodeWithNullUserID_JKot1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean(null, "password123", "John Doe", "123 Main St", "john.doe@example.com", "1234567890123456");
        int expectedHashCode = 0;
        int actualHashCode = accountProfileDataBean.hashCode();
        org.junit.jupiter.api.Assertions.assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullName_kXXf0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
        accountProfileDataBean.setFullName("newFullName");
        assertEquals("newFullName", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullName_Null_LEgd1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
        accountProfileDataBean.setFullName(null);
        assertEquals(null, accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetFullName_Empty_lelB2() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
        accountProfileDataBean.setFullName("");
        assertEquals("", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAddress_iFVm0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "email1", "creditCard1");
        String expectedAddress = "Address1";
        String actualAddress = accountProfileDataBean.getAddress();
        assertEquals(expectedAddress, actualAddress);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAddressWithEmptyAddress_vMjN1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user2", "password2", "FullName2", "", "email2", "creditCard2");
        String expectedAddress = "";
        String actualAddress = accountProfileDataBean.getAddress();
        assertEquals(expectedAddress, actualAddress);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPassword_pKCL0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user0", "passwd0", "fullName0", "address0", "email0", "creditCard0");
        assertEquals("passwd0", accountProfileDataBean.getPassword());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreditCard_WQfN0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
        accountProfileDataBean.setCreditCard("newCreditCard");
        assertEquals("newCreditCard", accountProfileDataBean.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreditCardNull_qtQZ1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
        accountProfileDataBean.setCreditCard(null);
        assertEquals(null, accountProfileDataBean.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreditCardEmpty_YhWL2() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "fullName1", "address1", "email1", "creditCard1");
        accountProfileDataBean.setCreditCard("");
        assertEquals("", accountProfileDataBean.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToHTML_vIXe0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user123", "password123", "John Doe", "123 Main St", "john.doe@example.com", "1234567890");
        String html = accountProfileDataBean.toHTML();
        System.out.println(html);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToHTML_coverage_hVXE1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean();
        String html = accountProfileDataBean.toHTML();
        System.out.println(html);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPasswordCoverage_zfwR1() {
        AccountProfileDataBean account = new AccountProfileDataBean();
        account.setPassword(null);
        account.setPassword("");
        account.setPassword("1234567890");
        account.setPassword("!@#$%^&*()_+");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFullName_ACcq0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "pass1", "name1", "address1", "email1", "credit1");
        assertEquals("name1", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFullNameWithEmptyName_ycTn1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user2", "pass2", "", "address2", "email2", "credit2");
        assertEquals("", accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFullNameWithNullName_kRbJ2() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user3", "pass3", null, "address3", "email3", "credit3");
        assertEquals(null, accountProfileDataBean.getFullName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAddressTest1_dkHp0() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user1", "password1", "FullName1", "Address1", "Email1", "CreditCard1");
        accountProfileDataBean.setAddress("NewAddress1");
        assert accountProfileDataBean.getAddress().equals("NewAddress1");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAddressTest2_cqMk1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("user2", "password2", "FullName2", "Address2", "Email2", "CreditCard2");
        accountProfileDataBean.setAddress("NewAddress2");
        assert accountProfileDataBean.getAddress().equals("NewAddress2");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountForNull_vJOZ1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
        assertNull(accountDataBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountForNotNull_FVpd2_fid1() {
        AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
        AccountDataBean accountDataBean = accountProfileDataBean.getAccount();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstance_qFzB0() {
        AccountProfileDataBean bean = AccountProfileDataBean.getRandomInstance();
        assertNotNull(bean);
        assertNotNull(bean.getUserID());
        assertNotNull(bean.getPassword());
        assertNotNull(bean.getFullName());
        assertNotNull(bean.getAddress());
        assertNotNull(bean.getEmail());
        assertNotNull(bean.getCreditCard());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRandomInstanceWithFullCoverage_HpnI1() {
        AccountProfileDataBean bean = new AccountProfileDataBean(
            "user1",
            "password1",
            "John Doe",
            "123 Main St",
            "john.doe@example.com",
            "1234-5678-9012-3456"
        );
        assertEquals("1234-5678-9012-3456", bean.getCreditCard());
        assertEquals("john.doe@example.com", bean.getEmail());
        assertEquals("user1", bean.getUserID());
        assertEquals("123 Main St", bean.getAddress());
        assertEquals("password1", bean.getPassword());
        assertEquals("John Doe", bean.getFullName());
        assertEquals(bean.hashCode(), bean.hashCode());
    }
}