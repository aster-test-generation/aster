/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_MissingArgumentException_Test_Passing {
    private Option option;
    private MissingArgumentException missingargumentexception;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOption_Hpkb0() throws Exception {
        MissingArgumentException missingArgumentException = new MissingArgumentException(new Option("option", "longOption", true, "description"));
        Option option = missingArgumentException.getOption();
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOption1_MVLe1() throws Exception {
        MissingArgumentException missingArgumentException = new MissingArgumentException(new Option("option", true, "description"));
        Option option = missingArgumentException.getOption();
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetOption2_kRvp2() throws Exception {
        MissingArgumentException missingArgumentException = new MissingArgumentException(new Option("option", "description"));
        Option option = missingArgumentException.getOption();
        assertNotNull(option);
    }
}