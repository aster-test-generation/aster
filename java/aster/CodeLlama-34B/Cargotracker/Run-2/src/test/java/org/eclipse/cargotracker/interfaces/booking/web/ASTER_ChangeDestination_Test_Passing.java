/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestination_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_rVfG0() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setDestinationUnlocode("DEU");
    assertEquals("DEU", changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeWithNull_AjEm1() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setDestinationUnlocode(null);
    assertNull(changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeWithEmptyString_yZxA2() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setDestinationUnlocode("");
    assertEquals("", changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeWithDifferentUnlocode_vSjU3() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setDestinationUnlocode("DEU");
    changeDestination.setDestinationUnlocode("USA");
    assertEquals("USA", changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeWithSameUnlocode_awYa4() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setDestinationUnlocode("DEU");
    changeDestination.setDestinationUnlocode("DEU");
    assertEquals("DEU", changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeWithNullWhenCurrentUnlocodeNotNull_uVqa5() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setDestinationUnlocode("DEU");
    changeDestination.setDestinationUnlocode(null);
    assertNull(changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithEmptyTrackingIdAndDestinationUnlocode_GapZ6() {
    ChangeDestination changeDestination = new ChangeDestination();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNull_jCgr1() {
    ChangeDestination changeDestination = new ChangeDestination();
    String trackingId = changeDestination.getTrackingId();
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_ExYk0() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("1234567890");
    assertEquals("1234567890", changeDestination.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocations_null_VSkG3() {
    ChangeDestination changeDestination = new ChangeDestination();
    List<Location> locations = changeDestination.getLocations();
    assertNull(locations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationUnlocodeWithNull_Uvma2_ItII1() {
    String expected = null;
    ChangeDestination changeDestination = new ChangeDestination();
    String actual = changeDestination.getDestinationUnlocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_ukEu0_fid2() {
    ChangeDestination changeDestination = new ChangeDestination();
    String trackingId = changeDestination.getTrackingId();
  }
}