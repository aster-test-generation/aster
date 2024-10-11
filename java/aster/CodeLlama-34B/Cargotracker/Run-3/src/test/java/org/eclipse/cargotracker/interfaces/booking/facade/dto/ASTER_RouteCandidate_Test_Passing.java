/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_RouteCandidate_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_EmptyLegs_MYaG0() throws Exception {
    RouteCandidate routeCandidate = new RouteCandidate(new ArrayList<Leg>());
    String expected = "RouteCandidate{legs=[]}";
    String actual = routeCandidate.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_NullLegs_aaOs3() throws Exception {
    RouteCandidate routeCandidate = new RouteCandidate(null);
    String expected = "RouteCandidate{legs=null}";
    String actual = routeCandidate.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_LegsListWithNull_jTeb5() throws Exception {
    RouteCandidate routeCandidate = new RouteCandidate(Arrays.asList(null));
    String expected = "RouteCandidate{legs=[null]}";
    String actual = routeCandidate.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLegs_emptyList_BQvW0() throws Exception {
    RouteCandidate routeCandidate = new RouteCandidate(Collections.emptyList());
    List<Leg> legs = routeCandidate.getLegs();
    assertEquals(0, legs.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLegs_nullList_hdJr2() throws Exception {
    RouteCandidate routeCandidate = new RouteCandidate(null);
    List<Leg> legs = routeCandidate.getLegs();
    assertNull(legs);
  }
}