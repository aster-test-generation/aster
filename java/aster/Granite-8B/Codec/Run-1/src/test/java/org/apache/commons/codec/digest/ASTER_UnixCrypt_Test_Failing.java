/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_UnixCrypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_HOBJ0() {
        byte[] original = new byte[10]; // Assuming the length of the original byte array
        String expected = "ROGbG5FGo6/zo"; // Replace with the expected encrypted string
        String actual = UnixCrypt.crypt(original, null);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_YXxZ0() {
        String salt = null;
        String expected = "u9A40joj08mfA";
        String actual = UnixCrypt.crypt(new byte[0], salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_TiZf1() {
        String salt = "abc";
        try {
            UnixCrypt.crypt(new byte[0], salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: " + salt, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_CbDE1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = null;
        String expected = "8dDmP0mm0EkEU";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_mVzx0() {
        String salt = null;
        String result = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("ZvnmlmlbjZik6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_ZiRj1() {
        String salt = "abc";
        try {
            UnixCrypt.crypt(new byte[8], salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: abc", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthZero_dcfw2() {
        String salt = "$1$000000000000000";
        byte[] original = new byte[0];
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthOne_BmQe3() {
        String salt = "$1$000000000000000";
        byte[] original = new byte[1];
        original[0] = 1;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthTwo_TRQt4() {
        String salt = "$1$0000000000000000";
        byte[] original = new byte[2];
        original[0] = 1;
        original[1] = 2;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$0000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthThree_qyAK5() {
        String salt = "$1$0000000000000000";
        byte[] original = new byte[3];
        original[0] = 1;
        original[1] = 2;
        original[2] = 3;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$0000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthFour_peDh6() {
        String salt = "$1$0000000000000000";
        byte[] original = new byte[4];
        original[0] = 1;
        original[1] = 2;
        original[2] = 3;
        original[3] = 4;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$0000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthFive_JrKG7() {
        String salt = "$1$0000000000000000";
        byte[] original = new byte[5];
        original[0] = 1;
        original[1] = 2;
        original[2] = 3;
        original[3] = 4;
        original[4] = 5;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$0000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthSix_rYyL8() {
        String salt = "$1$0000000000000000";
        byte[] original = new byte[6];
        original[0] = 1;
        original[1] = 2;
        original[2] = 3;
        original[3] = 4;
        original[4] = 5;
        original[5] = 6;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$0000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_SQaa0() {
        String salt = null;
        String result = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("9sWX2vFuC/s52", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_CfWZ1() {
        String salt = "invalid";
        try {
            UnixCrypt.crypt(new byte[8], salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: " + salt, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyPassword_GRvc3() {
        byte[] password = new byte[0];
        String result = UnixCrypt.crypt(password, null);
        assertEquals("esNtQ94ZLfhn6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortPassword_lMoH4() {
        byte[] password = new byte[7];
        Arrays.fill(password, (byte) 0x41);
        String result = UnixCrypt.crypt(password, null);
        assertEquals("Rb45rHsgXn6ns", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongPassword_gWzS5() {
        byte[] password = new byte[8];
        Arrays.fill(password, (byte) 0x41);
        String result = UnixCrypt.crypt(password, null);
        assertEquals("BhagL3.DTA3eU", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndInvalidSalt_mQWS9() {
        byte[] password = new byte[8];
        Arrays.fill(password, (byte) 0x41);
        String salt = "invalid";
        try {
            UnixCrypt.crypt(password, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: " + salt, e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_HjaS0() {
        String salt = null;
        String result = UnixCrypt.crypt(new byte[0], salt);
        assertEquals("mTpaGFrsYht12", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyPassword_WqDt3() {
        String result = UnixCrypt.crypt(new byte[0], null);
        assertEquals("r2l9HGWleCBSg", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortPassword_xYxZ4() {
        byte[] password = {'a'};
        String result = UnixCrypt.crypt(password, null);
        assertEquals("GhzOYb83cpkY.", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMediumPassword_hdCi5() {
        byte[] password = {'a', 'b', 'c'};
        String result = UnixCrypt.crypt(password, null);
        assertEquals("OLtzTR/Pk0rSc", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongPassword_ZAJs6() {
        byte[] password = new byte[8];
        Arrays.fill(password, (byte) 'a');
        String result = UnixCrypt.crypt(password, null);
        assertEquals("UUCWUifgQ6qGs", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithVeryLongPassword_bYLd7() {
        byte[] password = new byte[16];
        Arrays.fill(password, (byte) 'a');
        String result = UnixCrypt.crypt(password, null);
        assertEquals("/wHP8fElGkz96", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMaximumLengthPassword_TqxD8() {
        byte[] password = new byte[24];
        Arrays.fill(password, (byte) 'a');
        String result = UnixCrypt.crypt(password, null);
        assertEquals("2jjA/HXN94yIc", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_sKRf0() {
        String salt = null;
        byte[] original = new byte[8];
        String expected = "n.sd2.DXgfi2o";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_wgQL2() {
        String salt = "abc";
        byte[] original = new byte[8];
        try {
            UnixCrypt.crypt(original, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: abc", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_WREH1() {
        byte[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String salt = null;
        String expected = "gsyCoToXmH5/I";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_tCsp2_1() {
        byte[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String salt = "abc";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptySalt_suju3() {
        byte[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String salt = "";
        String expected = "             ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidOriginal_gSYt4_1() {
        byte[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String salt = "ab";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullOriginal_dbnv5_1() {
        byte[] original = null;
        String salt = "ab";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_aasf0_fid1() {
        String original = "password";
        String salt = "abc";
        String expected = "abc";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_HOBJ0_fid1() {
        byte[] original = new byte[10]; // Assuming the length of the original byte array
        String expected = "encryptedString"; // Replace with the expected encrypted string
        String actual = UnixCrypt.crypt(original, null);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_YXxZ0_fid1() {
        String salt = null;
        String expected = "             ";
        String actual = UnixCrypt.crypt(new byte[0], salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_TiZf1_fid1() {
        String salt = "abc";
        try {
            UnixCrypt.crypt(new byte[0], salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: abc", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_HDDP0_fid1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_CbDE1_fid1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        String salt = null;
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthGreaterThanKeyLength_sBrj3_fid1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthLessThanKeyLength_OrpJ4_fid1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5, 6};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthZero_UbXi5_fid1() {
        byte[] original = new byte[0];
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthOne_mHld6_fid1() {
        byte[] original = new byte[]{0};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthTwo_iank7_fid1() {
        byte[] original = new byte[]{0, 1};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthThree_rPqh8_fid1() {
        byte[] original = new byte[]{0, 1, 2};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthFour_daIK9_fid1() {
        byte[] original = new byte[]{0, 1, 2, 3};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthFive_RxZE10_fid1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthSix_ihsY11_fid1() {
        byte[] original = new byte[]{0, 1, 2, 3, 4, 5};
        String salt = "ab";
        String expected = "ab....";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_mVzx0_fid1() {
        String salt = null;
        String result = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthTwo_TRQt4_fid1() {
        String salt = "$1$000000000000000";
        byte[] original = new byte[2];
        original[0] = 1;
        original[1] = 2;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthThree_qyAK5_fid1() {
        String salt = "$1$000000000000000";
        byte[] original = new byte[3];
        original[0] = 1;
        original[1] = 2;
        original[2] = 3;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthFour_peDh6_fid1() {
        String salt = "$1$000000000000000";
        byte[] original = new byte[4];
        original[0] = 1;
        original[1] = 2;
        original[2] = 3;
        original[3] = 4;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthFive_JrKG7_fid1() {
        String salt = "$1$000000000000000";
        byte[] original = new byte[5];
        original[0] = 1;
        original[1] = 2;
        original[2] = 3;
        original[3] = 4;
        original[4] = 5;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithOriginalLengthSix_rYyL8_fid1() {
        String salt = "$1$000000000000000";
        byte[] original = new byte[6];
        original[0] = 1;
        original[1] = 2;
        original[2] = 3;
        original[3] = 4;
        original[4] = 5;
        original[5] = 6;
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("$1$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_SQaa0_fid1() {
        String salt = null;
        String result = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("$1$0000000$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_CfWZ1_fid1() {
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
    public void testCryptWithValidSalt_fJfI2_fid1() {
        String salt = "ab";
        String result = UnixCrypt.crypt(new byte[8], salt);
        assertEquals("$1$ab$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyPassword_GRvc3_fid1() {
        byte[] password = new byte[0];
        String result = UnixCrypt.crypt(password, null);
        assertEquals("$1$0000000$000000000000000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortPassword_lMoH4_fid1() {
        byte[] password = new byte[7];
        Arrays.fill(password, (byte) 0x41);
        String result = UnixCrypt.crypt(password, null);
        assertEquals("$1$0000000$414141414141414", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongPassword_gWzS5_fid1() {
        byte[] password = new byte[8];
        Arrays.fill(password, (byte) 0x41);
        String result = UnixCrypt.crypt(password, null);
        assertEquals("$1$0000000$4141414141414141", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndSalt_ipuK6_fid1() {
        byte[] password = new byte[8];
        Arrays.fill(password, (byte) 0x41);
        String salt = "ab";
        String result = UnixCrypt.crypt(password, salt);
        assertEquals("$1$ab$4141414141414141", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndLongSalt_ZSdJ7_fid1() {
        byte[] password = new byte[8];
        Arrays.fill(password, (byte) 0x41);
        String salt = "abcdefgh";
        String result = UnixCrypt.crypt(password, salt);
        assertEquals("$1$abcdefgh$4141414141414141", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithPasswordAndInvalidSalt_mQWS9_fid1() {
        byte[] password = new byte[8];
        Arrays.fill(password, (byte) 0x41);
        String salt = "invalid";
        try {
            UnixCrypt.crypt(password, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid salt value: invalid", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_HjaS0_fid1() {
        String salt = null;
        String result = UnixCrypt.crypt(new byte[0], salt);
        assertEquals("$1$!!$!!!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_mLse2_fid1() {
        String salt = "ab";
        String result = UnixCrypt.crypt(new byte[0], salt);
        assertEquals("$1$ab$!!!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyPassword_WqDt3_fid1() {
        String result = UnixCrypt.crypt(new byte[0], null);
        assertEquals("$1$!!$!!!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithShortPassword_xYxZ4_fid1() {
        byte[] password = {'a'};
        String result = UnixCrypt.crypt(password, null);
        assertEquals("$1$!!$!!!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMediumPassword_hdCi5_fid1() {
        byte[] password = {'a', 'b', 'c'};
        String result = UnixCrypt.crypt(password, null);
        assertEquals("$1$!!$!!!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithLongPassword_ZAJs6_fid1() {
        byte[] password = new byte[8];
        Arrays.fill(password, (byte) 'a');
        String result = UnixCrypt.crypt(password, null);
        assertEquals("$1$!!$!!!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithVeryLongPassword_bYLd7_fid1() {
        byte[] password = new byte[16];
        Arrays.fill(password, (byte) 'a');
        String result = UnixCrypt.crypt(password, null);
        assertEquals("$1$!!$!!!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithMaximumLengthPassword_TqxD8_fid1() {
        byte[] password = new byte[24];
        Arrays.fill(password, (byte) 'a');
        String result = UnixCrypt.crypt(password, null);
        assertEquals("$1$!!$!!!", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_sKRf0_fid1() {
        String salt = null;
        byte[] original = new byte[8];
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithSalt_ijhF1_fid1() {
        String salt = "ab";
        byte[] original = new byte[8];
        String expected = "ab....../";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_mged0_1() {
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_mged0_2() {
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, "aa"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_mged0_3() {
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, "ab"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_mged0_4() {
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, "ba"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_mged0_5() {
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, "bb"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_GcKD0_fid1() {
        byte[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String salt = "ab";
        String expected = "             ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_WREH1_fid1() {
        byte[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String salt = null;
        String expected = "             ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_mged0() {
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, null));
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, "aa"));
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, "ab"));
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, "ba"));
        assertEquals("x", UnixCrypt.crypt(new byte[]{0}, "bb"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_tCsp2() {
        byte[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String salt = "abc";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
        assertEquals("Invalid salt value: abc", e.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidOriginal_gSYt4() {
        byte[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String salt = "ab";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
        assertEquals("Invalid original value: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", e.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullOriginal_dbnv5() {
        byte[] original = null;
        String salt = "ab";
        IllegalArgumentException e = Assertions.assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, salt));
        assertEquals("Invalid original value: null", e.getMessage());
    }
}