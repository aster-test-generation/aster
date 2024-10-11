/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VoyageNumber_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_MQuF0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    assertTrue(voyageNumber.equals(voyageNumber), "A VoyageNumber should be equal to itself.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_kXqD1() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    assertFalse(voyageNumber.equals(null), "A VoyageNumber should not be equal to null.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_mdkn2() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Object differentClassObject = new Object();
    assertFalse(voyageNumber.equals(differentClassObject), "A VoyageNumber should not be equal to an object of a different class.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentVoyageNumber_XxjH3() {
    VoyageNumber voyageNumber1 = new VoyageNumber("123");
    VoyageNumber voyageNumber2 = new VoyageNumber("456");
    assertFalse(voyageNumber1.equals(voyageNumber2), "Two different VoyageNumbers should not be equal.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameVoyageNumber_mJal4() {
    VoyageNumber voyageNumber1 = new VoyageNumber("123");
    VoyageNumber voyageNumber2 = new VoyageNumber("123");
    assertTrue(voyageNumber1.equals(voyageNumber2), "Two identical VoyageNumbers should be equal.");
  }
}