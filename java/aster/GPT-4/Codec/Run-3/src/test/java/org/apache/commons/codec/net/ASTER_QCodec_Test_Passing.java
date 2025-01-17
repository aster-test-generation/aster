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
    public void testDecodeWithValidEncodedString_PXTe0() throws DecoderException {
        QCodec codec = new QCodec("UTF-8");
        String encodedString = "=?UTF-8?Q?Hello_World?=;"; // Example encoded string
        String expectedResult = "Hello World";
        String result = codec.decode(encodedString);
        assertEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_NullInput_EHFo0() throws DecoderException {
        QCodec codec = new QCodec();
        byte[] result = codec.doDecoding(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_NoUnderscores_YJHy1() throws DecoderException {
        QCodec codec = new QCodec();
        byte[] input = "Hello World".getBytes();
        byte[] expected = QuotedPrintableCodec.decodeQuotedPrintable(input);
        byte[] result = codec.doDecoding(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_WithUnderscores_Rlrk2() throws DecoderException {
        QCodec codec = new QCodec();
        byte[] input = "Hello_World".getBytes();
        byte[] transformed = "Hello World".getBytes();
        byte[] expected = QuotedPrintableCodec.decodeQuotedPrintable(transformed);
        byte[] result = codec.doDecoding(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_AllUnderscores_JQIp3() throws DecoderException {
        QCodec codec = new QCodec();
        byte[] input = "_____".getBytes();
        byte[] transformed = "     ".getBytes();
        byte[] expected = QuotedPrintableCodec.decodeQuotedPrintable(transformed);
        byte[] result = codec.doDecoding(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_EmptyArray_IDxC4() throws DecoderException {
        QCodec codec = new QCodec();
        byte[] input = new byte[0];
        byte[] expected = QuotedPrintableCodec.decodeQuotedPrintable(input);
        byte[] result = codec.doDecoding(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_SpecialCharacters_bUUs5() throws DecoderException {
        QCodec codec = new QCodec();
        byte[] input = "Hello_World!_How_are_you?".getBytes();
        byte[] transformed = "Hello World! How are you?".getBytes();
        byte[] expected = QuotedPrintableCodec.decodeQuotedPrintable(transformed);
        byte[] result = codec.doDecoding(input);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEncodingReturnsQ_LQvv0() throws Exception {
        QCodec codec = new QCodec();
        String encoding = codec.getEncoding();
        assertEquals("Q", encoding);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNull_aSaV0() throws Exception {
        QCodec codec = new QCodec(StandardCharsets.UTF_8);
        assertNull(codec.decode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_qnRi1() throws Exception {
        QCodec codec = new QCodec("UTF-8");
        String input = "Hello World!";
        try {
            String result = (String) codec.decode(input);
            assertEquals(input, result);
        } catch (DecoderException e) {
            fail("DecoderException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding_NullInput_ReturnsNull_jgNn0() throws Exception {
        QCodec codec = new QCodec();
        byte[] result = codec.doEncoding(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoEncoding_EmptyArray_ReturnsEmptyArray_cYXW1() throws Exception {
        QCodec codec = new QCodec();
        byte[] input = new byte[0];
        byte[] result = codec.doEncoding(input);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNull_Mwjh0() throws EncoderException {
        QCodec codec = new QCodec();
        assertNull(codec.encode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_vvHh1() throws EncoderException {
        QCodec codec = new QCodec("UTF-8");
        String input = "Hello World!";
        String expected = "EncodedString"; // Assumingnew QCodec().encode(String) returns a modified string
        assertEquals(expected, codec.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidInput_xKvM0() throws EncoderException {
        QCodec qCodec = new QCodec(Charset.forName("UTF-8"));
        String sourceStr = "Hello, World!";
        Charset sourceCharset = Charset.forName("UTF-8");
        String result = qCodec.encode(sourceStr, sourceCharset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeBlanks_QhpQ0() throws Exception {
        QCodec codec = new QCodec();
        assertFalse(codec.isEncodeBlanks());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithValidString_fBoJ0() throws EncoderException {
        QCodec qCodec = new QCodec("UTF-8");
        String sourceStr = "Hello World!";
        String expected = "=?UTF-8?Q?Hello_World!?=";
        String result = qCodec.encode(sourceStr);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeValidInput_nwMt0() throws EncoderException {
        QCodec codec = new QCodec("UTF-8");
        String sourceStr = "Hello World!";
        String sourceCharset = "UTF-8";
        String expected = "=?UTF-8?Q?Hello_World!?=";
        String result = codec.encode(sourceStr, sourceCharset);
        assertEquals(expected, result);
    }
}