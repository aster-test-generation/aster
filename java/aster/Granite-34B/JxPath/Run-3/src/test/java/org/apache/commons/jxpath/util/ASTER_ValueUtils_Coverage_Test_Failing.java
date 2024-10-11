/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ValueUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithoutContainer_RxjM1() {
        assertEquals(new Object(), ValueUtils.getValue(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterate4_nAnJ3() {
        ArrayList<String> collection = new ArrayList<String>();
        Iterator result = ValueUtils.iterate(collection);
        assert(result == collection.iterator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterate7_LSlr6() {
        int[] collection = new int[2];
        Iterator result = ValueUtils.iterate(collection);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(collection[0]);
        expected.add(collection[1]);
        assert(result.next() == expected.get(0));
        assert(result.next() == expected.get(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterate8_qcvH7() {
        ArrayList<Integer> collection = new ArrayList<Integer>();
        Iterator result = ValueUtils.iterate(collection);
        assert(result == collection.iterator());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterate11_EbNO10() {
        double[] collection = new double[2];
        Iterator result = ValueUtils.iterate(collection);
        ArrayList<Double> expected = new ArrayList<Double>();
        expected.add(collection[0]);
        expected.add(collection[1]);
        assert(result.next() == expected.get(0));
        assert(result.next() == expected.get(1));
    }
}