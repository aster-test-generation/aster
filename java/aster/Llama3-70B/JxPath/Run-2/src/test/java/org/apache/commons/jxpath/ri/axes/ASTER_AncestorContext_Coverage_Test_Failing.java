/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AncestorContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_PositionLessThanCurrentPosition_ResetCalled_xikN0() {
        AncestorContext ancestorContext = new AncestorContext(mock(NamespaceContext.class), true, mock(NodeTypeTest.class));
        when(ancestorContext.getCurrentPosition()).thenReturn(10);
        ancestorContext.setPosition(5);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_PositionEqualToCurrentPosition_ReturnTrue_punN1() {
        AncestorContext ancestorContext = new AncestorContext(mock(NamespaceContext.class), true, mock(NodeTypeTest.class));
        when(ancestorContext.getCurrentPosition()).thenReturn(10);
        boolean result = ancestorContext.setPosition(10);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_PositionGreaterThanCurrentPosition_NextNodeCalled_pxJX2() {
        AncestorContext ancestorContext = new AncestorContext(mock(NamespaceContext.class), true, mock(NodeTypeTest.class));
        when(ancestorContext.getCurrentPosition()).thenReturn(5);
        when(ancestorContext.nextNode()).thenReturn(true);
        ancestorContext.setPosition(10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_PositionGreaterThanCurrentPosition_NextNodeReturnsTrue_ReturnTrue_wdlv4() {
        AncestorContext ancestorContext = new AncestorContext(mock(NamespaceContext.class), true, mock(NodeTypeTest.class));
        when(ancestorContext.getCurrentPosition()).thenReturn(5);
        when(ancestorContext.nextNode()).thenReturn(true);
        boolean result = ancestorContext.setPosition(10);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_PositionEqualsZero_ReturnTrue_uvEe5() {
        AncestorContext ancestorContext = new AncestorContext(mock(NamespaceContext.class), true, mock(NodeTypeTest.class));
        when(ancestorContext.getCurrentPosition()).thenReturn(10);
        boolean result = ancestorContext.setPosition(0);
        assertTrue(result);
    }
}