/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnixCrypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_oeOp0() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "ab";
        String expected = "abQeX8x7ieVh2";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSaltCharacters_WVgI7() {
        String salt = "ab!";
        try {
            UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: ab!", e.getMessage());
        }
    }
}