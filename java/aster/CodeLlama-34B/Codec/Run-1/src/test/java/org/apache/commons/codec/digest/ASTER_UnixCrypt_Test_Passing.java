/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_UnixCrypt_Test_Passing {
    private static final int[] CON_SALT = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] SALT_CHARS = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] COV2CHAR = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final Pattern CRYPT_SALT_PATTERN = Pattern.compile("^\\$[0-9a-f]{2}\\$[0-9a-f]{2}\\$[0-9a-f]{2}$");

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidOriginalAndSalt_dOXS4() {
        String original = "original";
        String salt = "salt";
        String result = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_InvalidOriginal_rldI6() {
        String original = "invalid";
        String salt = "salt";
        String result = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_InvalidOriginalAndSalt_pMgj8() {
        String original = "invalid";
        String salt = "invalid";
        String result = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSalt_GcOb1() {
        byte[] original = new byte[]{1, 2, 3, 4, 5};
        String salt = "salt";
        String encrypted = UnixCrypt.crypt(original, salt);
        assertEquals("sajZPvBwXAQ5c", encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_uzsz2() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "abc";
        String expected = "Invalid salt value: abc";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_MTiy3() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "abmF1QH4PEr.E";
        String expected = "abmF1QH4PEr.E";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidSalt_uCUI2() {
        byte[] original = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
        String salt = "ab";
        String expected = "abtrW0Fly4.vA";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_EmptyOriginal_syoS3() {
        byte[] original = new byte[]{};
        String salt = "ab";
        String expected = "abmF1QH4PEr.E";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_OriginalLengthLessThanKeyLength_JYkG4() {
        byte[] original = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07};
        String salt = "ab";
        String expected = "ab             ";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_OriginalLengthGreaterThanKeyLength_vorz5() {
        byte[] original = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09};
        String salt = "ab";
        String expected = "abtrW0Fly4.vA";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_OriginalLengthGreaterThanKeyLengthAndSaltLength_LTRz7() {
        byte[] original = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a};
        String salt = "ab";
        String expected = "abtrW0Fly4.vA";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_InvalidSalt_uhHw1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "invalid";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidSalt_DXuK2() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "ab";
        String expected = "ab             ";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidOriginal_TuBB6() {
        byte[] original = "Hello World".getBytes();
        String salt = "ab";
        String expected = "Hello World";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_invalidSalt_eScc1() {
        byte[] original = new byte[10];
        String salt = "invalid";
        String expected = "Invalid salt value: invalid";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_validSalt_DLlZ2() {
        byte[] original = new byte[10];
        String salt = "abmF1QH4PEr.E";
        String expected = "abmF1QH4PEr.E";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_emptyOriginal_BeeA3() {
        byte[] original = new byte[0];
        String salt = "abmF1QH4PEr.E";
        String expected = "abmF1QH4PEr.E";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_validOriginalAndSalt_nXVX6() {
        byte[] original = new byte[10];
        String salt = "ab";
        String expected = "ab";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidOriginalAndSaltWithDifferentCharsetAndInvalidOriginal_aYNo9_Pudp0() {
        String original = "invalid";
        String salt = "salt";
        String result = UnixCrypt.crypt(original.getBytes(StandardCharsets.UTF_8), salt);
        assertEquals("saXlUNOwqeklQ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ValidSalt_InvalidKey_boOp4_VbKK0() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "ab";
        String key = "invalid";
        String expected = "abmF1QH4PEr.E";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }
}