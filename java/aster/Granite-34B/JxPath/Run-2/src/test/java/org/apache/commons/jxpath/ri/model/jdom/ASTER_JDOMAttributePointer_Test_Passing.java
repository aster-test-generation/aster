/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.concurrent.TimeUnit;
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

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers() throws Exception {
        jdomattributepointer = mock(JDOMAttributePointer.class);
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        when(jdomattributepointer.compareChildNodePointers(pointer1, pointer2)).thenReturn(0);
        assertEquals(0, jdomattributepointer.compareChildNodePointers(pointer1, pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNoParent_vfgF2() {
        JDOMAttributePointer pointer = new JDOMAttributePointer(null, new Attribute("attr", "value"));
        assertEquals("@attr", pointer.asPath());
    }
}