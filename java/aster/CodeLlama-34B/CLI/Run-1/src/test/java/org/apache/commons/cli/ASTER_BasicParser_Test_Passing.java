/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BasicParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten1_fnfm0() {
        Options options = new Options();
        String[] arguments = new String[]{"-a", "--arg1", "value1", "--arg2", "value2"};
        BasicParser parser = new BasicParser();
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-a", "--arg1", "value1", "--arg2", "value2"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten2_nMCA1() {
        Options options = new Options();
        String[] arguments = new String[]{"-a", "--arg1", "value1", "--arg2", "value2"};
        BasicParser parser = new BasicParser();
        String[] result = parser.flatten(options, arguments, true);
        assertArrayEquals(new String[]{"-a", "--arg1", "value1", "--arg2", "value2"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessOption_optionWithoutRequiredOptionAndGroup_qWVq11() throws ParseException {
        BasicParser parser = new BasicParser();
        ListIterator<String> iter = new ArrayList<String>().listIterator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionsReturnsCorrectRequiredOptions_gRUH7_fid1() {
        BasicParser parser = new BasicParser();
        Options options = parser.getOptions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArguments_EIhb4_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArguments_EIhb4_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertEquals(2, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOption_klAn5_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOption_klAn5_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertEquals(2, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOption_klAn5_5() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertEquals(1, cmd.getArgList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOption_klAn5_6() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertEquals("gamma", cmd.getArgList().get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionFalse_GpRB6_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionFalse_GpRB6_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertEquals(2, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionFalse_GpRB6_5() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertEquals(1, cmd.getArgList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionFalse_GpRB6_6() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertEquals("gamma", cmd.getArgList().get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionAndMultipleNonOptionArguments_NjLC7_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionAndMultipleNonOptionArguments_NjLC7_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertEquals(2, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionAndMultipleNonOptionArguments_NjLC7_5() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertEquals(2, cmd.getArgList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionAndMultipleNonOptionArguments_NjLC7_6() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertEquals("gamma", cmd.getArgList().get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionAndMultipleNonOptionArguments_NjLC7_7() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, true);
        assertEquals("delta", cmd.getArgList().get(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionFalseAndMultipleNonOptionArguments_agXa8_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionFalseAndMultipleNonOptionArguments_agXa8_2() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertEquals(2, cmd.getOptions().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionFalseAndMultipleNonOptionArguments_agXa8_5() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertEquals(2, cmd.getArgList().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionFalseAndMultipleNonOptionArguments_agXa8_6() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertEquals("gamma", cmd.getArgList().get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndStopAtNonOptionFalseAndMultipleNonOptionArguments_agXa8_7() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta", "gamma", "delta"};
        CommandLine cmd = parser.parse(options, arguments, false);
        assertEquals("delta", cmd.getArgList().get(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidInputs_uMGL3_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta"};
        Properties properties = new Properties();
        properties.setProperty("alpha", "value1");
        properties.setProperty("beta", "value2");
        CommandLine cmd = parser.parse(options, arguments, properties);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndArgumentsAndNullProperties_KMjv4_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta"};
        CommandLine cmd = parser.parse(options, arguments, null);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidOptionsAndPropertiesAndNullArguments_DuCx5_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        Properties properties = new Properties();
        properties.setProperty("alpha", "value1");
        properties.setProperty("beta", "value2");
        CommandLine cmd = parser.parse(options, null, properties);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidInputsAndIgnoreRequiredOptions_AcOp7_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta"};
        Properties properties = new Properties();
        properties.setProperty("alpha", "value1");
        properties.setProperty("beta", "value2");
        CommandLine cmd = parser.parse(options, arguments, properties, true);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseWithValidInputsAndIgnoreRequiredOptionsFalse_CaXz8_1() throws ParseException {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String[] arguments = new String[]{"-a", "--beta"};
        Properties properties = new Properties();
        properties.setProperty("alpha", "value1");
        properties.setProperty("beta", "value2");
        CommandLine cmd = parser.parse(options, arguments, properties, false);
        assertNotNull(cmd);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptions_ZhhU0_liDP0() {
        Options options = new Options();
        BasicParser parser = new BasicParser();
        parser.setOptions(options);
        assertEquals(options, parser.getOptions());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptionsRequiredOptions_IHTp1_xXRR0() {
        Options options = new Options();
        BasicParser parser = new BasicParser();
        parser.setOptions(options);
        assertEquals(options.getRequiredOptions(), parser.getRequiredOptions());
    }
}