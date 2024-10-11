/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding1_WCpx0() throws Exception {
        QCodec qCodec = new QCodec(Charset.defaultCharset());
        assertEquals("Q", qCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding2_igOh1() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        assertEquals("Q", qCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding3_Jhif2() throws Exception {
        QCodec qCodec = new QCodec();
        assertEquals("Q", qCodec.getEncoding());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_wfNz0() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        String result = qCodec.decode("Hello World");
        assertEquals("Hello World", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUnsupportedEncodingException_oGgA1() throws Exception {
        QCodec qCodec = new QCodec("InvalidCharset");
        try {
            qCodec.decode("Hello World");
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_rvHL0() throws Exception {
        QCodec qCodec = new QCodec();
        Object result = qCodec.decode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_GWbM1() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        String str = "Hello";
        Object result = qCodec.decode(str);
        assertEquals(str, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_VNbQ0() throws Exception {
        QCodec qCodec = new QCodec();
        Object result = qCodec.encode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_bjEH1() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        String str = "Hello";
        Object result = qCodec.encode(str);
        assertEquals(str, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_sJVP0() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        String result = qCodec.encode("Hello World", "UTF-8");
        assertEquals("Hello+World", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUnsupportedCharset_nncO1() throws Exception {
        QCodec qCodec = new QCodec();
        try {
            qCodec.encode("Hello World", "InvalidCharset");
            fail("EncoderException expected");
        } catch (EncoderException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEncodeBlanks_withTrue_ivUs0() throws Exception {
        QCodec qCodec = new QCodec();
        qCodec.setEncodeBlanks(true);
        assertTrue(qCodec.isEncodeBlanks());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEncodeBlanks_withFalse_EIaw1() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        qCodec.setEncodeBlanks(false);
        assertFalse(qCodec.isEncodeBlanks());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetEncodeBlanks_withTrue_Charset_sQac2() throws Exception {
        QCodec qCodec = new QCodec(Charset.forName("UTF-8"));
        qCodec.setEncodeBlanks(true);
        assertTrue(qCodec.isEncodeBlanks());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_jxER0() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        String sourceStr = "Hello World";
        String encodedStr = qCodec.encode(sourceStr);
        assertNotNull(encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_xpwo1() throws Exception {
        QCodec qCodec = new QCodec(StandardCharsets.UTF_8);
        String sourceStr = "Hello World";
        String encodedStr = qCodec.encode(sourceStr);
        assertNotNull(encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithoutCharset_pdHj2() throws Exception {
        QCodec qCodec = new QCodec();
        String sourceStr = "Hello World";
        String encodedStr = qCodec.encode(sourceStr);
        assertNotNull(encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeBlanks1_ppVx0() throws Exception {
        QCodec qCodec = new QCodec(Charset.defaultCharset());
        boolean result = qCodec.isEncodeBlanks();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeBlanks2_QxTv1() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        boolean result = qCodec.isEncodeBlanks();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeBlanks3_NtQz2() throws Exception {
        QCodec qCodec = new QCodec();
        boolean result = qCodec.isEncodeBlanks();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_dkvL0() throws Exception {
        QCodec qCodec = new QCodec();
        String sourceStr = "Hello World";
        Charset sourceCharset = Charset.forName("UTF-8");
        String result = qCodec.encode(sourceStr, sourceCharset);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withCharset_ELSQ1() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        String sourceStr = "Hello World";
        Charset sourceCharset = Charset.forName("UTF-8");
        String result = qCodec.encode(sourceStr, sourceCharset);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withDefaultCharset_Dsfx2() throws Exception {
        QCodec qCodec = new QCodec(Charset.defaultCharset());
        String sourceStr = "Hello World";
        Charset sourceCharset = Charset.defaultCharset();
        String result = qCodec.encode(sourceStr, sourceCharset);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncodingNull_Udgz0() throws Exception {
        QCodec qCodec = new QCodec();
        byte[] result = qCodec.doEncoding(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncodingEmpty_vfSn1() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        byte[] bytes = new byte[0];
        byte[] result = qCodec.doEncoding(bytes);
        assertArrayEquals(bytes, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncodingWithSpace_ZosB2() throws Exception {
        QCodec qCodec = new QCodec(Charset.forName("UTF-8"));
        byte[] bytes = "Hello World".getBytes();
        byte[] result = qCodec.doEncoding(bytes);
        assertArrayEquals("Hello_World".getBytes(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncodingWithoutSpace_ESqX3() throws Exception {
        QCodec qCodec = new QCodec();
        qCodec.setEncodeBlanks(false);
        byte[] bytes = "Hello World".getBytes();
        byte[] result = qCodec.doEncoding(bytes);
        assertArrayEquals("Hello World".getBytes(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncodingWithSpecialChars_aTus4() throws Exception {
        QCodec qCodec = new QCodec("ISO-8859-1");
        byte[] bytes = "Hello! World".getBytes();
        byte[] result = qCodec.doEncoding(bytes);
        assertArrayEquals("Hello=21_World".getBytes(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingNull_aoSt0() throws Exception {
        QCodec qCodec = new QCodec();
        byte[] result = qCodec.doDecoding(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingNoUnderscores_mbBA1() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        byte[] bytes = "Hello World".getBytes();
        byte[] result = qCodec.doDecoding(bytes);
        assertArrayEquals(bytes, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingWithUnderscores_nhyg2() throws Exception {
        QCodec qCodec = new QCodec();
        byte[] bytes = "Hello_World".getBytes();
        byte[] expectedResult = "Hello World".getBytes();
        byte[] result = qCodec.doDecoding(bytes);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingEmptyArray_OlrD3() throws Exception {
        QCodec qCodec = new QCodec(Charset.forName("UTF-8"));
        byte[] bytes = new byte[0];
        byte[] result = qCodec.doDecoding(bytes);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingSingleUnderscore_QxRr4() throws Exception {
        QCodec qCodec = new QCodec();
        byte[] bytes = "_".getBytes();
        byte[] expectedResult = " ".getBytes();
        byte[] result = qCodec.doDecoding(bytes);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingMultipleUnderscores_AwJp5() throws Exception {
        QCodec qCodec = new QCodec("UTF-8");
        byte[] bytes = "Hello__World".getBytes();
        byte[] expectedResult = "Hello  World".getBytes();
        byte[] result = qCodec.doDecoding(bytes);
        assertArrayEquals(expectedResult, result);
    }
}