/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Options_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptionsStartsWith_mlGM0_2() {
        Options options = new Options();
        List<String> result = options.getMatchingOptions("abc");
        assertEquals("abc-def", result.get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptions_SingleOption_jHVG1() {
        Options options = new Options();
        options.addOption("opt", "longOpt", true, "description");
        Options result = options.addOptions(options);
        assertEquals(options, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptionsStartsWith_mlGM0() {
        Options options = new Options();
        List<String> result = options.getMatchingOptions("abc");
        assertEquals(1, result.size());
        assertEquals("abc-def", result.get(0));
    }
}