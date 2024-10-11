/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IntList_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOutOfBounds_PEYl2() throws Exception {
    IntList intList = new IntList(2);
    intList.add(0, 5);
    intList.get(2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIncrementNegativeLocation_hixp1() throws Exception {
    IntList intList = new IntList(10);
    intList.increment(-1);
}
}