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

public class Aster_OptionBuilder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreate1_diMD0() {
        Option option = OptionBuilder.create();
        assertNotNull(option);
    }
}