/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_UnionContext_Test_Failing {
    private EvalContext[] contexts;
    private boolean prepared;
    @Mock
    private EvalContext evalContext1;
    @Mock
    private EvalContext evalContext2;
    @Mock
    private BasicNodeSet nodeSet;
    @Mock
    private Pointer pointer1;
    @Mock
    private Pointer pointer2;
    private UnionContext unioncontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_xdiw4() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        unionContext.setPosition(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_nFJq5() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        unionContext.setPosition(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_muQM6() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        unionContext.setPosition(2);
        boolean result = unionContext.getPosition() == 2;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_wUev7() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        unionContext.setPosition(3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition5_Pgtt9() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        unionContext.setPosition(5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition6_BwCG10() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        unionContext.setPosition(6);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition7_ILQp11() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        unionContext.setPosition(7);
        boolean result = unionContext.getPosition() == 7;
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_xdiw4_fid1() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        boolean result = unionContext.setPosition(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_nFJq5_fid1() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        boolean result = unionContext.setPosition(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_muQM6_fid1() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        boolean result = unionContext.setPosition(2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_wUev7_fid1() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        boolean result = unionContext.setPosition(3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition4_mvPN8() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        boolean result = unionContext.setPosition(4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition5_Pgtt9_fid1() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        boolean result = unionContext.setPosition(5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition6_BwCG10_fid1() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        boolean result = unionContext.setPosition(6);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition7_ILQp11_fid1() {
        UnionContext unionContext = new UnionContext(null, new EvalContext[2]);
        boolean result = unionContext.setPosition(7);
    }
}