/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Md5Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_CRIE0() {
        byte[] keyBytes = new byte[16]; // Assuming keyBytes is an array of 16 bytes
        String expected = "prefixRandomSalt"; // Assuming the expected result is "prefixRandomSalt"
        String actual = Md5Crypt.apr1Crypt(keyBytes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_apr1Crypt_1_xIUG0() {
        byte[] keyBytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String salt = "salt";
        String expected = "$apr1$salt$Hf/4bDLgRaLQ.0q5CoCPx/";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_Xjik0() {
        String keyBytes = "password";
        String salt = "salt";
        String expected = "$apr1$salt$Xxd1irWT9ycqoYxGFn4cb.";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }
}