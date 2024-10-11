/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
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

public class Aster_QuotedPrintableCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStrict_dFnl0() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String sourceStr = "Hello World!";
        String sourceCharset = "UTF-8";
        String expected = "Hello World!";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonStrict_ptqT1() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(false);
        String sourceStr = "Hello=20World!";
        String sourceCharset = "UTF-8";
        String expected = "Hello World!";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_RDTp0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(false);
        assertEquals("ISO-8859-1", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset2_ivkM1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset3_reyy2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-16");
        assertEquals("UTF-16", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset4_zCyp3() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals("ISO-8859-1", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset5_YIBi4() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), false);
        assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithByteArray_HcoM1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = new byte[]{1, 2, 3};
        Object encodedObject = codec.encode(input);
        assertNotNull(encodedObject);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_jOfm2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String input = "Hello, World!";
        Object encodedObject = codec.encode(input);
        assertNotNull(encodedObject);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_khco0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(false);
        byte[] input = new byte[]{65, 66, 67};
        byte[] expectedOutput = new byte[]{65, 66, 67};
        byte[] actualOutput = codec.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_YamK0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "hello=20world".getBytes();
        byte[] expectedOutput = "hello world".getBytes();
        byte[] actualOutput = codec.decode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_iaMg1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Hello World!".getBytes();
        Object decodedObject = codec.decode(input);
        assertEquals("Hello World!", decodedObject);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_MznK2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String input = "Hello World!";
        Object decodedObject = codec.decode(input);
        assertEquals("Hello World!", decodedObject);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset_kXGt0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals(StandardCharsets.ISO_8859_1, codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset2_EVYh1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset3_PDBc2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        assertEquals(StandardCharsets.UTF_8, codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset4_fOlH3() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals(StandardCharsets.ISO_8859_1, codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharset5_sNeE4() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_8, true);
        assertEquals(StandardCharsets.UTF_8, codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_zaix0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String sourceStr = "This is a test string";
        String expected = "This is a test string";
        String actual = codec.decode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharset_XdAg1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        String sourceStr = "This is a test string";
        String expected = "This is a test string";
        String actual = codec.decode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharsetStr_ZxQx2() throws DecoderException, IllegalCharsetNameException, UnsupportedCharsetException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        String sourceStr = "This is a test string";
        String expected = "This is a test string";
        String actual = codec.decode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharsetObj_sKMg3() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        String sourceStr = "This is a test string";
        String expected = "This is a test string";
        String actual = codec.decode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullSourceStr_BaHj0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = null;
        String sourceCharset = "UTF-8";
        String encodedStr = codec.encode(sourceStr, sourceCharset);
        Assertions.assertNull(encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonNullSourceStr_qnAn1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello, World!";
        String sourceCharset = "UTF-8";
        String encodedStr = codec.encode(sourceStr, sourceCharset);
        Assertions.assertEquals("Hello, World!", encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStrict_eZXB0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String sourceStr = "Hello, World!";
        String decodedStr = codec.decode(sourceStr, Charset.forName("US-ASCII"));
        assertEquals("Hello, World!", decodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharset_ndVJ1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        String sourceStr = "Hello, World!";
        String decodedStr = codec.decode(sourceStr, Charset.forName("UTF-8"));
        assertEquals("Hello, World!", decodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharsetInvalid_OPOF2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-16");
        String sourceStr = "Hello, World!";
        try {
            codec.decode(sourceStr, Charset.forName("UTF-16"));
            fail("DecoderException expected");
        } catch (DecoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullSource_mULw3() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = null;
        String decodedStr = codec.decode(sourceStr, Charset.forName("US-ASCII"));
        assertNull(decodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharsetStrict_iXTi5() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        String sourceStr = "Hello, World!";
        String decodedStr = codec.decode(sourceStr, Charset.forName("UTF-8"));
        assertEquals("Hello, World!", decodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_anww0() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello, World!";
        String expectedResult = "Hello, World!";
        String actualResult = codec.encode(sourceStr);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_BRnO1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        String sourceStr = "Hello, World!";
        String expectedResult = "Hello, World!";
        String actualResult = codec.encode(sourceStr);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharsetName_FRkZ2() throws EncoderException, IllegalCharsetNameException, UnsupportedCharsetException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        String sourceStr = "Hello, World!";
        String expectedResult = "Hello, World!";
        String actualResult = codec.encode(sourceStr);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharsetAndStrict_htCP3() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        String sourceStr = "Hello, World!";
        String expectedResult = "Hello, World!";
        String actualResult = codec.encode(sourceStr);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSourceStrNull_iYzG4() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = null;
        String expectedResult = "";
        String actualResult = codec.encode(sourceStr);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSourceStrEmpty_khhj5() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "";
        String expectedResult = "";
        String actualResult = codec.encode(sourceStr);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_Rpeu0() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[10];
        byte[] expected = new byte[10];
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringAndCharset_hzof0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        String sourceStr = "Hello, ";
        String encodedStr = codec.encode(sourceStr, Charset.forName("UTF-8"));
        assertEquals("Hello, =?UTF-8?B?5Lit5a2X54mH?=", encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringAndCharset2_htvG1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), false);
        String sourceStr = "Hello, ";
        String encodedStr = codec.encode(sourceStr, Charset.forName("UTF-8"));
        assertEquals("Hello, =?UTF-8?B?5Lit5a2X54mH?=", encodedStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_tzVm0_1() throws Exception {
        byte[] input = new byte[]{65, 66, 67};
        BitSet printable = new BitSet();
        printable.set(65);
        printable.set(66);
        printable.set(67);
        byte[] expectedOutput = new byte[]{65, 66, 67};
        byte[] actualOutput = QuotedPrintableCodec.encodeQuotedPrintable(printable, input, false);
        input = new byte[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126};
        printable = new BitSet();
        expectedOutput = new byte[]{61, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 61, 62, 63, 61, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126};
        actualOutput = QuotedPrintableCodec.encodeQuotedPrintable(printable, input, false);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable1_IXqK0() throws Exception {
        byte[] bytes = null;
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = null;
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable2_AssE1() throws Exception {
        byte[] bytes = new byte[0];
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[0];
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable3_jPtf2() throws Exception {
        byte[] bytes = new byte[]{65, 66, 67};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[]{65, 66, 67};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable4_UQZh3() throws Exception {
        byte[] bytes = new byte[]{61, 61};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[]{61, 61};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable5_MLwC4() throws Exception {
        byte[] bytes = new byte[]{61, 65};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[]{61, 65};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable6_buDy5() throws Exception {
        byte[] bytes = new byte[]{61, 61, 61, 61};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[]{61, 61, 61, 61};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable7_HWqO6() throws Exception {
        byte[] bytes = new byte[]{61, 61, 65, 61};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[]{61, 61, 65, 61};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable8_RfJU7() throws Exception {
        byte[] bytes = new byte[]{61, 61, 65, 61, 61, 61, 61, 61};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[]{61, 61, 65, 61, 61, 61, 61, 61};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable9_FqdA8() throws Exception {
        byte[] bytes = new byte[]{61, 61, 65, 61, 61, 61, 61, 61, 61, 61};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[]{61, 61, 65, 61, 61, 61, 61, 61, 61, 61};
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable10_QlWl9() throws Exception {
        byte[] bytes = new byte[]{61, 61, 65, 61, 61, 61, 61, 61, 61, 61, 61, 61};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        byte[] expected = new byte[]{61, 61, 65, 61, 61, 61, 61, 61, 61, 61, 61, 61};
        assertArrayEquals(expected, result);
    }
}