/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PercentCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedType_EHdK2() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        try {
            codec.encode("This is a string");
            fail("EncoderException expected for unsupported object types");
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedType_QEAi2() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec();
        try {
            codec.decode("This is a string");
            fail("DecoderException expected for input type String");
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withNullInput_yCIE1_kXWr0() throws EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] result = codec.encode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_AoqM0_crgS0() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        assertNull(codec.encode(null), "Encoding null should return null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withNoSpaces_nFJx0_TeDv0() throws EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = "HelloWorld".getBytes();
        byte[] result = codec.encode(input);
        assertArrayEquals(input, result, "Encoding should not alter input without spaces");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyByteArray_Tlbx3_NBWq0() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[0];
        assertArrayEquals(input, codec.decode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullInput_iTIh0_LoLD0() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec();
        assertNull(codec.decode(null), "Decoding a null should return null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyByteArray_lnZm3_nwlX0() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = new byte[0];
        byte[] expectedOutput = new byte[0];
        assertArrayEquals(expectedOutput, codec.encode(input), "Encoding empty byte array should return empty array");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_Lzrh1_iofs0() throws org.apache.commons.codec.DecoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = {'%', '4', '1'}; // Example encoded byte array
        byte[] expectedOutput = {'A'};  // Expected decoded byte array (assuming decode method is implemented correctly)
        assertArrayEquals(expectedOutput, (byte[]) codec.decode(input), "Decoding byte array should return correct result");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_TSkN1_SNuJ0() throws org.apache.commons.codec.EncoderException {
        PercentCodec codec = new PercentCodec();
        byte[] input = {'a', 'b', 'c'};
        byte[] expectedOutput = {'a', 'b', 'c'}; // Assuming new PercentCodec().encode(byte[]) method returns the same array for simplicity
        assertArrayEquals(expectedOutput, codec.encode(input), "Encoding byte array should return encoded array");
    }
}