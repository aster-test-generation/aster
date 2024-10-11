/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_BeiderMorseEncoder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameType_ASHKENAZI_YZxi0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(NameType.ASHKENAZI);
        assertEquals(NameType.ASHKENAZI, encoder.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameType_GENERIC_CWLM1() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(NameType.GENERIC);
        assertEquals(NameType.GENERIC, encoder.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameType_SEPHARDIC_OvMq2() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setNameType(NameType.SEPHARDIC);
        assertEquals(NameType.SEPHARDIC, encoder.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleTypeWithApproxRuleType_rGdZ0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.APPROX);
        assertEquals(RuleType.APPROX, encoder.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleTypeWithExactRuleType_EaZi1() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.EXACT);
        assertEquals(RuleType.EXACT, encoder.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsConcat_True_xeka0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        assertTrue(encoder.isConcat());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonString_FhUu1() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        Object input = new Object();
        try {
            encoder.encode(input);
            fail("Expected EncoderException");
        } catch (EncoderException e) {
            assertEquals("BeiderMorseEncoder encode parameter is not of type String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameType_Default_POUw0_GpYN0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        NameType nameType = encoder.getNameType();
        assertEquals(NameType.GENERIC, nameType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConcat_ZCZs0_vLxD0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setConcat(true);
        assertTrue(encoder.isConcat());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConcatFalse_uwBy1_QfhT0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setConcat(false);
        assertFalse(encoder.isConcat());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyString_sIRf2_mXny0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        String input = "";
        String expectedOutput = "";
        String actualOutput = "";
        try {
            actualOutput = encoder.encode(input);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNull_SeNG0_cqEo0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        try {
            assertNull(encoder.encode(null));
        } catch (EncoderException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEmptyString_LBhS1_fLPN0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        try {
            assertEquals("", encoder.encode(""));
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxPhonemesWithInvalidValue_BCqP1_fid2() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        try {
            encoder.setMaxPhonemes(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("maxPhonemes must be greater than or equal to 0", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_Null_vaFq2_fid2() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        RuleType ruleType = encoder.getRuleType();
        assertEquals(RuleType.APPROX, ruleType);
    }
}