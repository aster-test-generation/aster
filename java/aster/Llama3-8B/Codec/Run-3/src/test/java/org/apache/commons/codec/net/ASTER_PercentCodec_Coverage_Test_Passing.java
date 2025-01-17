/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PercentCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullInput_uaSi0() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[0], false);
        Object result = percentCodec.encode(null);
        assert (result == null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testByteArrayInput_oVFe2() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[0], false);
        byte[] byteArray = new byte[]{1, 2, 3};
        Object result = percentCodec.encode(byteArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testByteArrayInputWithAlwaysEncodeChars_Zcha3() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[]{'a', 'b'}, false);
        byte[] byteArray = new byte[]{1, 2, 3};
        Object result = percentCodec.encode(byteArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsciiChar_bWHJ0() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[0], false);
        byte[] bytes = new byte[]{(byte) 'a'};
        byte[] expected = new byte[]{(byte) 'a'};
        assertArrayEquals(expected, percentCodec.encode(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNoEncoding_KfmI4() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[0], false);
        byte[] bytes = new byte[]{(byte) 'a', (byte) 'b'};
        byte[] expected = new byte[]{(byte) 'a', (byte) 'b'};
        assertArrayEquals(expected, percentCodec.encode(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullBytes_mCWl0() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] result = percentCodec.encode(null);
        assertArrayEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBytesWithoutSpaceAndNoNeedToEncode_bMkD1() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = "hello".getBytes();
        byte[] result = percentCodec.encode(bytes);
        assertArrayEquals(bytes, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBytesWithSpaceAndNeedToEncode_oYMl2() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec();
        byte[] bytes = "hello world".getBytes();
        byte[] result = percentCodec.encode(bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBytesWithoutSpaceAndPlusForSpace_xMRq4() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[]{'a', 'b'}, true);
        byte[] bytes = "hello".getBytes();
        byte[] result = percentCodec.encode(bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeBytesWithSpaceAndPlusForSpace_Mnvk5() throws EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[]{'a', 'b'}, true);
        byte[] bytes = "hello world".getBytes();
        byte[] result = percentCodec.encode(bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAsciiChar_WvEs0() throws org.apache.commons.codec.EncoderException {
        PercentCodec percentCodec = new PercentCodec(new byte[]{}, false);
        byte[] bytes = "a".getBytes();
        byte[] expected = "a".getBytes();
        byte[] result = percentCodec.encode(bytes);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeAlwaysEncodeCharWithSpaceAndPlusForSpace_XByh4() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec(new byte[]{(byte) 0, (byte) 1}, true);
        byte[] bytes = codec.encode(new byte[]{(byte) 32});
        assertArrayEquals(new byte[]{(byte) '+'}, bytes);
    }
}