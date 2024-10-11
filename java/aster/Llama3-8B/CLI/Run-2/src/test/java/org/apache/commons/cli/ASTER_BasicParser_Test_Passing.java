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
    public void testFlatten_VpfM0() {
        BasicParser parser = new BasicParser();
        Options options = new Options();
        String[] arguments = new String[]{"a", "b", "c"};
        boolean stopAtNonOption = false;
        String[] expected = {"a", "b", "c"};
        String[] result = parser.flatten(options, arguments, stopAtNonOption);
        assertArrayEquals(expected, result);
    }
}