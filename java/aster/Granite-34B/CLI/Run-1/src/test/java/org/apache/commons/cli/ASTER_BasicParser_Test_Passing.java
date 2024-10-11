/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BasicParser_Test_Passing {
    private BasicParser parser;
    private Options options;
    private Option option1;
    private Option option2;
    private OptionGroup optionGroup;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_ybPY0() {
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "arg2", "arg3"};
        boolean stopAtNonOption = true;
        String[] result = new BasicParser().flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(arguments, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_NraK0() {
        BasicParser parser = new BasicParser();
        Options options = parser.getOptions();
        assertEquals(options, parser.getOptions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_UNMa0() throws ParseException {
        parser = new BasicParser();
        options = new Options();
        option1 = new Option("option1", "description1");
        option2 = new Option("option2", "description2");
        optionGroup = new OptionGroup();
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        options.addOptionGroup(optionGroup);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgsWithMissingArgument_Xicm2() throws ParseException {
        Option opt = new Option("option", "longOption", true, "description");
        ListIterator<String> iter = new ArrayList<String>().listIterator();
        BasicParser parser = new BasicParser();
        try {
            parser.processArgs(opt, iter);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgsWithOptionalArgument_wwjq3() throws ParseException {
        Option opt = new Option("option", "longOption", true, "description");
        opt.setOptionalArg(true);
        ListIterator<String> iter = new ArrayList<String>().listIterator();
        BasicParser parser = new BasicParser();
        parser.processArgs(opt, iter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOption_YiNA0() throws ParseException {
        try {
            new Option("a", "aa", true, "aaa");
            new Option("a", true, "aaa");
            new Option("a", "aaa");
        } catch (final IllegalArgumentException e) {
            fail("Threw IllegalArgumentException");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringBooleanString_tfzG1() throws ParseException {
        final Option option = new Option("a", true, "aaa");
        assertEquals("a", option.getOpt());
        assertEquals(null, option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals("aaa", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringStringBooleanString_xdpy2() throws ParseException {
        final Option option = new Option("a", "aa", true, "aaa");
        assertEquals("a", option.getOpt());
        assertEquals("aa", option.getLongOpt());
        assertTrue(option.hasArg());
        assertEquals("aaa", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_FKqD0() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "arg2"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals(2, commandLine.getArgs().length);
        assertEquals("arg1", commandLine.getArgs()[0]);
        assertEquals("arg2", commandLine.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOption_hDPU1() throws ParseException {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("value", commandLine.getOptionValue("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithRequiredOption_UEgO2() throws ParseException {
        Options options = new Options();
        options.addRequiredOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("value", commandLine.getOptionValue("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionGroup_QQDY3() throws ParseException {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("o1", "option1", true, "description1"));
        group.addOption(new Option("o2", "option2", true, "description2"));
        options.addOptionGroup(group);
        String[] arguments = new String[]{"-o1", "value1"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("value1", commandLine.getOptionValue("o1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_PVrm4() throws ParseException {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value", "arg1", "arg2"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("value", commandLine.getOptionValue("o"));
        assertEquals(2, commandLine.getArgs().length);
        assertEquals("arg1", commandLine.getArgs()[0]);
        assertEquals("arg2", commandLine.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getRequiredOptions_eukr0() {
        BasicParser target = new BasicParser();
        List expected = target.getRequiredOptions();
        List actual = target.getRequiredOptions();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_QHJO0() throws Exception {
        Options options = new Options();
        String[] arguments = new String[0];
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine commandLine = new BasicParser().parse(options, arguments, properties, stopAtNonOption);
        assertNotNull(commandLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ArgumentsNull_PGhd2() throws Exception {
        Options options = new Options();
        String[] arguments = null;
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine commandLine = new BasicParser().parse(options, arguments, properties, stopAtNonOption);
        assertNotNull(commandLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_PropertiesNull_CQgM3() throws Exception {
        Options options = new Options();
        String[] arguments = new String[0];
        Properties properties = null;
        boolean stopAtNonOption = false;
        CommandLine commandLine = new BasicParser().parse(options, arguments, properties, stopAtNonOption);
        assertNotNull(commandLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_StopAtNonOption_VOju4() throws Exception {
        Options options = new Options();
        String[] arguments = new String[0];
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, properties, stopAtNonOption);
        assertNotNull(commandLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringBooleanString_tfzG1_1() throws ParseException {
        final Option option = new Option("a", true, "aaa");
        assertEquals("a", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringBooleanString_tfzG1_2() throws ParseException {
        final Option option = new Option("a", true, "aaa");
        assertEquals(null, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringBooleanString_tfzG1_3() throws ParseException {
        final Option option = new Option("a", true, "aaa");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringBooleanString_tfzG1_4() throws ParseException {
        final Option option = new Option("a", true, "aaa");
        assertEquals("aaa", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringStringBooleanString_xdpy2_1() throws ParseException {
        final Option option = new Option("a", "aa", true, "aaa");
        assertEquals("a", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringStringBooleanString_xdpy2_2() throws ParseException {
        final Option option = new Option("a", "aa", true, "aaa");
        assertEquals("aa", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringStringBooleanString_xdpy2_3() throws ParseException {
        final Option option = new Option("a", "aa", true, "aaa");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionStringStringBooleanString_xdpy2_4() throws ParseException {
        final Option option = new Option("a", "aa", true, "aaa");
        assertEquals("aaa", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_FKqD0_1() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "arg2"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals(2, commandLine.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_FKqD0_2() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "arg2"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("arg1", commandLine.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_FKqD0_3() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "arg2"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("arg2", commandLine.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_PVrm4_1() throws ParseException {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value", "arg1", "arg2"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("value", commandLine.getOptionValue("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_PVrm4_2() throws ParseException {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value", "arg1", "arg2"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals(2, commandLine.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_PVrm4_3() throws ParseException {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value", "arg1", "arg2"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("arg1", commandLine.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_PVrm4_4() throws ParseException {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value", "arg1", "arg2"};
        boolean stopAtNonOption = true;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("arg2", commandLine.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNoStopAtNonOption_Wrer5_1() throws ParseException {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value", "arg1", "arg2"};
        boolean stopAtNonOption = false;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("value", commandLine.getOptionValue("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNoStopAtNonOption_Wrer5_3() throws ParseException {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value", "arg1", "arg2"};
        boolean stopAtNonOption = false;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("arg1", commandLine.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNoStopAtNonOption_Wrer5_4() throws ParseException {
        Options options = new Options();
        options.addOption("o", "option", true, "description");
        String[] arguments = new String[]{"-o", "value", "arg1", "arg2"};
        boolean stopAtNonOption = false;
        CommandLine commandLine = new BasicParser().parse(options, arguments, stopAtNonOption);
        assertEquals("arg2", commandLine.getArgs()[1]);
    }
}