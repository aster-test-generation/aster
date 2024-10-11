/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_XXHash32_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_multipleCalls_sPod5_vhFH0() {
        XXHash32 xxHash32 = new XXHash32();
        xxHash32.update(new byte[10], 0, 5);
        xxHash32.update(new byte[10], 0, 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_LimitReached_ICGw2_orOU0() {
        XXHash32 xxHash32 = new XXHash32(123);
        xxHash32.update(1);
        xxHash32.update(2);
        xxHash32.update(3);
        xxHash32.update(4);
        long result = xxHash32.getValue();
        assertNotEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_VtZd0_sWtl0_fid2() {
        XXHash32 xxHash32 = new XXHash32(1);
        byte[] oneByte = new byte[1];
        xxHash32.update(0);
        xxHash32.update(oneByte, 0, 1);
        assertEquals(0, oneByte[0] & 0xff);
    }
}