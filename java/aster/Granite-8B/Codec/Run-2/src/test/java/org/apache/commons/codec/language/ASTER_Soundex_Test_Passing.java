/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Soundex_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLength_Uqca0() {
        Soundex soundex = new Soundex();
        int maxLength = soundex.getMaxLength();
        assertEquals(4, maxLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithMapping_eKeV1() {
        Soundex soundex = new Soundex("mapping");
        int maxLength = soundex.getMaxLength();
        assertEquals(4, maxLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithSpecialCaseHW_kTFx2() {
        Soundex soundex = new Soundex("mapping", true);
        int maxLength = soundex.getMaxLength();
        assertEquals(4, maxLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithMappingArray_npLH3() {
        Soundex soundex = new Soundex(new char[]{'a', 'b', 'c'});
        int maxLength = soundex.getMaxLength();
        assertEquals(4, maxLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxLengthWithEmptyMapping_kYbX5() {
        Soundex soundex = new Soundex("");
        int maxLength = soundex.getMaxLength();
        assertEquals(4, maxLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullStr_nTMO4() {
        Soundex soundex = new Soundex();
        String str = null;
        String expected = null;
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyStr_PLzH5() {
        Soundex soundex = new Soundex();
        String str = "";
        String expected = "";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrLength1_UGpO6() {
        Soundex soundex = new Soundex();
        String str = "a";
        String expected = "A000";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrLength4_nhmS9() {
        Soundex soundex = new Soundex();
        String str = "abcd";
        String expected = "A123";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrLength5_VdFU10() {
        Soundex soundex = new Soundex();
        String str = "abcde";
        String expected = "A123";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrLength6_rTxS11() {
        Soundex soundex = new Soundex();
        String str = "abcdef";
        String expected = "A123";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrLength7_fZBY12() {
        Soundex soundex = new Soundex();
        String str = "abcdefg";
        String expected = "A123";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrLength8_OGtC13() {
        Soundex soundex = new Soundex();
        String str = "abcdefgh";
        String expected = "A123";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrLength9_KbBq14() {
        Soundex soundex = new Soundex();
        String str = "abcdefghi";
        String expected = "A123";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_EWSi0_fid1() {
        Soundex soundex = new Soundex();
        String str = "Hello";
        String expected = "H400";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrLength2_ucHx7_fid1() {
        Soundex soundex = new Soundex();
        String str = "ab";
        String expected = "A100";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStrLength3_GkAW8_fid1() {
        Soundex soundex = new Soundex();
        String str = "abc";
        String expected = "A120";
        String actual = soundex.encode(str);
        assertEquals(expected, actual);
    }
}