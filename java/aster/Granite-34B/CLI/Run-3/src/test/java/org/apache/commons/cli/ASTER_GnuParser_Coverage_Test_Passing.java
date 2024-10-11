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

public class Aster_GnuParser_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithMinus_nUbW1_jSlW0() {
        Options options = new Options();
        String[] arguments = {"-"};
        GnuParser gnuParser = new GnuParser();
        String[] result = gnuParser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithDoubleHyphen_TsnZ0_vLMO0() {
        Options options = new Options();
        String[] arguments = {"--"};
        GnuParser gnuParser = new GnuParser();
        String[] result = gnuParser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"--"}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithHasOption_ygrX3_TYGy0() {
        Options options = new Options();
        String[] arguments = {"-property=value"};
        GnuParser gnuParser = new GnuParser();
        String[] result = gnuParser.flatten(options, arguments, false);
        assertArrayEquals(new String[]{"-property=value"}, result);
    }
}