/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.shared;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_OrSpecification_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testIsSatisfiedBy_CQlU0() {
    Specification<Object> spec1 = mock(Specification.class);
    Specification<Object> spec2 = mock(Specification.class);
    OrSpecification<Object> orSpecification = new OrSpecification<>(spec1, spec2);
    Object obj = new Object();
    when(spec1.isSatisfiedBy(obj)).thenReturn(false);
    when(spec2.isSatisfiedBy(obj)).thenReturn(true);
    boolean result = orSpecification.isSatisfiedBy(obj);
    verify(spec1).isSatisfiedBy(obj);
    verify(spec2).isSatisfiedBy(obj);
  }
}