/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_NullElementPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_nLBS0() {
        JXPathContext context = mock(JXPathContext.class);
        DOMNodePointer parent = mock(DOMNodePointer.class);
        NodePointer child = mock(NodePointer.class);
        when(parent.createChild(context, null, 0, null)).thenReturn(child);
        int index = 0;
        Object value = null;
        NodePointer result = new NullElementPointer(parent, index).createPath(context, value);
        assertEquals(child, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setValue(Object value) {
        throw new UnsupportedOperationException("Collection element does not exist: " + this);
    }
}