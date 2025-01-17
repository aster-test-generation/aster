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
    public void testGetOption_KgrX0() {
        Option option = new Option("option", "longOption", true, "description");
        OptionGroup group = new OptionGroup();
        AlreadySelectedException exception = new AlreadySelectedException(group, option);
        Option result = exception.getOption();
        assertEquals(option, result);
    }
}