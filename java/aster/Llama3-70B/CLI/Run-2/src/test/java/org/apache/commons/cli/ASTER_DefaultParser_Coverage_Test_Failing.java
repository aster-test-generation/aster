/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DefaultParser_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions_LeadingAndTrailingQuotes_CMdP0() throws ParseException {
        DefaultParser parser = new DefaultParser(true);
        parser.options = new Options();
        parser.options.addOption("a", true, "desc");
        parser.currentOption = parser.options.getOption("a");
        parser.handleConcatenatedOptions("a\"value\"");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions_NoLeadingAndTrailingQuotes_oGwy1() throws ParseException {
        DefaultParser parser = new DefaultParser(false);
        parser.options = new Options();
        parser.options.addOption("a", true, "desc");
        parser.currentOption = parser.options.getOption("a");
        parser.handleConcatenatedOptions("avalue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_isArgument_taCJ0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", false, "option a");
        String[] arguments = new String[]{"-a", "-123"};
        CommandLine cmd = parser.parse(options, arguments, null, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions_checkRequiredArgs_kVLM0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Option option = new Option("a", true, "desc");
        parser.options.addOption(option);
        parser.currentOption = option;
        parser.handleConcatenatedOptions("-a");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions_isJavaProperty_BzSI1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Option option = new Option("a", true, "desc");
        option.setArgs(2);
        parser.options.addOption(option);
        parser.currentOption = option;
        parser.handleConcatenatedOptions("-a");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions_return_XSmb2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Option option = new Option("a", true, "desc");
        option.setArgs(Option.UNLIMITED_VALUES);
        parser.options.addOption(option);
        parser.currentOption = option;
        parser.handleConcatenatedOptions("-a");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions_CurrentOptionNotNull_RequiresArg_RGOs0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Option option = new Option("a", true, "arg");
        parser.options.addOption(option);
        parser.currentOption = option;
        parser.handleConcatenatedOptions("-a");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions_Return_IaCa2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Option option = new Option("a", false, "no arg");
        parser.options.addOption(option);
        parser.currentOption = option;
        parser.handleConcatenatedOptions("-a");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_HasLongOption_PrefixFound_OfAt0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt=value"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_HasLongOption_PrefixNotFound_oUtV1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--unknownLongOpt=value"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_HasLongOption_Break_orDe2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt=value", "--anotherLongOpt=value"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_allowPartialMatching_VZvv0() throws ParseException {
        DefaultParser parser = new DefaultParser(true);
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--lo"};
        CommandLine cmd = parser.parse(options, arguments, null, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_matchesArrayList_eVwl1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt"};
        CommandLine cmd = parser.parse(options, arguments, null, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withNegativeNumber_lkVe0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"-opt", "-1"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withValidDouble_ejRo1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"-opt", "123.45"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withInvalidDouble_JxDh2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"-opt", "abc"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withEmptyArgument_CTko3() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"-opt", ""};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleUnknownToken_qNrN0_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "optionA", true, "description");
        String[] arguments = {"--unknown"};
        CommandLine cmd = parser.parse(options, arguments, null, false);
        assertEquals(1, cmd.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleUnknownToken_qNrN0_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "optionA", true, "description");
        String[] arguments = {"--unknown"};
        CommandLine cmd = parser.parse(options, arguments, null, false);
        assertEquals("--unknown", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAmbiguousOptionException_npVs1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "optionA", true, "description");
        options.addOption("b", "optionB", true, "description");
        String[] arguments = {"--opt"};
        try {
            parser.parse(options, arguments, null, false);
            fail("Expected AmbiguousOptionException");
        } catch (AmbiguousOptionException e) {
            assertEquals("opt", e.getOption());
            assertEquals(2, e.getMatchingOptions().size());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleUnknownTokenInLongOption_aVOw4_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "optionA", true, "description");
        String[] arguments = {"--optionA", "--unknown"};
        CommandLine cmd = parser.parse(options, arguments, null, false);
        assertEquals(1, cmd.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleUnknownTokenInLongOption_aVOw4_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "optionA", true, "description");
        String[] arguments = {"--optionA", "--unknown"};
        CommandLine cmd = parser.parse(options, arguments, null, false);
        assertEquals("--unknown", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_NullToken_AJgg0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{null};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithoutEqual_tLtv4() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithPartialMatch_LxMB6() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        options.addOption("longerOpt", true, "description");
        String[] arguments = new String[]{"--long"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongPrefix_hmFH5() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"-longOpt"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongPrefixWithEqual_eDxU6() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"-longOpt=value"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_NoMatchingLongOption_kGXQ7() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"--unknownOpt"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_NullToken_mpFj0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{null};
        CommandLine cmd = parser.parse(options, arguments, new Properties(), false);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithEqual_rqUW3_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt=value"};
        CommandLine cmd = parser.parse(options, arguments, new Properties(), false);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithEqual_rqUW3_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt=value"};
        CommandLine cmd = parser.parse(options, arguments, new Properties(), false);
        assertTrue(cmd.hasOption("longOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithoutEqual_WTjt4_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt", "value"};
        CommandLine cmd = parser.parse(options, arguments, new Properties(), false);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithoutEqual_WTjt4_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt", "value"};
        CommandLine cmd = parser.parse(options, arguments, new Properties(), false);
        assertTrue(cmd.hasOption("longOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_UnknownLongOption_IBEP6() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"--unknownLongOpt"};
        try {
            parser.parse(options, arguments, new Properties(), false);
        } catch (ParseException e) {
            assertEquals("Unknown option: --unknownLongOpt", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_UnknownShortOption_mCSj7() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"-X"};
        try {
            parser.parse(options, arguments, new Properties(), false);
        } catch (ParseException e) {
            assertEquals("Unknown option: -X", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_getMatchingLongOptions_Svpb3() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("long", false, "long option");
        String[] arguments = new String[]{"--long"};
        CommandLine cmd = parser.parse(options, arguments, new Properties(), false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_isJavaProperty_ppfP9() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("D", true, "java property");
        String[] arguments = new String[]{"-Dkey=value"};
        CommandLine cmd = parser.parse(options, arguments, new Properties(), false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_handleUnknownToken_svWJ0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        String[] arguments = new String[]{"--unknown"};
        Properties properties = new Properties();
        ParseException exception = assertThrows(ParseException.class, () -> parser.parse(options, arguments, properties, false));
        assertEquals("Unknown option: --unknown", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_ambiguousLongOption_hEgH1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        options.addOption("al", "alphal", true, "alphal option");
        String[] arguments = new String[]{"--alp"};
        Properties properties = new Properties();
        AmbiguousOptionException exception = assertThrows(AmbiguousOptionException.class, () -> parser.parse(options, arguments, properties, false));
        assertEquals("Ambiguous option: --alp", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleUnknownToken_qNrN0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "optionA", true, "description");
        String[] arguments = {"--unknown"};
        CommandLine cmd = parser.parse(options, arguments, null, false);
        assertEquals(1, cmd.getArgs().length);
        assertEquals("--unknown", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleUnknownTokenInLongOption_aVOw4() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "optionA", true, "description");
        String[] arguments = {"--optionA", "--unknown"};
        CommandLine cmd = parser.parse(options, arguments, null, false);
        assertEquals(1, cmd.getArgs().length);
        assertEquals("--unknown", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithEqual_rqUW3() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt=value"};
        CommandLine cmd = parser.parse(options, arguments, new Properties(), false);
        assertEquals(0, cmd.getArgs().length);
        assertTrue(cmd.hasOption("longOpt"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_LongOptionWithoutEqual_WTjt4() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("longOpt", true, "description");
        String[] arguments = new String[]{"--longOpt", "value"};
        CommandLine cmd = parser.parse(options, arguments, new Properties(), false);
        assertEquals(0, cmd.getArgs().length);
        assertTrue(cmd.hasOption("longOpt"));
    }
}