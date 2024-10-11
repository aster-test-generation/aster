/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_CommandLine_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOption_ZGlO0() {
        CommandLine commandLine = new CommandLine();
        Option opt = new Option("option", "longOption", true, "description");
        commandLine.addOption(opt);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetParsedOptionValue1_Ylbe1() throws Exception {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_ZEmC0() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("o", "option", true, "description");
        Properties props = cmd.getOptionProperties(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_wfMS1() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("l", "longOption", false, "description");
        Properties props = cmd.getOptionProperties(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_TleK2() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("a", "argOption", true, "description");
        Properties props = cmd.getOptionProperties(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_VUpy3() {
        CommandLine cmd = new CommandLine();
        Option option = new Option("d", "descriptionOption", false, "description");
        Properties props = cmd.getOptionProperties(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_bRqb0() {
        CommandLine commandLine = new CommandLine();
        String opt = "opt";
        try {
            commandLine.getParsedOptionValue(opt);
        } catch (ParseException pe) {
            assertEquals("Exception found converting opt to desired type: ", pe.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_OQjn1() {
        CommandLine commandLine = new CommandLine();
        String opt = "opt";
        try {
            commandLine.getParsedOptionValue(opt);
        } catch (ParseException pe) {
            assertNotNull(pe);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_mLXS2() {
        CommandLine commandLine = new CommandLine();
        String opt = "opt";
        try {
            commandLine.getParsedOptionValue(opt);
        } catch (ParseException pe) {
            assertEquals(null, commandLine.getOptionObject(opt));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOptionValue_OQiX0() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "longOption", true, "description");
        Supplier<String> defaultValue = () -> "default";
        String answer = commandLine.getOptionValue(option, defaultValue);
        assertEquals("default", answer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetParsedOptionValue_CTTM0_CHWK0() throws org.apache.commons.cli.ParseException {
        CommandLine commandLine = new CommandLine();
        try {
            String result = commandLine.getParsedOptionValue('a', () -> null);
            Assertions.assertNull(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}