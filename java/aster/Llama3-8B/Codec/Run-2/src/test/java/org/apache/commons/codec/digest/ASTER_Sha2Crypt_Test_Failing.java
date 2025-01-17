/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Sha2Crypt_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Crypt_lyra0() {
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String salt = "salt";
        String result = Sha2Crypt.sha256Crypt(keyBytes, salt, random);
        System.out.println(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512Crypt_MKLT0() {
        byte[] keyBytes = "testKey".getBytes();
        String salt = "testSalt";
        String expected = "testExpected";
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptNullSalt_TESG1() {
        byte[] keyBytes = "testKey".getBytes();
        String salt = null;
        String expected = "$6$I8a9eZW2$GLzvh5rK4/kQbP9K1TqRFTdQvJt3zxSj1DFo/e.KdJxvyg1BikW19Ze7nBsRKFbjAC/cuvlK7ut0Lew.wX.WU0";
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512Crypt_AqfW0() {
        byte[] keyBytes = "password".getBytes();
        Random random = new Random();
        String salt = "salt";
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt, random);
        System.out.println(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha512CryptNullSalt_TESG1_fid2() {
        byte[] keyBytes = "testKey".getBytes();
        String salt = null;
        String expected = "testExpected";
        String result = Sha2Crypt.sha512Crypt(keyBytes, salt);
        assertEquals(expected, result);
    }
}