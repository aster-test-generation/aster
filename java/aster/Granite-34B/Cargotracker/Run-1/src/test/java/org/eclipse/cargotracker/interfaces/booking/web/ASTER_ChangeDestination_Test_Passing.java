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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestination_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_zYeJ0() {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = "ABC123";
    changeDestination.setDestinationUnlocode(destinationUnlocode);
    assertEquals(destinationUnlocode, changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeNull_RhUN1() {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = null;
    changeDestination.setDestinationUnlocode(destinationUnlocode);
    assertEquals(destinationUnlocode, changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeEmpty_ljOW2() {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = "";
    changeDestination.setDestinationUnlocode(destinationUnlocode);
    assertEquals(destinationUnlocode, changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithTrackingIdAndInvalidDestinationUnlocode_KDxH2() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("ABC123");
    changeDestination.setDestinationUnlocode("InvalidUnlocode");
    try {
      changeDestination.changeDestination();
      fail("Expected an exception to be thrown");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithInvalidTrackingIdAndDestinationUnlocode_gaqw3() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("InvalidTrackingId");
    changeDestination.setDestinationUnlocode("USNYC");
    try {
      changeDestination.changeDestination();
      fail("Expected an exception to be thrown");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithInvalidTrackingIdAndInvalidDestinationUnlocode_aPce4() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("InvalidTrackingId");
    changeDestination.setDestinationUnlocode("InvalidUnlocode");
    try {
      changeDestination.changeDestination();
      fail("Expected an exception to be thrown");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_YFpQ0() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getTrackingId_null_QNNo1() {
    ChangeDestination changeDestination = new ChangeDestination();
    String trackingId = changeDestination.getTrackingId();
    Assertions.assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_NXXo0() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("123456");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdNull_yXnb1() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdEmpty_zfup2() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getTrackingId_QjEP0_fid2() {
    ChangeDestination changeDestination = new ChangeDestination();
    String trackingId = changeDestination.getTrackingId();
    assertEquals(null, trackingId);
  }
}