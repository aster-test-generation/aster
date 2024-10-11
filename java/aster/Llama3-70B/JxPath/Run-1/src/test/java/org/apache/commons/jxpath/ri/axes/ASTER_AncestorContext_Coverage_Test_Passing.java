/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_AncestorContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_PositionGreaterThanCurrentPosition_NextNodeReturnsFalse_ReturnFalse_SbFd3() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), true, new NodeTypeTest(1));
        when(ancestorContext.getCurrentPosition()).thenReturn(3);
        when(ancestorContext.nextNode()).thenReturn(false);
        boolean result = ancestorContext.setPosition(5);
        assertFalse(result);
    }
}