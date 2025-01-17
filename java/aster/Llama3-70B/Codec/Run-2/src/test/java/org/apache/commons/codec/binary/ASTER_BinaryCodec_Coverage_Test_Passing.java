/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BinaryCodec_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiEmptyInput_AGzT1() {
        byte[] expected = new byte[0];
        char[] ascii = new char[0];
        byte[] actual = BinaryCodec.fromAscii(ascii);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ByteArray_gsCl0() throws EncoderException {
        BinaryCodec codec = new BinaryCodec();
        byte[] raw = new byte[]{1, 2, 3};
        Object result = codec.encode(raw);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_CNEY0() throws DecoderException {
        BinaryCodec codec = new BinaryCodec();
        assertArrayEquals(new byte[0], codec.decode(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_ToAsciiChars_JFbR2_pWpG0_1() throws EncoderException {
    BinaryCodec codec = new BinaryCodec();
    byte[] raw = new byte[]{1, 2, 3};
    byte[] asciiBytes = BinaryCodec.toAsciiBytes(raw);
    String asciiString = new String(asciiBytes);
    assertNotNull(asciiBytes);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEncode_ToAsciiChars_JFbR2_pWpG0_2() throws EncoderException {
    BinaryCodec codec = new BinaryCodec();
    byte[] raw = new byte[]{1, 2, 3};
    byte[] asciiBytes = BinaryCodec.toAsciiBytes(raw);
    String asciiString = new String(asciiBytes);
    assertNotNull(asciiString);}
}