/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionChildNodeIterator_Test_Passing {
@Mock
    private NodePointer mockElementPointer;
@Mock
    private NodeIterator mockNodeIterator;
@Mock
    private NodeTest test;
@InjectMocks
    private CollectionChildNodeIterator collectionChildNodeIterator;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetElementNodeIterator() throws Exception {
        // Initialize CollectionChildNodeIterator with mocks
        collectionChildNodeIterator = new CollectionChildNodeIterator(null, test, false, null);
        // Arrange
        when(mockElementPointer.childIterator(test, false, null)).thenReturn(mockNodeIterator);
        // Act
        NodeIterator result = collectionChildNodeIterator.getElementNodeIterator(mockElementPointer);
        // Assert
        verify(mockElementPointer).childIterator(test, false, null);
        assertSame(mockNodeIterator, result, "The returned NodeIterator should be the one generated by childIterator.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetElementNodeIterator_icYO0() {
    NodeTypeTest test = new NodeTypeTest(1);
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.getDefault());
    CollectionChildNodeIterator iterator = new CollectionChildNodeIterator(collectionPointer, test, false, null);
    NodePointer elementPointer = NodePointer.newNodePointer(new QName("test"), new Object(), Locale.getDefault());
    NodeIterator result = iterator.getElementNodeIterator(elementPointer);
    assertNotNull(result);
}
}