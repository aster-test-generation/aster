/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ApplicationSettings_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSampleLoaded_SDeK0() {
        ApplicationSettings applicationSettings = new ApplicationSettings();
        boolean result = applicationSettings.isSampleLoaded();
        assertTrue(result);
    }
}