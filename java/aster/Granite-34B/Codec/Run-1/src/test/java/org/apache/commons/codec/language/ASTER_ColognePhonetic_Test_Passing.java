/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_ColognePhonetic_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_nullInput_cesW0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_emptyInput_nVzK1() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_singleLetterInput_HSjE2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("A");
        assertEquals("0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_multipleLettersInput_FdjS3() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("ABC");
        assertEquals("018", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_ignoreNonLettersInput_kKGF5() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("A1B2C3");
        assertEquals("018", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_ignoreDoubleConsonantsInput_mGQU6() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("BBC");
        assertEquals("18", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_ignoreCombiningDiacriticalMarksInput_JazB11() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("a\u0308");
        assertEquals("0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqual_rqgj0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text1 = "Mller";
        String text2 = "Mueller";
        boolean expected = true;
        boolean actual = colognePhonetic.isEncodeEqual(text1, text2);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualWithEmptyInput_RXos2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text1 = "";
        String text2 = "";
        boolean expected = true;
        boolean actual = colognePhonetic.isEncodeEqual(text1, text2);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringParameter_SCQs0() throws EncoderException {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String input = "Hello";
        Object result = colognePhonetic.encode(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringParameter_BGvE1() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        Object input = 123;
        try {
            colognePhonetic.encode(input);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_dKOV0_HkSy0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.colognePhonetic("text");
        String expected = colognePhonetic.colognePhonetic("text");
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullText_vLtb1_Mvea0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode(null);
        String expected = colognePhonetic.colognePhonetic(null);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyText_Jyay2_QdPj0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode("");
        String expected = colognePhonetic.colognePhonetic("");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSingleLetterText_JokP3_Osqa0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode("a");
        String expected = colognePhonetic.colognePhonetic("a");
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithMultipleLetterText_Cess4_LLpq0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode("ab");
        String expected = colognePhonetic.colognePhonetic("ab");
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSpecialCharacters_mwJx5_Rbwm0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String actual = colognePhonetic.encode("!@#$%^&*()_+");
        String expected = colognePhonetic.colognePhonetic("!@#$%^&*()_+");
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_germanUmlautInput_jaIk4_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("\u00C4\u00DC\u00D6");
        assertEquals("0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_1_vONY0_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text = "ABC";
        String expected = "018";
        String actual = colognePhonetic.colognePhonetic(text);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_25_Oiff2_fid2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text = "ZYX";
        String expected = "848";
        String actual = colognePhonetic.colognePhonetic(text);
        assertEquals(expected, actual);
    }
}