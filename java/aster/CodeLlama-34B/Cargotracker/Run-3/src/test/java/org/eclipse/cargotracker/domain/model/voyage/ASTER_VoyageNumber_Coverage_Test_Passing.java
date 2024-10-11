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
  public void testEquals_SameObject_dxCD0() {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    assertTrue(voyageNumber.equals(voyageNumber));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_EAnR1() {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    assertFalse(voyageNumber.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_lbFY2() {
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    assertFalse(voyageNumber.equals("12345"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameValue_jYiS3() {
    VoyageNumber voyageNumber1 = new VoyageNumber("12345");
    VoyageNumber voyageNumber2 = new VoyageNumber("12345");
    assertTrue(voyageNumber1.equals(voyageNumber2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentValue_Abzs4() {
    VoyageNumber voyageNumber1 = new VoyageNumber("12345");
    VoyageNumber voyageNumber2 = new VoyageNumber("54321");
    assertFalse(voyageNumber1.equals(voyageNumber2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObjectWithDifferentConstructor_UiGs5() {
    VoyageNumber voyageNumber1 = new VoyageNumber("12345");
    VoyageNumber voyageNumber2 = new VoyageNumber();
    assertFalse(voyageNumber1.equals(voyageNumber2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_LRHX0() {
    VoyageNumber vn1 = new VoyageNumber("12345");
    VoyageNumber vn2 = new VoyageNumber("12345");
    assertTrue(vn1.sameValueAs(vn2));
  }
}