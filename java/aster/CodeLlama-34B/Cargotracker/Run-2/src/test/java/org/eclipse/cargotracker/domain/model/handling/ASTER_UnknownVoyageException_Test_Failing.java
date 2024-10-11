/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnknownVoyageException_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMessageWithNullVoyageNumber_uXPU2() {
    VoyageNumber voyageNumber = null;
    UnknownVoyageException exception = new UnknownVoyageException(voyageNumber);
    String message = exception.getMessage();
    assertEquals("No voyage with number null exists in the system.", message);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMessageWithNullVoyageNumber_uXPU2_fid1() {
    VoyageNumber voyageNumber = null;
    UnknownVoyageException exception = new UnknownVoyageException(voyageNumber);
    String message = exception.getMessage();
    assertEquals("No voyage with number  exists in the system.", message);
  }
}