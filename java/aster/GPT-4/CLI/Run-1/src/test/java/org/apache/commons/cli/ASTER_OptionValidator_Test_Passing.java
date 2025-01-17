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
    public void testValidateWithNullOption_vZYj0() {
        assertNull(OptionValidator.validate(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithEmptyOption_HMAZ1() {
        try {
            OptionValidator.validate("");
            fail("Expected IllegalArgumentException for empty option");
        } catch (IllegalArgumentException e) {
            assertEquals("Empty option name.", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithValidSingleCharacter_TkrP2() {
        String option = "a";
        assertEquals("a", OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithValidCharacters_qwiT4() {
        String option = "option1";
        assertEquals("option1", OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithInvalidCharacterInMiddle_rqAb5() {
        try {
            OptionValidator.validate("opt@ion");
            fail("Expected IllegalArgumentException for invalid character in option");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithSpecialValidCharacters_KaTo6() {
        String option = "option_";
        assertEquals("option_", OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithValidSingleChar_Ijsl3() {
        assertEquals("a", OptionValidator.validate("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithValidOption_wsxY5() {
        assertEquals("validOption", OptionValidator.validate("validOption"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_NullOption_HVgh0() {
        String result = OptionValidator.validate(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOptionSingleCharacter_jYfx4() {
        String option = "a";
        String result = OptionValidator.validate(option);
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOptionMultipleCharacters_Zzty5() {
        String option = "validOption123";
        String result = OptionValidator.validate(option);
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidateWithSpecialCharactersInOption_tfLw6() {
        assertEquals("valid_Option123", OptionValidator.validate("valid_Option123"));
    }

    @Test
    public void testValidate_InvalidCharacterInOption_AZAK3_kXPQ0() {
        assertThrows(IllegalArgumentException.class, () -> {
            OptionValidator.validate("valid@name");
        });
    }

    @Test
    public void testValidate_InvalidCharacterAtEnd_EYau6_unDN0() {
        assertThrows(IllegalArgumentException.class, () -> {
            OptionValidator.validate("validName#");
        });
    }
}