/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionChildNodeIterator_Test_Passing {
private NodeTest test;
private NodePointer nodePointer;
private CollectionPointer collectionPointer;
private CollectionChildNodeIterator collectionchildnodeiterator;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetElementNodeIterator() throws Exception{
        test = mock(NodeTest.class);
        nodePointer = mock(NodePointer.class);
        collectionPointer = mock(CollectionPointer.class);
        collectionchildnodeiterator = new CollectionChildNodeIterator(collectionPointer, test, false, null);
        // Arrange
        NodeIterator expected = mock(NodeIterator.class);
        when(nodePointer.childIterator(test, false, null)).thenReturn(expected);
        // Act
        NodeIterator actual = collectionchildnodeiterator.getElementNodeIterator(nodePointer);
        // Assert
        assertEquals(expected, actual);
    }
}