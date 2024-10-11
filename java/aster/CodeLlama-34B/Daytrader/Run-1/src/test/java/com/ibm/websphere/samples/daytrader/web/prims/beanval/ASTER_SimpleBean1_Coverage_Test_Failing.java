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
import static org.mockito.Mockito.when;

public class Aster_SimpleBean1_Coverage_Test_Failing {
  private SimpleBean1 simpleBean1;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolations_nullCvSet_sVjN5_Fkux0() {
    Set<ConstraintViolation<SimpleBean1>> cvSet = null;
    StringBuffer msg = new StringBuffer();
    when(simpleBean1.formatConstraintViolations(cvSet)).thenReturn(msg.toString());
    assertEquals("", simpleBean1.formatConstraintViolations(cvSet));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolations_StringBuffer_NoNO1_InAe0() {
    Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<>();
    StringBuffer msg = new StringBuffer();
    when(simpleBean1.formatConstraintViolations(cvSet)).thenReturn(msg.toString());
    assertEquals("", simpleBean1.formatConstraintViolations(cvSet));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolations_forLoop_GZjx2_UOrC0() {
    Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<>();
    StringBuffer msg = new StringBuffer();
    when(simpleBean1.formatConstraintViolations(cvSet)).thenReturn(msg.toString());
    for (ConstraintViolation<SimpleBean1> cv : cvSet) {
      msg.append("\n\t" + cv.toString());
    }
    assertEquals(msg.toString(), simpleBean1.formatConstraintViolations(cvSet));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString1_NzNY0_qvBj0() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
      e.printStackTrace();
    }
    String result = simpleBean1.toString();
    assertNotNull(result);
    assertTrue(result.contains("iMin:"));
    assertTrue(result.contains("iMax:"));
    assertTrue(result.contains("iMinArray:"));
    assertTrue(result.contains("iMaxArray:"));
    assertTrue(result.contains("pattern:"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolations_nullCvSet_sVjN5_Fkux0_fid2() {
    Set<ConstraintViolation<SimpleBean1>> cvSet = null;
    StringBuffer msg = new StringBuffer();
    when(simpleBean1.formatConstraintViolations(cvSet)).thenReturn(msg.toString());
    assertEquals(msg.toString(), simpleBean1.formatConstraintViolations(cvSet));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolations_StringBuffer_NoNO1_InAe0_fid2() {
    Set<ConstraintViolation<SimpleBean1>> cvSet = new HashSet<>();
    StringBuffer msg = new StringBuffer();
    when(simpleBean1.formatConstraintViolations(cvSet)).thenReturn(msg.toString());
    assertEquals(msg.toString(), simpleBean1.formatConstraintViolations(cvSet));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDesc_nSkl0_zutG0() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
      e.printStackTrace();
    }
    String desc = simpleBean1.getDesc();
    assertEquals("pattern", desc);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString2_YRrn1_PkHt0() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
      e.printStackTrace();
    }
    String result = simpleBean1.toString();
    assertEquals("iMin:0 iMax:0 iMinArray:0 iMaxArray:0 pattern:null setToFail:false", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString1_NzNY0_qvBj0_fid2() {
    SimpleBean1 simpleBean1 = null;
    try {
      simpleBean1 = new SimpleBean1();
    } catch (Exception e) {
      e.printStackTrace();
    }
    String result = simpleBean1.toString();
    assertTrue(result.contains("iMin:"));
    assertTrue(result.contains("iMax:"));
    assertTrue(result.contains("iMinArray:"));
    assertTrue(result.contains("iMaxArray:"));
    assertTrue(result.contains("pattern:"));
  }
}