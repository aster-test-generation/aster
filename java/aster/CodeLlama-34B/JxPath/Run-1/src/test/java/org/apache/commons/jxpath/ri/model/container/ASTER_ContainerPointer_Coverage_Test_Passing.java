/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_ContainerPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_valuePointerIsNull_RnuD0() throws Exception {
        ContainerPointer containerPointer = new ContainerPointer(mock(DOMNodePointer.class), mock(DocumentContainer.class));
        NodePointer valuePointer = mock(NodePointer.class);
        when(containerPointer.getImmediateNode()).thenReturn(valuePointer);
        NodePointer result = containerPointer.getImmediateValuePointer();
        assertNotNull(result);
        assertEquals(valuePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_valuePointerIsNull_RnuD0_1() throws Exception {
        ContainerPointer containerPointer = new ContainerPointer(mock(DOMNodePointer.class), mock(DocumentContainer.class));
        NodePointer valuePointer = mock(NodePointer.class);
        when(containerPointer.getImmediateNode()).thenReturn(valuePointer);
        NodePointer result = containerPointer.getImmediateValuePointer();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_valuePointerIsNotNull_YaHe1_1() throws Exception {
        ContainerPointer containerPointer = new ContainerPointer(mock(DOMNodePointer.class), mock(DocumentContainer.class));
        NodePointer valuePointer = mock(NodePointer.class);
        when(containerPointer.getImmediateNode()).thenReturn(valuePointer);
        when(containerPointer.getName()).thenReturn(mock(QName.class));
        NodePointer result = containerPointer.getImmediateValuePointer();
        assertNotNull(result);
    }
}