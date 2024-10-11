/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ByteUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromLittleEndian2_AyUr1() {
        byte[] bytes = {1, 0, 0, 0, 0, 0, 0, 0};
        long result = ByteUtils.fromLittleEndian(bytes, 0, 8);
        assertEquals(1L, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFromLittleEndian_EVHX0() {
        byte[] bytes = new byte[]{0x01, 0x02, 0x03, 0x04};
        long expected = 0x04030201L;
        long actual = ByteUtils.fromLittleEndian(bytes);
        assertEquals(expected, actual);
    }
}