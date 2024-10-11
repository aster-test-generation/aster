/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_QuotedPrintableCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithPositiveByte_pQEo1() {
        byte[] bytes = new byte[]{1};
        byte[] expected = new byte[]{1};
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(null, bytes, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_fWaw2() throws EncoderException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        Object obj = "Hello World";
        Object actual = qp.encode(obj);
        Object expected = "Hello World";
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithString_fWaw2_fid1() throws EncoderException {
        QuotedPrintableCodec qp = new QuotedPrintableCodec();
        Object obj = "not equal";
        Object actual = qp.encode(obj);
        Object expected = "not equal";
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeQuotedPrintableWithNegativeByte_xdNT0_ReIg0() {
        byte[] bytes = new byte[]{-1};
        byte[] expected = new byte[]{(byte) 255};
        byte[] actual = QuotedPrintableCodec.encodeQuotedPrintable(null, bytes, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithString_MYYh2_rUfd0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec();
        String input = "hello";
        Object result = codec.decode(input);
        byte[] expected = {0x68, 0x65, 0x6C, 0x6C, 0x6F};
        assertArrayEquals(expected, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeWithStrictCharset_xItv4_Wvxq0() throws DecoderException {
        QuotedPrintableCodec codec = new QuotedPrintableCodec(Charset.forName("UTF-8"), true);
        String input = "hello";
        Object result = codec.decode(input);
        byte[] expected = {0x48, 0x65, 0x6C, 0x6C, 0x6F};
        assertArrayEquals(expected, (byte[]) result);
    }
}