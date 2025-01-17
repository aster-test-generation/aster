/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_XXHash32_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithEmptyArray_wcUN0() {
        byte[] b = {};
        XXHash32 hash = new XXHash32();
        hash.update(b, 0, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithSmallArray_LqPN1() {
        byte[] b = {1, 2, 3};
        XXHash32 hash = new XXHash32();
        hash.update(b, 0, 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithLargeArray_aUXu2() {
        byte[] b = new byte[1000];
        for (int i = 0; i < 1000; i++) {
            b[i] = (byte) i;
        }
        XXHash32 hash = new XXHash32();
        hash.update(b, 0, 1000);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithNegativeLength_dwTh4() {
        byte[] b = {1, 2, 3};
        XXHash32 hash = new XXHash32();
        hash.update(b, 0, -1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_dUCa0() {
        XXHash32 hash = new XXHash32(0);
        hash.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetWithNoArgConstructor_VZTN1() {
        XXHash32 hash = new XXHash32();
        hash.reset();
    }
}