/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_MurmurHash3_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_withNullString_SSKA1_XyTG0() {
        byte[] data = null;
        int expected = -965378730; // expected hash value for null string
        int actual = MurmurHash3.hash32(data, -965378730);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_withNullString_SSKA1_XyTG0_fid3() {
        byte[] data = null;
        int expected = 0; // expected hash value for null string
        int actual = MurmurHash3.hash32(data, 0);
        assertEquals(expected, actual);
    }
}