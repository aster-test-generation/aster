/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_InfoSetUtil_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberWithNodePointerObject_hwUo4_JvOP0() {
        NodePointer object = mock(NodePointer.class);
        when(object.isLeaf()).thenReturn(true);
        when(object.getValue()).thenReturn(1);
        Number result = InfoSetUtil.number(object);
        verify(object, times(1)).isLeaf();
        verify(object, times(1)).getValue();
        assertEquals(1, result);
    }
}