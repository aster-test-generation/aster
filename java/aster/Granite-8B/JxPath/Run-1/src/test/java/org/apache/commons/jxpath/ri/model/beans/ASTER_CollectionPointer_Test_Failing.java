/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
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
    private NodePointer valuePointer;
    @Mock
    private NodePointer nodePointer1;
    @Mock
    private NodePointer nodePointer2;
    private CollectionPointer collectionPointer;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private ValueUtils valueUtils;
    private Object collection;
    @Mock
    private NodeTest nodeTest;
    @Mock
    private JXPathContext jXPathContext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private QName name;
    @Mock
    private CollectionAttributeNodeIterator iterator;
    @Mock
    private QName qName;
    @Mock
    private VariablePointer variablePointer;
    @Mock
    private DOMNodePointer domNodePointer;
    private CollectionPointer collectionPointerObject;
    @Mock
    private NodeIterator nodeIterator;
    @Mock
    private JXPathIntrospector jXPathIntrospector;
    @Mock
    private Locale locale;
    @Mock
    private CollectionPointer collectionpointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        collectionpointer = new CollectionPointer(collection, Locale.US);
        // Arrange
        when(collection instanceof Collection).thenReturn(true);
        // Act
        boolean result = collectionpointer.isCollection();
        // Assert
        assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        collection = Mockito.mock(Object.class);
        collectionPointer = new CollectionPointer(collection, Locale.US);
        // Arrange
        int expectedHashCode = System.identityHashCode(collection) + 1;
        // Act
        int actualHashCode = collectionPointer.hashCode();
        // Assert
        Mockito.verify(collectionPointer).hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIteratorWholeCollection_ugvo0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
        NodeIterator result = collectionPointer.attributeIterator(new QName("attributeName"));
        assertEquals(NodeIterator.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_OSgj0() {
        QName name = new QName("test");
        VariablePointer variablePointer = new VariablePointer(name);
        QName result = variablePointer.getName();
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChildIterator() throws Exception {
        collectionPointer = new CollectionPointer(nodePointer, new Object());
        // Arrange
        when(nodePointer.childIterator(nodeTest, false, null)).thenReturn(nodeIterator);
        // Act
        NodeIterator result = collectionPointer.childIterator(nodeTest, false, null);
        // Assert
        assertEquals(nodeIterator, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIteratorTrue_Ckik0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
        NodeIterator result = collectionPointer.namespaceIterator();
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals() {
        collection = Mockito.mock(Object.class);
        collectionPointer = new CollectionPointer(collection, Locale.US);
        // Test with same object
        Mockito.when(collectionPointer.equals(collectionPointer)).thenReturn(true);
        assertEquals(true, collectionPointer.equals(collectionPointer));
        // Test with different object
        CollectionPointer otherCollectionPointer = new CollectionPointer(collection, Locale.US);
        Mockito.when(collectionPointer.equals(otherCollectionPointer)).thenReturn(false);
        assertEquals(false, collectionPointer.equals(otherCollectionPointer));
        // Test with null object
        Mockito.when(collectionPointer.equals(null)).thenReturn(false);
        assertEquals(false, collectionPointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Arrange
        Object value = "Test Value";
        when(jXPathContext.createPath("")).thenReturn(nodePointer);
        // Act
        NodePointer result = collectionpointer.createPath(jXPathContext, value);
        // Assert
        verify(jXPathContext).createPath("");
        verify(nodePointer).setValue(value);
        assertEquals(nodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() {
        collectionpointer = new CollectionPointer(collection, Locale.US);
        // Arrange
        when(collectionpointer.getBaseValue()).thenReturn(collection);
        // Act
        Object result = collectionpointer.getBaseValue();
        // Assert
        assertEquals(collection, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1() {
        collection = Mockito.mock(Object.class);
        collectionPointer = new CollectionPointer(collection, Locale.US);
        // Test with same object
        Mockito.when(collectionPointer.equals(collectionPointer)).thenReturn(true);
        // Test with different object
        CollectionPointer otherCollectionPointer = new CollectionPointer(collection, Locale.US);
        Mockito.when(collectionPointer.equals(otherCollectionPointer)).thenReturn(false);
        // Test with null object
        Mockito.when(collectionPointer.equals(null)).thenReturn(false);
        assertEquals(true, collectionPointer.equals(collectionPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2() {
        collection = Mockito.mock(Object.class);
        collectionPointer = new CollectionPointer(collection, Locale.US);
        // Test with same object
        Mockito.when(collectionPointer.equals(collectionPointer)).thenReturn(true);
        // Test with different object
        CollectionPointer otherCollectionPointer = new CollectionPointer(collection, Locale.US);
        Mockito.when(collectionPointer.equals(otherCollectionPointer)).thenReturn(false);
        // Test with null object
        Mockito.when(collectionPointer.equals(null)).thenReturn(false);
        assertEquals(false, collectionPointer.equals(otherCollectionPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_3() {
        collection = Mockito.mock(Object.class);
        collectionPointer = new CollectionPointer(collection, Locale.US);
        // Test with same object
        Mockito.when(collectionPointer.equals(collectionPointer)).thenReturn(true);
        // Test with different object
        CollectionPointer otherCollectionPointer = new CollectionPointer(collection, Locale.US);
        Mockito.when(collectionPointer.equals(otherCollectionPointer)).thenReturn(false);
        // Test with null object
        Mockito.when(collectionPointer.equals(null)).thenReturn(false);
        assertEquals(false, collectionPointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetValuePointer_WHOLE_COLLECTION_GTJF0() throws Exception {
        CollectionPointer collectionpointer = new CollectionPointer(collection, locale);
        when(collectionpointer.getImmediateNode()).thenReturn(collection);
        when(collectionpointer.getName()).thenReturn(new QName("name"));
        NodePointer valuePointer = collectionpointer.getValuePointer();
        assertEquals(collectionpointer, valuePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointerNullValue_zqBx2_RkeD1() {
        CollectionPointer collectionPointer = new CollectionPointer((Object) null, Locale.US);
        NodePointer result = collectionPointer.getValuePointer();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointerNullValue_zqBx2_RkeD1_fid2() {
        CollectionPointer collectionPointer = new CollectionPointer((Object) null, Locale.US);
        NodePointer result = collectionPointer.getValuePointer();
        assertEquals("", result);
    }
}