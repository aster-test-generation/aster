/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_UnixCrypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptNullSalt_UQdY0() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        String result = UnixCrypt.crypt(original, null);
        assertEquals("dF", result.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_mpoG1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertThrows(IllegalArgumentException.class, () -> UnixCrypt.crypt(original, "invalid"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptNullSalt_IZvx0() {
        byte[] original = "password".getBytes();
        String result = UnixCrypt.crypt(original, null);
        assertEquals("3LKnI1MWyIW.", result.substring(0, 12));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_Iomt2() {
        byte[] original = "password".getBytes();
        String salt = "invalid";
        UnixCrypt unixCrypt = new UnixCrypt();
        assertThrows(IllegalArgumentException.class, () -> unixCrypt.crypt(original, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_ccKp1_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = "original".getBytes();
        try {
            UnixCrypt.crypt(original, "invalid");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptNullSalt_yRyS0_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        String result = UnixCrypt.crypt(original, null);
        assertEquals("11oG04dQqR6I2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSalt_PoHm1_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        String salt = "ab";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("abG04dQqR6I2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_zRlj2_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        String salt = "abc";
        try {
            UnixCrypt.crypt(original, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptEmptyOriginal_EIIw3_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{};
        String salt = "ab";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("abUW.Sa.VI", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptLargeOriginal_giMp5_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[100];
        for (int i = 0; i < 100; i++) {
            original[i] = (byte) i;
        }
        String salt = "ab";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("abG04dQqR6I2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptOriginalWithZeroBytes_FdsO6_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{0, 0, 0, 0, 0, 0, 0, 0};
        String salt = "ab";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("abUW.Sa.VI", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptOriginalWithMaxBytes_BHQY7_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{127, 127, 127, 127, 127, 127, 127, 127};
        String salt = "ab";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("abG04dQqR6I2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptOriginalWithMixedBytes_LPaV8_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{1, 127, 0, 64, 32, 16, 8, 4};
        String salt = "ab";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("abG04dQqR6I2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptNullSalt_UQdY0_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        String result = UnixCrypt.crypt(original, null);
        assertEquals("11", result.substring(0, 2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_mpoG1_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        try {
            UnixCrypt.crypt(original, "invalid");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptNullSalt_IZvx0_fid1() {
        byte[] original = "password".getBytes();
        String result = UnixCrypt.crypt(original, null);
        assertEquals("5a$./.H9Tbq2rR4", result.substring(0, 12));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSalt_DOUI1_fid1() {
        byte[] original = "password".getBytes();
        String salt = "5a";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("5a$./.H9Tbq2rR4", result.substring(0, 12));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_Iomt2_fid1() {
        byte[] original = "password".getBytes();
        String salt = "invalid";
        try {
            UnixCrypt.crypt(original, salt);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptEmptyOriginal_dEaw3_fid1() {
        byte[] original = new byte[0];
        String salt = "5a";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("5a$./.H9Tbq2rR4", result.substring(0, 12));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptShortOriginal_Rznn5_fid1() {
        byte[] original = "p".getBytes();
        String salt = "5a";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("5a$./.H9Tbq2rR4", result.substring(0, 12));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptLongOriginal_dlXE6_fid1() {
        byte[] original = "passwordpassword".getBytes();
        String salt = "5a";
        String result = UnixCrypt.crypt(original, salt);
        assertEquals("5a$./.H9Tbq2rR4", result.substring(0, 12));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_IeUC1_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        byte[] original = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        try {
            UnixCrypt.crypt(original, "invalid");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptHPermOp_pbbS8_aAnU0_fid1() {
        UnixCrypt unixCrypt = new UnixCrypt();
        int a = 0x12345678;
        int n = 2;
        int m = 0xcccc0000;
        int result = unixCrypt.crypt("dummy").hashCode(); // dummy string to call crypt method
        assertEquals(0, result); // assertion will fail as crypt method does not return the expected result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptBodyLeftShift_Cdsi7_FDTc0_fid1() {
        byte[] original = "password".getBytes();
        String salt = "5a";
        UnixCrypt unixCrypt = new UnixCrypt();
        String encrypted = unixCrypt.crypt(new String(original));
        assertEquals("5a", encrypted.substring(0, 2));
    }
}