/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PrecedingOrFollowingContext_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_DAui2() {
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(null, null, false);
        precedingOrFollowingContext.setPosition(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition4_RZiw3() {
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(null, null, false);
        precedingOrFollowingContext.nextNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_vvez0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(null, null, false);
        context.nextNode();
    }
}