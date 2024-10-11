/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLine_Coverage_Test_Passing {
    Supplier<String> defaultValue;
    CommandLine commandLine;
    Option option;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_withNullAnswer_VcOZ1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        String defaultValue = "defaultValue";
        String result = commandLine.getOptionValue(option, () -> defaultValue);
        assertEquals(defaultValue, result);
    }

    @BeforeEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionProperties_OptionsIsNull_ReturnsEmptyProperties_Dvnn0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("test", "test", false, "test");
        Properties properties = commandLine.getOptionProperties(option);
        assert(properties != null && properties.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_NoMatchingOption_ReturnsNull_uzfd0() {
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(new Option("test1", "test1", false, "test1"));
        Option option = new Option("test2", "test2", false, "test2");
        String result = commandLine.getOptionValue(option);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionValue_withNonNullAnswer_KHDM0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        String answer = "answer";
        String result = commandLine.getOptionValue(option, () -> "defaultValue");
        assertEquals(answer, result);
    }

    @BeforeEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_OonE0() throws Exception {
        commandLine = new CommandLine();
        option = mock(Option.class);
        defaultValue = mock(Supplier.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_oLsh0() {
        commandLine = new CommandLine();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionObject_CatchesParseException_rDMY2() {
        Object result = commandLine.getOptionObject("opt");
        assertNull(result);
    }
}