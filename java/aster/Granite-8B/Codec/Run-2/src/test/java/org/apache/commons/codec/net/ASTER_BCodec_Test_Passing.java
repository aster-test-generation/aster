/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingBytes_aELn0() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] input = "SGVsbG8gV29ybGQh".getBytes();
        byte[] expected = "Hello World!".getBytes();
        byte[] actual = bCodec.doDecoding(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingBytesWithNullInput_iwfJ1() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.LENIENT);
        byte[] input = null;
        byte[] expected = null;
        byte[] actual = bCodec.doDecoding(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_FbmX0() {
        BCodec bCodec = new BCodec();
        assertEquals("B", bCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithStrictPolicy_xjFb0() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        assertTrue(bCodec.isStrictDecoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithLenientPolicy_HGIW1() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.LENIENT);
        assertFalse(bCodec.isStrictDecoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithObject_KQyW2() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        Object value = new Object();
        try {
            bCodec.decode(value);
            fail("DecoderException expected");
        } catch (DecoderException e) {
            assertEquals("Objects of type " + value.getClass().getName() + " cannot be decoded using BCodec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncodingBytesWithNullInput_Fzto1() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] input = null;
        byte[] expectedOutput = null;
        byte[] actualOutput = bCodec.doEncoding(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedType_vMdh2() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        Object input = new Object();
        try {
            bCodec.encode(input);
            fail("EncoderException expected");
        } catch (EncoderException e) {
            assertTrue(e.getMessage().contains("Objects of type " + input.getClass().getName() + " cannot be encoded using BCodec"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_wwbH0() throws EncoderException {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String strSource = "Hello, World!";
        String encodedString = bCodec.encode(strSource);
        assertEquals("=?UTF-8?B?SGVsbG8sIFdvcmxkIQ==?=", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyValue_LqKi4_aDtt0() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "";
        String expected = "";
        String actual = "";
        try {
            actual = bCodec.decode(value);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_BvGH1_HBmg0() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        Object value = null;
        Object decodedValue = null;
        try {
            decodedValue = bCodec.decode(value);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertNull(decodedValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_SVWY1_hEve0() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        String input = "Hello, World!";
        String result = null;
        try {
            result = bCodec.encode(input);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}