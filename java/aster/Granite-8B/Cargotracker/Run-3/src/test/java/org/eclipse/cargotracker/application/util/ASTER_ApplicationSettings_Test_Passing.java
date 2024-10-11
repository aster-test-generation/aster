/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ApplicationSettings_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsSampleLoaded_Fhxr0() throws Exception {
    ApplicationSettings applicationSettings = new ApplicationSettings();
    boolean sampleLoaded = applicationSettings.isSampleLoaded();
    assertTrue(sampleLoaded);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSampleLoaded_feqf0() throws Exception {
    ApplicationSettings applicationSettings = new ApplicationSettings();
    applicationSettings.setSampleLoaded(true);
    assertEquals(true, applicationSettings.isSampleLoaded());
  }
}