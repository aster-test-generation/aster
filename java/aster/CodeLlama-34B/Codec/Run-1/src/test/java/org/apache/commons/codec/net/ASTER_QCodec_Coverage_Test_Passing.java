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
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_QCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncoding_AwWK0() {
        QCodec qCodec = new QCodec();
        String encoding = qCodec.getEncoding();
        assertEquals("Q", encoding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUnsupportedEncodingException_VZaR1() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        String str = "test string";
        String expected = "RFC 1522 violation: malformed encoded content";
        try {
            String actual = qCodec.decode(str);
            fail("Expected UnsupportedEncodingException");
        } catch (DecoderException e) {
            assertEquals(expected, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_doDM0() {
        QCodec qCodec = new QCodec();
        String defaultCharset = qCodec.getDefaultCharset();
        assertEquals("UTF-8", defaultCharset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithCharset_Xpxr1() {
        QCodec qCodec = new QCodec(Charset.forName("UTF-16"));
        String defaultCharset = qCodec.getDefaultCharset();
        assertEquals("UTF-16", defaultCharset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithCharsetName_BSap2() {
        QCodec qCodec = new QCodec("UTF-32");
        String defaultCharset = qCodec.getDefaultCharset();
        assertEquals("UTF-32", defaultCharset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidCharset_BJTO1() throws org.apache.commons.codec.EncoderException {
        QCodec qCodec = new QCodec();
        String sourceStr = "Hello, World!";
        String sourceCharset = "InvalidCharset";
        assertThrows(EncoderException.class, () -> qCodec.encode(sourceStr, sourceCharset));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithUnsupportedCharset_uncY2() throws org.apache.commons.codec.EncoderException {
        QCodec qCodec = new QCodec();
        String sourceStr = "Hello, World!";
        String sourceCharset = "UnsupportedCharset";
        assertThrows(EncoderException.class, () -> qCodec.encode(sourceStr, sourceCharset));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_DefaultConstructor_kGzU0() {
        QCodec qCodec = new QCodec();
        Charset charset = qCodec.getCharset();
        assertEquals(Charset.defaultCharset(), charset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_CharsetConstructor_PCWG1() {
        Charset charset = Charset.forName("UTF-8");
        QCodec qCodec = new QCodec(charset);
        assertEquals(charset, qCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_CharsetNameConstructor_FPZV2() {
        String charsetName = "UTF-8";
        QCodec qCodec = new QCodec(charsetName);
        assertEquals(Charset.forName(charsetName), qCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_LKzs0() throws org.apache.commons.codec.EncoderException {
        QCodec qCodec = new QCodec();
        Object result = qCodec.encode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonString_acgg2() throws org.apache.commons.codec.EncoderException {
        QCodec qCodec = new QCodec();
        Integer input = 123;
        try {
            qCodec.encode(input);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Objects of type java.lang.Integer cannot be encoded using Q codec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullWithCharset_GFFB3() throws org.apache.commons.codec.EncoderException {
        QCodec qCodec = new QCodec(StandardCharsets.UTF_8);
        Object result = qCodec.encode(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_xlfI0() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        Object obj = null;
        Object result = qCodec.decode(obj);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonString_yTEc2() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        Object obj = new Object();
        try {
            qCodec.decode(obj);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Objects of type java.lang.Object cannot be decoded using Q codec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullWithCharset_AgLu3() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec(Charset.defaultCharset());
        Object obj = null;
        Object result = qCodec.decode(obj);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonStringWithCharset_Wlxa5() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec(Charset.defaultCharset());
        Object obj = new Object();
        try {
            qCodec.decode(obj);
            fail("Expected DecoderException");
        } catch (DecoderException e) {
            assertEquals("Objects of type java.lang.Object cannot be decoded using Q codec", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextNull_pPYP0() throws EncoderException {
        QCodec qCodec = new QCodec();
        String text = null;
        String charsetName = "UTF-8";
        String actual = qCodec.encodeText(text, charsetName);
        assertNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncodingNull_JFil0() {
        QCodec qCodec = new QCodec();
        byte[] bytes = null;
        byte[] result = qCodec.doEncoding(bytes);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncodingEmpty_ZiyR1() {
        QCodec qCodec = new QCodec();
        byte[] bytes = new byte[0];
        byte[] result = qCodec.doEncoding(bytes);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncodingNonNull_uxiU2() {
        QCodec qCodec = new QCodec();
        byte[] bytes = new byte[]{1, 2, 3};
        byte[] result = qCodec.doEncoding(bytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithCharset_dMKJ0() throws EncoderException {
        QCodec qCodec = new QCodec();
        String text = "Hello World";
        Charset charset = Charset.forName("UTF-8");
        String expected = "=?UTF-8?Q?Hello World?=";
        String actual = qCodec.encodeText(text, charset);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithCharsetName_dIoz1() throws EncoderException {
        QCodec qCodec = new QCodec();
        String text = "Hello World";
        String charsetName = "UTF-8";
        String expected = "=?UTF-8?Q?Hello World?=";
        String actual = qCodec.encodeText(text, Charset.forName(charsetName));
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithNullText_AAET3() throws EncoderException {
        QCodec qCodec = new QCodec();
        String text = null;
        Charset charset = Charset.forName("UTF-8");
        String expected = null;
        String actual = qCodec.encodeText(text, charset);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_nullInput_BjbI0() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        byte[] input = null;
        byte[] expectedOutput = null;
        byte[] actualOutput = qCodec.doDecoding(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_noUnderscores_mPjg1() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        byte[] input = new byte[]{1, 2, 3, 4, 5};
        byte[] expectedOutput = new byte[]{1, 2, 3, 4, 5};
        byte[] actualOutput = qCodec.doDecoding(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeText_nullText_EvyL0() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QCodec qCodec = new QCodec();
        try {
            String result = qCodec.decodeText(null);
            Assertions.assertNull(result);
        } catch (DecoderException e) {
            Assertions.fail("Unexpected exception thrown: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeText_notRFC1522Compliant_Rzvb1() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QCodec qCodec = new QCodec();
        try {
            String result = qCodec.decodeText("not RFC 1522 compliant");
            Assertions.fail("Expected DecoderException not thrown");
        } catch (DecoderException e) {
            Assertions.assertEquals("RFC 1522 violation: malformed encoded content", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeText_noCharsetToken_YqzG2() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QCodec qCodec = new QCodec();
        try {
            String result = qCodec.decodeText("=?=?=?=?=?=?=");
            Assertions.fail("Expected DecoderException not thrown");
        } catch (DecoderException e) {
            Assertions.assertEquals("This codec cannot decode = encoded content", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeText_noEncodingToken_SpgC3() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QCodec qCodec = new QCodec();
        try {
            String result = qCodec.decodeText("=?=?=?=?=?=?=?=");
            Assertions.fail("Expected DecoderException not thrown");
        } catch (DecoderException e) {
            Assertions.assertEquals("This codec cannot decode = encoded content", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeText_invalidEncoding_icVL6() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QCodec qCodec = new QCodec();
        try {
            String result = qCodec.decodeText("=?=?=?=?=?=?=?=?=");
            Assertions.fail("Expected DecoderException not thrown");
        } catch (DecoderException e) {
            Assertions.assertEquals("This codec cannot decode = encoded content", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeTextWithDefaultCharset_eeXV2_GWai0() throws EncoderException {
        QCodec qCodec = new QCodec();
        String text = "Hello World";
        String expected = "=?UTF-8?Q?Hello_World?=";
        String actual = qCodec.encodeText(text, StandardCharsets.UTF_8);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_withUnderscores_UFqv2_DOVr0() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        byte[] input = new byte[]{1, 2, 3, 4, 5, (byte) '_', 6, 7, 8, 9};
        byte[] expectedOutput = new byte[]{1, 2, 3, 4, 5, (byte) ' ', 6, 7, 8, 9};
        byte[] actualOutput = qCodec.doDecoding(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_withUnderscoresAndSpaces_bmmw3_TxiQ0() throws org.apache.commons.codec.DecoderException {
        QCodec qCodec = new QCodec();
        byte[] input = new byte[]{1, 2, 3, 4, 5, (byte) '_', (byte) ' ', 6, 7, 8, 9};
        byte[] expectedOutput = new byte[]{1, 2, 3, 4, 5, (byte) ' ', 6, 7, 8, 9};
        byte[] actualOutput = qCodec.doDecoding(input);
    }
}