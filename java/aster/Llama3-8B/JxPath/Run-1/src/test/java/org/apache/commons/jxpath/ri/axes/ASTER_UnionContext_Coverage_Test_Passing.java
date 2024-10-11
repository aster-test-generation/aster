/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnionContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPositionBeforePrepared_gLxN2() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[0]);
        unionContext.setPosition(0);
        assertEquals(0, unionContext.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPositionBeforePreparedAndSet_sNGK5() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[0]);
        unionContext.setPosition(1);
        assertEquals(1, unionContext.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPreparedTrue_UzsL1_Ipnd0() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[0]);
        unionContext.setPosition(0);
    }
}