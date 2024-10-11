/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.IOException;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AES256SHA256Decoder_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Password_QQaW0() {
        byte[] password = "password".getBytes();
        int numCyclesPower = 1;
        byte[] salt = "salt".getBytes();
        byte[] expected = "sha256Password".getBytes();
        byte[] actual = AES256SHA256Decoder.sha256Password(password, numCyclesPower, salt);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256PasswordWithEmptyPassword_EGoR1() {
        byte[] password = "".getBytes();
        int numCyclesPower = 1;
        byte[] salt = "salt".getBytes();
        byte[] expected = "sha256Password".getBytes();
        byte[] actual = AES256SHA256Decoder.sha256Password(password, numCyclesPower, salt);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256PasswordWithEmptySalt_Boai2() {
        byte[] password = "password".getBytes();
        int numCyclesPower = 1;
        byte[] salt = "".getBytes();
        byte[] expected = "sha256Password".getBytes();
        byte[] actual = AES256SHA256Decoder.sha256Password(password, numCyclesPower, salt);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256PasswordWithZeroNumCyclesPower_wKMe3() {
        byte[] password = "password".getBytes();
        int numCyclesPower = 0;
        byte[] salt = "salt".getBytes();
        byte[] expected = "sha256Password".getBytes();
        byte[] actual = AES256SHA256Decoder.sha256Password(password, numCyclesPower, salt);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSha256PasswordWithNegativeNumCyclesPower_vrsC2_1() {
        char[] password = "password".toCharArray();
        byte[] salt = new byte[32];
        Arrays.fill(salt, (byte) 0x61);
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> AES256SHA256Decoder.sha256Password(password, -1, salt));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptionsAsPropertiesWithNullOptions_hYVw0_cjek0() throws IOException {
        AES256SHA256Decoder aes256SHA256Decoder = new AES256SHA256Decoder();
        byte[] result = aes256SHA256Decoder.getOptionsAsProperties(null);
        byte[] expected = new byte[0];
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSha256PasswordWithNegativeNumCyclesPower_vrsC2() {
        char[] password = "password".toCharArray();
        byte[] salt = new byte[32];
        Arrays.fill(salt, (byte) 0x61);
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> AES256SHA256Decoder.sha256Password(password, -1, salt));
        assertTrue(exception.getMessage().contains("numCyclesPower"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSha256PasswordWithNullSalt_wTSv3() {
        char[] password = "password".toCharArray();
        int numCyclesPower = 1000;
        Throwable exception = assertThrows(NullPointerException.class,
                () -> AES256SHA256Decoder.sha256Password(password, numCyclesPower, null));
        assertTrue(exception.getMessage().contains("salt"));
    }
}