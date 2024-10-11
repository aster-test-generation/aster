/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import javax.crypto.Cipher;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AES256Options_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSaltWithNullSalt_oimk3() {
    AES256Options options = new AES256Options(null);
    byte[] salt = options.getSalt();
    assertNull(salt);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSaltWithEmptySalt_gBkH4_DGPK0() {
    AES256Options options = new AES256Options(new char[0]);
    byte[] salt = options.getSalt();
    assertNull(salt);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCipherWithNullKey_HdwJ7_vyOl0() {
    AES256Options options = new AES256Options(null);
    Cipher cipher = options.getCipher();
    assertNull(cipher);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCipherWithNullKey_HdwJ7_vyOl0_fid1() {
    AES256Options options = new AES256Options(null);
    Cipher cipher = options.getCipher();
    assertNotNull(cipher);
}
}