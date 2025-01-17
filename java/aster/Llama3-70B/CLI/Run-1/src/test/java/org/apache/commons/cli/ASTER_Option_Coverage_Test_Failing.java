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

public class Aster_Option_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_HasArgs_FOlB3_fTUy0() {
        Option option = new Option("o", true, "description");
        try {
            option.addValue("ARGS");
        } catch (UnsupportedOperationException e) {
        }
        String expected = "[ Option o [ARG...] :: description ::  ]";
        String actual = option.toString();
        assertEquals(expected, actual);
    }
}