/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_GnuParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOptionsAndArguments_SvwQ0() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "--b", "c", "d", "--e", "f"};
        boolean stopAtNonOption = false;
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assert Arrays.equals(result, new String[]{"-a", "--b", "c", "d", "--e", "f"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithShortOptionsAndArguments_aOXQ1() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "-b", "c", "d", "-e", "f"};
        boolean stopAtNonOption = false;
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assert Arrays.equals(result, new String[]{"-a", "-b", "c", "d", "-e", "f"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithLongOptionsAndArguments_BgzW2() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"--a", "--b", "c", "d", "--e", "f"};
        boolean stopAtNonOption = false;
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assert Arrays.equals(result, new String[]{"--a", "--b", "c", "d", "--e", "f"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithShortAndLongOptionsAndArguments_kGjO3() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "--b", "c", "d", "-e", "--f", "g"};
        boolean stopAtNonOption = false;
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assert Arrays.equals(result, new String[]{"-a", "--b", "c", "d", "-e", "--f", "g"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithNonOptionArgument_khrC4() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"a", "b", "c", "d"};
        boolean stopAtNonOption = false;
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assert Arrays.equals(result, new String[]{"a", "b", "c", "d"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithNonOptionArgumentAndOptions_DZCH5() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"a", "-b", "c", "d", "--e", "f"};
        boolean stopAtNonOption = false;
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assert Arrays.equals(result, new String[]{"a", "-b", "c", "d", "--e", "f"});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithEmptyArguments_nNra8() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{};
        boolean stopAtNonOption = false;
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assert Arrays.equals(result, new String[]{});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesNullProperties_xlzz0() throws ParseException {
        GnuParser parser = new GnuParser();
        parser.processProperties(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesEmptyProperties_TuLl1() throws ParseException {
        GnuParser parser = new GnuParser();
        Properties properties = new Properties();
        parser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_DYUy0() throws ParseException {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "1", "-b", "2"};
        boolean stopAtNonOption = true;
        try {
            CommandLine result = parser.parse(options, arguments, stopAtNonOption);
            assertNotNull(result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_KdkN0() {
        GnuParser parser = new GnuParser();
        List expected = null; // replace with your expected result
        List actual = parser.getRequiredOptions();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptions_gSiS0() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        parser.setOptions(options);
        List<?> requiredOptions = parser.getRequiredOptions();
        assert requiredOptions.size() == 1;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithoutOptionsAndArguments_KLeW1() throws ParseException {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = {};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine result = parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionValue_CluL6() throws ParseException {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = {"--longOpt", "value"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        options.addOption("longOpt", "longOpt", true, "description");
        CommandLine result = parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithOptionGroupAndOptionValue_DNEL11() throws ParseException {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        String[] arguments = {"--longOpt", "value"};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        options.addOptionGroup(group);
        options.addOption("longOpt", "longOpt", true, "description");
        CommandLine result = parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_Flpc13() throws ParseException {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = {"-a", "1", "non-option", "2"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine result = parser.parse(options, arguments, properties, stopAtNonOption);
    }
}