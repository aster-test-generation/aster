/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.location;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnLocode_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_pmND0() throws Exception {
    UnLocode unLocode = new UnLocode("USNYC");
    String expected = "USNYC";
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Reflexive_lIHY0() throws Exception {
    UnLocode locode = new UnLocode("USNYC");
    assertTrue(locode.equals(locode));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Symmetric_CoxR1() throws Exception {
    UnLocode locode1 = new UnLocode("USNYC");
    UnLocode locode2 = new UnLocode("USNYC");
    assertTrue(locode1.equals(locode2) && locode2.equals(locode1));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_NoLA2() throws Exception {
    UnLocode locode = new UnLocode("USNYC");
    assertFalse(locode.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_Elqf3() throws Exception {
    UnLocode locode = new UnLocode("USNYC");
    Object other = new Object();
    assertFalse(locode.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringReturnsCorrectIdString_mcro0() throws Exception {
    UnLocode unLocode = new UnLocode("USNYC");
    assertEquals("USNYC", unLocode.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_WithSameUnLocode_ShouldReturnTrue_yJUK0() throws Exception {
    UnLocode unLocode1 = new UnLocode("USNYC");
    UnLocode unLocode2 = new UnLocode("USNYC");
    assertTrue(unLocode1.sameValueAs(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_WithDifferentUnLocode_ShouldReturnFalse_MRkb1() throws Exception {
    UnLocode unLocode1 = new UnLocode("USNYC");
    UnLocode unLocode2 = new UnLocode("GBLON");
    assertFalse(unLocode1.sameValueAs(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_WithNull_ShouldReturnFalse_ukIX2() throws Exception {
    UnLocode unLocode1 = new UnLocode("USNYC");
    UnLocode unLocode2 = null;
    assertFalse(unLocode1.sameValueAs(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCodeConsistency_NezJ0() throws Exception {
    UnLocode unLocode = new UnLocode("USNYC");
    int firstHash = unLocode.hashCode();
    int secondHash = unLocode.hashCode();
    assertEquals(firstHash, secondHash);
  }
}