/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_DigestUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha_kDms0() {
        byte[] data = new byte[0];
        byte[] expected = new byte[0];
        byte[] actual = DigestUtils.sha(data);
        assertArrayEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testShaHex_PRxV0_fid2() {
        DigestUtils digestUtils = new DigestUtils("SHA-1");
        String result = digestUtils.shaHex(new byte[]{1, 2, 3});
        assertEquals("356a192b7913b04c54574d18c28d46e6395428ab", result);
    }
}