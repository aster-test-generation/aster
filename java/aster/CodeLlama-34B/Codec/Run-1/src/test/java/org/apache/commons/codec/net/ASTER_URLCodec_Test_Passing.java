/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_URLCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_ZYja0() throws DecoderException, UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String str = "Hello%20World";
        String charsetName = "UTF-8";
        String expected = "Hello World";
        String actual = urlCodec.decode(str, charsetName);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_TYYn0() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "https://www.example.com/path/to/resource?query=value";
        String decodedStr = urlCodec.decode(str);
        assertEquals("https://www.example.com/path/to/resource?query=value", decodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_DefaultCharset_Wuow0() {
        URLCodec urlCodec = new URLCodec();
        String encoding = urlCodec.getEncoding();
        assertEquals("UTF-8", encoding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_CustomCharset_NICX1() {
        URLCodec urlCodec = new URLCodec("ISO-8859-1");
        String encoding = urlCodec.getEncoding();
        assertEquals("ISO-8859-1", encoding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_NullCharset_IFOH2() {
        URLCodec urlCodec = new URLCodec(null);
        String encoding = urlCodec.getEncoding();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_EmptyCharset_qIgS3() {
        URLCodec urlCodec = new URLCodec("");
        String encoding = urlCodec.getEncoding();
        assertEquals("", encoding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_InvalidCharset_CzFb4() {
        URLCodec urlCodec = new URLCodec("invalid_charset");
        String encoding = urlCodec.getEncoding();
        assertEquals("invalid_charset", encoding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_NullURLCodec_mgng5() {
        URLCodec urlCodec = null;
        String encoding = null;
        assertNull(encoding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_NullCharsetInURLCodec_pxDe6() {
        URLCodec urlCodec = new URLCodec(null);
        String encoding = urlCodec.getEncoding();
        assertNull(encoding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_EmptyCharsetInURLCodec_gJUU7() {
        URLCodec urlCodec = new URLCodec("");
        String encoding = urlCodec.getEncoding();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_DefaultConstructor_oPwm0() {
        URLCodec urlCodec = new URLCodec();
        String defaultCharset = urlCodec.getDefaultCharset();
        assertEquals("UTF-8", defaultCharset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_CharsetConstructor_UZps1() {
        URLCodec urlCodec = new URLCodec("UTF-16");
        String defaultCharset = urlCodec.getDefaultCharset();
        assertEquals("UTF-16", defaultCharset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_NullCharset_fzvw2() {
        URLCodec urlCodec = new URLCodec(null);
        String defaultCharset = urlCodec.getDefaultCharset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_EmptyCharset_Zpip3() {
        URLCodec urlCodec = new URLCodec("");
        String defaultCharset = urlCodec.getDefaultCharset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_InvalidCharset_PNZN4() {
        URLCodec urlCodec = new URLCodec("invalid_charset");
        String defaultCharset = urlCodec.getDefaultCharset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_peLm1() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Object output = urlCodec.decode(input);
        assertEquals(output, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidType_HhES3() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object input = new Object();
        try {
            urlCodec.decode(input);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals(e.getMessage(), "Objects of type " + input.getClass().getName() + " cannot be URL decoded");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_string_vCaW1() throws EncoderException {
        URLCodec urlCodec = new URLCodec();
        String input = "hello world";
        Object output = urlCodec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_invalidObject_qvMI2() throws EncoderException {
        URLCodec urlCodec = new URLCodec();
        Object input = new Object();
        try {
            urlCodec.encode(input);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Objects of type " + input.getClass().getName() + " cannot be URL encoded", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_null_iRLl3() throws EncoderException {
        URLCodec urlCodec = new URLCodec();
        Object input = null;
        Object output = urlCodec.encode(input);
        assertNull(output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlWithNullBytes_zHAS0() {
        byte[] bytes = null;
        BitSet urlsafe = new BitSet();
        byte[] expected = null;
        byte[] actual = URLCodec.encodeUrl(urlsafe, bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlWithEmptyBytes_faKB1() {
        byte[] bytes = new byte[0];
        BitSet urlsafe = new BitSet();
        byte[] expected = new byte[0];
        byte[] actual = URLCodec.encodeUrl(urlsafe, bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlWithUrlSafeBytes_vUZJ2() {
        byte[] bytes = new byte[]{'a', 'b', 'c'};
        BitSet urlsafe = new BitSet();
        urlsafe.set('a');
        urlsafe.set('b');
        urlsafe.set('c');
        byte[] expected = new byte[]{'a', 'b', 'c'};
        byte[] actual = URLCodec.encodeUrl(urlsafe, bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_YoUE0() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        byte[] bytes = "hello%20world".getBytes();
        byte[] expected = "hello world".getBytes();
        byte[] actual = urlCodec.decode(bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Xczb0() throws EncoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "Hello, World!";
        String encodedStr = urlCodec.encode(str);
        assertEquals("Hello%2C+World%21", encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullInput_jYAF2() throws EncoderException {
        URLCodec urlCodec = new URLCodec();
        String str = null;
        String encodedStr = urlCodec.encode(str);
        assertEquals(null, encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyInput_wSeL3() throws EncoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "";
        String encodedStr = urlCodec.encode(str);
        assertEquals("", encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpecialCharacters_vdtS4() throws EncoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "Hello, World!@#$%^&*()_+";
        String encodedStr = urlCodec.encode(str);
        assertEquals("Hello%2C+World%21%40%23%24%25%5E%26*%28%29_%2B", encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonAsciiCharacters_pNRk5() throws EncoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "Hello, World! ";
        String encodedStr = urlCodec.encode(str);
        assertEquals("Hello%2C+World%21+", encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_lQWT0() throws UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String str = "Hello, World!";
        String charsetName = "UTF-8";
        String expected = "Hello%2C+World%21";
        String actual = urlCodec.encode(str, charsetName);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl_null_UfYh0_aKgT0() {
        byte[] bytes = null;
        byte[] expected = null;
        try {
            byte[] actual = URLCodec.decodeUrl(bytes);
            assertArrayEquals(expected, actual);
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl_empty_dbmG1_IDcT0() {
        byte[] bytes = new byte[0];
        byte[] expected = new byte[0];
        try {
            byte[] actual = URLCodec.decodeUrl(bytes);
            assertArrayEquals(expected, actual);
        } catch (DecoderException e) {
            fail("DecoderException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl_singleChar_zIPV2_dVoC1() {
        byte[] bytes = new byte[]{'a'};
        byte[] expected = new byte[]{'a'};
        try {
            byte[] actual = URLCodec.decodeUrl(bytes);
            assertArrayEquals(expected, actual);
        } catch (DecoderException e) {
            fail("DecoderException thrown: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl_multipleChars_RqoI3_rKUQ1() {
        byte[] bytes = new byte[]{'a', 'b', 'c'};
        byte[] expected = new byte[]{'a', 'b', 'c'};
        try {
            byte[] actual = URLCodec.decodeUrl(bytes);
            assertArrayEquals(expected, actual);
        } catch (DecoderException e) {
            fail("DecoderException thrown: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrl_plus_GTBA4_BYVM0() throws DecoderException {
        byte[] bytes = new byte[]{'+'};
        byte[] expected = new byte[]{' '};
        byte[] actual = URLCodec.decodeUrl(bytes);
        assertArrayEquals(expected, actual);
    }
}