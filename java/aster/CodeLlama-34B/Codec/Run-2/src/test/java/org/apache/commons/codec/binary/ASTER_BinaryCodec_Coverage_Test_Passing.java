/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BinaryCodec_Coverage_Test_Passing {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_nullInput_YcYw0() {
        char[] ascii = null;
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAscii_emptyInput_rVNs1() {
        char[] ascii = new char[0];
        byte[] expected = new byte[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_notByteArray_rRfs0() throws org.apache.commons.codec.EncoderException {
        BinaryCodec codec = new BinaryCodec();
        try {
            codec.encode("not a byte array");
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("argument not a byte array", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_QRKU0_caPX0_fid1() throws org.apache.commons.codec.DecoderException {
        BinaryCodec codec = new BinaryCodec();
        Object result = codec.decode(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullByteArray_nKVc8_fyvH0_fid1() throws org.apache.commons.codec.DecoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] ascii = null;
        Object result = codec.decode(ascii);
    }
}