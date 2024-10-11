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
    public void testValidateNull_VMgz0() {
        String option = null;
        assertNull(OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateEmpty_GJDy1() {
        String option = "";
        assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValid_XCaT2() {
        String option = "validOption";
        assertEquals(option, OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidWithAdditionalChars_ygEf4() {
        String option = "validOption_";
        assertEquals(option, OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidWithMultipleAdditionalChars_aETD6() {
        String option = "validOption_123";
        assertEquals(option, OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_EmptyOption_CMam0() {
        String option = "";
        try {
            OptionValidator.validate(option);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Empty option name.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateNull_affr0() {
        String option = null;
        String expected = null;
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValid_jmlB2() {
        String option = "valid";
        String expected = "valid";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateInvalid_SIQr3() {
        String option = "invalid";
        String expected = null;
        String actual = OptionValidator.validate(option);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidWithAdditionalChars_mEnM4() {
        String option = "valid_with_additional_chars";
        String expected = "valid_with_additional_chars";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateInvalidWithAdditionalChars_oKFn5() {
        String option = "invalid_with_additional_chars";
        String expected = null;
        String actual = OptionValidator.validate(option);
        assertNull(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateValidWithMultipleAdditionalChars_sHXb6() {
        String option = "valid_with_multiple_additional_chars";
        String expected = "valid_with_multiple_additional_chars";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateInvalidWithMultipleAdditionalChars_XgMl7() {
        String option = "invalid_with_multiple_additional_chars";
        String expected = null;
        String actual = OptionValidator.validate(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_EmptyOption_fbbF1() {
        try {
            OptionValidator.validate("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Empty option name.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOption_YBOT2() {
        String option = "validOption";
        String result = OptionValidator.validate(option);
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_OptionWithValidChar_tcUi5() {
        String option = "optionWithValidChar";
        String result = OptionValidator.validate(option);
        assertEquals(option, result);
    }
}