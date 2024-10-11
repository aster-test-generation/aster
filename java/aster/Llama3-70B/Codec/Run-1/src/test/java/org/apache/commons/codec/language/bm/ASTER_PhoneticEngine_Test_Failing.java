/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PhoneticEngine_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Approx_Common_cMrY0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("common"));
        String result = engine.encode("John Doe", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Exact_SingleLang_TdyU3() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("lang1"));
        String result = engine.encode("Michael Brown", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Generic_Rules_Common_gFlc4() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true, 10);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("common"));
        String result = engine.encode("Emily Chen", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Sephardic_Rules_Empty_VSnK5() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, false);
        LanguageSet languageSet = LanguageSet.from(Collections.emptySet());
        String result = engine.encode("Sarah Taylor", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Generic_Exact_SinglePrefix_tVuG7() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("lang1"));
        String result = engine.encode("de John Doe", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Sephardic_Rules_MultiLang_cgjc8_OAYG0() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, true, 10);
        LanguageSet languageSet = LanguageSet.from(new HashSet<>(Arrays.asList("lang1", "lang2", "lang3")));
        String result = engine.encode("David Lee Jr", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Approx_Common_cMrY0_fid2() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("common"));
        try {
            engine.encode("John Doe", languageSet);
        } catch (IllegalArgumentException e) {
            assertEquals("No rules found for ash, rules, common", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Ashkenazi_Exact_SingleLang_TdyU3_fid2() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("common"));
        String result = engine.encode("Michael Brown", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Generic_Rules_Common_gFlc4_fid2() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true, 10);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("common"));
        String result = engine.encode("Emily Chen", languageSet);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_Generic_Exact_SinglePrefix_tVuG7_fid2() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        LanguageSet languageSet = LanguageSet.from(Collections.singleton("common"));
        String result = engine.encode("de John Doe", languageSet);
        assertNotNull(result);
    }
}