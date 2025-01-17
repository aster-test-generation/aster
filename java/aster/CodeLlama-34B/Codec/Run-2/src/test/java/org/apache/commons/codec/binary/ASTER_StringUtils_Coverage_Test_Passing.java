/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_StringString_nShw0() {
        String cs1 = "hello";
        String cs2 = "hello";
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_CharSequenceCharSequence_pdZa1() {
        CharSequence cs1 = new StringBuffer("hello");
        CharSequence cs2 = new StringBuffer("hello");
        assertTrue(StringUtils.equals(cs1, cs2));
    }
}