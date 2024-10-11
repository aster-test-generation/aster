/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DOMAttributeIterator_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_PositionZero_SetPositionFalse_KdxY0() {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        QName name = new QName("test");
        DOMAttributeIterator iterator = new DOMAttributeIterator(parent, name);
        iterator.setPosition(0); // Ensure position is 0
        DOMAttributeIterator spyIterator = spy(iterator);
        doReturn(false).when(spyIterator).setPosition(1);
        NodePointer result = spyIterator.getNodePointer();
        assertNull(result);
        verify(spyIterator).setPosition(1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPosition_KSwM0_MosS0() {
    QName qName = new QName("testPrefix", "testLocalName");
}
}