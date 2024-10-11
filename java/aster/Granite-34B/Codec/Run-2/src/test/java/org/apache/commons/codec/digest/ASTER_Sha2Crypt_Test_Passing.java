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
    public void testSha512CryptWithSalt_XhcQ1() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$6$12345678$";
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt, new Random());
        assertEquals(98, result.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512Crypt_aelb0() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$6$rounds=5000$usesomesillystri$";
        String expected = "$6$rounds=5000$usesomesillystri$nnCrG0XcyKwkRXepV1dRXhqEhP0r2sdjV8bt5gCcljMzCikm9bUX/7p3XFtKdxi5sTwUISBZHwcTXhwXYM/rl1";
        assertEquals(expected, Sha2Crypt.sha512Crypt(keyBytes, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Crypt_emtY0_OXZf0() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$12345678$";
        String expected = "$5$12345678$HxSvzMyVSg03Aq96z9E/GySiT7BkyOSTDjfKSua5oY2";
        assertEquals(expected, Sha2Crypt.sha256Crypt(keyBytes, salt));
    }
}