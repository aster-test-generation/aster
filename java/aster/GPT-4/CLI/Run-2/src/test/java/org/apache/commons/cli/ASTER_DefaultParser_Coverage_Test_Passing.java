/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DefaultParser_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_AmbiguousLongOptionWithoutExactMatch_jFpe0() throws ParseException {
        Options options = mock(Options.class);
        when(options.getMatchingOptions("--testOption")).thenReturn(Arrays.asList("--testOption1", "--testOption2"));
        when(options.hasLongOption("--testOption")).thenReturn(false);
        when(options.getRequiredOptions()).thenReturn(Arrays.asList());
        when(options.getOptionGroups()).thenReturn(Arrays.asList());
        DefaultParser parser = new DefaultParser();
        String[] arguments = new String[]{"--testOption"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        try {
            CommandLine cmd = parser.parse(options, arguments, properties, stopAtNonOption);
        } catch (AmbiguousOptionException e) {
            assert e.getOption().equals("--testOption");
            assert e.getMatchingOptions().contains("--testOption1");
            assert e.getMatchingOptions().contains("--testOption2");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionTokens_gWIt0() throws ParseException {
        Options options = mock(Options.class);
        when(options.getRequiredOptions()).thenReturn(new ArrayList<>());
        when(options.getOptionGroups()).thenReturn(new ArrayList<>());
        when(options.hasLongOption(anyString())).thenReturn(true);
        when(options.hasShortOption(anyString())).thenReturn(true);
        String[] arguments = {"--longOption", "-s"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, properties, false);
        verify(options).hasLongOption("--longOption");
        verify(options).hasShortOption("-s");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_jFRY0_1() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"--option1", "value1", "--option2"};
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, true);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNonNumber_IIOi1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"not_a_number"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNumberFormatExceptionCaught_PtfF2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"abc"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidNumber_qNBZ3() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"123"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withShortAndLongOptions_Itib0_1() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"-a", "--beta=value"};
        DefaultParser parser = new DefaultParser();
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.hasOption("a"), "Short option -a should be recognized.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withShortAndLongOptions_Itib0_2() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"-a", "--beta=value"};
        DefaultParser parser = new DefaultParser();
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.hasOption("beta"), "Long option --beta should be recognized.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withShortAndLongOptions_Itib0_3() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"-a", "--beta=value"};
        DefaultParser parser = new DefaultParser();
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("value", result.getOptionValue("beta"), "Long option --beta should have the value 'value'.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ShortToken_lyZw1() throws ParseException {
        Options options = mock(Options.class);
        String[] arguments = {"-"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        parser.parse(options, arguments, properties, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandlePropertiesOptionWithInvalidBooleanValue_MGjl3() throws ParseException {
        Options options = mock(Options.class);
        Option opt = mock(Option.class);
        CommandLine cmd = mock(CommandLine.class);
        Properties properties = new Properties();
        properties.setProperty("option", "no");
        when(options.getOption("option")).thenReturn(opt);
        when(opt.hasArg()).thenReturn(false);
        DefaultParser parser = new DefaultParser();
        parser.parse(options, new String[]{}, properties, false);
        verify(opt, never()).processValue(anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandlePropertiesContinueWithInvalidBooleanValue_hZHG4() throws ParseException {
        Options options = mock(Options.class);
        Option opt = mock(Option.class);
        CommandLine cmd = mock(CommandLine.class);
        Properties properties = new Properties();
        properties.setProperty("option", "no");
        when(options.getOption("option")).thenReturn(opt);
        when(opt.hasArg()).thenReturn(false);
        DefaultParser parser = new DefaultParser();
        parser.parse(options, new String[]{}, properties, false);
        verify(cmd, never()).addOption(opt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ShortToken_wgjI1_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = {"-"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ShortToken_wgjI1_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = {"-"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.getArgList().contains("-"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithEquals_mrlD2_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("opt", "option", true, "An option");
        String[] arguments = {"--option=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithEquals_mrlD2_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("opt", "option", true, "An option");
        String[] arguments = {"--option=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("value", result.getOptionValue("option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongPrefixNotStartingWithDoubleDash_rQmI4_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("o", "opt", true, "An option");
        String[] arguments = {"-opt=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongPrefixNotStartingWithDoubleDash_rQmI4_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("o", "opt", true, "An option");
        String[] arguments = {"-opt=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("value", result.getOptionValue("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongPrefixWithDash_hLTl5_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("o", "opt", true, "An option");
        String[] arguments = {"--opt=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongPrefixWithDash_hLTl5_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("o", "opt", true, "An option");
        String[] arguments = {"--opt=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("value", result.getOptionValue("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionMatch_kqtm2_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] arguments = {"--alpha"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionMatch_kqtm2_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] arguments = {"--alpha"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.hasOption("alpha"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithEquals_njPs3_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("b", "beta", true, "Beta option");
        String[] arguments = {"--beta=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithEquals_njPs3_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("b", "beta", true, "Beta option");
        String[] arguments = {"--beta=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("value", result.getOptionValue("beta"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ShortOptionWithLongPrefix_oddf4_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("c", "gamma", true, "Gamma option");
        String[] arguments = {"-cvalue"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ShortOptionWithLongPrefix_oddf4_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("c", "gamma", true, "Gamma option");
        String[] arguments = {"-cvalue"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("value", result.getOptionValue("gamma"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithDashPrefix_gZPh5_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("d", "delta", true, "Delta option");
        String[] arguments = {"-delta=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithDashPrefix_gZPh5_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("d", "delta", true, "Delta option");
        String[] arguments = {"-delta=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("value", result.getOptionValue("delta"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithShortOption_VYPn0() throws ParseException {
        Options options = mock(Options.class);
        when(options.hasShortOption("a")).thenReturn(true);
        when(options.getOption("a")).thenReturn(new Option("a", "alpha", true, "Alpha option"));
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, new String[]{"-a", "value"}, new Properties(), false);
        assertNotNull(result);
        verify(options).hasShortOption("a");
        verify(options).getOption("a");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleUnknownToken_fjtc0() throws ParseException {
        Options options = mock(Options.class);
        DefaultParser parser = new DefaultParser();
        String[] arguments = {"unknown"};
        Properties properties = new Properties();
        when(options.getMatchingOptions("unknown")).thenReturn(new ArrayList<>());
        CommandLine result = parser.parse(options, arguments, properties, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleOptionWithoutAcceptsArg_PaEb3() throws ParseException {
        Options options = mock(Options.class);
        DefaultParser parser = new DefaultParser();
        String[] arguments = {"--noarg"};
        Properties properties = new Properties();
        Option mockOption = mock(Option.class);
        when(options.getMatchingOptions("noarg")).thenReturn(Arrays.asList("noarg"));
        when(options.hasLongOption("noarg")).thenReturn(true);
        when(options.getOption("noarg")).thenReturn(mockOption);
        when(mockOption.acceptsArg()).thenReturn(false);
        CommandLine result = parser.parse(options, arguments, properties, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ShortOptionWithNoDash_Jbph1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = mock(Options.class);
        String[] arguments = {"A"};
        Properties properties = new Properties();
        parser.parse(options, arguments, properties, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ShortOptionSingleDash_Onbu2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = mock(Options.class);
        String[] arguments = {"-"};
        Properties properties = new Properties();
        parser.parse(options, arguments, properties, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNegativeNumberArgument_DMnF0_vass0_1() throws ParseException {
        Options options = new Options();
        options.addOption("p", "port", true, "Port number");
        String[] arguments = new String[]{"-p", "-123"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.hasOption("p"), "Expected to have option 'p'");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNegativeNumberArgument_DMnF0_vass0_2() throws ParseException {
        Options options = new Options();
        options.addOption("p", "port", true, "Port number");
        String[] arguments = new String[]{"-p", "-123"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("-123", result.getOptionValue("p"), "Expected the negative number to be parsed as argument");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandlePropertiesWithGroupSelected_NqMd0_Iazp0() throws ParseException {
        Options options = mock(Options.class);
        OptionGroup group = mock(OptionGroup.class);
        Option opt = mock(Option.class);
        CommandLine cmd = mock(CommandLine.class);
        Properties properties = new Properties();
        properties.setProperty("option", "value");
        when(options.getOption("option")).thenReturn(opt);
        when(options.getOptionGroup(opt)).thenReturn(group);
        when(group.getSelected()).thenReturn("option");
        when(cmd.hasOption("option")).thenReturn(false);
        DefaultParser parser = new DefaultParser();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions_RequiresArgIsJavaPropertyWithSingleValue_Returns_BgbA2_rcQd0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = mock(Options.class);
        Option option = mock(Option.class);
        when(options.hasOption(anyString())).thenReturn(true);
        when(options.getOption(anyString())).thenReturn(option);
        when(option.requiresArg()).thenReturn(true);
        when(option.getKey()).thenReturn("a");
        when(option.getValuesList()).thenReturn(Collections.singletonList("value"));
        Properties properties = new Properties();
        properties.setProperty("a", "value");
        String[] arguments = new String[]{"-aValue"};
        CommandLine result = parser.parse(options, arguments, properties);
        assertEquals("value", result.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionArguments_zThz0_LDjS0_1() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option without argument");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"--alpha", "--beta=123"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.hasOption("alpha"), "Expected to have option 'alpha'");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionArguments_zThz0_LDjS0_2() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option without argument");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"--alpha", "--beta=123"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.hasOption("beta"), "Expected to have option 'beta'");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionArguments_zThz0_LDjS0_3() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option without argument");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"--alpha", "--beta=123"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("123", result.getOptionValue("beta"), "Expected value for option 'beta'");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionToken_vLpY0_xJnp0_1() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"-a", "--beta=123"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.hasOption("a"), "Expected to have option 'a'");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionToken_vLpY0_xJnp0_2() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"-a", "--beta=123"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.hasOption("beta"), "Expected to have option 'beta'");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionToken_vLpY0_xJnp0_3() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"-a", "--beta=123"};
        Properties properties = new Properties();
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertEquals("123", result.getOptionValue("beta"), "Expected beta option to have value '123'");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_jFRY0_2_fid1() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"--option1", "value1", "--option2"};
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, true);
        assertFalse(result.hasOption("option1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_jFRY0_4_fid1() throws ParseException {
        Options options = new Options();
        String[] arguments = new String[]{"--option1", "value1", "--option2"};
        DefaultParser parser = new DefaultParser();
        CommandLine result = parser.parse(options, arguments, true);
        assertFalse(result.hasOption("option2"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withShortAndLongOptions_Itib0() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with argument");
        String[] arguments = new String[]{"-a", "--beta=value"};
        DefaultParser parser = new DefaultParser();
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertTrue(result.hasOption("a"), "Short option -a should be recognized.");
        assertTrue(result.hasOption("beta"), "Long option --beta should be recognized.");
        assertEquals("value", result.getOptionValue("beta"), "Long option --beta should have the value 'value'.");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ShortToken_wgjI1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = {"-"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
        assertTrue(result.getArgList().contains("-"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithEquals_mrlD2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("opt", "option", true, "An option");
        String[] arguments = {"--option=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
        assertEquals("value", result.getOptionValue("option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongPrefixNotStartingWithDoubleDash_rQmI4() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("o", "opt", true, "An option");
        String[] arguments = {"-opt=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
        assertEquals("value", result.getOptionValue("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongPrefixWithDash_hLTl5() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("o", "opt", true, "An option");
        String[] arguments = {"--opt=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
        assertEquals("value", result.getOptionValue("opt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionMatch_kqtm2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        String[] arguments = {"--alpha"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
        assertTrue(result.hasOption("alpha"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithEquals_njPs3() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("b", "beta", true, "Beta option");
        String[] arguments = {"--beta=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
        assertEquals("value", result.getOptionValue("beta"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ShortOptionWithLongPrefix_oddf4() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("c", "gamma", true, "Gamma option");
        String[] arguments = {"-cvalue"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
        assertEquals("value", result.getOptionValue("gamma"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithDashPrefix_gZPh5() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("d", "delta", true, "Delta option");
        String[] arguments = {"-delta=value"};
        Properties properties = new Properties();
        CommandLine result = parser.parse(options, arguments, properties, false);
        assertNotNull(result);
        assertEquals("value", result.getOptionValue("delta"));
    }
}