/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.language.Nysiis;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringEncoderComparator_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompare_vVQQ0() {
        StringEncoderComparator comparator = new StringEncoderComparator(new Nysiis(true));
        Object o1 = "hello";
        Object o2 = "world";
        int expected = 1;
        int actual = comparator.compare(o1, o2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithNull_Japq1() {
        StringEncoderComparator comparator = new StringEncoderComparator(new Nysiis(true));
        Object o1 = null;
        Object o2 = "world";
        int expected = 0;
        int actual = comparator.compare(o1, o2);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithNull2_rxsB2() {
        StringEncoderComparator comparator = new StringEncoderComparator(new Nysiis(true));
        Object o1 = "hello";
        Object o2 = null;
        int expected = 0;
        int actual = comparator.compare(o1, o2);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithSameObject_gvGC3() {
        StringEncoderComparator comparator = new StringEncoderComparator(new Nysiis(true));
        Object o1 = "hello";
        Object o2 = o1;
        int expected = 0;
        int actual = comparator.compare(o1, o2);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithDifferentObjects_WjST4() {
        StringEncoderComparator comparator = new StringEncoderComparator(new Nysiis(true));
        Object o1 = "hello";
        Object o2 = "world";
        int expected = -15;
        int actual = comparator.compare(o1, o2);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 15, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareWithDifferentObjects2_WawP5() {
        StringEncoderComparator comparator = new StringEncoderComparator(new Nysiis(true));
        Object o1 = "hello";
        Object o2 = "world";
        int expected = 15;
        int actual = comparator.compare(o2, o1);
        assertEquals(expected, actual);
    }
}