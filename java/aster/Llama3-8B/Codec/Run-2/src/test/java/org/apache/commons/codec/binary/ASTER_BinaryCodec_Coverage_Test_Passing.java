/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import org.apache.commons.codec.DecoderException;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BinaryCodec_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_dCxc1() throws org.apache.commons.codec.DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] ascii = new byte[] {1, 2, 3};
        Object result = binaryCodec.decode(ascii);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharArray_qwyM2() throws org.apache.commons.codec.DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        char[] ascii = new char[] {'a', 'b', 'c'};
        Object result = binaryCodec.decode(ascii);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_bjqB3() throws org.apache.commons.codec.DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        String ascii = "abc";
        Object result = binaryCodec.decode(ascii);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonByteArray_xQdh4() throws org.apache.commons.codec.DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        Object ascii = new Object();
        assertThrows(DecoderException.class, () -> binaryCodec.decode(ascii));
}

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiEmptyArray_aaPw0() {
        byte[] ascii = new byte[0];
        byte[] result = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiLongAscii_oeiA3() {
        byte[] ascii = new byte[] {(byte) '1', (byte) '1', (byte) '1', (byte) '1', (byte) '1', (byte) '1', (byte) '1', (byte) '1'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[] {(byte) 0xFF};
        assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiLongAscii2_kAEQ4() {
        byte[] ascii = new byte[] {(byte) '0', (byte) '0', (byte) '0', (byte) '0', (byte) '0', (byte) '0', (byte) '0', (byte) '0'};
        byte[] result = BinaryCodec.fromAscii(ascii);
        byte[] expected = new byte[] {(byte) 0x00};
        assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNullAscii_rrMY0_AqTR0() {
    byte[] result = BinaryCodec.toAsciiBytes(null);
    assertArrayEquals(new byte[0], result);
}
}