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

public class Aster_Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_OMkN0_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Crypt.crypt(keyBytes, null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_OMkN0_2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Crypt.crypt(keyBytes, null);
        assertTrue(result.startsWith(Sha2Crypt.SHA512_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSHA512Salt_eiTz1_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA512_PREFIX + "salt";
        String result = Crypt.crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSHA512Salt_eiTz1_2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA512_PREFIX + "salt";
        String result = Crypt.crypt(keyBytes, salt);
        assertTrue(result.startsWith(Sha2Crypt.SHA512_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSHA256Salt_qEkv2_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA256_PREFIX + "salt";
        String result = Crypt.crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSHA256Salt_qEkv2_2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA256_PREFIX + "salt";
        String result = Crypt.crypt(keyBytes, salt);
        assertTrue(result.startsWith(Sha2Crypt.SHA256_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMD5Salt_tZVA3_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = Md5Crypt.MD5_PREFIX + "salt";
        String result = Crypt.crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMD5Salt_tZVA3_2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = Md5Crypt.MD5_PREFIX + "salt";
        String result = Crypt.crypt(keyBytes, salt);
        assertTrue(result.startsWith(Md5Crypt.MD5_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithUnknownSalt_tVfW4_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "unknownsalt";
        String result = Crypt.crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithUnknownSalt_tVfW4_2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "unknownsalt";
        String result = Crypt.crypt(keyBytes, salt);
        assertFalse(result.startsWith(Sha2Crypt.SHA512_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithUnknownSalt_tVfW4_3() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "unknownsalt";
        String result = Crypt.crypt(keyBytes, salt);
        assertFalse(result.startsWith(Sha2Crypt.SHA256_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithUnknownSalt_tVfW4_4() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "unknownsalt";
        String result = Crypt.crypt(keyBytes, salt);
        assertFalse(result.startsWith(Md5Crypt.MD5_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidInput_DlGa0() throws Exception {
        String key = "testKey";
        String salt = "testSalt";
        String result = Crypt.crypt(key, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullKeyBytes_BWyG0() throws Exception {
        byte[] keyBytes = null;
        String result = Crypt.crypt(keyBytes);
        assertNull("Expected null result for null input key bytes", result);
    }
}