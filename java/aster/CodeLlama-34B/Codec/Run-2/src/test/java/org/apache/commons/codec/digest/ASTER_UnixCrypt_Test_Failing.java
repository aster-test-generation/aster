/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnixCrypt_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_dWeV0() {
        String original = "sa3tHJ3/KuYvI";
        String salt = "salt";
        String expected = "sa3tHJ3/KuYvI";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptySalt_DGbb2() {
        String original = "password";
        String salt = "";
        String expected = "password";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullOriginal_EFzl3() {
        String original = null;
        String salt = "salt";
        String expected = null;
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_CLUr4() {
        String original = "l8n2npozPB.sQ";
        String salt = null;
        String expected = "l8n2npozPB.sQ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSalts_Gaae5_1() {
        String original = "sa3tHJ3/KuYvI";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "sa3tHJ3/KuYvI";
        String expected2 = "sa3tHJ3/KuYvI";
        String actual1 = UnixCrypt.crypt(original, salt1);
        String actual2 = UnixCrypt.crypt(original, salt2);
        assertEquals(expected1, actual1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSalts_Gaae5_2() {
        String original = "sa3tHJ3/KuYvI";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "sa3tHJ3/KuYvI";
        String expected2 = "sa3tHJ3/KuYvI";
        String actual1 = UnixCrypt.crypt(original, salt1);
        String actual2 = UnixCrypt.crypt(original, salt2);
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentOriginals_bKzG6_1() {
        String original1 = "sa3tHJ3/KuYvI";
        String original2 = "password2";
        String salt = "salt";
        String expected1 = "sa3tHJ3/KuYvI";
        String expected2 = "password2";
        String actual1 = UnixCrypt.crypt(original1, salt);
        String actual2 = UnixCrypt.crypt(original2, salt);
        assertEquals(expected1, actual1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentOriginals_bKzG6_2() {
        String original1 = "password1";
        String original2 = "sa3tHJ3/KuYvI";
        String salt = "salt";
        String expected1 = "password1";
        String expected2 = "sa3tHJ3/KuYvI";
        String actual1 = UnixCrypt.crypt(original1, salt);
        String actual2 = UnixCrypt.crypt(original2, salt);
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSaltsAndOriginals_Ppyb7_1() {
        String original1 = "sa3tHJ3/KuYvI";
        String original2 = "password2";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "sa3tHJ3/KuYvI";
        String expected2 = "password2";
        String actual1 = UnixCrypt.crypt(original1, salt1);
        String actual2 = UnixCrypt.crypt(original2, salt2);
        assertEquals(expected1, actual1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSaltsAndOriginals_Ppyb7_2() {
        String original1 = "password1";
        String original2 = "sa3tHJ3/KuYvI";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "password1";
        String expected2 = "sa3tHJ3/KuYvI";
        String actual1 = UnixCrypt.crypt(original1, salt1);
        String actual2 = UnixCrypt.crypt(original2, salt2);
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_XewR8() {
        String original = "password";
        String salt = "invalid_salt";
        String expected = "password";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidOriginal_jYzD9() {
        String original = "sa.hpjcy3DN4Q";
        String salt = "salt";
        String expected = "sa.hpjcy3DN4Q";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSaltAndOriginal_zYIc10() {
        String original = "invalid_password";
        String salt = "invalid_salt";
        String expected = "invalid_password";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nonEmptyOriginal_RKaj2() {
        byte[] original = new byte[]{1, 2, 3};
        assertEquals("jQ9v.XyWGuMSE", UnixCrypt.crypt(original));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullSalt_JFqG3() {
        byte[] original = new byte[]{1, 2, 3};
        assertEquals("k5aPJZluln/.g", UnixCrypt.crypt(original, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_yTBf3() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "a";
        String expected = "a             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_emptySalt_phDc1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNonEmptyOriginalAndNullSalt_fOeR7() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = null;
        String expected = "Pyr52QGrdtpto";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyOriginalAndEmptySalt_Vsfw9() {
        byte[] original = new byte[0];
        String salt = "";
        String expected = "";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullOriginal_BkFw4() {
        byte[] original = null;
        String salt = "ab";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_validOriginalAndNullSalt_Ryds10() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = null;
        String expected = "maVFF2MC6Pgmo";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullSalt_iXUh0() {
        byte[] original = new byte[8];
        String salt = null;
        String expected = "9S0co1lLkRr66";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_emptySalt_JRLS1() {
        byte[] original = new byte[8];
        String salt = "";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullOriginal_mfoE4() {
        byte[] original = null;
        String salt = "ab";
        String expected = "Invalid salt value: ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullSalt_AhuE0() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = null;
        String expected = "VCcAyVxWP9KII";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_valid_KYMC2() {
        assertEquals("oU0l6B0B7Morc", UnixCrypt.crypt("oU0l6B0B7Morc"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullOriginal_xPsP0_lEcO0() {
        assertEquals(null, UnixCrypt.crypt((String) null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullEncoding_lTlR11_chSJ0() {
        assertThrows(NullPointerException.class, () -> UnixCrypt.crypt("password".getBytes(StandardCharsets.UTF_8), ""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_dWeV0_fid1() {
        String original = "password";
        String salt = "salt";
        String expected = "password";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyOriginal_wSWC1() {
        String original = "";
        String salt = "salt";
        String expected = "";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_CLUr4_fid1() {
        String original = "password";
        String salt = null;
        String expected = "password";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSalts_Gaae5_1_fid1() {
        String original = "password";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "password";
        String expected2 = "password";
        String actual1 = UnixCrypt.crypt(original, salt1);
        String actual2 = UnixCrypt.crypt(original, salt2);
        assertEquals(expected1, actual1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSalts_Gaae5_2_fid1() {
        String original = "password";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "password";
        String expected2 = "password";
        String actual1 = UnixCrypt.crypt(original, salt1);
        String actual2 = UnixCrypt.crypt(original, salt2);
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentOriginals_bKzG6_1_fid1() {
        String original1 = "password1";
        String original2 = "password2";
        String salt = "salt";
        String expected1 = "password1";
        String expected2 = "password2";
        String actual1 = UnixCrypt.crypt(original1, salt);
        String actual2 = UnixCrypt.crypt(original2, salt);
        assertEquals(expected1, actual1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentOriginals_bKzG6_2_fid1() {
        String original1 = "password1";
        String original2 = "password2";
        String salt = "salt";
        String expected1 = "password1";
        String expected2 = "password2";
        String actual1 = UnixCrypt.crypt(original1, salt);
        String actual2 = UnixCrypt.crypt(original2, salt);
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSaltsAndOriginals_Ppyb7_1_fid1() {
        String original1 = "password1";
        String original2 = "password2";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "password1";
        String expected2 = "password2";
        String actual1 = UnixCrypt.crypt(original1, salt1);
        String actual2 = UnixCrypt.crypt(original2, salt2);
        assertEquals(expected1, actual1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSaltsAndOriginals_Ppyb7_2_fid1() {
        String original1 = "password1";
        String original2 = "password2";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "password1";
        String expected2 = "password2";
        String actual1 = UnixCrypt.crypt(original1, salt1);
        String actual2 = UnixCrypt.crypt(original2, salt2);
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidOriginal_jYzD9_fid1() {
        String original = "invalid_password";
        String salt = "salt";
        String expected = "invalid_password";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_emptyOriginal_AwWG1() {
        assertEquals("", UnixCrypt.crypt(new byte[0]));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nonEmptyOriginal_RKaj2_fid1() {
        byte[] original = new byte[]{1, 2, 3};
        assertEquals("123", UnixCrypt.crypt(original));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullSalt_JFqG3_fid1() {
        byte[] original = new byte[]{1, 2, 3};
        assertEquals("123", UnixCrypt.crypt(original, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithNullSalt_jTVR0_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = null;
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_oyqX2_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "ab";
        String expected = "ab             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_invalidSalt_WQcU2_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "invalid";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_validSalt_differentLength_eGGU4_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "abcd";
        String expected = "abcd             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_validSalt_differentLength_differentChars_differentOrder_YpfF6_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "dcba";
        String expected = "dcba             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_validSalt_differentLength_differentChars_differentOrder_differentCase_kafz7_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "DcBa";
        String expected = "DcBa             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithInvalidSalt_riKD1_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "abc";
        String expected = "Invalid salt value: abc";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidSalt_TKhf2_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "ab";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyOriginal_ARaN3_fid1() {
        byte[] original = new byte[0];
        String salt = "ab";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithEmptyOriginalAndNullSalt_vtYl10_fid1() {
        byte[] original = new byte[0];
        String salt = null;
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_invalidSalt_JTAS2_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "abc";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullOriginal_BkFw4_fid1() {
        byte[] original = null;
        String salt = "ab";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullSalt_iXUh0_fid1() {
        byte[] original = new byte[8];
        String salt = null;
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_invalidSalt_tnWf2_fid1() {
        byte[] original = new byte[8];
        String salt = "abc";
        String expected = "Invalid salt value: abc";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_validSalt_rBez3_fid1() {
        byte[] original = new byte[8];
        String salt = "ab";
        String expected = "ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_emptyOriginal_Kkdj5_fid1() {
        byte[] original = new byte[0];
        String salt = "ab";
        String expected = "Invalid salt value: ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_invalidOriginalAndValidSalt_LUZb10_fid1() {
        byte[] original = new byte[8];
        String salt = "ab";
        String expected = "Invalid salt value: ab";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_invalidSalt_kuGO1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "invalid_salt";
        String expected = "             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_validSalt_differentLength_differentChars_differentOrder_Abtf5_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "cdab";
        String expected = "cdab             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_validSalt_differentLength_differentChars_differentOrder_differentCase_QQwF6_fid1() {
        byte[] original = new byte[8];
        Arrays.fill(original, (byte) 0);
        String salt = "CDAB";
        String expected = "CDAB             ";
        String actual = UnixCrypt.crypt(original, salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_empty_jkcA1() {
        assertEquals("", UnixCrypt.crypt(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_valid_KYMC2_fid1() {
        assertEquals("password", UnixCrypt.crypt("password"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullCharset_izSl10() {
        assertThrows(NullPointerException.class, () -> UnixCrypt.crypt("password".getBytes(StandardCharsets.UTF_8), null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCrypt_nullOriginal_xPsP0_lEcO0_fid1() {
        assertNull(UnixCrypt.crypt((String) null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSalts_Gaae5() {
        String original = "password";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "password";
        String expected2 = "password";
        String actual1 = UnixCrypt.crypt(original, salt1);
        String actual2 = UnixCrypt.crypt(original, salt2);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentOriginals_bKzG6() {
        String original1 = "password1";
        String original2 = "password2";
        String salt = "salt";
        String expected1 = "password1";
        String expected2 = "password2";
        String actual1 = UnixCrypt.crypt(original1, salt);
        String actual2 = UnixCrypt.crypt(original2, salt);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithDifferentSaltsAndOriginals_Ppyb7() {
        String original1 = "password1";
        String original2 = "password2";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String expected1 = "password1";
        String expected2 = "password2";
        String actual1 = UnixCrypt.crypt(original1, salt1);
        String actual2 = UnixCrypt.crypt(original2, salt2);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}