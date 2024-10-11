/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Sha2Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithNullSalt_RkXw0() throws Exception {
        String expectedOutput = "expected hash output here"; // Replace with the expected hash output
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha256Crypt(keyBytes);
        assertEquals(expectedOutput, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithProvidedSalt_wdkW0_1() throws Exception {
        String salt = "$5$somesalt";
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithProvidedSalt_wdkW0_2() throws Exception {
        String salt = "$5$somesalt";
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertTrue(result.startsWith("$5$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithNullSalt_NKBB1_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha256Crypt(keyBytes, null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithNullSalt_NKBB1_2() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha256Crypt(keyBytes, null);
        assertTrue(result.startsWith("$5$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithNullSalt_ewHC0_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha256Crypt(keyBytes, null, new SecureRandom());
        assertNotNull("Result should not be null", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithProvidedSalt_wVgT1_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$somesalt";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt, new SecureRandom());
        assertNotNull("Result should not be null", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithNullSalt_nMAY0() throws Exception {
        String expectedPattern = "^\\$6\\$";
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha512Crypt(keyBytes);
        assertTrue(result.matches(expectedPattern));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithProvidedSalt_ndRL0_1() throws Exception {
        String salt = "$6$somesalt";
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertNotNull("Result should not be null", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithNullSalt_wqGx1_1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha512Crypt(keyBytes, null);
        assertNotNull("Result should not be null", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithNullSalt_oEmy0() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String result = Sha2Crypt.sha512Crypt(keyBytes, null, new SecureRandom());
        assertTrue(result.startsWith(Sha2Crypt.SHA512_PREFIX));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptWithSpecificSalt_fVMr1() throws Exception {
        byte[] keyBytes = "password".getBytes();
        String salt = Sha2Crypt.SHA512_PREFIX + "specificsalt";
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt, new SecureRandom());
        assertTrue(result.startsWith(salt));
    }
}