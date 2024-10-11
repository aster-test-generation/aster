/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Crypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNull_qtnJ0() {
        byte[] keyBytes = null;
        String result = Crypt.crypt(keyBytes);
        assertNull("Expected null result for null input", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_PyaM0() {
        byte[] keyBytes = "password".getBytes();
        String result = Crypt.crypt(keyBytes, null);
        assertEquals(Sha2Crypt.sha512Crypt(keyBytes), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSHA512Salt_mCdo1() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$6$saltvalue";
        String result = Crypt.crypt(keyBytes, salt);
        assertEquals(Sha2Crypt.sha512Crypt(keyBytes, salt), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSHA256Salt_PTvi2() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$saltvalue";
        String result = Crypt.crypt(keyBytes, salt);
        assertEquals(Sha2Crypt.sha256Crypt(keyBytes, salt), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMD5Salt_GWWq3() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$1$saltvalue";
        String result = Crypt.crypt(keyBytes, salt);
        assertEquals(Md5Crypt.md5Crypt(keyBytes, salt), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithUnknownSalt_BTKs4() {
        byte[] keyBytes = "password".getBytes();
        String salt = "some_salt";
        String result = Crypt.crypt(keyBytes, salt);
        assertEquals(UnixCrypt.crypt(keyBytes, salt), result);
    }
}