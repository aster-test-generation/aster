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

public class Aster_Sha2Crypt_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithInvalidSalt_WNfl1() {
        byte[] keyBytes = "password".getBytes();
        String salt = "invalid";
        try {
            Sha2Crypt.sha256Crypt(keyBytes, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid salt value"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithCustomRounds_lHOX2() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=100000$31vudMZRwG1MZwW6";
        String expected = "$5$rounds=100000$31vudMZRwG1MZwW6$7ZAX0s573Q5FaoiDUhWUkiRR.XmFntDHrhEPakDmXp1";
        String actual = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithCustomSalt_ExOQ3() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=535000$customsalt";
        String expected = "$5$rounds=535000$customsalt$0t7Spg/Jst8eSboTvTTBBM7fylGKhgJykZSAScSWzDA";
        String actual = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }
}