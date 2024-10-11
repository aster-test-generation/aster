/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PercentCodec_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NegativeByte_ReturnsEncoded_pOKh5_VHZv0() {
        byte[] alwaysEncodeChars = {(byte) 0x80}; // Negative byte in two's complement
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = new byte[]{(byte) 0x80};
        byte[] expected = "%80".getBytes();
        try {
            assertArrayEquals(expected, codec.encode(input));
        } catch (EncoderException e) {
            fail("EncoderException should not be thrown");
        }
    }
}