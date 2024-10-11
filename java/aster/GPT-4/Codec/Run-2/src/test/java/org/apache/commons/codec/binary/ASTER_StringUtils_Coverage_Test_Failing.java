/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_BothStrings_nlwY0_SPuP0() {
        String cs1 = "hello";
        String cs2 = "hello";
        assertEquals("Both strings are equal", cs1, cs2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_CharSequencesWithSameLengthAndContent_PIQK1_UPwd0() {
        CharSequence cs1 = new StringBuilder("hello");
        CharSequence cs2 = new StringBuilder("hello");
        assertEquals("Both CharSequences have the same length and content", cs1.toString(), cs2.toString());
    }
}