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

public class Aster_MissingArgumentException_Test_Passing {
    private Option option;
    private MissingArgumentException missingArgumentException;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_fTOe0() throws Exception {
        Option testOption = new Option("option1", "This is a test option");
        MissingArgumentException exception = new MissingArgumentException(testOption);
        Option result = exception.getOption();
        assertEquals(testOption, result);
    }
}