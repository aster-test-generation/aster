/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionValidator_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_NullOption_EyTo0() {
        String option = null;
        String expected = null;
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOption_Dsdn2() {
        String option = "validOption";
        String expected = "validOption";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_InvalidOption_iOxr3() {
        String option = "invalidOption";
        String expected = null;
        String actual = OptionValidator.validate(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_OptionWithInvalidChar_phQS4() {
        String option = "optionWithInvalidChar";
        String expected = null;
        String actual = OptionValidator.validate(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_OptionWithValidChar_Rdio5() {
        String option = "optionWithValidChar";
        String expected = "optionWithValidChar";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_OptionWithMultipleValidChars_YMqI6() {
        String option = "optionWithMultipleValidChars";
        String expected = "optionWithMultipleValidChars";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_EmptyOption_WCqH1() {
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
    public void testValidate_ValidOption_ylPn2() {
        String option = "validOption";
        String result = OptionValidator.validate(option);
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_OptionWithValidChar_Vded5() {
        String option = "optionWithValidChar";
        String result = OptionValidator.validate(option);
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_OptionWithAdditionalLongChar_AwMe6() {
        String option = "optionWithAdditionalLongChar";
        String result = OptionValidator.validate(option);
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_OptionWithInvalidChar_tVkZ4() {
        String option = "validOption";
        char[] chars = option.toCharArray();
        chars[0] = '!';
        String invalidOption = new String(chars);
        try {
            OptionValidator.validate(invalidOption);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_OptionWithValidChar_rHOF5() {
        String option = "validOption";
        char[] chars = option.toCharArray();
        chars[0] = 'a';
        String validOption = new String(chars);
        String result = OptionValidator.validate(validOption);
        assertEquals(validOption, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOption_Flcy3() {
        String option = "valid_option";
        String result = OptionValidator.validate(option);
        assertEquals("valid_option", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOptionWithAdditionalChars_vspF4() {
        String option = "valid_option_with_additional_chars";
        String result = OptionValidator.validate(option);
        assertEquals("valid_option_with_additional_chars", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOptionWithInvalidChars_wilr5() {
        String option = "valid_option_with_invalid_chars";
        try {
            OptionValidator.validate(option);
            assertEquals("valid_option_with_invalid_chars", OptionValidator.validate(option));
        } catch (IllegalArgumentException e) {
            fail("Expected IllegalArgumentException");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOptionWithValidChars_DHik6() {
        String option = "valid_option_with_valid_chars";
        String result = OptionValidator.validate(option);
        assertEquals("valid_option_with_valid_chars", result);
    }
}