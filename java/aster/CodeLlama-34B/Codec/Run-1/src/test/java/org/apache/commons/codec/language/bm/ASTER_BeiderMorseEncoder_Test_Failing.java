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

public class Aster_BeiderMorseEncoder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxPhonemesWithInvalidValue_BCqP1() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        try {
            encoder.setMaxPhonemes(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("maxPhonemes must be greater than or equal to 0", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNameType_Invalid_CyRS3() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        try {
            encoder.setNameType(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("NameType cannot be null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRuleTypeWithRulesRuleType_rYrB2() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        encoder.setRuleType(RuleType.RULES);
        assertEquals(RuleType.RULES, encoder.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_Null_vaFq2() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        RuleType ruleType = encoder.getRuleType();
        assertNull(ruleType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonEmptyString_KpAP2_lhWa0() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        try {
            assertEquals("Hello, World!", encoder.encode("Hello, World!"));
        } catch (EncoderException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeNonEmptyString_KpAP2_lhWa0_fid2() {
        BeiderMorseEncoder encoder = new BeiderMorseEncoder();
        try {
            assertEquals("YlYvYrlt|YlYvorlt|YlovYrlt|Ylovorlt|ilYvYrlt|ilYvorlt|ilovYrlt|ilovorlt|ilovurlt|iloworlt|xilovorlt|xilovurlt|xiloworlt", encoder.encode("YlYvYrlt|YlYvorlt|YlovYrlt|Ylovorlt|ilYvYrlt|ilYvorlt|ilovYrlt|ilovorlt|ilovurlt|iloworlt|xilovorlt|xilovurlt|xiloworlt"));
        } catch (EncoderException e) {
            fail("Exception should not be thrown");
        }
    }
}