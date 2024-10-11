/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLine_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_lLbY0() {
        CommandLine commandLine = new CommandLine();
        String[] args = commandLine.getArgs();
        assertArrayEquals(new String[0], args);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_EkGw0() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertNotNull(options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_Cgwi0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        String result = commandLine.getOptionValue(option, "defaultValue");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionObject_HyhW0() {
        CommandLine commandLine = new CommandLine();
        Object result = commandLine.getOptionObject("opt");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_moSQ0() {
        CommandLine commandLine = new CommandLine();
        char opt = 'a';
        String defaultValue = "default";
        String result = commandLine.getOptionValue(opt, defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValues_cFvI0() {
        CommandLine commandLine = new CommandLine();
        String[] result = commandLine.getOptionValues('a');
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_alSa0() {
        CommandLine commandLine = new CommandLine();
        boolean result = commandLine.hasOption('a');
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgList_jOVE0() {
        CommandLine commandLine = new CommandLine();
        List<String> argList = commandLine.getArgList();
        assertNotNull(argList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterator_ZaBJ0() {
        CommandLine commandLine = new CommandLine();
        Iterator<Option> iterator = commandLine.iterator();
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_xomG0() {
        CommandLine commandLine = new CommandLine();
        Supplier<String> supplier = () -> "default";
        String result = commandLine.getOptionValue('a', supplier);
        assertEquals("default", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_withNonNullOptionValue_oImU0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "default");
        String defaultValue = "default";
        Supplier<String> supplier = () -> defaultValue;
        String result = commandLine.getOptionValue(option, supplier);
        assertEquals("default", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_withNullOptionValue_FMZw1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "description");
        String defaultValue = "default";
        Supplier<String> supplier = () -> defaultValue;
        option.setDescription(null);
        String result = commandLine.getOptionValue(option, supplier);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_XJBK0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "longOpt", true, "desc");
        option.setArgs(1);
        String[] values = {"value"};
        cmd.getOptionValues(option); // assume this sets the values
        assertNull(cmd.getOptionValue(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueNull_sDav1() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "longOpt", true, "desc");
        assertNull(cmd.getOptionValue(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValues_NullOption_ZFfY0() {
        CommandLine cmd = new CommandLine();
        Option option = null;
        String[] result = cmd.getOptionValues(option);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValues_NoMatchingOption_WGkH1() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "longOpt", true, "desc");
        String[] result = cmd.getOptionValues(option);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_CharDefaultValue_rQvY0() throws ParseException {
        CommandLine cmd = new CommandLine();
        Character defaultValue = 'a';
        Character result = cmd.getParsedOptionValue('b', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_CharNullDefaultValue_WIjj1() throws ParseException {
        CommandLine cmd = new CommandLine();
        Character defaultValue = null;
        Character result = cmd.getParsedOptionValue('b', defaultValue);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_BooleanDefaultValue_XBOe2() throws ParseException {
        CommandLine cmd = new CommandLine();
        Boolean defaultValue = true;
        Boolean result = cmd.getParsedOptionValue('b', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_BooleanNullDefaultValue_Fnpb3() throws ParseException {
        CommandLine cmd = new CommandLine();
        Boolean defaultValue = null;
        Boolean result = cmd.getParsedOptionValue('b', defaultValue);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_IntegerDefaultValue_DWWc4() throws ParseException {
        CommandLine cmd = new CommandLine();
        Integer defaultValue = 10;
        Integer result = cmd.getParsedOptionValue('b', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_IntegerNullDefaultValue_zSJl5() throws ParseException {
        CommandLine cmd = new CommandLine();
        Integer defaultValue = null;
        Integer result = cmd.getParsedOptionValue('b', defaultValue);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_LongDefaultValue_oOOo6() throws ParseException {
        CommandLine cmd = new CommandLine();
        Long defaultValue = 10L;
        Long result = cmd.getParsedOptionValue('b', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_LongNullDefaultValue_Lrki7() throws ParseException {
        CommandLine cmd = new CommandLine();
        Long defaultValue = null;
        Long result = cmd.getParsedOptionValue('b', defaultValue);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_StringDefaultValue_qLKh8() throws ParseException {
        CommandLine cmd = new CommandLine();
        String defaultValue = "default";
        String result = cmd.getParsedOptionValue('b', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_StringNullDefaultValue_WhXU9() throws ParseException {
        CommandLine cmd = new CommandLine();
        String defaultValue = null;
        String result = cmd.getParsedOptionValue('b', defaultValue);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionNull_Cvvf1_IQze0() {
        CommandLine cmd = new CommandLine();
        cmd.addOption((Option) null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_xFHL0_HUAu0() {
        CommandLine commandLine = new CommandLine();
        Supplier<String> defaultValue = () -> "default";
        String result = null;
        try {
            result = commandLine.getParsedOptionValue(new Option("a", "a", false, "description"), defaultValue);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_tSzz0_WHKt0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Object parsedValue = null;
        try {
            parsedValue = commandLine.getParsedOptionValue(option, null);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
        assertNull(parsedValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_withNullOption_hYtb0_gTdU0() {
        CommandLine commandLine = new CommandLine();
        Option option = null;
        Supplier<String> defaultValue = () -> "default";
        String result = null;
        try {
            result = commandLine.getParsedOptionValue(option, (Supplier<String>) defaultValue);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
        assertEquals("default", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_4_pVcv3_kWyG0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "opt", true, "description");
        Integer defaultValue = 0;
        try {
            Integer result = (Integer) cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_1_Gnue0_Lznu0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "opt", true, "description");
        String defaultValue = "defaultValue";
        try {
            String result = (String) cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_5_ApYN4_czVA0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "opt", true, "description");
        Boolean defaultValue = true;
        try {
            Boolean result = (Boolean) cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_6_fFAH5_irlG0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "opt", true, "description");
        Long defaultValue = 0L;
        try {
            Long result = (Long) cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_9_UVEB8_gbRM0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "opt", true, "description");
        Character defaultValue = 'a';
        try {
            Character result = (Character) cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_8_ADiF7_mlfn0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "opt", true, "description");
        Double defaultValue = 0.0;
        try {
            Double result = (Double) cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_7_UFKZ6_MeWS0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "opt", true, "description");
        Float defaultValue = 0.0f;
        try {
            Float result = (Float) cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue1_BEFX0_TEav0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("o", "longOption", true, "description");
        String defaultValue = "default";
        try {
            String result = cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue2_AHaN1_CApW0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("o", true, "description");
        Integer defaultValue = 10;
        try {
            Integer result = cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_10_FnlU9_mEbK0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "opt", true, "description");
        Object defaultValue = new Object();
        try {
            Object result = cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue3_QXnm2_Hmaj0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("o", "description");
        Boolean defaultValue = true;
        Boolean result = null;
        try {
            result = cmd.getParsedOptionValue(option, defaultValue);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue8_MDDx7_mmdH0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("o", true, "description");
        option.setArgs(1);
        Integer defaultValue = 10;
        try {
            Integer result = cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue7_kXag6_QFsy0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("o", "longOption", true, "description");
        option.setArgs(1);
        String defaultValue = "default";
        try {
            String result = cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue9_KgCZ8_gcTF0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("o", "description");
        option.setArgs(1);
        Boolean defaultValue = true;
        try {
            Boolean result = cmd.getParsedOptionValue(option, defaultValue);
            assertEquals(defaultValue, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionProperties_withNoMatchingOpt_zKPL2_texd0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("opt", "longOpt", true, "desc");
        option.setArgs(1);
        List<String> valuesList = new ArrayList<>();
        valuesList.add("key1");
        valuesList.add("value1");
        valuesList.add("key2");
        valuesList.add("value2");
        cmd.addOption(option);
        Properties props = cmd.getOptionProperties("otherOpt");
        assertTrue(props.isEmpty());
    }
}