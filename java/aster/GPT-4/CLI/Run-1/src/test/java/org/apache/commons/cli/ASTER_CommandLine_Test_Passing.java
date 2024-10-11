/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

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
    public void testGetArgs_EmptyArgs_Ocgw0() {
        CommandLine commandLine = new CommandLine();
        String[] expected = new String[0];
        assertArrayEquals(expected, commandLine.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithValidOption_jRAI0() {
        CommandLine commandLine = new CommandLine();
        Supplier<String> defaultValue = () -> "default";
        String expected = "default";
        try {
            String result = commandLine.getParsedOptionValue("validOption", defaultValue);
            assertEquals(expected, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionsReturnsEmptyArrayWhenNoOptionsSet_mmGk0() {
        CommandLine commandLine = new CommandLine();
        Option[] expected = Option.EMPTY_ARRAY;
        Option[] actual = commandLine.getOptions();
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithDefaultValue_BmTn0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("opt", "Option for testing");
        String defaultValue = "default";
        String result = commandLine.getOptionValue(option, defaultValue);
        assertEquals("default", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithDefaultValueSupplier_BWiC0() {
        CommandLine commandLine = new CommandLine();
        String expected = "default";
        String actual = commandLine.getOptionValue("nonexistentOption", () -> "default");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithDefaultValue_GDXJ0() {
        CommandLine commandLine = new CommandLine();
        String expected = "default";
        String result = commandLine.getOptionValue("nonExistingOption", () -> "default");
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithDefaultValueWhenOptionNotFound_HpJu0() {
        CommandLine commandLine = new CommandLine();
        String defaultValue = "default";
        String result = commandLine.getOptionValue("nonexistent_option", defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithDefaultValue_JwZx0() {
        CommandLine commandLine = new CommandLine();
        String defaultValue = "default";
        String result = commandLine.getOptionValue("nonExistingOption", defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithDefaultSupplier_alnO0() throws ParseException {
        CommandLine commandLine = new CommandLine();
        char opt = 'a';
        Supplier<String> defaultValue = () -> "default";
        String expected = "default";
        String actual = commandLine.getParsedOptionValue(opt, defaultValue);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionPropertiesWithNoValues_Exuw2() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("test", "Test option");
        Properties result = commandLine.getOptionProperties(option);
        assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionObjectReturnsNullOnParseException_OxVS0() {
        CommandLine commandLine = new CommandLine();
        assertNull(commandLine.getOptionObject("invalidOption"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithDefault_eYlN0() {
        CommandLine commandLine = new CommandLine();
        String result = commandLine.getOptionValue('a', "default");
        assertEquals("default", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionObjectWithValidChar_uxSV0() {
        CommandLine commandLine = new CommandLine();
        char opt = 'a';
        Object result = commandLine.getOptionObject(opt);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithNullDefault_wJzX0() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("o", "option", false, "Test option");
        assertNull(commandLine.getParsedOptionValue(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithValidCharAndDefaultValue_ZSfs0() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Integer defaultValue = 10;
        Integer result = commandLine.getParsedOptionValue('a', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithNonExistingOption_GDED1() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Integer defaultValue = 20;
        Integer result = commandLine.getParsedOptionValue('z', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithNullDefaultValue_BxRx2() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Integer result = commandLine.getParsedOptionValue('b', null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithDifferentTypeDefaultValue_LLZK3() throws ParseException {
        CommandLine commandLine = new CommandLine();
        String defaultValue = "default";
        String result = commandLine.getParsedOptionValue('c', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithFloatDefaultValue_TNCF4() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Float defaultValue = 5.5f;
        Float result = commandLine.getParsedOptionValue('d', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithBooleanDefaultValue_CYKl5() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Boolean defaultValue = true;
        Boolean result = commandLine.getParsedOptionValue('e', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithCharacterDefaultValue_DVPp6() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Character defaultValue = 'x';
        Character result = commandLine.getParsedOptionValue('f', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithLongDefaultValue_INKy7() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Long defaultValue = 100L;
        Long result = commandLine.getParsedOptionValue('g', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithDoubleDefaultValue_gULt8() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Double defaultValue = 99.99;
        Double result = commandLine.getParsedOptionValue('h', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValueWithShortDefaultValue_jfgO9() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Short defaultValue = 2;
        Short result = commandLine.getParsedOptionValue('i', defaultValue);
        assertEquals(defaultValue, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithOptionNotPresent_DXtX1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("opt", "Option not present in command line");
        assertNull(commandLine.getOptionValues(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValuesWithOptionPresentNoValues_bdeB2() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("opt", "Option with no values");
        commandLine.addOption(option);
        assertNull(commandLine.getOptionValues(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithValidChar_PfWP0() {
        CommandLine commandLine = new CommandLine();
        boolean result = commandLine.hasOption('a');
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_WhenOptionIsPresent_ShouldReturnTrue_BiEV0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("opt", "longOpt", true, "Option description");
        commandLine.addOption(option); // Assuming there's a method to add options in CommandLine
        assertTrue(commandLine.hasOption(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgListReturnsEmptyListWhenNoArgsProvided_ajMT0() {
        CommandLine commandLine = new CommandLine();
        List<String> result = commandLine.getArgList();
        assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithNonNullDefault_BOiE0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("test", false, "Test option");
        Supplier<String> defaultValue = () -> "default";
        String result = commandLine.getOptionValue(option, defaultValue);
        assertEquals("default", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithNullDefault_oyxZ1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("test", false, "Test option");
        Supplier<String> defaultValue = () -> null;
        String result = commandLine.getOptionValue(option, defaultValue);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValueWithDefaultSupplier_hKyv0() {
        CommandLine commandLine = new CommandLine();
        char opt = 'a';
        Supplier<String> defaultValue = () -> "default";
        String result = commandLine.getOptionValue(opt, defaultValue);
        assertEquals("default", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterator_EmptyOptions_udMT0() {
        CommandLine commandLine = new CommandLine();
        Iterator<Option> iterator = commandLine.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionWithExistingOption_eeDH0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "alpha", false, "test option");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOptionWithValidOption_IdRt0_HDLb0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("opt", "This is a test option");
        commandLine.addOption(option);
        assertTrue(commandLine.hasOption("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionProperties_NoMatchingOption_JUYu3_JKGo0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("d", "delta", true, "description");
        commandLine.addOption(option);
        Properties result = commandLine.getOptionProperties("nonexistent");
        assertEquals(0, result.size());
    }
}