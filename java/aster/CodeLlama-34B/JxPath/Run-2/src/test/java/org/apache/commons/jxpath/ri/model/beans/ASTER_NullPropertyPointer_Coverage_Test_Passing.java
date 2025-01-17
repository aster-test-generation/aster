/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_NullPropertyPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue1_EOvf0_fid1() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        try {
            nullPropertyPointer.setValue(null);
            Assertions.fail("Expected JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            Assertions.assertEquals("Cannot set property /*, the target object is null", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath1_XEMt0_kwxS0() throws Exception {
        JXPathContext context = mock(JXPathContext.class);
        DOMNodePointer parent = mock(DOMNodePointer.class);
        NodePointer newParent = mock(NodePointer.class);
        when(parent.createPath(context)).thenReturn(newParent);
        NullPropertyPointer nullpropertypointer = new NullPropertyPointer(parent);
        nullpropertypointer.createPath(context);
        verify(parent).createPath(context);
    }
}