/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Rule_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_WIQw0() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.EXACT;
        String lang = "en";
        List<Rule> result = Rule.getInstance(nameType, rt, lang);
        assertEquals(result.size(), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_Ashkenazi_Approx_Hebrew_qHLG0() {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.APPROX, "Hebrew");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_Generic_Exact_Yiddish_gryh1() {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.GENERIC, RuleType.EXACT, "Yiddish");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_Singleton_LangSet_sNJw0() {
        LanguageSet langs = LanguageSet.from(new HashSet<String>(Arrays.asList("lang1")));
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.EXACT, langs);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_Singleton_AnyLang_dbDc2() {
        LanguageSet langs = LanguageSet.from(new HashSet<String>(Arrays.asList("lang1")));
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.SEPHARDIC, RuleType.APPROX, langs);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_Singleton_NullLangSet_HIss6() {
        LanguageSet langs = null;
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.EXACT, langs);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NonSingleton_NullLangSet_EvTQ7() {
        LanguageSet langs = null;
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.GENERIC, RuleType.RULES, langs);
    }
}