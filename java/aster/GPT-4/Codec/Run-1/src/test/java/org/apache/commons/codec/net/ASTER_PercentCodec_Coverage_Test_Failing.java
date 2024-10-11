/**
 * Generated by Aster
 */
package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PercentCodec_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_withNonAsciiAndAlwaysEncodeChars_Pnem0() throws EncoderException {
        byte[] alwaysEncodeChars = new byte[256];
        alwaysEncodeChars[97] = 1; // setting 'a' to be always encoded
        PercentCodec codec = new PercentCodec(alwaysEncodeChars, false);
        byte[] input = new byte[]{97, 98, 99}; // 'abc'
        byte[] expectedOutput = new byte[]{'%', '6', '1', 98, 99}; // '%61bc' where 'a' is encoded as '%61'
        byte[] result = codec.encode(input);
        assertArrayEquals(expectedOutput, result);
    }
}