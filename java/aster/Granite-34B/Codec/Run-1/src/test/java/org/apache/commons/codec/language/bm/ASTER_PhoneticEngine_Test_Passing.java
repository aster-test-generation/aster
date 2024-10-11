/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PhoneticEngine_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getLang_whenNameTypeIsAshkenaziAndRuleTypeIsApproxAndConcatenateIsTrueAndMaxPhonemesIs10_thenReturnsLang_NzMW0() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        Lang lang = phoneticEngine.getLang();
        assertEquals(Lang.class, lang.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getLang_whenNameTypeIsGenericAndRuleTypeIsExactAndConcatenateIsFalse_thenReturnsLang_kAgG1() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        Lang lang = phoneticEngine.getLang();
        assertEquals(Lang.class, lang.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_Ienc0_2() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        phoneticEngine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        assertEquals(RuleType.EXACT, phoneticEngine.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes_psKo0_1() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        PhoneticEngine phoneticEngine2 = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 5);
        assertEquals(10, phoneticEngine.getMaxPhonemes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes_psKo0_2() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        PhoneticEngine phoneticEngine2 = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 5);
        assertEquals(5, phoneticEngine2.getMaxPhonemes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsConcatTrue_camC0() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        assertTrue(pe.isConcat());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsConcatFalse_TDwJ1() {
        PhoneticEngine pe = new PhoneticEngine(NameType.SEPHARDIC, RuleType.EXACT, false, 5);
        assertFalse(pe.isConcat());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameType_withNameTypeParameter_RDrA0() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType ruleType = RuleType.APPROX;
        boolean concatenate = true;
        int maxPhonemes = 10;
        PhoneticEngine phoneticEngine = new PhoneticEngine(nameType, ruleType, concatenate, maxPhonemes);
        NameType result = phoneticEngine.getNameType();
        assertEquals(nameType, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameType_withoutMaxPhonemesParameter_rwwZ1() {
        NameType nameType = NameType.SEPHARDIC;
        RuleType ruleType = RuleType.EXACT;
        boolean concatenate = false;
        PhoneticEngine phoneticEngine = new PhoneticEngine(nameType, ruleType, concatenate);
        NameType result = phoneticEngine.getNameType();
        assertEquals(nameType, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_Ienc0() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        assertEquals(RuleType.APPROX, phoneticEngine.getRuleType());
        phoneticEngine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        assertEquals(RuleType.EXACT, phoneticEngine.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes_psKo0() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        assertEquals(10, phoneticEngine.getMaxPhonemes());
        PhoneticEngine phoneticEngine2 = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 5);
        assertEquals(5, phoneticEngine2.getMaxPhonemes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_Ienc0_1_fid2() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, true, 10);
        phoneticEngine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        assertEquals(RuleType.EXACT, phoneticEngine.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_HUIL0_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 5);
        String actual = pe.encode("Arya");
        String expected = "Yria|aria|arii|ario|oria|orii|orio";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoMaxPhonemes_MxDG1_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true);
        String actual = pe.encode("Arya");
        String expected = "Yria|Yrio|aria|arii|ario|oria|orii|orio";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoConcatenate_VAOi2_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false, 5);
        String actual = pe.encode("Arya");
        String expected = "Yria|aria|arii|ario|oria|orii|orio";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoMaxPhonemesAndNoConcatenate_PzAs3_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false);
        String actual = pe.encode("Arya");
        String expected = "Yria|Yrio|aria|arii|ario|oria|orii|orio";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithGenericNameType_ZHmO4_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 5);
        String actual = pe.encode("Arya");
        String expected = "Yria|aria|ario|oria|orio";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSephardicNameType_sWQI5_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, true, 5);
        String actual = pe.encode("Arya");
        String expected = "ara|ra";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithExactRuleType_mOpr6_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, true, 5);
        String actual = pe.encode("Arya");
        String expected = "arja|arji";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoMaxPhonemesAndExactRuleType_NQDT7_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, true);
        String actual = pe.encode("Arya");
        String expected = "arja|arji";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoConcatenateAndExactRuleType_AyBb8_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false, 5);
        String actual = pe.encode("Arya");
        String expected = "arja|arji";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNoMaxPhonemesNoConcatenateAndExactRuleType_YwDp9_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false);
        String actual = pe.encode("Arya");
        String expected = "arja|arji";
        assertEquals(expected, actual);
    }
}