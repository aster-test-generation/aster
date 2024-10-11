/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BinaryCodec_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiEmptyInput_RfqP1() {
        byte[] result = BinaryCodec.fromAscii(new char[0]);
        byte[] expected = new byte[0];
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiValidInput_MnfG2() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArray_VMot0() throws EncoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] byteArray = new byte[]{1, 2, 3};
        Object result = binaryCodec.encode(byteArray);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteArrayWithAsciiChars_eCNQ2() throws EncoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] byteArray = new byte[]{(byte) 'a', (byte) 'b', (byte) 'c'};
        Object result = binaryCodec.encode(byteArray);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_vqLk1() throws DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] ascii = new byte[]{1, 2, 3};
        Object result = binaryCodec.decode(ascii);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharArray_AtfE2() throws DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        char[] ascii = new char[]{'a', 'b', 'c'};
        Object result = binaryCodec.decode(ascii);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_fkCg3() throws DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        String ascii = "abc";
        Object result = binaryCodec.decode(ascii);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonByteArray_XXiI4() throws org.apache.commons.codec.DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        Object ascii = new Integer(1);
        assertThrows(DecoderException.class, () -> binaryCodec.decode(ascii));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNonObject_ttyb7() throws org.apache.commons.codec.DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        assertThrows(DecoderException.class, () -> binaryCodec.decode(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeNull_aknB0_TaKb0() throws DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] result = binaryCodec.toAsciiBytes(null);
        assertArrayEquals(new byte[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromAsciiNullInput_jmJx0_ZjcC0() {
        byte[] result = BinaryCodec.toAsciiBytes(null);
        byte[] expected = new byte[0];
        assertArrayEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeEmptyByteArray_wobj8_gJDf0() throws DecoderException {
        BinaryCodec binaryCodec = new BinaryCodec();
        byte[] ascii = new byte[0];
        byte[] result = binaryCodec.toAsciiBytes(ascii);
        assertArrayEquals(new byte[0], result);
    }
}