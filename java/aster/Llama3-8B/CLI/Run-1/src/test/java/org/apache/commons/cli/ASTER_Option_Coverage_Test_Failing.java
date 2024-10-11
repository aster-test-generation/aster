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
    public void testToStringWithOptionAndDescription_hzgQ0() throws Exception {
        Option option = new Option("o", "option", false, "This is a test option");
        assertEquals("[ Option o :: This is a test option :: ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithLongOptionAndDescription_mJVT1() throws Exception {
        Option option = new Option("o", "option-long", false, "This is a test option");
        assertEquals("[ Option o :: option-long :: ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionAndArgAndDescription_pqOi2() throws Exception {
        Option option = new Option("o", true, "This is a test option");
        assertEquals("[ Option o [ARG] :: This is a test option :: ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionAndArgsAndDescription_RvQn3() throws Exception {
        Option option = new Option("o", true, "This is a test option");
        assertEquals("[ Option o [ARG...] :: This is a test option :: ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloneCloneNotSupportedException_IqSm1() {
        Option option = new Option("option", "longOption", true, "description");
        assertThrows(CloneNotSupportedException.class, option::clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithOptionAndDeprecatedAndDescription_tEBh4_ICNa0() throws Exception {
        Option option = new Option("o", "option", true, "This is a test option");
        assertEquals("[ Option o :: option :: This is a test option :: ]", option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedStringWhenOptionIsEmpty_dwqi3_wiaP0() {
        Option option = new Option("", "longOption", true, "description");
        assertEquals("Option '': ", option.toDeprecatedString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgOptionalArgMoreArgsThanValues_xPBb7_YxHH0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setOptionalArg(true);
        option.addValue("value");
        assertFalse(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedStringWhenOptionHasDescription_vdOV9_lpfy0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setDescription("description");
        assertEquals("Option 'option': description", option.toDeprecatedString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgOptionalArgNoValues_yRHh8_iIJX0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setOptionalArg(true);
        assertFalse(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArg_HPPk0_lHhZ0() {
        Option option = new Option("option", "longOption", true, "description");
        option.addValue("value");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgNoValues_USKc3_LrZy0() {
        Option option = new Option("option", "longOption", true, "description");
        assertFalse(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithNoArgCount_PMDI0_rwFL0() {
        Option option = new Option("option", "description");
        option.processValue("value");
        assertEquals("description", option.getDescription());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgOptionalArgNoOptionalArgMoreArgsThanValues_odAo9_PceY0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setOptionalArg(false);
        option.addValue("value");
        assertFalse(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgNoOptionalArg_IndJ5_GMIr0() {
        Option option = new Option("option", "longOption", true, "description");
        option.setOptionalArg(false);
        assertFalse(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgMoreArgsThanValues_StiT2_aAeZ0() {
        Option option = new Option("option", "longOption", true, "description");
        assertFalse(option.addValue("value"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnlimitedValuesReturnsNonEmptyValues_xpQA2_ZGxt0() {
        Option option = new Option("option", "longOption", true, "description");
        option.addValue("value");
        assertEquals(true, option.requiresArg());
    }
}