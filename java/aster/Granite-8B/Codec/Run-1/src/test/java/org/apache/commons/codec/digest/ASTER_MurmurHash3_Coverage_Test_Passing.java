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

public class Aster_MurmurHash3_Coverage_Test_Passing {
    private static final int DEFAULT_SEED = 0;

    {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithEmptyData_Vdnq0_fid1() {
        String data = "";
        int expected = -965378730;
        int actual = MurmurHash3.hash32(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32WithRandomData_nIEv1_fid1() {
        String data = "random data";
        int expected = -20930122;
        int actual = MurmurHash3.hash32(data);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHash32_cvYO0_fid1() {
        final byte[] data = new byte[10];
        final int length = 10;
        final int expected = -1127693702;
        final int actual = MurmurHash3.hash32(data, length);
        assertEquals(expected, actual);
    }
}