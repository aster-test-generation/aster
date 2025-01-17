/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuotedPrintableCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullInput_SNBI0() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.decode(null, StandardCharsets.UTF_8.name());
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyInput_aKLN1() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.decode("", StandardCharsets.UTF_8.name());
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeValidInput_JbkC2() throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello, World!";
        String result = codec.decode(sourceStr, StandardCharsets.UTF_8.name());
        assertEquals(sourceStr, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testByteArrayInput_gltY1() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] byteArray = new byte[]{1, 2, 3};
        Object result = codec.encode(byteArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringInput_ciaI2() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String str = "Hello, World!";
        Object result = codec.encode(str);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonByteArrayNonStringInput_tOPH3() throws org.apache.commons.codec.EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = new Object();
        try {
            codec.encode(obj);
        } catch (EncoderException e) {
            assertEquals("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable encoded", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableEmpty_fCan4() throws org.apache.commons.codec.DecoderException {
        byte[] bytes = new byte[0];
        byte[] expected = new byte[0];
        assertArrayEquals(expected, QuotedPrintableCodec.decodeQuotedPrintable(bytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithWhitespace_aORz0() {
        BitSet printable = new BitSet();
        printable.set(0, 256);
        byte[] bytes = new byte[]{(byte) 0x20, (byte) 0x09, (byte) 0x0A, (byte) 0x0D};
        byte[] expected = new byte[]{(byte) 0x20, (byte) 0x09, (byte) 0x0A, (byte) 0x0D};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithoutWhitespace_AKGT1() {
        BitSet printable = new BitSet();
        printable.set(0, 256);
        byte[] bytes = new byte[]{(byte) 0x21, (byte) 0x22, (byte) 0x23};
        byte[] expected = new byte[]{(byte) 0x21, (byte) 0x22, (byte) 0x23};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNonPrintableChars_GWRQ2() {
        BitSet printable = new BitSet();
        printable.set(0, 256);
        byte[] bytes = new byte[]{(byte) 0x20, (byte) 0x09, (byte) 0x0A, (byte) 0x0D, (byte) 0x7F};
        byte[] expected = new byte[]{(byte) 0x20, (byte) 0x09, (byte) 0x0A, (byte) 0x0D, (byte) 0x7F};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithoutStrictMode_EkyQ3() {
        BitSet printable = new BitSet();
        printable.set(0, 256);
        byte[] bytes = new byte[]{(byte) 0x20, (byte) 0x09, (byte) 0x0A, (byte) 0x0D};
        byte[] expected = new byte[]{(byte) 0x20, (byte) 0x09, (byte) 0x0A, (byte) 0x0D};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, false);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNullBytes_cIDX6() {
        BitSet printable = new BitSet();
        printable.set(0, 256);
        byte[] bytes = null;
        byte[] expected = null;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithPrintableByteStrictFalse_eTcJ4() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{(byte) 0};
        byte[] expected = new byte[]{(byte) 0};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, false);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNegativeByteStrictTrue_aBXV8() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{-1};
        byte[] expected = null;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNonPrintableByteStrictTrueAndShortInput_XwJK9() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{(byte) 128};
        byte[] expected = null;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assertArrayEquals(expected, result);
    }
}