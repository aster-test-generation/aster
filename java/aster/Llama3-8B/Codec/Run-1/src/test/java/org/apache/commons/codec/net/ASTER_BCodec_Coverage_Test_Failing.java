/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedEncodingException_YpKI0() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "test";
        UnsupportedEncodingException e = new UnsupportedEncodingException("Test");
        try {
            codec.decode(value);
            fail("DecoderException was not thrown");
        } catch (DecoderException ex) {
            assertEquals(e.getMessage(), ex.getMessage());
            assertEquals(e, ex.getCause());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithIllegalArgumentException_WOHO1() throws DecoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String value = "test";
        IllegalArgumentException e = new IllegalArgumentException("Test");
        try {
            codec.decode(value);
            fail("DecoderException was not thrown");
        } catch (DecoderException ex) {
            assertEquals(e.getMessage(), ex.getMessage());
            assertEquals(e, ex.getCause());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_UDQZ2() throws DecoderException {
        BCodec codec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        String value = "Hello, World!";
        Object result = codec.decode(value);
        assertEquals(value, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStringWithLenientPolicy_RGdy3() throws DecoderException {
        BCodec codec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
        String value = "Hello, World!";
        Object result = codec.decode(value);
        assertEquals(value, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_vRpY0() throws Exception {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        String result = codec.encode("Hello, World!", "UTF-8");
        assertEquals("Hello, World!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullSource_fHoJ2() throws org.apache.commons.codec.EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        assertThrows(EncoderException.class, () -> codec.encode(null, "UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_Prefix_Charset_Encoding_IhtC0() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String text = "Hello World";
        String expected = "PREFIXUTF-8encoding1234567890POSTFIX";
        String actual = codec.encodeText(text, Charset.forName("UTF-8"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_Prefix_Charset_KxLo1() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        String text = "Hello World";
        String expected = "PREFIXUTF-8POSTFIX";
        String actual = codec.encodeText(text, Charset.forName("UTF-8"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_Prefix_aVqM2() throws EncoderException {
        BCodec codec = new BCodec();
        String text = "Hello World";
        String expected = "PREFIXPOSTFIX";
        String actual = codec.encodeText(text, Charset.forName("UTF-8"));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidInput_eQdu2_SUKN0() {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] bytes = "Hello, World!".getBytes();
        byte[] result = codec.doDecoding(bytes);
        assertNotNull(result);
        try {
            assertEquals("SGVsbG8sIFdvcmxkIQ==", new String(result, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_vKou0_jweb0() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String strSource = "Hello, World!";
        String result = codec.encodeText(strSource, Charset.forName("UTF-8"));
        assertEquals(strSource, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_vRpY0_fid1() throws Exception {
        BCodec codec = new BCodec(Charset.forName("UTF-8"));
        String result = codec.encode("=?UTF-8?B?SGVsbG8sIFdvcmxkIQ==?=", "UTF-8");
        assertEquals("=?UTF-8?B?SGVsbG8sIFdvcmxkIQ==?=", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_vKou0_jweb0_fid1() throws EncoderException {
        BCodec codec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        String strSource = "=?UTF-8?B?SGVsbG8sIFdvcmxkIQ==?=";
        String result = codec.encodeText(strSource, Charset.forName("UTF-8"));
        assertEquals(strSource, result);
    }
}