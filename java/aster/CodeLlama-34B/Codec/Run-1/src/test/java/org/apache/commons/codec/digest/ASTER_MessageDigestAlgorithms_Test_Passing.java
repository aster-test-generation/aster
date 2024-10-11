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

public class Aster_MessageDigestAlgorithms_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_1() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals(13, algorithms.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_2() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("MD2", algorithms[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_3() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("MD5", algorithms[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_4() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("SHA-1", algorithms[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_5() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("SHA-224", algorithms[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_6() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("SHA-256", algorithms[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_7() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("SHA-384", algorithms[5]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_8() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("SHA-512", algorithms[6]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_9() {
        String[] algorithms = MessageDigestAlgorithms.values();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_11() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("SHA3-224", algorithms[9]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_12() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("SHA3-256", algorithms[10]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_13() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("SHA3-384", algorithms[11]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_PxIw0_14() {
        String[] algorithms = MessageDigestAlgorithms.values();
        assertEquals("SHA3-512", algorithms[12]);
    }
}