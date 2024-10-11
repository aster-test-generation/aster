/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PureJavaCrc32_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithZeroInput_emkT0_ZCbZ0() {
        PureJavaCrc32 crc32 = new PureJavaCrc32();
        byte[] input = new byte[0];
        crc32.update(input, 0, 0);
    }
}