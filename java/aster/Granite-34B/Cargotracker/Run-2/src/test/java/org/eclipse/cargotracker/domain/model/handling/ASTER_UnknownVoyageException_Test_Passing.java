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

public class Aster_UnknownVoyageException_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMessage_TAbt0() {
    VoyageNumber voyageNumber = new VoyageNumber("123");
    UnknownVoyageException exception = new UnknownVoyageException(voyageNumber);
    String message = exception.getMessage();
    assertEquals("No voyage with number 123 exists in the system.", message);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMessageWithEmptyVoyageNumber_zUTm2() {
    VoyageNumber voyageNumber = new VoyageNumber("");
    UnknownVoyageException exception = new UnknownVoyageException(voyageNumber);
    String message = exception.getMessage();
    assertEquals("No voyage with number  exists in the system.", message);
  }
}