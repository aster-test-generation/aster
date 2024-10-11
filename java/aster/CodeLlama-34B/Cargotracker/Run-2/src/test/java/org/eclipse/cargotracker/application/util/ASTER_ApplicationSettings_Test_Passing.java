/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ApplicationSettings_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSampleLoaded_True_XbhX0() {
    ApplicationSettings settings = new ApplicationSettings();
    settings.setSampleLoaded(true);
    assertTrue(settings.isSampleLoaded());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSampleLoaded_False_CbVA1() {
    ApplicationSettings settings = new ApplicationSettings();
    settings.setSampleLoaded(false);
    assertFalse(settings.isSampleLoaded());
  }
}