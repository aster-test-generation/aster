/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DefaultParser_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions2_jKmW1() throws ParseException {
        DefaultParser defaultParser = new DefaultParser();
        String token = "a";
        defaultParser.handleConcatenatedOptions(token);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleTokenWithStopAtNonOption_BrkY0() throws ParseException {
        DefaultParser parser = new DefaultParser(true);
        parser.parse(new Options(), new String[]{"--"}, null, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleTokenWithSkipParsing_NFcK1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        parser.parse(new Options(), new String[]{"--"}, null, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleTokenWithCurrentOptionAndAcceptsArgAndIsArgument_OCNn2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        parser.parse(new Options(), new String[]{"arg"}, null, false);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsOption_PLMN0() throws org.apache.commons.cli.ParseException {
        DefaultParser parser = new DefaultParser();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLongOption_xozE0() throws org.apache.commons.cli.ParseException {
        DefaultParser defaultParser = new DefaultParser();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexOfEqual_LNhw1() throws org.apache.commons.cli.ParseException {
        DefaultParser parser = new DefaultParser();
        String token = "-S=V";
        int result = parser.indexOfEqual(token);
        assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_bXdX9() throws org.apache.commons.cli.ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"--"};
        Properties properties = new Properties();
        boolean stopAtNonOption = true;
        CommandLine result = parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArgument_vgBG0() throws org.apache.commons.cli.ParseException {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexOfEqual_vJuR0_fid1() throws org.apache.commons.cli.ParseException {
        DefaultParser parser = new DefaultParser();
        String token = "--option=value";
        int expected = 10;
        int actual = parser.indexOfEqual(token);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexOfEqual_MoOJ7_fid1() throws org.apache.commons.cli.ParseException {
        DefaultParser parser = new DefaultParser();
        int result = parser.indexOfEqual("test");
        int expected = -1;
        assertEquals(expected, result);
    }
}