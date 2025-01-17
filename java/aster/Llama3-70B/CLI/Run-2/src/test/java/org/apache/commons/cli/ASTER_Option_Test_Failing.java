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

public class Aster_Option_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs2_ZsEO1() {
        Option option = new Option("option", true, "description");
        assertEquals(0, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs3_ifOY2() {
        Option option = new Option("option", "description");
        assertEquals(0, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_dEmq0() {
        Option option = new Option("o", "longOption", true, "description");
        assertEquals("[ Option o longOption [ARG] :: description :: null ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_wjcq1() {
        Option option = new Option("o", true, "description");
        assertEquals("[ Option o [ARG] :: description :: null ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString3_uSIn2() {
        Option option = new Option("o", "description");
        assertEquals("[ Option o :: description :: null ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString4_JWWO3() {
        Option option = new Option("o", "longOption", false, "description");
        assertEquals("[ Option o longOption :: description :: null ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString5_Jemn4() {
        Option option = new Option("o", false, "description");
        assertEquals("[ Option o :: description :: null ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator1_wZSL0() {
        Option option = new Option("option", "longOption", true, "description");
        char result = option.getValueSeparator();
        assertEquals(' ', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator2_qwwr1_0() {
        Option option = new Option("option", true, "description");
        char result = option.getValueSeparator();
        assertEquals(' ', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator3_UESe2_0() {
        Option option = new Option("option", "description");
        char result = option.getValueSeparator();
        assertEquals(' ', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs1_iDLl0_0() {
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs2_NZHK1() {
        Option option = new Option("option", true, "description");
        assertTrue(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_true_Qups0() {
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgName1_JSnW0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("value", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgName2_jJXz1() {
        Option option = new Option("option", true, "description");
        assertEquals("value", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgName3_mIaQ2() {
        Option option = new Option("option", "description");
        assertEquals("value", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg_OptionalArg_lEYJ0() {
        Option option = new Option("option", "longOption", true, "description");
        assertFalse(option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArg_withOptionalArgAndNoLongOption_bsan2() {
        Option option = new Option("o", true, "description");
        assertTrue(option.hasOptionalArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_withArg_YWoY0() {
        Option option = new Option("o", "longOption", true, "description");
        assertTrue(option.hasArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withNullDefaultValue_PAyw1() {
        Option option = new Option("option", "longOption", true, "description");
        String result = option.getValue(null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withIndex_yhDe0_TvOD0() {
        Option option = new Option("option", "longOption", true, "description");
        try {
            option.addValue("value1");
        } catch (UnsupportedOperationException e) {
        }
        assertEquals("value1", option.getValue(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_Deprecated_lYnU1_iSvB0() {
        Option option = new Option("opt", "longOpt", true, "desc");
        assertEquals("Option 'opt' ('longOpt'): desc", option.toString());
    }
}