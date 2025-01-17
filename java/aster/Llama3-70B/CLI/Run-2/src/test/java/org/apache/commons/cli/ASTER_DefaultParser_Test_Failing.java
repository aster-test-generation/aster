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

public class Aster_DefaultParser_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleConcatenatedOptions7_UTvo6() {
        DefaultParser parser = new DefaultParser();
        try {
            parser.handleConcatenatedOptions("-x");
            fail("Expected ParseException");
        } catch (ParseException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withLongOption_viry1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("apple", "description");
        String[] arguments = new String[]{"--apple=value"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertEquals("value", cmd.getOptionValue("apple"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_NjHv3_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "value", "nonOption"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, true);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_NjHv3_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "value", "nonOption"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, true);
        assertEquals("nonOption", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withPartialMatching_aoAx3() throws ParseException {
        DefaultParser parser = new DefaultParser(true);
        Options options = new Options();
        options.addOption("arg", "argument", true, "argument");
        options.addOption("arg2", "argument2", true, "argument2");
        String[] arguments = new String[]{"--arg"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertEquals("arg", cmd.getOptionValue("arg"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withConcatenatedOptions_voyz2_1() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        options.addOption("b", "banana", true, "description");
        String[] arguments = new String[]{"-ab", "value1", "value2"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertEquals("value1", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withConcatenatedOptions_voyz2_2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        options.addOption("b", "banana", true, "description");
        String[] arguments = new String[]{"-ab", "value1", "value2"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertEquals("value2", cmd.getOptionValue("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_QQvj1_SSKY0() {
        Options options = new Options();
        options.addOption("a", "arg", true, "argument");
        DefaultParser parser = new DefaultParser();
        String[] arguments = {"-a", "value", "extra", "-b"};
        Properties properties = new Properties();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
        assertEquals(1, cmd.getOptions().length);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals(2, cmd.getArgs().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_DWCk3_rOUv0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "arg", true, "argument");
        String[] arguments = new String[]{"-a", "value", "extra", "-b", "value2"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals("extra", cmd.getArgs()[0]);
            assertEquals(1, cmd.getArgs().length);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_SiAn2_Qrsk0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "arg", true, "argument");
        String[] arguments = new String[]{"-a", "value", "extra", "-b", "value2"};
        Properties properties = new Properties();
        CommandLine cmd;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        assertEquals(1, cmd.getOptions().length);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("extra", cmd.getArgs()[0]);
        assertEquals("-b", cmd.getArgs()[1]);
        assertEquals("value2", cmd.getArgs()[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withProperties_yZdv3_vHVd0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "arg", true, "argument");
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        properties.put("a", "property-value");
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
        assertEquals(1, cmd.getOptions().length);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("property-value", cmd.getOptionProperties("a").get("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_nkKH2_RRZf0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "arg", true, "argument");
        String[] arguments = new String[]{"-a", "value", "extra", "-b", "other"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals("extra", cmd.getArgs()[0]);
            assertEquals(1, cmd.getArgs().length);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withProperties_CgOW3_cqrx0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "arg", true, "argument");
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        properties.setProperty("a", "property-value");
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("property-value", cmd.getOptionProperties("a").getProperty("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_ZTSc3_pooO0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "arg", true, "argument");
        String[] arguments = new String[]{"-a", "value", "extra", "-b"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals("extra", cmd.getArgs()[0]);
            assertEquals("-b", cmd.getArgs()[1]);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_FuHt1_GmQN0() {
        Options options = new Options();
        options.addOption("a", "arg", true, "argument");
        DefaultParser parser = new DefaultParser();
        String[] arguments = new String[]{"-a", "value", "extra", "-b", "another"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals("extra", cmd.getArgs()[0]);
            assertEquals("-b", cmd.getArgs()[1]);
            assertEquals("another", cmd.getArgs()[2]);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_tDYn1_ECAl0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "arg", true, "argument");
        String[] arguments = new String[]{"-a", "value", "extra"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals(0, cmd.getArgs().length);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_XlzC1_EZAm0() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        DefaultParser parser = new DefaultParser();
        String[] arguments = new String[]{"-a", "value", "arg1", "-b", "arg2"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals(1, cmd.getArgs().length);
            assertEquals("value", cmd.getOptionValue("a"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withProperties_viZR2_whHh0() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        DefaultParser parser = new DefaultParser();
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        properties.put("a", "propertyValue");
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            fail("ParseException occurred");
        }
        assertEquals("propertyValue", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withLongOption_cKBu1_UGiL0() {
        DefaultParser parser = new DefaultParser(true);
        Options options = new Options();
        options.addOption("alpha", "alpha option");
        String[] arguments = new String[]{"--alpha=value", "arg1", "arg2"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals(2, cmd.getArgs().length);
            assertEquals("value", cmd.getOptionValue("alpha"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withLongOption_VyzK1_MFnj0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("alpha", "alpha option");
        String[] arguments = new String[]{"--alpha", "value", "arg1", "arg2"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals(2, cmd.getArgList().size());
            assertEquals("value", cmd.getOptionValue("alpha"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_wVsu3_oMpb0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "value", "arg1", "arg2", "nonOption"};
        Properties properties = new Properties();
        CommandLine cmd;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        assertEquals(1, cmd.getArgList().size());
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionsAndArguments_uwsK0_iqFY0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "value", "-b", "arg"};
        Properties properties = new Properties();
        CommandLine cmd;
        try {
            cmd = parser.parse(options, arguments, properties);
            assertEquals(2, cmd.getOptions().length);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals("arg", cmd.getOptionValue("b"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withProperties_rCOI3_arZz0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        properties.put("alpha", "propertyValue");
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
        assertEquals(1, cmd.getOptions().length);
        assertEquals("propertyValue", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withArguments_KGKU0_Hlfz0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        options.addOption("b", "bravo", false, "bravo option");
        String[] arguments = new String[]{"-a", "value", "-b", "arg"};
        Properties properties = new Properties();
        CommandLine cmd;
        try {
            cmd = parser.parse(options, arguments, properties);
            assertEquals(2, cmd.getOptions().length);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals("arg", cmd.getOptionValue("b"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withLongOption_zZvT1_JXlx0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("alpha", true, "alpha option");
        String[] arguments = {"--alpha=value"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals("value", cmd.getOptionValue("alpha"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_fgdC1_LwRJ0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        String[] arguments = new String[]{"-a", "value", "nonOption", "-b"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals("value", cmd.getOptionValue("alpha"));
            assertEquals("nonOption", cmd.getArgs()[0]);
            assertEquals("-b", cmd.getArgs()[1]);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionsAndArguments_whHZ0_fvdc0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "value", "-b", "arg1", "arg2"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals(2, cmd.getOptions().length);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals("true", cmd.getOptionValue("b"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withProperties_qWPa2_Prkp0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        String[] arguments = new String[]{"-a", "value"};
        Properties properties = new Properties();
        properties.put("a", "propertyValue");
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
        assertEquals("propertyValue", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionsAndArguments_WTLk0_oscV0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        options.addOption("b", "bravo", false, "bravo option");
        String[] arguments = new String[]{"-a", "value", "-b", "arg"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals(2, cmd.getOptions().length);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals("true", cmd.getOptionValue("b"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withOptionsAndArguments_YtSx0_kvOZ0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        options.addOption("b", "bravo", false, "bravo option");
        String[] arguments = new String[]{"-a", "value", "-b", "arg"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertNotNull(cmd);
            assertEquals(2, cmd.getOptions().length);
            assertEquals("value", cmd.getOptionValue("a"));
            assertEquals("true", cmd.getOptionValue("b"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withRequiredOption_ihDi0_xsaz0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "value", "-b"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals(2, cmd.getOptions().length);
            assertEquals("value", cmd.getOptionValue("a"));
            assertNotNull(cmd.getOptionValue("b"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withLongOption_AFYK1_CTsK0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("alpha", true, "alpha option");
        String[] arguments = new String[]{"--alpha=value"};
        Properties properties = new Properties();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
        assertEquals(1, cmd.getOptions().length);
        assertEquals("value", cmd.getOptionValue("alpha"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withShortAndLongOption_exEZ2_nswU0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "value", "--beta"};
        Properties properties = new Properties();
        try {
            CommandLine cmd = parser.parse(options, arguments, properties);
            assertEquals(2, cmd.getOptions().length);
            assertEquals("value", cmd.getOptionValue("a"));
            assertNotNull(cmd.getOptionValue("beta"));
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_alTp2_JYoL0() {
        Options options = new Options();
        DefaultParser parser = new DefaultParser();
        String[] arguments = {"-a", "value", "arg1", "-x", "arg2"};
        Properties properties = new Properties();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, arguments, properties);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
        assertEquals(2, cmd.getArgs().length);
        assertEquals("value", cmd.getOptionValue("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_IIxd3_YFIL0() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        try {
            CommandLine cmd = parser.parse(options, new String[]{"-a", "value", "non-option"}, null);
            assertEquals(2, cmd.getArgs().length);
        } catch (ParseException e) {
            fail("ParseException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withStopAtNonOption_NjHv3() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "value", "nonOption"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, true);
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals("nonOption", cmd.getArgs()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParse_withConcatenatedOptions_voyz2() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", "apple", true, "description");
        options.addOption("b", "banana", true, "description");
        String[] arguments = new String[]{"-ab", "value1", "value2"};
        Properties properties = new Properties();
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertEquals("value1", cmd.getOptionValue("a"));
        assertEquals("value2", cmd.getOptionValue("b"));
    }
}