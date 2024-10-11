/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuotedPrintableCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable_Continue_MPaK1_1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{(byte) '=', (byte) '\r', (byte) 'A', (byte) 'B'};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assertEquals(1, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable_Continue_MPaK1_2() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{(byte) '=', (byte) '\r', (byte) 'A', (byte) 'B'};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assertEquals('B', result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintable_Whitespace_ofVL0() throws Exception {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{(byte) ' ', (byte) '\t'};
        BitSet printable = new BitSet();
        printable.set(0, 256);
        printable.clear((byte) ' ');
        printable.clear((byte) '\t');
        byte[] expected = new byte[]{(byte) '=', (byte) '2', (byte) '0', (byte) '=', (byte) '1', (byte) '1', (byte) '=', (byte) '0', (byte) 'D'};
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(printable, bytes, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable_CR_BjhB0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{(byte) '=', (byte) '\r', (byte) 'A'};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assertEquals(0, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeQuotedPrintable_Continue_MPaK1() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        byte[] bytes = new byte[]{(byte) '=', (byte) '\r', (byte) 'A', (byte) 'B'};
        byte[] result = QuotedPrintableCodec.decodeQuotedPrintable(bytes);
        assertEquals(1, result.length);
        assertEquals('B', result[0]);
    }
}