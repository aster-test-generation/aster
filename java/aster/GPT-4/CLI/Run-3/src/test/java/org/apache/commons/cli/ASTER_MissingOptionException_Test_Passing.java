/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_MissingOptionException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMissingOptionsReturnsCorrectList_RsvL0() throws Exception {
        List<String> expectedOptions = Arrays.asList("option1", "option2");
        MissingOptionException exception = new MissingOptionException(expectedOptions);
        List<String> actualOptions = exception.getMissingOptions();
        assertEquals(expectedOptions, actualOptions);
    }
}