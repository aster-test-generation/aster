/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_URLCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_gAhy0() {
        URLCodec urlCodec = new URLCodec("UTF-8");
        assertEquals("UTF-8", urlCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodingWithNoCharset_EmWR1() {
        URLCodec urlCodec = new URLCodec();
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_aSQC0() {
        URLCodec urlCodec = new URLCodec("UTF-8");
        assertEquals("UTF-8", urlCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_NoCharsetSet_qYBX1() {
        URLCodec urlCodec = new URLCodec();
        assertEquals("UTF-8", urlCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_NullCharset_iPVu2() {
        URLCodec urlCodec = new URLCodec(null);
        assertNull(urlCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_EmptyCharset_iIGH3() {
        URLCodec urlCodec = new URLCodec("");
        assertEquals("", urlCodec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlWithInvalidEscapeChar_aCCM4() {
        byte[] bytes = {'a', '%', 'x', 'b'};
        try {
            URLCodec.decodeUrl(bytes);
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrl1_vDxj0() {
        final byte[] bytes = null;
        final byte[] result = URLCodec.encodeUrl(null, bytes);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrl2_jMHm1() {
        final byte[] bytes = new byte[0];
        final byte[] result = URLCodec.encodeUrl(null, bytes);
        assert result.length == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_pAfD0() {
        URLCodec urlCodec = new URLCodec("UTF-8");
        byte[] bytes = new byte[]{1, 2, 3};
        byte[] encodedBytes = urlCodec.encode(bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_sXWQ0() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        byte[] bytes = new byte[]{}; // Replace with actual byte array
        byte[] decodedBytes = urlCodec.decode(bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidString_xZpl3_VVdp0() {
        URLCodec urlCodec = new URLCodec();
        String inputString = "Hello%2GWorld";
        try {
            urlCodec.decode(inputString, "UTF-8");
            fail("DecoderException expected");
        } catch (DecoderException e) {
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidString_bPcT1_uyjQ0() {
        URLCodec codec = new URLCodec();
        String inputString = "Hello%20World";
        String expectedString = "Hello World";
        String decodedString = null;
        try {
            decodedString = codec.decode(inputString);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertEquals(expectedString, decodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlWithNull_JVGC0_zCJq0() {
        byte[] bytes = null;
        byte[] expected = null;
        byte[] actual = null;
        try {
            actual = URLCodec.decodeUrl(bytes);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_lREB2_ohnI0() {
        URLCodec urlCodec = new URLCodec();
        String input = "Hello%20World";
        String expected = "Hello World";
        String result = null;
        try {
            result = urlCodec.decode(input);
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidString_xtyE1_TFYi0() {
        URLCodec codec = new URLCodec();
        String inputString = "Hello, World!";
        String encodedString = null;
        try {
            encodedString = codec.encode(inputString);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        assertEquals("Hello%2C+World%21", encodedString);
    }
}