/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_IntList_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWithinRange_UZzz0() {
        IntList list = new IntList(5);
        list.get(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAtBeginningAndEnd_vnfV3() {
        IntList list = new IntList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int result = list.remove(0);
        assert result == 1;
        result = list.remove(3);
        assert result == 4;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAtBeginningAndMiddle_PpwQ4() {
        IntList list = new IntList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int result = list.remove(0);
        assert result == 1;
        result = list.remove(1);
        assert result == 2;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAtMiddleAndEnd_dZrT5() {
        IntList list = new IntList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int result = list.remove(1);
        assert result == 2;
        result = list.remove(2);
        assert result == 3;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIncrementWithinRange_rPZp0() {
    IntList list = new IntList(10);
    list.increment(0);
    assertEquals(1, list.get(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddInMiddle_PgJZ2() {
    IntList list = new IntList();
    list.add(1, 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddInMiddleWithGrow_OpNh5() {
    IntList list = new IntList(1);
    list.add(1, 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddAtBeginningWithArrayLengthAndGrowAtFront_giFd9_fid1() {
    IntList list = new IntList(1);
    list.add(0, 10);
    list.add(-1, 20);
    assertEquals(20, list.get(0));
}
}