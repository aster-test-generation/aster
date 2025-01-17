/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_SimpleBean1_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFormatConstraintViolationsCalled_gKWc4_fQbr0() {
    SimpleBean1 simpleBean1 = mock(SimpleBean1.class);
    Validator validator = mock(Validator.class);
    Set<ConstraintViolation<SimpleBean1>> violations = new HashSet<>();
    ConstraintViolation<SimpleBean1> violation = mock(ConstraintViolation.class);
    violations.add(violation);
    when(validator.validate(simpleBean1)).thenReturn(violations);
    when(violation.getMessage()).thenReturn("Violation message");
    doThrow(new IllegalStateException()).when(simpleBean1).checkInjectionValidation();
    try {
      simpleBean1.checkInjectionValidation();
    } catch (IllegalStateException e) {
      SimpleBean1 spySimpleBean1 = spy(simpleBean1);
      spySimpleBean1.formatConstraintViolations(violations);
      verify(spySimpleBean1).formatConstraintViolations(violations);
    }
  }
}