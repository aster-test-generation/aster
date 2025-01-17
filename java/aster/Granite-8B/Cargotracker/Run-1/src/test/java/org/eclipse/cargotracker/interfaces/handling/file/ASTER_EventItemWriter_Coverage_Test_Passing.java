/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.file;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventItemWriter_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOpen_XHKF0() throws java.lang.Exception {
    EventItemWriter eventItemWriter = new EventItemWriter();
    Serializable checkpoint = null;
    try {
      eventItemWriter.open(checkpoint);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}