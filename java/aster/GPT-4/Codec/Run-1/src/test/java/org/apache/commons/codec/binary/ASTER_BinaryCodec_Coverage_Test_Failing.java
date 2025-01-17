/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_oeWs1_2() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x01, 0x02, 0x03};
        Object result = codec.encode(input);
        assertTrue(result instanceof char[]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_oeWs1_3() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x01, 0x02, 0x03};
        Object result = codec.encode(input);
        assertArrayEquals(new char[]{'\u0001', '\u0002', '\u0003'}, (char[]) result);
    }

    @Test
    public void testEncodeWithNull_QPot2_RNWE0() {
        BinaryCodec codec = new BinaryCodec();
        try {
            codec.toAsciiBytes(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testEncodeWithNonByteArray_spPt0_TxdE0() {
        BinaryCodec codec = new BinaryCodec();
        try {
            codec.toAsciiBytes("This is a string, not a byte array".getBytes());
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testEncodeWithNull_QPot2_RNWE0_fid1() {
        BinaryCodec codec = new BinaryCodec();
        try {
            codec.toAsciiBytes(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Correctly caught the expected exception
        }
    }

    @Test
    public void testEncodeWithNonByteArray_spPt0_TxdE0_fid1() {
        BinaryCodec codec = new BinaryCodec();
        try {
            codec.toAsciiBytes("This is a string, not a byte array".getBytes());
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Test passes as IllegalArgumentException is expected
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_oeWs1() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x01, 0x02, 0x03};
        Object result = codec.encode(input);
        assertNotNull(result);
        assertTrue(result instanceof char[]);
        assertArrayEquals(new char[]{'\u0001', '\u0002', '\u0003'}, (char[]) result);
    }
}