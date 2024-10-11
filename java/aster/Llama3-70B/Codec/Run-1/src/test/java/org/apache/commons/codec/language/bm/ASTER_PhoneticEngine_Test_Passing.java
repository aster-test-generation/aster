/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PhoneticEngine_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLang_xYpx0() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        Lang lang = pe.getLang();
        assertNotNull(lang);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRuleType_UXcw0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 5);
        RuleType ruleType = engine.getRuleType();
        assertEquals(RuleType.APPROX, ruleType);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes_YGoQ0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 5);
        assertEquals(5, engine.getMaxPhonemes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsConcat_Exact_Ashkenazi_Concatenate_scgo0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, true);
        assertTrue(engine.isConcat());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameType_Ashkenazi_Approx_Concatenate_YlHB0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        assertEquals(NameType.ASHKENAZI, engine.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_OcTN0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 5);
        String input = "testInput";
        String result = engine.encode(input);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Generic_Exact_Empty_AyCA1() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        LanguageSet languageSet = LanguageSet.from(Collections.emptySet());
        String result = engine.encode("Jane Doe", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Approx_Empty_qHiW9() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false);
        LanguageSet languageSet = LanguageSet.from(Collections.emptySet());
        String result = engine.encode("John Doe", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Sephardic_Approx_MultiLang_fZoZ2_NDSX0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, true, 10);
        LanguageSet languageSet = LanguageSet.from(new HashSet<>(Arrays.asList("lang1", "lang2", "lang3")));
        String result = engine.encode("David Lee", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Approx_MultiPrefix_MMBO6_gduE0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        LanguageSet languageSet = LanguageSet.from(new HashSet<>(Arrays.asList("lang1", "lang2")));
        String result = engine.encode("d'John Doe", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Sephardic_Rules_Empty_VSnK5_fid2() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.EXACT, false);
        LanguageSet languageSet = LanguageSet.from(Collections.emptySet());
        String result = engine.encode("Sarah Taylor", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Sephardic_Rules_MultiLang_cgjc8_OAYG0_fid2() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.EXACT, true, 10);
        LanguageSet languageSet = LanguageSet.from(new HashSet<>(Arrays.asList("lang1", "lang2", "lang3")));
        String result = engine.encode("David Lee Jr", languageSet);
        assertNotNull(result);
    }
}