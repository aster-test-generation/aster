/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Caverphone_Test_Passing {
    private Caverphone caverphone;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCaverphoneEqual_SameString_FhGL0() {
        Caverphone caverphone = new Caverphone();
        String str1 = "hello";
        String str2 = "hello";
        assertTrue(caverphone.isCaverphoneEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCaverphoneEqual_DifferentString_OjBg1() {
        Caverphone caverphone = new Caverphone();
        String str1 = "hello";
        String str2 = "world";
        assertFalse(caverphone.isCaverphoneEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCaverphoneEqual_EmptyString_PCPs3() {
        Caverphone caverphone = new Caverphone();
        String str1 = "";
        String str2 = "";
        assertTrue(caverphone.isCaverphoneEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCaverphoneEqual_DifferentLengthStrings_UgOs5() {
        Caverphone caverphone = new Caverphone();
        String str1 = "hello";
        String str2 = "hello world";
        assertFalse(caverphone.isCaverphoneEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCaverphoneEqual_DifferentCaseStrings_XpJb6() {
        Caverphone caverphone = new Caverphone();
        String str1 = "hello";
        String str2 = "Hello";
        assertTrue(caverphone.isCaverphoneEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCaverphoneEqual_DifferentAccentStrings_ioRM7() {
        Caverphone caverphone = new Caverphone();
        String str1 = "hello";
        String str2 = "hllo";
        assertTrue(caverphone.isCaverphoneEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCaverphoneEqual_DifferentSpecialCharacterStrings_yTIL8() {
        Caverphone caverphone = new Caverphone();
        String str1 = "hello";
        String str2 = "hllo!";
        assertTrue(caverphone.isCaverphoneEqual(str1, str2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_NjMf0() {
        caverphone = new Caverphone();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCaverphoneWithMultipleWordsAndMixedCase_zHAn14() {
        String source = "HeLlO WoRlD";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NonString_YTGY1() {
        Caverphone caverphone = new Caverphone();
        Object input = new Object();
        try {
            caverphone.encode(input);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Caverphone encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_LWAx0() {
        Caverphone caverphone = new Caverphone();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCaverphoneEqual_NullString_poyP2_fid2() {
        Caverphone caverphone = new Caverphone();
        String str1 = null;
        String str2 = null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_BDMo0_fid2() {
        Caverphone caverphone = new Caverphone();
        String input = "hello";
        Object output = caverphone.encode(input);
        assertEquals("ALA1111111", output);
    }
}