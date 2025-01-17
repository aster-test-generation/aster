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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.Arrays;
import java.util.BitSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuotedPrintableCodec_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_AcPK0() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("US-ASCII"));
        String sourceStr = "Hello, World!";
        String sourceCharset = "US-ASCII";
        String result = codec.decode(sourceStr, sourceCharset);
        assertEquals("Hello, World!", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNullSourceStr_aNJS1() throws DecoderException, UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("US-ASCII"));
        String sourceStr = null;
        String sourceCharset = "US-ASCII";
        String result = codec.decode(sourceStr, sourceCharset);
        assertEquals(null, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_rUnM0() throws DecoderException, IllegalCharsetNameException, UnsupportedCharsetException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("US-ASCII"));
        String sourceStr = "Hello, World!";
        String result = codec.decode(sourceStr, Charset.forName("US-ASCII"));
        assertEquals(sourceStr, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_zeTq1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("US-ASCII"));
        String result = codec.decode(null, Charset.forName("US-ASCII"));
        assertEquals(null, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset_UTeo0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals("UTF-8", codec.getDefaultCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithCharset_WvVU1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        assertEquals("UTF-8", codec.getDefaultCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithCharsetAndStrict_ixZm2() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        assertEquals("UTF-8", codec.getDefaultCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithCharsetName_peAv3() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        assertEquals("UTF-8", codec.getDefaultCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharsetWithStrict_mhrG4() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals("UTF-8", codec.getDefaultCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_dLdj1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String encoded = codec.encode(null, StandardCharsets.UTF_8);
        System.out.println("encode(null, StandardCharsets.UTF_8) = " + encoded);
        assert encoded == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_HvnX1() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[] {1, 2, 3};
        Object result = codec.encode(bytes);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeString_RqHu2() throws EncoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String str = "Hello, World!";
        Object result = codec.encode(str);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeObject_tZCN3() throws EncoderException {
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
    public void testDecodeNull_QLcC0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = null;
        Object result = codec.decode(obj);
        assert result == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_xDHS1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[] {(byte) 0x61, (byte) 0x62, (byte) 0x63};
        Object obj = bytes;
        Object result = codec.decode(obj);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_WWdT2() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String str = "abc";
        Object obj = str;
        Object result = codec.decode(obj);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeUnknownType_DSWr3() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = new Object();
        try {
            Object result = codec.decode(obj);
            assert false;
        } catch (DecoderException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_unqC0() throws UnsupportedEncodingException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(StandardCharsets.UTF_8);
        byte[] bytes = "Hello, World!".getBytes("UTF-8");
        byte[] result = codec.encode(bytes);
        System.out.println(Arrays.toString(result));
        assert result.length > 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetStrict_pEkN0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals(codec.getCharset(), codec.getCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetDefault_fdXM1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals(codec.getCharset(), codec.getCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCharsetSpecificCharset_stSX2() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec("UTF-8");
        assertEquals(codec.getCharset(), codec.getCharset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNullBytes_qDZK0() {
    BitSet printable = new BitSet();
    byte[] bytes = null;
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableStrict_fhmr2() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[4];
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNotStrict_wHVM3() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[4];
    boolean strict = false;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableSingleByte_vQiX4() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[1];
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableMultipleBytes_NFVa5() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[10];
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNonPrintableByte_CcTy6() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[1];
    bytes[0] = (byte) 0x80;
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNonPrintableByteNotStrict_SFeO7() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[1];
    bytes[0] = (byte) 0x80;
    boolean strict = false;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableWhitespaceByte_oMuQ8() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[1];
    bytes[0] = (byte) 0x20;
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableWhitespaceByteNotStrict_tYlF9() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[1];
    bytes[0] = (byte) 0x20;
    boolean strict = false;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableMultipleNonPrintableBytes_dfRC10() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[10];
    for (int i = 0; i < 10; i++) {
        bytes[i] = (byte) 0x80;
    }
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableMultipleWhitespaceBytes_ASRG11() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[10];
    for (int i = 0; i < 10; i++) {
        bytes[i] = (byte) 0x20;
    }
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableMultipleNonPrintableAndWhitespaceBytes_LSuS12() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[10];
    for (int i = 0; i < 5; i++) {
        bytes[i] = (byte) 0x80;
    }
    for (int i = 5; i < 10; i++) {
        bytes[i] = (byte) 0x20;
    }
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNullBytes_iVIE0() {
    byte[] bytes = null;
    BitSet printable = new BitSet();
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNullPrintable_lcdu1() {
    byte[] bytes = new byte[0];
    BitSet printable = null;
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableEmptyBytes_oiyc2() {
    byte[] bytes = new byte[0];
    BitSet printable = new BitSet();
    boolean strict = true;
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableStrictPrintable_foVM0() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableStrictLongLine_ZwCA3() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableStrictShortLine_nntK4() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNonStrictPrintable_YLuU5() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintable_PrintableBytesWithWhitespace_NDva2() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 32};
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintable_PrintableBytesWithMultipleWhitespace_bngx4() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 32, 32, 32};
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNullPrintable_PNao1() {
    BitSet printable = null;
    byte[] bytes = new byte[1];
    boolean strict = true;
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
    assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableStrict_fbxG2() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[4];
    bytes[0] = 0x20;
    bytes[1] = 0x20;
    bytes[2] = 0x20;
    bytes[3] = 0x20;
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNotStrict_ojsM3() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[4];
    bytes[0] = 0x20;
    bytes[1] = 0x20;
    bytes[2] = 0x20;
    bytes[3] = 0x20;
    boolean strict = false;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableSingleByte_lvKH4() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[1];
    bytes[0] = 0x20;
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNotPrintableSingleByte_Nfhy8() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[1];
    bytes[0] = 0x7F;
    boolean strict = true;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNotPrintableNotStrictSingleByte_pUTe10() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[1];
    bytes[0] = 0x7F;
    boolean strict = false;
    byte[] result =QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCharsetSpecificCharsetStrict_zvep3_DaYH0() {
    QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
    assertEquals(Charset.forName("UTF-8"), codec.getCharset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableStrictWhitespace_LtwU2_QGTv0() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {(byte)32, (byte)128, (byte)129, (byte)130, (byte)131, (byte)132, (byte)133, (byte)134, (byte)135, (byte)136, (byte)137, (byte)138, (byte)139, (byte)140, (byte)141, (byte)142, (byte)143};
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableStrictNotPrintable_tjlh1_itBJ0() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {(byte)0x80, (byte)0x81, (byte)0x82, (byte)0x83, (byte)0x84, (byte)0x85, (byte)0x86, (byte)0x87, (byte)0x88, (byte)0x89, (byte)0x8a, (byte)0x8b, (byte)0x8c, (byte)0x8d, (byte)0x8e, (byte)0x8f};
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNonStrictNotPrintable_TVxE6_YVUd0() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {(byte)0x80, (byte)0x81, (byte)0x82, (byte)0x83, (byte)0x84, (byte)0x85, (byte)0x86, (byte)0x87, (byte)0x88, (byte)0x89, (byte)0x8a, (byte)0x8b, (byte)0x8c, (byte)0x8d, (byte)0x8e, (byte)0x8f};
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNonStrictWhitespace_bEdh7_mCIV0() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {(byte)32, (byte)128, (byte)129, (byte)130, (byte)131, (byte)132, (byte)133, (byte)134, (byte)135, (byte)136, (byte)137, (byte)138, (byte)139, (byte)140, (byte)141, (byte)142, (byte)143};
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintable_NonPrintableBytesWithWhitespace_TKZk3_TIhC0() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {(byte)128, (byte)129, (byte)130, (byte)131, (byte)132, (byte)133, (byte)134, (byte)135, (byte)136, (byte)137, (byte)138, (byte)139, (byte)140, (byte)141, (byte)142, (byte)143, (byte)32};
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintable_NonPrintableBytesWithMultipleWhitespace_MzCP5_yFLs0() {
    BitSet printable = new BitSet();
    printable.set(0, 128);
    byte[] bytes = new byte[] {(byte)128, (byte)129, (byte)130, (byte)131, (byte)132, (byte)133, (byte)134, (byte)135, (byte)136, (byte)137, (byte)138, (byte)139, (byte)140, (byte)141, (byte)142, (byte)143, (byte)32, (byte)32, (byte)32};
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_iYUE0_uaNL0() {
    QuotedPrintableCodec codec = new QuotedPrintableCodec();
    String sourceStr = "Hello World!";
    try {
        String result = codec.decode(sourceStr);
        assertEquals(sourceStr, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeWithCharset_Jijs1_ggQq0() {
    QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
    String sourceStr = "Hello World!";
    try {
        String result = codec.decode(sourceStr);
        assertEquals(sourceStr, result);
    } catch (DecoderException e) {
        fail("DecoderException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeQuotedPrintableNullInput_syEo0_htig0() {
    byte[] bytes = null;
    try {
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assert result == null;
    } catch (DecoderException e) {
        assert true;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeQuotedPrintableEmptyInput_lAml1_XZWG0() {
    byte[] bytes = new byte[0];
    try {
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assert result.length == 0;
    } catch (DecoderException e) {
        assert true;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecodeQuotedPrintableSingleByte_ohIr2_pTHn0() {
    byte[] bytes = new byte[] {(byte) 'a'};
    try {
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assert result.length == 1;
        assert result[0] == 'a';
    } catch (DecoderException e) {
        fail("DecoderException was thrown but not expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNotPrintable_Ecax6_KXZu0() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[4];
    bytes[0] = (byte)0x7F;
    bytes[1] = (byte)0x80;
    bytes[2] = (byte)0x81;
    bytes[3] = (byte)0x82;
    boolean strict = true;
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncodeQuotedPrintableNotPrintableNotStrict_ATQy7_XYzn0() {
    BitSet printable = new BitSet();
    byte[] bytes = new byte[4];
    bytes[0] = (byte)0x7F;
    bytes[1] = (byte)0x80;
    bytes[2] = (byte)0x81;
    bytes[3] = (byte)0x82; // fixed: bytes[3] = (byte)0x82;
    boolean strict = false;
    byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
}
}