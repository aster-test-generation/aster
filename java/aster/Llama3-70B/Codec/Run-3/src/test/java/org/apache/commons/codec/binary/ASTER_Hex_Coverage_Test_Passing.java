/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Hex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDigit_ValidCharacter_ReturnsDigit_LLvu1() throws DecoderException {
        Hex hex = new Hex();
        char validChar = 'A';
        int index = 0;
        int digit = Hex.toDigit(validChar, index);
        assert digit == 10;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ByteBufferHasArray_Lmoj0() throws EncoderException {
        Hex hex = new Hex();
        ByteBuffer byteBuffer = ByteBuffer.wrap("Hello, World!".getBytes());
        byteBuffer.flip();
        Object result = hex.encode(byteBuffer);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ByteBufferReturnByteArray_axmv4_fid1() throws EncoderException {
        Hex hex = new Hex();
        ByteBuffer byteBuffer = ByteBuffer.wrap("Hello, World!".getBytes());
        byteBuffer.flip();
        Object result = hex.encode(byteBuffer);
        assertFalse(result instanceof String);
    }
}