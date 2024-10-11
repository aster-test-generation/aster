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

public class Aster_Nysiis_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrict_strict_thsz0() {
        Nysiis nysiis = new Nysiis(true);
        assertTrue(nysiis.isStrict());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsStrict_notStrict_MLFm1() {
        Nysiis nysiis = new Nysiis(false);
        assertFalse(nysiis.isStrict());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_nullInput_JLcC0() {
        Nysiis nysiis = new Nysiis();
        assertNull(nysiis.nysiis(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_emptyInput_EGFG1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("", nysiis.nysiis(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_singleCharacterInput_MDjf2() {
        Nysiis nysiis = new Nysiis();
        assertEquals("A", nysiis.nysiis("A"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_twoCharacterInput_qjsA3() {
        Nysiis nysiis = new Nysiis();
        assertEquals("AB", nysiis.nysiis("AB"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_threeCharacterInput_TUXy4() {
        Nysiis nysiis = new Nysiis();
        assertEquals("ABC", nysiis.nysiis("ABC"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_fourCharacterInput_jmaa5() {
        Nysiis nysiis = new Nysiis();
        assertEquals("ABCD", nysiis.nysiis("ABCD"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_xLFD0() {
        Nysiis nysiis = new Nysiis();
        String input = "hello";
        String expectedOutput = "HAL";
        String actualOutput = nysiis.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NonString_yERg1() {
        Nysiis nysiis = new Nysiis();
        Object input = new Object();
        try {
            nysiis.encode(input);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Nysiis encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NonString_Strict_lgYK2() {
        Nysiis nysiis = new Nysiis(true);
        Object input = new Object();
        try {
            nysiis.encode(input);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Nysiis encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_NonString_NonStrict_WGxL3() {
        Nysiis nysiis = new Nysiis(false);
        Object input = new Object();
        try {
            nysiis.encode(input);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("Parameter supplied to Nysiis encode is not of type java.lang.String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_Strict_Qwmd4() {
        Nysiis nysiis = new Nysiis(true);
        String input = "hello";
        String expectedOutput = "HAL";
        String actualOutput = nysiis.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_String_NonStrict_xxvQ5() {
        Nysiis nysiis = new Nysiis(false);
        String input = "hello";
        String expectedOutput = "HAL";
        String actualOutput = nysiis.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_ZUWg0() {
        Nysiis nysiis = new Nysiis();
        String str = "hello";
        String expected = "HAL";
        String actual = nysiis.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyString_KpeP1() {
        Nysiis nysiis = new Nysiis();
        String str = "";
        String expected = "";
        String actual = nysiis.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNullString_lZTP2() {
        Nysiis nysiis = new Nysiis();
        String str = null;
        String expected = null;
        String actual = nysiis.encode(str);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_fiveCharacterInput_FgsJ6_fid1() {
        Nysiis nysiis = new Nysiis();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNysiis_sevenCharacterInput_EHtm8_fid1() {
        Nysiis nysiis = new Nysiis();
        assertEquals("ABCDAF", nysiis.nysiis("ABCDAF"));
    }
}