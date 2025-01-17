/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.location;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnLocode_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getIdStringTest_uvsq0() throws Exception {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    String idString = unLocode.getIdString();
    assertEquals("countryAndLocation", idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getIdStringTest2_dcJd1() throws Exception {
    UnLocode unLocode = new UnLocode();
    String idString = unLocode.getIdString();
    assertEquals(null, idString);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void toString_with_countryAndLocation_returns_correct_string_rawG0() throws Exception {
    UnLocode unLocode = new UnLocode("USCHI");
    String actual = unLocode.toString();
    String expected = "USCHI";
    assert actual.equals(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void toString_without_countryAndLocation_returns_correct_string_BKXV1() throws Exception {
    UnLocode unLocode = new UnLocode();
    String actual = unLocode.toString();
    String expected = "";
    assert actual.equals(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_withSameObject_returnsTrue_CHwj0() throws Exception {
    UnLocode locode = new UnLocode("USCHI");
    assertTrue(locode.equals(locode));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_withNull_returnsFalse_OIAL1() throws Exception {
    UnLocode locode = new UnLocode("USCHI");
    assertTrue(!locode.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_withObjectOfWrongType_returnsFalse_TqAA2() throws Exception {
    UnLocode locode = new UnLocode("USCHI");
    assertTrue(!locode.equals("USCHI"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void equals_withObjectWithSameValue_returnsTrue_iDef3() throws Exception {
    UnLocode locode1 = new UnLocode("USCHI");
    UnLocode locode2 = new UnLocode("USCHI");
    assertTrue(locode1.equals(locode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sameValueAs_withNull_shouldReturnFalse_udaS0() throws Exception {
    UnLocode unLocode = new UnLocode("USCHI");
    UnLocode other = null;
    boolean actual = unLocode.sameValueAs(other);
    assertTrue(!actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sameValueAs_withEqualObjects_shouldReturnTrue_XWED1() throws Exception {
    UnLocode unLocode = new UnLocode("USCHI");
    UnLocode other = new UnLocode("USCHI");
    boolean actual = unLocode.sameValueAs(other);
    assertTrue(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void sameValueAs_withNonEqualObjects_shouldReturnFalse_zSvk2() throws Exception {
    UnLocode unLocode = new UnLocode("USCHI");
    UnLocode other = new UnLocode("USHEL");
    boolean actual = unLocode.sameValueAs(other);
    assertTrue(!actual);
  }
}