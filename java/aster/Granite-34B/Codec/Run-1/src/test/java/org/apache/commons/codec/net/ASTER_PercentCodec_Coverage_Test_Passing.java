/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PercentCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_Agqp0() throws org.apache.commons.codec.DecoderException {
        PercentCodec percentCodec = new PercentCodec();
        Object result = percentCodec.decode(null);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_JxJg1() throws org.apache.commons.codec.DecoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] input = new byte[]{0x41, 0x42, 0x43};
        Object result = percentCodec.decode(input);
        assert result instanceof byte[];
        assert Arrays.equals((byte[]) result, new byte[]{0x41, 0x42, 0x43});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_IOdO0() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        Object obj = null;
        Object actual = percentCodec.encode(obj);
        Object expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNotByteArray_GgNE2() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        Object obj = new Object();
        try {
            Object actual = percentCodec.encode(obj);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
        }
    }
}