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

public class Aster_Option_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithNoArgs_ooZt2() {
        Option option = new Option("test", "test option", false, "test description");
        assertFalse(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeWithClass_DRbt0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValue_zflG0() {
        Option option = new Option("test", "test", true, "test");
        String defaultValue = "default";
        String value = option.getValue(defaultValue);
        assertEquals(defaultValue, value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_vBmi0() {
        Option option = new Option("test", "test option", true, "test description");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWithOptionalArg_dIlh1() {
        Option option = new Option("test", "test option", false, "test description");
        assertFalse(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_nullArgName_eKYb0() {
        Option option = new Option("option", "longOption", true, "description");
        assertFalse(option.hasArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_emptyArgName_xgsc1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setArgName("");
        assertFalse(option.hasArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_nonEmptyArgName_wmgQ2() {
        Option option = new Option("option", "longOption", true, "description");
        option.setArgName("argName");
        assertTrue(option.hasArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeprecated_ndej0() {
        Option option = new Option("test", "test", true, "test");
        assertFalse(option.isDeprecated());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_argCountUninitialized_QhfF0() {
        Option option = new Option("test", "test", false, "test");
        try {
            option.processValue("test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("NO_ARGS_ALLOWED", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_argCountGreaterThanZero_jqVV0_yqnj0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setArgName("arg");
        option.setArgs(1);
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setValueSeparator(char valueSeparator) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_yCvT0_fid2() {
        Option option = new Option("test", "test option", true, "test description");
        assertFalse(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_RILF0_fid2() {
        Option option = new Option("option", "longOption", true, "description");
        assertFalse(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithoutDeprecated_Cuiz1_fid2() {
        Option option = new Option("option", "longOption", true, "description");
        String expected = "[ Option option longOption [ARG] :: description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullLongOption_xlQw5_fid2() {
        Option option = new Option("option", null, true, "description");
        String expected = "[ Option option [ARG] :: description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullDescription_Nwyc6_fid2() {
        Option option = new Option("option", "longOption", true, null);
        String expected = "[ Option option longOption [ARG] :: null :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg_optionalArg_yKTU0_fid2() {
        Option option = new Option("test", "test option", true, "test description");
        assertTrue(option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithUnlimitedValues_Dadu1_mrws0_fid2() {
        Option option = new Option("test", "test option", true, "test description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWithArgCount_gYIg3_iRNA0_fid2() {
        Option option = new Option("test", "test option", true, "test description");
        option.processValue("arg1");
    }
}