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
    public void testWithType_wLjn1() throws Exception {
        OptionBuilder optionBuilder = OptionBuilder.withType(String.class);
        OptionBuilder expected = OptionBuilder.withType(String.class);
        assertEquals(expected, optionBuilder);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_dJIe0() throws Exception {
        Option option = OptionBuilder.create('a');
        assertEquals("a", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateEmptyString_oNMp2() throws Exception {
        try {
            OptionBuilder.create("");
            assertEquals("OptionBuilder.create should throw an exception", false);
        } catch (IllegalArgumentException e) {
            assertEquals("OptionBuilder.create should throw an exception", true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullLongOption_zQHL0() throws Exception {
        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithLongOption_GJGj1() throws Exception {
        Option option = OptionBuilder.create("longOption");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_YiUb0() throws Exception {
        OptionBuilder optionBuilder = OptionBuilder.isRequired();
        assertEquals(true, OptionBuilder.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateOption_YABx0() throws Exception {
        Option option = OptionBuilder.create("opt");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredTrue_JnXS0() throws Exception {
        OptionBuilder.isRequired(true);
        assertEquals(true, OptionBuilder.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredFalse_EJpM1() throws Exception {
        OptionBuilder.isRequired(false);
        assertEquals(false, OptionBuilder.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredDefaultFalse_CWKq2() throws Exception {
        OptionBuilder.isRequired();
        assertEquals(false, OptionBuilder.isRequired());
    }
}