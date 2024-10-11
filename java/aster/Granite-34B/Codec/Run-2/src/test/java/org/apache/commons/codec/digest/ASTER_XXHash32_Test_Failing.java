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

public class Aster_XXHash32_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateInt_Ydyi0() {
        XXHash32 xxHash32 = new XXHash32(0);
        xxHash32.update(0);
        assertEquals(0, xxHash32.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateByteArrayIntInt_tltZ1() {
        XXHash32 xxHash32 = new XXHash32();
        xxHash32.update(new byte[0], 0, 0);
        assertEquals(0, xxHash32.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithNegativeOffset_Gyxm3() {
        byte[] b = {1, 2, 3};
        XXHash32 hash = new XXHash32();
        hash.update(b, -1, 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateWithInvalidOffsetAndLength_jBTN5() {
        byte[] b = {1, 2, 3};
        XXHash32 hash = new XXHash32();
        hash.update(b, 10, 10);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateByteArrayIntInt_tltZ1_fid2() {
        XXHash32 xxHash32 = new XXHash32();
        xxHash32.update(new byte[0], 46947589, 46947589);
        assertEquals(0, xxHash32.getValue());
    }
}