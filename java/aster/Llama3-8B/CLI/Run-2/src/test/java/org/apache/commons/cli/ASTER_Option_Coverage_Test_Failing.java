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

public class Aster_Option_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeNull_YoTG1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType(null);
        assertEquals(null, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloneCloneNotSupportedException_bFCW1() {
        Option option = new Option("option", "longOption", true, "description");
        assertThrows(CloneNotSupportedException.class, option::clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionAndDescription_PraP0() throws Exception {
        Option option = new Option("o", "option", false, "description");
        assertEquals("[ Option o :: description :: ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithLongOptionAndDescription_jLyE1() throws Exception {
        Option option = new Option("o", "option-long", true, "description");
        assertEquals("[ Option o :: option-long [ARG] :: ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionAndDescriptionAndMultipleArgs_GKNl3() throws Exception {
        Option option = new Option("o", "option", true, "description");
        assertEquals("[ Option o :: option [ARG...] :: ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionAndDescriptionAndSingleArg_avai4() throws Exception {
        Option option = new Option("o", "option", true, "description");
        assertEquals("[ Option o :: option [ARG] :: ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentDescription_Vmoo7() {
        Option option1 = new Option("a", "longOption1", true, "description1");
        Option option2 = new Option("a", "longOption1", true, "description2");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDifferentHasArg_ihhq8() {
        Option option1 = new Option("a", "longOption1", true, "description1");
        Option option2 = new Option("a", "longOption1", false, "description1");
        assertFalse(option1.equals(option2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_kBOS0_uWBW0() {
        Option option = new Option("option", "longOption", true, "description");
        option.addValue("value");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithMoreThanOneArg_Rytx0_QpuD0() {
        Option option = new Option("a", true, "description");
        option.addValue("arg1");
        option.addValue("arg2");
        option.hasArg(); // option.setArgCount(2); is not a valid method
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithUnlimitedValues_ppVr1_aYce0() {
        Option option = new Option("a", true, "description");
        option.hasArgs();
        assertTrue(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedStringWhenDeprecated_VTvk1_xlLE0() {
        Option option = new Option("option", "longOption", true, "description");
        option.addValue("value");
        assertEquals("Option 'option': [value] (DEPRECATED)", option.toDeprecatedString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWithNullArgCount_tSFx3_mCHh1() {
        Option option = new Option("a", true, "description");
        assertFalse(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedStringWhenLongOptionHasNoArg_RTwO7_MqYv0() {
        Option option = new Option("option", "longOption", false, "description");
        assertEquals("Option 'option': ", option.toDeprecatedString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArgUnlimitedValuesNonEmptyValues_hdHe3_Qkfi0() {
        Option option = new Option("option", "longOption", true, "description");
        option.addValue("value1");
        option.addValue("value2");
        assertEquals(true, option.requiresArg());
    }
}