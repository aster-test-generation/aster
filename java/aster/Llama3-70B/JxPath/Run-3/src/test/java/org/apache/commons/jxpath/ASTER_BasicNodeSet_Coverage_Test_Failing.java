/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicNodeSet_Coverage_Test_Failing {
private HashSet<Pointer> pointers = new HashSet<>();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodes_WhenPointersIsNull_ThrowsNullPointerException_RvKV5() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        try {
            basicNodeSet.getNodes();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}