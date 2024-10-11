/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_QuotedPrintableCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedCharset_vVVi5() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "=3D=Hello, World!";
        Charset sourceCharset = Charset.forName("UTF-8");
        String expected = "=Hello, World!";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedCharsetAndStrict_EBVX6() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String sourceStr = "=3D=Hello, World!";
        Charset sourceCharset = Charset.forName("UTF-8");
        String expected = "=Hello, World!";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithNullStrict_BeSI9() {
        QuotedPrintableCodec qpCodec = new QuotedPrintableCodec(null, true);
        assertNull(Charset.defaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_printable_null_nFSr3() {
        boolean strict = true;
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BitSet printable = null;
        byte[] expected = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable2_ASTd1() {
        QuotedPrintableCodec qp = new QuotedPrintableCodec(true);
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] expected = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] actual = qp.encodeQuotedPrintable(BitSet.valueOf(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), bytes, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable3_hNPC2() {
        QuotedPrintableCodec qp = new QuotedPrintableCodec(true);
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] expected = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte[] actual = qp.encodeQuotedPrintable(BitSet.valueOf(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), bytes, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_charset_UTF16_LvsD5() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_16);
        String sourceStr = "=FE=FF=00H=00e=00l=00l=00o=00,=00 =00W=00o=00r=00l=00d=00!";
        String expected = "=FE=FF=00H=00e=00l=00l=00o=00,=00 =00W=00o=00r=00l=00d=00!";
        String actual = codec.encode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_charset_UTF16BE_tTbt6() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_16BE);
        String sourceStr = "=00H=00e=00l=00l=00o=00,=00 =00W=00o=00r=00l=00d=00!";
        String expected = "=00H=00e=00l=00l=00o=00,=00 =00W=00o=00r=00l=00d=00!";
        String actual = codec.encode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_charset_UTF16LE_IVIv7() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_16LE);
        String sourceStr = "H=00e=00l=00l=00o=00,=00 =00W=00o=00r=00l=00d=00!=00";
        String expected = "H=00e=00l=00l=00o=00,=00 =00W=00o=00r=00l=00d=00!=00";
        String actual = codec.encode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_DifferentCharset_eRiE2() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "=FE=FF=00H=00e=00l=00l=00o=00,=00 =00W=00o=00r=00l=00d=00!";
        String sourceCharset = "UTF-16";
        String expectedResult = "=FE=FF=00H=00e=00l=00l=00o=00,=00 =00W=00o=00r=00l=00d=00!";
        String result = codec.encode(sourceStr, sourceCharset);
        assertEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_Uaux0_fid1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "=3DHello, World!";
        Charset sourceCharset = Charset.forName("US-ASCII");
        String expected = "Hello, World!";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedCharset_vVVi5_fid1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "=3DHello, World!";
        Charset sourceCharset = Charset.forName("UTF-8");
        String expected = "Hello, World!";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithUnsupportedCharsetAndStrict_EBVX6_fid1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String sourceStr = "=3DHello, World!";
        Charset sourceCharset = Charset.forName("UTF-8");
        String expected = "Hello, World!";
        String actual = codec.decode(sourceStr, sourceCharset);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_dqHL0_fid1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] input = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05};
        byte[] expectedOutput = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05};
        byte[] actualOutput = codec.encode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithNullCharset_lGyX5_fid1() {
        QuotedPrintableCodec qpCodec = new QuotedPrintableCodec((Charset) null);
        assertEquals(Charset.defaultCharset(), qpCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithNullCharsetName_aZEJ6_fid1() {
        QuotedPrintableCodec qpCodec = new QuotedPrintableCodec((String) null);
        assertEquals(Charset.defaultCharset(), qpCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithInvalidCharsetName_WdJf7_fid1() {
        String charsetName = "invalid_charset";
        QuotedPrintableCodec qpCodec = new QuotedPrintableCodec(charsetName);
        assertEquals(Charset.defaultCharset(), qpCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithInvalidCharset_vgfq8_fid1() {
        Charset charset = Charset.forName("invalid_charset");
        QuotedPrintableCodec qpCodec = new QuotedPrintableCodec(charset);
        assertEquals(Charset.defaultCharset(), qpCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetWithNullStrict_BeSI9_fid1() {
        QuotedPrintableCodec qpCodec = new QuotedPrintableCodec(null, true);
        assertEquals(Charset.defaultCharset(), qpCodec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_bytes_empty_GCJT4_fid1() {
        boolean strict = true;
        byte[] bytes = new byte[]{};
        BitSet printable = new BitSet();
        printable.set(1);
        printable.set(2);
        printable.set(3);
        printable.set(4);
        printable.set(5);
        printable.set(6);
        printable.set(7);
        printable.set(8);
        printable.set(9);
        printable.set(10);
        byte[] expected = new byte[]{};
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_charset_UTF16_LvsD5_fid1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_16);
        String sourceStr = "Hello, World!";
        String expected = "Hello, World!";
        String actual = codec.encode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_charset_UTF16BE_tTbt6_fid1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_16BE);
        String sourceStr = "Hello, World!";
        String expected = "Hello, World!";
        String actual = codec.encode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_charset_UTF16LE_IVIv7_fid1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_16LE);
        String sourceStr = "Hello, World!";
        String expected = "Hello, World!";
        String actual = codec.encode(sourceStr);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_DifferentCharset_eRiE2_fid1() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello, World!";
        String sourceCharset = "UTF-16";
        String expectedResult = "Hello, World!";
        String result = codec.encode(sourceStr, sourceCharset);
        assertEquals(expectedResult, result);
    }
}