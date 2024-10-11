/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Options_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption1_bHue0() {
        Options options = new Options();
        Option option = new Option("test", "test", false, "test");
        options.addOption(option);
        assertTrue(options.hasOption("test"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption2_WJwU1_2() {
        Options options = new Options();
        Option option = new Option("test", "test", false, "test");
        options.addOption(option);
        assertTrue(options.hasLongOption("test"));
    }
}