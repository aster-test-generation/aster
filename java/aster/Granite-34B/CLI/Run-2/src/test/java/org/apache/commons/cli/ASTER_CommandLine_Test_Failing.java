/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLine_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_VWdi0() {
        CommandLine commandLine = new CommandLine();
        String opt = "test";
        String expected = "expected";
        String actual = commandLine.getOptionValue(opt);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithDeprecatedOption_huNo4() {
        CommandLine commandLine = new CommandLine();
        String opt = "deprecated";
        String expected = "deprecated";
        String actual = commandLine.getOptionValue(opt);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithNullOpt_PGHe1() {
        CommandLine commandLine = new CommandLine();
        String opt = null;
        String defaultValue = "default";
        assertThrows(NullPointerException.class, () -> commandLine.getParsedOptionValue(opt, defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithEmptyOpt_baee2() {
        CommandLine commandLine = new CommandLine();
        String opt = "";
        String defaultValue = "default";
        assertThrows(IllegalArgumentException.class, () -> commandLine.getParsedOptionValue(opt, defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithNullDefaultValue_Zbkg3() throws ParseException {
        CommandLine commandLine = new CommandLine();
        String opt = "option";
        String defaultValue = null;
        String expected = "expected";
        String actual = commandLine.getParsedOptionValue(opt, defaultValue);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithNullOptionAndNullDefaultValue_wZiD5() {
        CommandLine commandLine = new CommandLine();
        String opt = null;
        String defaultValue = null;
        assertThrows(NullPointerException.class, () -> commandLine.getParsedOptionValue(opt, defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithNullOptionAndEmptyDefaultValue_WHQj6() {
        CommandLine commandLine = new CommandLine();
        String opt = null;
        String defaultValue = "";
        assertThrows(NullPointerException.class, () -> commandLine.getParsedOptionValue(opt, defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithEmptyOptionAndNullDefaultValue_dzIt7() {
        CommandLine commandLine = new CommandLine();
        String opt = "";
        String defaultValue = null;
        assertThrows(IllegalArgumentException.class, () -> commandLine.getParsedOptionValue(opt, defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithEmptyOptionAndEmptyDefaultValue_LYSF8() {
        CommandLine commandLine = new CommandLine();
        String opt = "";
        String defaultValue = "";
        assertThrows(IllegalArgumentException.class, () -> commandLine.getParsedOptionValue(opt, defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getParsedOptionValueWithNullOptionTest_oyzN2() {
        CommandLine commandLine = new CommandLine();
        String opt = "opt";
        Throwable exception = assertThrows(ParseException.class, () -> commandLine.getParsedOptionValue(opt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_VWdi0_fid1() {
        CommandLine commandLine = new CommandLine();
        String opt = "test";
        String expected = "expected";
        String actual = commandLine.getOptionValue(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithDeprecatedOption_huNo4_fid1() {
        CommandLine commandLine = new CommandLine();
        String opt = "deprecated";
        String expected = "deprecated";
        String actual = commandLine.getOptionValue(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionValueTest1_zRMM0_fid1() {
        CommandLine commandLine = new CommandLine();
        String opt = "opt";
        Supplier<String> defaultValue = () -> "default";
        String actual = commandLine.getOptionValue(opt, defaultValue);
        assertEquals(null, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_ACtJ0() throws ParseException {
        CommandLine commandLine = new CommandLine();
        String opt = "option";
        String defaultValue = "default";
        String expected = "expected";
        String actual = commandLine.getParsedOptionValue(opt, defaultValue);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithNullDefaultValue_Zbkg3_fid1() throws ParseException {
        CommandLine commandLine = new CommandLine();
        String opt = "option";
        String defaultValue = null;
        String expected = "expected";
        String actual = commandLine.getParsedOptionValue(opt, defaultValue);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithEmptyDefaultValue_rhmi4() throws ParseException {
        CommandLine commandLine = new CommandLine();
        String opt = "option";
        String defaultValue = "";
        String expected = "expected";
        String actual = commandLine.getParsedOptionValue(opt, defaultValue);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValues_fsSD0_fid1() {
        CommandLine commandLine = new CommandLine();
        String[] result = commandLine.getOptionValues('a');
        assertEquals(result, new String[]{"value1", "value2"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithCoverage_Cjtr1() {
        CommandLine commandLine = new CommandLine();
        String[] result = commandLine.getOptionValues('a');
        assertEquals(result, new String[]{"value1", "value2"});
        result = commandLine.getOptionValues('b');
        assertEquals(result, new String[]{"value3", "value4"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getParsedOptionValue_char_T_WhenOptionIsInvalid_ThenThrowsParseException_acFg2() {
        CommandLine commandLine = new CommandLine();
        char opt = 'a';
        String defaultValue = "default";
        Assertions.assertThrows(ParseException.class, () -> commandLine.getParsedOptionValue(opt, defaultValue));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_bRMn1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        String[] actual = commandLine.getOptionValues(option);
        String[] expected = new String[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_dNZw2() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        String[] actual = commandLine.getOptionValues(option);
        String[] expected = new String[]{"value1", "value2"};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_ACkk3() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        String[] actual = commandLine.getOptionValues(option);
        String[] expected = new String[]{"value1", "value2", "value3"};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_WHHf4() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        String[] actual = commandLine.getOptionValues(option);
        String[] expected = new String[]{"value1", "value2", "value3", "value4"};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_CeJG0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        boolean result = commandLine.hasOption(option);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithEmptyOption_MLgM3() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("", "longOption", true, "description");
        boolean result = commandLine.hasOption(option);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValues_TONB0() {
        CommandLine commandLine = new CommandLine();
        String[] values = commandLine.getOptionValues("option");
        assertEquals(0, values.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithOption_koSN1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "value");
        String[] values = commandLine.getOptionValues(option);
        assertEquals(1, values.length);
        assertEquals("value", values[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValues_XtAN0() {
        CommandLine commandLine = new CommandLine();
        String[] optionValues = commandLine.getOptionValues("option");
        assertNotNull(optionValues);
        assertEquals(0, optionValues.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithOption_nGal1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "description");
        commandLine.addOption(option);
        String[] optionValues = commandLine.getOptionValues("option");
        assertNotNull(optionValues);
        assertEquals(0, optionValues.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_ZIzB0() {
        CommandLine commandLine = new CommandLine();
        String opt = "test";
        boolean expected = true;
        boolean actual = commandLine.hasOption(opt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithCoverage_Cjtr1_1_fid3() {
        CommandLine commandLine = new CommandLine();
        String[] result = commandLine.getOptionValues('a');
        result = commandLine.getOptionValues('b');
        assertEquals(result, new String[]{"value1", "value2"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithCoverage_Cjtr1_2() {
        CommandLine commandLine = new CommandLine();
        String[] result = commandLine.getOptionValues('a');
        result = commandLine.getOptionValues('b');
        assertEquals(result, new String[]{"value3", "value4"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithOption_koSN1_1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "value");
        String[] values = commandLine.getOptionValues(option);
        assertEquals(1, values.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithOption_koSN1_2() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "value");
        String[] values = commandLine.getOptionValues(option);
        assertEquals("value", values[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValues_XtAN0_1() {
        CommandLine commandLine = new CommandLine();
        String[] optionValues = commandLine.getOptionValues("option");
        assertNotNull(optionValues);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValues_XtAN0_2() {
        CommandLine commandLine = new CommandLine();
        String[] optionValues = commandLine.getOptionValues("option");
        assertEquals(0, optionValues.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithOption_nGal1_1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "description");
        commandLine.addOption(option);
        String[] optionValues = commandLine.getOptionValues("option");
        assertNotNull(optionValues);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithOption_nGal1_2() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "description");
        commandLine.addOption(option);
        String[] optionValues = commandLine.getOptionValues("option");
        assertEquals(0, optionValues.length);
    }
}