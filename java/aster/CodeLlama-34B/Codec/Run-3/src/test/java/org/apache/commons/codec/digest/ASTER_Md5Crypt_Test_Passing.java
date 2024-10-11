/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import java.security.SecureRandom;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Md5Crypt_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_RmOp0() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        String salt = "salt";
        String expected = "md5_prefix";
        String actual = Md5Crypt.md5Crypt(keyBytes, salt, expected);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_DORR0_1() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10 };
        String salt = "salt";
        String prefix = "prefix";
        SecureRandom secureRandom = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, secureRandom);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_DORR0_2() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10 };
        String salt = "salt";
        String prefix = "prefix";
        SecureRandom secureRandom = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, secureRandom);
        assertEquals(32, result.length());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_DORR0_3() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10 };
        String salt = "salt";
        String prefix = "prefix";
        SecureRandom secureRandom = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, secureRandom);
        assertEquals("prefix", result.substring(0, 6));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_DORR0_4() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10 };
        String salt = "salt";
        String prefix = "prefix";
        SecureRandom secureRandom = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, secureRandom);
        assertEquals("salt", result.substring(6, 10));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_DORR0_5() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10 };
        String salt = "salt";
        String prefix = "prefix";
        SecureRandom secureRandom = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, secureRandom);
        assertEquals("0102030405060708090a0b0c0d0e0f10", result.substring(10, 32));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_CtnA0() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "12345678";
        String expectedHash = "1234567890abcdef";
        String actualHash = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expectedHash, actualHash);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithRandomSalt_VhKW1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = Md5Crypt.MD5_PREFIX + B64.getRandomSalt(8);
        String expectedHash = "1234567890abcdef";
        String actualHash = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(expectedHash, actualHash);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithInvalidKey_UdKQ2() throws Exception {
        byte[] keyBytes = "invalid_password".getBytes();
        String salt = "12345678";
        String expectedHash = "1234567890abcdef";
        String actualHash = Md5Crypt.md5Crypt(keyBytes, salt);
        assertNotEquals(expectedHash, actualHash);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithInvalidSalt_Ikxh3() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "invalid_salt";
        String expectedHash = "1234567890abcdef";
        String actualHash = Md5Crypt.md5Crypt(keyBytes, salt);
        assertNotEquals(expectedHash, actualHash);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_IoSY0() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "salt";
        String expected = "apr1$salt$password";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithRandomSalt_AORT1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = Md5Crypt.APR1_PREFIX + B64.getRandomSalt(8);
        String expected = "apr1$salt$password";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithInvalidKey_vNEy2() throws Exception {
        byte[] keyBytes = "invalid".getBytes();
        String salt = "salt";
        String expected = "apr1$salt$invalid";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithInvalidSalt_nSWz3() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "invalid";
        String expected = "apr1$invalid$password";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithNullKey_bgIn4() throws Exception {
        byte[] keyBytes = null;
        String salt = "salt";
        String expected = "apr1$salt$null";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithNullSalt_hZql5() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = null;
        String expected = "apr1$null$password";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithEmptyKey_dMWF6() throws Exception {
        byte[] keyBytes = "".getBytes();
        String salt = "salt";
        String expected = "apr1$salt$";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithEmptySalt_JRsB7() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "";
        String expected = "apr1$$password";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithNullKeyAndSalt_Ffmj8() throws Exception {
        byte[] keyBytes = null;
        String salt = null;
        String expected = "apr1$null$null";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithEmptyKeyAndSalt_zliw9() throws Exception {
        byte[] keyBytes = "".getBytes();
        String salt = "";
        String expected = "apr1$$";
        String actual = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMd5Crypt_xhkU0() throws Exception {
    byte[] keyBytes = new byte[16];
    String salt = "salt";
    String prefix = "prefix";
    Random random = new Random();
    String expected = "prefixsalt$12345678";
    String actual = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMd5CryptWithNullSalt_SORy1() throws Exception {
    byte[] keyBytes = new byte[16];
    String salt = null;
    String prefix = "prefix";
    Random random = new Random();
    String expected = "prefix$12345678";
    String actual = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMd5CryptWithInvalidSalt_hDPP2() throws Exception {
    byte[] keyBytes = new byte[16];
    String salt = "invalid";
    String prefix = "prefix";
    Random random = new Random();
    String expected = "prefix$12345678";
    String actual = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_fLBA0() throws Exception {
        String key = "password";
        String expected = "apr1$password$password";
        String actual = Md5Crypt.apr1Crypt(key);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithSalt_fElP1() throws Exception {
        String key = "password";
        String salt = "salt";
        String expected = "apr1$password$salt";
        String actual = Md5Crypt.apr1Crypt(key, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_tAMF0_1() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        Random random = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_tAMF0_2() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        Random random = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertEquals(32, result.length());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_tAMF0_3() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        Random random = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertEquals("$1$", result.substring(0, 3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_tAMF0_4() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        Random random = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertEquals("$", result.substring(31));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSalt_Jecs1_1() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        Random random = new SecureRandom();
        String salt = Md5Crypt.MD5_PREFIX + B64.getRandomSalt(8, random);
        String result = Md5Crypt.md5Crypt(keyBytes, salt);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSalt_Jecs1_2() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        Random random = new SecureRandom();
        String salt = Md5Crypt.MD5_PREFIX + B64.getRandomSalt(8, random);
        String result = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals(32, result.length());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSalt_Jecs1_3() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        Random random = new SecureRandom();
        String salt = Md5Crypt.MD5_PREFIX + B64.getRandomSalt(8, random);
        String result = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals("$1$", result.substring(0, 3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithSalt_Jecs1_4() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        Random random = new SecureRandom();
        String salt = Md5Crypt.MD5_PREFIX + B64.getRandomSalt(8, random);
        String result = Md5Crypt.md5Crypt(keyBytes, salt);
        assertEquals("$", result.substring(31));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithInvalidKeyBytes_jIMK2() throws Exception {
        byte[] keyBytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
        Random random = new SecureRandom();
        String result = Md5Crypt.md5Crypt(null, random);
        assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5CryptWithEmptyKeyBytes_OwiE5() throws Exception {
        byte[] keyBytes = new byte[] {};
        Random random = new SecureRandom();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_HpAe0() throws Exception {
        String key = "password";
        String salt = "salt";
        String expected = "apr1$salt$password";
        String actual = Md5Crypt.apr1Crypt(key, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithNullKey_VwZS1() throws Exception {
        String key = null;
        String salt = "salt";
        String expected = "apr1$salt$";
        String actual = Md5Crypt.apr1Crypt(key, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithNullSalt_kPno2() throws Exception {
        String key = "password";
        String salt = null;
        String expected = "apr1$password";
        String actual = Md5Crypt.apr1Crypt(key, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithEmptyKey_IMjP3() throws Exception {
        String key = "";
        String salt = "salt";
        String expected = "apr1$salt$";
        String actual = Md5Crypt.apr1Crypt(key, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithEmptySalt_XimC4() throws Exception {
        String key = "password";
        String salt = "";
        String expected = "apr1$password";
        String actual = Md5Crypt.apr1Crypt(key, salt);
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithInvalidKey_eeCD5() throws Exception {
        String key = "password";
        String salt = "salt";
        String expected = "apr1$salt$password";
        String actual = Md5Crypt.apr1Crypt(key, salt);
        assertNotEquals(expected, actual);
}
}