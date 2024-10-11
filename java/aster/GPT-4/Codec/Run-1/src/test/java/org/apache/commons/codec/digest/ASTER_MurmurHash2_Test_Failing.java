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

public class Aster_MurmurHash2_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithEmptyData_ieaX0() {
        byte[] data = new byte[0];
        int length = 0;
        long expectedHash = 0xe17a1465L;
        long result = MurmurHash2.hash64(data, length);
        assertEquals(expectedHash, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_BcdS0() {
        byte[] data = new byte[0];
        int length = 0;
        long expectedHash = 0x9747b28cL;
        long result = MurmurHash2.hash64(data, length, 0);
        assertEquals(expectedHash, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_EmptyData_oFoo0() {
        byte[] data = new byte[0];
        int length = 0;
        int seed = 1234;
        long expected = 0xe17a1465; // Expected value might need to be adjusted based on M64 and R64 values
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64_SingleByte_yuaI1() {
        byte[] data = new byte[]{0x01};
        int length = 1;
        int seed = 1234;
        long expected = 0x5f1d36f1; // Expected value might need to be adjusted based on M64 and R64 values
        long result = MurmurHash2.hash64(data, length, seed);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_vnjG0_fid2() {
        byte[] data = new byte[0];
        int seed = 123;
        int result = MurmurHash2.hash32(data, data.length, seed);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_BcdS0_fid2() {
        byte[] data = new byte[0];
        int length = 0;
        int expectedHash = 0x9747b28c;
        int result = MurmurHash2.hash32(data, length);
        assertEquals(expectedHash, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash64WithEmptyString_exLm0_fid2() {
        String input = "";
        long expectedHash = 0L; // Expected hash for an empty string, assuming hash64 would return 0 for empty input
        long resultHash = MurmurHash2.hash64(input);
        assertEquals(expectedHash, resultHash);
    }
}