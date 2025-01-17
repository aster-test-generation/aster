/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgs_yCvT0() {
        Option option = new Option("test", "test option", true, "test description");
        assertTrue(option.hasArgs());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasValueSeparator_RILF0() {
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.hasValueSeparator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeWithoutClass_YOYh1() {
        Option option = new Option("option", "longOption", true, "description");
        option.setType("type");
        assertEquals("type", option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_UnsupportedOperationException_nqmB1() {
        Option option = new Option("test", "test", false, "test");
        try {
            option.clone();
            Assertions.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            Assertions.assertEquals("UnsupportedOperationException", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithoutDeprecated_Cuiz1() {
        Option option = new Option("option", "longOption", true, "description");
        String expected = "[ Option option longOption [ARG] :: description :: boolean ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithoutHasArgsOrHasArg_sfrn4() {
        Option option = new Option("option", "longOption", true, "description");
        String expected = "[ Option option longOption :: description :: boolean ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullLongOption_xlQw5() {
        Option option = new Option("option", null, true, "description");
        String expected = "[ Option option :: description :: boolean ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullDescription_Nwyc6() {
        Option option = new Option("option", "longOption", true, null);
        String expected = "[ Option option longOption ::  :: boolean ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequiresArg_optionalArg_yKTU0() {
        Option option = new Option("test", "test option", true, "test description");
        assertFalse(option.requiresArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_notDeprecated_feBq0() {
        Option option = new Option("-a", "--long-a", true, "description");
        assertEquals("", option.toDeprecatedString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithHasArgs_Davm2_koif0() {
        Option option = new Option("option", "longOption", true, "description");
        String expected = "[ Option option longOption [ARG...] :: description :: boolean ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWithArgs_QQOp2_UopJ0() {
        Option option = new Option("test", "test option", true, "test description");
        option.addValue("arg1");
        option.addValue("arg2");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWithArgCount_gYIg3_iRNA0() {
        Option option = new Option("test", "test option", true, "test description");
        option.processValue("arg1");
        assertTrue(option.acceptsArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAcceptsArgWithArgs_QQOp2_UopJ0_fid2() {
        Option option = new Option("test", "test option", true, "test description");
        option.processValue("arg1");
        option.processValue("arg2");
        assertTrue(option.acceptsArg());
    }
}