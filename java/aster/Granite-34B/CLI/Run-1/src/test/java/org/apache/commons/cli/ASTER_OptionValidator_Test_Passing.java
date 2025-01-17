/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_OptionValidator_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_NullOption_YWvK0() {
        String option = null;
        String expected = null;
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_EmptyOption_GtYu1() {
        String option = "";
        IllegalArgumentException expected = new IllegalArgumentException("Empty option name.");
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate(option));
        assertEquals(expected.getMessage(), actual.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOption_Idke4() {
        String option = "a";
        String expected = "a";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOption_EJdT4() {
        String option = "test";
        String expected = "test";
        String actual = OptionValidator.validate(option);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_NullOption_YAIh0() {
        String option = null;
        String expected = null;
        assertEquals(expected, OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_EmptyOption_OnqP1() {
        String option = "";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate(option));
        assertEquals("Empty option name.", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_ValidOption_SiFT2() {
        String option = "validOption";
        String expected = "validOption";
        assertEquals(expected, OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_InvalidOption_vtjI3() {
        String option = "invalidOption!";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_EmptyOption_GtYu1_1() {
        String option = "";
        IllegalArgumentException expected = new IllegalArgumentException("Empty option name.");
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_InvalidOptionName_pLXd2_1() {
        String option = "!";
        IllegalArgumentException expected = new IllegalArgumentException("Illegal option name '!'");
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValidate_EmptyOption_OnqP1_1() {
        String option = "";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> OptionValidator.validate(option));
    }
}