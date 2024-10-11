/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BinaryCodec_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsciiConversion_gpRE2() {
        char[] ascii = new char[]{'1', '0', '1', '0', '1', '0', '1', '0'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[] {(byte) 0x7F};
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_LjVp0() throws EncoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] raw = new byte[] {1, 2, 3};
        Object result = binaryCodec.encode(raw);
        assertEquals("123", result.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_KDRi0() throws org.apache.commons.codec.DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        Object result = binaryCodec.decode(null);
        assertEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyString_iZJi8() throws org.apache.commons.codec.DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        String ascii = "";
        Object result = binaryCodec.decode(ascii);
        assertEquals(new byte[0], result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiSingleByte_UzaX1() {
        byte[] ascii = new byte[] {(byte) '1'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[] {(byte) 0x80};
        assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiMultipleBytes_EKop2() {
        byte[] ascii = new byte[] {(byte) '1', (byte) '0', (byte) '1', (byte) '0'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[] {(byte) 0x80, (byte) 0x40};
        assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiLongAscii3_gINW5() {
        byte[] ascii = new byte[] {(byte) '1', (byte) '0', (byte) '1', (byte) '0', (byte) '1', (byte) '0', (byte) '1', (byte) '0'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[] {(byte) 0x7F};
        assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_LjVp0_fid1() throws EncoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] raw = new byte[] {1, 2, 3};
        Object result = binaryCodec.encode(raw);
        assertEquals("[B@415e8786", result.toString());
}
}