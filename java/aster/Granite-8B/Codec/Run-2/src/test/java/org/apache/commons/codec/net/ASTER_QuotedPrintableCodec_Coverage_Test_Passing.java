/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuotedPrintableCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullSourceStr_KWfT0() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String decodedStr = codec.decode(null, "UTF-8");
        assertEquals(null, decodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithEmptySourceStr_CQZd1() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String decodedStr = codec.decode("", "UTF-8");
        assertEquals("", decodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNonNullSourceStr_kLPn2() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello World!";
        String decodedStr = codec.decode(sourceStr, "UTF-8");
        assertEquals("Hello World!", decodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_MpTu1() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = new byte[0];
        Object result = codec.decode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_mmbU2() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String input = "";
        Object result = codec.decode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidType_ewLY3() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object input = new Object();
        try {
            codec.decode(input);
            fail("DecoderException expected");
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharset_UyDi5() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        byte[] input = new byte[0];
        Object result = codec.decode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullObject_jHks0() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = null;
        Object result = codec.encode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_pTzf1() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = new byte[10];
        Object result = codec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_ZmcX2() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String input = "Hello, World!";
        Object result = codec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedObjectType_gHDT3() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = new Object();
        try {
            codec.encode(obj);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_mHWR4() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        byte[] input = new byte[10];
        Object result = codec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharsetAndStrictFlag_CfCZ5() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        byte[] input = new byte[10];
        Object result = codec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharsetAndString_ZvpG6() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        String input = "Hello, World!";
        Object result = codec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharsetName_dwmM7() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        byte[] input = new byte[10];
        Object result = codec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharsetNameAndString_Snos9() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        String input = "Hello, World!";
        Object result = codec.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableBytesNull_QLEa0() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = null;
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = null;
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableBytesEmpty_GCBf1() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = new byte[0];
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[0];
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableBytesNoEscape_UuQQ2() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = {1, 2, 3};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = {1, 2, 3};
        assertArrayEquals(expected, result);
    }
}