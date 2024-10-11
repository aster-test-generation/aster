/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.verify;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DefaultParser_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleLongOption_rKYx0_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        String[] arguments = {"--"};
        parser.parse(new Options(), arguments, new Properties(), false);
        assertEquals("--", parser.currentToken);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleLongOption_rKYx0_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        String[] arguments = {"--"};
        parser.parse(new Options(), arguments, new Properties(), false);
        assertTrue(parser.skipParsing);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArgument_DFzE0() throws org.apache.commons.cli.ParseException {
        DefaultParser defaultParser = new DefaultParser();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithNullAsArguments_gmkx3() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = null;
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine commandLine = parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_WNAa5() throws org.apache.commons.cli.ParseException
    {
        final Options options = new Options();
        final String[] arguments = new String[0];
        final Properties properties = new Properties();
        final boolean stopAtNonOption = false;
        final DefaultParser defaultParser = new DefaultParser();
        final CommandLine commandLine = defaultParser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIndexOfEqual_cZdb0() throws org.apache.commons.cli.ParseException {
        DefaultParser defaultParser = new DefaultParser();
        String token = "token"; // or any other string
        int pos = defaultParser.indexOfEqual(token);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseHandleLongOptionWithEqualPos1_PrxY6() throws ParseException {
        final DefaultParser parser = new DefaultParser();
        final Options options = new Options();
        options.addOption("L", "longOption", true, "long option description");
        final String[] arguments = {"-L=value1=value2"};
        parser.parse(options, arguments, null, false);
        verify(parser).handleConcatenatedOptions("-L=value1=value2");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArgument_BWyr0() throws org.apache.commons.cli.ParseException {
        DefaultParser parser = new DefaultParser();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithEmptyListAsArguments_VaGj2_kueJ0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = {};
        Properties properties = new Properties();
        boolean stopAtNonOption = false;
        CommandLine commandLine = parser.parse(options, arguments, properties, stopAtNonOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleLongOption_rKYx0() throws ParseException {
        DefaultParser parser = new DefaultParser();
        String[] arguments = {"--"};
        parser.parse(new Options(), arguments, new Properties(), false);
        assertEquals("--", parser.currentToken);
        assertTrue(parser.skipParsing);
    }
}