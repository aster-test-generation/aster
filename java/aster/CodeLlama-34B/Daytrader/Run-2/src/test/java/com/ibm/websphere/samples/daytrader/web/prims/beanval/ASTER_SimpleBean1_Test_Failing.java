/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.validation.ConstraintViolation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SimpleBean1_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCheckInjectionValidation_Valid_HoNc0_gbGx0() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
      assertTrue(e.getMessage().contains("Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial"));
    }
    simpleBean1.checkInjectionValidation();
    assertTrue(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolationsWithNullViolation_lWOl4_xduo0() {
    SimpleBean1 simpleBean1 = null;
    Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<>();
    cvSet.add(null);
    String result = simpleBean1.formatConstraintViolations(cvSet);
    assertEquals("", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCheckInjectionValidation_Valid_HoNc0_gbGx0_fid3() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
    simpleBean1.checkInjectionValidation();
    assertTrue(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCheckInjectionValidation_Invalid_kkUf1_msNd0() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
    }
    simpleBean1.checkInjectionValidation();
    assertFalse(true);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDesc_Eyuv0_EeLZ0() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
      e.printStackTrace();
    }
    String desc = simpleBean1.getDesc();
    assertEquals("pattern", desc);
  }
}