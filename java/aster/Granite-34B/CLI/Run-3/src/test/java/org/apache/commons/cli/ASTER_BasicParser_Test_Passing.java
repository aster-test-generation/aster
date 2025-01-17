/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BasicParser_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_IFWN0() throws Exception {
        Options options = new Options();
        String[] arguments = {};
        boolean stopAtNonOption = false;
        String[] expected = {};
        String[] actual = new BasicParser().flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten2_ChWn1() throws Exception {
        Options options = new Options();
        String[] arguments = {"arg1", "arg2"};
        boolean stopAtNonOption = false;
        String[] expected = {"arg1", "arg2"};
        String[] actual = new BasicParser().flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten3_sVOp2() throws Exception {
        Options options = new Options();
        String[] arguments = {"-arg1", "-arg2"};
        boolean stopAtNonOption = false;
        String[] expected = {"-arg1", "-arg2"};
        String[] actual = new BasicParser().flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten4_jKli3() throws Exception {
        Options options = new Options();
        String[] arguments = {"arg1", "arg2"};
        boolean stopAtNonOption = true;
        String[] expected = {"arg1", "arg2"};
        String[] actual = new BasicParser().flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten5_IUUK4() throws Exception {
        Options options = new Options();
        String[] arguments = {"-arg1", "-arg2"};
        boolean stopAtNonOption = true;
        String[] expected = {"-arg1", "-arg2"};
        String[] actual = new BasicParser().flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, actual);
    }
}