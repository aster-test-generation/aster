/**
 * Generated by Aster
 */
package org.apache.commons.codec.language.bm;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PhoneticEngine_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes_ZOcw0_1() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        PhoneticEngine phoneticEngine2 = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 20);
        assertEquals(10, phoneticEngine.getMaxPhonemes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes_ZOcw0_2() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        PhoneticEngine phoneticEngine2 = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 20);
        assertEquals(20, phoneticEngine2.getMaxPhonemes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsConcat_yYCA0_1() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        boolean actual = phoneticEngine.isConcat();
        boolean expected = true;
        phoneticEngine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        actual = phoneticEngine.isConcat();
        expected = false;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameType_with_nameType_ASHKENAZI_yZKW0() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        assertEquals(NameType.ASHKENAZI, phoneticEngine.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNameType_with_nameType_GENERIC_CsfB1() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 5);
        assertEquals(NameType.GENERIC, phoneticEngine.getNameType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_1_dyFS0() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false, 1);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_2_NfmC1() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false, 1);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_4_gMNh3() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false, 1);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_5_HYNw4() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 1);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_7_ysWi6() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, false, 1);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_8_yDfx7() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.SEPHARDIC, RuleType.EXACT, false, 1);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_10_kYRl9() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_11_gDaV10() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_13_eQok12() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLang_14_bNoM13() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        Lang result = phoneticEngine0.getLang();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest1_pYMf0() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.APPROX);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest2_LKKD1() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.EXACT);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest4_Gihl3() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.APPROX);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest5_DYuE4() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.EXACT);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest7_rewp6() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.APPROX);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest8_kRTs7() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.SEPHARDIC, RuleType.EXACT, false, 1);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.EXACT);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest10_cXQX9() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.APPROX);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRuleTypeTest11_jJlR10() {
        PhoneticEngine phoneticEngine0 = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false);
        RuleType ruleType1 = phoneticEngine0.getRuleType();
        assertEquals(ruleType1, RuleType.EXACT);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxPhonemes_ZOcw0() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        assertEquals(10, phoneticEngine.getMaxPhonemes());
        PhoneticEngine phoneticEngine2 = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 20);
        assertEquals(20, phoneticEngine2.getMaxPhonemes());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsConcat_yYCA0() {
        PhoneticEngine phoneticEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 10);
        boolean actual = phoneticEngine.isConcat();
        boolean expected = true;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
        phoneticEngine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        actual = phoneticEngine.isConcat();
        expected = false;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_oPuI0_fid2() {
        PhoneticEngine pe = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true, 5);
        String input = "Johnny";
        String expected = "ioni|xoni|zoni";
        assertEquals(expected, pe.encode(input));
    }
}