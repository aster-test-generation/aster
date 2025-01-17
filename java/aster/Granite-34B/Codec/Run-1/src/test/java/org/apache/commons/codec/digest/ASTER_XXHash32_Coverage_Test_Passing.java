/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_XXHash32_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest1_aCKz0() {
        XXHash32 obj = new XXHash32(0);
        obj.update(new byte[0], 0, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest2_pLBq1() {
        XXHash32 obj = new XXHash32(0);
        obj.update(new byte[100], 0, 100);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest3_xLPh2() {
        XXHash32 obj = new XXHash32(0);
        obj.update(new byte[1000], 0, 1000);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest4_QtUf3() {
        XXHash32 obj = new XXHash32(0);
        obj.update(new byte[10000], 0, 10000);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest5_aTMN4() {
        XXHash32 obj = new XXHash32(0);
        obj.update(new byte[100000], 0, 100000);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest1_ePBx0() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 0, 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest2_cVra1() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 0, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest3_koCz2() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 0, 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest4_cFeJ3() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 0, 2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest5_ZfSU4() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 0, 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest6_TXkW5() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 0, 4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void updateTest7_MPoZ6() {
        XXHash32 obj = new XXHash32(1);
        obj.update(new byte[]{1, 2, 3, 4, 5}, 1, 4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate1_NpYT0() {
        XXHash32 xxHash32 = new XXHash32();
        byte[] b = new byte[10];
        int off = 0;
        int len = 10;
        xxHash32.update(b, off, len);
    }
}