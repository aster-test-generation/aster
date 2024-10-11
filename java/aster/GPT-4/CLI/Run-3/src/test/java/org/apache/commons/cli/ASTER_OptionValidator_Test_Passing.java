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
    public void testValidateWithNullOption_PAOs0() throws Exception {
        String result = OptionValidator.validate(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithValidSingleCharacter_Alcw3() throws Exception {
        String option = "a";
        String result = OptionValidator.validate(option);
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithValidOptionName_wOpQ5() throws Exception {
        String option = "validOption123";
        String result = OptionValidator.validate(option);
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_EmptyOption_PnCB1() throws Exception {
        try {
            OptionValidator.validate("");
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Empty option name.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidSingleCharacterOption_DVwg2() throws Exception {
        String result = OptionValidator.validate("a");
        assertEquals("a", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_InvalidSingleCharacterOption_iDab3() throws Exception {
        try {
            OptionValidator.validate("!");
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Illegal option name '!'.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidMultiCharacterOption_gyUA4() throws Exception {
        String result = OptionValidator.validate("option1");
        assertEquals("option1", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_InvalidMultiCharacterOption_iIHk5() throws Exception {
        try {
            OptionValidator.validate("option#");
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOptionWithAdditionalChars_kcjt6() throws Exception {
        String result = OptionValidator.validate("option-2");
        assertEquals("option-2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithNullInput_zHkk0() throws Exception {
        assertNull("Expected null for null input", OptionValidator.validate(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithEmptyString_oFbx1() throws Exception {
        try {
            OptionValidator.validate("");
            fail("Expected IllegalArgumentException for empty input");
        } catch (IllegalArgumentException e) {
            assertEquals("Empty option name.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithInvalidFirstCharacter_SXjl2() throws Exception {
        try {
            OptionValidator.validate("1invalid");
            fail("Expected IllegalArgumentException for invalid first character");
        } catch (IllegalArgumentException e) {
            assertEquals("Illegal option name '1'.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithInvalidCharacter_Xpcj3() throws Exception {
        try {
            OptionValidator.validate("valid@name");
            fail("Expected IllegalArgumentException for invalid character in option name");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithValidSingleCharacter_dnBy4() throws Exception {
        String option = "a";
        assertEquals("Expected valid single character to pass", option, OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithValidCharacters_MaYi5() throws Exception {
        String option = "validOption123";
        assertEquals("Expected valid characters to pass", option, OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithSpecialCharacters_PaqV6() throws Exception {
        try {
            OptionValidator.validate("validOption#");
            fail("Expected IllegalArgumentException for special characters");
        } catch (IllegalArgumentException e) {
        }
    }
}