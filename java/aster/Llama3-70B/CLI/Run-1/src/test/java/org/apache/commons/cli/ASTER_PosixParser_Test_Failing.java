/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PosixParser_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_uMlA0_1() {
        PosixParser posixParser = new PosixParser();
        Options options = posixParser.getOptions();
        assertNotNull(options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_uMlA0_2() {
        PosixParser posixParser = new PosixParser();
        Options options = posixParser.getOptions();
        assertTrue(options.getOptions().size() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessOption_RequiredOption_YLke2() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        parser.setOptions(options);
        List<String> args = new ArrayList<>();
        args.add("-c");
        ListIterator<String> iter = args.listIterator();
        Option opt = new Option("c", true, "description");
        options.addOption(opt);
        parser.getRequiredOptions().add("c");
        parser.processOption("-c", iter);
        assertTrue(parser.cmd.hasOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs1_cSto0() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        Option opt = new Option("o", "option", true, "description");
        options.addOption(opt);
        posixParser.setOptions(options);
        ListIterator<String> iter = Arrays.asList("-o", "value").listIterator();
        posixParser.processOption("o", iter);
        assertEquals("value", opt.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs2_VgAq1() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        Option opt = new Option("o", "option", false, "description");
        options.addOption(opt);
        posixParser.setOptions(options);
        ListIterator<String> iter = Arrays.asList("-o", "value").listIterator();
        posixParser.processOption("-o", iter);
        CommandLine cmd = posixParser.cmd;
        assertEquals("value", cmd.getOptionValue("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs3_JAUC2() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        Option opt = new Option("o", "option", true, "description");
        options.addOption(opt);
        posixParser.setOptions(options);
        ListIterator<String> iter = Arrays.asList("-o", "value").listIterator();
        posixParser.processOption("o", iter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs4_cVJV3() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        Option opt = new Option("o", "option", false, "description");
        options.addOption(opt);
        posixParser.setOptions(options);
        ListIterator<String> iter = Arrays.asList("value1", "value2").listIterator();
        posixParser.processOption("-o", iter);
        assertEquals("value1", opt.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs5_Vhxp4() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        Option opt = new Option("o", "option", true, "description");
        options.addOption(opt);
        posixParser.setOptions(options);
        ListIterator<String> iter = Arrays.asList("-o", "value1", "value2").listIterator();
        posixParser.processOption("-o", iter);
        assertEquals("value1", opt.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs6_Vrjd5() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        Option opt = new Option("o", "option", false, "description");
        options.addOption(opt);
        posixParser.setOptions(options);
        ListIterator<String> iter = Arrays.asList("value").listIterator();
        try {
            posixParser.processOption("o", iter);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesUnrecognizedOption_FFcF2() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        parser.setOptions(options);
        Properties properties = new Properties();
        properties.setProperty("unknown", "value");
        try {
            parser.processProperties(properties);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertEquals("Option 'unknown' is not recognized", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesInvalidValue_Tauh8() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        Option option = new Option("o", "option", true, "description");
        options.addOption(option);
        parser.setOptions(options);
        Properties properties = new Properties();
        properties.setProperty("o", "invalid");
        try {
            parser.processProperties(properties);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_uMlA0() {
        PosixParser posixParser = new PosixParser();
        Options options = posixParser.getOptions();
        assertNotNull(options);
        assertTrue(options.getOptions().size() > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_LtqW0() {
        PosixParser posixParser = new PosixParser();
        List<String> requiredOptions = posixParser.getRequiredOptions();
        assertNotNull(requiredOptions);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessOption_UnrecognizedOption_rJJr1_fid2() throws ParseException {
        PosixParser parser = new PosixParser();
        List<String> args = new ArrayList<>();
        args.add("-b");
        ListIterator<String> iter = args.listIterator();
        try {
            parser.processOption("-b", iter);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertEquals("Unrecognized option: -b", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessOption_RequiredOption_YLke2_fid2() throws ParseException {
        PosixParser parser = new PosixParser();
        List<String> args = new ArrayList<>();
        args.add("-c");
        ListIterator<String> iter = args.listIterator();
        Option opt = new Option("c", true, "description");
        parser.getOptions().addOption(opt);
        parser.getRequiredOptions().add("c");
        parser.processOption("-c", iter);
        assertFalse(parser.getRequiredOptions().contains("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs1_cSto0_fid2() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Option opt = new Option("o", "option", true, "description");
        ListIterator<String> iter = Arrays.asList("value").listIterator();
        posixParser.processArgs(opt, iter);
        assertEquals("value", opt.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs2_VgAq1_fid2() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Option opt = new Option("o", "option", false, "description");
        ListIterator<String> iter = Arrays.asList("-o", "value").listIterator();
        posixParser.processArgs(opt, iter);
        assertEquals("value", opt.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs3_JAUC2_fid2() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Option opt = new Option("o", "option", true, "description");
        ListIterator<String> iter = Arrays.asList("-o").listIterator();
        try {
            posixParser.processArgs(opt, iter);
            fail("Expected ParseException");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs4_cVJV3_fid2() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Option opt = new Option("o", "option", false, "description");
        ListIterator<String> iter = Arrays.asList("value1", "value2").listIterator();
        posixParser.processArgs(opt, iter);
        assertEquals("value1", opt.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs5_Vhxp4_fid2() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Option opt = new Option("o", "option", true, "description");
        ListIterator<String> iter = Arrays.asList("-o", "value1", "value2").listIterator();
        posixParser.processArgs(opt, iter);
        assertEquals("value1", opt.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs6_Vrjd5_fid2() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Option opt = new Option("o", "option", false, "description");
        ListIterator<String> iter = Arrays.asList("value").listIterator();
        try {
            posixParser.processArgs(opt, iter);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesUnrecognizedOption_FFcF2_fid2() throws ParseException {
        PosixParser parser = new PosixParser();
        Properties properties = new Properties();
        properties.setProperty("unknown", "value");
        try {
            parser.processProperties(properties);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertEquals("Default option wasn't defined", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesInvalidValue_Tauh8_fid2() throws ParseException {
        PosixParser parser = new PosixParser();
        Properties properties = new Properties();
        Option option = new Option("o", "option", true, "description");
        parser.getOptions().addOption(option);
        properties.setProperty("o", "invalid");
        try {
            parser.processProperties(properties);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse7_gNrC6_fid2() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "apple", false, "description");
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        try {
            parser.parse(options, arguments, properties, stopAtNonOption);
            fail("ParseException expected");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse12_bsPv11() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("-", cmd.getArgs()[0]);
        assertEquals("extra", cmd.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse13_tkVi12() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra", "--", "more"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("-", cmd.getArgs()[0]);
        assertEquals("extra", cmd.getArgs()[1]);
        assertEquals("more", cmd.getArgs()[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse12_bsPv11_2_fid3() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("-", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse12_bsPv11_3() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("extra", cmd.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse13_tkVi12_2() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra", "--", "more"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("-", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse13_tkVi12_3() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra", "--", "more"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("extra", cmd.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse13_tkVi12_4() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra", "--", "more"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("more", cmd.getArgs()[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesOptionWithoutArg_AzEz3_fvGI0() throws ParseException {
        PosixParser parser = new PosixParser();
        Properties properties = new Properties();
        Option option = new Option("o", "option", false, "description");
        parser.setOptions(new Options().addOption(option));
        CommandLine cmd = parser.parse(parser.getOptions(), new String[0], properties, false);
        assertTrue(cmd.hasOption("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateRequiredOptions_OptionGroup_SvPU2_ZsKT0() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        Option opt = new Option("o", "option", true, "description");
        OptionGroup group = new OptionGroup();
        group.addOption(opt);
        group.setRequired(true);
        options.addOptionGroup(group);
        CommandLine cmd = posixParser.parse(options, new String[0], new Properties(), false);
        assertEquals(0, cmd.getArgList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesRequiredOption_MYeX6_wUCW0_2() throws ParseException {
        PosixParser parser = new PosixParser();
        Properties properties = new Properties();
        Option option = new Option("o", "option", false, "description");
        option.setRequired(true);
        parser.setOptions(new Options().addOption(option));
        properties.setProperty("o", "true");
        CommandLine cmd = parser.parse(parser.getOptions(), new String[0], properties, false);
        assertFalse(parser.getOptions().getRequiredOptions().contains("o"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesOptionInGroup_dsdx5_lEcA0_1() throws ParseException {
        PosixParser parser = new PosixParser();
        Properties properties = new Properties();
        Option option1 = new Option("o1", "option1", false, "description");
        Option option2 = new Option("o2", "option2", false, "description");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        parser.getOptions().addOptionGroup(group);
        properties.setProperty("o1", "true");
        CommandLine cmd = parser.parse(parser.getOptions(), new String[0], properties, false);
        assertTrue(cmd.hasOption("o1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesOptionInGroup_dsdx5_lEcA0_2() throws ParseException {
        PosixParser parser = new PosixParser();
        Properties properties = new Properties();
        Option option1 = new Option("o1", "option1", false, "description");
        Option option2 = new Option("o2", "option2", false, "description");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        parser.getOptions().addOptionGroup(group);
        properties.setProperty("o1", "true");
        CommandLine cmd = parser.parse(parser.getOptions(), new String[0], properties, false);
        assertEquals(option1, group.getSelected());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten3_mBei2_lwhl0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "description");
        String[] arguments = new String[]{"--alpha=value"};
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), true).getArgs();
            assertArrayEquals(new String[]{"value"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten7_wyEL6_XoXf0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "description");
        String[] arguments = new String[]{"--alpha", "value", "nonOption"};
        try {
            posixParser.parse(options, arguments, new Properties(), true);
            String[] result = posixParser.flatten(options, arguments, true);
            assertArrayEquals(new String[]{"--alpha", "value", "--", "nonOption"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten6_nMNg5_VfAn0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "description");
        String[] arguments = new String[]{"-a", "value", "nonOption"};
        try {
            posixParser.parse(options, arguments, new Properties(), true);
            String[] result = posixParser.flatten(options, arguments, true);
            assertArrayEquals(new String[]{"-a", "value", "--", "nonOption"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten9_SufQ8_Rumw0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "description");
        String[] arguments = new String[]{"--alpha", "value", "--", "nonOption"};
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), true).getArgs();
            assertArrayEquals(new String[]{"value", "nonOption"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten10_rkna9_nmAE0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "description");
        String[] arguments = new String[]{"-a", "value", "nonOption", "--", "anotherNonOption"};
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), true).getArgs();
            assertArrayEquals(new String[]{"-a", "value", "nonOption", "anotherNonOption"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten11_Vyjy10_ngZn0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "description");
        String[] arguments = new String[]{"--alpha", "value", "nonOption", "--", "anotherNonOption"};
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), true).getArgs();
            assertArrayEquals(new String[]{"value", "nonOption", "anotherNonOption"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten11_svBw10_xxGO0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "description");
        String[] arguments = new String[]{"--alpha=value"};
        boolean stopAtNonOption = false;
        try {
            CommandLine cmd = posixParser.parse(options, arguments, new Properties(), stopAtNonOption);
            String[] result = cmd.getArgs();
            assertArrayEquals(new String[]{}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten5_qZnB4_IgDq0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longA", true, "description");
        String[] arguments = new String[]{"-", "b", "c"};
        boolean stopAtNonOption = true;
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), stopAtNonOption).getArgs();
            assertArrayEquals(new String[]{"-", "b", "c"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten11_tcFJ10_pdVk0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longA", true, "description");
        String[] arguments = new String[]{"-a", "-b", "c"};
        boolean stopAtNonOption = true;
        try {
            CommandLine cmd = posixParser.parse(options, arguments, new Properties(), stopAtNonOption);
            String[] result = cmd.getArgs();
            assertArrayEquals(new String[]{"-b", "c"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten14_BjIy13_ltKf0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "longA", true, "description");
        String[] arguments = new String[]{"-a", "-", "c"};
        boolean stopAtNonOption = true;
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), stopAtNonOption).getArgs();
            assertArrayEquals(new String[]{"-", "c"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten6_LVxR5_nzsz0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "a", true, "a");
        String[] arguments = new String[]{"--a=b", "c"};
        boolean stopAtNonOption = true;
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), stopAtNonOption).getArgs();
            assertArrayEquals(new String[]{"--a", "b", "c"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten5_Scwo4_unTY0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "a", true, "a");
        String[] arguments = new String[]{"-", "b", "c"};
        boolean stopAtNonOption = true;
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), stopAtNonOption).getArgs();
            assertArrayEquals(new String[]{"-", "b", "c"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten7_qTwG6_DPFc0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "a", true, "a");
        String[] arguments = new String[]{"-ab", "c"};
        boolean stopAtNonOption = true;
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), stopAtNonOption).getArgs();
            assertArrayEquals(new String[]{"b", "c"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten11_evHH10_NITM0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "a", true, "a");
        String[] arguments = new String[]{"--a", "b", "-"};
        boolean stopAtNonOption = true;
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), stopAtNonOption).getArgs();
            assertArrayEquals(new String[]{"--a", "b", "-"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten13_cgml12_NRcM0() {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "a", true, "a");
        String[] arguments = new String[]{"--a", "b", "c", "-"};
        boolean stopAtNonOption = true;
        try {
            String[] result = posixParser.parse(options, arguments, new Properties(), stopAtNonOption).getArgs();
            assertArrayEquals(new String[]{"--a", "b", "c", "-"}, result);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }
}