/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.primefaces.event.FlowEvent;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_EventLogger_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnFlowProcess_ValidatePasses_dIrM1_bedO0_1() {
    EventLogger logger = new EventLogger();
    FlowEvent event = mock(FlowEvent.class);
    when(event.getOldStep()).thenReturn("otherTab");
    when(event.getNewStep()).thenReturn("dateTab");
    String result = logger.onFlowProcess(event);
    assertEquals("dateTab", result);
  }
}