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

public class Aster_Sha2Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512Crypt_RHTp0() throws Exception {
        byte[] keyBytes = new byte[64];
        String expected = "sha512$1$0000000$000000000000000000000000000000000000000000000000000000000000000";
        String actual = Sha2Crypt.sha512Crypt(keyBytes);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithNullSalt_vMQH0() throws Exception {
        byte[] keyBytes = new byte[16];
        String salt = null;
        String expected = "$6$saltstring$TC72g.vI5z.vW1b2C0b2";
        String actual = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithNonNullSalt_npel1() throws Exception {
        byte[] keyBytes = new byte[16];
        String salt = "$6$saltstring$";
        String expected = "$6$saltstring$TC72g.vI5z.vW1b2C0b2";
        String actual = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithNullSalt_Hasc0() throws Exception {
        byte[] keyBytes = new byte[32];
        Random random = new Random();
        String salt = null;
        String expected = "534832240000$534832240000$534832240000$534832240000$534832240000$534832240000$534832240000$534832240000";
        String actual = Sha2Crypt.sha256Crypt(keyBytes, salt, random);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithNonNullSalt_snNT1() throws Exception {
        byte[] keyBytes = new byte[32];
        Random random = new Random();
        String salt = "534832240000";
        String expected = "534832240000$534832240000$534832240000$534832240000$534832240000$534832240000$534832240000$534832240000";
        String actual = Sha2Crypt.sha256Crypt(keyBytes, salt, random);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithNullSalt_MruS0() throws Exception {
        byte[] keyBytes = new byte[16];
        String salt = null;
        Random random = new Random();
        String expected = "$6$rounds=5000$u1l5222$8.2214610063224";
        String actual = Sha2Crypt.sha512Crypt(keyBytes, salt, random);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithNonNullSalt_tuCI1() throws Exception {
        byte[] keyBytes = new byte[16];
        String salt = "$6$rounds=5000$u1l5222$";
        Random random = new Random();
        String expected = "$6$rounds=5000$u1l5222$8.2214610063224";
        String actual = Sha2Crypt.sha512Crypt(keyBytes, salt, random);
        assertEquals(expected, actual);
    }
}