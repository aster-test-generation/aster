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

public class Aster_PosixParser_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlatten_LbIL0() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "--b", "c", "-d", "--e", "f"};
        String[] expected = new String[]{"-a", "--b", "c", "-d", "--e", "f"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFlattenWithGobble_tOMC1() throws ParseException {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        String[] arguments = new String[]{"-a", "--b", "c", "-d", "--e", "f", "-g", "h", "i"};
        String[] expected = new String[]{"-a", "--b", "c", "-d", "--e", "f", "-g", "h", "i"};
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, result);
    }
}