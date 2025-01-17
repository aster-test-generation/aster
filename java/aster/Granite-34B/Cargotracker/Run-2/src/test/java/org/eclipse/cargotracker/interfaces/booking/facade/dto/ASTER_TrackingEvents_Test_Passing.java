/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TrackingEvents_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsExpectedTrue_ZOOt0() {
    TrackingEvents trackingEvents = new TrackingEvents(true, "description", "time");
    boolean actual = trackingEvents.isExpected();
    boolean expected = true;
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsExpectedFalse_JJPv1() {
    TrackingEvents trackingEvents = new TrackingEvents(false, "description", "time");
    boolean actual = trackingEvents.isExpected();
    boolean expected = false;
    assert actual == expected;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDescription_YnvA0() {
    TrackingEvents trackingEvents = new TrackingEvents(true, "Test description", "12:00");
    String description = trackingEvents.getDescription();
    assert description.equals("Test description");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDescriptionWithFalseExpected_aDOA2() {
    TrackingEvents trackingEvents = new TrackingEvents(false, "Test description", "12:00");
    String description = trackingEvents.getDescription();
    assert description.equals("Test description");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDescriptionWithEmptyDescription_gaJM3() {
    TrackingEvents trackingEvents = new TrackingEvents(true, "", "12:00");
    String description = trackingEvents.getDescription();
    assert description.equals("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDescriptionWithEmptyTime_ytSj4() {
    TrackingEvents trackingEvents = new TrackingEvents(true, "Test description", "");
    String description = trackingEvents.getDescription();
    assert description.equals("Test description");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDescriptionWithNullTime_Ivjc6() {
    TrackingEvents trackingEvents = new TrackingEvents(true, "Test description", null);
    String description = trackingEvents.getDescription();
    assert description.equals("Test description");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTime_validInput_returnsTime_dMje0() {
    TrackingEvents trackingEvents = new TrackingEvents(true, "test description", "12:00");
    String actual = trackingEvents.getTime();
    assertEquals("12:00", actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTime_invalidInput_returnsDefaultTime_AUIw1() {
    TrackingEvents trackingEvents = new TrackingEvents(false, "", "");
    String actual = trackingEvents.getTime();
    assertEquals("", actual);
  }
}