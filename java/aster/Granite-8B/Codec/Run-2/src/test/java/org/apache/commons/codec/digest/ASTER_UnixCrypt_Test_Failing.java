/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnixCrypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_txtP1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = null;
        String expected = "W8mWKMPa2RIcU";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_dgYX2_1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "abc";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_VbUi0() {
        byte[] original = new byte[10];
        String result = UnixCrypt.crypt(original, null);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_oeOp0_fid1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "ab";
        String expected = "ab2v.5.3.1.1.1.1";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_txtP1_fid1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = null;
        String expected = "ab2v.5.3.1.1.1.1";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_CqwE0() {
        String salt = null;
        String result = UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_yhQW1() {
        String salt = "ab";
        try {
            UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: ab", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_Bxpi2() {
        String salt = "ab";
        String result = UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
        assertEquals("$1$ab00000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptySalt_RJNl3() {
        String salt = "";
        String result = UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortSalt_kYtc4() {
        String salt = "a";
        String result = UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
        assertEquals("$1$a000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongSalt_glax5() {
        String salt = "abcdefghijklmn";
        String result = UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
        assertEquals("$1$abcdefghijklmn0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDuplicateSalt_EkxP6() {
        String salt = "aa";
        String result = UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
        assertEquals("$1$aa00000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSaltCharacters_AczR8() {
        String salt = "ab.";
        String result = UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
        assertEquals("$1$ab.00000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithAllSaltCharacters_WIXz9() {
        String salt = "./0";
        String result = UnixCrypt.crypt(new byte[]{0, 1, 2, 3}, salt);
        assertEquals("$1$./000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_ELnu0() {
        byte[] original = "password".getBytes();
        String salt = null;
        String expected = "$1$0000000$000000000000000000000000000000000000000";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_RHHc1() {
        byte[] original = "password".getBytes();
        String salt = "abc";
        try {
            UnixCrypt.crypt(original, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptySalt_PPyh2() {
        byte[] original = "password".getBytes();
        String salt = "";
        String expected = "$1$0000000$000000000000000000000000000000000000000";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithCustomSalt_hoTF3() {
        byte[] original = "password".getBytes();
        String salt = "$1$0000000$";
        String expected = "$1$0000000$000000000000000000000000000000000000000";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyOriginalPassword_ykSF5() {
        byte[] original = "".getBytes();
        String salt = "$1$0000000$";
        String expected = "$1$0000000$000000000000000000000000000000000000000";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_uTtA0() {
        String salt = null;
        String encryptedPassword = UnixCrypt.crypt(new byte[]{0, 1, 2, 3, 4, 5, 6, 7}, salt);
        assertEquals("$1$0000000$5678901234567890", encryptedPassword);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_pSkj1() {
        String salt = "abc";
        try {
            UnixCrypt.crypt(new byte[]{0, 1, 2, 3, 4, 5, 6, 7}, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: abc", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_gyZW2() {
        String salt = "ab";
        String encryptedPassword = UnixCrypt.crypt(new byte[]{0, 1, 2, 3, 4, 5, 6, 7}, salt);
        assertEquals("$1$ab000000$5678901234567890", encryptedPassword);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyPassword_FEAE3() {
        String encryptedPassword = UnixCrypt.crypt(new byte[]{}, "ab");
        assertEquals("$1$ab000000$5678901234567890", encryptedPassword);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortPassword_QTyb4() {
        String encryptedPassword = UnixCrypt.crypt(new byte[]{0, 1, 2, 3, 4, 5, 6}, "ab");
        assertEquals("$1$ab000000$5678901234567890", encryptedPassword);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongPassword_fdaD5() {
        String encryptedPassword = UnixCrypt.crypt(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63}, "ab");
        assertEquals("$1$ab000000$5678901234567890", encryptedPassword);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyPasswordAndSalt_zbDL6() {
        String encryptedPassword = UnixCrypt.crypt(new byte[]{}, "");
        assertEquals("$1$0000000$5678901234567890", encryptedPassword);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_xFzC0() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "ab";
        String expected = "ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_eEUr0() {
        byte[] original = "password".getBytes();
        String salt = "ab";
        String expected = "$1$ab$c.7.9.8.7.6.5.4.3.2.1.0/.-,+*";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_HKbi1() {
        byte[] original = "password".getBytes();
        String salt = null;
        String expected = "$1$ab$c.7.9.8.7.6.5.4.3.2.1.0/.-,+*";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_vuMy2() {
        byte[] original = "password".getBytes();
        String salt = "abc";
        try {
            UnixCrypt.crypt(original, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: abc", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortOriginal_mrvX3() {
        byte[] original = "pass".getBytes();
        String salt = "ab";
        String expected = "$1$ab$c.7.9.8.7.6.5.4.3.2.1.0/.-,+*";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongOriginal_IlEm4() {
        byte[] original = "password1234567890".getBytes();
        String salt = "ab";
        String expected = "$1$ab$c.7.9.8.7.6.5.4.3.2.1.0/.-,+*";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyOriginal_chDj5() {
        byte[] original = new byte[0];
        String salt = "ab";
        String expected = "$1$ab$c.7.9.8.7.6.5.4.3.2.1.0/.-,+*";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_NcwF0() {
        String salt = null;
        String result = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("$1$0000000$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_SLzY1() {
        String salt = "ab";
        try {
            UnixCrypt.crypt(new byte[8], salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: ab", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_gWlT2() {
        String salt = "ab";
        String result = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("$1$ab$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyPassword_bPPa3() {
        String salt = "ab";
        String result = UnixCrypt.crypt(new byte[0], salt);
        assertEquals("$1$ab$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortPassword_lnTE4() {
        String salt = "ab";
        byte[] password = new byte[1];
        String result = UnixCrypt.crypt(password, salt);
        assertEquals("$1$ab$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMediumPassword_YdgE5() {
        String salt = "ab";
        byte[] password = new byte[7];
        String result = UnixCrypt.crypt(password, salt);
        assertEquals("$1$ab$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongPassword_jBIN6() {
        String salt = "ab";
        byte[] password = new byte[8];
        String result = UnixCrypt.crypt(password, salt);
        assertEquals("$1$ab$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithVeryLongPassword_Ruzu7() {
        String salt = "ab";
        byte[] password = new byte[9];
        String result = UnixCrypt.crypt(password, salt);
        assertEquals("$1$ab$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMaximumLengthPassword_dKPu8() {
        String salt = "ab";
        byte[] password = new byte[16];
        String result = UnixCrypt.crypt(password, salt);
        assertEquals("$1$ab$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_SGfb0() {
        byte[] original = new byte[]{0, 1, 2, 3};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_eJvh1() {
        byte[] original = new byte[]{0, 1, 2, 3};
        String salt = null;
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_zrbc2_1() {
        byte[] original = new byte[]{0, 1, 2, 3};
        String salt = "abc";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_dgYX2() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "abc";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
        assertEquals("Invalid salt value: abc", e.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_zrbc2() {
        byte[] original = new byte[]{0, 1, 2, 3};
        String salt = "abc";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
        assertEquals("Invalid salt value: abc", e.getMessage());
    }
}