/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.jaxrs;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_XMLObject_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getProp0015_HCEA0() {
    XMLObject object = new XMLObject();
    String result = object.getProp0015();
    assertEquals("some expected value", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getProp0014_tHBM0() {
    XMLObject xmlObject = new XMLObject();
    String actual = xmlObject.getProp0014();
    assertEquals("some expected value", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getProp0005_ieim1() {
    XMLObject xmlObject = new XMLObject();
    String actual = xmlObject.getProp0005();
    String expected = "default_value";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getProp0005_tKLf3() {
    XMLObject xmlObject = new XMLObject();
    String actual = xmlObject.getProp0005();
    String expected = "new_value";
    xmlObject.setProp0005(expected);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getProp0001_IiVj0_wnSp0() {
    XMLObject xmlObject = new XMLObject();
    String expected = "expectedValue";
    String actual = xmlObject.getProp0001();
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011_ybYE0_Tomz0() {
    XMLObject xmlObject = new XMLObject();
    String actual = xmlObject.getProp0011();
    String expected = "expectedValue";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0016_YgkN1_MKvt0() {
    XMLObject xmlObject = new XMLObject();
    String actual = xmlObject.getProp0016();
    String expected = "test";
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0016_aghQ0_WknN0() {
    XMLObject xmlObject = new XMLObject();
    String actual = xmlObject.getProp0016();
    String expected = ""; // Initialize expected value based on the method's return type
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011_olNh8_pLXx0() {
    XMLObject xmlObject = new XMLObject();
    xmlObject.setProp0011("abcde");
    String actual = xmlObject.getProp0002();
    String expected = "abcde";
    org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getProp0005_ieim1_fid1() {
    XMLObject xmlObject = new XMLObject();
    String actual = xmlObject.getProp0005();
    String expected = "default_value";
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getProp0005_tKLf3_fid1() {
    XMLObject xmlObject = new XMLObject();
    String actual = xmlObject.getProp0005();
    String expected = "new_value";
    xmlObject.setProp0005(expected);
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011_ybYE0_Tomz0_fid1() {
    XMLObject xmlObject = new XMLObject();
    String actual = xmlObject.getProp0011();
    String expected = "expectedValue";
    assertNull(expected);
  }
}