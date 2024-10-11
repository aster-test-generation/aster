/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BasicParser_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptions_aroz0() {
        BasicParser parser = new BasicParser();
        Options options = parser.getOptions();
        assertNotNull(options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesWithOptionThatDoesNotExist_Rbku2() throws ParseException {
        BasicParser parser = new BasicParser();
        Properties properties = new Properties();
        properties.setProperty("option", "value");
        parser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckRequiredOptions_KMnP0() throws MissingOptionException {
        BasicParser parser = new BasicParser();
        try {
            parser.checkRequiredOptions();
        } catch (MissingOptionException e) {
            fail("checkRequiredOptions should not throw MissingOptionException");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_okQa3() throws ParseException {
        Option option = new Option("o", "description");
        assertEquals(1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOpt_Mrka6() throws ParseException {
        Option option = new Option("o", "description");
        assertEquals("o", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_YNSS8() throws ParseException {
        Option option = new Option("o", "description");
        option.addValue("value");
        assertEquals("value", option.getValue(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuilder_BCxl9() throws ParseException {
        Option option = Option.builder("o").build();
        assertEquals("o", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_UWbT12() throws ParseException {
        Option option = new Option("o", "description");
        assertEquals("o", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_XChX15() throws ParseException {
        Option option = new Option("o", "description");
        assertTrue(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecated_HYRR19() throws ParseException {
        Option option = new Option("o", "description");
        DeprecatedAttributes deprecatedAttributes = option.getDeprecated();
        assertNotNull(deprecatedAttributes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessOption1_BXDE0() throws ParseException {
        BasicParser parser = new BasicParser();
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "arg", true, "arg");
        group.addOption(option);
        Options options = new Options();
        options.addOptionGroup(group);
        parser.setOptions(options);
        String arg = "a";
        ListIterator<String> iter = null;
        parser.processOption(arg, iter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetArgs_yvZB3() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals(0, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetLongOpt_HJSV6() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals("option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetValue_EYdI8() throws ParseException {
        final Option option = new Option("option", "description");
        try {
            option.getValue(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionBuilder_QzWS9() throws ParseException {
        final Option option = Option.builder("option").build();
        assertEquals("option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionToString_QwXL12() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals("-option", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetConverter_uSeH13() throws ParseException {
        final Option option = new Option("option", "description");
        assertNull(option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetConverter_qjia18() throws ParseException {
        final Option option = new Option("option", "description");
        option.setConverter(null);
        assertNull(option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetDeprecated_wJOM19() throws ParseException {
        final Option option = new Option("option", "description");
        final DeprecatedAttributes deprecated = option.getDeprecated();
        assertNotNull(deprecated);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_JWSB3() throws ParseException {
        Options options = new Options();
        options.addOption("l", "longOption", false, "description");
        String[] arguments = {"-l", "value"};
        try {
            CommandLine commandLine = new BasicParser().parse(options, arguments, false);
            assertEquals("value", commandLine.getOptionValue("longOption"));
        } catch (ParseException e) {
            fail("Parse exception occurred");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_eqjL0() throws ParseException {
        Options options = new Options();
        CommandLine commandLine = new CommandLine();
        BasicParser parser = new BasicParser();
        try {
            CommandLine result = parser.parse(options, new String[]{"-a", "value"});
            assertNotNull(result);
            assertEquals("value", result.getOptionValue('a'));
        } catch (ParseException e) {
            fail("Parse exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionGroup_Kzxh1() throws ParseException {
        Options options = new Options();
        CommandLine commandLine = new CommandLine();
        BasicParser parser = new BasicParser();
        OptionGroup group = new OptionGroup();
        group.addOption(Option.builder("a").build());
        group.addOption(Option.builder("b").build());
        options.addOptionGroup(group);
        try {
            CommandLine result = parser.parse(options, new String[]{"-a"});
            assertNotNull(result);
            assertTrue(result.hasOption('a'));
            assertTrue(result.hasOption('b'));
        } catch (ParseException e) {
            fail("Parse exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_xLab0() {
        BasicParser parser = new BasicParser();
        List requiredOptions = parser.getRequiredOptions();
        assertNotNull(requiredOptions);
        assertFalse(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_jTxZ0() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        try {
            CommandLine commandLine = new BasicParser().parse(options, arguments, properties);
            assertNotNull(commandLine);
            assertEquals("value", commandLine.getOptionValue("a"));
        } catch (ParseException e) {
            fail("Parse exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionProperties_LkbF4() throws ParseException {
        Options options = new Options();
        options.addOption(Option.builder("a").hasArg().build());
        String[] arguments = new String[]{"-a", "value"};
        try {
            CommandLine commandLine = new BasicParser().parse(options, arguments);
            assertNotNull(commandLine);
            Properties optionProperties = commandLine.getOptionProperties("a");
            assertNotNull(optionProperties);
            assertEquals("value", optionProperties.getProperty("a"));
        } catch (ParseException e) {
            fail("Parse exception occurred: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_PSCJ0() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"-a", "value1", "-b", "value2"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine expectedCmd = CommandLine.builder()
                .addArg("-a")
                .addArg("value1")
                .addArg("-b")
                .addArg("value2")
                .build();
        BasicParser parser = new BasicParser();
        CommandLine actualCmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals(expectedCmd, actualCmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithHelpOption_IHBa1() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"--help"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine expectedCmd = CommandLine.builder()
                .addArg("--help")
                .build();
        BasicParser parser = new BasicParser();
        CommandLine actualCmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals(expectedCmd, actualCmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_xLab0_1() {
        BasicParser parser = new BasicParser();
        List requiredOptions = parser.getRequiredOptions();
        assertNotNull(requiredOptions);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_xLab0_2() {
        BasicParser parser = new BasicParser();
        List requiredOptions = parser.getRequiredOptions();
        assertFalse(requiredOptions.isEmpty());
    }
}