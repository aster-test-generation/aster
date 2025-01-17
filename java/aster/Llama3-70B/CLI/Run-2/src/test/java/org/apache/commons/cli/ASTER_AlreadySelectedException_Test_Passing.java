/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_AlreadySelectedException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_pbfA0() {
        Option option = new Option("option", "longOption", true, "description");
        AlreadySelectedException exception = new AlreadySelectedException("message");
        exception = new AlreadySelectedException(new OptionGroup(), option);
        Option result = exception.getOption();
        assertSame(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_bgcQ0_WIZN0() {
        OptionGroup group = new OptionGroup();
        AlreadySelectedException exception = new AlreadySelectedException("message");
        OptionGroup returnedGroup = null; // getOptionGroup method is not defined in AlreadySelectedException
        assertNull(returnedGroup);
    }
}