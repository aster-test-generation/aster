/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingReport_Test_Failing {
  {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUnLocode_SVtX0() {
    HandlingReport handlingReport = new HandlingReport();
    String unLocode = handlingReport.getUnLocode();
    Assertions.assertNotNull(unLocode);
  }
}