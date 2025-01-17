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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SimpleBean1_Coverage_Test_Failing {
  private SimpleBean1 simpleBean1;
  private ConstraintViolation<SimpleBean1> constraintViolation;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolations_EmptySet_JbPK0_iEZp0() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
      e.printStackTrace();
    }
    Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<>();
    String expected = "";
    String actual = simpleBean1.formatConstraintViolations(cvSet);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolations_NullViolation_BHjq4_ALFR0() {
    SimpleBean1 simpleBean1 = null;
    Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<>();
    cvSet.add(null);
    String expected = "\n\tnull";
    String actual = simpleBean1.formatConstraintViolations(cvSet);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolations_TraceLogger_NullSet_wkvC6_Nynw0() {
    SimpleBean1 simpleBean1 = null;
    Set<ConstraintViolation<SimpleBean1>> cvSet = null;
    String expected = "formatConstraintViolations []";
    String actual = simpleBean1.formatConstraintViolations(cvSet);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString1_mppa0_QQjQ0() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
      e.printStackTrace();
    }
    String result = simpleBean1.toString();
    assertEquals("iMin:null iMax:null iMinArray:null iMaxArray:null pattern:null setToFail:null", result);
  }
}