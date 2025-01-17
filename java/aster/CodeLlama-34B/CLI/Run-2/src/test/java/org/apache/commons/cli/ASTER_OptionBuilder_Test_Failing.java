/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionBuilder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_PZkI0_2() {
        String opt = "opt";
        String description = "description";
        String longOption = "longOption";
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertNull(description);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_PZkI0_2_fid1() {
        String opt = "opt";
        String description = "description";
        String longOption = "longOption";
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertEquals(description, option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_PZkI0_3() {
        String opt = "opt";
        String description = "description";
        String longOption = "longOption";
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertEquals(longOption, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullOpt_yeyY1_2() {
        String opt = null;
        String description = "description";
        String longOption = "longOption";
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertEquals(description, option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullOpt_yeyY1_3() {
        String opt = null;
        String description = "description";
        String longOption = "longOption";
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertEquals(longOption, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullDescription_rlQh2_3() {
        String opt = "opt";
        String description = null;
        String longOption = "longOption";
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertEquals(longOption, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullLongOption_tAjU3_2() {
        String opt = "opt";
        String description = "description";
        String longOption = null;
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertEquals(description, option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithValidOpt_qEGU0() {
        char opt = 'a';
        Option option = OptionBuilder.create(opt);
        assertEquals(opt, option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithInvalidOpt_FBYg1() {
        char opt = ' ';
        try {
            OptionBuilder.create(opt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid option"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullOpt_Jytf2() {
        char opt = '\0';
        try {
            OptionBuilder.create(opt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid option"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_InvalidValue_avvd3() {
        try {
            OptionBuilder.hasArgs(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid number of arguments: -1", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithType_hasOptionalArgs_PsdQ1_sfRB0() {
        OptionBuilder builder = OptionBuilder.hasOptionalArgs(2);
        Option option = builder.withType(Integer.class).create();
        assertEquals(Integer.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWithType_hasOptionalArg_KNcN5_zqZA0() {
        OptionBuilder builder = OptionBuilder.hasOptionalArg();
        Option option = builder.withType(Map.class).create();
        assertEquals(Map.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_NullValue_ZjsJ4_SokH0() {
        try {
            OptionBuilder.hasArgs(0);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Argument count cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate_PZkI0() {
        String opt = "opt";
        String description = "description";
        String longOption = "longOption";
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertEquals(opt, option.getOpt());
        assertEquals(description, option.getDescription());
        assertEquals(longOption, option.getLongOpt());
        assertEquals(type, option.getType());
        assertEquals(required, option.isRequired());
        assertEquals(argCount, option.getArgs());
        assertEquals(optionalArg, option.hasOptionalArg());
        assertEquals(valueSeparator, option.getValueSeparator());
        assertEquals(argName, option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullOpt_yeyY1() {
        String opt = null;
        String description = "description";
        String longOption = "longOption";
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertNull(option.getOpt());
        assertEquals(description, option.getDescription());
        assertEquals(longOption, option.getLongOpt());
        assertEquals(type, option.getType());
        assertEquals(required, option.isRequired());
        assertEquals(argCount, option.getArgs());
        assertEquals(optionalArg, option.hasOptionalArg());
        assertEquals(valueSeparator, option.getValueSeparator());
        assertEquals(argName, option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullDescription_rlQh2() {
        String opt = "opt";
        String description = null;
        String longOption = "longOption";
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertEquals(opt, option.getOpt());
        assertNull(option.getDescription());
        assertEquals(longOption, option.getLongOpt());
        assertEquals(type, option.getType());
        assertEquals(required, option.isRequired());
        assertEquals(argCount, option.getArgs());
        assertEquals(optionalArg, option.hasOptionalArg());
        assertEquals(valueSeparator, option.getValueSeparator());
        assertEquals(argName, option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateWithNullLongOption_tAjU3() {
        String opt = "opt";
        String description = "description";
        String longOption = null;
        Class<?> type = String.class;
        boolean required = false;
        int argCount = Option.UNINITIALIZED;
        boolean optionalArg = false;
        char valueSeparator = (char) 0;
        String argName = null;
        Option option = OptionBuilder.create(opt);
        assertEquals(opt, option.getOpt());
        assertEquals(description, option.getDescription());
        assertNull(option.getLongOpt());
        assertEquals(type, option.getType());
        assertEquals(required, option.isRequired());
        assertEquals(argCount, option.getArgs());
        assertEquals(optionalArg, option.hasOptionalArg());
        assertEquals(valueSeparator, option.getValueSeparator());
        assertEquals(argName, option.getArgName());
    }
}