/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AncestorContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_BYqt0() {
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        int position = 0;
        boolean result = ancestorContext.setPosition(position);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_ScVN1() {
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        int position = -1;
        boolean result = ancestorContext.setPosition(position);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition5_Psmc4() {
        AncestorContext ancestorContext = new AncestorContext(null, false, null);
        int position = Integer.MIN_VALUE;
        boolean result = ancestorContext.setPosition(position);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset1_Rmjm0() {
    AncestorContext ancestorContext = new AncestorContext(null, false, null);
    ancestorContext.reset();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset2_rCmY1() {
    AncestorContext ancestorContext = new AncestorContext(null, true, null);
    ancestorContext.reset();
}
}