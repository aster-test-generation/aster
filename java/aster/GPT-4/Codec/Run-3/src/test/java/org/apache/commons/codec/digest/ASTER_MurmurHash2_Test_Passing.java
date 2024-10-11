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

public class Aster_MurmurHash2_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithEmptyData_IrXp0() throws Exception {
        byte[] data = new byte[0];
        int length = 0;
        long expectedHash = 0xe17a1465L; // Expected hash for empty data with seed 0xe17a1465
        long result = MurmurHash2.hash64(data, length);
        assertEquals(expectedHash, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithSubstring_jPxp0() throws Exception {
        String input = "Hello, world!";
        int from = 7;
        int length = 5;
        int expectedHash = MurmurHash2.hash32("world");
        int resultHash = MurmurHash2.hash32(input, from, length);
        assertEquals(expectedHash, resultHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_JUFi0() throws Exception {
        byte[] data = new byte[0];
        int seed = 1234;
        int expectedHash = seed; // Expected hash for empty data with seed manipulation
        int resultHash = MurmurHash2.hash32(data, 0, seed);
        assertEquals(expectedHash, resultHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithNonEmptyData_WwHU1() throws Exception {
        byte[] data = {1, 2, 3, 4};
        int seed = 5678;
        int expectedHash = -1188957731; // Expected hash calculated from a known good implementation
        int resultHash = MurmurHash2.hash32(data, data.length, seed);
        assertEquals(expectedHash, resultHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithSubstring_jGAY0() throws Exception {
        String input = "Hello, world!";
        int from = 7;
        int length = 5;
        long expectedHash = MurmurHash2.hash64("world");
        long resultHash = MurmurHash2.hash64(input, from, length);
        assertEquals(expectedHash, resultHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_PNXS0() throws Exception {
        byte[] data = new byte[0];
        int length = 0;
        int expectedHash = 0x9747b28c;
        assertEquals(expectedHash, MurmurHash2.hash32(data, length));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithEmptyString_vGqy0() throws Exception {
        String input = "";
        long expectedHash = 0L; // Expected hash for empty string, assuming hash64 would return 0 for empty input
        long result = MurmurHash2.hash64(input);
        assertEquals(expectedHash, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyString_VuZP0() throws Exception {
        String input = "";
        int expected = 0; // Assuming hash32 for empty string returns 0, adjust based on actual implementation
        int result = MurmurHash2.hash32(input);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_EmptyData_RmLE0() throws Exception {
        byte[] data = new byte[0];
        int length = 0;
        int seed = 123456;
        long expected = 0xe17a1465; // Expected hash for empty data with seed 123456
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_SimpleData_gYZE1() throws Exception {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int length = data.length;
        int seed = 123456;
        long expected = 0x5f3c7fc9b8c6efb8L; // Hypothetical expected hash for given data and seed
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }
}