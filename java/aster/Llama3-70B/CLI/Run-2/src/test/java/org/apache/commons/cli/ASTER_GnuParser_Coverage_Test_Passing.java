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
    public void testFlatten_withEqualPos_kYdz0() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("opt", true, "description");
        String[] arguments = new String[]{"-opt=value", "arg1", "arg2"};
        String[] expected = new String[]{"-opt", "value", "arg1", "arg2"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }
}