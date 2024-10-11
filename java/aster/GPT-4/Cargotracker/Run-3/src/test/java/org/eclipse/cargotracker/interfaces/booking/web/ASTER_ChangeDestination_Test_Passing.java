/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestination_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationUnlocode_HZGk0() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String expected = null; // Assuming default null, adjust based on actual default or set value
    String actual = changeDestination.getDestinationUnlocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_PKVv0() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String expected = null; // Assuming default trackingId is null without setter shown
    String actual = changeDestination.getTrackingId();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocationsReturnsEmptyListWhenNoLocationsSet_Uqub0() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    assertTrue(changeDestination.getLocations().isEmpty());
  }
}