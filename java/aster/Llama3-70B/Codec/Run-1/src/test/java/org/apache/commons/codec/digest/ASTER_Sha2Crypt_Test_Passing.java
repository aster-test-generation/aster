/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Sha2Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Crypt_EXXA0() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        byte[] keyBytes = "key".getBytes();
        String result = Sha2Crypt.sha256Crypt(keyBytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Crypt_DLas0_1() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=1000$usesomesillystri$";
        String result = sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Crypt_DLas0_2() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=1000$usesomesillystri$";
        String result = sha2Crypt.sha256Crypt(keyBytes, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptNullSalt_ocLC1_1() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        byte[] keyBytes = "password".getBytes();
        String result = sha2Crypt.sha256Crypt(keyBytes, null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptNullSalt_EjXV0_1() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Sha2Crypt.sha256Crypt(keyBytes, null, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptNullSalt_EjXV0_2() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Sha2Crypt.sha256Crypt(keyBytes, null, random);
        assertTrue(result.startsWith(Sha2Crypt.SHA256_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptCustomSalt_FRcW1_1() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA256_PREFIX + "customsalt";
        Random random = new Random();
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptCustomSalt_FRcW1_2() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA256_PREFIX + "customsalt";
        Random random = new Random();
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt, random);
        assertEquals(salt, result.substring(0, salt.length()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512Crypt_fKIm0() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        byte[] keyBytes = "key".getBytes();
        String result = Sha2Crypt.sha512Crypt(keyBytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptNullSalt_EPPq0_1() {
        byte[] keyBytes = "password".getBytes();
        String salt = null;
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptNullSalt_EPPq0_2() {
        byte[] keyBytes = "password".getBytes();
        String salt = null;
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertTrue(result.startsWith(Sha2Crypt.SHA512_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptCustomSalt_hkPn1_1() {
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA512_PREFIX + "customsalt";
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptCustomSalt_hkPn1_2() {
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA512_PREFIX + "customsalt";
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertEquals(salt, result.substring(0, salt.length()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptNullSalt_MNpD0_1() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        Random random = new Random();
        byte[] keyBytes = "password".getBytes();
        String salt = null;
        String result = sha2Crypt.sha512Crypt(keyBytes, salt, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptNullSalt_MNpD0_2() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        Random random = new Random();
        byte[] keyBytes = "password".getBytes();
        String salt = null;
        String result = sha2Crypt.sha512Crypt(keyBytes, salt, random);
        assertTrue(result.startsWith(Sha2Crypt.SHA512_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptCustomSalt_TtAu1_1() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        Random random = new Random();
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA512_PREFIX + "customsalt";
        String result = sha2Crypt.sha512Crypt(keyBytes, salt, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptCustomSalt_TtAu1_2() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        Random random = new Random();
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA512_PREFIX + "customsalt";
        String result = sha2Crypt.sha512Crypt(keyBytes, salt, random);
        assertEquals(salt, result.substring(0, salt.length()));
    }
}