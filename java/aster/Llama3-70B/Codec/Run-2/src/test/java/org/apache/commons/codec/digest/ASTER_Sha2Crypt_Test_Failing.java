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
public void testSha512CryptCustomSalt_tVFq1_TQle0_2() {
    Sha2Crypt sha2Crypt = new Sha2Crypt();
    byte[] keyBytes = "password".getBytes();
    String salt = "$6$rounds=10000$mycustomsalt";
    Random random = new Random();
    String result = sha2Crypt.sha256Crypt(keyBytes, salt, random);
    assertEquals(result, sha2Crypt.sha256Crypt(keyBytes, salt, random));}
}