/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionAttributeNodeIterator_Test_Passing {
    private QName name;
    private CollectionPointer pointer;
    private NodePointer elementPointer;
    private NodeIterator nodeIterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetElementNodeIterator_hGEj0() throws Exception {
        QName name = new QName("test");
        CollectionPointer pointer = mock(CollectionPointer.class);
        NodePointer elementPointer = mock(NodePointer.class);
        NodeIterator nodeIterator = mock(NodeIterator.class);
        CollectionAttributeNodeIterator collectionattributenodeiterator = new CollectionAttributeNodeIterator(pointer, name);
        when(elementPointer.attributeIterator(name)).thenReturn(nodeIterator);
        NodeIterator result = collectionattributenodeiterator.getElementNodeIterator(elementPointer);
        assertEquals(nodeIterator, result);
        verify(elementPointer).attributeIterator(name);
    }
}