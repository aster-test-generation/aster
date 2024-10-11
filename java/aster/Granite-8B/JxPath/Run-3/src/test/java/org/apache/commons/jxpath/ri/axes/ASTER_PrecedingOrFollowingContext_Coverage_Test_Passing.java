/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PrecedingOrFollowingContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_UuLI0() {
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(null, null, false);
        precedingOrFollowingContext.setPosition(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_HkIo1() {
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(null, null, false);
        precedingOrFollowingContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset1_xDya0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(null, null, false);
        context.reset();
    }
}