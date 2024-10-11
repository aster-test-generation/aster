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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PercentCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonByteArrayObject_AfqK2() throws org.apache.commons.codec.DecoderException {
        PercentCodec percentCodec = new PercentCodec();
        Object input = new Object();
        Object result = percentCodec.decode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_VKul0() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = new byte[]{-128};
        byte[] expected = new byte[]{45, 49, 50, 56};
        byte[] actual = percentCodec.encode(bytes);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_DAjQ3() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        String inputString = "Hello, World!";
        Object encodedObject = percentCodec.encode(inputString);
        assert encodedObject != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpaceChar_xqss2() throws EncoderException {
        byte[] bytes = {(byte) 0x20};
        byte[] expected = {(byte) 0x25, (byte) 0x32, (byte) 0x30};
        byte[] actual = new PercentCodec().encode(bytes);
        assertArrayEquals(expected, actual);
    }
}