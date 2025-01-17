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

public class Aster_BasicParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_WnQc0() {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        String[] arguments = new String[]{"arg1", "arg2"};
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(arguments, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_lzMq0() throws ParseException {
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        BasicParser parser = new BasicParser();
        String[] arguments = new String[]{"-a", "value"};
        CommandLine cmd = parser.parse(options, arguments);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptions_eCkv0() {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        parser.setOptions(options);
        assertEquals(1, parser.getRequiredOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_seIJ0() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        String[] arguments = new String[]{"-a", "value"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_pCom0() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        CommandLine commandLine = parser.parse(options, arguments, properties);
        assertNotNull(commandLine);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesNullProperties_BDWa0() throws ParseException {
        BasicParser parser = new BasicParser();
        parser.processProperties(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesEmptyProperties_Chon1() throws ParseException {
        BasicParser parser = new BasicParser();
        Properties properties = new Properties();
        parser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse1_QNFN0() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        String[] arguments = new String[0];
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse2_zBpi1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse3_pqYZ2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("extra", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse4_OzUL3() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"--", "-a", "value"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertNull(cmd.getOptionValue("a"));
        assertEquals("-a", cmd.getArgs()[0]);
        assertEquals("value", cmd.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse5_cYBc4() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "--", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("extra", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse6_Mhqm5() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a"};
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
    public void testParse8_rUCH7() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-b", "value"};
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
    public void testParse9_XGWW8() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        try {
            parser.parse(options, arguments, properties, stopAtNonOption);
            fail("ParseException expected");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse10_JKsY9() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("extra", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse11_EUGZ10() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "--", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("extra", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessOption_UnrecognizedOption_LRWa1_fid1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        parser.setOptions(options);
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
    public void testProcessPropertiesUnrecognizedOption_UTwp2_fid1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        parser.setOptions(options);
        Properties properties = new Properties();
        properties.setProperty("unknown", "value");
        try {
            parser.processProperties(properties);
            assert false;
        } catch (UnrecognizedOptionException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse3_pqYZ2_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse3_pqYZ2_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("extra", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse4_OzUL3_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"--", "-a", "value"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertNull(cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse4_OzUL3_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"--", "-a", "value"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("-a", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse4_OzUL3_3() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"--", "-a", "value"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse5_cYBc4_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "--", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse5_cYBc4_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "--", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("extra", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse7_EHHP6_fid1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse10_JKsY9_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse10_JKsY9_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("extra", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse11_EUGZ10_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "--", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse11_EUGZ10_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "--", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("extra", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse12_GHCM11_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse12_GHCM11_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse13_hSnz12_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        String[] arguments = new String[]{"-a", "value", "-", "extra", "--", "more"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessOption_RecognizedOption_vDTy0_jeay0() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", false, "option a");
        parser.setOptions(options);
        CommandLine cmd = CommandLine.builder().build();
        parser.cmd = cmd;
        List<String> args = new ArrayList<>();
        args.add("-a");
        ListIterator<String> iter = args.listIterator();
        parser.processOption("-a", iter);
        assertEquals(1, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessArgs5_FRLl4_tIGg0() throws ParseException {
        BasicParser parser = new BasicParser();
        Option opt = new Option("o", "option", true, "description");
        ListIterator<String> iter = Arrays.<String>asList(new String[0]).listIterator();
        try {
            parser.processArgs(opt, iter);
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesOptionWithoutArg_fLcs3_WMWq0() throws ParseException {
        BasicParser parser = new BasicParser();
        Properties properties = new Properties();
        Option option = new Option("o", "option", false, "description");
        Options options = new Options();
        options.addOption(option);
        parser.parse(options, new String[0], properties, false);
        properties.setProperty("o", "true");
        parser.processProperties(properties);
        CommandLine cmd = parser.parse(options, new String[0], properties, false);
        assertTrue(cmd.hasOption("o"));
    }
}