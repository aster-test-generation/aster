/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Hex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_SpGr0() throws DecoderException {
        Hex hex = new Hex();
        byte[] array = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05};
        byte[] expected = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05};
        byte[] actual = hex.decode(array);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_WeuL0() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        String input = "68656c6c6f20776f726c64";
        Object output = hex.decode(input);
        Assertions.assertEquals("hello world", output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteArray_VdRt1() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        byte[] input = new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64};
        Object output = hex.decode(input);
        Assertions.assertEquals("hello world", output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeByteBuffer_vhgk2() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        ByteBuffer input = ByteBuffer.wrap(new byte[]{0x68, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x77, 0x6f, 0x72, 0x6c, 0x64});
        Object output = hex.decode(input);
        Assertions.assertEquals("hello world", output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeCharArray_jQzx3() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        Object output = hex.decode(input);
        Assertions.assertEquals("hello world", output);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecodeString_WeuL0_fid1() throws org.apache.commons.codec.DecoderException {
        Hex hex = new Hex();
        String input = "68656c6c6f20776f726c64";
        Object output = hex.decode(input);
        Assertions.assertEquals("[104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100]", output);
    }
}