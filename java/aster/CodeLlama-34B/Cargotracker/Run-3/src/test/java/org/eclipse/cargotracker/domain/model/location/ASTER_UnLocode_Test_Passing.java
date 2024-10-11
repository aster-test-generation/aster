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
  public void testGetIdString_ValidInput_wZAa0() throws Exception {
    UnLocode unLocode = new UnLocode("USCHI");
    String expected = "USCHI";
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  public void testGetIdString_NullInput_iMmf1() throws Exception {
    UnLocode unLocode = new UnLocode(null);
    String expected = null;
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  public void testGetIdString_EmptyInput_PEzw2() throws Exception {
    UnLocode unLocode = new UnLocode("");
    String expected = "";
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  public void testGetIdString_InvalidInput_OCbN3() throws Exception {
    UnLocode unLocode = new UnLocode("INVALID");
    String expected = "INVALID";
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  public void testGetIdString_ValidInputWithWhitespace_tzQs4() throws Exception {
    UnLocode unLocode = new UnLocode("US CHI");
    String expected = "US CHI";
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  public void testGetIdString_NullInputWithWhitespace_dgfc5() throws Exception {
    UnLocode unLocode = new UnLocode(null);
    String expected = null;
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  public void testGetIdString_EmptyInputWithWhitespace_rPar6() throws Exception {
    UnLocode unLocode = new UnLocode("");
    String expected = "";
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  public void testGetIdString_InvalidInputWithWhitespace_bGwd7() throws Exception {
    UnLocode unLocode = new UnLocode("INVALID");
    String expected = "INVALID";
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  public void testGetIdString_ValidInputWithSpecialCharacters_jIZo8() throws Exception {
    UnLocode unLocode = new UnLocode("US-CHI");
    String expected = "US-CHI";
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  public void testGetIdString_NullInputWithSpecialCharacters_Nrsz9() throws Exception {
    UnLocode unLocode = new UnLocode(null);
    String expected = null;
    String actual = unLocode.getIdString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_rrHG0() throws Exception {
    UnLocode unLocode = new UnLocode("US");
    assertTrue(unLocode.equals(unLocode));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObject_zaEi1() throws Exception {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("CA");
    assertFalse(unLocode1.equals(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_JNZi2() throws Exception {
    UnLocode unLocode = new UnLocode("US");
    assertFalse(unLocode.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_EmptyCountryAndLocation_WtCH0() throws Exception {
    UnLocode unLocode = new UnLocode("");
    assertEquals("", unLocode.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NonEmptyCountryAndLocation_dMxW1() throws Exception {
    UnLocode unLocode = new UnLocode("US");
    assertEquals("US", unLocode.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NullCountryAndLocation_Klmq2() throws Exception {
    UnLocode unLocode = new UnLocode(null);
    assertEquals("", unLocode.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_sameObject_xIVQ0() throws Exception {
    UnLocode unLocode = new UnLocode("US");
    assertTrue(unLocode.sameValueAs(unLocode));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_differentObject_FDMB1() throws Exception {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("US");
    assertTrue(unLocode1.sameValueAs(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_differentValue_olwv5() throws Exception {
    UnLocode unLocode = new UnLocode("US");
    assertFalse(unLocode.sameValueAs(new UnLocode("CA")));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_ValidInput_AlHk0() throws Exception {
    UnLocode unLocode = new UnLocode("US");
    int expected = "US".hashCode();
    int actual = unLocode.hashCode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_NullInput_RCOm1() throws Exception {
    UnLocode unLocode = new UnLocode(null);
    int expected = 0;
    int actual = unLocode.hashCode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_EmptyInput_OJPC2() throws Exception {
    UnLocode unLocode = new UnLocode("");
    int expected = 0;
    int actual = unLocode.hashCode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_InvalidInput_iLut3() throws Exception {
    UnLocode unLocode = new UnLocode("INVALID");
    int expected = "INVALID".hashCode();
    int actual = unLocode.hashCode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_DifferentInput_LyXG4() throws Exception {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("CA");
    int expected = "US".hashCode();
    int actual = unLocode1.hashCode();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SameInput_zltk5() throws Exception {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("US");
    int expected = "US".hashCode();
    int actual = unLocode1.hashCode();
    assertEquals(expected, actual);
  }
}