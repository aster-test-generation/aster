/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuotedPrintableCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithByteArray_TCSK1() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        byte[] obj = new byte[10];
        Object actual = qp.decode(obj);
        Assertions.assertEquals(null, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_oTDx2() throws org.apache.commons.codec.DecoderException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        String obj = "test";
        Object actual = qp.decode(obj);
        Assertions.assertEquals(null, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNegativeValue_JzyI0() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{-128, -127};
        byte[] encodedBytes = codec.encodeQuotedPrintable(null, bytes, false);
        assertNotEquals(null, encodedBytes);
        assertTrue(Arrays.equals(new byte[]{61, 49, 61, 48, 61, 61, 61, 61}, encodedBytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNegativeValue_JzyI0_2_fid2() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{-128, -127};
        byte[] encodedBytes = codec.encodeQuotedPrintable(null, bytes, false);
        assertTrue(Arrays.equals(new byte[]{61, 49, 61, 48, 61, 61, 61, 61}, encodedBytes));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithTab_qxFp0_JpKX0() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[]{'\t'};
        boolean strict = true;
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        byte[] expected = new byte[]{'\t'};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithSpace_BkBx1_flho0() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[]{' '};
        boolean strict = true;
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        byte[] expected = new byte[]{' '};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithControlChar_CtRt2_FUEE0() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[]{0};
        boolean strict = true;
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        byte[] expected = new byte[]{0};
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithPositiveValue_kXjf1_RMyv0_2() {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{-128, 127};
        byte[] encodedBytes = codec.encodeQuotedPrintable(null, bytes, false);
        assertTrue(Arrays.equals(new byte[]{61, 50, 61, 48, 61, 61, 61, 61}, encodedBytes));
    }
}