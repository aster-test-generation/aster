/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicNodeSet_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodes_WhenNodesIsNull_PointersIsNull_ThrowsNullPointerException_SAkd5() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        try {
            basicNodeSet.getNodes();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}