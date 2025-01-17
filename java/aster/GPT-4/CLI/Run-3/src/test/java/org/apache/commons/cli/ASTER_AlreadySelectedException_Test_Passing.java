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
    private OptionGroup group;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_bnBy0() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("option1", "Option for testing", false, "This is a test option");
        AlreadySelectedException exception = new AlreadySelectedException(group, option);
        Option result = exception.getOption();
        assertEquals(option, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionGroup_nnll0() throws Exception {
        OptionGroup group = new OptionGroup();
        Option option = new Option("option1", "Option 1 description");
        AlreadySelectedException exception = new AlreadySelectedException(group, option);
        OptionGroup resultGroup = exception.getOptionGroup();
        assertEquals(group, resultGroup);
    }
}