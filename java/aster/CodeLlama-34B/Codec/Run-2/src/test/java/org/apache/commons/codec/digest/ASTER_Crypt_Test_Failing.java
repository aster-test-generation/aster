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

public class Aster_Crypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_GBFr0() {
        byte[] keyBytes = new byte[0];
        String salt = null;
        String expectedHash = Sha2Crypt.sha512Crypt(keyBytes);
        String actualHash = Crypt.crypt(keyBytes, salt);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_EmptySalt_kgxV3() {
        String key = "key";
        String expected = "kgxV3";
        String actual = Crypt.crypt(key, "");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidKeyAndSalt_DifferentSalt_OFEy5() {
        String key = "key";
        String salt = "salt";
        String expected = "crypt";
        String actual = Crypt.crypt(key, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullKey_fJPv1() {
        byte[] keyBytes = null;
        String encrypted = Crypt.crypt(keyBytes);
        assertNull(encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyKey_iGLQ2() {
        byte[] keyBytes = new byte[0];
        String encrypted = Crypt.crypt(keyBytes);
        assertNull(encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidKey_unYU3() {
        byte[] keyBytes = new byte[16];
        keyBytes[0] = (byte) 0xFF;
        String encrypted = Crypt.crypt(keyBytes);
        assertNull(encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidKey_rNPc3() {
        String result = Crypt.crypt("invalid");
        assertEquals("$6$inETsBwr$BI6YozQQoFSaoDEtTmkQiZmmziHQmM9QapJcoN0tGSMHuoKdnH9DUAcNs.HXOOvaHQ./K83kyD3icReFNILd./", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptySalt_mSxv5() {
        String result = Crypt.crypt("test", "");
        assertEquals("test", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_EmptyKey_zNuK1() {
        String salt = "salt";
        String expected = "";
        String actual = Crypt.crypt("", salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_NullSalt_VlRd2() {
        String key = "key";
        String expected = "";
        String actual = Crypt.crypt(key, null);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_EmptySalt_kgxV3_fid2() {
        String key = "key";
        String expected = "";
        String actual = Crypt.crypt(key, "");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidKeyAndSalt_DifferentSalt_OFEy5_fid2() {
        String key = "key";
        String salt = "salt";
        String expected = "crypt";
        String actual = Crypt.crypt(key, "different_salt");
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidKeyAndSalt_DifferentKeyAndSalt_TeGq7_fid2() {
        String key = "key";
        String salt = "salt";
        String expected = "crypt";
        String actual = Crypt.crypt("different_key", "different_salt");
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidKeyAndSalt_InvalidSalt_iFuL9_fid2() {
        String key = "key";
        String salt = "salt";
        String expected = "crypt";
        String actual = Crypt.crypt(key, "invalid_salt");
        assertNotEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_Cqhs0_2_fid2() {
        byte[] keyBytes = new byte[16];
        String encrypted = Crypt.crypt(keyBytes);
        assertEquals(16, encrypted.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidKey_WtPb4_2_fid2() {
        byte[] keyBytes = new byte[16];
        keyBytes[0] = (byte) 0x01;
        String encrypted = Crypt.crypt(keyBytes);
        assertEquals(16, encrypted.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyKey_xNYZ1() {
        String result = Crypt.crypt("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidKey_koEW2() {
        String result = Crypt.crypt("test");
        assertEquals("test", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidKey_rNPc3_fid2() {
        String result = Crypt.crypt("invalid");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_lJHa4() {
        String result = Crypt.crypt("test", null);
        assertEquals("test", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_zDsK6() {
        String result = Crypt.crypt("test", "salt");
        assertEquals("test", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_gKde7_fid2() {
        String result = Crypt.crypt("test", "invalid");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_Cqhs0() {
        byte[] keyBytes = new byte[16];
        String encrypted = Crypt.crypt(keyBytes);
        assertNotNull(encrypted);
        assertEquals(16, encrypted.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidKey_WtPb4() {
        byte[] keyBytes = new byte[16];
        keyBytes[0] = (byte) 0x01;
        String encrypted = Crypt.crypt(keyBytes);
        assertNotNull(encrypted);
        assertEquals(16, encrypted.length());
    }
}