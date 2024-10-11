/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_QuotedPrintableCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable5_OOrl4() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32, 32, 61, 10}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable8_ipAn7() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32, 32, 32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32, 32, 32, 32, 32, '=', '\r', '\n'}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable9_TQBq8() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32, 32, 32, 32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32, 32, 32, 32, 32, 32, '=', '\r', '\n'}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable1_hFJw0() {
        BitSet printable = new BitSet();
        printable.set(32, 127);
        byte[] bytes = new byte[]{1, 2, 3};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{61, 49, 61, 50, 61, 51, 10}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable2_qrzT1() {
        BitSet printable = new BitSet();
        printable.set(32, 127);
        byte[] bytes = new byte[]{1, 2, 3};
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{61, 49, 61, 50, 61, 51, 10}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset1_OTvH0_fid1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        assertEquals("ISO-8859-1", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultCharset2_dOGo1_fid1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        assertEquals("ISO-8859-1", codec.getDefaultCharset());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable2_TOIC1() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable3_DHUi2() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable4_qSvV3_fid1() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable5_OOrl4_fid1() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32, 32}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable6_nLZp5_fid1() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32, 32, 32}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable7_xDRa6_fid1() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32, 32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32, 32, 32, 32}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable8_ipAn7_fid1() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32, 32, 32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32, 32, 32, 32, 32}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable9_TQBq8_fid1() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32, 32, 32, 32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32, 32, 32, 32, 32, 32}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable10_wHgV9_fid1() {
        BitSet printable = new BitSet();
        printable.set(32);
        byte[] bytes = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable5_LtVZ4_fid1() {
        BitSet printable = new BitSet();
        printable.set(32, 127);
        byte[] bytes = new byte[]{1, 2, 3};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{61, 30, 61, 32, 61, 33}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable6_kTYw5_fid1() {
        BitSet printable = new BitSet();
        printable.set(32, 127);
        byte[] bytes = new byte[]{1, 2, 3};
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{61, 30, 61, 32, 61, 33}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable1_hFJw0_fid1() {
        BitSet printable = new BitSet();
        printable.set(32, 127);
        byte[] bytes = new byte[]{1, 2, 3};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{1, 2, 3}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable2_qrzT1_fid1() {
        BitSet printable = new BitSet();
        printable.set(32, 127);
        byte[] bytes = new byte[]{1, 2, 3};
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertArrayEquals(new byte[]{1, 2, 3}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable2_Ctbq1_fid1() {
        BitSet printable = new BitSet();
        printable.set(0, 256);
        byte[] bytes = new byte[]{1};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable7_OkQJ6_fid1() {
        BitSet printable = new BitSet();
        printable.set(0, 256);
        byte[] bytes = new byte[]{1, 2, 3, 4};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assertEquals(7, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_TPlQ0_DKUP0_fid1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        try {
            String result = codec.encode("sourceStr", "UTF-8"); // changed decode to encode and added charset
            assertEquals("decodedStr", result);
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeStrict_NDqJ1_Pmut0_fid1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(true);
        try {
            String result = codec.encode("sourceStr", "UTF-8");
            assertEquals("decodedStr", result);
        } catch (UnsupportedEncodingException e) {
            fail("UnsupportedEncodingException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharset_zEAZ2_TCkj0_fid1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"));
        try {
            String result = codec.encode("sourceStr", "UTF-8");
            assertEquals("decodedStr", result);
        } catch (UnsupportedEncodingException e) {
            fail("UnsupportedEncodingException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharsetStrict_RRCE3_OLjJ0_fid1() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        try {
            String result = codec.encode("sourceStr", "UTF-8");
            assertEquals("decodedStr", result);
        } catch (UnsupportedEncodingException e) {
            fail("UnsupportedEncodingException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_QhzQ0_xpaB0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = "SGVsbG8gd29ybGQh".getBytes();
        byte[] result = new byte[0];
        try {
            result = codec.decode(bytes);
        } catch (DecoderException e) {
            fail("DecoderException was thrown");
        }
        assertArrayEquals("Hello world!".getBytes(), result);
    }
}