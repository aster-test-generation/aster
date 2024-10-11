/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuotedPrintableCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_oJJT0() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello, World!";
        String sourceCharset = StandardCharsets.US_ASCII.name();
        String result = codec.decode(sourceStr, sourceCharset);
        assertEquals(sourceStr, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithStrict_YNxs1() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.US_ASCII, true);
        String sourceStr = "Hello, World!";
        String sourceCharset = StandardCharsets.US_ASCII.name();
        String result = codec.decode(sourceStr, sourceCharset);
        assertEquals(sourceStr, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_WeTy1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        String result = codec.encode("Hello, World!", Charset.forName("UTF-8"));
        assertEquals("Hello, World!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDefaultCharset_UCVR0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDefaultCharsetStrict_Quoi1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDefaultCharsetCharset_IFWp2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-16"));
        assertEquals("UTF-16", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDefaultCharsetCharsetName_cjCa3() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-32");
        assertEquals("UTF-32", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDefaultCharsetStrictCharset_CDuH4() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-32"), true);
        assertEquals("UTF-32", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_WKCD1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] byteArray = new byte[]{1, 2, 3};
        Object result = codec.encode(byteArray);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_gDER2() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String str = "Hello, World!";
        Object result = codec.encode(str);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeObject_UfEl3() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = new Object();
        try {
            codec.encode(obj);
            assert false;
        } catch (EncoderException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullInput_YIos0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.decode(null, StandardCharsets.UTF_8);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeValidInput_sNHf1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello, World!";
        String result = codec.decode(sourceStr, StandardCharsets.UTF_8);
        assert result.equals(sourceStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidInput_uioK2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello, World!";
        String result = codec.decode(sourceStr, StandardCharsets.UTF_16);
        assert result.equals(sourceStr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeBase64Input_AXfc3() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "SGVsbG8sIFdvcmxkIQ==";
        String result = codec.decode(sourceStr, StandardCharsets.UTF_8);
        assert result.equals("Hello, World!");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableInput_qDld4() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello, World! =20";
        String result = codec.decode(sourceStr, StandardCharsets.UTF_8);
        assert result.equals("Hello, World!");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_lfZy0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = null;
        Object result = codec.decode(obj);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_GdcB1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{1, 2, 3};
        Object obj = bytes;
        Object result = codec.decode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_Llwl2() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String str = "Hello, World!";
        Object obj = str;
        Object result = codec.decode(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeOtherType_gHRr3() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = new Object();
        try {
            codec.decode(obj);
            assert false;
        } catch (DecoderException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetStrict_WLVo0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals(codec.getCharset(), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetDefault_rFFo1() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals(codec.getCharset(), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetSpecificCharset_qDCW2() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        assertEquals(codec.getCharset(), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetSpecificCharsetWithException_HPdA4() throws Exception {
        try {
            QuotedPrintableCodec codec = new QuotedPrintableCodec("Invalid charset");
            assertEquals(codec.getCharset(), codec.getCharset());
        } catch (IllegalCharsetNameException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetSpecificCharsetWithCharset_oJUC5() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        assertEquals(codec.getCharset(), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_rGOp0() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.encode("Hello World", "UTF-8");
        assert result.equals("Hello World");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_ALow1() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String result = codec.encode(null, "UTF-8");
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithInvalidCharset_XiJv4() throws Exception {
        try {
            QuotedPrintableCodec codec = new QuotedPrintableCodec("Invalid charset");
            String result = codec.encode("Hello, World!");
            assert false;
        } catch (UnsupportedCharsetException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableNullInput_SHjb0() throws Exception {
        byte[] bytes = null;
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableEmptyInput_ELFq1() throws Exception {
        byte[] bytes = new byte[0];
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assert result.length == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableSimpleText_wuXu2() throws Exception {
        byte[] bytes = "Hello World".getBytes();
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assert Arrays.equals(result, "Hello World".getBytes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableInvalidEncoding_VHGI4() throws Exception {
        byte[] bytes = "Hello World".getBytes();
        bytes[0] = (byte) 0x3F;
        try {
            QuotedPrintableCodec.decodeQuotedPrintable(bytes);
            assert false;
        } catch (DecoderException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableInvalidEscape_mFnN5() throws Exception {
        byte[] bytes = "Hello World".getBytes();
        bytes[0] = (byte) 0x3D;
        try {
            QuotedPrintableCodec.decodeQuotedPrintable(bytes);
            assert false;
        } catch (DecoderException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableInvalidHex_OXfH6() throws Exception {
        byte[] bytes = "Hello World".getBytes();
        bytes[0] = (byte) 0x3D;
        bytes[1] = (byte) 0x61;
        try {
            QuotedPrintableCodec.decodeQuotedPrintable(bytes);
            assert false;
        } catch (DecoderException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNullBytes_GiSV0() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = null;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNullPrintable_yjIB1() throws Exception {
        BitSet printable = null;
        byte[] bytes = new byte[1];
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableStrict_YNkd2() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[4];
        bytes[0] = 0x20;
        bytes[1] = 0x20;
        bytes[2] = 0x20;
        bytes[3] = 0x20;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNotStrict_qeEV3() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[4];
        bytes[0] = 0x20;
        bytes[1] = 0x20;
        bytes[2] = 0x20;
        bytes[3] = 0x20;
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableSingleByte_TxEU4() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        bytes[0] = 0x20;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonPrintableByte_lPcU6() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        bytes[0] = 0x7F;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonPrintableByteNotStrict_mQGs7() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        bytes[0] = 0x7F;
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableMultipleNonPrintableBytes_yWmj8() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[4];
        bytes[0] = 0x7F;
        bytes[1] = 0x7F;
        bytes[2] = 0x7F;
        bytes[3] = 0x7F;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableMultipleNonPrintableBytesNotStrict_gOrd9() throws Exception {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[4];
        bytes[0] = 0x7F;
        bytes[1] = 0x7F;
        bytes[2] = 0x7F;
        bytes[3] = 0x7F;
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableBytes_WjlI0() throws Exception {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assert result.length == 24;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_WhitespaceBytes_GhTZ2() throws Exception {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{9, 10, 13, 32};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assert result.length == 12;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableBytesStrict_NtSD3() throws Exception {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, false);
        assert result.length == 16;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_WhitespaceBytesStrict_RpoQ5() throws Exception {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{9, 10, 13, 32};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, false);
        assert result.length == 8;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_EmptyBytes_FMEL6() throws Exception {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[0];
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assert result.length == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_NullBytes_pvKX7() throws Exception {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = null;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableBytesWithEscape_EXGF8() throws Exception {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assert result.length == 40;
    }
}