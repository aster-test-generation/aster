/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLine_Coverage_Test_Passing {
    private CommandLine commandLine;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_hsnK0() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Supplier<String> defaultValue = () -> "default";
        String result = commandLine.getParsedOptionValue('a', defaultValue);
        assertEquals("default", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_HandleDeprecated_LFQm1_iwDz0() throws ParseException {
        Option option = mock(Option.class);
        when(option.isDeprecated()).thenReturn(true);
        when(option.getOpt()).thenReturn("opt");
        when(option.getLongOpt()).thenReturn("longOpt");
        CommandLine commandLine = new CommandLine();
        String result = commandLine.getOptionValue(option);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_DeprecatedOption_mixw0_QNhJ0() throws ParseException {
        Option option = mock(Option.class);
        when(option.isDeprecated()).thenReturn(true);
        when(option.getOpt()).thenReturn("opt");
        when(option.getLongOpt()).thenReturn("longOpt");
        CommandLine commandLine = new CommandLine();
        commandLine.getParsedOptionValue("opt", () -> "defaultValue");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetParsedOptionValue_NonDeprecatedOption_zdRl3_LbKe0_fid1() throws ParseException {
        Option option = new Option("o", "opt", true, "description");
        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option);
        String parsedOptionValue = commandLine.getOptionValue(option);
        assertNull(parsedOptionValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_BatE0() throws org.apache.commons.cli.ParseException {
        commandLine = new CommandLine() {
        };
    }
}