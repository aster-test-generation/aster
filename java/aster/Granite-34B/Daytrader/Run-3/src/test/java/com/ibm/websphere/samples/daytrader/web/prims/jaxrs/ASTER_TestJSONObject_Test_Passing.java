/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.jaxrs;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TestJSONObject_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0003WithCoverage_MNKn1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.getProp0003();
    testJSONObject.getProp0003();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0015_GIhU0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0015();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0014_eBNo0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String prop0014 = "value";
    testJSONObject.setProp0014(prop0014);
    assertEquals(prop0014, testJSONObject.getProp0014());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0014Null_LeIe1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String prop0014 = null;
    testJSONObject.setProp0014(prop0014);
    assertEquals(prop0014, testJSONObject.getProp0014());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0014Empty_mTDj2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String prop0014 = "";
    testJSONObject.setProp0014(prop0014);
    assertEquals(prop0014, testJSONObject.getProp0014());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009_QXdC0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String prop0009 = "test";
    testJSONObject.setProp0009(prop0009);
    assertEquals(prop0009, testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009WithNull_euVL1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String prop0009 = null;
    testJSONObject.setProp0009(prop0009);
    assertEquals(prop0009, testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009WithEmpty_bUje2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String prop0009 = "";
    testJSONObject.setProp0009(prop0009);
    assertEquals(prop0009, testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011_dOpg0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0011();
    assertEquals(testJSONObject.getProp0011(), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0001_FVwZ0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0001("value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0016_AKbR0_2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016("value");
    testJSONObject.setProp0016(null);
    assertEquals(null, testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008_buNg0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String prop0008 = "value";
    testJSONObject.setProp0008(prop0008);
    assertEquals(prop0008, testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008Null_GyUO1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String prop0008 = null;
    testJSONObject.setProp0008(prop0008);
    assertEquals(prop0008, testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0008Empty_ULgm2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String prop0008 = "";
    testJSONObject.setProp0008(prop0008);
    assertEquals(prop0008, testJSONObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0003_rchr0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0003("value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getProp0008_coverage_NtJV1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.getProp0008();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0015_ApMG0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0015("value0015");
    assertEquals("value0015", testJSONObject.getProp0015());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0015Null_RQts1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0015(null);
    assertNull(testJSONObject.getProp0015());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0013_xrwd0() {
    TestJSONObject obj = new TestJSONObject();
    String result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0013WithCoverage_wxGm1_1() {
    TestJSONObject obj = new TestJSONObject();
    String result = obj.getProp0013();
    result = obj.getProp0013();
    result = obj.getProp0013();
    result = obj.getProp0013();
    result = obj.getProp0013();
    result = obj.getProp0013();
    result = obj.getProp0013();
    result = obj.getProp0013();
    result = obj.getProp0013();
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0004_NUlD0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0004("Test");
    assertEquals("Test", testJSONObject.getProp0004());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0004Null_ficJ1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0004(null);
    assertEquals(null, testJSONObject.getProp0004());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0006_hIfq0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "test";
    testJSONObject.setProp0006(expected);
    String actual = testJSONObject.getProp0006();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getProp0007_RKWq0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0007();
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0016_AKbR0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0016("value");
    assertEquals("value", testJSONObject.getProp0016());
    testJSONObject.setProp0016(null);
    assertEquals(null, testJSONObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0013WithCoverage_wxGm1() {
    TestJSONObject obj = new TestJSONObject();
    String result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
    result = obj.getProp0013();
    assertEquals(result, obj.getProp0013());
  }
}