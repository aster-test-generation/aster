/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_ColognePhonetic_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NullText1_pFlo2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text1 = null;
        String text2 = "Hello";
        assertTrue(colognePhonetic.isEncodeEqual(text1, text2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_NonGermanInput_ALpr2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        assertEquals("", colognePhonetic.colognePhonetic("Hello World"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_GermanInput_ktGX3_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        assertEquals("KLN", colognePhonetic.colognePhonetic("Kln"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_multipleCharacterInput_Pzir3_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        assertEquals("0123456789", colognePhonetic.colognePhonetic("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_DTP_aUrn8_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        assertEquals("2", colognePhonetic.colognePhonetic("DTP"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_FPVW_oMrD9_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        assertEquals("3", colognePhonetic.colognePhonetic("FPVW"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_C_OrSz13_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        assertEquals("4", colognePhonetic.colognePhonetic("C"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_NullText1_pFlo2_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text1 = null;
        String text2 = "Hello";
        assertFalse(colognePhonetic.isEncodeEqual(text1, text2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_DifferentCases_vGFZ7_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text1 = "Hello";
        String text2 = "hello";
        assertFalse(colognePhonetic.isEncodeEqual(text1, text2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_afUS0_fid2() {
        ColognePhonetic cp = new ColognePhonetic();
        String input = "Hello World";
        String expected = "H4LL0 W3RLD";
        String actual = cp.encode(input);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NonEmptyString_Ehui1_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode("Hello World");
        assertEquals("H4L0 W0RLD", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_StringWithSpecialCharacters_QOxH2_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode("Hello, World!");
        assertEquals("H4L0 W0RLD!", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_StringWithAccentedCharacters_JwFB3_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode("Hll Wrld");
        assertEquals("H4L0 W0RLD", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_StringWithNewLine_XKoS5_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode("Hello\nWorld");
        assertEquals("H4L0 W0RLD", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_StringWithTab_fldl6_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode("Hello\tWorld");
        assertEquals("H4L0 W0RLD", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_StringWithNull_SaHo7_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode(null);
        assertEquals("", actual);
    }
}