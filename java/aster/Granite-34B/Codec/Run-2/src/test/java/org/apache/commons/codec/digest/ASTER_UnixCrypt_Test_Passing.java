/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnixCrypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_YDvd3() {
        String original = "password";
        String salt = null;
        String expected = null;
        String actual = UnixCrypt.crypt(original, salt);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_VNym2() {
        byte[] original = new byte[8];
        String salt = "ab";
        String result = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_wCjf3() {
        byte[] original = new byte[8];
        String salt = "ab";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals(13, result.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_TlGg3() {
        byte[] original = new byte[8];
        String salt = null;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals(13, result.length());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptySalt_obHk5() {
        byte[] original = new byte[8];
        String salt = "";
        try {
            UnixCrypt.crypt(original, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: ", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSalt_DPcW0() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "ab";
        String actual = unixCrypt.crypt(original, salt);
        String expected = "abQeX8x7ieVh2";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptySalt_VIPy3() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "";
        try {
            unixCrypt.crypt(original, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: ", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_crypt_0_aNJw0() throws Exception {
        byte[] original = new byte[0];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_crypt_1_QsCs1() throws Exception {
        byte[] original = new byte[0];
        String salt = "ab";
        String expected = "ab";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_crypt_3_otIy3() throws Exception {
        byte[] original = new byte[0];
        String salt = "ad";
        String expected = "ad";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_crypt_4_wSEK4() throws Exception {
        byte[] original = new byte[0];
        String salt = "ae";
        String expected = "ae";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_crypt_5_YmnX5() throws Exception {
        byte[] original = new byte[0];
        String salt = "afD27CvYSM8Xg";
        String expected = "afD27CvYSM8Xg";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_crypt_6_fJCQ6() throws Exception {
        byte[] original = new byte[0];
        String salt = "agzcvMja7jm/.";
        String expected = "agzcvMja7jm/.";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_crypt_7_EIIk7() throws Exception {
        byte[] original = new byte[0];
        String salt = "ah";
        String expected = "ah";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_crypt_8_GKmi8() throws Exception {
        byte[] original = new byte[0];
        String salt = "ai";
        String expected = "ai";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_crypt_9_YAtG9() throws Exception {
        byte[] original = new byte[0];
        String salt = "ajUG1rGJ.j9xk";
        String expected = "ajUG1rGJ.j9xk";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLength1AndSaltLength2_NpXS2() {
        byte[] original = {0x00};
        String salt = "abmF1QH4PEr.E";
        String expected = "abmF1QH4PEr.E";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLength1AndSaltLength3_UZSf3() {
        byte[] original = {0x00};
        String salt = "abc";
        String expected = "abc";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLength2AndSaltLength2_aWzu5() {
        byte[] original = {0x00, 0x01};
        String salt = "ab";
        String expected = "ab";
        String actual = UnixCrypt.crypt(original, salt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLength2AndSaltLength3_NAhe6() {
        byte[] original = {0x00, 0x01};
        String salt = "ab5RPZElElvj2";
        String expected = "ab5RPZElElvj2";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLength3AndSaltLength2_NpUz8() {
        byte[] original = {0x00, 0x01, 0x02};
        String salt = "abDh/0zz0Pers";
        String expected = "abDh/0zz0Pers";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_QjYz2() {
        final String validSalt = "abmF1QH4PEr.E";
        final String expected = "abmF1QH4PEr.E";
        final String actual = UnixCrypt.crypt(new byte[8], validSalt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_fkEQ1() {
        byte[] original = new byte[0];
        String salt = "12";
        String expected = "12";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_DHLw2() {
        byte[] original = new byte[0];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNonEmptyOriginal_kOam4() {
        byte[] original = new byte[]{0x01, 0x02, 0x03};
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithFullOriginal_meiz5() {
        byte[] original = new byte[8];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthOne_fKon6() {
        byte[] original = new byte[1];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthTwo_HOdG7() {
        byte[] original = new byte[2];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthThree_kyup8() {
        byte[] original = new byte[3];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthFour_zwPy9() {
        byte[] original = new byte[4];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthFive_wrFs10() {
        byte[] original = new byte[5];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthSix_uSQm11() {
        byte[] original = new byte[6];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthSeven_Ggmq12() {
        byte[] original = new byte[7];
        String salt = "aa";
        String expected = "aa";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual.substring(0, 2));
    }
}