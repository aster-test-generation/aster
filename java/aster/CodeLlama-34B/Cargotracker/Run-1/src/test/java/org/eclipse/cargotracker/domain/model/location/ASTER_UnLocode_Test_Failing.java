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

public class Aster_UnLocode_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_ValidInput_fEAS0() {
    UnLocode unLocode = new UnLocode("US");
    String idString = unLocode.getIdString();
    assertEquals("US", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_InvalidInput_TrRZ1() {
    UnLocode unLocode = new UnLocode("Invalid");
    String idString = unLocode.getIdString();
    assertNull(idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_NullInput_YmbU2() {
    UnLocode unLocode = new UnLocode("");
    String idString = unLocode.getIdString();
    assertEquals("", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_GWzZ0() {
    UnLocode unLocode = new UnLocode("US");
    assertEquals(unLocode, unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_Ufkh2() {
    UnLocode unLocode = new UnLocode("US");
    assertFalse(unLocode.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentValue_AWeu4() {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("CA");
    assertFalse(unLocode1.equals(unLocode2));
    // Fix the assertion to match the expected return type
    assertEquals(unLocode1.hashCode(), unLocode2.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullValue_YSzn5() {
    UnLocode unLocode = new UnLocode("US");
    assertTrue(unLocode.equals(new UnLocode(null)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_ypRz0() {
    UnLocode unLocode = new UnLocode("US");
    String expected = "US";
    String actual = unLocode.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_CA_kVOr1() {
    UnLocode unLocode = new UnLocode("CA");
    String expected = "CA";
    String actual = unLocode.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_MX_bhSm2() {
    UnLocode unLocode = new UnLocode("MX");
    String expected = "MX";
    String actual = unLocode.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_GB_lUsR3() {
    UnLocode unLocode = new UnLocode("GB");
    String expected = "GB";
    String actual = unLocode.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_Null_EQIs2() {
    UnLocode unLocode = new UnLocode("US");
    assertTrue(unLocode.sameValueAs(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_ValidInput_ONWR0() {
    UnLocode unlocode = new UnLocode("US");
    int expectedHashCode = "US".hashCode();
    int actualHashCode = unlocode.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullInput_zoZV1() {
    UnLocode unlocode = new UnLocode("");
    int expectedHashCode = 0;
    int actualHashCode = unlocode.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_InvalidInput_iMfV3() {
    UnLocode unlocode = new UnLocode("INVALID");
    int expectedHashCode = 0;
    int actualHashCode = unlocode.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_DifferentInput_ggyw4_1() {
    UnLocode unlocode1 = new UnLocode("USCHI");
    UnLocode unlocode2 = new UnLocode("CA");
    int expectedHashCode1 = "USCHI".hashCode();
    int expectedHashCode2 = "CA".hashCode();
    int actualHashCode1 = unlocode1.hashCode();
    int actualHashCode2 = unlocode2.hashCode();
    assertEquals(expectedHashCode1, actualHashCode1);
    assertEquals(expectedHashCode2, actualHashCode2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_MultipleInputs_PIEl5_xBZu0() {
    UnLocode unLocode = new UnLocode("USNYC");
    String idString = unLocode.getIdString();
    assertEquals("US,NYC", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_MultipleInputsWithDuplicates_mqgj10_LDcN0() {
    UnLocode unLocode = new UnLocode("USCHI");
    String idString = unLocode.getIdString();
    assertEquals("USCHI,USCHI", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_InvalidInput_TrRZ1_fid2() {
    UnLocode unLocode = new UnLocode("Invalid");
    String idString = unLocode.getIdString();
    assertEquals("Invalid", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_NullInput_YmbU2_fid2() {
    UnLocode unLocode = new UnLocode(null);
    String idString = unLocode.getIdString();
    assertNull(idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_GWzZ0_fid2() {
    UnLocode unLocode = new UnLocode("US");
    assertTrue(unLocode.equals(unLocode));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_cYNb1_fid2() {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("US");
    assertTrue(unLocode1.equals(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentValue_AWeu4_fid2() {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("CA");
    assertFalse(unLocode1.equals(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullValue_YSzn5_fid2() {
    UnLocode unLocode = new UnLocode("US");
    assertFalse(unLocode.equals(new UnLocode(null)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_SameObject_CcwM0_fid2() {
    UnLocode unLocode = new UnLocode("US");
    assertTrue(unLocode.sameValueAs(unLocode));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_DifferentObject_zRcv1_fid2() {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("US");
    assertTrue(unLocode1.sameValueAs(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_Null_EQIs2_fid2() {
    UnLocode unLocode = new UnLocode("US");
    assertFalse(unLocode.sameValueAs(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullInput_zoZV1_fid2() {
    UnLocode unlocode = new UnLocode(null);
    int expectedHashCode = 0;
    int actualHashCode = unlocode.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_InvalidInput_iMfV3_fid2() {
    UnLocode unlocode = new UnLocode("INVALID");
    int expectedHashCode = "INVALID".hashCode();
    int actualHashCode = unlocode.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_DifferentInput_ggyw4() {
    UnLocode unlocode1 = new UnLocode("US");
    UnLocode unlocode2 = new UnLocode("CA");
    int expectedHashCode1 = "US".hashCode();
    int expectedHashCode2 = "CA".hashCode();
    int actualHashCode1 = unlocode1.hashCode();
    int actualHashCode2 = unlocode2.hashCode();
    assertEquals(expectedHashCode1, actualHashCode1);
    assertEquals(expectedHashCode2, actualHashCode2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SameInput_kWAn5() {
    UnLocode unlocode1 = new UnLocode("US");
    UnLocode unlocode2 = new UnLocode("US");
    int expectedHashCode = "US".hashCode();
    int actualHashCode1 = unlocode1.hashCode();
    int actualHashCode2 = unlocode2.hashCode();
    assertEquals(expectedHashCode, actualHashCode1);
    assertEquals(expectedHashCode, actualHashCode2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_DifferentInput_ggyw4_1_fid3() {
    UnLocode unlocode1 = new UnLocode("US");
    UnLocode unlocode2 = new UnLocode("CA");
    int expectedHashCode1 = "US".hashCode();
    int expectedHashCode2 = "CA".hashCode();
    int actualHashCode1 = unlocode1.hashCode();
    int actualHashCode2 = unlocode2.hashCode();
    assertEquals(expectedHashCode1, actualHashCode1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_DifferentInput_ggyw4_2_fid3() {
    UnLocode unlocode1 = new UnLocode("US");
    UnLocode unlocode2 = new UnLocode("CA");
    int expectedHashCode1 = "US".hashCode();
    int expectedHashCode2 = "CA".hashCode();
    int actualHashCode1 = unlocode1.hashCode();
    int actualHashCode2 = unlocode2.hashCode();
    assertEquals(expectedHashCode2, actualHashCode2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SameInput_kWAn5_1_fid3() {
    UnLocode unlocode1 = new UnLocode("US");
    UnLocode unlocode2 = new UnLocode("US");
    int expectedHashCode = "US".hashCode();
    int actualHashCode1 = unlocode1.hashCode();
    int actualHashCode2 = unlocode2.hashCode();
    assertEquals(expectedHashCode, actualHashCode1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SameInput_kWAn5_2_fid3() {
    UnLocode unlocode1 = new UnLocode("US");
    UnLocode unlocode2 = new UnLocode("US");
    int expectedHashCode = "US".hashCode();
    int actualHashCode1 = unlocode1.hashCode();
    int actualHashCode2 = unlocode2.hashCode();
    assertEquals(expectedHashCode, actualHashCode2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_MultipleInputs_PIEl5_xBZu0_fid3() {
    UnLocode unLocode = new UnLocode("USCA");
    String idString = unLocode.getIdString();
    assertEquals("US,CA", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_MultipleInputsWithInvalid_nkVH6_YLyd0_fid3() {
    UnLocode unLocode = new UnLocode("USInvalid");
    String idString = unLocode.getIdString();
    assertEquals("US,Invalid", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_MultipleInputsWithEmpty_Yvfk8_UgRW0_fid3() {
    UnLocode unLocode = new UnLocode("US");
    String idString = unLocode.getIdString();
    assertEquals("US,", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetIdString_MultipleInputsWithDuplicates_mqgj10_LDcN0_fid3() {
    UnLocode unLocode = new UnLocode("US");
    String idString = unLocode.getIdString();
    assertEquals("US,US", idString);
  }
}