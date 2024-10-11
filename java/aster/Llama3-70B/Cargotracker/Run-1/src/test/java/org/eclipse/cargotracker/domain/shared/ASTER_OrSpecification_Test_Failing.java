/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.shared;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_OrSpecification_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSatisfiedBy_NullBoth_TNiC6_fid1() {
    Specification<String> spec1 = null;
    Specification<String> spec2 = null;
    OrSpecification<String> orSpec = new OrSpecification<>(spec1, spec2);
    assertFalse(orSpec.isSatisfiedBy("test"));
  }
}