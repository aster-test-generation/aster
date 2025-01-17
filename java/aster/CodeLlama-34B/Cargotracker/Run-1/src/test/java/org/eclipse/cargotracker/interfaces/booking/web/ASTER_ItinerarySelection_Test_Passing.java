/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ItinerarySelection_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteCandidates_empty_vZXk0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    List<RouteCandidate> routeCandidates = itinerarySelection.getRouteCandidates();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNull_zkHL2() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    String trackingId = itinerarySelection.getTrackingId();
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_CLSW0() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("12345");
    assertEquals("12345", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithNull_TQpq1() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId(null);
    assertNull(itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithNonEmptyString_eUye3() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("1234567890");
    assertEquals("1234567890", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithSpecificLength_qoZM4() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("1234567890");
    assertEquals(10, itinerarySelection.getTrackingId().length());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithSpecificFormat_ZWwF5() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("12345-67890");
    assertEquals("12345-67890", itinerarySelection.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithSpecificPrefix_Pmvn6() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("12345-67890");
    assertTrue(itinerarySelection.getTrackingId().startsWith("12345-"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithSpecificSuffix_DDoI7() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("12345-67890");
    assertTrue(itinerarySelection.getTrackingId().endsWith("-67890"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithSpecificCharacterAtPosition_cnQb8() {
    ItinerarySelection itinerarySelection = new ItinerarySelection();
    itinerarySelection.setTrackingId("12345-67890");
    assertEquals('1', itinerarySelection.getTrackingId().charAt(0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithSpecificCharacterAtPositionAndLength_Tidy9() {
  }
}