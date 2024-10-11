/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PureJavaCrc32C_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueInitialValue_noew0() throws Exception {
        PureJavaCrc32C crc32C = new PureJavaCrc32C();
        long expected = 0xFFFFFFFFL; // Expected value when crc is initialized to 0 (common initial value)
        assertEquals(expected, crc32C.getValue());
    }
}