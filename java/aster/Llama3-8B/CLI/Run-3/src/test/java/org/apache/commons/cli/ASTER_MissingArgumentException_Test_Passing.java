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
    public void testGetOption() throws Exception {
        missingArgumentException = new MissingArgumentException(option);
        // Assert that the getOption method returns the option object
        assertEquals(option, missingArgumentException.getOption());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOption_hKoQ0() throws Exception {
        MissingArgumentException missingArgumentException = new MissingArgumentException("test");
        Option option = missingArgumentException.getOption();
        assertEquals(missingArgumentException, option);
    }
}