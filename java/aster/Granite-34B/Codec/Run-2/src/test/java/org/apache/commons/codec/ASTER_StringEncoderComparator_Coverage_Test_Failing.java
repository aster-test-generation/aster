/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringEncoderComparator_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompare_nkJh0_hEkr0_1() {
        StringEncoderComparator stringEncoderComparator = new StringEncoderComparator();
        Object o1 = new Object();
        Object o2 = new Object();
        int expected = 0;
        int actual = stringEncoderComparator.compare(o1, o2);
        stringEncoderComparator = new StringEncoderComparator();
        o1 = new Object();
        o2 = new Object();
        expected = 0;
        actual = stringEncoderComparator.compare(o1, o2);
        stringEncoderComparator = new StringEncoderComparator();
        o1 = new Object();
        o2 = new Object();
        expected = 0;
        actual = stringEncoderComparator.compare(o1, o2);
        stringEncoderComparator = new StringEncoderComparator();
        o1 = new Object();
        o2 = new Object();
        expected = 0;
        actual = stringEncoderComparator.compare(o1, o2);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}