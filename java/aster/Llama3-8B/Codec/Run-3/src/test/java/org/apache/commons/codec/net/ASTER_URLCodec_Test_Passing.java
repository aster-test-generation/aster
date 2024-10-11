/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_URLCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeValidString_IPad1() throws Exception {
        URLCodec codec = new URLCodec();
        String str = "Hello World!";
        String result = codec.decode(str);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullString_dXLB0() throws Exception {
        URLCodec urlCodec = new URLCodec();
        String result = urlCodec.decode(null, "UTF-8");
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_lnKA0() throws Exception {
        URLCodec codec = new URLCodec("UTF-8");
        assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetNoParam_QwIA1() throws Exception {
        URLCodec codec = new URLCodec();
        assertEquals("", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_oqxb0() throws Exception {
        URLCodec codec = new URLCodec("UTF-8");
        assertEquals("UTF-8", codec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodingDefault_nbYb1() throws Exception {
        URLCodec codec = new URLCodec();
        assertEquals("", codec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_sUnE1() throws Exception {
        URLCodec codec = new URLCodec();
        String result = codec.encode("Hello, World!");
        assertEquals(result, "Hello%2C+World%21");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_saqY0() throws Exception {
        URLCodec codec = new URLCodec();
        String result = codec.encode(null, "UTF-8");
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_eVIB1() throws Exception {
        URLCodec codec = new URLCodec();
        String result = codec.encode("Hello World", "UTF-8");
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_JaiX1() throws Exception {
        URLCodec codec = new URLCodec();
        byte[] byteArray = new byte[]{1, 2, 3};
        Object result = codec.encode(byteArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_MYDc2() throws Exception {
        URLCodec codec = new URLCodec();
        String str = "Hello World";
        Object result = codec.encode(str);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeObject_rcqG3() throws Exception {
        URLCodec codec = new URLCodec();
        Object obj = new Object();
        try {
            Object result = codec.encode(obj);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_RifV0() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = null;
        Object result = urlCodec.decode(obj);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_sEhk1() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        byte[] bytes = new byte[]{1, 2, 3};
        Object obj = bytes;
        Object result = urlCodec.decode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_uNls2() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        String str = "Hello, World!";
        Object obj = str;
        Object result = urlCodec.decode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidType_vKXK3() throws DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = new Object();
        try {
            Object result = urlCodec.decode(obj);
            fail("DecoderException expected");
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullBytes_jTUx2() throws Exception {
        URLCodec urlCodec = new URLCodec();
        byte[] bytes = null;
        try {
            urlCodec.encode(bytes);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlNullInput_dKHI0() throws DecoderException {
        byte[] bytes = null;
        byte[] expected = null;
        byte[] result = URLCodec.decodeUrl(bytes);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlEmptyInput_cQIc1() throws DecoderException {
        byte[] bytes = new byte[0];
        byte[] expected = new byte[0];
        byte[] result = URLCodec.decodeUrl(bytes);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlSimpleString_pxSO2() throws DecoderException {
        byte[] bytes = "Hello World".getBytes();
        byte[] expected = "Hello World".getBytes();
        byte[] result = URLCodec.decodeUrl(bytes);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlEncodedString_zrIv3() throws DecoderException {
        byte[] bytes = "Hello%20World".getBytes();
        byte[] expected = "Hello World".getBytes();
        byte[] result = URLCodec.decodeUrl(bytes);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlEncodedStringWithPlus_YNgI4() throws DecoderException {
        byte[] bytes = "Hello+World".getBytes();
        byte[] expected = "Hello World".getBytes();
        byte[] result = URLCodec.decodeUrl(bytes);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlEncodedStringWithEscapeSequence_UhWx5() throws DecoderException {
        byte[] bytes = "Hello\\u0065\\u0074\\u0061".getBytes();
        byte[] expected = "Helloeta".getBytes();
        byte[] result = URLCodec.decodeUrl(bytes);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlNullBytes_LpTk0() throws Exception {
        byte[] bytes = null;
        BitSet urlsafe = new BitSet();
        byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlValidBytes_klkN2() throws Exception {
        byte[] bytes = new byte[1];
        BitSet urlsafe = new BitSet();
        byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlValidBytesWithUrlSafe_DZrK3() throws Exception {
        byte[] bytes = new byte[1];
        BitSet urlsafe = new BitSet();
        urlsafe.set(0);
        byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlValidBytesWithUrlSafeAndEscapeChar_UTif4() throws Exception {
        byte[] bytes = new byte[1];
        BitSet urlsafe = new BitSet();
        urlsafe.set(0);
        urlsafe.set(1);
        byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlValidBytesWithUrlSafeAndHexDigits_szJZ5() throws Exception {
        byte[] bytes = new byte[1];
        BitSet urlsafe = new BitSet();
        urlsafe.set(0);
        urlsafe.set(1);
        urlsafe.set(2);
        urlsafe.set(3);
        byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUrlValidBytesWithUrlSafeAndHexDigitsAndEscapeChar_eXBv6() throws Exception {
        byte[] bytes = new byte[1];
        BitSet urlsafe = new BitSet();
        urlsafe.set(0);
        urlsafe.set(1);
        urlsafe.set(2);
        urlsafe.set(3);
        urlsafe.set(4);
        byte[] result = URLCodec.encodeUrl(urlsafe, bytes);
        assert result != null;
    }
}