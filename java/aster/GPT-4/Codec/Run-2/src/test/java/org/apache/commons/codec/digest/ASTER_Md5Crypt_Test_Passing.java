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
    public void testApr1CryptWithRandomSalt_xlgb0_1() {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.apr1Crypt(keyBytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithRandomSalt_xlgb0_2() {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.apr1Crypt(keyBytes);
        assertTrue(result.startsWith(Md5Crypt.APR1_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithSimpleString_cWut0() {
        String input = "testString";
        String result = Md5Crypt.apr1Crypt(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_GVJD0_1() {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.md5Crypt(keyBytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_GVJD0_2() {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.md5Crypt(keyBytes);
        assertTrue(result.startsWith(Md5Crypt.MD5_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithRandomSalt_aAer0_1() {
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Md5Crypt.apr1Crypt(keyBytes, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithRandomSalt_aAer0_2() {
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Md5Crypt.apr1Crypt(keyBytes, random);
        assertTrue(result.startsWith(Md5Crypt.APR1_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_Wdyh0_1() {
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_Wdyh0_2() {
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertTrue(result.startsWith(Md5Crypt.MD5_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidInput_uQQa0_1() {
        String key = "password";
        String salt = "salt123";
        String result = Md5Crypt.apr1Crypt(key, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidInput_uQQa0_2() {
        String key = "password";
        String salt = "salt123";
        String result = Md5Crypt.apr1Crypt(key, salt);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidSalt_WrWb1_1() {
        String salt = "salt123";
        String result = Md5Crypt.apr1Crypt("password".getBytes(), salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidSalt_WrWb1_2() {
        String salt = "salt123";
        String result = Md5Crypt.apr1Crypt("password".getBytes(), salt);
        assertTrue(result.startsWith("$apr1$salt123$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithPrefixSalt_Hmay2_1() {
        String salt = "$apr1$salt123";
        String result = Md5Crypt.apr1Crypt("password".getBytes(), salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithPrefixSalt_Hmay2_2() {
        String salt = "$apr1$salt123";
        String result = Md5Crypt.apr1Crypt("password".getBytes(), salt);
        assertTrue(result.startsWith(salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithValidSalt_VHUh0() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "$1$salt1234";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullSalt_BxZB1() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, null, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithEmptyKey_LAOZ3() {
        byte[] keyBytes = "".getBytes(StandardCharsets.UTF_8);
        String salt = "$1$salt1234";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithLongKey_IFSm4() {
        byte[] keyBytes = "longpasswordlongpasswordlongpassword".getBytes(StandardCharsets.UTF_8);
        String salt = "$1$salt1234";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSpecialCharactersInKey_NUZs5() {
        byte[] keyBytes = "p@ssw0rd!".getBytes(StandardCharsets.UTF_8);
        String salt = "$1$salt1234";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithDifferentPrefix_sjLY6() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "$2$salt1234";
        String prefix = "$2$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithMaximumSaltLength_lNfW7() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "$1$12345678";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithMinimumSaltLength_WTbF8() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "$1$a";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNumericKey_xJSq9() {
        byte[] keyBytes = "12345678".getBytes(StandardCharsets.UTF_8);
        String salt = "$1$salt1234";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithAllPossibleSpecialCharactersInSalt_nKAg10() {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "$1$./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullSalt_SiVF0_yBTR0_1() {
        String result = Md5Crypt.md5Crypt("password".getBytes(), null, "$apr1$", new Random());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithNullSalt_SiVF0_yBTR0_2() {
        String result = Md5Crypt.md5Crypt("password".getBytes(), null, "$apr1$", new Random());
        assertTrue(result.startsWith("$apr1$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithRandomSalt_xlgb0() {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.apr1Crypt(keyBytes);
        assertNotNull(result);
        assertTrue(result.startsWith(Md5Crypt.APR1_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_GVJD0() {
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.md5Crypt(keyBytes);
        assertNotNull(result);
        assertTrue(result.startsWith(Md5Crypt.MD5_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithRandomSalt_aAer0() {
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Md5Crypt.apr1Crypt(keyBytes, random);
        assertNotNull(result);
        assertTrue(result.startsWith(Md5Crypt.APR1_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_Wdyh0() {
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertNotNull(result);
        assertTrue(result.startsWith(Md5Crypt.MD5_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidInput_uQQa0() {
        String key = "password";
        String salt = "salt123";
        String result = Md5Crypt.apr1Crypt(key, salt);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithValidSalt_WrWb1() {
        String salt = "salt123";
        String result = Md5Crypt.apr1Crypt("password".getBytes(), salt);
        assertNotNull(result);
        assertTrue(result.startsWith("$apr1$salt123$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithPrefixSalt_Hmay2() {
        String salt = "$apr1$salt123";
        String result = Md5Crypt.apr1Crypt("password".getBytes(), salt);
        assertNotNull(result);
        assertTrue(result.startsWith(salt));
    }
}