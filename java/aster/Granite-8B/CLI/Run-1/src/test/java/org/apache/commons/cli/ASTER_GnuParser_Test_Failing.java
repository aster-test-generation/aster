/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_GnuParser_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptions_GWMv0() {
        GnuParser gnuParser = new GnuParser();
        Options options = gnuParser.getOptions();
        assertNotNull(options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_jhfV1() {
        GnuParser gnuParser = new GnuParser();
        Options options = gnuParser.getOptions();
        boolean hasLongOption = options.hasLongOption("option");
        assertFalse(hasLongOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_fcvD2() {
        GnuParser gnuParser = new GnuParser();
        Options options = gnuParser.getOptions();
        List<String> matchingOptions = options.getMatchingOptions("option");
        assertTrue(matchingOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_JQJs3() {
        GnuParser gnuParser = new GnuParser();
        Options options = gnuParser.getOptions();
        Option option = options.getOption("option");
        assertNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_caQb5() {
        GnuParser gnuParser = new GnuParser();
        Options options = gnuParser.getOptions();
        boolean hasShortOption = options.hasShortOption("option");
        assertFalse(hasShortOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_eTyj7() {
        GnuParser gnuParser = new GnuParser();
        Options options = gnuParser.getOptions();
        boolean hasOption = options.hasOption("option");
        assertFalse(hasOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessProperties_NyUV0() throws ParseException {
        GnuParser parser = new GnuParser();
        Properties properties = new Properties();
        properties.setProperty("option1", "value1");
        properties.setProperty("option2", "value2");
        parser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckRequiredOptions_hUXz0() throws MissingOptionException {
        GnuParser gnuParser = new GnuParser();
        try {
            gnuParser.checkRequiredOptions();
        } catch (MissingOptionException e) {
            fail("checkRequiredOptions should not throw MissingOptionException");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_Jtgr15() throws ParseException {
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessOption1_ZRjy0() throws ParseException {
        GnuParser gnuParser = new GnuParser();
        gnuParser.processOption("option", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetValue_Itvy8() throws ParseException {
        final Option option = new Option("option", "description");
        try {
            option.getValue(0);
            fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetConverter_cyxq13() throws ParseException {
        final Option option = new Option("option", "description");
        assertNull(option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetConverter_klOv18() throws ParseException {
        final Option option = new Option("option", "description");
        option.setConverter(null);
        assertNull(option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetDeprecated_DYiR19() throws ParseException {
        final Option option = new Option("option", "description");
        final DeprecatedAttributes deprecated = option.getDeprecated();
        assertNotNull(deprecated);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_gXHE0() throws ParseException {
        Options options = new Options();
        boolean result = options.hasLongOption("opt");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_qkCL2() throws ParseException {
        Options options = new Options();
        Option result = options.getOption("opt");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_YpfJ7() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "arg2"};
        CommandLine commandLine = new CommandLine();
        try {
            CommandLine result = new GnuParser().parse(options, arguments);
            assertEquals(commandLine, result);
        } catch (ParseException e) {
            fail("Parse exception occurred");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_KIOC0_1() {
        GnuParser gnuParser = new GnuParser();
        List requiredOptions = gnuParser.getRequiredOptions();
        assertNotNull(requiredOptions);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_KIOC0_2() {
        GnuParser gnuParser = new GnuParser();
        List requiredOptions = gnuParser.getRequiredOptions();
        assertTrue(requiredOptions.size() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptionsWithNoRequiredOptions_wDQu1_2() {
        GnuParser gnuParser = new GnuParser();
        List requiredOptions = gnuParser.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_jXuw6_ojGy1() {
        GnuParser gnuParser = new GnuParser();
        Options options = gnuParser.getOptions();
        Collection<Option> requiredOptions = (Collection<Option>) options.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_sHsz3_fid1() throws ParseException {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(0, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_hsHA12() throws ParseException {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("option", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverter_GrcH13_fid1() throws ParseException {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(null, option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetArgs_FxsO3_fid1() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals(0, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetLongOpt_npQm6_fid1() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals("option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionBuilder_LIMb9_fid1() throws ParseException {
        final Option option = Option.builder("option").build();
        assertEquals("option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionToString_hadS12_fid1() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals("-option", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_SgqC4_fid1() throws ParseException {
        Options options = new Options();
        String result = options.toString();
        assertEquals("[]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_KIOC0() {
        GnuParser gnuParser = new GnuParser();
        List requiredOptions = gnuParser.getRequiredOptions();
        assertNotNull(requiredOptions);
        assertTrue(requiredOptions.size() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptionsWithNoRequiredOptions_wDQu1() {
        GnuParser gnuParser = new GnuParser();
        List requiredOptions = gnuParser.getRequiredOptions();
        assertNotNull(requiredOptions);
        assertTrue(requiredOptions.isEmpty());
    }
}