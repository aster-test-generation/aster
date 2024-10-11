/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
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
    private NodePointer nodePointer;
    private CollectionPointer collectionPointer;
    private JXPathContext jXPathContext;
    private CollectionAttributeNodeIterator collectionattributenodeiterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetElementNodeIterator() throws Exception {
        name = new QName("testName");
        nodePointer = Mockito.mock(NodePointer.class);
        collectionPointer = Mockito.mock(CollectionPointer.class);
        jXPathContext = Mockito.mock(JXPathContext.class);
        collectionattributenodeiterator = new CollectionAttributeNodeIterator(collectionPointer, name);
        NodeIterator expected = Mockito.mock(NodeIterator.class);
        Mockito.when(nodePointer.attributeIterator(name)).thenReturn(expected);
        NodeIterator actual = collectionattributenodeiterator.getElementNodeIterator(nodePointer);
        Mockito.verify(nodePointer).attributeIterator(name);
        Assertions.assertEquals(expected, actual);
    }
}