/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_StringEncoderComparator_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompare_aOIn0() {
        StringEncoderComparator stringEncoderComparator = new StringEncoderComparator();
        Object o1 = new Object();
        Object o2 = new Object();
        int expected = 0;
        int actual = stringEncoderComparator.compare(o1, o2);
        assertEquals(expected, actual);
    }
}