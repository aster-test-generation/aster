/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Rule_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getInstance_2_lOrV1_jhYf0() {
        NameType nameType = null;
        RuleType rt = null;
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<>());
        Map<String, List<Rule>> ruleMap = Rule.getInstanceMap(nameType, rt, langs);
        List<Rule> allRules = new ArrayList<>();
        ruleMap.values().forEach(rules -> allRules.addAll(rules));
        assertTrue(allRules.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getInstance_1_RDWC0_KHOy0() {
        NameType nameType = null;
        RuleType rt = null;
        Languages.LanguageSet langs = null;
        Map<String, List<Rule>> ruleMap = Rule.getInstanceMap(nameType, rt, langs);
        List<Rule> allRules = new ArrayList<>();
        ruleMap.values().forEach(rules -> allRules.addAll(rules));
        assertEquals(0, allRules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getInstance_3_nEsG2_BPEE0() {
        NameType nameType = null;
        RuleType rt = null;
        Languages.LanguageSet langs = Languages.LanguageSet.from(new HashSet<>());
        Map<String, List<Rule>> ruleMap = Rule.getInstanceMap(nameType, rt, langs);
        List<Rule> allRules = new ArrayList<>();
        ruleMap.values().forEach(rules -> allRules.addAll(rules));
        assertEquals(0, allRules.size());
    }
}