/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Md5Crypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_CcYQ0() {
        String keyBytes = "password";
        String expected = "$apr1$lSiOIqSv$nA.DsKWjNnUsYukdgsJoE.";
        String actual = Md5Crypt.apr1Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_dJcR0() {
        byte[] keyBytes = new byte[16];
        String salt = "randomSalt";
        String expected = "5d41402abc4b2a76b9719d911017c592";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_gyPE0() {
        final byte[] keyBytes = new byte[]{1, 2, 3};
        final String salt = "salt";
        final String prefix = "prefix";
        final String expected = "md5CryptResult";
        final String actual = Md5Crypt.md5Crypt(keyBytes, salt, prefix);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_rsfj0() {
        byte[] keyBytes = new byte[10]; // Replace with actual key bytes
        String expected = "$1$kMet9kFq$4kwrQKyzCIX0imtMRPZP70"; // Replace with expected hash
        String actual = Md5Crypt.md5Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_SzVc0() {
        byte[] keyBytes = new byte[10]; // Replace with actual key bytes
        Random random = new Random(); // Replace with actual random object
        String expected = "$1$MkEpRwFF$y0KPU/XD5URz6kRRtuL/4."; // Replace with expected hash value
        String actual = Md5Crypt.md5Crypt(keyBytes, random);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_CRIE0_fid1() {
        byte[] keyBytes = new byte[16]; // Assuming keyBytes is an array of 16 bytes
        String expected = "prefixRandomSalt"; // Assuming the expected result is "prefixRandomSalt"
        String actual = Md5Crypt.apr1Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_CcYQ0_fid1() {
        String keyBytes = "password";
        String expected = "$1$0000000$00000000000000000000000000000000000000";
        String actual = Md5Crypt.apr1Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_rsfj0_fid1() {
        byte[] keyBytes = new byte[10]; // Replace with actual key bytes
        String expected = "expected_hash"; // Replace with expected hash
        String actual = Md5Crypt.md5Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_1_xIUG0_fid1() {
        byte[] keyBytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String salt = "salt";
        String expected = "$apr1$salt$5.5.5.5.5.5.5.5.5.5.5.5.5.5.5.5";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_SzVc0_fid1() {
        byte[] keyBytes = new byte[10]; // Replace with actual key bytes
        Random random = new Random(); // Replace with actual random object
        String expected = "expected_hash_value"; // Replace with expected hash value
        String actual = Md5Crypt.md5Crypt(keyBytes, random);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_Xjik0_fid1() {
        String keyBytes = "password";
        String salt = "salt";
        String expected = "$1$salt$v2.4.1";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }
}