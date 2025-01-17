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
    public void testGetOptionWithGroupAndOption_whvm1() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("option", "longOption", true, "description");
        AlreadySelectedException exception = new AlreadySelectedException(group, option);
        Option actualOption = exception.getOption();
        assertEquals(option, actualOption);
    }
}