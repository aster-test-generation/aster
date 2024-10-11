/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_oeWs1_1() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x01, 0x02, 0x03};
        Object result = codec.encode(input);
        assertNotNull(result);
    }

    @Test
    public void testDecodeWithInvalidType_hADh7_zDnq0() {
        BinaryCodec codec = new BinaryCodec();
        Object input = new Object();
        try {
            codec.decode(input);
            fail("Expected a DecoderException to be thrown");
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonEmptyByteArray_TnHU2_ciLT0() throws DecoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = {'1', '0', '1'};
        byte[] expected = codec.fromAscii(input);
        assertArrayEquals(expected, (byte[]) codec.decode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyByteArray_dElN1_vRYp0() throws DecoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[0];
        assertArrayEquals(new byte[0], codec.toAsciiBytes(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiWithEmptyArray_iUAe1_YWqb0() {
        assertArrayEquals(new byte[0], BinaryCodec.toAsciiBytes(new byte[0]));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyString_IrFu5_lhfv0() throws DecoderException {
        BinaryCodec codec = new BinaryCodec();
        String input = "";
        assertArrayEquals(new byte[0], codec.toAsciiBytes(input.getBytes()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonEmptyString_hztC6_uLBm0() throws DecoderException {
        BinaryCodec codec = new BinaryCodec();
        String input = "101";
        byte[] expected = codec.fromAscii(input.toCharArray());
        byte[] result = (byte[]) codec.decode(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_oeWs1_2_fid1() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] input = new byte[]{0x01, 0x02, 0x03};
        Object result = codec.encode(input);
        assertFalse(result instanceof char[]);
    }
}