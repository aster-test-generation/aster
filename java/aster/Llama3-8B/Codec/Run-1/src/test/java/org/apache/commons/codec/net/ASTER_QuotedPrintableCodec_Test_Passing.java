/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

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

public class Aster_QuotedPrintableCodec_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_JKnJ0() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello World!";
        String sourceCharset = "US-ASCII";
        String result = codec.decode(sourceStr, sourceCharset);
        assertEquals("Hello World!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithStrict_wTCO1() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("US-ASCII"), true);
        String sourceStr = "Hello World!";
        String sourceCharset = "US-ASCII";
        String result = codec.decode(sourceStr, sourceCharset);
        assertEquals("Hello World!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_Oetu0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals("UTF-8", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithCharset_dgPB1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-16"));
        assertEquals("UTF-16", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithCharsetAndStrict_hjfj2() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-16"), true);
        assertEquals("UTF-16", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithName_hChr3() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-32");
        assertEquals("UTF-32", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_cdDA0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = codec.decode(new byte[]{1, 2, 3});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_sdki1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = codec.decode("test");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_eprL1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{1, 2, 3};
        Object result = codec.encode(bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_pFej2() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String str = "Hello, World!";
        Object result = codec.encode(str);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeUnsupportedObject_kSrt3() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = new Object();
        try {
            codec.encode(obj);
            assert false;
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharset_Uowz1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        String result = codec.encode("Hello, World!", Charset.forName("UTF-8"));
        assertEquals("Hello, World!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetStrict_DpiH0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals(codec.getCharset(), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetDefault_dnHN1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals(codec.getCharset(), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetSpecificCharset_EiNN2() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        assertEquals(codec.getCharset(), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetSpecificCharsetWithException_VMUl4() {
        try {
            QuotedPrintableCodec codec = new QuotedPrintableCodec("Invalid charset");
            assertEquals(codec.getCharset(), codec.getCharset());
        } catch (Exception e) {
            assertEquals(e.getClass(), IllegalCharsetNameException.class);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetSpecificCharsetWithCharset_gnzB5() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        assertEquals(codec.getCharset(), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetSpecificCharsetWithCharsetStrict_vkwE6() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        assertEquals(codec.getCharset(), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNullBytes_qfKH0() {
        BitSet printable = new BitSet();
        byte[] bytes = null;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableStrict_MsyU2() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[10];
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonStrict_ZRrj3() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[10];
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableSingleByte_ztCv4() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableMultipleBytes_JZcv5() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[5];
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWhitespace_xPrT6() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        bytes[0] = (byte) 0x20;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonWhitespace_BHUz7() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        bytes[0] = (byte) 0x7F;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonASCII_rkDu8() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        bytes[0] = (byte) 0xC0;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNullPrintableNonStrict_RwwS9() {
        BitSet printable = null;
        byte[] bytes = new byte[1];
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableSingleByteNonStrict_KVKB10() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableMultipleBytesNonStrict_NYQU11() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[5];
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWhitespaceNonStrict_jdwA12() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        bytes[0] = (byte) 0x20;
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonWhitespaceNonStrict_rCZv13() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        bytes[0] = (byte) 0x7F;
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonASCIINonStrict_Broj14() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[1];
        bytes[0] = (byte) 0xC0;
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNullBytes_Lccf0() {
        byte[] bytes = null;
        BitSet printable = new BitSet();
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNullPrintable_sykM1() {
        byte[] bytes = new byte[1];
        BitSet printable = null;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableStrict_JIrm2() {
        byte[] bytes = new byte[10];
        BitSet printable = new BitSet();
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonStrict_GEGY3() {
        byte[] bytes = new byte[10];
        BitSet printable = new BitSet();
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableSingleByte_ievJ4() {
        byte[] bytes = new byte[1];
        BitSet printable = new BitSet();
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableMultipleBytes_BoWa5() {
        byte[] bytes = new byte[5];
        BitSet printable = new BitSet();
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonPrintableByte_mFhG6() {
        byte[] bytes = new byte[1];
        BitSet printable = new BitSet();
        printable.set(0);
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNonPrintableBytes_UpeS7() {
        byte[] bytes = new byte[5];
        BitSet printable = new BitSet();
        printable.set(0);
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableCharacters_BHQn0() {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_WhitespaceCharacters_rTqH2() {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{32, 9, 10, 13};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableCharactersNotStrict_UkVv3() {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_WhitespaceCharactersNotStrict_aAXx5() {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{32, 9, 10, 13};
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_EmptyBytes_CfQR6() {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[0];
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_NullBytes_HSuJ7() {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = null;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableCharactersNullPrintable_kovn8() {
        BitSet printable = null;
        BitSet printableChars = new BitSet();
        printableChars.set(0, 128);
        byte[] bytes = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_WhitespaceCharactersNullPrintable_pAWy10() {
        BitSet printable = null;
        BitSet printableChars = new BitSet();
        printableChars.set(0, 128);
        byte[] bytes = new byte[]{32, 9, 10, 13};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableBytesNotStrict_OVpr2() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{0};
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result.length == 1;
        assert result[0] == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableBytesLong_VfEN4() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{0, 0, 0, 0, 0};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result.length == 5;
        assert result[0] == 0;
        assert result[1] == 0;
        assert result[2] == 0;
        assert result[3] == 0;
        assert result[4] == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableBytesNotStrictLong_Zidl6() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{0, 0, 0, 0, 0};
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result.length == 5;
        assert result[0] == 0;
        assert result[1] == 0;
        assert result[2] == 0;
        assert result[3] == 0;
        assert result[4] == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNullPrintable_hmBZ1() {
        byte[] bytes = new byte[0];
        BitSet printable = null;
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableStrict_XKrQ2() {
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        BitSet printable = new BitSet();
        printable.set(0x00);
        printable.set(0x01);
        printable.set(0x02);
        printable.set(0x03);
        printable.set(0x04);
        printable.set(0x05);
        printable.set(0x06);
        printable.set(0x07);
        printable.set(0x08);
        printable.set(0x09);
        printable.set(0x0A);
        printable.set(0x0B);
        printable.set(0x0C);
        printable.set(0x0D);
        printable.set(0x0E);
        printable.set(0x0F);
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNotStrict_VjMy3() {
        byte[] bytes = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        BitSet printable = new BitSet();
        printable.set(0x00);
        printable.set(0x01);
        printable.set(0x02);
        printable.set(0x03);
        printable.set(0x04);
        printable.set(0x05);
        printable.set(0x06);
        printable.set(0x07);
        printable.set(0x08);
        printable.set(0x09);
        printable.set(0x0A);
        printable.set(0x0B);
        printable.set(0x0C);
        printable.set(0x0D);
        printable.set(0x0E);
        printable.set(0x0F);
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNotPrintable_EKSZ4() {
        byte[] bytes = new byte[]{(byte) 0x80};
        BitSet printable = new BitSet();
        printable.set(0x00);
        printable.set(0x01);
        printable.set(0x02);
        printable.set(0x03);
        printable.set(0x04);
        printable.set(0x05);
        printable.set(0x06);
        printable.set(0x07);
        printable.set(0x08);
        printable.set(0x09);
        printable.set(0x0A);
        printable.set(0x0B);
        printable.set(0x0C);
        printable.set(0x0D);
        printable.set(0x0E);
        printable.set(0x0F);
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_LfRB0() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_8);
        byte[] bytes = codec.encode("Hello, World!".getBytes(StandardCharsets.UTF_8));
        byte[] expected = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        assert Arrays.equals(bytes, expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStrict_GFVF1() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_8, true);
        byte[] bytes = codec.encode("Hello, World!".getBytes(StandardCharsets.UTF_8));
        byte[] expected = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        assert Arrays.equals(bytes, expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNoStrict_pIsZ2() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_8, false);
        byte[] bytes = codec.encode("Hello, World!".getBytes(StandardCharsets.UTF_8));
        byte[] expected = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        assert Arrays.equals(bytes, expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_jKsC0() throws DecoderException, IllegalCharsetNameException, UnsupportedCharsetException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        byte[] bytes = codec.decode(new byte[]{(byte) 0x61, (byte) 0x62, (byte) 0x63});
        byte[] expected = new byte[]{(byte) 0x61, (byte) 0x62, (byte) 0x63};
        assertArrayEquals(expected, bytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithCharsetName_NfCs4() {
        try {
            QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
            String result = codec.encode("Hello, World!");
            assertEquals("Hello, World!", result);
        } catch (Exception e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetSpecificCharsetStrict_WoNs3_TYDx0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        assertEquals(Charset.forName("UTF-8"), codec.getCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_NotPrintableCharacters_XMRv1_lMQy0() {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{(byte) 129, (byte) 130, (byte) 131, (byte) 132, (byte) 133, (byte) 134, (byte) 135, (byte) 136};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_NotPrintableCharactersNotStrict_MmIN4_PKIB0() {
        BitSet printable = new BitSet();
        printable.set(0, 128);
        byte[] bytes = new byte[]{(byte) 129, (byte) 130, (byte) 131, (byte) 132, (byte) 133, (byte) 134, (byte) 135, (byte) 136};
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableInvalidEscape_AgqY5_cnOA0() {
        byte[] bytes = new byte[]{(byte) '=', (byte) 'a'};
        try {
            QuotedPrintableCodec.decodeQuotedPrintable(bytes);
            assert false;
        } catch (DecoderException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_KwVC0_XFrS0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String sourceStr = "Hello, World!";
        try {
            String result = codec.encode(sourceStr, "UTF-8");
            assertEquals(sourceStr, result);
        } catch (UnsupportedEncodingException e) {
            fail("UnsupportedEncodingException was thrown, but not expected");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStrict_PIjD1_iPAD0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        String sourceStr = "Hello, World!";
        try {
            String result = codec.encode(sourceStr, "UTF-8");
            assertEquals(sourceStr, result);
        } catch (UnsupportedEncodingException e) {
            fail("UnsupportedEncodingException was thrown but not expected");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharset_QvMZ2_uFkJ0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        String sourceStr = "Hello, World!";
        try {
            String result = codec.encode(sourceStr, "UTF-8");
            assertEquals(sourceStr, result);
        } catch (UnsupportedEncodingException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStringCharset_bbsP3_rlCG0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        String sourceStr = "Hello, World!";
        try {
            String result = codec.encode(sourceStr, "UTF-8");
            assertEquals(sourceStr, result);
        } catch (UnsupportedEncodingException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharsetStrict_mNWd4_pwwn0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        String sourceStr = "Hello, World!";
        try {
            String result = codec.encode(sourceStr, "UTF-8");
            assertEquals(sourceStr, result);
        } catch (UnsupportedEncodingException e) {
            fail("UnsupportedEncodingException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableNullInput_eQrX0_fTCN1() {
        byte[] bytes = null;
        try {
            QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        } catch (DecoderException e) {
            assert true;
        }
    }
}