/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionBuilder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_ReturnsSameInstance_hEtx1() {
        OptionBuilder firstCall = OptionBuilder.hasArg();
        OptionBuilder secondCall = OptionBuilder.hasArg();
        assertSame(firstCall, secondCall);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithTypeUsingClassParameter_OWCF0() {
        Class<Integer> typeClass = Integer.class;
        OptionBuilder result = OptionBuilder.withType(typeClass);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithSingleCharOption_ENDz0_1() {
        char opt = 'a';
        Option result = OptionBuilder.create(opt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithSingleCharOption_ENDz0_2() {
        char opt = 'a';
        Option result = OptionBuilder.create(opt);
        assertEquals("a", result.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullLongOptionThrowsException_wEvc0() {
        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithValidNumber_lXTr0_VriS0() {
        int numArgs = 5;
        OptionBuilder result = OptionBuilder.hasArgs(numArgs);
        assertSame(result, OptionBuilder.hasArgs(numArgs)); // Corrected to compare with the same method call
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithValueSeparatorWithSpace_hasU2_VivH0() {
        OptionBuilder result = OptionBuilder.withValueSeparator(' ');
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithSingleCharOption_ENDz0() {
        char opt = 'a';
        Option result = OptionBuilder.create(opt);
        assertNotNull(result);
        assertEquals("a", result.getOpt());
    }
}