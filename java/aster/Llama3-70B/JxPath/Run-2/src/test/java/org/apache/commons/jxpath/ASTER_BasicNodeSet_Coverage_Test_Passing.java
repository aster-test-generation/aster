/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicNodeSet_Coverage_Test_Passing {
    private boolean clearCacheListsCalled = false;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemovePointer_WhenPointerIsNull_PointersIsEmpty_DoesNotThrowException_NxTj1_vPpW0() {
    BasicNodeSet basicNodeSet = new BasicNodeSet();
    Pointer pointer = null;
    basicNodeSet.remove(pointer);
}
}