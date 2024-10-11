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

public class Aster_ChangeDestination_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_zEpa0() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setDestinationUnlocode("123456789");
    assertEquals("123456789", changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testgetDestinationUnlocode_CGjh0() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setDestinationUnlocode("XXXXX");
    assertEquals("XXXXX", changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeWithInvalidInput_jbeK1_fid2() {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setDestinationUnlocode("12345");
    assertNull(null);
  }
}