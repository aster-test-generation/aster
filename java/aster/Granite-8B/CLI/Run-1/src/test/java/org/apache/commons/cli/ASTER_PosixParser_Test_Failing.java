/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PosixParser_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten1_lgYO0() throws ParseException {
        Options options = new Options();
        String[] arguments = {"-a", "b", "c"};
        String[] expected = {"-a", "b", "c"};
        String[] actual = new PosixParser().flatten(options, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten2_WyQc1() throws ParseException {
        Options options = new Options();
        String[] arguments = {"-a", "b", "c"};
        String[] expected = {"-a", "b", "c"};
        String[] actual = new PosixParser().flatten(options, arguments, true);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten3_xJsG2() throws ParseException {
        Options options = new Options();
        String[] arguments = {"--foo", "bar", "baz"};
        String[] expected = {"--foo", "bar", "baz"};
        String[] actual = new PosixParser().flatten(options, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten4_MNVr3() throws ParseException {
        Options options = new Options();
        String[] arguments = {"--foo", "bar", "baz"};
        String[] expected = {"--foo", "bar", "baz"};
        String[] actual = new PosixParser().flatten(options, arguments, true);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOption_cDoS0() {
        Options options = new Options();
        boolean result = options.hasLongOption("opt");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_jKQt4() {
        Options options = new Options();
        String result = options.toString();
        assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasShortOption_YnOA9() {
        Options options = new Options();
        boolean result = options.hasShortOption("opt");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_oMRd14() {
        Options options = new Options();
        boolean result = options.hasOption("opt");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_SBTY16() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"arg1", "arg2"};
        boolean stopAtNonOption = true;
        String[] result = posixParser.flatten(options, arguments, stopAtNonOption);
        assertTrue(result.length == 4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_XrGo6() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"arg1", "arg2"};
        boolean stopAtNonOption = true;
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(new String[]{"arg1", "arg2"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_pnvH3() {
        PosixParser posixParser = new PosixParser();
        Options result = posixParser.getOptions();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_osrs4() {
        Options options = new Options();
        Option opt = new Option("o", "option", false, "description");
        options.addOption(opt);
        OptionGroup result = options.getOptionGroup(opt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCheckRequiredOptions_ltZL0() throws MissingOptionException {
        PosixParser posixParser = new PosixParser();
        posixParser.checkRequiredOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals2_OtwB18() throws ParseException {
        Option option1 = new Option("option", "description");
        Option option2 = new Option("option", "description");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecated_WyUP23() throws ParseException {
        Option option = new Option("option", "description");
        DeprecatedAttributes deprecatedAttributes = option.getDeprecated();
        assertNotNull(deprecatedAttributes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetValue_IwBp8() throws ParseException {
        final Option option = new Option("option", "description");
        try {
            option.getValue(0);
            fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetConverter_kyjt13() throws ParseException {
        final Option option = new Option("option", "description");
        assertNull(option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionSetConverter_PWuZ18() throws ParseException {
        final Option option = new Option("option", "description");
        option.setConverter(null);
        assertNull(option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetDeprecated_UgZP19() throws ParseException {
        final Option option = new Option("option", "description");
        final DeprecatedAttributes deprecated = option.getDeprecated();
        assertNotNull(deprecated);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_vbvv2() throws ParseException {
        Options options = new Options();
        Option result = options.getOption("opt");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOption_DLtV14() throws ParseException {
        Options options = new Options();
        String opt = "opt";
        boolean result = options.hasOption(opt);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_wgSU0_1() {
        PosixParser posixParser = new PosixParser();
        List requiredOptions = posixParser.getRequiredOptions();
        assertNotNull(requiredOptions);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_wgSU0_2() {
        PosixParser posixParser = new PosixParser();
        List requiredOptions = posixParser.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_jpBY4_fid2() {
        Options options = new Options();
        String result = options.toString();
        assertEquals("Options: []", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_oQMn3_fid2() throws ParseException {
        Option option = new Option("option", "description");
        assertEquals(0, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOpt_FSfC6_fid2() throws ParseException {
        Option option = new Option("option", "description");
        assertEquals("option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_MYXp12() throws ParseException {
        Option option = new Option("option", "description");
        assertEquals("option", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetArgs_vvoF3_fid2() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals(0, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionGetLongOpt_tZLl6_fid2() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals("option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionBuilder_saiH9_fid2() throws ParseException {
        final Option option = Option.builder("option").build();
        assertEquals("option", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionToString_utBQ12_fid2() throws ParseException {
        final Option option = new Option("option", "description");
        assertEquals("-option", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequiredOptions_wgSU0() {
        PosixParser posixParser = new PosixParser();
        List requiredOptions = posixParser.getRequiredOptions();
        assertNotNull(requiredOptions);
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_wEAK3_fid2() throws ParseException {
        PosixParser posixParser = new PosixParser();
        Options options = new Options();
        options.addOption("l", "longOption", false, "description");
        String[] arguments = {"-l", "value"};
        CommandLine commandLine = null;
        try {
            commandLine = posixParser.parse(options, arguments, null, false);
        } catch (ParseException e) {
            fail("Parse exception occurred");
        }
        assertNotNull(commandLine);
        assertTrue(commandLine.hasOption("l"));
        assertEquals("value", commandLine.getOptionValue("l"));
    }
}