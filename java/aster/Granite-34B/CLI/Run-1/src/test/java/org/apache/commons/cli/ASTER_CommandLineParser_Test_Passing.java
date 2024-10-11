/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLineParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNoOptions_sCjv0_1() throws Exception {
        Options options = new Options();
        String[] args = {};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(0, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNoOptions_sCjv0_2() throws Exception {
        Options options = new Options();
        String[] args = {};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(0, commandLine.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithSingleOption_EywP1_1() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(1, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithSingleOption_EywP1_2() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithSingleOption_EywP1_3() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(0, commandLine.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptions_cfBt2_1() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        String[] args = {"-a", "-b"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(2, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptions_cfBt2_2() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        String[] args = {"-a", "-b"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptions_cfBt2_3() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        String[] args = {"-a", "-b"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("b", commandLine.getOptions()[1].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptions_cfBt2_4() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", false, "Beta option");
        String[] args = {"-a", "-b"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(0, commandLine.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_TMJF3_1() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(1, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_TMJF3_2() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_TMJF3_3() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("value", commandLine.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_TMJF3_4() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(0, commandLine.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_NfHr4_1() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alphaValue", "-b", "betaValue"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(2, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_NfHr4_2() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alphaValue", "-b", "betaValue"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_NfHr4_3() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alphaValue", "-b", "betaValue"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("alphaValue", commandLine.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_NfHr4_4() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alphaValue", "-b", "betaValue"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("b", commandLine.getOptions()[1].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_NfHr4_5() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alphaValue", "-b", "betaValue"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("betaValue", commandLine.getOptionValue("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_NfHr4_6() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alphaValue", "-b", "betaValue"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(0, commandLine.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionAndArgument_ggFg5_1() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(1, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionAndArgument_ggFg5_2() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionAndArgument_ggFg5_3() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("value", commandLine.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionAndArgument_ggFg5_4() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals(2, commandLine.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionAndArgument_ggFg5_5() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("arg1", commandLine.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionAndArgument_ggFg5_6() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, false);
        assertEquals("arg2", commandLine.getArgs()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_BrzU6_1() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, true);
        assertEquals(1, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_BrzU6_2() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, true);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_BrzU6_3() throws Exception {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a", "value", "arg1", "arg2"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args, true);
        assertEquals(3, commandLine.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNoOptions_Tghl0() throws ParseException {
        Options options = new Options();
        String[] args = {};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(0, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOneOption_KdoE1_1() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(1, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOneOption_KdoE1_2() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOneOption_KdoE1_3() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("alpha", commandLine.getOptions()[0].getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOneOption_KdoE1_4() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(false, commandLine.getOptions()[0].hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOneOption_KdoE1_5() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] args = {"-a"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("Alpha option", commandLine.getOptions()[0].getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_1() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(2, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_2() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_3() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("alpha", commandLine.getOptions()[0].getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_4() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(false, commandLine.getOptions()[0].hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_5() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("Alpha option", commandLine.getOptions()[0].getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_6() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("b", commandLine.getOptions()[1].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_7() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("beta", commandLine.getOptions()[1].getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_8() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(true, commandLine.getOptions()[1].hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_9() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("Beta option", commandLine.getOptions()[1].getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithTwoOptions_xOpP2_10() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("beta-value", commandLine.getOptionValue("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_Mzlm3_1() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "alpha-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(1, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_Mzlm3_2() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "alpha-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_Mzlm3_3() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "alpha-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("alpha", commandLine.getOptions()[0].getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_Mzlm3_4() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "alpha-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(true, commandLine.getOptions()[0].hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_Mzlm3_5() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "alpha-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("Alpha option", commandLine.getOptions()[0].getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgument_Mzlm3_6() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a", "alpha-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("alpha-value", commandLine.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_1() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(2, commandLine.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_2() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("a", commandLine.getOptions()[0].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_3() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("alpha", commandLine.getOptions()[0].getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_4() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(true, commandLine.getOptions()[0].hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_5() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("Alpha option", commandLine.getOptions()[0].getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_6() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("alpha-value", commandLine.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_7() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("b", commandLine.getOptions()[1].getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_8() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("beta", commandLine.getOptions()[1].getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_9() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals(true, commandLine.getOptions()[1].hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_10() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("Beta option", commandLine.getOptions()[1].getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithMultipleOptionArguments_bwJm4_11() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        String[] args = {"-a", "alpha-value", "-b", "beta-value"};
        CommandLineParser parser = new DefaultParser();
        CommandLine commandLine = parser.parse(options, args);
        assertEquals("beta-value", commandLine.getOptionValue("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionArgumentMissing_QDKO5() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", true, "Alpha option");
        String[] args = {"-a"};
        CommandLineParser parser = new DefaultParser();
        try {
            parser.parse(options, args);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Missing argument for option: a", e.getMessage());
        }
    }
}