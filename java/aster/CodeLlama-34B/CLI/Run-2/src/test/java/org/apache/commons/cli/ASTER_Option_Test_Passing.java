/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgNameWithValidArgumentName_TwuZ0() {
        Option option = new Option("a", "argName", true, "description");
        option.setArgName("argName");
        assertEquals("argName", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgNameWithNullArgumentName_oecU1() {
        Option option = new Option("a", "argName", true, "description");
        option.setArgName(null);
        assertNull(option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgNameWithEmptyArgumentName_RJKb2() {
        Option option = new Option("a", "argName", true, "description");
        option.setArgName("");
        assertEquals("", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptWithLongOption_cccq0() {
        Option option = new Option("a", "longOption", true, "description");
        assertEquals("longOption", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptWithoutLongOption_prOa1() {
        Option option = new Option("a", true, "description");
        assertEquals(null, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptWithNullLongOption_AaFL2() {
        Option option = new Option("a", null, true, "description");
        assertEquals(null, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequiredTrue_jHSC0() {
        Option option = new Option("option", "description");
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequiredFalse_vNkd1() {
        Option option = new Option("option", "description");
        option.setRequired(false);
        assertFalse(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_uYjJ0() {
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.equals(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentOption_RuAR2() {
        Option option1 = new Option("option1", "longOption", true, "description");
        Option option2 = new Option("option2", "longOption", true, "description");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentLongOption_CGNF3() {
        Option option1 = new Option("option", "longOption1", true, "description");
        Option option2 = new Option("option", "longOption2", true, "description");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_notDeprecated_JRVy0() {
        Option option = new Option("option", "longOption", false, "description");
        String result = option.toDeprecatedString();
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDescription_validDescription_pKvy0() {
        Option option = new Option("a", "description");
        option.setDescription("new description");
        assertEquals("new description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDescription_nullDescription_EtRV1() {
        Option option = new Option("a", "description");
        option.setDescription(null);
        assertNull(option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDescription_emptyDescription_FXyd2() {
        Option option = new Option("a", "description");
        option.setDescription("");
        assertEquals("", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_longOptionAndOption_YePC0() {
        Option option = new Option("a", "longOption", true, "description");
        int expected = Objects.hash("longOption", "a");
        int actual = option.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpt_shortOption_ABft0() {
        Option option = new Option("a", "description");
        assertEquals("a", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeWithValidClass_ycup0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeWithInvalidClass_CiwA1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(Integer.class);
        assertNotEquals(String.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIdWithOption_mVeN0() {
        Option option = new Option("a", "longOption", true, "description");
        assertEquals('a', option.getId());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIdWithLongOption_HHPU1() {
        Option option = new Option("a", "longOption", false, "description");
        assertEquals('a', option.getId());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIdWithDescription_QJHR2() {
        Option option = new Option("a", "description");
        assertEquals('a', option.getId());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKeyWithOption_XQem0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("option", option.getKey());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKeyWithNullOptionAndNonNullLongOption_iVsB2() {
        Option option = new Option(null, "longOption", true, "description");
        assertEquals("longOption", option.getKey());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKeyWithNonNullOptionAndNullLongOption_KjDy3() {
        Option option = new Option("option", null, true, "description");
        assertEquals("option", option.getKey());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOptWithValidLongOption_dGJn0() {
        Option option = new Option("a", "longOption", true, "description");
        option.setLongOpt("longOption");
        assertEquals("longOption", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgName2_gKED1() {
        Option option = new Option("a", true, "description");
        assertEquals(null, option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgName3_LNIk2() {
        Option option = new Option("a", "description");
        assertEquals(null, option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDefaultValue_NkXB0() {
        Option option = new Option("option", "description");
        String defaultValue = "defaultValue";
        String value = option.getValue(defaultValue);
        assertEquals(defaultValue, value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithoutDefaultValue_IxNF1() {
        Option option = new Option("option", "description");
        String value = option.getValue();
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullDescription_uRBi6() {
        Option option = new Option("option", null);
        String value = option.getValue();
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType_ValidType_jjru0() {
        Option option = new Option("option", "description");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverter_withConverterAndNullType_mkiu3_KFNb0_1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(null);
        Converter<?, ?> converter = option.getConverter();
        assertNotNull(converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverter_withConverterAndNullType_mkiu3_KFNb0_2() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(null);
        Converter<?, ?> converter = option.getConverter();
        assertEquals(TypeHandler.getDefault().getConverter(String.class), converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgs_ValidInput_sfUW0_teao0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setArgs(1);
        assertEquals(1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_NoArgs_fPSi0_fid1() {
        Option option = new Option("a", "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescription2_LfYX1_fid1() {
        Option option = new Option("b", true, "Banana option");
        assertEquals("Banana option", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentObjects_QfUJ1_fid1() {
        Option option1 = new Option("option", "longOption", true, "description");
        Option option2 = new Option("option", "longOption", true, "description");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_NoArg_dFlh0_fid1() {
        Option option = new Option("a", false, "description");
        assertFalse(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_HasArg_prEN1_fid1() {
        Option option = new Option("a", true, "description");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverter_withNullConverterAndType_Pthd4_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setConverter(null);
        Converter<?, ?> converter = option.getConverter();
        assertNotNull(converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator_cggN0_fid1() {
        Option option = new Option("a", "aaa", true, "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparatorWithoutDescription_ZQMj3_fid1() {
        Option option = new Option("a", "aaa");
    }
}