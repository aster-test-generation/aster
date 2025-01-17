/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeAppJSF_Test_Failing {
  private TradeServices tradeAction;
  private String userID = "uid:0";
  private String password = "xxx";
  private TradeAppJSF tradeAppJSF;
  @Mock
  private TradeServices tradeServices;
  private String cpassword;
  private String ccn;
  private String address;
  private String fullname;
  private String money;
  private String email;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithNull_DWiK1() {
    tradeAppJSF.setUserID(null);
    assertEquals(null, tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithEmptyString_dnye2() {
    tradeAppJSF.setUserID("");
    assertEquals("", tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithInvalidString_izYE3() {
    tradeAppJSF.setUserID("invalidUserID");
    assertEquals("invalidUserID", tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithValidString_dwJq4() {
    tradeAppJSF.setUserID("validUserID");
    assertEquals("validUserID", tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithDifferentCase_dHJt5() {
    tradeAppJSF.setUserID("TestUserID");
    assertEquals("TestUserID", tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithWhitespace_pNmF6() {
    tradeAppJSF.setUserID(" testUserID ");
    assertEquals(" testUserID ", tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithSpecialCharacters_dKKc7() {
    tradeAppJSF.setUserID("testUserID!");
    assertEquals("testUserID!", tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithMultipleSpecialCharacters_yLKf8() {
    tradeAppJSF.setUserID("testUserID!@#$%^&*()_+");
    assertEquals("testUserID!@#$%^&*()_+", tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithMaxLength_huZB9() {
    tradeAppJSF.setUserID("testUserID".repeat(100));
    assertEquals("testUserID".repeat(100), tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithMinLength_ElBk10() {
    tradeAppJSF.setUserID("testUserID".repeat(1));
    assertEquals("testUserID".repeat(1), tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithInvalidLength_MkNW11() {
    tradeAppJSF.setUserID("testUserID".repeat(101));
    assertEquals("testUserID".repeat(101), tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithValidLength_zwMA12() {
    tradeAppJSF.setUserID("testUserID".repeat(10));
    assertEquals("testUserID".repeat(10), tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserIDWithDifferentLength_zbmj13() {
    tradeAppJSF.setUserID("testUserID".repeat(5));
    assertEquals("testUserID".repeat(5), tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserID_CXhw0() {
    String userID = "testUserID";
    tradeAppJSF.setUserID(userID);
    assertEquals(userID, tradeAppJSF.getUserID());
  }
}