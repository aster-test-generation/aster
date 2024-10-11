/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Hex_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeByteBufferFullArray_Tqmh0_bVxg0() throws EncoderException {
        Hex hexEncoder = new Hex(StandardCharsets.UTF_8);
        byte[] expected = {0x01, 0x02, 0x03, 0x04};
        ByteBuffer buffer = ByteBuffer.wrap(expected);
        Object result = hexEncoder.encode(buffer);
        assertArrayEquals(expected, (byte[]) result, "Expected hexadecimal encoding of the full array");
    }
}