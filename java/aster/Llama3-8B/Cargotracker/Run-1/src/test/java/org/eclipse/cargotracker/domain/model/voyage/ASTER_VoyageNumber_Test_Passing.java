/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VoyageNumber_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_aKMl0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    String result = voyageNumber.getIdString();
    assert result.equals("123");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsSameObject_cgZA0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    boolean result = voyageNumber.equals(voyageNumber);
    assert result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsNull_QTig1() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    boolean result = voyageNumber.equals(null);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsDifferentClass_insf2() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Object object = new Object();
    boolean result = voyageNumber.equals(object);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsDifferentValue_hifv3() {
    VoyageNumber voyageNumber1 = new VoyageNumber("123");
    VoyageNumber voyageNumber2 = new VoyageNumber("456");
    boolean result = voyageNumber1.equals(voyageNumber2);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAsNull_KhsU0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    VoyageNumber other = null;
    boolean result = voyageNumber.sameValueAs(other);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAsDifferentNumber_rIbx1() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    VoyageNumber other = new VoyageNumber("456");
    boolean result = voyageNumber.sameValueAs(other);
    assert !result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAsSameNumber_Nbwu2() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    VoyageNumber other = new VoyageNumber("123");
    boolean result = voyageNumber.sameValueAs(other);
    assert result;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_boRF0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    assertEquals("123", voyageNumber.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_cskj0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    int result = voyageNumber.hashCode();
    assert result == "123".hashCode();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeEmptyString_Lqqd1() {
    VoyageNumber voyageNumber = new VoyageNumber("");
    int result = voyageNumber.hashCode();
    assert result == "".hashCode();
  }
}