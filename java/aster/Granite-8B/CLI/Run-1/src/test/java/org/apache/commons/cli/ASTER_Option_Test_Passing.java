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
    public void test_getArgs_GEzE0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDescription_CMov0() {
        Option option = new Option("option", "longOption", true, "description");
        String actualDescription = option.getDescription();
        String expectedDescription = "description";
        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOpt_tivS0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("longOption", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOpt2_pUdQ1() {
        Option option = new Option("option", true, "description");
        assertEquals(null, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongOpt3_xkIR2() {
        Option option = new Option("option", "description");
        assertEquals(null, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequired_rpfS0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRequiredFalse_NxJO2() {
        Option option = new Option("option", "longOption", true, "description");
        option.setRequired(false);
        assertFalse(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithOptionObject_yfpH0() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option1", "longOption1", true, "description1");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithOptionObjectWithDifferentLongOption_uxgo1() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option1", "longOption2", true, "description1");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithOptionObjectWithDifferentOption_KAbH2() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option2", "longOption1", true, "description1");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithOptionObjectWithNull_zSxO5() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        assertFalse(option1.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithOptionObjectWithDifferentClass_uIwu6() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        assertFalse(option1.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_qLyM0() {
        Option option = new Option("option", "longOption", true, "description");
        boolean result = option.acceptsArg();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg2_JwTw1() {
        Option option = new Option("option", true, "description");
        boolean result = option.acceptsArg();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg4_cRjK3() {
        Option option = new Option("option", "longOption", false, "description");
        boolean result = option.acceptsArg();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg5_Orcx4() {
        Option option = new Option("option", false, "description");
        boolean result = option.acceptsArg();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg6_xHUY5() {
        Option option = new Option("option", "description");
        boolean result = option.acceptsArg();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_1_Ezns0() {
        Option option = new Option("option", "longOption", true, "description");
        Converter converter = option.getConverter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_2_BRDb1() {
        Option option = new Option("option", true, "description");
        Converter converter = option.getConverter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_3_WclY2() {
        Option option = new Option("option", "description");
        Converter converter = option.getConverter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getConverter_23_rhCq22() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue1_lpZd0() {
        Option option = new Option("option", "longOption", true, "description");
        option.processValue("value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValue2_jGht1() {
        Option option = new Option("option", true, "description");
        option.processValue("value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_qOYe0_2() {
        Option option1 = new Option("option1", "longOption1", true, "description1");
        Option option2 = new Option("option2", "longOption2", true, "description2");
        Option option3 = new Option("option3", "longOption3", true, "description3");
        assertNotEquals(option1.hashCode(), option3.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetopt_VsdI0() {
        Option option = new Option("o", "option", true, "description");
        assertEquals("o", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetopt1_LpPY1() {
        Option option = new Option("o", true, "description");
        assertEquals("o", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetopt2_pxBN2() {
        Option option = new Option("o", "description");
        assertEquals("o", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetopt3_LHrW3() {
        Option option = new Option("o", "option", false, "description");
        assertEquals("o", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetopt4_SPSa4() {
        Option option = new Option("o", false, "description");
        assertEquals("o", option.getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetopt26_hTlG26() {
        Option option = new Option("o", "description");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator2_RQuC1() {
        Option option = new Option("option", true, "description");
        assertFalse(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator3_OLiG4() {
        Option option = new Option("option", "longOption", false, "description");
        assertFalse(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator4_pXuN5() {
        Option option = new Option("option", false, "description");
        assertFalse(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator5_ZZdd6() {
        Option option = new Option("option", "longOption", true, "description");
        option.setValueSeparator('=');
        assertTrue(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType_ICUR0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType2_apcX1() {
        Option option = new Option("option", true, "description");
        option.setType(Integer.class);
        assertEquals(Integer.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType3_bSYs2() {
        Option option = new Option("option", "description");
        option.setType(Boolean.class);
        assertEquals(Boolean.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetId_Yzkl0() {
        Option option = new Option("option", "longOption", true, "description");
        int id = option.getId();
        assertEquals(111, id);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKey_WithOptionAndLongOption_ReturnsOption_kJxM0() {
        Option option = new Option("o", "longOption", true, "description");
        String expected = "o";
        String actual = option.getKey();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKey_WithOption_ReturnsOption_Fqfz1() {
        Option option = new Option("o", true, "description");
        String expected = "o";
        String actual = option.getKey();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKey_WithOptionAndDescription_ReturnsOption_Ovny2() {
        Option option = new Option("o", "description");
        String expected = "o";
        String actual = option.getKey();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptWithLongOption_OlQJ0() {
        Option option = new Option("o", "longOption", true, "description");
        boolean result = option.hasLongOpt();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasLongOptWithoutLongOption_AIqS1() {
        Option option = new Option("o", true, "description");
        boolean result = option.hasLongOpt();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgWithOptionAndLongOptionAndHasArgAndDescription_zjnZ0() {
        Option option = new Option("option", "longOption", true, "description");
        boolean result = option.hasArg();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgWithOptionAndHasArgAndDescription_BmoZ1() {
        Option option = new Option("option", true, "description");
        boolean result = option.hasArg();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgWithOptionAndDescription_JPvv2() {
        Option option = new Option("option", "description");
        boolean result = option.hasArg();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueSeparator_bYDi0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setValueSeparator('=');
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNoValues_lbLS3() {
        Option option = new Option("option", "longOption", true, "description");
        String actualValue = option.getValue();
        assertNull(actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNoValuesAndNoDescription_przp4() {
        Option option = new Option("option", true, null);
        String actualValue = option.getValue();
        assertNull(actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNoValuesAndNoLongOption_jSmE5() {
        Option option = new Option("option", null, true, "description");
        String actualValue = option.getValue();
        assertNull(actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNoValuesAndNoOption_gwaz6() {
        Option option = new Option(null, "longOption", true, "description");
        String actualValue = option.getValue();
        assertNull(actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNoValuesAndNoOptionOrLongOption_hwCJ7() {
        Option option = new Option(null, null, true, "description");
        String actualValue = option.getValue();
        assertNull(actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueList_ffkw0_1() {
        Option option = new Option("option", "longOption", true, "description");
        List<String> valuesList = option.getValuesList();
        assertNotNull(valuesList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueList_ffkw0_2() {
        Option option = new Option("option", "longOption", true, "description");
        List<String> valuesList = option.getValuesList();
        assertTrue(valuesList.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOpt_ctuu0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setLongOpt("newLongOpt");
        assertEquals("newLongOpt", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOptWithNull_CDGi1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setLongOpt(null);
        assertEquals(null, option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongOptWithEmpty_PuWp2() {
        Option option = new Option("option", "longOption", true, "description");
        option.setLongOpt("");
        assertEquals("", option.getLongOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeprecatedWithoutDeprecated_QAZk1() {
        Option option = new Option("option", "longOption", true, "description");
        boolean result = option.isDeprecated();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg2_DAHF1() {
        Option option = new Option("option", true, "description");
        boolean result = option.requiresArg();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasOptionalArgWithNoOptionalArg_VYnv1() {
        Option option = new Option("option", "longOption", false, "description");
        boolean result = option.hasOptionalArg();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgNameWithOptionAndHasArgAndDescription_DqRs1() {
        Option option = new Option("option", true, "description");
        boolean result = option.hasArgName();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgNameWithOptionAndDescription_Touz2() {
        Option option = new Option("option", "description");
        boolean result = option.hasArgName();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired3_PkeI2() {
        Option option = new Option("option", "description");
        boolean required = option.isRequired();
        assertFalse(required);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired4_mfxf3() {
        Option option = new Option("option", "longOption", false, "description");
        boolean required = option.isRequired();
        assertFalse(required);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsRequired5_iIms4() {
        Option option = new Option("option", false, "description");
        boolean required = option.isRequired();
        assertFalse(required);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgs_2_fdAj1_fid1() {
        Option option = new Option("option", true, "description");
        assertEquals(1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgs_3_HJLN2_fid1() {
        Option option = new Option("option", "description");
        assertEquals(-1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgs_4_cfFe3_fid1() {
        Option option = new Option("option", "longOption", false, "description");
        assertEquals(-1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgs_5_arFk4_fid1() {
        Option option = new Option("option", false, "description");
        assertEquals(-1, option.getArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithIndex_oypY0_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        String value = option.getValue(0);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithoutIndex_cVRk1_fid1() {
        Option option = new Option("option", true, "description");
        String value = option.getValue();
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_kpFh0_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        String actual = option.toString();
        String expected = "[ Option option longOption [ARG] :: description :: class java.lang.String ]";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_HQsz1_fid1() {
        Option option = new Option("option", true, "description");
        String actual = option.toString();
        String expected = "[ Option option [ARG] :: description :: class java.lang.String ]";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString3_uOoF2_fid1() {
        Option option = new Option("option", "description");
        String actual = option.toString();
        String expected = "[ Option option :: description :: class java.lang.String ]";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString4_wQNO3_fid1() {
        Option option = new Option("option", "longOption", false, "description");
        String actual = option.toString();
        String expected = "[ Option option longOption :: description :: class java.lang.String ]";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString1_OmTk0_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        String actual = option.toDeprecatedString();
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString2_llVD1_fid1() {
        Option option = new Option("option", true, "description");
        String actual = option.toDeprecatedString();
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString3_DyEi2_fid1() {
        Option option = new Option("option", "description");
        String actual = option.toDeprecatedString();
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgName_UtCq0_fid1() {
        Option option = new Option("option", "longOption", true, "description");
        String argName = option.getArgName();
        assertNull(argName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueList_ffkw0() {
        Option option = new Option("option", "longOption", true, "description");
        List<String> valuesList = option.getValuesList();
        assertNotNull(valuesList);
        assertTrue(valuesList.isEmpty());
    }
}