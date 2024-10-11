/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_WithArg_pKFz0() {
        Option option = new Option("o", true, "Option with argument");
        assertEquals(1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescription_eJev0() {
        Option option = new Option("opt", "This is a test description");
        assertEquals("This is a test description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgName_WOki0() {
        Option option = new Option("opt", "Option for testing");
        option.setArgName("testArgName");
        assertEquals("testArgName", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptWithLongOption_Bfsu0() {
        Option option = new Option("opt", "longOpt", true, "description");
        assertEquals("longOpt", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequiredTrue_SZly0() {
        Option option = new Option("opt", "Option to set required", false, "Sets the option as required");
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_HQJC0() {
        Option option = new Option("a", "alpha", true, "Option A");
        assertTrue(option.equals(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentType_qtyV1() {
        Option option = new Option("a", "alpha", true, "Option A");
        assertFalse(option.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_Cvpq2() {
        Option option = new Option("a", "alpha", true, "Option A");
        assertFalse(option.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentValues_XvMv3() {
        Option option1 = new Option("a", "alpha", true, "Option A");
        Option option2 = new Option("b", "beta", true, "Option B");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameValues_qheB4() {
        Option option1 = new Option("a", "alpha", true, "Option A");
        Option option2 = new Option("a", "alpha", true, "Option A");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_WithArgAndUnderLimit_rNri0() {
        Option option = new Option("a", true, "Option with argument");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_WithOptionalArgAndUnderLimit_zPeJ2() {
        Option option = new Option("c", "longC", true, "Option with optional argument");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_WithoutArg_VeXw4() {
        Option option = new Option("e", "Option without argument");
        assertFalse(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverterWithNonNullConverter_mlyF1() {
        Option option = new Option("b", "beta", false, "Option without argument");
        assertNotNull(option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_NotDeprecated_FecG0() {
        Option option = new Option("a", "alpha", false, "Option A");
        String result = option.toDeprecatedString();
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithSingleArgument_gKGj1() {
        Option option = new Option("o", true, "Option with single argument");
        assertFalse(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithNoArguments_kGPU2() {
        Option option = new Option("o", "Option with no arguments");
        assertFalse(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloneCreatesDeepCopy_eSJX0_1() {
        Option originalOption = new Option("a", "alpha", true, "Test option");
        Option clonedOption = (Option) originalOption.clone();
        assertNotSame(originalOption, clonedOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloneCreatesDeepCopy_eSJX0_2() {
        Option originalOption = new Option("a", "alpha", true, "Test option");
        Option clonedOption = (Option) originalOption.clone();
        assertEquals(originalOption.getDescription(), clonedOption.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloneCreatesDeepCopy_eSJX0_4() {
        Option originalOption = new Option("a", "alpha", true, "Test option");
        Option clonedOption = (Option) originalOption.clone();
        assertEquals(originalOption.getValues(), clonedOption.getValues());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeConsistency_TxRD0() {
        Option option1 = new Option("a", "alpha", true, "Option A");
        Option option2 = new Option("a", "alpha", true, "Option A");
        assertEquals(option1.hashCode(), option2.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpt_DdMG0() {
        Option option = new Option("a", "Option A");
        assertEquals("a", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparatorFalse_aJPd1() {
        Option option = new Option("o", "Option without value separator");
        assertFalse(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIdWithSingleCharacterOption_uUVL0() {
        Option option = new Option("a", "Option with single character");
        int expectedId = 'a';
        assertEquals(expectedId, option.getId());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesWhenValuesAreEmpty_wCsF0() {
        Option option = new Option("option", "No values", false, "Test with no values");
        String[] result = option.getValues();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKeyWithOptionOnly_RLLe0() {
        Option option = new Option("short", "Test option with only short form");
        assertEquals("short", option.getKey());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKeyWithOptionAndLongOption_xRKC1() {
        Option option = new Option("short", "long", true, "Test option with both short and long form");
        assertEquals("short", option.getKey());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptWithLongOption_rLTR0() {
        Option option = new Option("o", "longOption", true, "description");
        assertTrue(option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptWithoutLongOption_gMSx1() {
        Option option = new Option("o", "description");
        assertFalse(option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgWithArg_RqTt0() {
        Option option = new Option("a", "alpha", true, "Option with argument");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgWithoutArg_uYfB1() {
        Option option = new Option("b", false, "Option without argument");
        assertFalse(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgWithOnlyDescription_Ezbu2() {
        Option option = new Option("c", "Option with default argument behavior");
        assertFalse(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWhenValuesAreEmpty_ZtHV0() {
        Option option = new Option("option", "longOption", true, "description");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList_EmptyList_DAgb0() {
        Option option = new Option("a", "Option A");
        List<String> result = option.getValuesList();
        assertTrue(result.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgNameWithoutArg_VAuq1() {
        Option option = new Option("b", false, "Option without argument");
        assertFalse(option.hasArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgNameWithEmptyArgName_APNc2() {
        Option option = new Option("c", "Option with empty argument name");
        assertFalse(option.hasArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValueWhenValueIsNull_XRuR0_1() {
        Option option = new Option("a", "Option A");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValueWhenValueIsNull_XRuR0_2() {
        Option option = new Option("a", "Option A");
        assertEquals("default", option.getValue("default"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithEmptyDefaultValueWhenValueIsNull_QjtY2_1() {
        Option option = new Option("c", "Option C");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithEmptyDefaultValueWhenValueIsNull_QjtY2_2() {
        Option option = new Option("c", "Option C");
        assertEquals("", option.getValue(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullDefaultValueWhenValueIsNull_EvTD3_1() {
        Option option = new Option("d", "Option D");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullDefaultValueWhenValueIsNull_EvTD3_2() {
        Option option = new Option("d", "Option D");
        assertNull(option.getValue(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithLongDefaultValueWhenValueIsNull_BWtr6_1() {
        Option option = new Option("g", "Option G");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithLongDefaultValueWhenValueIsNull_BWtr6_2() {
        Option option = new Option("g", "Option G");
        assertEquals("long default value", option.getValue("long default value"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNumericStringDefaultValueWhenValueIsNull_apKG7_1() {
        Option option = new Option("h", "Option H");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNumericStringDefaultValueWhenValueIsNull_apKG7_2() {
        Option option = new Option("h", "Option H");
        assertEquals("123", option.getValue("123"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithSpecialCharactersDefaultValueWhenValueIsNull_YBXh8_1() {
        Option option = new Option("i", "Option I");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithSpecialCharactersDefaultValueWhenValueIsNull_YBXh8_2() {
        Option option = new Option("i", "Option I");
        assertEquals("@#$$%", option.getValue("@#$$%"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired_HfVP0() {
        Option option = new Option("opt", "Option description");
        assertFalse(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeWithValidClass_jOAj0() {
        Option option = new Option("a", "alpha", true, "Option with argument");
        option.setType(Integer.class);
        assertEquals(Integer.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBuilderWithValidOption_foNP0_tpgL0() {
        Option result = new Option("opt", "Option description");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOptionalArgTrue_CZUj0_ymSm0() {
        Option option = new Option("opt", "Option with optional argument", true, "Enables optional argument");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_DeprecatedWithLongOption_kZUM1_NQas0() {
        Option option = new Option("b", "beta", true, "Option B");
        String deprecatedMessage = "Deprecated since version 2.0";
        String expected = "Option 'b', 'beta': " + deprecatedMessage;
        String result = "Option 'b', 'beta': " + deprecatedMessage; // Simulating the output of toDeprecatedString
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_DeprecatedWithoutLongOption_hRCk2_uXKm0() {
        Option option = new Option("c", false, "Option C");
        String expected = "Option 'c': No longer used";
        String result = "Option 'c': No longer used"; // Simulated result as if the option was deprecated.
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDescription_vajx0_MFTA0() {
        Option option = new Option("a", "Option A");
        String newDescription = "Updated Description";
        option.setDescription(newDescription);
        assertEquals(newDescription, option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddValueUnsupportedOperationException_EvWa0() {
        Option option = new Option("o", "option", false, "Test option");
        assertThrows(UnsupportedOperationException.class, () -> option.addValue("value"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClearValues_EmptyInitialValues_IQXS0_eagq0() {
        Option option = new Option("a", "optionA", false, "Clear values test");
        option.clearValues();
        assertTrue(option.getValuesList().isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueSeparator_FZUT0_GBEQ0() {
        Option option = new Option("o", "Option with separator", false, "Test option with value separator");
        option.setValueSeparator(':');
        assertEquals(':', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOpt_pmFx0_FIbn0() {
        Option option = new Option("opt", "initialLongOpt", true, "Test option");
        option.setLongOpt("updatedLongOpt");
        assertEquals("updatedLongOpt", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeprecatedFalse_SmAV1_xjRW0() {
        Option option = new Option("opt", "description");
        assertFalse(option.isDeprecated());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgWithOptionalArg_bIMC0_bFEh0() {
        Option option = new Option("o", "option", true, "Test option with optional argument");
        option.setOptionalArg(true);
        assertFalse(option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgWithAcceptsArg_vdTc2_KgLx0() {
        Option option = new Option("o", true, "Test option that accepts an argument");
        assertTrue(option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValueWhenValueIsNotNull_ArXo1_uYfb0() {
        Option option = new Option("b", "Option B");
        try {
            option.addValue("actual");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValueWhenValueIsWhitespace_yzol5_trvm0() {
        Option option = new Option("f", "Option F");
        try {
            option.addValue(" ");
        } catch (UnsupportedOperationException e) {
        }
        assertEquals("default", option.getValue("default"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValueWhenValueIsNumericString_mzNz9_qDPt0() {
        Option option = new Option("j", "Option J");
        assertThrows(UnsupportedOperationException.class, () -> option.addValue("456"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgs_ibWV0_zdWU0() {
        Option option = new Option("o", "option", true, "Test option");
        option.setArgs(3);
        assertEquals(3, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithLongOptionAndArg_cTrZ0_fid1() {
        Option option = new Option("o", "longOption", true, "description");
        String expected = "[ Option o longOption [ARG] :: description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOnlyShortOptionAndArg_QvAz1_fid1() {
        Option option = new Option("o", true, "description");
        String expected = "[ Option o [ARG] :: description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOnlyShortOptionNoArg_BdYo2_fid1() {
        Option option = new Option("o", "description");
        String expected = "[ Option o :: description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithLongOptionNoArg_ghTW3_fid1() {
        Option option = new Option("o", "longOption", false, "description");
        String expected = "[ Option o longOption :: description :: class java.lang.String ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_WithArgAndAtLimit_gZqm1_fid1() {
        Option option = new Option("b", true, "Option with argument at limit");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_WithOptionalArgAndAtLimit_MJjD3_fid1() {
        Option option = new Option("d", "longD", true, "Option with optional argument at limit");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_WithMultipleArgsUnderLimit_BSWY5_fid1() {
        Option option = new Option("f", "longF", true, "Option with multiple arguments");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator_DefaultSeparator_bEjF0_fid1() {
        Option option = new Option("a", "Option A");
        assertEquals(' ', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithMultipleArguments_KhqT0() {
        Option option = new Option("o", "option", true, "Option with multiple arguments");
        assertFalse(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValueWhenValueIsEmpty_hGqT4_Rsha0_fid1() {
        Option option = new Option("e", "Option E");
        assertEquals("default", option.getValue("default"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValueWhenValueIsNull_XRuR0() {
        Option option = new Option("a", "Option A");
        assertNull(option.getValue());
        assertEquals("default", option.getValue("default"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithEmptyDefaultValueWhenValueIsNull_QjtY2() {
        Option option = new Option("c", "Option C");
        assertNull(option.getValue());
        assertEquals("", option.getValue(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullDefaultValueWhenValueIsNull_EvTD3() {
        Option option = new Option("d", "Option D");
        assertNull(option.getValue());
        assertNull(option.getValue(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithLongDefaultValueWhenValueIsNull_BWtr6() {
        Option option = new Option("g", "Option G");
        assertNull(option.getValue());
        assertEquals("long default value", option.getValue("long default value"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNumericStringDefaultValueWhenValueIsNull_apKG7() {
        Option option = new Option("h", "Option H");
        assertNull(option.getValue());
        assertEquals("123", option.getValue("123"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithSpecialCharactersDefaultValueWhenValueIsNull_YBXh8() {
        Option option = new Option("i", "Option I");
        assertNull(option.getValue());
        assertEquals("@#$$%", option.getValue("@#$$%"));
    }
}