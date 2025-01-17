/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LangAttributePointer_Test_Failing {
    LangAttributePointer langattributepointer;
    NodePointer pointer1;
    NodePointer pointer2;
    LangAttributePointer langAttributePointer;
    DOMNodePointer domNodePointer;
    NodeTest nodeTest;
    DOMNodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        parent = mock(DOMNodePointer.class);
        langattributepointer = new LangAttributePointer(parent);
        Object baseValue = new Object();
        when(parent.getBaseValue()).thenReturn(baseValue);
        Object result = langattributepointer.getImmediateNode();
        assertEquals(baseValue, result);
    }
}