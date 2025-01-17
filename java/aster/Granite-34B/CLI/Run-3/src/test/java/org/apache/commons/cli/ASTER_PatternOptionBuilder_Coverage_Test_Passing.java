/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_at_XPNU0() {
        assertTrue(PatternOptionBuilder.isValueCode('@'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_colon_Xdyk1() {
        assertTrue(PatternOptionBuilder.isValueCode(':'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_percent_yQlq2() {
        assertTrue(PatternOptionBuilder.isValueCode('%'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_plus_QJTQ3() {
        assertTrue(PatternOptionBuilder.isValueCode('+'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_hash_YOCo4() {
        assertTrue(PatternOptionBuilder.isValueCode('#'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_less_nwrl5() {
        assertTrue(PatternOptionBuilder.isValueCode('<'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_greater_RdVI6() {
        assertTrue(PatternOptionBuilder.isValueCode('>'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_asterisk_lJjk7() {
        assertTrue(PatternOptionBuilder.isValueCode('*'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_slash_qsYY8() {
        assertTrue(PatternOptionBuilder.isValueCode('/'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_exclamation_gsxa9() {
        assertTrue(PatternOptionBuilder.isValueCode('!'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isValueCode_other_lgpG10() {
        assertFalse(PatternOptionBuilder.isValueCode('a'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueClassTest1_WoOh0_ZJkY0_fid2() {
        char ch = 'a';
        Object result = PatternOptionBuilder.getValueClass(ch);
        Object expected = PatternOptionBuilder.class;
    }
}