/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Md5Crypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_MKQs0() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertEquals("passwordsalt$", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptNullSalt_XjEp1() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = null;
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertEquals("$1$P9OugdSJ$uEAoKhSp6AJb9NFzs94fY0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptNullKeyBytes_feXF4() {
        byte[] keyBytes = null;
        String salt = "salt";
        String prefix = "$1$";
        Random random = new Random();
        try {
            Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
            assertEquals(false, true);
        } catch (IllegalArgumentException e) {
            assertEquals("Key bytes cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptNullPrefix_CMyH6() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = null;
        Random random = new Random();
        try {
            Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
            assertEquals(false, true);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid prefix value: null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptNullRandom_Fpxl8() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = "$1$";
        Random random = null;
        try {
            Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
            assertEquals(false, true);
        } catch (NullPointerException e) {
            assertEquals("random cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptEmptyRandom_GNXd9() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = "$1$";
        Random random = new Random();
        try {
            Md5Crypt.md5Crypt(keyBytes, salt, prefix, new Random());
            assertEquals(false, true);
        } catch (NullPointerException e) {
            assertEquals("random cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_aUvA0() {
        byte[] keyBytes = "testKey".getBytes();
        String salt = "testSalt";
        String expected = "hashedValue";
        String result = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_ZecW0() {
        byte[] keyBytes = "testKey".getBytes();
        String salt = "testSalt";
        String prefix = "testPrefix";
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix);
        String expected = "hashedResult";
        assert result.equals(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithNullSalt_XsCu2() {
        String salt = null;
        String expected = "$apr1$a9EGxLqI$AG4dXQPrOxAJz975mnflr.";
        String result = Md5Crypt.apr1Crypt("12345678".getBytes(), salt);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_UXQC0() {
        String keyBytes = "mykey";
        String salt = "mySalt";
        String expected = "$apr1$" + salt + "$" + Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, Md5Crypt.apr1Crypt(keyBytes, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_gtDf0() {
        byte[] keyBytes = new byte[10];
        String result = Md5Crypt.apr1Crypt(keyBytes);
        assertEquals("Expected result", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptNullSalt_XjEp1_fid2() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = null;
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertEquals("$1$randomsalt$", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptEmptyKeyBytes_ezcI3_fid2() {
        byte[] keyBytes = new byte[0];
        String salt = "salt";
        String prefix = "$1$";
        Random random = new Random();
        try {
            Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
            assertEquals(false, true);
        } catch (IllegalArgumentException e) {
            assertEquals("Key bytes cannot be empty", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptEmptyPrefix_KWnR7_fid2() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = "";
        Random random = new Random();
        try {
            Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
            assertEquals(false, true);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid prefix value: ", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_lRWn0() {
        String keyBytes = "test";
        String result = Md5Crypt.apr1Crypt(keyBytes);
        assertEquals("result", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidSalt_Jegp0_fid2() {
        String salt = "mySalt";
        String expected = "mySalt$mySalt$12345678";
        String result = Md5Crypt.apr1Crypt("12345678".getBytes(), salt);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithoutSaltPrefix_leiF1_fid2() {
        String salt = "mySalt";
        String expected = "APR1$mySalt$12345678";
        String result = Md5Crypt.apr1Crypt("12345678".getBytes(), salt);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithNullSalt_XsCu2_fid2() {
        String salt = null;
        String expected = "APR1$12345678";
        String result = Md5Crypt.apr1Crypt("12345678".getBytes(), salt);
        assertEquals(expected, result);
    }
}