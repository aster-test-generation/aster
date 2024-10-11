/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_QuotedPrintableCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_RNdA0() {
        BitSet printable = new BitSet();
        byte[] bytes = new byte[]{(byte) 0x61, (byte) 0x62, (byte) 0x63};
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes);
        assert result.length == 6;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeInvalidType_LVew3() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        Object obj = codec.decode(new Integer(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableNullPrintable_Zddv1() {
        BitSet printable = null;
        byte[] bytes = new byte[1];
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_PrintableBytes_TsLi0() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{0};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result.length == 1;
        assert result[0] == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_NotPrintableBytes_HHJc1() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{1};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result != null;
        assert result.length == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_NotPrintableBytesNotStrict_tmST3() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{1};
        boolean strict = false;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result.length == 3;
        assert result[0] == 0;
        assert result[1] == 0;
        assert result[2] == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_NotPrintableBytesLong_Gqoo5() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{1, 1, 1, 1, 1};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result.length == 14;
        assert result[0] == 0;
        assert result[1] == 0;
        assert result[2] == 0;
        assert result[3] == 0;
        assert result[4] == 0;
        assert result[5] == 0;
        assert result[6] == 0;
        assert result[7] == 0;
        assert result[8] == 0;
        assert result[9] == 0;
        assert result[10] == 0;
        assert result[11] == 0;
        assert result[12] == 0;
        assert result[13] == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintableInvalidEscapeWithCR_zHOJ6_dQku0() {
        byte[] bytes = new byte[]{(byte) '=', (byte) 13, (byte) 'a'};
        try {
            QuotedPrintableCodec.decodeQuotedPrintable(bytes);
            assert false;
        } catch (DecoderException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_NotPrintableBytes_HHJc1_fid1() {
        BitSet printable = new BitSet();
        printable.set(0);
        byte[] bytes = new byte[]{1};
        boolean strict = true;
        byte[] result = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, strict);
        assert result.length == 4;
        assert result[0] == 0;
        assert result[1] == 0;
        assert result[2] == 0;
        assert result[3] == 0;
    }
}