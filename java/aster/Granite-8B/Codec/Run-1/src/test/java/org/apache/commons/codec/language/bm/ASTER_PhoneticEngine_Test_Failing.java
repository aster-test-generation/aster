/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PhoneticEngine_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRuleType3_lRxG2() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, true, 2);
        RuleType ruleType = phoneticEngine.getRuleType();
        assertEquals(RuleType.RULES, ruleType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes9_NwNU8() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, true, 5);
        int maxPhonemes = engine.getMaxPhonemes();
        assertEquals(5, maxPhonemes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes10_GLlm9() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, true);
        int maxPhonemes = engine.getMaxPhonemes();
        assertTrue(maxPhonemes > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes11_IrXL10() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, false, 5);
        int maxPhonemes = engine.getMaxPhonemes();
        assertEquals(5, maxPhonemes);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes12_Pqir11() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, false);
        int maxPhonemes = engine.getMaxPhonemes();
        assertTrue(maxPhonemes > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode1_wGak0() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, true, 10);
        String result = phoneticEngine.encode("John", LanguageSet.from(Collections.singleton("en")));
        assertEquals("j-h-n", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode2_wbcy1() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, false, 10);
        String result = phoneticEngine.encode("John", LanguageSet.from(Collections.singleton("en")));
        assertEquals("j-h-n", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_bZoz0_fid1() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        String input = "John";
        String expectedOutput = "Jnh";
        String actualOutput = phoneticEngine.encode(input);
        assertEquals(expectedOutput, actualOutput);
    }
}