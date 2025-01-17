/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLine_Coverage_Test_Failing {
    CommandLine commandLine = new CommandLine();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_pCIF1_fid1() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Supplier<String> defaultValue = () -> "default";
        String actual = commandLine.getOptionValue(option, defaultValue);
        String expected = "answer";
        assertEquals(expected, actual);
    }
}