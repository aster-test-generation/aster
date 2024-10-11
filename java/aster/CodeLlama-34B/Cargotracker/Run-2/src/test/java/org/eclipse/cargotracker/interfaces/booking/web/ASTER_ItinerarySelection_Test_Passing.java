/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ItinerarySelection_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNull_ywKT2() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    String trackingId = itinerarySelection.getTrackingId();
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_nzwu0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("1234567890");
    assertEquals("1234567890", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithNull_kWMr1() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId(null);
    assertNull(itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithEmptyString_RjEC2() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("");
    assertEquals("", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithInvalidString_szjL3() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("invalid");
    assertEquals("invalid", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithLongerThan10Characters_uFME5() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("12345678901234567890");
    assertEquals("12345678901234567890", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithNonNumericCharacters_qgUb6() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("1234567890abcdefghij");
    assertEquals("1234567890abcdefghij", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithMixOfNumericAndNonNumericCharacters_LpDG7() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("1234567890abcdefghij1234567890");
    assertEquals("1234567890abcdefghij1234567890", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithOnlyNonNumericCharacters_iMDU9() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadWithInvalidTrackingId_KOgI1_RSIL0_1() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("invalid_tracking_id");
    assertNull(itinerarySelection.getCargo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadWithInvalidTrackingId_KOgI1_RSIL0_2() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("invalid_tracking_id");
    assertNull(itinerarySelection.getRouteCandidates());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_IHgL0_zDrk0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("1234567890");
  }
}