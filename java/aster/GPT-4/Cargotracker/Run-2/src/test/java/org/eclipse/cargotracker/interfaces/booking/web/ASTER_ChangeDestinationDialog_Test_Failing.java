/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestinationDialog_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithValidTrackingId_Bvqz0() {
    ChangeDestinationDialog dialog = new ChangeDestinationDialog();
    // Assuming showDialog should not throw any exceptions for a valid tracking ID
    try {
      dialog.showDialog("12345ABC");
      assertTrue(true); // Pass the test if no exceptions are thrown
    } catch (Exception e) {
      fail("Expected no exception, but got: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithValidTrackingId_Bvqz0_fid1() {
    ChangeDestinationDialog dialog = new ChangeDestinationDialog();
    dialog.showDialog("12345ABC");
  }
}