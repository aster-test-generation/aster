/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Coverage_Test_Failing {
    {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_YjJI0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("[ option longOption [ARG...] :: description ::  ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_QmsR1() {
        Option option = new Option("option", true, "description");
        assertEquals("[ option [ARG] :: description ::  ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString3_qlQa2() {
        Option option = new Option("option", "description");
        assertEquals("[ option :: description ::  ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString4_VAgV3() {
        Option option = new Option("option", "longOption", false, "description");
        assertEquals("[ option longOption :: description ::  ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString5_Mhpm4() {
        Option option = new Option("option", false, "description");
        assertEquals("[ option :: description ::  ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_oDBU0() {
        Option option = new Option("option", "longOption", true, "description");
        boolean hasArgName = option.hasArgName();
        assertTrue(hasArgName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg1_syuI0() {
        Option option = new Option("option", "longOption", true, "description");
        boolean result = option.requiresArg();
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg2_PPXL1() {
        Option option = new Option("option", true, "description");
        boolean result = option.requiresArg();
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg4_jDax3() {
        Option option = new Option("option", "longOption", false, "description");
        boolean result = option.requiresArg();
        boolean expected = true;
        assertEquals(expected, result);
    }
}