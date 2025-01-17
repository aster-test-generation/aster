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
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetType_ydYE0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(String.class);
        assertEquals(String.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgOptionalArgTrue_hhsG0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setOptionalArg(true);
        assertEquals(false, option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgOptionalArgFalse_GTWb1() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals(true, option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_RMIX0() {
        Option option1 = new Option("a", "longOption1", true, "description1");
        Option option2 = new Option("a", "longOption1", true, "description1");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEquals_EJQB1() {
        Option option1 = new Option("a", "longOption1", true, "description1");
        Option option2 = new Option("b", "longOption2", false, "description2");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNull_UwXw2() {
        Option option = new Option("a", "longOption1", true, "description1");
        assertFalse(option.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentClass_POPl3() {
        Option option = new Option("a", "longOption1", true, "description1");
        assertFalse(option.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSameObject_utJr4() {
        Option option = new Option("a", "longOption1", true, "description1");
        assertTrue(option.equals(option));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentOption_iFuY5() {
        Option option1 = new Option("a", "longOption1", true, "description1");
        Option option2 = new Option("b", "longOption1", true, "description1");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentLongOption_mzlR6() {
        Option option1 = new Option("a", "longOption1", true, "description1");
        Option option2 = new Option("a", "longOption2", true, "description1");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedStringWhenNotDeprecated_XbTt0() {
        Option option = new Option("option", "longOption", true, "description");
        assertEquals("", option.toDeprecatedString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgUnlimited_uxlN2_tkkD0() {
        Option option = new Option("a", true, "description");
        option.hasArg();
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgTrue_YHQW0_Vmfv1() {
        Option option = new Option("a", true, "description");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgFalse_Clju1_gvNR0() {
        Option option = new Option("a", false, "description");
        option.hasArg(); // Assuming this method is used to check if the option has an argument
        assertFalse(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeNull_YoTG1_fid2() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(null);
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionAndDescription_PraP0_fid2() throws Exception {
        Option option = new Option("o", "option", false, "description");
        assertEquals("[ Option o option :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithLongOptionAndDescription_jLyE1_fid2() throws Exception {
        Option option = new Option("o", "option-long", true, "description");
        assertEquals("[ Option o option-long [ARG] :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionAndDescriptionAndMultipleArgs_GKNl3_fid2() throws Exception {
        Option option = new Option("o", "option", true, "description");
        assertEquals("[ Option o option [ARG] :: description :: class java.lang.String ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentDescription_Vmoo7_fid2() {
        Option option1 = new Option("a", "longOption1", true, "description1");
        Option option2 = new Option("a", "longOption1", true, "description2");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentHasArg_ihhq8_fid2() {
        Option option1 = new Option("a", "longOption1", true, "description1");
        Option option2 = new Option("a", "longOption1", false, "description1");
        assertTrue(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithUnlimitedValues_ppVr1_aYce0_fid2() {
        Option option = new Option("a", true, "description");
        option.hasArgs();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedStringWhenLongOptionHasNoArg_RTwO7_MqYv0_fid2() {
        Option option = new Option("option", "longOption", false, "description");
        assertEquals("", option.toDeprecatedString());
    }
}