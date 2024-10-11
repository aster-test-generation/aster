/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.jaxrs;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TestJSONObject_Test_Failing {
  private TestJSONObject testJSONObject;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0001_nRif0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0001();
    assertEquals("prop0001", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0005_pVOH0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0005";
    String actual = testJSONObject.getProp0005();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0005_Empty_NJtF2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "";
    String actual = testJSONObject.getProp0005();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0004_mhYn0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0004";
    String actual = testJSONObject.getProp0004();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0004WithEmptyString_duUc2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "";
    String actual = testJSONObject.getProp0004();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0003_lFnL0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0003";
    String actual = testJSONObject.getProp0003();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0002_xKPK0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0002();
    String expected = "prop0002";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0002_lineCoverage_NdPj1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0002();
    String expected = "prop0002";
    assertEquals(expected, actual);
    assertEquals(expected, testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0002_branchCoverage_KkeP2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0002();
    String expected = "prop0002";
    assertEquals(expected, actual);
    assertEquals(expected, testJSONObject.getProp0002());
    assertEquals(expected, testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0010_InvalidValue_AYFz3() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0010("invalid");
    assertNull(testJSONObject.getProp0010());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0013_gFxK0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0013";
    String actual = testJSONObject.getProp0013();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0014_cKIe0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0014();
    assertEquals("prop0014", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0014WithEmptyString_oNhq2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0014();
    assertEquals("", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0015_KuCP0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0015();
    String expected = "prop0015";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0016_MNYp1() {
    String expected = "prop0016";
    String actual = testJSONObject.getProp0016();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0016WithNull_xCUR2() {
    String expected = null;
    String actual = testJSONObject.getProp0016();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0016WithEmptyString_IbBH3() {
    String expected = "";
    String actual = testJSONObject.getProp0016();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0016WithInvalidString_XEvo5() {
    String expected = "prop0016";
    String actual = testJSONObject.getProp0016();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0010_qTvt0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String result = testJSONObject.getProp0010();
    assertEquals("prop0010", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0011_xwNG0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0011";
    String actual = testJSONObject.getProp0011();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0012_SzYI0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0012();
    assertEquals("prop0012", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0009_ewmY0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0009";
    String actual = testJSONObject.getProp0009();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0008_QiKl0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0008";
    String actual = testJSONObject.getProp0008();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0007_ACue0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0007();
    String expected = "prop0007";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0007_empty_eAsQ2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0007();
    assertEquals("", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0006_glJU0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0006";
    String actual = testJSONObject.getProp0006();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0006WithEmptyString_DRCl2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "";
    String actual = testJSONObject.getProp0006();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0002_lineCoverage_NdPj1_2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0002();
    String expected = "prop0002";
    assertEquals(expected, testJSONObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009_igeG1_1() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0009("test");
    testJSONObject.setProp0009("test2");
    testJSONObject.setProp0009("test3");
    assertEquals("test", testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProp0009_igeG1_2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0009("test");
    testJSONObject.setProp0009("test2");
    testJSONObject.setProp0009("test3");
    assertEquals("test2", testJSONObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0004WithEmptyStringParameter_qqyY6_cmif0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "";
    String actual = testJSONObject.getProp0016();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0013WithEmptyString_etkN2_REtE0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "";
    String actual = testJSONObject.getProp0013();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0005_pVOH0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0005";
    String actual = testJSONObject.getProp0005();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0005_Empty_NJtF2_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "";
    String actual = testJSONObject.getProp0005();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0004_mhYn0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0004";
    String actual = testJSONObject.getProp0004();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0004WithEmptyString_duUc2_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "";
    String actual = testJSONObject.getProp0004();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0003_lFnL0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String expected = "prop0003";
    String actual = testJSONObject.getProp0003();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProp0002_xKPK0_fid2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    String actual = testJSONObject.getProp0002();
    String expected = "prop0002";
    assertNull(expected);
  }
}