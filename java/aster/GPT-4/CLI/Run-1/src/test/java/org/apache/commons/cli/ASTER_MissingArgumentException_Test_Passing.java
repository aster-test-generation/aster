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
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionReturnsCorrectOption_VUuZ0() {
        Option expectedOption = new Option("a", "longA", true, "Option A");
        MissingArgumentException exception = new MissingArgumentException(expectedOption);
        Option actualOption = exception.getOption();
        assertEquals(expectedOption, actualOption);
    }
}