/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PercentCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonByteArray_kDxR2() throws DecoderException {
        PercentCodec percentCodec = new PercentCodec();
        Object input = new Object();
        Object actual = percentCodec.decode(input);
        Object expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_WYgO1() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] obj = new byte[]{0x01, 0x02, 0x03};
        Object result = percentCodec.encode(obj);
        byte[] expected = new byte[]{0x25, 0x30, 0x31, 0x25, 0x30, 0x32, 0x25, 0x30, 0x33};
        Assertions.assertArrayEquals(expected, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithBytes_UzPC0() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{0x01, 0x02, 0x03};
        byte[] actual = percentCodec.encode(bytes);
        byte[] expected = new byte[]{0x25, 0x30, 0x31, 0x25, 0x30, 0x32, 0x25, 0x30, 0x33};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_XvRW1_fid1() throws DecoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[0];
        Object actual = percentCodec.decode(input);
        Object expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArrayInput_QOFr3_fid1() throws DecoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[10];
        Object actual = percentCodec.decode(input);
        Object expected = null;
        assertEquals(expected, actual);
    }
}