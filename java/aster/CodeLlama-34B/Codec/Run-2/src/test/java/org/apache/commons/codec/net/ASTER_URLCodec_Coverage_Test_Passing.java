/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_URLCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_NullString_Zwpt0() throws DecoderException, UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String str = null;
        String charsetName = "UTF-8";
        String actual = urlCodec.decode(str, charsetName);
        assertNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_EmptyString_zumf1() throws DecoderException, UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String str = "";
        String charsetName = "UTF-8";
        String actual = urlCodec.decode(str, charsetName);
        assertEquals("", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlWithArrayIndexOutOfBoundsException_ZRFI0() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            URLCodec.decodeUrl(bytes);
        } catch (DecoderException e) {
            assertEquals("Invalid URL encoding: ", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_yWeh2() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "hello world";
        assertEquals(str, urlCodec.decode(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidType_Gmpz3() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.decode(new Object());
            assertTrue(false);
        } catch (DecoderException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharset_aMiz4() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec("UTF-8");
        String str = "hello world";
        assertEquals(str, urlCodec.decode(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidCharset_JZKz5() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec("invalid charset");
        String str = "hello world";
        try {
            urlCodec.decode(str);
            assertTrue(false);
        } catch (DecoderException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_FwEM0() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        String str = null;
        String result = urlCodec.decode(str);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmpty_TFqz1() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "";
        String result = urlCodec.decode(str);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeValid_fHMr2() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "Hello%20World";
        String result = urlCodec.decode(str);
        assertEquals("Hello World", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalid_BiHd3() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "Hello World";
        String result = urlCodec.decode(str);
        assertEquals("Hello World", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_aEBC2() throws EncoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "hello world";
        assertEquals("hello+world", urlCodec.encode(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_vJog4() throws EncoderException {
        URLCodec urlCodec = new URLCodec("UTF-8");
        String str = "hello world";
        assertEquals("hello+world", urlCodec.encode(str));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrl_negativeByte_iYOT0_UWQU0() {
        byte[] bytes = new byte[]{-1, -2, -3};
        BitSet urlsafe = new BitSet();
        urlsafe.set(256);
        byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUnsupportedEncodingException_gzoy0_RizK0() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        try {
            urlCodec.encode("test", "invalid_charset");
            fail("UnsupportedEncodingException should have been thrown");
        } catch (UnsupportedEncodingException e) {
            assertFalse(e.getCause() instanceof UnsupportedEncodingException);
        }
    }
}