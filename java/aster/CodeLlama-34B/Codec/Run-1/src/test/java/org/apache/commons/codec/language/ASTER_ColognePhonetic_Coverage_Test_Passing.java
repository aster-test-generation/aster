/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_ColognePhonetic_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_notString_bIji0() throws org.apache.commons.codec.EncoderException {
        ColognePhonetic encoder = new ColognePhonetic();
        try {
            encoder.encode(new Object());
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + Object.class.getName() + ".", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_emptyString_VqVk3() throws org.apache.commons.codec.EncoderException {
        ColognePhonetic encoder = new ColognePhonetic();
        String input = "";
        String expectedOutput = "";
        String actualOutput = encoder.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic_iejz7() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("A");
        assertEquals("0", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic2_nAZr8() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("B");
        assertEquals("1", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic3_kIAl9() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("D");
        assertEquals("2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic4_VabW10() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("F");
        assertEquals("3", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic5_btwT11() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("G");
        assertEquals("4", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic6_epDd12() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("H");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testColognePhonetic7_laXj13() {
        ColognePhonetic colognePhonetic = new ColognePhonetic();
        String result = colognePhonetic.colognePhonetic("L");
        assertEquals("5", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_string_xBnO1_fid2() throws org.apache.commons.codec.EncoderException {
        ColognePhonetic encoder = new ColognePhonetic();
        String input = "Hello World";
        String expectedOutput = "053752";
        String actualOutput = encoder.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_specialCharacters_jKsP4_fid2() throws org.apache.commons.codec.EncoderException {
        ColognePhonetic encoder = new ColognePhonetic();
        String input = "Hllo Wrld";
        String expectedOutput = "53752";
        String actualOutput = encoder.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_uppercase_QKTQ5_fid2() throws org.apache.commons.codec.EncoderException {
        ColognePhonetic encoder = new ColognePhonetic();
        String input = "HELLO WORLD";
        String expectedOutput = "053752";
        String actualOutput = encoder.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }
}