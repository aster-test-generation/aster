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

public class Aster_RouteCandidate_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullLegs_Lqnh3() {
    RouteCandidate routeCandidate = new RouteCandidate(null);
    String expected = "RouteCandidate{legs=null}";
    assertEquals(expected, routeCandidate.toString());
  }
}