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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_ContainerPointer_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_valuePointerIsNotNull_YaHe1() throws Exception {
        ContainerPointer containerPointer = new ContainerPointer(mock(DOMNodePointer.class), mock(DocumentContainer.class));
        NodePointer valuePointer = mock(NodePointer.class);
        when(containerPointer.getImmediateNode()).thenReturn(valuePointer);
        when(containerPointer.getName()).thenReturn(mock(QName.class));
        NodePointer result = containerPointer.getImmediateValuePointer();
        assertNotNull(result);
        assertEquals(valuePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_valuePointerIsNullAndGetImmediateNodeReturnsNull_tmfp2() throws Exception {
        ContainerPointer containerPointer = new ContainerPointer(mock(DOMNodePointer.class), mock(DocumentContainer.class));
        when(containerPointer.getImmediateNode()).thenReturn(null);
        NodePointer result = containerPointer.getImmediateValuePointer();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_valuePointerIsNull_RnuD0_2() throws Exception {
        ContainerPointer containerPointer = new ContainerPointer(mock(DOMNodePointer.class), mock(DocumentContainer.class));
        NodePointer valuePointer = mock(NodePointer.class);
        when(containerPointer.getImmediateNode()).thenReturn(valuePointer);
        NodePointer result = containerPointer.getImmediateValuePointer();
        assertEquals(valuePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_valuePointerIsNotNull_YaHe1_2() throws Exception {
        ContainerPointer containerPointer = new ContainerPointer(mock(DOMNodePointer.class), mock(DocumentContainer.class));
        NodePointer valuePointer = mock(NodePointer.class);
        when(containerPointer.getImmediateNode()).thenReturn(valuePointer);
        when(containerPointer.getName()).thenReturn(mock(QName.class));
        NodePointer result = containerPointer.getImmediateValuePointer();
        assertEquals(valuePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_valuePointerIsNull_RnuD0_2_fid2() throws Exception {
        ContainerPointer containerPointer = new ContainerPointer(mock(DOMNodePointer.class), mock(DocumentContainer.class));
        NodePointer valuePointer = mock(NodePointer.class);
        when(containerPointer.getImmediateNode()).thenReturn(valuePointer);
        NodePointer result = containerPointer.getImmediateValuePointer();
        assertNull(valuePointer);
    }
}