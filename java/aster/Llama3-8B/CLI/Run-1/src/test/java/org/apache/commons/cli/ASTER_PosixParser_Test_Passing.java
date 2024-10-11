/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PosixParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesNullProperties_CVQe0() throws ParseException {
        PosixParser parser = new PosixParser();
        parser.processProperties(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessPropertiesEmptyProperties_ezQN1() throws ParseException {
        PosixParser parser = new PosixParser();
        Properties properties = new Properties();
        parser.processProperties(properties);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_gYJI0() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "value", "-b", "value2"};
        boolean stopAtNonOption = true;
        try {
            CommandLine commandLine = parser.parse(options, arguments, stopAtNonOption);
            assert true;
        } catch (ParseException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequiredOptions_KCDK0() {
        PosixParser parser = new PosixParser();
        List expected = null; // replace with your expected result
        List actual = parser.getRequiredOptions();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptions_xkuG0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addRequiredOption("opt", "longOpt", true, "description");
        parser.setOptions(options);
        List<?> requiredOptions = parser.getRequiredOptions();
        assert requiredOptions.size() == 1;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithoutOptionsAndArguments_vzEz1() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine result = parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithStopAtNonOption_TBAT7() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = {"-a", "1", "non-option", "-b", "2"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine result = parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateRequiredOptionsParseException_Jgjs3_jKFN0() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addRequiredOption("option", "longOption", true, "description");
        try {
            parser.parse(options, new String[0], new Properties(), false);
            fail("ParseException expected");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOptionsWithAmbiguousOption_fePH2_BOlM0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "-b", "-c"};
        boolean stopAtNonOption = false;
        try {
            parser.parse(options, arguments, new Properties(), stopAtNonOption);
            fail("Expected AmbiguousOptionException");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOptionsWithOptionGroupAndRequiredOption_gutP7_MhHX0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "-b", "-c", "--d"};
        boolean stopAtNonOption = false;
        try {
            CommandLine result = parser.parse(options, arguments, new Properties(), stopAtNonOption);
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOptionsWithOptionGroupAndAmbiguousOption_NBAv8_VnUl0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "-b", "-c", "-d"};
        boolean stopAtNonOption = false;
        try {
            CommandLine cmd = parser.parse(options, arguments, new Properties(), stopAtNonOption);
            fail("Expected AmbiguousOptionException");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOptionsWithOptionGroupAndNonOptionAndRequiredOption_LWlE9_ncSK0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "-b", "hello", "world", "--d"};
        boolean stopAtNonOption = false;
        try {
            CommandLine result = parser.parse(options, arguments, new Properties(), stopAtNonOption);
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOptionsWithOptionGroupAndOption_JGlm10_RTkD0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "-b", "-c", "--d", "--e"};
        boolean stopAtNonOption = false;
        try {
            CommandLine result = parser.parse(options, arguments, new Properties(), stopAtNonOption);
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOptionsWithOptionGroupAndOptionAndNonOption_vzDm11_SRzf0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "-b", "hello", "world", "--e"};
        boolean stopAtNonOption = false;
        try {
            CommandLine result = parser.parse(options, arguments, new Properties(), stopAtNonOption);
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOptionsWithOptionGroupAndOptionAndAmbiguousOption_IdVJ13_LIfu0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "-b", "-c", "-d", "--e"};
        boolean stopAtNonOption = false;
        try {
            parser.parse(options, arguments, new Properties(), stopAtNonOption);
            fail("Expected AmbiguousOptionException");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOptionsWithOptionGroupAndOptionAndNonOptionAndRequiredOption_rUCB14_BmQW0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "-b", "hello", "world", "--d", "--e"};
        boolean stopAtNonOption = false;
        try {
            CommandLine result = parser.parse(options, arguments, new Properties(), stopAtNonOption);
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithAmbiguousOptionAndStopAtNonOption_aSQt8_nwMO0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"--a", "b", "c"};
        boolean stopAtNonOption = true;
        try {
            CommandLine result = parser.parse(options, arguments, new Properties(), stopAtNonOption);
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithAmbiguousOptionToken_ejay13_nTnc0() {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"--a", "b", "c"};
        boolean stopAtNonOption = false;
        try {
            CommandLine result = parser.parse(options, arguments, new Properties(), stopAtNonOption);
        } catch (ParseException e) {
        }
    }
}