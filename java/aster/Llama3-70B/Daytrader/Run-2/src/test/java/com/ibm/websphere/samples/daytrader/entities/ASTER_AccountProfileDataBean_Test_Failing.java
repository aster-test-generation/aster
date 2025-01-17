/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AccountProfileDataBean_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPrint_pUnD0_qGyw0() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    String expected = "AccountProfileDataBean{userID='userID', password='password', fullName='fullName', address='address', email='email', creditCard='creditCard'}";
    assertEquals(expected, accountProfileDataBean.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPrint_pUnD0_qGyw0_fid1() {
    AccountProfileDataBean accountProfileDataBean = new AccountProfileDataBean("userID", "password", "fullName", "address", "email", "creditCard");
    String expected = "	Account Profile Data for userID:userID		   passwd:password		   fullName:fullName		    address:address		      email:email		 creditCard:creditCard";
    assertEquals(expected, accountProfileDataBean.toString());
}
}