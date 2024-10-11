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

public class Aster_Option_Coverage_Test_Passing {
    {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsObject_VZqg0() {
        Option obj = new Option("option", "longOption", true, "description");
        boolean result = obj.equals(new Object());
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsOption_PYAH1() {
        Option obj = new Option("option", "longOption", true, "description");
        boolean result = obj.equals(new Option("option", "longOption", true, "description"));
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConverter_wjfe0() {
        Option option = new Option("option", "longOption", true, "description");
        Converter<?, ?> converter = option.getConverter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_mLtf0() {
        Option option = new Option("option", "description");
        boolean result = option.hasArgs();
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeWithClass_Hhch0() {
        Option option = new Option("option", "description");
        option.setType(String.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeWithObject_soeC1() {
        Option option = new Option("option", "description");
        option.setType((Object) String.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArg_kKdP0() {
        Option option = new Option("option", "longOption", true, "description");
        boolean result = option.hasArg();
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString1_Myfm0() {
        Option option = new Option("option", "longOption", true, "description");
        String actual = option.toDeprecatedString();
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString2_wLLE1() {
        Option option = new Option("option", true, "description");
        String actual = option.toDeprecatedString();
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString3_elXi2() {
        Option option = new Option("option", "description");
        String actual = option.toDeprecatedString();
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeprecated_wvhk0() {
        Option option = new Option("option", "description");
        boolean result = option.isDeprecated();
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_cbFv0() {
        Option option = new Option("option", "longOption", true, "description");
        String defaultValue = "defaultValue";
        String value = option.getValue(defaultValue);
        assertEquals("defaultValue", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg3_Nfqf2() {
        Option option = new Option("option", "description");
        boolean result = option.requiresArg();
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddValue_FYSD0() {
        {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_YjJI0_fid2() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("[ Option option longOption [ARG] :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_QmsR1_fid2() {
        Option option = new Option("option", true, "description");
        assertEquals("[ Option option [ARG] :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString3_qlQa2_fid2() {
        Option option = new Option("option", "description");
        assertEquals("[ Option option :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString4_VAgV3_fid2() {
        Option option = new Option("option", "longOption", false, "description");
        assertEquals("[ Option option longOption :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString5_Mhpm4_fid2() {
        Option option = new Option("option", false, "description");
        assertEquals("[ Option option :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_oDBU0_fid2() {
        Option option = new Option("option", "longOption", true, "description");
        boolean hasArgName = option.hasArgName();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg1_syuI0_fid2() {
        Option option = new Option("option", "longOption", true, "description");
        boolean result = option.requiresArg();
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg2_PPXL1_fid2() {
        Option option = new Option("option", true, "description");
        boolean result = option.requiresArg();
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg4_jDax3_fid2() {
        Option option = new Option("option", "longOption", false, "description");
        boolean result = option.requiresArg();
        boolean expected = false;
        assertEquals(expected, result);
    }
}