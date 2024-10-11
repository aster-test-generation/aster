/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullInput_wyHl0() {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] result = codec.doDecoding(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyInput_ycrT1_1() {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] bytes = new byte[0];
        byte[] result = codec.doDecoding(bytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyInput_ycrT1_2() {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] bytes = new byte[0];
        byte[] result = codec.doDecoding(bytes);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_Vfzn0() throws DecoderException {
        BCodec codec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        Object result = codec.decode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonString_QkZy1() throws DecoderException {
        BCodec codec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        Object value = new Object();
        try {
            codec.decode(value);
            fail("DecoderException expected");
        } catch (DecoderException e) {
            assertEquals("Objects of type " + value.getClass().getName() + " cannot be decoded using BCodec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_eQYY0() {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextNullInput_Rris0() throws EncoderException {
        BCodec codec = new BCodec();
        String result = codec.encodeText(null, "UTF-8");
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUnsupportedCharset_IMXf1() throws org.apache.commons.codec.EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        assertThrows(EncoderException.class, () -> codec.encode("Hello, World!", "UnsupportedCharset"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_CJAK0() throws EncoderException {
        BCodec codec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        Object result = codec.encode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonString_soWx1() throws EncoderException {
        BCodec codec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        Object value = new Object();
        try {
            codec.encode(value);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Objects of type " + value.getClass().getName() + " cannot be encoded using BCodec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_kTvW2() throws EncoderException {
        BCodec codec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        String value = "Hello, World!";
        Object result = codec.encode(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStringWithLenientPolicy_qUnL3() throws EncoderException {
        BCodec codec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
        String value = "Hello, World!";
        Object result = codec.encode(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_Prefix_Charset_Encoding_IhtC0_fid1() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String text = "Hello World";
        String expected = "=?UTF-8?B?SGVsbG8gV29ybGQ=?=";
        String actual = codec.encodeText(text, Charset.forName("UTF-8"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_Prefix_Charset_KxLo1_fid1() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        String text = "Hello World";
        String expected = "=?UTF-8?B?SGVsbG8gV29ybGQ=?=";
        String actual = codec.encodeText(text, Charset.forName("UTF-8"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_Prefix_aVqM2_fid1() throws EncoderException {
        BCodec codec = new BCodec();
        String text = "Hello World";
        String expected = "=?UTF-8?B?SGVsbG8gV29ybGQ=?=";
        String actual = codec.encodeText(text, Charset.forName("UTF-8"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEmptyInput_ycrT1() {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] bytes = new byte[0];
        byte[] result = codec.doDecoding(bytes);
        assertNotNull(result);
        assertEquals(0, result.length);
    }
}