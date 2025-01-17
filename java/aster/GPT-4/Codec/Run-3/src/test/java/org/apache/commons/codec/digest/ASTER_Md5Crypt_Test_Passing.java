/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Md5Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithRandomSalt_rjZV0_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.apr1Crypt(keyBytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithRandomSalt_rjZV0_2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.apr1Crypt(keyBytes);
        assertTrue(result.startsWith(Md5Crypt.APR1_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithValidSalt_tbGF0() throws Exception {
        String result = Md5Crypt.md5Crypt("password".getBytes(StandardCharsets.UTF_8), "$1$salt1234", "$1$", new Random());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullSalt_APkI1() throws Exception {
        String result = Md5Crypt.md5Crypt("password".getBytes(StandardCharsets.UTF_8), null, "$1$", new Random());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithEmptyKey_bLFy3() throws Exception {
        String result = Md5Crypt.md5Crypt(new byte[0], "$1$salt1234", "$1$", new Random());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithLongSalt_lUSh4() throws Exception {
        String result = Md5Crypt.md5Crypt("password".getBytes(StandardCharsets.UTF_8), "$1$1234567890123456", "$1$", new Random());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithShortSalt_NffG5() throws Exception {
        String result = Md5Crypt.md5Crypt("password".getBytes(StandardCharsets.UTF_8), "$1$a", "$1$", new Random());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithMaximumSaltLength_tHbI6() throws Exception {
        String result = Md5Crypt.md5Crypt("password".getBytes(StandardCharsets.UTF_8), "$1$abcdefgh", "$1$", new Random());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithPrefixAndSalt_jjFF7() throws Exception {
        String result = Md5Crypt.md5Crypt("password".getBytes(StandardCharsets.UTF_8), "$1$salt1234", "$1$", new Random());
        assertTrue(result.startsWith("$1$salt1234$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithDifferentPrefix_IZmZ8() throws Exception {
        String result = Md5Crypt.md5Crypt("password".getBytes(StandardCharsets.UTF_8), "$2$salt1234", "$2$", new Random());
        assertTrue(result.startsWith("$2$salt1234$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSaltGeneration_QrFp9() throws Exception {
        Random random = new Random();
        String result1 = Md5Crypt.md5Crypt("password".getBytes(StandardCharsets.UTF_8), null, "$1$", random);
        String result2 = Md5Crypt.md5Crypt("password".getBytes(StandardCharsets.UTF_8), null, "$1$", random);
        assertNotEquals(result1, result2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptConsistencyWithSameInput_eUOJ10() throws Exception {
        byte[] keyBytes = "consistentPassword".getBytes(StandardCharsets.UTF_8);
        String salt = "$1$consistent";
        Random random = new Random(12345);
        String result1 = Md5Crypt.md5Crypt(keyBytes, salt, "$1$", random);
        String result2 = Md5Crypt.md5Crypt(keyBytes, salt, "$1$", random);
        assertEquals(result1, result2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidInput_orcp0() throws Exception {
        String input = "password";
        String result = Md5Crypt.apr1Crypt(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithValidInput_poEk0() throws Exception {
        String expectedOutput = "someExpectedHashValue"; // Replace with the expected hash value for the test case
        byte[] keyBytes = "password".getBytes();
        String salt = "12345678";
        String result = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithValidInputs_iLOM0() throws Exception {
        String expectedOutput = "someExpectedHashValue"; // Replace with actual expected hash value
        byte[] keyBytes = "password".getBytes();
        String salt = "12345678";
        String prefix = "$1$";
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_Gdeq0_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.md5Crypt(keyBytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_Gdeq0_2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.md5Crypt(keyBytes);
        assertTrue(result.startsWith(Md5Crypt.MD5_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidSalt_mqyZ1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "mysalt";
        String result = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertTrue(result.startsWith("$apr1$mysalt$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithPrefixSalt_JzoP2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "$apr1$mysalt";
        String result = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertTrue(result.startsWith("$apr1$mysalt$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_TtwY0_1() throws Exception {
        byte[] keyBytes = "testKey".getBytes();
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_TtwY0_2() throws Exception {
        byte[] keyBytes = "testKey".getBytes();
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertTrue(result.startsWith("$1$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithRandomSalt_jJlR0() throws Exception {
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Md5Crypt.apr1Crypt(keyBytes, random);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidInput_EbeZ0() throws Exception {
        String keyBytes = "password";
        String salt = "salt123";
        String expectedOutput = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expectedOutput, Md5Crypt.apr1Crypt(keyBytes, salt));
    }
}