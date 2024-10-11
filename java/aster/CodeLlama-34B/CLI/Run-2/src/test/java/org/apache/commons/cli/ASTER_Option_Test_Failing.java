/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_NoArgs_fPSi0() {
        Option option = new Option("a", "description");
        assertEquals(0, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescription1_xDeF0() {
        Option option = new Option("-a", "--apple", true, "Apple option");
        assertEquals("Apple option", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescription2_LfYX1() {
        Option option = new Option("-b", true, "Banana option");
        assertEquals("Banana option", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withNoValues_lacL0() {
        Option option = new Option("-a", "--apple", false, "Apple option");
        assertNull(option.getValue(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withValues_ULSD1() {
        Option option = new Option("-a", "--apple", true, "Apple option");
        option.addValue("apple");
        assertEquals("apple", option.getValue(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withNoValuesAndNegativeIndex_WRFG2() {
        Option option = new Option("-a", "--apple", false, "Apple option");
        assertNull(option.getValue(-1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentObjects_QfUJ1() {
        Option option1 = new Option("option", "longOption", true, "description");
        Option option2 = new Option("option", "longOption", true, "description");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NoArgs_SBOA0() {
        Option option = new Option("-a", "--apple", false, "Apple option");
        String expected = "[ Option -a --apple :: Apple option :: String ]";
        String actual = option.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_WithArgs_XhIu1() {
        Option option = new Option("-a", "--apple", true, "Apple option");
        String expected = "[ Option -a --apple :: Apple option :: String [ARG...] ]";
        String actual = option.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_NoArg_dFlh0() {
        Option option = new Option("-a", false, "description");
        assertFalse(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_HasArg_prEN1() {
        Option option = new Option("-a", true, "description");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_HasOptionalArg_NrXH2() {
        Option option = new Option("-a", false, "description");
        option.setOptionalArg(true);
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConverter_withNullConverterAndType_Pthd4() {
        Option option = new Option("option", "longOption", true, "description");
        option.setConverter(null);
        Converter<?, ?> converter = option.getConverter();
        assertNull(converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator_cggN0() {
        Option option = new Option("a", "aaa", true, "description");
        assertEquals('a', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparatorWithoutDescription_ZQMj3() {
        Option option = new Option("a", "aaa");
        assertEquals('a', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparatorWithNullLongOption_PXhk6() {
        Option option = new Option("a", null, true, "description");
        assertEquals('a', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparatorWithEmptyLongOption_IoGB7() {
        Option option = new Option("a", "", true, "description");
        assertEquals('a', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparatorWithNullDescription_uqAx8() {
        Option option = new Option("a", "aaa", true, null);
        assertEquals('a', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparatorWithEmptyDescription_wFMI9() {
        Option option = new Option("a", "aaa", true, "");
        assertEquals('a', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_NoArgs_uPCU0() {
        Option option = new Option("-a", "--arg", false, "description");
        assertFalse(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_OneArg_zKWl1() {
        Option option = new Option("-a", "--arg", true, "description");
        assertTrue(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetConverterWithNullConverter_WwHt1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setConverter(null);
        assertNull(option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecated_DBDz0_1() {
        Option option = new Option("option", "longOption", true, "description");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNotNull(deprecated);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecated_DBDz0_2() {
        Option option = new Option("option", "longOption", true, "description");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertEquals("description", deprecated.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecated_DBDz0_3() {
        Option option = new Option("option", "longOption", true, "description");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertEquals("longOption", deprecated.getSince());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecatedWithoutLongOption_TAWr1_1() {
        Option option = new Option("option", true, "description");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNotNull(deprecated);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecatedWithoutLongOption_TAWr1_2() {
        Option option = new Option("option", true, "description");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertEquals("description", deprecated.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecatedWithoutLongOption_TAWr1_3() {
        Option option = new Option("option", true, "description");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNull(deprecated.getSince());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_noArgs_gtxj0() {
        Option option = new Option("-a", false, "description");
        try {
            option.processValue("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("NO_ARGS_ALLOWED", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue_withInvalidSeparator_AfgB4() {
        Option option = new Option("-a", true, "description");
        try {
            option.processValue("value1,value2,value3");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid separator", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_option_wGUs1() {
        Option option = new Option("a", true, "description");
        int expected = Objects.hash("a");
        int actual = option.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_description_XgVa2() {
        Option option = new Option("a", "description");
        int expected = Objects.hash("description");
        int actual = option.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_true_vnoQ0() {
        Option option = new Option("-a", "--arg", true, "description");
        assertTrue(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_true_longOption_yPCc2() {
        Option option = new Option("--arg", "--arg", true, "description");
        assertTrue(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_false_longOption_eymy3() {
        Option option = new Option("--arg", "--arg", false, "description");
        assertFalse(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_true_noLongOption_HaRF4() {
        Option option = new Option("-a", true, "description");
        assertTrue(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeWithNull_omsA2() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(null);
        assertNull(option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesWithNoValues_JAJz0() {
        Option option = new Option("-a", "--apple", false, "Apple option");
        String[] values = option.getValues();
        assertNull(values);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesWithValues_lrie1_1() {
        Option option = new Option("-a", "--apple", true, "Apple option");
        String[] values = option.getValues();
        assertNotNull(values);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesWithValues_lrie1_2() {
        Option option = new Option("-a", "--apple", true, "Apple option");
        String[] values = option.getValues();
        assertEquals(1, values.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesWithValues_lrie1_3() {
        Option option = new Option("-a", "--apple", true, "Apple option");
        String[] values = option.getValues();
        assertEquals("apple", values[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_Option_fjWU0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(option.getType(), "option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_LongOption_Jsmq1() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(option.getType(), "longOption");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_Description_RBZH2() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(option.getType(), "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_NoArg_npTT3() {
        Option option = new Option("option", false, "description");
        assertEquals(option.getType(), "option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_NoLongOption_cjGc4() {
        Option option = new Option("option", "description");
        assertEquals(option.getType(), "option");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_NullOption_xHIl6() {
        Option option = new Option(null, "longOption", true, "description");
        assertEquals(option.getType(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_NullLongOption_xjox7() {
        Option option = new Option("option", null, true, "description");
        assertEquals(option.getType(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_NullDescription_tAtM8() {
        Option option = new Option("option", "longOption", true, null);
        assertEquals(option.getType(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_EmptyOption_zXkw9() {
        Option option = new Option("", "longOption", true, "description");
        assertEquals(option.getType(), "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_EmptyLongOption_ImRL10() {
        Option option = new Option("option", "", true, "description");
        assertEquals(option.getType(), "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_EmptyDescription_uMvN11() {
        Option option = new Option("option", "longOption", true, "");
        assertEquals(option.getType(), "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_InvalidOption_Dnbr12() {
        Option option = new Option("invalidOption", "longOption", true, "description");
        assertEquals(option.getType(), "invalidOption");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_InvalidLongOption_eDxY13() {
        Option option = new Option("option", "invalidLongOption", true, "description");
        assertEquals(option.getType(), "invalidLongOption");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetType_InvalidDescription_hAjC14() {
        Option option = new Option("option", "longOption", true, "invalidDescription");
        assertEquals(option.getType(), "invalidDescription");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOpt_withLongOption_NVaB0() {
        Option option = new Option("-a", "--long-option", true, "description");
        assertTrue(option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOpt_withoutLongOption_Gekj1() {
        Option option = new Option("-a", false, "description");
        assertFalse(option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOpt_withNullOption_hGFo2() {
        Option option = new Option(null, "--long-option", true, "description");
        assertFalse(option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOpt_withDifferentHasArgAndDescription_LZoA3() {
        Option option = new Option("-a", "--long-option", false, "description");
        assertTrue(option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_NoArg_sucB0() {
        Option option = new Option("-a", false, "description");
        assertFalse(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_WithArg_RnRC1() {
        Option option = new Option("-a", true, "description");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNoValues_ScEn0() {
        Option option = new Option("-a", false, "description");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithValues_zDYL1() {
        Option option = new Option("-a", true, "description");
        option.addValue("value1");
        option.addValue("value2");
        assertEquals("value1", option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithLongOption_Hobu2() {
        Option option = new Option("--long-option", true, "description");
        option.addValue("value1");
        assertEquals("value1", option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNoValuesAndLongOption_gxhN5() {
        Option option = new Option("--long-option", false, "description");
        assertNull(option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithMultipleValuesAndLongOption_YgEc7() {
        Option option = new Option("--long-option", true, "description");
        option.addValue("value1");
        option.addValue("value2");
        assertEquals("value1", option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList1_KAXK0_1() {
        Option option = new Option("option", "longOption", true, "description");
        List<String> values = option.getValuesList();
        assertEquals(1, values.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList1_KAXK0_2() {
        Option option = new Option("option", "longOption", true, "description");
        List<String> values = option.getValuesList();
        assertEquals("option", values.get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList2_otiV1_1() {
        Option option = new Option("option", true, "description");
        List<String> values = option.getValuesList();
        assertEquals(1, values.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList2_otiV1_2() {
        Option option = new Option("option", true, "description");
        List<String> values = option.getValuesList();
        assertEquals("option", values.get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList3_bqER2_1() {
        Option option = new Option("option", "description");
        List<String> values = option.getValuesList();
        assertEquals(1, values.size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList3_bqER2_2() {
        Option option = new Option("option", "description");
        List<String> values = option.getValuesList();
        assertEquals("option", values.get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOptWithInvalidLongOption_DVWr1() {
        Option option = new Option("a", "longOption", true, "description");
        option.setLongOpt("invalidLongOption");
        assertEquals("longOption", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOptWithNullLongOption_WuMw2() {
        Option option = new Option("a", "longOption", true, "description");
        option.setLongOpt(null);
        assertEquals("longOption", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgName1_Gyfd0() {
        Option option = new Option("a", "arg", true, "description");
        assertEquals("arg", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeprecated_true_JOQF0() {
        Option option = new Option("-a", "--all", true, "Display all options");
        assertTrue(option.isDeprecated());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeprecated_false_TLFD1() {
        Option option = new Option("-a", "--all", false, "Display all options");
        assertFalse(option.isDeprecated());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg_optionalArg_false_ooTb0() {
        Option option = new Option("-a", false, "description");
        assertFalse(option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArg_NoArg_bFfA0() {
        Option option = new Option("-a", "--apple", false, "Apple");
        assertFalse(option.hasOptionalArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArg_HasArg_Nekr1() {
        Option option = new Option("-b", "--banana", true, "Banana");
        assertTrue(option.hasOptionalArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArg_NoLongOption_bvzp2() {
        Option option = new Option("-c", "Cantaloupe");
        assertFalse(option.hasOptionalArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_true_rExs0() {
        Option option = new Option("-a", "--arg", true, "description");
        assertTrue(option.hasArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_false_uBKd1() {
        Option option = new Option("-a", "--arg", false, "description");
        assertFalse(option.hasArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithHasArg_Kbly3() {
        Option option = new Option("option", true, "description");
        String value = option.getValue();
        assertEquals("true", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithoutHasArg_NAZj4() {
        Option option = new Option("option", false, "description");
        String value = option.getValue();
        assertEquals("false", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithDescription_mNYP5() {
        Option option = new Option("option", "description");
        String value = option.getValue();
        assertEquals("description", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithEmptyDescription_XlYc7() {
        Option option = new Option("option", "");
        String value = option.getValue();
        assertEquals("", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithAllParameters_GeoP9() {
        Option option = new Option("option", "longOption", true, "description");
        String value = option.getValue();
        assertEquals("longOption", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithoutLongOption_aBwA10() {
        Option option = new Option("option", null, true, "description");
        String value = option.getValue();
        assertEquals("true", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredWithLongOption_DejH0() {
        Option option = new Option("-a", "--apple", true, "Apple");
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequiredWithShortOption_pPBM1() {
        Option option = new Option("-a", true, "Apple");
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType_InvalidType_rkWh1() {
        Option option = new Option("option", "description");
        option.setType(Integer.class);
        assertEquals(null, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType_NullType_KdLp2() {
        Option option = new Option("option", "description");
        option.setType(null);
        assertEquals(null, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddValueWithOptionAndLongOption_woSS0() {
        Option option = new Option("-a", "--all", false, "Display all information");
        boolean result = option.addValue("-a");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddValueWithOptionAndHasArg_ahcW1() {
        Option option = new Option("-a", false, "Display all information");
        boolean result = option.addValue("-a");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddValueWithOption_hnOa2() {
        Option option = new Option("-a", "Display all information");
        boolean result = option.addValue("-a");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_OneArg_WXwO1_KuUY0() {
        Option option = new Option("a", "description");
        assertEquals(1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgs_TwoArgs_qqmd2_RuKL0() {
        Option option = new Option("a", "description", true, "arg1");
        assertEquals(2, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_WithDeprecated_nhZL3_rcds0() {
        Option option = new Option("-a", "--apple", false, "Apple option");
        String expected = "[ Option -a --apple :: Apple option :: String :: deprecated ]";
        String actual = option.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_HasArgs_DizT3_JyNW0() {
        Option option = new Option("-a", true, "description");
        option.setArgs(2);
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparatorWithNullOption_dCaG4_gRDQ0() {
        Option option = new Option(null, "aaa", true, "description");
        assertNull(option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecatedWithoutDescription_ZxzY2_wSrA0_2() {
        Option option = new Option("option", "longOption", true, "description");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNull(deprecated.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecatedWithoutLongOptionAndDescription_wbFD3_lCoY0_1() {
        Option option = new Option("option", "");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNotNull(deprecated);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecatedWithoutLongOptionAndDescription_wbFD3_lCoY0_2() {
        Option option = new Option("option", "");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNull(deprecated.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecatedWithoutLongOptionAndDescription_wbFD3_lCoY0_3() {
        Option option = new Option("option", "");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNull(deprecated.getSince());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_ArgCountGreaterThan0_yJGs4_cCSz0() {
        Option option = new Option("-a", false, "description");
        option.setArgName("arg");
        option.setArgs(1);
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithoutHasArg_iXWr11_ZqnP0() {
        Option option = new Option("option", "longOption", false, "description");
        String value = option.getValue();
        assertEquals("longOption", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withNoValues_lacL0_fid1() {
        Option option = new Option("-a", "Apple option");
        assertNull(option.getValue(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_HasOptionalArg_NrXH2_fid1() {
        Option option = new Option("-a", "description");
        option.setOptionalArg(true);
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecated_DBDz0() {
        Option option = new Option("option", "longOption", true, "description");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNotNull(deprecated);
        assertEquals("description", deprecated.getDescription());
        assertEquals("longOption", deprecated.getSince());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecatedWithoutLongOption_TAWr1() {
        Option option = new Option("option", true, "description");
        DeprecatedAttributes deprecated = option.getDeprecated();
        assertNotNull(deprecated);
        assertEquals("description", deprecated.getDescription());
        assertNull(deprecated.getSince());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesWithValues_lrie1() {
        Option option = new Option("-a", "--apple", true, "Apple option");
        String[] values = option.getValues();
        assertNotNull(values);
        assertEquals(1, values.length);
        assertEquals("apple", values[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList1_KAXK0() {
        Option option = new Option("option", "longOption", true, "description");
        List<String> values = option.getValuesList();
        assertEquals(1, values.size());
        assertEquals("option", values.get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList2_otiV1() {
        Option option = new Option("option", true, "description");
        List<String> values = option.getValuesList();
        assertEquals(1, values.size());
        assertEquals("option", values.get(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuesList3_bqER2() {
        Option option = new Option("option", "description");
        List<String> values = option.getValuesList();
        assertEquals(1, values.size());
        assertEquals("option", values.get(0));
    }
}