/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_UnixCrypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_tPZn0() {
        String original = "test";
        String salt = "salt";
        String result = UnixCrypt.crypt(original, salt);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_UPdK1() {
        byte[] original = new byte[8];
        String result = UnixCrypt.crypt(original, "InvalidSalt");
        assertEquals("InwYRMMnZrlAQ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSalt_pDOv2() {
        byte[] original = new byte[8];
        String result = UnixCrypt.crypt(original, "ValidSalt");
        assertEquals("VakRFTsfOFlzA", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKey_eUTd3() {
        byte[] original = new byte[8];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) i;
        }
        String result = UnixCrypt.crypt(original, "ValidSalt");
        assertEquals("VadF7C.8wo8iM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithLongKey_xZHc4() {
        byte[] original = new byte[16];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) i;
        }
        String result = UnixCrypt.crypt(original, "ValidSalt");
        assertEquals("VadF7C.8wo8iM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithShortKey_Qupv5() {
        byte[] original = new byte[4];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) i;
        }
        String result = UnixCrypt.crypt(original, "ValidSalt");
        assertEquals("VaAfl.QT7jTsE", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithEmptyKey_CPby6() {
        byte[] original = new byte[0];
        String result = UnixCrypt.crypt(original, "ValidSalt");
        assertEquals("VakRFTsfOFlzA", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKeyAndSalt_QjMc8() {
        byte[] original = new byte[8];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) i;
        }
        String result = UnixCrypt.crypt(original, "ValidSaltWithKey");
        assertEquals("VadF7C.8wo8iM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_bQpC1() {
        String original = "HelloWorld";
        String result = UnixCrypt.crypt(original.getBytes(), "InvalidSalt");
        assertEquals("In.iirdZvNa3Y", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSalt_dvkJ2() {
        String original = "HelloWorld";
        String result = UnixCrypt.crypt(original.getBytes(), "ValidSalt");
        assertEquals("VaUqp6CxNpbP6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKey_MmcV3() {
        String original = "HelloWorld";
        byte[] key = new byte[8];
        Arrays.fill(key, (byte) 0);
        String result = UnixCrypt.crypt(original.getBytes(), "ValidSalt");
        assertEquals("VaUqp6CxNpbP6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKeyAndSchedule_ZxOP4() {
        String original = "HelloWorld";
        byte[] key = new byte[8];
        Arrays.fill(key, (byte) 0);
        int[] schedule = new int[32];
        String result = UnixCrypt.crypt(original.getBytes(), "ValidSalt");
        assertEquals("VaUqp6CxNpbP6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKeyAndScheduleAndOut_nCjF5() {
        String original = "HelloWorld";
        byte[] key = new byte[8];
        Arrays.fill(key, (byte) 0);
        int[] schedule = new int[32];
        int[] out = new int[2];
        String result = UnixCrypt.crypt(original.getBytes(), "ValidSalt");
        assertEquals("VaUqp6CxNpbP6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKeyAndScheduleAndOutAndB_MYfD6() {
        String original = "HelloWorld";
        byte[] key = new byte[8];
        Arrays.fill(key, (byte) 0);
        int[] schedule = new int[32];
        int[] out = new int[2];
        byte[] b = new byte[9];
        String result = UnixCrypt.crypt(original.getBytes(), "ValidSalt");
        assertEquals("VaUqp6CxNpbP6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKeyAndScheduleAndOutAndBAndI_cNEa7() {
        String original = "HelloWorld";
        byte[] key = new byte[8];
        Arrays.fill(key, (byte) 0);
        int[] schedule = new int[32];
        int[] out = new int[2];
        byte[] b = new byte[9];
        int i = 2;
        String result = UnixCrypt.crypt(original.getBytes(), "ValidSalt");
        assertEquals("VaUqp6CxNpbP6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKeyAndScheduleAndOutAndBAndIAndY_UUkf8() {
        String original = "HelloWorld";
        byte[] key = new byte[8];
        Arrays.fill(key, (byte) 0);
        int[] schedule = new int[32];
        int[] out = new int[2];
        byte[] b = new byte[9];
        int i = 2;
        int y = 0;
        String result = UnixCrypt.crypt(original.getBytes(), "ValidSalt");
        assertEquals("VaUqp6CxNpbP6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKeyAndScheduleAndOutAndBAndIAndYAndU_wpvm9() {
        String original = "HelloWorld";
        byte[] key = new byte[8];
        Arrays.fill(key, (byte) 0);
        int[] schedule = new int[32];
        int[] out = new int[2];
        byte[] b = new byte[9];
        int i = 2;
        int y = 0;
        int u = 128;
        String result = UnixCrypt.crypt(original.getBytes(), "ValidSalt");
        assertEquals("VaUqp6CxNpbP6", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSalt_bhyj2() {
        byte[] original = new byte[0];
        String salt = "ValidSalt";
        assertEquals("VakRFTsfOFlzA", UnixCrypt.crypt(original, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithKey_AOPw3() {
        byte[] original = new byte[]{1, 2, 3, 4};
        String salt = "ValidSalt";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithLongKey_DVEY4() {
        byte[] original = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        String salt = "ValidSalt";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithShortKey_gLQp5() {
        byte[] original = new byte[]{1, 2};
        String salt = "ValidSalt";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithEmptyKey_dCoz6() {
        byte[] original = new byte[0];
        String salt = "ValidSalt";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithNullKey_QbnM7() {
        byte[] original = null;
        String salt = "ValidSalt";
        try {
            UnixCrypt.crypt(original, salt);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithLongOriginal_fkMC8() {
        byte[] original = new byte[16];
        String salt = "ValidSalt";
        assertEquals("VakRFTsfOFlzA", UnixCrypt.crypt(original, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithShortOriginal_OQVf9() {
        byte[] original = new byte[1];
        String salt = "ValidSalt";
        assertEquals("VakRFTsfOFlzA", UnixCrypt.crypt(original, salt));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_cKsP1() {
        byte[] original = new byte[0];
        String result = UnixCrypt.crypt(original, "InvalidSalt");
        assertEquals("InwYRMMnZrlAQ", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithOriginalData_ALEJ3() {
        byte[] original = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4};
        String result = UnixCrypt.crypt(original, "ValidSalt");
        assertEquals("Vakect9IkmqQs", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithLongOriginalData_IWaP4() {
        byte[] original = new byte[10];
        for (int i = 0; i < 10; i++) {
            original[i] = (byte) i;
        }
        String result = UnixCrypt.crypt(original, "ValidSalt");
        assertEquals("VadF7C.8wo8iM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithShortOriginalData_eFvs7() {
        byte[] original = new byte[5];
        for (int i = 0; i < 5; i++) {
            original[i] = (byte) i;
        }
        String result = UnixCrypt.crypt(original, "ValidSalt");
        assertEquals("Va3jjGi3EVea.", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithLongOriginalDataAndInvalidSalt_ajOa9() {
        byte[] original = new byte[10];
        for (int i = 0; i < 10; i++) {
            original[i] = (byte) i;
        }
        String result = UnixCrypt.crypt(original, "InvalidSalt");
        assertEquals("InoEMdvF.k2v.", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithOriginalAndDifferentLength_tZcr4() {
        byte[] original = new byte[10];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) i;
        }
        String result = UnixCrypt.crypt(original, "ValidSalt");
        assertEquals("VadF7C.8wo8iM", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithOriginalAndNullLength_jqeR7() {
        byte[] original = null;
        try {
            UnixCrypt.crypt(original, "ValidSalt");
            assertEquals(false, true);
        } catch (NullPointerException e) {
            assertEquals(true, true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSalt_JObN2() {
        byte[] original = new byte[0];
        String result = UnixCrypt.crypt(original, "salt");
        assertEquals("saFLGt/QKS6yw", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithOriginalData_mSFC3() {
        byte[] original = new byte[]{1, 2, 3, 4};
        String result = UnixCrypt.crypt(original, "salt");
        assertEquals("sanMgaSDi4MSU", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithLongOriginalData_snCK4() {
        byte[] original = new byte[10];
        String result = UnixCrypt.crypt(original, "salt");
        assertEquals("saFLGt/QKS6yw", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithShortOriginalData_DCvf5() {
        byte[] original = new byte[5];
        String result = UnixCrypt.crypt(original, "salt");
        assertEquals("saFLGt/QKS6yw", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptValidSaltWithShortSalt_wavZ9() {
        byte[] original = new byte[0];
        String result = UnixCrypt.crypt(original, "sa");
        assertEquals("saFLGt/QKS6yw", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptInvalidSalt_PBgF1() {
        String original = "Hello";
        String result = UnixCrypt.crypt(original.getBytes(), "InvalidSalt");
        assertEquals("InlfjzZ6pBKaA", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_KQLt0() {
        String original = "test";
        String encrypted = UnixCrypt.crypt(original);
        assert encrypted != null;
    }
}