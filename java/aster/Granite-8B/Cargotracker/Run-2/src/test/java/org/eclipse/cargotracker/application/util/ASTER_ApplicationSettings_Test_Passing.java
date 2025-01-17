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
  public void testIsSampleLoaded_LloD0_2() {
    ApplicationSettings applicationSettings = new ApplicationSettings();
    applicationSettings.setSampleLoaded(true);
    applicationSettings.setSampleLoaded(false);
    assertFalse(applicationSettings.isSampleLoaded());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSampleLoaded_wKUy0() {
    ApplicationSettings applicationSettings = new ApplicationSettings();
    applicationSettings.setSampleLoaded(true);
    assertTrue(applicationSettings.isSampleLoaded());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSampleLoadedWithFalse_AouS1() {
    ApplicationSettings applicationSettings = new ApplicationSettings();
    applicationSettings.setSampleLoaded(false);
    assertFalse(applicationSettings.isSampleLoaded());
  }
}