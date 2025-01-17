/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.jaxrs;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TestJSONObject_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0005WithNull_VLPE1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0005();
    String expected = null;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0005WithInvalidString_jaaE4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0005();
    String expected = "invalid";
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0014_HUxy0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0014("test");
    assertEquals("test", testJSONObject.getProp0014());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0014WithNull_Suos1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0014(null);
    assertNull(testJSONObject.getProp0014());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0014WithEmptyString_xitj2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0014("");
    assertEquals("", testJSONObject.getProp0014());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_null_MWMW0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012(null);
    assertEquals(null, testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_emptyString_NGhm1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012("");
    assertEquals("", testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_singleCharacter_eVFH3() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012("a");
    assertEquals("a", testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_multipleCharacters_BWeJ4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012("test123");
    assertEquals("test123", testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_specialCharacter_ZdUQ5() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012("test with space");
    assertEquals("test with space", testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_number_XmHL6() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012("123");
    assertEquals("123", testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_boolean_yDvw7() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012("true");
    assertEquals("true", testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_nullCharacter_pYZv8() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012("\0");
    assertEquals("\0", testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_nonPrintableCharacter_vLtD9() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012("\u0000");
    assertEquals("\u0000", testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0012_nonASCIICharacter_yBOT10() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0012("test\u00A0");
    assertEquals("test\u00A0", testJSONObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0002WithNull_Hzol1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = null;
    String actual = testJSONObject.getProp0002();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0002WithInvalidString_vkob4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "invalid";
    String actual = testJSONObject.getProp0002();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0013_OSvC0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0013("test");
    assertEquals("test", testJSONObject.getProp0013());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009_rUvt0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0009("test");
    assertEquals("test", testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009WithNull_RpAm1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0009(null);
    assertNull(testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009WithEmptyString_mJkF2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0009("");
    assertEquals("", testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009WithInvalidString_vtxj3() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0009("invalid");
    assertEquals("invalid", testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008_eXOl0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008("test");
    Assertions.assertEquals("test", testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008WithNull_kIDP1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008(null);
    Assertions.assertNull(testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008WithEmptyString_syyG2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008("");
    Assertions.assertEquals("", testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008WithInvalidValue_WgyF4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008("invalid");
    Assertions.assertEquals("invalid", testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008WithValidValue_hmqU5() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008("valid");
    Assertions.assertEquals("valid", testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008WithDifferentCase_kuod6() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008("TEST");
    Assertions.assertEquals("TEST", testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008WithDifferentCaseAndWhitespaceAndInvalidValue_iqIN8() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008(" TEST INVALID ");
    Assertions.assertEquals(" TEST INVALID ", testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008WithDifferentCaseAndWhitespaceAndValidValue_ohnU9() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008(" TEST VALID ");
    Assertions.assertEquals(" TEST VALID ", testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008WithDifferentCaseAndWhitespaceAndInvalidValueAndValidValue_BHnp10() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008(" TEST INVALID VALID ");
    Assertions.assertEquals(" TEST INVALID VALID ", testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008WithDifferentCaseAndWhitespaceAndValidValueAndInvalidValue_pwvv11() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0008(" TEST VALID INVALID ");
    Assertions.assertEquals(" TEST VALID INVALID ", testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011_ZCes0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011("test");
    assertEquals("test", testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithNull_WghT1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011(null);
    assertNull(testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithEmptyString_untb2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011("");
    assertEquals("", testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithInvalidValue_FJPp4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011("invalid");
    assertEquals("invalid", testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithValidValue_QkVL5() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011("valid");
    assertEquals("valid", testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithDifferentCase_mTTF6() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011("Test");
    assertEquals("Test", testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithDifferentCaseAndWhitespaceAndInvalidValue_zQjs8() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011(" Test invalid ");
    assertEquals(" Test invalid ", testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithDifferentCaseAndWhitespaceAndValidValue_jAaa9() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011(" Test valid ");
    assertEquals(" Test valid ", testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithDifferentCaseAndWhitespaceAndInvalidValueAndValidValue_SnTf10() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011(" Test invalid valid ");
    assertEquals(" Test invalid valid ", testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithDifferentCaseAndWhitespaceAndValidValueAndInvalidValue_HOZR11() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0011(" Test valid invalid ");
    assertEquals(" Test valid invalid ", testJSONObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0011WithDifferentCaseAndWhitespaceAndInvalidValueAndValidValueAndWhitespace_Kwwx13() {
    TestJSONObject testJSONObject = new TestJSONObject();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0007_JdXe0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0007("test");
    assertEquals("test", testJSONObject.getProp0007());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0007WithNull_ECqJ1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0007(null);
    assertNull(testJSONObject.getProp0007());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0007WithEmptyString_HvLe2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0007("");
    assertEquals("", testJSONObject.getProp0007());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010_ARjX0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010("prop0010");
    assertEquals("prop0010", testJSONObject.getProp0010());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010WithNull_pVAy1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010(null);
    assertEquals(null, testJSONObject.getProp0010());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010WithEmptyString_Qzkg2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010("");
    assertEquals("", testJSONObject.getProp0010());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010WithInvalidString_qJLA4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010("invalid");
    assertNotNull(testJSONObject.getProp0010());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010WithValidString_rijW5() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010("prop0010");
    assertNotNull(testJSONObject.getProp0010());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010WithInvalidStringAndInvalidString_oouK12() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010("invalid");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0015_null_bpfa1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = null;
    String actual = testJSONObject.getProp0015();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011WithNull_eOyv1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = null;
    String actual = testJSONObject.getProp0011();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011WithInvalidString_wqHh4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "invalid";
    String actual = testJSONObject.getProp0011();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0006_kOTY0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0006("test");
    assertEquals("test", testJSONObject.getProp0006());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0006WithNull_fkPn1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0006(null);
    assertNull(testJSONObject.getProp0006());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0006WithEmptyString_eYVj2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0006("");
    assertEquals("", testJSONObject.getProp0006());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0006WithNumber_cnMV4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0006("123");
    assertEquals("123", testJSONObject.getProp0006());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0006WithSpecialCharacters_RiLb5() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0006("!@#$%^&*()_+");
    assertEquals("!@#$%^&*()_+", testJSONObject.getProp0006());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0006WithMultipleLines_EQVn6() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0006("line1\nline2\nline3");
    assertEquals("line1\nline2\nline3", testJSONObject.getProp0006());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0004_KBZc0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0004("test");
    assertEquals("test", testJSONObject.getProp0004());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0004WithNull_imHd1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0004(null);
    assertEquals(null, testJSONObject.getProp0004());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0004WithEmptyString_DWBk2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0004("");
    assertEquals("", testJSONObject.getProp0004());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0005_CpCJ0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0005("test");
    assertEquals("test", testJSONObject.getProp0005());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0005WithNull_aHkQ1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0005(null);
    assertNull(testJSONObject.getProp0005());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0005WithEmptyString_vChX2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0005("");
    assertEquals("", testJSONObject.getProp0005());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0001_frkb0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0001("test");
    assertEquals("test", testJSONObject.getProp0001());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0001_AlreadySet_sgBR1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0001("test");
    testJSONObject.setProp0001("test2");
    assertEquals("test2", testJSONObject.getProp0001());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0003_CFka0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0003("test");
    assertEquals("test", testJSONObject.getProp0003());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0009WithNull_lNxC1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0009();
    assertNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0015_Drkc0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0015("test");
    assertEquals("test", testJSONObject.getProp0015());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0015WithNull_tMYE1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0015(null);
    assertNull(testJSONObject.getProp0015());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0015WithEmptyString_mZzy2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0015("");
    assertEquals("", testJSONObject.getProp0015());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0008_null_mMyS1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = null;
    String actual = testJSONObject.getProp0008();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0007WithNull_GCBP1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0007();
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0007WithNonEmptyString_YXEb3() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0007();
    assertNotEquals("", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0007WithInvalidString_ddUm4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0007();
    assertNotEquals("invalid", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0007WithDifferentString_IpDI6() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0007();
    assertNotEquals("different", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0002_BAon0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0002("test");
    assertEquals("test", testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0002WithNull_uwus1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0002(null);
    assertNull(testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0002WithEmptyString_EhKu2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0002("");
    assertEquals("", testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0002WithInvalidValue_uLIR4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0002("invalid");
    assertEquals("invalid", testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0002WithValidValue_tWfN5() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0002("valid");
    assertEquals("valid", testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0002WithDifferentCase_aAFc6() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0002("TEST");
    assertEquals("TEST", testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0002WithDifferentCaseAndWhitespaceAndInvalidValue_xZrT8() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0002(" TEST INVALID ");
    assertEquals(" TEST INVALID ", testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0002WithDifferentCaseAndWhitespaceAndValidValue_vmML9() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0002(" TEST VALID ");
    assertEquals(" TEST VALID ", testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0016_EBDR0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016("prop0016");
    assertEquals("prop0016", testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0016WithNull_EBZm1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016(null);
    assertNull(testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0016WithEmptyString_Dyzj2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016("");
    assertEquals("", testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0016WithInvalidString_qHev3() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016("invalid");
    assertEquals("invalid", testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0016WithValidString_kvRH4() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016("valid");
    assertEquals("valid", testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0003_nullInput_pxsN1_lBpj0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0003();
    assertNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009WithNumber_aovK4_yKnf0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0009("123");
    assertEquals("123", testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009WithBoolean_luQf5_ZxzV0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0009("true");
    assertEquals("true", testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009WithObject_CdbE7_qCqy0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0009("new TestJSONObject()");
    assertEquals("new TestJSONObject()", testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0016WithNumber_AVxZ5_dKeY0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016("123");
    assertEquals("123", testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0016WithBoolean_qWsR6_aiVI0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016("true");
    assertEquals("true", testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0016WithArray_LCAb7_XKGT0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016("item1,item2");
    assertEquals("item1,item2", testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0001_cSrx0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0001";
    String actual = testJSONObject.getProp0001();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0005_flDb0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0005();
    String expected = "prop0005";
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0004_lhVP0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0004";
    String actual = testJSONObject.getProp0004();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0002WithNullObject_EyIf5_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = null;
    String actual = testJSONObject.getProp0002();
    assertNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0002WithEmptyStringAndNonEmptyString_Tliu11_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0002";
    String actual = testJSONObject.getProp0002();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010WithInvalidStringAndNull_IVvI6_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010("invalid");
    assertNull(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010WithValidStringAndNull_Bqcw7_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010("prop0010");
    assertNull(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010WithInvalidStringAndNonEmptyString_qxvL10_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010("invalid");
    assertEquals("invalid", testJSONObject.getProp0010());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0013_OHjp0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0013();
    String expected = "prop0013";
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0014_1_NrnC0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0014();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0014_2_sCVj1_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0014();
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011_ppPm0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0011";
    String actual = testJSONObject.getProp0011();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011WithEmptyString_hnVZ2_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "";
    String actual = testJSONObject.getProp0011();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011WithNullObject_TRzh5_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = null;
    String actual = testJSONObject.getProp0011();
    assertNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0012_lineCoverage_UjaW0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0012();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0009WithDifferentMethod_CZHe12_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0009();
  }
}