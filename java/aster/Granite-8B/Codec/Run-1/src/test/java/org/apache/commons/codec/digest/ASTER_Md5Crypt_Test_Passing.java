/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Md5Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt11_iMhV10() {
        byte[] keyBytes = new byte[]{31, 32, 33};
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBranchCoverage_IgEI2() {
        byte[] keyBytes = new byte[16];
        String actual = Md5Crypt.md5Crypt(keyBytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_1_GGUB0() {
        byte[] keyBytes = new byte[]{1, 2, 3};
        String salt = "abc";
        String expected = "$apr1$abc$eE4gcRWZFaKSLdUU4ZWPh.";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_2_WHfD1() {
        byte[] keyBytes = new byte[]{4, 5, 6};
        String salt = "def";
        String expected = "$apr1$def$WaOufiIZ3UN/rb7.3vSHQ1";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_3_PnLN2() {
        byte[] keyBytes = new byte[]{7, 8, 9};
        String salt = "ghi";
        String expected = "$apr1$ghi$4LqmMqVlQ.dO9djA8KOa6/";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_YGrl0() {
        byte[] keyBytes = new byte[10];
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_iAtx0() {
        String keyBytes = "Hello, World!";
        String salt = "randomSalt";
        String expected = "$apr1$randomSa$nSrGzYlvi4ZP3EaY980Bb/";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }
}