/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_ColognePhonetic_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_germanUmlautInput_jaIk4() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("\u00C4\u00DC\u00D6");
        assertEquals("000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_ignoreVowelsInput_MRGQ7() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("AEIOU");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_ignoreAccentsInput_HmrU9() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("");
        assertEquals("000", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_1_vONY0() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text = "ABC";
        String expected = "012";
        String actual = colognePhonetic.colognePhonetic(text);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_2_QKJk1() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text = "XYZ";
        String expected = "";
        String actual = colognePhonetic.colognePhonetic(text);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_25_Oiff2() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text = "ZYX";
        String expected = "876";
        String actual = colognePhonetic.colognePhonetic(text);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEncodeEqualWithNullInput_Gizi3() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String text1 = null;
        String text2 = null;
        boolean expected = true;
        boolean actual = colognePhonetic.isEncodeEqual(text1, text2);
        assert actual == expected;
    }
}