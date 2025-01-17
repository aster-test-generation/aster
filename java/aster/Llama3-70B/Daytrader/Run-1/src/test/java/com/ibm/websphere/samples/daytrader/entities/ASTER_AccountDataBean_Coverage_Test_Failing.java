/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import javax.ejb.EJBException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AccountDataBean_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_IncorrectPassword_ThrowsEJBException_DJnx1() {
    AccountDataBean accountDataBean = new AccountDataBean();
    AccountProfileDataBean profile = new AccountProfileDataBean();
    profile.setPassword("wrongPassword");
    accountDataBean.setProfile(profile);
    try {
      accountDataBean.login("password");
      fail("Expected EJBException");
    } catch (EJBException e) {
      assertEquals("AccountBean:Login failure for account: null\n\tIncorrect password-->null:null", e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLogin_IncrementLoginCount_IncrementsLoginCount_ObqV7() {
    AccountDataBean accountDataBean = new AccountDataBean();
    int loginCount = 1;
    accountDataBean.setLoginCount(loginCount);
    accountDataBean.login("password");
    assertEquals(loginCount + 1, accountDataBean.getLoginCount());
  }
}