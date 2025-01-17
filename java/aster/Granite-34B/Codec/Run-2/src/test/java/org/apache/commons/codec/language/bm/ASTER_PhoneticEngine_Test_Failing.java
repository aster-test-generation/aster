/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PhoneticEngine_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameType_with_nameType_SEPHARDIC_OYvg2() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, true, 20);
        assertEquals(NameType.SEPHARDIC, phoneticEngine.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_oPuI0() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 5);
        String input = "Johnny";
        String expected = "J500";
        assertEquals(expected, pe.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithGenericNameType_xfVo1() {
        PhoneticEngine pe = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 10);
        String input = "John";
        String expected = "John";
        assertEquals(expected, pe.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithSephardicNameType_BnOy2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, true, 15);
        String input = "Juan";
        String expected = "J300";
        assertEquals(expected, pe.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_3_MqST2() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, false, 1);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_6_NcbJ5() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, false, 1);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_9_PPYa8() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, false, 1);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_12_lvlA11() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, false);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest3_hbzA2() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.RULES);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest6_BpFs5() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.RULES);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest9_Nmhb8() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.SEPHARDIC, RuleType.RULES, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.RULES);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest12_TwGZ11() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.RULES, false);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.RULES);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithGenericNameType_xfVo1_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 10);
        String input = "jon";
        String expected = "jon";
        assertEquals(expected, pe.encode(input));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest6_BpFs5_fid2() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.RULES, "ruleType must not be RULES");
    }
}