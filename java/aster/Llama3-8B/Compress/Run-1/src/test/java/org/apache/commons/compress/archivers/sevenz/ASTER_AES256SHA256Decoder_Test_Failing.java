/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AES256SHA256Decoder_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256PasswordInvalidNumCyclesPower_cxxU3() throws Exception {
        byte[] password = "password".getBytes();
        int numCyclesPower = -1;
        byte[] salt = "salt".getBytes();
        try {
            AES256SHA256Decoder.sha256Password(password, numCyclesPower, salt);
            assert false;
        } catch (IllegalStateException e) {
            assert true;
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUtf16DecodeValidInput_bNVS1() {
        char[] chars = new char[]{'H', 'e', 'l', 'l', 'o'};
        byte[] result = AES256SHA256Decoder.utf16Decode(chars);
        byte[] expected = new byte[]{0x48, 0x00, 0x65, 0x00, 0x6c, 0x00, 0x6c, 0x00, 0x6f};
        assertArrayEquals(expected, result);
    }
}