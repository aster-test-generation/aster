/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_UnixCrypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidInput_wwnM0_fid1() {
        String original = "hello";
        String salt = "xy";
        String expectedOutput = "xya8V9w.cP8Jk"; // Expected output should be precomputed or known valid output
        String result = UnixCrypt.crypt(original, salt);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testCryptWithInvalidSalt_iTrb3_EakB0() {
        byte[] original = "password".getBytes();
        String salt = "123"; // Invalid salt, should throw exception
        assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
    }

    @Test
    public void testCryptWithInvalidSalt_vmQD3_BZSx0() {
        byte[] original = "password".getBytes();
        String salt = "123"; // Invalid salt, should be two characters
        assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
    }
}