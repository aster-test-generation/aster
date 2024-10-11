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
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.BitSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuotedPrintableCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithValidInput_fSKQ0() throws Exception {
    QuotedPrintableCodec codec = new QuotedPrintableCodec();
    String sourceStr = "Hello World!";
    String encodedStr = codec.encode(sourceStr, StandardCharsets.UTF_8);
    assertEquals("Hello World!", encodedStr);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithNullInput_dTFd1() throws Exception {
    QuotedPrintableCodec codec = new QuotedPrintableCodec();
    String sourceStr = null;
    String encodedStr = codec.encode(sourceStr, StandardCharsets.UTF_8);
    assertEquals(null, encodedStr);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithoutCharset_bkIP1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "This is a test string";
        String expected = "This is a test string";
        assertEquals(expected, codec.decode(sourceStr));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_HBFZ0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = new Object();
        Object result = codec.decode(obj);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharset_jLwA1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        Object obj = new Object();
        Object result = codec.decode(obj);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithStrict_nKwc3() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        Object obj = new Object();
        Object result = codec.decode(obj);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_WRZj0_1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        BitSet printable = new BitSet();
        byte[] bytes = new byte[] {65, 66, 67}; // ASCII values for 'A', 'B', 'C'
        boolean strict = false;
        byte[] encodedBytes = codec.encodeQuotedPrintable(printable, bytes, strict);
        printable = new BitSet();
        bytes = new byte[] {0, 1, 2}; // Non-printable bytes
        strict = true;
        encodedBytes = codec.encodeQuotedPrintable(printable, bytes, strict);
        assertTrue(Arrays.equals(new byte[] {65, 66, 67}, encodedBytes));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_WRZj0_2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        BitSet printable = new BitSet();
        byte[] bytes = new byte[] {65, 66, 67}; // ASCII values for 'A', 'B', 'C'
        boolean strict = false;
        byte[] encodedBytes = codec.encodeQuotedPrintable(printable, bytes, strict);
        printable = new BitSet();
        bytes = new byte[] {0, 1, 2}; // Non-printable bytes
        strict = true;
        encodedBytes = codec.encodeQuotedPrintable(printable, bytes, strict);
        assertTrue(Arrays.equals(new byte[] {33, 33, 33}, encodedBytes));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithNoArguments_XmTP0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals(null, codec.getCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithCharsetArgument_DXGI1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.defaultCharset());
        assertEquals(Charset.defaultCharset(), codec.getCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithStringArgument_rGfN2() throws IllegalCharsetNameException, UnsupportedCharsetException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        assertEquals(Charset.forName("UTF-8"), codec.getCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithBooleanArgument_XBIK3() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals(null, codec.getCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithCharsetAndBooleanArguments_DFwa4() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.defaultCharset(), true);
        assertEquals(Charset.defaultCharset(), codec.getCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharset_niKn1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        String sourceStr = "This is a test string";
        String expected = "This is a test string";
        assertEquals(expected, codec.decode(sourceStr));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithStrictMode_FElN2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String sourceStr = "This is a test string";
        String expected = "This is a test string";
        assertEquals(expected, codec.decode(sourceStr));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithException_jiYH3_1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "This is a test string with an invalid encoding";
        DecoderException exception = assertThrows(DecoderException.class, () -> codec.decode(sourceStr));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintable_BitSet_byte_array_boolean_1_UCOl0() throws Exception {
    BitSet bitSet = new BitSet();
    byte[] bytes = new byte[]{(byte) 1, (byte) 2, (byte) 3};
    boolean strict = true;
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, bytes, strict);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintable_BitSet_byte_array_boolean_2_hVRm1() throws Exception {
    BitSet bitSet = new BitSet();
    byte[] bytes = new byte[]{(byte) 1, (byte) 2, (byte) 3};
    boolean strict = false;
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(bitSet, bytes, strict);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithByteArray_QsSU1() throws EncoderException {
    final QuotedPrintableCodec codec = new QuotedPrintableCodec();
    final byte[] bytes = new byte[] { 0, 1, 2, 3 };
    Assertions.assertArrayEquals(new byte[] { 0, 1, 2, 3 }, (byte[]) codec.encode(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeWithString_hZQa2() throws EncoderException {
    final QuotedPrintableCodec codec = new QuotedPrintableCodec();
    final String str = "Hello, World!";
    Assertions.assertEquals("Hello, World!", (String) codec.encode(str));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_RywU0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        String encoded = codec.encode("Hello World", "UTF-8");
        assertEquals("Hello World", encoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_Vnxb1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        String encoded = codec.encode("Hello World", "UTF-8");
        assertEquals("Hello World", encoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNull_vmPr2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = codec.encode(null, "UTF-8");
        assertEquals(null, encoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrict_srns3() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String encoded = codec.encode("Hello World", "UTF-8");
        assertEquals("Hello World", encoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithoutCharset_SOUY4() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = codec.encode("Hello World");
        assertEquals("Hello World", encoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithoutCharsetAndStrict_trlo5() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String encoded = codec.encode("Hello World");
        assertEquals("Hello World", encoded);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bOYy0() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals(" quoted printable codec", codec.encode(" quoted printable codec"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_AKDO1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.defaultCharset());
        assertEquals("quoted printable codec", codec.encode("quoted printable codec"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharsetName_oWHm2() throws EncoderException, UnsupportedCharsetException, IllegalCharsetNameException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        assertEquals("quoted printable codec", codec.encode("quoted printable codec"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrictOption_iwJl3() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals("quoted printable codec", codec.encode("quoted printable codec"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidCharsetName_zLWU4_1() throws Exception {
        Exception exception = assertThrows(UnsupportedCharsetException.class, () -> new QuotedPrintableCodec("invalid charset name"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_HUyq0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Hello World".getBytes();
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, codec.decode(input));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithStrictMode_xjxd2() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        byte[] input = "Hello World".getBytes();
        byte[] expected = "Hello World".getBytes();
        assertArrayEquals(expected, codec.decode(input));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidInput_EnUj3() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = "Hello World".getBytes();
        assertThrows(DecoderException.class, () -> codec.decode(input));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidCharset_HPlK4() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("InvalidCharset");
        byte[] input = "Hello World".getBytes();
        assertThrows(UnsupportedCharsetException.class, () -> codec.decode(input));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidCharsetName_sjqI5() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("InvalidCharsetName");
        byte[] input = "Hello World".getBytes();
        assertThrows(IllegalCharsetNameException.class, () -> codec.decode(input));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable_rwEm0() throws Exception {
        final byte[] bytes = {65, 66, 67};
        final byte[] expected = {65, 66, 67};
        assertArrayEquals(expected, QuotedPrintableCodec.decodeQuotedPrintable(bytes));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableWithEscapeChar_AWPo1() throws Exception {
        final byte[] bytes = {65, 66, 33, 67};
        final byte[] expected = {65, 66, 33, 67};
        assertArrayEquals(expected, QuotedPrintableCodec.decodeQuotedPrintable(bytes));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableWithCrlf_CkAs2() throws Exception {
        final byte[] bytes = {65, 66, 13, 10, 67};
        final byte[] expected = {65, 66, 13, 10, 67};
        assertArrayEquals(expected, QuotedPrintableCodec.decodeQuotedPrintable(bytes));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableWithInvalidChar_GvIK3_1() throws Exception {
        final byte[] bytes = {65, 66, 100, 67};
        final DecoderException exception = assertThrows(DecoderException.class,
                () -> QuotedPrintableCodec.decodeQuotedPrintable(bytes));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableWithNullInput_bHHG4() throws Exception {
        final byte[] bytes = null;
        final byte[] expected = null;
        assertArrayEquals(expected, QuotedPrintableCodec.decodeQuotedPrintable(bytes));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_HoLX0() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithStrictParameter_pdIM1() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[0];
        boolean strict = true;
        byte[] expected = new byte[0];
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_SPtK0() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "This is a test";
        String sourceCharset = "UTF-8";
        String expected = "This is a test";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharset_pRaD1() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        String sourceStr = "This is a test";
        String sourceCharset = "UTF-8";
        String expected = "This is a test";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharsetName_yHUO2() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        String sourceStr = "This is a test";
        String sourceCharset = "UTF-8";
        String expected = "This is a test";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithStrict_NYGU3() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String sourceStr = "This is a test";
        String sourceCharset = "UTF-8";
        String expected = "This is a test";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithCharsetAndStrict_JPBR4() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        String sourceStr = "This is a test";
        String sourceCharset = "UTF-8";
        String expected = "This is a test";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithNullSourceStr_kgix5() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = null;
        String sourceCharset = "UTF-8";
        String expected = null;
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithInvalidCharset_QfNi6() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "This is a test";
        String sourceCharset = "InvalidCharset";
        assertThrows(UnsupportedCharsetException.class, () -> codec.decode(sourceStr, sourceCharset));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintable_BitSet_byte_array_boolean_0_upYP0() throws Exception {
    final BitSet printable = new BitSet();
    final byte[] bytes = new byte[2];
    final boolean strict = true;
    final byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    assertEquals(2, result.length);
}
}