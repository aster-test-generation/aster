/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
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
public class Aster_JDOMAttributePointer_Test_Passing {
    JDOMAttributePointer jdomattributepointer;
    NodePointer nodepointer;
    NodePointer nodepointer2;
    private static final String ATTRIBUTE_NAME = "attribute";

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers() throws Exception {
        nodepointer = mock(NodePointer.class);
        nodepointer2 = mock(NodePointer.class);
        jdomattributepointer = new JDOMAttributePointer(nodepointer, mock(Attribute.class));
        when(nodepointer.getName()).thenReturn(mock(QName.class));
        when(nodepointer2.getName()).thenReturn(mock(QName.class));
        assertEquals(0, jdomattributepointer.compareChildNodePointers(nodepointer, nodepointer2));
    }
}