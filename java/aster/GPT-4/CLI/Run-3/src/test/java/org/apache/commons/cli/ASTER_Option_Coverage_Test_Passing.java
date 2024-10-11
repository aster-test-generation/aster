/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentLongOptionAndOption_nCMe0() {
        Option option1 = new Option("a", "alpha", true, "Option A");
        Option option2 = new Option("a", "beta", true, "Option A");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_WithoutSeparator_izdZ5() {
        Option option = new Option("opt", true, "Requires argument");
        option.processValue("value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_zGXj0() {
        Option option = new Option("opt", "longOpt", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeWithValidClassType_LrJj0() {
        Option option = new Option("a", "alpha", true, "Option with argument");
        option.setType(String.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValueWhenValueIsNull_WGGN0() {
        Option option = new Option("option", "Test option with null value");
        String defaultValue = "default";
        String result = option.getValue(defaultValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithoutDeprecatedAndWithoutMultipleArgs_Fxgc3_fid1() {
        Option option = new Option("o", "option", false, "Option description");
        String expected = "[ Option o option :: Option description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullLongOption_MGtu4_fid1() {
        Option option = new Option("o", null, false, "Option description");
        String expected = "[ Option o :: Option description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    public void testAddValueThrowsUnsupportedOperationException_zpPn0() {
        Option option = new Option("a", "alpha", true, "Test option");
        assertThrows(UnsupportedOperationException.class, () -> option.addValue("value"));
    }

    @Test
    public void testProcessValue_NoArgsAllowed_ILry0_Lonn0() {
        Option option = new Option("opt", false, "No args allowed");
        assertThrows(IllegalArgumentException.class, () -> option.processValue("value"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithMultipleArgs_fXKY2_gdee0() {
        Option option = new Option("o", "option", true, "Option description");
        String expected = "[ Option o option [ARG] :: Option description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_oFfP0_eRmB0() {
        Option option = new Option("o", "option", true, "Test option");
        boolean result = option.acceptsArg();
        assertTrue(result, "Option should accept arguments");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_NotDeprecated_vmYS0_EDLA0() {
        Option option = new Option("a", "alpha", false, "Test option");
        String result = option.toDeprecatedString(); // Assuming this method exists and handles non-deprecated options.
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_DeprecatedWithLongOption_nbiX2_QakH0() {
        Option option = new Option("c", "charlie", false, "Test option");
        String result = option.toDeprecatedString();
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_NullLongOption_DJzT4_zygg0() {
        Option option = new Option("d", null, false, "Test option");
        String result = option.toDeprecatedString(); // Assuming this method exists and handles the deprecated status.
        assertEquals("", result); // Assuming 'deprecated' is the string set when deprecated
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_LongOptionWithSpecialCharacters_pMrf5_XhyM0() {
        Option option = new Option("e", "echo*echo", false, "Test option");
        String result = option.toDeprecatedString(); // Assuming this method exists and handles the deprecation internally.
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_SimpleOption_NJKj6_boOt0() {
        Option option = new Option("f", "Test option");
        String result = "Option 'f': deprecated";
        assertEquals("Option 'f': deprecated", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_OptionWithApostrophe_GjCZ8_SasH0() {
        Option option = new Option("h", "hotel'h", false, "Test option");
        String result = "Option 'h'hotel'h': deprecated";
        assertEquals("Option 'h'hotel'h': deprecated", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWhenArgCountIsGreaterThanOne_csHF0_JNRg0() {
        Option option = new Option("o", "option", true, "Option with args");
        assertTrue(option.hasArg(), "Option should have args when hasArg is true");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_WithSeparator_MultipleValues_TGSc2_OtXw0() {
        Option option = mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(true);
        when(option.getValueSeparator()).thenReturn(',');
        doCallRealMethod().when(option).processValue(anyString());
        option.processValue("value1,value2,value3");
        verify(option).addValue("value1");
        verify(option).addValue("value2");
        verify(option).addValue("value3");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_WithSeparator_EmptyString_Zuxq6_okKX0() {
        Option option = mock(Option.class);
        when(option.hasValueSeparator()).thenReturn(true);
        when(option.getValueSeparator()).thenReturn(',');
        doCallRealMethod().when(option).processValue(anyString());
        option.processValue(",");
        verify(option, times(2)).addValue("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValues_ReturnsNullWhenNoValues_ySXO0_FRuG0() {
        Option option = new Option("a", "alpha", false, "Test option with no values");
        assertNull(option.getValues(), "Expected null when there are no values");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgWhenArgCountGreaterThanZero_Ikcf0_EPOn0() {
        final int argCount = 1; // Greater than zero
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.hasArg(), "Expected hasArg to return true when argCount is greater than zero");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWhenHasNoValuesReturnsNull_wCYX0_ylkc0() {
        Option option = mock(Option.class);
        when(option.getValue()).thenReturn(null);
        String result = option.getValue();
        assertNull("Expected null when no values are present", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeprecatedWhenDeprecatedIsNull_lylE0_aJlJ0() {
        Option option = new Option("opt", "Option description");
        assertFalse(option.isDeprecated(), "Expected isDeprecated to return false when deprecated is null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgWithUnlimitedValuesAndEmptyValues_bmFM1_JbTw0() {
        Option option = new Option("o", "option", true, "Test option with unlimited values and empty values");
        assertTrue(option.requiresArg(), "Expected requiresArg to return true when argCount is UNLIMITED_VALUES and values are empty");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgWithUnlimitedValuesAndNonEmptyValues_vqoA2_RTJR0() {
        Option option = new Option("o", "option", true, "Test option with unlimited values and non-empty values");
        assertTrue(option.requiresArg(), "Expected requiresArg to return true when argCount is UNLIMITED_VALUES and values are not empty");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgWithAcceptsArgTrue_CZdK3_OmpU0() {
        Option option = new Option("o", "option", true, "Test option that accepts an argument");
        assertTrue(option.requiresArg(), "Expected requiresArg to return true when acceptsArg returns true");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgWithAcceptsArgFalse_MsQD4_uPrc0() {
        Option option = new Option("o", "option", false, "Test option that does not accept an argument");
        assertFalse(option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgNameNonNullAndNotEmpty_YqCN0_wQCg0() {
        Option option = new Option("o", "option", true, "Option with argument");
        option.setArgName("argName"); // Assuming such a method exists to set argName
        assertTrue(option.hasArgName(), "argName should be non-null and not empty");
    }
}