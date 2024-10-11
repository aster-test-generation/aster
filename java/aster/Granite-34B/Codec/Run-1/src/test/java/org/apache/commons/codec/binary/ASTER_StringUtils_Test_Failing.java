/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_StringUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16_BbdN0() {
        String input = "Hello, World!";
        byte[] expected = {0, 'H', 0, 'e', 0, 'l', 0, 'l', 0, 'o', 0, ',', 0, ' ', 0, 'W', 0, 'o', 0, 'r', 0, 'l', 0, 'd', 0, '!'};
        assertArrayEquals(expected, StringUtils.getBytesUtf16(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUtf16Be_bAfU0() {
        String input = "Hello, World!";
        byte[] expected = new byte[]{-2, -1, 72, 0, 101, 0, 108, 0, 108, 0, 111, 0, 44, 0, 32, 0, 87, 0, 111, 0, 114, 0, 108, 0, 100, 0, 33, 0};
        byte[] actual = StringUtils.getBytesUtf16Be(input);
        assertArrayEquals(expected, actual);
    }
}