/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOption_XPjB0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOption2_aOoG1() {
        Option option = new Option("option", true, "description");
        assertEquals(1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDescriptionTest_HaOi0_1() {
        Option option1 = new Option("option", "longOption", true, "description");
        Option option2 = new Option("option", true, "description");
        Option option3 = new Option("option", "description");
        assertEquals("description", option1.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDescriptionTest_HaOi0_2() {
        Option option1 = new Option("option", "longOption", true, "description");
        Option option2 = new Option("option", true, "description");
        Option option3 = new Option("option", "description");
        assertEquals("description", option2.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDescriptionTest_HaOi0_3() {
        Option option1 = new Option("option", "longOption", true, "description");
        Option option2 = new Option("option", true, "description");
        Option option3 = new Option("option", "description");
        assertEquals("description", option3.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgName_FQbT0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setArgName("argName");
        assertEquals("argName", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgNameWithNoArg_gQXs1() {
        Option option = new Option("option", true, "description");
        option.setArgName("argName");
        assertEquals("argName", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetArgNameWithDescriptionOnly_BNea2() {
        Option option = new Option("option", "description");
        option.setArgName("argName");
        assertEquals("argName", option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOpt_pqpm0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("longOption", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptWithNoLongOption_IHsL1() {
        Option option = new Option("option", true, "description");
        assertEquals(null, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOptWithNoOption_xMuC2() {
        Option option = new Option(null, "description");
        assertEquals(null, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequired_pcZr0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequiredWithNoArg_mYGm1() {
        Option option = new Option("option", true, "description");
        option.setRequired(false);
        assertTrue(!option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequiredWithDescriptionOnly_vriq2() {
        Option option = new Option("option", "description");
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValueWithNoValues_PUhN1() {
        Option option = new Option("option", "longOption", true, "description");
        String value = option.getValue(1);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_puvV0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(true, option.equals(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNullObject_acSS1() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(false, option.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentObjectType_FHhv2() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(false, option.equals(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithEqualObjects_gybc3() {
        Option option1 = new Option("option", "longOption", true, "description");
        Option option2 = new Option("option", "longOption", true, "description");
        assertEquals(true, option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentLongOptions_KkhV4() {
        Option option1 = new Option("option", "longOption1", true, "description");
        Option option2 = new Option("option", "longOption2", true, "description");
        assertEquals(false, option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentOptions_ltuV5() {
        Option option1 = new Option("option1", "longOption", true, "description");
        Option option2 = new Option("option2", "longOption", true, "description");
        assertEquals(false, option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionLongOptionHasArgDescriptionAndType_wajS3() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(String.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWhenHasArgReturnsTrue_nHfU0() {
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWhenHasArgsReturnsTrue_ElHn1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setArgs(2);
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWhenHasOptionalArgReturnsTrue_LqmF2() {
        Option option = new Option("option", "longOption", true, "description");
        option.setOptionalArg(true);
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWhenHasArgReturnsFalse_iupU4() {
        Option option = new Option("option", "longOption", false, "description");
        assertFalse(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getConverterTest1_Sbwi0() {
        Option option = new Option("option", "longOption", true, "description");
        Converter<?, ?> converter = option.getConverter();
        assertNotNull(converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getConverterTest2_bZKY1() {
        Option option = new Option("option", true, "description");
        Converter<?, ?> converter = option.getConverter();
        assertNotNull(converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getConverterTest3_QlnT2() {
        Option option = new Option("option", "description");
        Converter<?, ?> converter = option.getConverter();
        assertNotNull(converter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedStringWhenOptionIsNotDeprecated_ZQuM2() {
        Option option = new Option("c", "charlie", false, "This is a third test option");
        assertEquals("", option.toDeprecatedString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator_WaQE0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(0, option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator2_uWPR1() {
        Option option = new Option("option", true, "description");
        assertEquals(0, option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueSeparator3_UzVZ2() {
        Option option = new Option("option", "description");
        assertEquals(0, option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDescription_uYXR0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setDescription("newDescription");
        assert option.getDescription().equals("newDescription");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDescriptionWithNoArg_zMuR1() {
        Option option = new Option("option", true, "description");
        option.setDescription("newDescription");
        assert option.getDescription().equals("newDescription");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDescriptionWithOptionOnly_qvsY2() {
        Option option = new Option("option", "description");
        option.setDescription("newDescription");
        assert option.getDescription().equals("newDescription");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_RfGv0() throws Exception {
        Option option = new Option("option", "longOption", true, "description");
        Option clone = (Option) option.clone();
        assertEquals(option, clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone2_NhNq1() throws Exception {
        Option option = new Option("option", true, "description");
        Option clone = (Option) option.clone();
        assertEquals(option, clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone3_VjrV2() throws Exception {
        Option option = new Option("option", "description");
        Option clone = (Option) option.clone();
        assertEquals(option, clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecated_Jkur0_1() {
        Option option = new Option("option", "longOption", true, "description");
        option = new Option("option", true, "description");
        option = new Option("option", "description");
        assertEquals(option.getDeprecated(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithNoArgs_rDHb0() {
        Option option = new Option("a", "alpha", false, "This is a test");
        try {
            option.processValue("test");
            fail("Expected IllegalArgumentException not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("NO_ARGS_ALLOWED", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithOneArg_FlkE1() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.processValue("test");
        assertEquals("test", option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithTwoArgs_oGmx2_1() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(2);
        option.processValue("test1");
        option.processValue("test2");
        assertEquals("test1", option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithTwoArgs_oGmx2_2() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(2);
        option.processValue("test1");
        option.processValue("test2");
        assertEquals("test2", option.getValue(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithThreeArgs_YyaK3_1() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(3);
        option.processValue("test1");
        option.processValue("test2");
        option.processValue("test3");
        assertEquals("test1", option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithThreeArgs_YyaK3_2() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(3);
        option.processValue("test1");
        option.processValue("test2");
        option.processValue("test3");
        assertEquals("test2", option.getValue(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithThreeArgs_YyaK3_3() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(3);
        option.processValue("test1");
        option.processValue("test2");
        option.processValue("test3");
        assertEquals("test3", option.getValue(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithFourArgs_AmzC4_1() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(4);
        option.processValue("test1");
        option.processValue("test2");
        option.processValue("test3");
        option.processValue("test4");
        assertEquals("test1", option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithFourArgs_AmzC4_2() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(4);
        option.processValue("test1");
        option.processValue("test2");
        option.processValue("test3");
        option.processValue("test4");
        assertEquals("test2", option.getValue(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithFourArgs_AmzC4_3() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(4);
        option.processValue("test1");
        option.processValue("test2");
        option.processValue("test3");
        option.processValue("test4");
        assertEquals("test3", option.getValue(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithFourArgs_AmzC4_4() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(4);
        option.processValue("test1");
        option.processValue("test2");
        option.processValue("test3");
        option.processValue("test4");
        assertEquals("test4", option.getValue(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueLineCoverage_pUDf5_1() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(4);
        option.processValue("test1");
        assertEquals("test1", option.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ibwn0_1() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option2", "longOption2", true, "description2");
        Option option3 = new Option("option3", "longOption3", true, "description3");
        assertEquals(option1.hashCode(), option1.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ibwn0_2() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option2", "longOption2", true, "description2");
        Option option3 = new Option("option3", "longOption3", true, "description3");
        assertEquals(option2.hashCode(), option2.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ibwn0_3() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option2", "longOption2", true, "description2");
        Option option3 = new Option("option3", "longOption3", true, "description3");
        assertEquals(option3.hashCode(), option3.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_nnqC0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("option", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_RnrP1() {
        Option option = new Option("option", true, "description");
        assertEquals("option", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_mQnI2() {
        Option option = new Option("option", "description");
        assertEquals("option", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_dWxJ0_2() {
        Option option1 = new Option("a", "longa", true, "description");
        Option option2 = new Option("b", "longb", false, "description");
        assertFalse(option2.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator2_zHLa1_2() {
        Option option1 = new Option("c", true, "description");
        Option option2 = new Option("d", false, "description");
        assertFalse(option2.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator3_ykEu2_2() {
        Option option1 = new Option("e", "description");
        Option option2 = new Option("f", "description");
        assertFalse(option2.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetId_caXt0() {
        Option option = new Option("a", "longOption", true, "description");
        assertEquals(option.getId(), option.getKey().charAt(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIdWithNoArg_axpY1() {
        Option option = new Option("a", true, "description");
        assertEquals(option.getId(), option.getKey().charAt(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetIdWithNoLongOption_mqKp2() {
        Option option = new Option("a", "description");
        assertEquals(option.getId(), option.getKey().charAt(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getKeyWithOption_CnBJ0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("option", option.getKey());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getKeyWithLongOption_Nmou1() {
        Option option = new Option(null, "longOption", true, "description");
        assertEquals("longOption", option.getKey());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getKeyWithoutOptionAndLongOption_gIvm2() {
        Option option = new Option(null, null, true, "description");
        assertEquals(null, option.getKey());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOpt_qDQJ0() {
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptWithNoLongOption_LHLH1() {
        Option option = new Option("option", null, true, "description");
        assertFalse(option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_vBWB0() {
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgWithUnlimitedValues_qtSy1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgWithNoArg_tQOW2() {
        Option option = new Option("option", "longOption", false, "description");
        assertFalse(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValue_withoutValues_cwIk1() {
        Option option = new Option("option", "longOption", true, "description");
        String value = option.getValue();
        assertEquals(null, value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValuesListTest_igSe0() {
        Option option = new Option("option", "longOption", true, "description");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, option.getValuesList());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeprecatedFalse_jWne1() {
        Option option = new Option("option", "description");
        boolean actual = option.isDeprecated();
        boolean expected = false;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgWithOptionalArg_pxDB0() {
        Option option = new Option("a", "alpha", true, "This is a");
        option.setOptionalArg(true);
        Assertions.assertFalse(option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArg_DRgB0_3() {
        Option option1 = new Option("option", "longOption", true, "description");
        Option option2 = new Option("option", true, "description");
        Option option3 = new Option("option", "description");
        assertEquals(false, option3.hasOptionalArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgNameWithOptionAndHasArg_rCqT1() {
        Option option = new Option("option", true, "description");
        boolean result = option.hasArgName();
        assert result == false;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgNameWithOptionDescription_FIeI2() {
        Option option = new Option("option", "description");
        boolean result = option.hasArgName();
        assert result == false;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValue_with_null_value_ROCd1() {
        Option option = new Option("option", "longOption", true, "description");
        String value = option.getValue("default");
        assertEquals("default", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValue_with_null_value_and_no_default_dDTz3() {
        Option option = new Option("option", "longOption", true, "description");
        String value = option.getValue(null);
        assertEquals(null, value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValue_with_null_value_and_empty_default_VooV5() {
        Option option = new Option("option", "longOption", true, "description");
        String value = option.getValue("");
        assertEquals("", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType_oYGy0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType2_gExg1() {
        Option option = new Option("option", true, "description");
        option.setType(Integer.class);
        assertEquals(Integer.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType3_cdng2() {
        Option option = new Option("option", "description");
        option.setType(Boolean.class);
        assertEquals(Boolean.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgWithAcceptsArg_QzxF2_OiRM0_1() {
        Option option = new Option("c", "charlie", true, "This is c");
        option.setOptionalArg(false);
        option.setArgs(1);
        Assertions.assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgWithAcceptsArg_QzxF2_OiRM0_2() {
        Option option = new Option("c", "charlie", true, "This is c");
        option.setOptionalArg(false);
        option.setArgs(1);
        Assertions.assertTrue(option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentDescriptions_ClXU7_fid1() {
        Option option1 = new Option("option", "longOption", true, "description1");
        Option option2 = new Option("option", "longOption", true, "description2");
        assertEquals(true, option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionLongOptionHasArgAndDescription_Pwxh0_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("[ Option option longOption [ARG] :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionHasArgAndDescription_StlK1_fid1() {
        Option option = new Option("option", true, "description");
        assertEquals("[ Option option [ARG] :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionDescription_REsx2_fid1() {
        Option option = new Option("option", "description");
        assertEquals("[ Option option :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWhenHasArgsReturnsFalse_KfVJ5_fid1() {
        Option option = new Option("option", "longOption", false, "description");
        option.setArgs(2);
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWhenHasOptionalArgReturnsFalse_KLve6_fid1() {
        Option option = new Option("option", "longOption", false, "description");
        option.setOptionalArg(true);
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_dWxJ0_1_fid1() {
        Option option1 = new Option("a", "longa", true, "description");
        Option option2 = new Option("b", "longb", false, "description");
        assertFalse(option1.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator2_zHLa1_1_fid1() {
        Option option1 = new Option("c", true, "description");
        Option option2 = new Option("d", false, "description");
        assertFalse(option1.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator3_ykEu2_1_fid1() {
        Option option1 = new Option("e", "description");
        Option option2 = new Option("f", "description");
        assertFalse(option1.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType_FTrK0_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        Class<?> type = Object.class;
        option.setType(type);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType2_zsac1_fid1() {
        Option option = new Option("option", true, "description");
        Class<?> type = Object.class;
        option.setType(type);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType3_ahsl2_fid1() {
        Option option = new Option("option", "description");
        Class<?> type = Object.class;
        option.setType(type);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptWithEmptyLongOption_qYIY4_fid1() {
        Option option = new Option("option", "", true, "description");
        assertTrue(option.hasLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValue_withValues_JGyh0_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        String value = option.getValue();
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgName_with_option_longOption_hasArg_description_PnIw0_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        assertNull(option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgName_with_option_hasArg_description_lPww1_fid1() {
        Option option = new Option("option", true, "description");
        assertNull(option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgName_with_option_description_UQWu2_fid1() {
        Option option = new Option("option", "description");
        assertNull(option.getArgName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getValue_with_non_null_value_and_no_default_iCzM2_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        String value = option.getValue(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDescriptionTest_HaOi0() {
        Option option1 = new Option("option", "longOption", true, "description");
        assertEquals("description", option1.getDescription());
        Option option2 = new Option("option", true, "description");
        assertEquals("description", option2.getDescription());
        Option option3 = new Option("option", "description");
        assertEquals("description", option3.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDeprecated_Jkur0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(option.getDeprecated(), null);
        option = new Option("option", true, "description");
        assertEquals(option.getDeprecated(), null);
        option = new Option("option", "description");
        assertEquals(option.getDeprecated(), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithTwoArgs_oGmx2() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(2);
        option.processValue("test1");
        option.processValue("test2");
        assertEquals("test1", option.getValue());
        assertEquals("test2", option.getValue(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithThreeArgs_YyaK3() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(3);
        option.processValue("test1");
        option.processValue("test2");
        option.processValue("test3");
        assertEquals("test1", option.getValue());
        assertEquals("test2", option.getValue(1));
        assertEquals("test3", option.getValue(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithFourArgs_AmzC4() {
        Option option = new Option("a", "alpha", true, "This is a test");
        option.setArgs(4);
        option.processValue("test1");
        option.processValue("test2");
        option.processValue("test3");
        option.processValue("test4");
        assertEquals("test1", option.getValue());
        assertEquals("test2", option.getValue(1));
        assertEquals("test3", option.getValue(2));
        assertEquals("test4", option.getValue(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ibwn0() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option2", "longOption2", true, "description2");
        Option option3 = new Option("option3", "longOption3", true, "description3");
        assertEquals(option1.hashCode(), option1.hashCode());
        assertEquals(option2.hashCode(), option2.hashCode());
        assertEquals(option3.hashCode(), option3.hashCode());
    }
}