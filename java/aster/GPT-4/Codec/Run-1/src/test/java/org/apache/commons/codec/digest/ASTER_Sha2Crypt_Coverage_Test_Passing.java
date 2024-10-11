/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Sha2Crypt_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithInvalidSaltNoDollarSign_oyIX1_1() {
        byte[] keyBytes = "password".getBytes();
        String salt = "invalidsalt";
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Sha2Crypt.sha256Crypt(keyBytes, salt);
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithValidRounds_VKqP2_1() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=5000$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithValidRounds_VKqP2_2() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=5000$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertTrue(result.contains("rounds=5000$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithRoundsBelowMinimum_kFjo3_1() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=1000$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithRoundsBelowMinimum_kFjo3_2() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=1000$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertTrue(result.contains("rounds=1000$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithRoundsAboveMaximum_dyvu4_1() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=999999999$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithRoundsAboveMaximum_dyvu4_2() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=999999999$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertTrue(result.contains("rounds=999999999$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptKeyLengthMultipleOfBlocksize_WdrX5() {
        byte[] keyBytes = new byte[32]; // SHA256_BLOCKSIZE is 32
        String salt = "$5$rounds=5000$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptKeyLengthNotMultipleOfBlocksize_UjqB6() {
        byte[] keyBytes = new byte[35]; // Not a multiple of SHA256_BLOCKSIZE (32)
        String salt = "$5$rounds=5000$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptSaltLengthMultipleOfBlocksize_hTIj7() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=5000$" + "1234567890123456"; // 16 characters, multiple of SHA256_BLOCKSIZE (32)
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptSaltLengthNotMultipleOfBlocksize_aewi8() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=5000$" + "123456789012345"; // 15 characters, not a multiple of SHA256_BLOCKSIZE (32)
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithRoundsCustomFalse_VsAI10_1() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithRoundsCustomFalse_VsAI10_2() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertFalse(result.contains("rounds="));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithLongKey_hdgq11() {
        byte[] keyBytes = new byte[100]; // Long key
        String salt = "$5$rounds=5000$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithShortKey_GpVT12() {
        byte[] keyBytes = new byte[1]; // Short key
        String salt = "$5$rounds=5000$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithLongSalt_JdDV13() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=5000$" + "longlonglonglonglonglonglonglong"; // Long salt
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithShortSalt_esmG14() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=5000$short"; // Short salt
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithExactBlocksizeKey_BVvj17() {
        byte[] keyBytes = new byte[32]; // Exact block size for SHA-256
        String salt = "$5$rounds=5000$saltvalue";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithExactBlocksizeSalt_xCXd18() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=5000$" + "1234567890123456"; // Exact block size for SHA-256
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithNonStandardSaltPrefix_SOJl19() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$6$rounds=5000$saltvalue"; // Non-standard prefix for SHA-256
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithStandardSaltPrefix_TsdE20() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=5000$saltvalue"; // Standard prefix for SHA-256
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt);
        assertNotNull(result);
    }
}