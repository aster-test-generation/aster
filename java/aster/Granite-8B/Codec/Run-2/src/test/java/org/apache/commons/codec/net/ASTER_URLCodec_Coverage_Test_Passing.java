/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_URLCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullString_NsPG0() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        URLCodec codec = new URLCodec();
        String decodedString = codec.decode(null, "UTF-8");
        assertEquals(null, decodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyString_nsTp1() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        URLCodec codec = new URLCodec();
        String decodedString = codec.decode("", "UTF-8");
        assertEquals("", decodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlBytesNull_jaPF0() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = null;
        byte[] result = URLCodec.decodeUrl(bytes);
        byte[] expected = null;
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlBytesEmpty_twVu1() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = new byte[0];
        byte[] result = URLCodec.decodeUrl(bytes);
        byte[] expected = new byte[0];
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlBytesNormal_GcGo2() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = "Hello World".getBytes();
        byte[] result = URLCodec.decodeUrl(bytes);
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUrlBytesWithEscapeChar_suTk3() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = "Hello+World".getBytes();
        byte[] result = URLCodec.decodeUrl(bytes);
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullObject_Wzqr0() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object obj = null;
        Object result = urlCodec.decode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_XeRW1() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        byte[] input = new byte[10];
        Object result = urlCodec.decode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_eTOz2() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        String input = "Hello World";
        Object result = urlCodec.decode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidObject_LbzE3() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        Object input = new Object();
        try {
            urlCodec.decode(input);
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidInput_NlDg4() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        byte[] input = new byte[10];
        try {
            urlCodec.decode(input);
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidInput2_ktna5() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        String input = "Hello World";
        try {
            urlCodec.decode(input);
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullString_DcLk0() throws java.io.UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String encodedString = urlCodec.encode(null, "UTF-8");
        assertNull(encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyString_DGCH1() throws java.io.UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String encodedString = urlCodec.encode("", "UTF-8");
        assertEquals("", encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArrayObject_rjlY1() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        byte[] inputByteArray = new byte[10];
        Object encodedObject = urlCodec.encode(inputByteArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_zrYr2() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        String inputString = "Hello, World!";
        Object encodedObject = urlCodec.encode(inputString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedObjectType_Xpli3() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        Object unsupportedObject = new Object();
        try {
            Object encodedObject = urlCodec.encode(unsupportedObject);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedObjectTypeAndCharset_rTNA4() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec("UTF-8");
        Object unsupportedObject = new Object();
        try {
            Object encodedObject = urlCodec.encode(unsupportedObject);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithValidString_gBLW2_exUb0() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        String inputString = "Hello World!";
        String decodedString = urlCodec.decode(inputString);
        org.junit.jupiter.api.Assertions.assertEquals("Hello World!", decodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidString_swdR3_FxnG0() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        String inputString = "Hello%20World!";
        String decodedString = urlCodec.decode(inputString);
        org.junit.jupiter.api.Assertions.assertEquals("Hello World!", decodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptyString_FIkT1_OfLQ0() throws org.apache.commons.codec.DecoderException {
        URLCodec urlCodec = new URLCodec();
        String decodedString = urlCodec.decode("");
        org.junit.jupiter.api.Assertions.assertEquals("", decodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonNullString_hMeu2_xwHP0_1() throws java.io.UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String inputString = "Hello, World!";
        String encodedString = urlCodec.encode(inputString, "UTF-8");
        assertNotNull(encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonNullString_hMeu2_xwHP0_2() throws java.io.UnsupportedEncodingException {
        URLCodec urlCodec = new URLCodec();
        String inputString = "Hello, World!";
        String encodedString = urlCodec.encode(inputString, "UTF-8");
        assertNotEquals(inputString, encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_qBhM2_ictP0() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        String inputString = "Hello, World!";
        String encodedString = urlCodec.encode(inputString);
        org.junit.jupiter.api.Assertions.assertNotEquals(inputString, encodedString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringAndUnsupportedCharset_gpKs4_YnPW0() throws org.apache.commons.codec.EncoderException {
        URLCodec urlCodec = new URLCodec();
        String inputString = "Hello, World!";
        String charset = "UnsupportedCharset";
        try {
            urlCodec.encode(inputString, charset);
        } catch (UnsupportedEncodingException e) {
            org.junit.jupiter.api.Assertions.assertTrue(true);
            return;
        }
        org.junit.jupiter.api.Assertions.fail("Expected UnsupportedEncodingException");
    }
}