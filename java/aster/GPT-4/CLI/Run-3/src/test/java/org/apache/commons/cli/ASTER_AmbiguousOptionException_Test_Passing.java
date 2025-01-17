/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_AmbiguousOptionException_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMatchingOptions_KJOi0() throws Exception {
        Collection<String> expectedOptions = Arrays.asList("option1", "option2", "option3");
        AmbiguousOptionException exception = new AmbiguousOptionException("testOption", expectedOptions);
        Collection<String> actualOptions = exception.getMatchingOptions();
        assertEquals(expectedOptions, actualOptions);
    }
}