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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Rule_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_eSDs0_1() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.EXACT;
        LanguageSet langs = LanguageSet.from(new HashSet<String>(Arrays.asList("en", "es")));
        Map<String, List<Rule>> instanceMap = Rule.getInstanceMap(nameType, rt, langs);
        assertNotNull(instanceMap);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_eSDs0_9() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.EXACT;
        LanguageSet langs = LanguageSet.from(new HashSet<String>(Arrays.asList("en", "es")));
        Map<String, List<Rule>> instanceMap = Rule.getInstanceMap(nameType, rt, langs);
        assertEquals(9, instanceMap.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_eSDs0_3() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.EXACT;
        LanguageSet langs = LanguageSet.from(new HashSet<String>(Arrays.asList("en", "es")));
        Map<String, List<Rule>> instanceMap = Rule.getInstanceMap(nameType, rt, langs);
        assertFalse(instanceMap.containsKey("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_eSDs0_4() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.EXACT;
        LanguageSet langs = LanguageSet.from(new HashSet<String>(Arrays.asList("en", "es")));
        Map<String, List<Rule>> instanceMap = Rule.getInstanceMap(nameType, rt, langs);
        assertFalse(instanceMap.containsKey("es"));
    }
}