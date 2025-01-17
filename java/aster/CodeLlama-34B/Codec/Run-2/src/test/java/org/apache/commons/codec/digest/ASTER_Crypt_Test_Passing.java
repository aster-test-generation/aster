/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSha512Prefix_xmAf1() {
        byte[] keyBytes = new byte[0];
        String salt = Sha2Crypt.SHA512_PREFIX + "salt";
        String expectedHash = Sha2Crypt.sha512Crypt(keyBytes, salt);
        String actualHash = Crypt.crypt(keyBytes, salt);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSha256Prefix_btgf2() {
        byte[] keyBytes = new byte[0];
        String salt = Sha2Crypt.SHA256_PREFIX + "salt";
        String expectedHash = Sha2Crypt.sha256Crypt(keyBytes, salt);
        String actualHash = Crypt.crypt(keyBytes, salt);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMd5Prefix_WTAZ3() {
        byte[] keyBytes = new byte[0];
        String salt = Md5Crypt.MD5_PREFIX + "salt";
        String expectedHash = Md5Crypt.md5Crypt(keyBytes, salt);
        String actualHash = Crypt.crypt(keyBytes, salt);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithUnixCrypt_KmAs4() {
        byte[] keyBytes = new byte[0];
        String salt = "salt";
        String expectedHash = UnixCrypt.crypt(keyBytes, salt);
        String actualHash = Crypt.crypt(keyBytes, salt);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidKeyAndSalt_DifferentKey_eiMq6() {
        String key = "key";
        String salt = "salt";
        String expected = "crypt";
        String actual = Crypt.crypt("different_key", salt);
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidKeyAndSalt_InvalidKey_AWRT8() {
        String key = "key";
        String salt = "salt";
        String expected = "crypt";
        String actual = Crypt.crypt("invalid_key", salt);
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_Cqhs0_1() {
        byte[] keyBytes = new byte[16];
        String encrypted = Crypt.crypt(keyBytes);
        assertNotNull(encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_Cqhs0_2() {
        byte[] keyBytes = new byte[98];
        String encrypted = Crypt.crypt(keyBytes);
        assertEquals(98, encrypted.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidKey_WtPb4_1() {
        byte[] keyBytes = new byte[16];
        keyBytes[0] = (byte) 0x01;
        String encrypted = Crypt.crypt(keyBytes);
        assertNotNull(encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidKey_WtPb4_2() {
        byte[] keyBytes = new byte[98];
        keyBytes[0] = (byte) 0x01;
        String encrypted = Crypt.crypt(keyBytes);
        assertEquals(98, encrypted.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_gKde7() {
        String result = Crypt.crypt("test", "invalid");
        assertEquals("inpo6Syn5OpQ6", result);
    }
}