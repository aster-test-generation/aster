/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_MurmurHash2_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_emCj0() {
        assertEquals(781338482, MurmurHash2.hash32("HelloWorld", 0, 5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_TByi0() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = 10;
        int seed = 123;
        int expected = -1455830328;
        int result = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithLessThan4Bytes_NVnR1() {
        byte[] data = new byte[]{1, 2, 3};
        int length = 3;
        int seed = 123;
        int expected = -487879967;
        int result = MurmurHash2.hash32(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_wCom0() {
        assertEquals(5303375672989825947L, MurmurHash2.hash64("test"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_QhbO0() {
        byte[] data = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        long result = MurmurHash2.hash64(data, data.length, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithLessThan8Bytes_XQDU1() {
        byte[] data = new byte[]{1, 2, 3, 4};
        long result = MurmurHash2.hash64(data, data.length, 0);
        Assertions.assertEquals(result, -550284462255016424L);
    }
}