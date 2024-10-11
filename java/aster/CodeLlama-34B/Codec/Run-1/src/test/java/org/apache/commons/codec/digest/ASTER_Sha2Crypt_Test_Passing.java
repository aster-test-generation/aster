/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Sha2Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithInvalidKey_jNlv3() {
        byte[] keyBytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        String expectedResult = null;
        String actualResult = Sha2Crypt.sha256Crypt(keyBytes);
        assertNull(expectedResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithCustomSalt_XrGc1() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=100000$abcdefghijklmnop";
        Random random = new Random();
        String expected = "$5$rounds=100000$abcdefghijklmnop$kOBvaqa22Aptg3I7NYr1KhbA7m1xa6VVYDAwSemQ5QD";
        String actual = Sha2Crypt.sha256Crypt(keyBytes, salt, random);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithEmptyKey_fLHC4() {
        byte[] keyBytes = new byte[0];
        String expected = null;
        String actual = Sha2Crypt.sha512Crypt(keyBytes);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithNullSalt_Jvpj3_iZSq0() {
        byte[] keyBytes = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f};
        String salt = null;
        String expected = "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d80";
        String actual = Sha2Crypt.sha512Crypt(keyBytes, salt);
    }
}