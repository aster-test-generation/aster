/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AES256SHA256Decoder_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSha256Password_TTzz55() {
    AES256SHA256Decoder decoder = new AES256SHA256Decoder();
    byte[] password = "password".getBytes();
    int numCyclesPower = 1;
    byte[] salt = "salt".getBytes();
    byte[] result = decoder.sha256Password(password, numCyclesPower, salt);
    assertArrayEquals(new byte[32], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSha256PasswordNegativeNumCyclesPower_tqAR3_fid1() {
    AES256SHA256Decoder decoder = new AES256SHA256Decoder();
    byte[] password = "password".getBytes();
    int numCyclesPower = -1;
    byte[] salt = "salt".getBytes();
    try {
        decoder.sha256Password(password, numCyclesPower, salt);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
}