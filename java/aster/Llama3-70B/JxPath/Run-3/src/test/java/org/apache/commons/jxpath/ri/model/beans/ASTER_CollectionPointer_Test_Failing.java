/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionPointer_Test_Failing {
    @Mock
    private NodePointer pointer1;
    @Mock
    private NodePointer pointer2;
    private CollectionPointer collectionpointer;
    private Object collection;
    private DOMNodePointer parent;
    private int index = 1;
    @Mock
    private Locale locale;
    @Mock
    private NodeTest nodeTest;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private CollectionPointer collectionPointer;
    @Mock
    private JXPathContext context;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private QName qName;
    private ValueUtils valueUtils;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_WholeCollection() throws Exception {
        collection = new ArrayList<>();
        parent = mock(DOMNodePointer.class);
        collectionpointer = new CollectionPointer(parent, collection);
        // Arrange
        int index = CollectionPointer.WHOLE_COLLECTION;
        collectionpointer = new CollectionPointer(collection, Locale.US);
        Object value = "new value";
        // Act
        collectionpointer.setValue(value);
        // Assert
        verify(parent).setValue(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild() throws Exception {
        collectionPointer = new CollectionPointer(new Object(), Locale.US);
        // Given
        when(collectionPointer.clone()).thenReturn(nodePointer);
        when(nodePointer.createPath(context)).thenReturn(nodePointer);
        // When
        NodePointer result = collectionPointer.createChild(context, qName, 1);
        // Then
        assertEquals(nodePointer, result);
        verify(nodePointer).setIndex(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception {
        collection = new Object();
        index = 10;
        collectionpointer = new CollectionPointer(collection, Locale.US);
        int expectedHashCode = System.identityHashCode(collection) + index;
        int actualHashCode = collectionpointer.hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_WholeCollection_YNZn0() {
        Locale locale = new Locale("en", "US");
        Object collection = new Object();
        CollectionPointer collectionPointer = new CollectionPointer(collection, locale);
        collectionPointer.setValue(new Object());
        assertEquals(new Object(), collectionPointer.getParent().getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf_withNullValue() throws Exception {
        collectionpointer = new CollectionPointer(new Object(), Locale.US);
        MockitoAnnotations.initMocks(this);
        // Given
        when(collectionpointer.getNode()).thenReturn(null);
        // When
        boolean result = collectionpointer.isLeaf();
        // Then
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNullValue_QYKe0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
        assertTrue(collectionPointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_Null_Xgpu2() {
        Locale locale = new Locale("en", "US");
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), locale);
        collectionPointer.setIndex(-1);
        NodePointer valuePointer = collectionPointer.getValuePointer();
        assertNull(valuePointer);
    }
}