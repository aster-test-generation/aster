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
import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_3_VGZE2() {
        BCodec bCodec = new BCodec("UTF-8");
        assertEquals("B", bCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getEncoding_4_sDDN3() {
        BCodec bCodec = new BCodec();
        assertEquals("B", bCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithStrictPolicy_BDkC0() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        assertTrue(bCodec.isStrictDecoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrictDecodingWithLenientPolicy_RRbH1() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.LENIENT);
        assertFalse(bCodec.isStrictDecoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidInput_ZqjM1() {
        BCodec bCodec = new BCodec("UTF-8");
        String input = "Invalid Input";
        try {
            bCodec.decode(input);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding_2_huHp1() {
        BCodec bCodec = new BCodec("UTF-8");
        byte[] bytes = "Hello World".getBytes();
        byte[] expected = Base64.encodeBase64(bytes);
        assertArrayEquals(expected, bCodec.doEncoding(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding_3_ZnjX2() {
        BCodec bCodec = new BCodec();
        byte[] bytes = "Hello World".getBytes();
        byte[] expected = Base64.encodeBase64(bytes);
        assertArrayEquals(expected, bCodec.doEncoding(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithCharsetAndPolicy_eBoq0() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        assertEquals(Charset.defaultCharset(), bCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithCharset_PFFB1() {
        BCodec bCodec = new BCodec(Charset.defaultCharset());
        assertEquals(Charset.defaultCharset(), bCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithCharsetName_yvZE2() {
        BCodec bCodec = new BCodec("UTF-8");
        assertEquals(Charset.forName("UTF-8"), bCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithoutParameter_EAom3() {
        BCodec bCodec = new BCodec();
        assertEquals(Charset.defaultCharset(), bCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithNullText_xvpo0() throws EncoderException {
        BCodec bCodec = new BCodec();
        assertNull(bCodec.encodeText(null, "UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_tVPU0() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.STRICT);
        assertEquals(Charset.defaultCharset().name(), bCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithLenientPolicy_ppVY1() {
        BCodec bCodec = new BCodec(Charset.defaultCharset(), CodecPolicy.LENIENT);
        assertEquals(Charset.defaultCharset().name(), bCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithNoParameters_igFh2() {
        BCodec bCodec = new BCodec();
        assertEquals(Charset.defaultCharset().name(), bCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeTextWithNullText_NxMV0() throws DecoderException, UnsupportedEncodingException {
        final BCodec bCodec = new BCodec();
        final String actual = bCodec.decodeText(null);
        final String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_pMVR0_1() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertTrue(encodedText.startsWith(BCodec.PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_pMVR0_2() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertTrue(encodedText.endsWith(BCodec.POSTFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_pMVR0_3() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertTrue(encodedText.contains(StandardCharsets.UTF_8.name()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_pMVR0_4() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertTrue(encodedText.contains(bCodec.getEncoding()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeText_pMVR0_5() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.STRICT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertFalse(encodedText.contains(text));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithLenientPolicy_Vkoa1_1() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertTrue(encodedText.startsWith(BCodec.PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithLenientPolicy_Vkoa1_2() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertTrue(encodedText.endsWith(BCodec.POSTFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithLenientPolicy_Vkoa1_3() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertTrue(encodedText.contains(StandardCharsets.UTF_8.name()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithLenientPolicy_Vkoa1_4() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertTrue(encodedText.contains(bCodec.getEncoding()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithLenientPolicy_Vkoa1_5() throws EncoderException {
        final BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
        final String text = "Hello World";
        final String encodedText = bCodec.encodeText(text, StandardCharsets.UTF_8);
        assertFalse(encodedText.contains(text));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_WithNullInput_DYrw2_xpvc0() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.LENIENT);
        byte[] input = null;
        byte[] expected = null;
        byte[] actual = bCodec.doDecoding(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding_xmkG0_virx0() {
        BCodec bCodec = new BCodec(StandardCharsets.UTF_8, CodecPolicy.LENIENT);
        byte[] bytes = "Hello World".getBytes();
        byte[] expected = Base64.encodeBase64(bytes);
        assertArrayEquals(expected, bCodec.doEncoding(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding_4_vIDw3_OMRn0() {
        BCodec bCodec = new BCodec(Charset.forName("UTF-8"), CodecPolicy.STRICT);
        byte[] bytes = "Hello World".getBytes();
        byte[] expected = Base64.encodeBase64(bytes);
        assertArrayEquals(expected, bCodec.doEncoding(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullInput_XvEO2_HfwK0() {
        BCodec bCodec = new BCodec("UTF-8");
        Object expected = null;
        Object actual = null;
        try {
            actual = bCodec.decode(null);
        } catch (DecoderException e) {
        }
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_Pwpo0_MXjn0() {
        BCodec bCodec = new BCodec("UTF-8");
        String input = "Hello, World!";
        Object expected = "=?UTF-8?B?SGVsbG8sIFdvcmxkIQ==?=";
        Object actual = null;
        try {
            actual = bCodec.encode(input);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNull_BiLC1_yHbo0() {
        BCodec bCodec = new BCodec("UTF-8");
        Object input = null;
        Object expected = null;
        try {
            Object actual = bCodec.encode(input);
            assertEquals(expected, actual);
        } catch (EncoderException e) {
            fail("Exception not expected");
        }
    }
}