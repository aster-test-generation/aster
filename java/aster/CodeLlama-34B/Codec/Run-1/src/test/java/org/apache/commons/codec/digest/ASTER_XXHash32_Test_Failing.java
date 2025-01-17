/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_XXHash32_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_NegativeLength_bEey3() {
        XXHash32 hash = new XXHash32(1234);
        try {
            hash.update(new byte[0], 0, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_LengthGreaterThanArrayLength_CMqY4() {
        XXHash32 hash = new XXHash32(1234);
        try {
            hash.update(new byte[0], 0, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_NegativeOffset_eESA6() {
        XXHash32 hash = new XXHash32(1234);
        try {
            hash.update(new byte[0], -1, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_OffsetGreaterThanArrayLength_HVVr7() {
        XXHash32 hash = new XXHash32(1234);
        try {
            hash.update(new byte[0], 1, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue1_LwAY0_bfhK0() {
        XXHash32 hash = new XXHash32(1234);
        long hashValue = hash.getValue();
        assertEquals(1234L, hashValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue2_THEE1_Qdnb0() {
        XXHash32 hash = new XXHash32();
        long hashValue = hash.getValue();
        assertEquals(0L, hashValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_NegativeLength_bEey3_fid2() {
        XXHash32 hash = new XXHash32(1234);
        try {
            hash.update(new byte[0], 0, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Expected IllegalArgumentException", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_OffsetGreaterThanArrayLength_HVVr7_fid2() {
        XXHash32 hash = new XXHash32(1234);
        try {
            hash.update(new byte[1], 1, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
}