/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_AlreadySelectedException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionTest_qMcZ0() {
        AlreadySelectedException exception = new AlreadySelectedException("message");
        Option option = exception.getOption();
        assertEquals(null, option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionTest_TrhG1() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("option", "longOption", true, "description");
        AlreadySelectedException exception = new AlreadySelectedException(group, option);
        Option returnedOption = exception.getOption();
        assertEquals(option, returnedOption);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_XUBM0() {
        OptionGroup group = new OptionGroup();
        AlreadySelectedException e = new AlreadySelectedException(group, new Option("option", "longOption", true, "description"));
        assertEquals(group, e.getOptionGroup());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupCoverage_Nlhz1() {
        AlreadySelectedException e = new AlreadySelectedException("message");
        assertEquals("message", e.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupCoverage_OsNp2_1() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("option", "longOption", true, "description");
        AlreadySelectedException e = new AlreadySelectedException(group, option);
        assertEquals(group, e.getOptionGroup());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroupCoverage_OsNp2_2() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("option", "longOption", true, "description");
        AlreadySelectedException e = new AlreadySelectedException(group, option);
        assertEquals(option, e.getOption());
    }
}