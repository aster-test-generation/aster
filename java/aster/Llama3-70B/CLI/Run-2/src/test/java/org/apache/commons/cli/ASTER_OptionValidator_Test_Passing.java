/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionValidator_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateNull_zqPc0() {
        String result = OptionValidator.validate(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateEmpty_pkCV1() {
        try {
            OptionValidator.validate("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Empty option name.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateInvalidFirstChar_EQcp2() {
        try {
            OptionValidator.validate("1abc");
        } catch (IllegalArgumentException e) {
            assertEquals("Illegal option name '1'.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateInvalidMiddleChar_rhvg3() {
        try {
            OptionValidator.validate("abc$def");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidOption_tfhw4() {
        String result = OptionValidator.validate("abc");
        assertEquals("abc", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidOptionWithAdditionalChars_qQWs5() {
        String result = OptionValidator.validate("abc_");
        assertEquals("abc_", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidOptionWithJavaIdentifierPart_MChE6() {
        String result = OptionValidator.validate("abc$");
        assertEquals("abc$", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateInvalidFirstChar_kMzi2() {
        try {
            OptionValidator.validate("1option");
        } catch (IllegalArgumentException e) {
            assertEquals("Illegal option name '1'.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidOption_IYMm3() {
        assertEquals("option", OptionValidator.validate("option"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateInvalidChar_jOsf4() {
        try {
            OptionValidator.validate("opt!on");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateAdditionalOptionChar_qmpr5() {
        assertEquals("opt$", OptionValidator.validate("opt$"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateJavaIdentifierPart_GOfO6() {
        assertEquals("opt_", OptionValidator.validate("opt_"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateInvalidChar_rFJb3() {
        try {
            OptionValidator.validate("opt$ion");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidOption_zpry4() {
        String result = OptionValidator.validate("option");
        assertEquals("option", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidLongOption_FxRG5() {
        String result = OptionValidator.validate("veryLongOption");
        assertEquals("veryLongOption", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidOptionWithAdditionalChar_dHmn6() {
        String result = OptionValidator.validate("opt_ion");
        assertEquals("opt_ion", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateInvalidMiddleChar_CZHC3() {
        try {
            OptionValidator.validate("opt!ion");
            fail();
        } catch (IllegalArgumentException e) {
        }
    }
}