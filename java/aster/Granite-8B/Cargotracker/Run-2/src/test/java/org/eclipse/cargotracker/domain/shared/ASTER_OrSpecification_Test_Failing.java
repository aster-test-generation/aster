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
  public void testIsSatisfiedByWithBothSpecificationsNull_aGdL2_1() {
    OrSpecification<String> orSpecification = new OrSpecification<>(
            null,
            null
    );
    assertFalse(orSpecification.isSatisfiedBy("test"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSatisfiedByWithBothSpecificationsNull_aGdL2_2() {
    OrSpecification<String> orSpecification = new OrSpecification<>(
            null,
            null
    );
    assertFalse(orSpecification.isSatisfiedBy("example"));
  }
}