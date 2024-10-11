/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_StringEncoderComparator_Coverage_Test_Failing {
    private StringEncoderComparator stringEncoderComparator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithNullObject1_MPzv0() {
        Object o1 = null;
        Object o2 = new Object();
        int compareCode = stringEncoderComparator.compare(o1, o2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithNullObject2_Gttm1() {
        Object o1 = new Object();
        Object o2 = null;
        int compareCode = stringEncoderComparator.compare(o1, o2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithValidObjects_jQXp2() {
        Object o1 = new Object();
        Object o2 = new Object();
        int compareCode = stringEncoderComparator.compare(o1, o2);
    }
}