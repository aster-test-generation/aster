/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BinaryCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_asciiLengthIsNonZero_gvsj1() {
        char[] ascii = {'1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] expected = {0x55};
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithEmptyRaw_zNPL0() {
        byte[] raw = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_dAfw0_dMqd0() throws org.apache.commons.codec.EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0, 1, 1};
        String expected = "AAE=";
        byte[] actual = codec.encode(input);
        assertArrayEquals(expected.getBytes(), actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_dAfw0_xsQq1() throws org.apache.commons.codec.EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0, 1, 1};
        String expected = "AAE=";
        String actual = new String(codec.encode(input));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiBytesWithNonEmptyRaw_jkjJ1_DWQi0() {
        byte[] raw = new byte[]{1, 2, 3};
        byte[] expected = new byte[]{(byte) 128, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 10};
        byte[] actual = BinaryCodec.toAsciiBytes(raw);
        assertArrayEquals(expected, actual);
    }
}