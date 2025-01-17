/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PosixParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithEmptyArguments_tKId0() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[0];
        boolean stopAtNonOption = false;
        String[] expected = new String[0];
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOption_dIBz1() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", false, "description");
        String[] arguments = new String[]{"-a"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a", "aaa"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOptionAndValue_qnCm2() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", true, "description");
        String[] arguments = new String[]{"-a", "value"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a", "aaa", "value"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOptionAndEqualSign_LeRe3() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", false, "description");
        String[] arguments = new String[]{"-a=value"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a", "aaa", "value"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOptionAndNoValue_ZJiQ4() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", true, "description");
        String[] arguments = new String[]{"-a"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a", "aaa"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOptionAndNoValueAndEqualSign_pMIg5() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", true, "description");
        String[] arguments = new String[]{"-a="};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a", "aaa"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithTwoOptions_QUFs6() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", false, "description");
        options.addOption("b", "bbb", false, "description");
        String[] arguments = new String[]{"-a", "-b"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a", "aaa", "-b", "bbb"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenNoOptions_BJuX0() throws Exception {
        String[] arguments = new String[0];
        Options options = new Options();
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOneOption_PbWV1_1() throws Exception {
        String[] arguments = new String[]{"-a"};
        Options options = new Options();
        options.addOption("a", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals(1, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOneOption_PbWV1_2() throws Exception {
        String[] arguments = new String[]{"-a"};
        Options options = new Options();
        options.addOption("a", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("-a", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptions_cDYY2_1() throws Exception {
        String[] arguments = new String[]{"-a", "-b"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals(2, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptions_cDYY2_2() throws Exception {
        String[] arguments = new String[]{"-a", "-b"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("-a", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptions_cDYY2_3() throws Exception {
        String[] arguments = new String[]{"-a", "-b"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("-b", result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOneOptionOneNonOption_GCZq3_1() throws Exception {
        String[] arguments = new String[]{"-a", "non-option"};
        Options options = new Options();
        options.addOption("a", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals(2, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOneOptionOneNonOption_GCZq3_2() throws Exception {
        String[] arguments = new String[]{"-a", "non-option"};
        Options options = new Options();
        options.addOption("a", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("-a", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOneOptionOneNonOption_GCZq3_3() throws Exception {
        String[] arguments = new String[]{"-a", "non-option"};
        Options options = new Options();
        options.addOption("a", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("non-option", result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOneOptionTwoNonOptions_ETPR4_1() throws Exception {
        String[] arguments = new String[]{"-a", "non-option1", "non-option2"};
        Options options = new Options();
        options.addOption("a", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals(3, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOneOptionTwoNonOptions_ETPR4_2() throws Exception {
        String[] arguments = new String[]{"-a", "non-option1", "non-option2"};
        Options options = new Options();
        options.addOption("a", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("-a", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOneOptionTwoNonOptions_ETPR4_3() throws Exception {
        String[] arguments = new String[]{"-a", "non-option1", "non-option2"};
        Options options = new Options();
        options.addOption("a", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("non-option1", result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenOneOptionTwoNonOptions_ETPR4_4() throws Exception {
        String[] arguments = new String[]{"-a", "non-option1", "non-option2"};
        Options options = new Options();
        options.addOption("a", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("non-option2", result[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptionsOneNonOption_cLzU5_1() throws Exception {
        String[] arguments = new String[]{"-a", "-b", "non-option"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals(3, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptionsOneNonOption_cLzU5_2() throws Exception {
        String[] arguments = new String[]{"-a", "-b", "non-option"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("-a", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptionsOneNonOption_cLzU5_3() throws Exception {
        String[] arguments = new String[]{"-a", "-b", "non-option"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("-b", result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptionsOneNonOption_cLzU5_4() throws Exception {
        String[] arguments = new String[]{"-a", "-b", "non-option"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("non-option", result[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptionsTwoNonOptions_Zuif6_1() throws Exception {
        String[] arguments = new String[]{"-a", "-b", "non-option1", "non-option2"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals(4, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptionsTwoNonOptions_Zuif6_2() throws Exception {
        String[] arguments = new String[]{"-a", "-b", "non-option1", "non-option2"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("-a", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptionsTwoNonOptions_Zuif6_3() throws Exception {
        String[] arguments = new String[]{"-a", "-b", "non-option1", "non-option2"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("-b", result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptionsTwoNonOptions_Zuif6_4() throws Exception {
        String[] arguments = new String[]{"-a", "-b", "non-option1", "non-option2"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("non-option1", result[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenTwoOptionsTwoNonOptions_Zuif6_5() throws Exception {
        String[] arguments = new String[]{"-a", "-b", "non-option1", "non-option2"};
        Options options = new Options();
        options.addOption("a", false, "description");
        options.addOption("b", false, "description");
        PosixParser parser = new PosixParser();
        String[] result = parser.flatten(options, arguments, false);
        assertEquals("non-option2", result[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithEmptyOptions_gNLf0() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOption_jqpZ1() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", false, "description");
        String[] arguments = new String[]{"-a"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOptionAndValue_AcuO2() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", true, "description");
        String[] arguments = new String[]{"-a", "value"};
        boolean stopAtNonOption = false;
        String[] expected = new String[]{"-a", "value"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOptionAndValueAndStopAtNonOption_KkTx3() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", true, "description");
        String[] arguments = new String[]{"-a", "value"};
        boolean stopAtNonOption = true;
        String[] expected = new String[]{"-a", "value"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOptionAndValueAndStopAtNonOptionAndNonOption_XIdf4() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", true, "description");
        String[] arguments = new String[]{"-a", "value", "non-option"};
        boolean stopAtNonOption = true;
        String[] expected = new String[]{"-a", "value"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithOneOptionAndValueAndStopAtNonOptionAndNonOptionAndNonOption_AcIe5() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "aaa", true, "description");
        String[] arguments = new String[]{"-a", "value", "non-option", "non-option"};
        boolean stopAtNonOption = true;
        String[] expected = new String[]{"-a", "value"};
        String[] actual = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }
}