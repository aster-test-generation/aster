/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.voyage.VoyageRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Coverage_Test_Failing {
  private VoyageRepository voyageRepository;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnFlowProcess_nullEvent_kCMP3() {
    EventLogger eventLogger = new EventLogger();
    String actual = eventLogger.onFlowProcess(null);
    assertEquals(null, actual);
  }
}