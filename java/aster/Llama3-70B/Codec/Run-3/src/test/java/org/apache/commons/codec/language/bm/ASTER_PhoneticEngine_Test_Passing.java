/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PhoneticEngine_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLang_FDif0() throws Exception {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        Lang lang = pe.getLang();
        assertNotNull(lang);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes_jQAG0() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 5);
        assertEquals(5, engine.getMaxPhonemes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsConcat_withConcatTrue_OpVd0() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        assertTrue(engine.isConcat());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsConcat_withConcatFalse_Hrtw1() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false);
        assertFalse(engine.isConcat());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_APPROX_kTkd0() throws Exception {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        assertEquals(RuleType.APPROX, phoneticEngine.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_EXACT_jRWu1() throws Exception {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        assertEquals(RuleType.EXACT, phoneticEngine.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_RULES_ZLgR2() throws Exception {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, true, 5);
        assertEquals(RuleType.RULES, phoneticEngine.getRuleType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameType_Ashkenazi_Approx_Concatenate_Cgim0() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        assertEquals(NameType.ASHKENAZI, engine.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameType_Generic_Exact_Concatenate_hEdq1() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        assertEquals(NameType.GENERIC, engine.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameType_Sephardic_Rules_NoConcatenate_YjXv2() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, false);
        assertEquals(NameType.SEPHARDIC, engine.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Approx_Concatenate_Eyzk0() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 5);
        String input = "TestInput";
        String result = engine.encode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Generic_Exact_NoConcatenate_XOlL1() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        String input = "TestInput";
        String result = engine.encode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Sephardic_Rules_Concatenate_rSAU2() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, true, 10);
        String input = "TestInput";
        String result = engine.encode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Approx_Concatenate_ODZg0() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("en"));
        String result = engine.encode("John Doe", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Generic_Exact_NoConcatenate_JlRA1() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("fr"));
        String result = engine.encode("Jean Dupont", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Sephardic_Approx_Concatenate_ntpu2() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, true, 10);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("es"));
        String result = engine.encode("Juan Prez", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Exact_NoConcatenate_vuVb3() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("de"));
        String result = engine.encode("Hans Mller", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Generic_Rules_Concatenate_fzIQ4() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true, 10);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("it"));
        String result = engine.encode("Giovanni Rossi", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Sephardic_Exact_NoConcatenate_uLNW5() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.EXACT, false);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("pt"));
        String result = engine.encode("Joo Silva", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Rules_Concatenate_JWvq6() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, true, 10);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("nl"));
        String result = engine.encode("Jan Jansen", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Generic_Approx_NoConcatenate_stUE7() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("ru"));
        String result = engine.encode(" ", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Sephardic_Rules_NoConcatenate_NnVH8() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, false);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("ar"));
        String result = engine.encode(" ", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Exact_Concatenate_RaYj9() throws Exception {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, true, 10);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("he"));
        String result = engine.encode(" ", languageSet);
        assertNotNull(result);
    }
}