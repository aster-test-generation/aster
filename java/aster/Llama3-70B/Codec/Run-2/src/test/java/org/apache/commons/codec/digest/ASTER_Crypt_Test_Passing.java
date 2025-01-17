/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Crypt_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCrypt_FsZH0() {
    String key = "key";
    String salt = "salt";
    String result = Crypt.crypt(key, salt);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCrypt_SSCy0() {
    byte[] keyBytes = new byte[] {1, 2, 3};
    String result = Crypt.crypt(keyBytes);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCrypt_qNUv0() {
    String result = Crypt.crypt("key");
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptNullSalt_UOFf0() {
    byte[] keyBytes = new byte[] {1, 2, 3};
    String result = Crypt.crypt(keyBytes, null);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptSha512Salt_dmOm1() {
    byte[] keyBytes = new byte[] {1, 2, 3};
    String salt = Sha2Crypt.SHA512_PREFIX + "salt";
    String result = Crypt.crypt(keyBytes, salt);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptSha256Salt_spBg2() {
    byte[] keyBytes = new byte[] {1, 2, 3};
    String salt = Sha2Crypt.SHA256_PREFIX + "salt";
    String result = Crypt.crypt(keyBytes, salt);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptMd5Salt_oMJn3() {
    byte[] keyBytes = new byte[] {1, 2, 3};
    String salt = Md5Crypt.MD5_PREFIX + "salt";
    String result = Crypt.crypt(keyBytes, salt);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCryptUnixSalt_ycnB4() {
    byte[] keyBytes = new byte[] {1, 2, 3};
    String salt = "unixSalt";
    String result = Crypt.crypt(keyBytes, salt);
    assertNotNull(result);
}
}