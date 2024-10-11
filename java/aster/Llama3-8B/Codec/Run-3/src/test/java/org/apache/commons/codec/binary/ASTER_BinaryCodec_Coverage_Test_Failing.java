/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BinaryCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsciiWithBits_aHVd2() {
        char[] ascii = new char[]{'1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[]{(byte) 0x3F};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsciiWithMultipleBytes_SpEm3() {
        char[] ascii = new char[]{'1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[]{(byte) 0x3F, (byte) 0x3F};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiSingleByteAscii_nYXe1() {
        byte[] ascii = new byte[]{(byte) 0x80};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[]{(byte) 0x80};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultiByteAscii_Aijx2() {
        byte[] ascii = new byte[]{(byte) 0x80, (byte) 0x40, (byte) 0x20, (byte) 0x10};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[]{(byte) 0x80, (byte) 0x40};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_nAJN0() throws org.apache.commons.codec.DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        Object result = binaryCodec.decode(null);
        assertEquals(new byte[0], result);
    }
}