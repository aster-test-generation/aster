/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Hex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ByteBufferHasArray_FFaN0() throws EncoderException {
        Hex hex = new Hex();
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[]{1, 2, 3});
        byteBuffer.flip();
        Object result = hex.encode(byteBuffer);
        assertArrayEquals(new byte[]{1, 2, 3}, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ByteBufferRemainingEqualsLength_PrLB1() throws EncoderException {
        Hex hex = new Hex();
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[]{1, 2, 3});
        byteBuffer.limit(3);
        Object result = hex.encode(byteBuffer);
        assertArrayEquals(new byte[]{1, 2, 3}, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ByteBufferCreateNewArray_ggLt2() throws EncoderException {
        Hex hex = new Hex();
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byteBuffer.put(new byte[]{1, 2, 3});
        byteBuffer.flip();
        Object result = hex.encode(byteBuffer);
        assertArrayEquals(new byte[]{1, 2, 3}, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_String_HYcf0() throws DecoderException {
        Hex hex = new Hex();
        String input = "48656c6c6f";
        char[] expected = input.toCharArray();
        Object result = hex.decode(input);
        assertArrayEquals(expected, (char[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_String_toCharArray_jPRa1() throws DecoderException {
        Hex hex = new Hex();
        String input = "48656c6c6f";
        char[] expected = input.toCharArray();
        Object result = hex.decode(input.toCharArray());
        assertArrayEquals(expected, (char[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_byteArray_SFzK2() throws DecoderException {
        Hex hex = new Hex();
        byte[] input = "Hello".getBytes();
        byte[] expected = "48656c6c6f".getBytes();
        Object result = hex.decode(input);
        assertArrayEquals(expected, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_ByteBuffer_wQtg3() throws DecoderException {
        Hex hex = new Hex();
        ByteBuffer input = ByteBuffer.wrap("Hello".getBytes());
        byte[] expected = "48656c6c6f".getBytes();
        Object result = hex.decode(input);
        assertArrayEquals(expected, (byte[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_charArray_mmtB4() throws DecoderException {
        Hex hex = new Hex();
        char[] input = "48656c6c6f".toCharArray();
        char[] expected = input;
        Object result = hex.decode(input);
        assertArrayEquals(expected, (char[]) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_ClassCastException_ftNw5_ITqM0() throws DecoderException {
        Hex hex = new Hex();
        byte[] input = new byte[0]; // Initialize with an empty byte array
        try {
            hex.decode(input);
            assert false; // Should not reach this point
        } catch (DecoderException e) {
        }
    }
}