/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Rule_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_kJyW0() throws Exception {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.APPROX;
        String lang = "en";
        Map<String, List<Rule>> rules = Rule.getInstanceMap(nameType, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_2_aZwj1() throws Exception {
        NameType nameType = NameType.ASHKENAZI;
        RuleType rt = RuleType.APPROX;
        String lang = "en";
        Map<String, List<Rule>> rules = Rule.getInstanceMap(nameType, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRuleConstructor_dTRB1() throws Exception {
        Rule rule = new Rule(null, null, null, null);
        assertNotNull(rule);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_PeBI0_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "en";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance_PeBI0_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "en";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance2_trQw1_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "fr";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance2_trQw1_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "fr";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance3_nlKn2_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "es";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance3_nlKn2_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "es";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance4_hScG3_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "de";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance4_hScG3_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "de";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance5_oGbE4_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "it";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance5_oGbE4_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "it";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance6_oYCd5_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "pt";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance6_oYCd5_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "pt";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance7_pTlt6_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "ru";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance7_pTlt6_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "ru";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance8_myAC7_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "zh";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance8_myAC7_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "zh";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance9_vxEL8_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "ar";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance9_vxEL8_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "ar";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance10_GVEs9_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "he";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance10_GVEs9_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "he";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance11_gWzK10_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "fa";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance11_gWzK10_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "fa";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance12_Ljwo11_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "el";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance12_Ljwo11_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "el";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance13_UoNZ12_1() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "tr";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertNotNull(rules);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstance13_UoNZ12_2() throws Exception {
        RuleType rt = RuleType.APPROX;
        NameType nt = NameType.ASHKENAZI;
        String lang = "tr";
        List<Rule> rules = Rule.getInstance(nt, rt, lang);
        assertEquals(1, rules.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_1_eqvA3_1() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.APPROX, "en");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_1_eqvA3_2() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.APPROX, "en");
        assertEquals(1, result.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_1_eqvA3_3() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.APPROX, "en");
        assertTrue(result.containsKey("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_2_JELz4_1() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.EXACT, "en");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_2_JELz4_2() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.EXACT, "en");
        assertEquals(1, result.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_2_JELz4_3() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.EXACT, "en");
        assertTrue(result.containsKey("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_3_vRnp5_1() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.RULES, "en");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_3_vRnp5_2() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.RULES, "en");
        assertEquals(1, result.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_3_vRnp5_3() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.RULES, "en");
        assertTrue(result.containsKey("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_4_iDBv6_1() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.APPROX, Languages.ANY);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_4_iDBv6_2() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.APPROX, Languages.ANY);
        assertTrue(result.containsKey("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_4_iDBv6_3() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.APPROX, Languages.ANY);
        assertTrue(result.containsKey("es"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_5_cKoS7_1() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.EXACT, Languages.ANY);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_5_cKoS7_2() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.EXACT, Languages.ANY);
        assertTrue(result.containsKey("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_5_cKoS7_3() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.EXACT, Languages.ANY);
        assertTrue(result.containsKey("es"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_6_yltQ8_1() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.RULES, Languages.ANY);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_6_yltQ8_2() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.RULES, Languages.ANY);
        assertTrue(result.containsKey("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceMap_NameType_RuleType_String_6_yltQ8_3() throws Exception {
        Map<String, List<Rule>> result = Rule.getInstanceMap(NameType.ASHKENAZI, RuleType.RULES, Languages.ANY);
        assertTrue(result.containsKey("es"));
    }
}