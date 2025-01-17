/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestination_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setDestinationUnlocode_validInput_setsDestinationUnlocode_uVUC1() {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = "ABC123";
    changeDestination.setDestinationUnlocode(destinationUnlocode);
    Assertions.assertEquals(destinationUnlocode, changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargoTest_snzC0() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargo = changeDestination.getCargo();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_rzrY0() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("12345");
    assertEquals("12345", changeDestination.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdNull_iRng1() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId(null);
    assertEquals(null, changeDestination.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdEmpty_WNeQ2() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("");
    assertEquals("", changeDestination.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setDestinationUnlocode_null_throwsNullPointerException_KTHj0_fid2() {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_rfNL0_fid2() {
    ChangeDestination changeDestination = new ChangeDestination();
    String trackingId = changeDestination.getTrackingId();
    assertNull(trackingId);
  }
}