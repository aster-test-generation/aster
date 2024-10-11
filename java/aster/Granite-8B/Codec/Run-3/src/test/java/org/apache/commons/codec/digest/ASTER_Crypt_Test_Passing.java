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

public class Aster_Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_xTzp0() throws Exception {
        String key = "test";
        String expected = "test";
        String actual = Crypt.crypt(key, null);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_vcSz0() throws Exception {
        byte[] keyBytes = new byte[16];
        String result = Crypt.crypt(keyBytes, null);
        assertEquals("000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_FQju0() throws Exception {
        byte[] keyBytes = new byte[]{1, 2, 3};
        String salt = null;
        String expected = Sha2Crypt.sha512Crypt(keyBytes);
        String actual = Crypt.crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSha512PrefixSalt_EhCt1() throws Exception {
        byte[] keyBytes = new byte[]{1, 2, 3};
        String salt = Sha2Crypt.SHA512_PREFIX + "randomSalt";
        String expected = Sha2Crypt.sha512Crypt(keyBytes, salt);
        String actual = Crypt.crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSha256PrefixSalt_LLOp2() throws Exception {
        byte[] keyBytes = new byte[]{1, 2, 3};
        String salt = Sha2Crypt.SHA256_PREFIX + "randomSalt";
        String expected = Sha2Crypt.sha256Crypt(keyBytes, salt);
        String actual = Crypt.crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMd5PrefixSalt_tlXA3() throws Exception {
        byte[] keyBytes = new byte[]{1, 2, 3};
        String salt = Md5Crypt.MD5_PREFIX + "randomSalt";
        String expected = Md5Crypt.md5Crypt(keyBytes, salt);
        String actual = Crypt.crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOtherSalt_oVXD4() throws Exception {
        byte[] keyBytes = new byte[]{1, 2, 3};
        String salt = "randomSalt";
        String expected = UnixCrypt.crypt(keyBytes, salt);
        String actual = Crypt.crypt(keyBytes, salt);
        assertEquals(expected, actual);
    }
}