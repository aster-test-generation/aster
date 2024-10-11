/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestination_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setDestinationUnlocode_null_throwsNullPointerException_KTHj0() {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = null;
    Assertions.assertThrows(NullPointerException.class, () -> changeDestination.setDestinationUnlocode(destinationUnlocode));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_gGUP0() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.changeDestination();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithTrackingIdAndDestinationUnlocode_CPba1() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("trackingId");
    changeDestination.setDestinationUnlocode("destinationUnlocode");
    changeDestination.changeDestination();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_rfNL0() {
    ChangeDestination changeDestination = new ChangeDestination();
    String trackingId = changeDestination.getTrackingId();
    assertEquals("expectedTrackingId", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithTrackingIdAndDestinationUnlocode_CPba1_fid2() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("trackingId");
    changeDestination.setDestinationUnlocode("destinationUnlocode");
    changeDestination.changeDestination();
    // Add assertions here to check the expected behavior
}
}