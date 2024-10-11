/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnixCrypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_zXoB0() throws Exception {
        byte[] original = new byte[10];
        String result = UnixCrypt.crypt(original, null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_ymbd0() throws Exception {
        String original = "password";
        String salt = "$6$salt$";
        String expected = "$6$salt$";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_riJE0() throws Exception {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "ab";
        String expected = "             ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_ixYs1() throws Exception {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = null;
        String expected = "             ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_tDYa2() throws Exception {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "abc";
        IllegalArgumentException e =
        new IllegalArgumentException("Invalid salt value: abc");
        try {
            UnixCrypt.crypt(original, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertEquals(e.getMessage(), ex.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptySalt_rHcj3() throws Exception {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "";
        String expected = "             ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidOriginal_xBTT4() throws Exception {
        byte[] original = new byte[]{-1, -2, -3, -4, -5, -6, -7, -8};
        String salt = "ab";
        IllegalArgumentException e =
        new IllegalArgumentException("Invalid original value: [-1, -2, -3, -4, -5, -6, -7, -8]");
        try {
            UnixCrypt.crypt(original, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertEquals(e.getMessage(), ex.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_ywCC0() throws Exception {
        String salt = null;
        String expected = "             ";
        String actual = UnixCrypt.crypt(new byte[0], salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_ZqvW1() throws Exception {
        String salt = "ab";
        try {
            UnixCrypt.crypt(new byte[0], salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_HcbA2() throws Exception {
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(new byte[0], salt);
        assertTrue(actual.startsWith(expected));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortPassword_kSSN4() throws Exception {
        String salt = "ab";
        byte[] password = new byte[8];
        Arrays.fill(password, (byte) 0);
        String expected = "ab....";
        String actual = UnixCrypt.crypt(password, salt);
        assertTrue(actual.startsWith(expected));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongPassword_jBNA5() throws Exception {
        String salt = "ab";
        byte[] password = new byte[16];
        Arrays.fill(password, (byte) 0);
        String expected = "ab....";
        String actual = UnixCrypt.crypt(password, salt);
        assertTrue(actual.startsWith(expected));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndSalt_oXYs6() throws Exception {
        String salt = "ab";
        byte[] password = new byte[8];
        password[0] = 1;
        String expected = "ab....";
        String actual = UnixCrypt.crypt(password, salt);
        assertTrue(actual.startsWith(expected));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndSalt2_BfrI7() throws Exception {
        String salt = "ab";
        byte[] password = new byte[8];
        password[0] = 1;
        password[1] = 2;
        String expected = "ab....";
        String actual = UnixCrypt.crypt(password, salt);
        assertTrue(actual.startsWith(expected));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndSalt3_pNLz8() throws Exception {
        String salt = "ab";
        byte[] password = new byte[8];
        password[0] = 1;
        password[1] = 2;
        password[2] = 3;
        String expected = "ab....";
        String actual = UnixCrypt.crypt(password, salt);
        assertTrue(actual.startsWith(expected));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndSalt4_eQWD9() throws Exception {
        String salt = "ab";
        byte[] password = new byte[8];
        password[0] = 1;
        password[1] = 2;
        password[2] = 3;
        password[3] = 4;
        String expected = "ab....";
        String actual = UnixCrypt.crypt(password, salt);
        assertTrue(actual.startsWith(expected));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_QKmk0() throws Exception {
        String salt = null;
        String encrypted = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("$1$0000000$000000000000000", encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_eEKE1() throws Exception {
        String salt = "invalid";
        try {
            UnixCrypt.crypt(new byte[8], salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: invalid", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_VPqj2() throws Exception {
        String salt = "$1$0000000$";
        String encrypted = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("$1$0000000$000000000000000", encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyPassword_nVRC3() throws Exception {
        String salt = "$1$0000000$";
        String encrypted = UnixCrypt.crypt(new byte[0], salt);
        assertEquals("$1$0000000$000000000000000", encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortPassword_mUhY4() throws Exception {
        String salt = "$1$0000000$";
        String encrypted = UnixCrypt.crypt(new byte[1], salt);
        assertEquals("$1$0000000$000000000000000", encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMediumPassword_dRji5() throws Exception {
        String salt = "$1$0000000$";
        String encrypted = UnixCrypt.crypt(new byte[2], salt);
        assertEquals("$1$0000000$000000000000000", encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongPassword_lAdJ6() throws Exception {
        String salt = "$1$0000000$";
        String encrypted = UnixCrypt.crypt(new byte[3], salt);
        assertEquals("$1$0000000$000000000000000", encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithVeryLongPassword_QvfI7() throws Exception {
        String salt = "$1$0000000$";
        String encrypted = UnixCrypt.crypt(new byte[4], salt);
        assertEquals("$1$0000000$000000000000000", encrypted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndInvalidSalt_lwAt9() throws Exception {
        String salt = "$1$0000000$invalid";
        try {
            UnixCrypt.crypt(new byte[8], salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: invalid", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndValidSalt_ZGOZ10() throws Exception {
        String salt = "$1$0000000$0000000";
        String encrypted = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("$1$0000000$000000000000000", encrypted);
    }
}