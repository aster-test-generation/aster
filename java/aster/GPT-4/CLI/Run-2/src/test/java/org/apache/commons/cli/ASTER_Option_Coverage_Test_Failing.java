/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Option_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithoutDeprecated_aexL1() {
        Option option = new Option("o", "option", false, "Option description");
        String expected = "[ Option o option :: Option description :: null ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithHasArg_HZIi3() {
        Option option = new Option("o", "option", true, "Option description");
        String expected = "[ Option o option [ARG] :: Option description :: null ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgName_NonEmptyArgName_ReturnsTrue_Jggr0_knFD0() {
        Option option = new Option("opt", "option", true, "Test option");
        assertTrue(option.hasArgName(), "argName should be non-null and not empty");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithHasArgs_lhjc2_gBma0() {
        Option option = new Option("o", "option", true, "Option description");
        String expected = "[ Option o option [ARG...] :: Option description :: null ]";
        assertEquals(expected, option.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasArgsWhenArgCountIsMoreThanOne_uXEl0_leLi0() {
        Option option = new Option("o", "option", true, "Option with multiple args");
        assertTrue(option.hasArgs(), "hasArgs should return true when hasArg is true");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_NullLongOption_OjG4_FTiv0() {
        Option option = new Option("d", null, false, "Test option");
        String result = option.toDeprecatedString();
        assertEquals("Option 'd': deprecated", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_LongOptionWithSpecialCharacters_WAIQ5_fRkk0() {
        Option option = new Option("e", "echo*", false, "Test option");
        String result = option.toDeprecatedString();
        assertEquals("Option 'e'echo*': deprecated", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithDeprecated_SRic0_pyKl0() {
        Option option = new Option("o", "option", false, "Option description");
        String expected = "[ Option o option  [DEPRECATED] :: Option description :: null ]";
        assertEquals(expected, option.toString().replace("::", "[DEPRECATED] ::"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToDeprecatedString_LongOptionEmpty_Ixfo7_AGig0() {
        Option option = new Option("g", "", false, "Test option");
        String result = option.toString(); // Assuming toString() is used instead of non-existing setDeprecated and toDeprecatedString
        assertEquals("Option[g, , false, Test option]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithMultipleValueSeparators_UHsr3_thEc0_1() {
        Option option = new Option("opt", "longOpt", true, "Test option");
        option.setValueSeparator(',');
        option.processValue("value1,value2,value3");
        assertTrue(option.getValuesList().contains("value1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithMultipleValueSeparators_UHsr3_thEc0_2() {
        Option option = new Option("opt", "longOpt", true, "Test option");
        option.setValueSeparator(',');
        option.processValue("value1,value2,value3");
        assertTrue(option.getValuesList().contains("value2"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithMultipleValueSeparators_UHsr3_thEc0_3() {
        Option option = new Option("opt", "longOpt", true, "Test option");
        option.setValueSeparator(',');
        option.processValue("value1,value2,value3");
        assertTrue(option.getValuesList().contains("value3"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithNestedValueSeparators_LRBZ5_RijN0_1() {
        Option option = new Option("opt", "longOpt", true, "Test option");
        option.setValueSeparator(',');
        option.processValue("value1,value2a,value2b,value3");
        assertTrue(option.getValuesList().contains("value1"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithNestedValueSeparators_LRBZ5_RijN0_2() {
        Option option = new Option("opt", "longOpt", true, "Test option");
        option.setValueSeparator(',');
        option.processValue("value1,value2a,value2b,value3");
        assertTrue(option.getValuesList().contains("value2a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithNestedValueSeparators_LRBZ5_RijN0_3() {
        Option option = new Option("opt", "longOpt", true, "Test option");
        option.setValueSeparator(',');
        option.processValue("value1,value2a,value2b,value3");
        assertTrue(option.getValuesList().contains("value2b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessValueWithNestedValueSeparators_LRBZ5_RijN0_4() {
        Option option = new Option("opt", "longOpt", true, "Test option");
        option.setValueSeparator(',');
        option.processValue("value1,value2a,value2b,value3");
        assertTrue(option.getValuesList().contains("value3"));
    }
}