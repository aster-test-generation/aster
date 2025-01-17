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
    public void testApr1Crypt_ZaxP0() throws Exception {
        Md5Crypt md5Crypt = new Md5Crypt();
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.apr1Crypt(keyBytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_dldC0() throws Exception {
        Md5Crypt md5Crypt = new Md5Crypt();
        byte[] keyBytes = "key".getBytes();
        String salt = "salt";
        String prefix = "$1$";
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_ppBf0() throws Exception {
        Md5Crypt md5Crypt = new Md5Crypt();
        byte[] keyBytes = "key".getBytes();
        String salt = "salt";
        String result = Md5Crypt.md5Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_PVDI0() throws Exception {
        Md5Crypt md5Crypt = new Md5Crypt();
        String result = Md5Crypt.apr1Crypt("password");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_KVZw0() throws Exception {
        Md5Crypt md5Crypt = new Md5Crypt();
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String result = Md5Crypt.apr1Crypt(keyBytes, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_EXVf0() throws Exception {
        Md5Crypt md5Crypt = new Md5Crypt();
        byte[] keyBytes = "key".getBytes();
        String result = Md5Crypt.md5Crypt(keyBytes);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt_KnWc0() throws Exception {
        Md5Crypt md5Crypt = new Md5Crypt();
        byte[] keyBytes = "key".getBytes();
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1Crypt_Zrob0() throws Exception {
        Md5Crypt md5Crypt = new Md5Crypt();
        String result = Md5Crypt.apr1Crypt("keyBytes", "salt");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptNullSalt_BAtV0() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = null;
        String result = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptValidSalt_IFMG1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "salt";
        String result = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertTrue(result.startsWith(Md5Crypt.APR1_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptEmptySalt_fSVm2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "";
        String result = Md5Crypt.apr1Crypt(keyBytes, salt);
        assertTrue(result.startsWith(Md5Crypt.APR1_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt1_aGIv0() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = null;
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt2_MuVo1() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = "$1$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt3_hRQk2() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = null;
        String prefix = "$2$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt4_xPPr3() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = "$2$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt5_XqAX4() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = null;
        String prefix = "$3$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt6_Cozl5() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = "$3$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt7_LbXU6() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = null;
        String prefix = "$4$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt8_rxva7() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = "$4$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt9_Hgtf8() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = null;
        String prefix = "$5$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt10_pzAg9() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "salt";
        String prefix = "$5$";
        Random random = new Random();
        String result = Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMd5Crypt11_aonb10() throws Exception {
        byte[] keyBytes = "password".getBytes(StandardCharsets.UTF_8);
        String salt = "invalidsalt";
        String prefix = "$1$";
        Random random = new Random();
        try {
            Md5Crypt.md5Crypt(keyBytes, salt, prefix, random);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
}