/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypes_oUGF0() {
    EventLogger eventLogger = new EventLogger();
    Map<HandlingEvent.Type, HandlingEvent.Type> eventTypes = eventLogger.getEventTypes();
    assertNotNull(eventTypes);
    assertFalse(eventTypes.isEmpty());
    for (HandlingEvent.Type type : HandlingEvent.Type.values()) {
      assertTrue(eventTypes.containsKey(type));
      assertEquals(eventTypes.get(type), type);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetLocation_aXld0() {
    EventLogger eventLogger = new EventLogger();
    String location = eventLogger.getLocation();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetCompletionTimePattern_rtNr0_fid1() {
    EventLogger eventLogger = new EventLogger();
    String expected = "M/d/yyyy h:m a";
    String actual = eventLogger.getCompletionTimePattern();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypes_oUGF0_1() {
    EventLogger eventLogger = new EventLogger();
    Map<HandlingEvent.Type, HandlingEvent.Type> eventTypes = eventLogger.getEventTypes();
    for (HandlingEvent.Type type : HandlingEvent.Type.values()) {
    }
    assertNotNull(eventTypes);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypes_oUGF0_2() {
    EventLogger eventLogger = new EventLogger();
    Map<HandlingEvent.Type, HandlingEvent.Type> eventTypes = eventLogger.getEventTypes();
    for (HandlingEvent.Type type : HandlingEvent.Type.values()) {
    }
    assertFalse(eventTypes.isEmpty());
  }
}