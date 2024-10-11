/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Rule_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_xsAe0_1() {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "en";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_xsAe0_2() {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "en";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertFalse(rules.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getInstanceMap_withValidParameters_returnsNonEmptyMap_xhxx0_1() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.APPROX;
        String lang = "en";
        Map<String, List<Rule>> result = Rule.getInstanceMap(nameType, rt, lang);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getInstanceMap_withValidParameters_returnsNonEmptyMap_xhxx0_2() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.APPROX;
        String lang = "en";
        Map<String, List<Rule>> result = Rule.getInstanceMap(nameType, rt, lang);
        assertTrue(!result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_xsAe0() {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "en";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
        assertFalse(rules.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getInstanceMap_withValidParameters_returnsNonEmptyMap_xhxx0() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.APPROX;
        String lang = "en";
        Map<String, List<Rule>> result = Rule.getInstanceMap(nameType, rt, lang);
        assertNotNull(result);
        assertTrue(!result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getInstanceMap_withInvalidParameters_throwsIllegalArgumentException_lzfZ1() {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.APPROX;
        String lang = "invalid";
        IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> Rule.getInstanceMap(nameType, rt, lang));
        assertEquals("No rules found for ASHKENAZI, APPROX, invalid.", exception.getMessage());
    }
}