/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionPointer_Test_Passing {
    CollectionPointer collectionpointer;
    private Object collection;
    @Mock
    private NodeTest test;
    private CollectionPointer collectionPointer;
    private JXPathContext context;
    private Locale locale;
    private QName name;
    private int index;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private NodePointer valuePointer;
    private boolean reverse;
    private NodePointer startWith;
    private NodeIterator expectedNodeIterator;
    @Mock
    private NodeIterator nodeIterator;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private KeywordVariables keywordVariables;
    @Mock
    private QName qName;
    @Mock
    private Object value;
    private NodePointer nodePointer;
    private NodePointer ptr;
    private NodePointer parentPointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers() throws Exception {
        collectionpointer = new CollectionPointer(Mockito.mock(DOMNodePointer.class), Mockito.mock(Object.class));
        NodePointer pointer1 = Mockito.mock(NodePointer.class);
        NodePointer pointer2 = Mockito.mock(NodePointer.class);
        when(pointer1.getIndex()).thenReturn(1);
        when(pointer2.getIndex()).thenReturn(2);
        assertEquals(collectionpointer.compareChildNodePointers(pointer1, pointer2), -1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChild() {
        collection = new Object();
        locale = Locale.getDefault();
        name = new QName("name");
        index = 0;
        context = mock(JXPathContext.class);
        collectionPointer = new CollectionPointer(collection, locale);
        NodePointer ptr = collectionPointer.createChild(context, name, index);
        assertEquals(ptr.getClass(), NodePointer.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() {
        collectionPointer = new CollectionPointer(parent, collection);
        when(collectionPointer.isCollection()).thenReturn(true);
        assertTrue(collectionPointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        collection = mock(Object.class);
        collectionpointer = new CollectionPointer(null, collection);
        // arrange
        int index = 0;
        // act
        Object result = collectionpointer.getImmediateNode();
        // assert
        verify(collection, times(1)).toString();
        assertEquals(result, collection.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        collectionpointer = new CollectionPointer(parent, collection);
        // Mock the behavior of the objects
        when(collection.hashCode()).thenReturn(123);
        when(parent.hashCode()).thenReturn(456);
        // Call the method under test
        int hashCode = collectionpointer.hashCode();
        // Assert the expected result
        assertEquals(123 + 456, hashCode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection2_ASPi1() {
        CollectionPointer collectionPointer = new CollectionPointer(new VariablePointer(new QName("name")), new Object());
        boolean result = collectionPointer.isCollection();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection3_DDiQ2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        boolean result = collectionPointer.isCollection();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_HCFc0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        QName name = new QName(null, null);
        NodeIterator actualNodeIterator = domNodePointer.attributeIterator(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() {
        collectionpointer = new CollectionPointer(parent, collection);
        when(parent.getName()).thenReturn(new QName("prefix", "localName"));
        when(collection.toString()).thenReturn("collection");
        QName name = collectionpointer.getName();
        assertEquals(new QName("prefix", "collection"), name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndexWithKeywordVariables_dpgC2() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        collectionPointer.setIndex(2);
        assertEquals(2, collectionPointer.getIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testchildIterator() {
        collectionPointer = new CollectionPointer(Mockito.mock(Object.class), Locale.getDefault());
        test = Mockito.mock(NodeTest.class);
        reverse = true;
        startWith = Mockito.mock(NodePointer.class);
        expectedNodeIterator = Mockito.mock(NodeIterator.class);
        Mockito.when(collectionPointer.getValuePointer()).thenReturn(Mockito.mock(NodePointer.class));
        Mockito.when(collectionPointer.getValuePointer().childIterator(test, reverse, startWith)).thenReturn(expectedNodeIterator);
        NodeIterator actualNodeIterator = collectionPointer.childIterator(test, reverse, startWith);
        assertEquals(expectedNodeIterator, actualNodeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithAtomicNode_llOe1() {
        Object value = new Object();
        CollectionPointer collectionPointer = new CollectionPointer(value, Locale.getDefault());
        boolean isLeaf = collectionPointer.isLeaf();
        Assertions.assertTrue(isLeaf);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithNonAtomicNode_LgKP2() {
        Object value = new Object();
        CollectionPointer collectionPointer = new CollectionPointer(value, Locale.getDefault());
        boolean isLeaf = collectionPointer.isLeaf();
        Assertions.assertFalse(isLeaf);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1() throws Exception {
        collection = new Object();
        collectionpointer = new CollectionPointer(null, collection);
        CollectionPointer other = new CollectionPointer(null, collection);
        other = new CollectionPointer(null, new Object());
        other = null;
        assertTrue(collectionpointer.equals(other));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2() throws Exception {
        collection = new Object();
        collectionpointer = new CollectionPointer(null, collection);
        CollectionPointer other = new CollectionPointer(null, collection);
        other = new CollectionPointer(null, new Object());
        other = null;
        assertFalse(collectionpointer.equals(other));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength2_Dirx1() {
        CollectionPointer collectionPointer = new CollectionPointer(new VariablePointer(new QName("name")), new Object());
        assertEquals(0, collectionPointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength3_fBhI2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertEquals(0, collectionPointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer() {
        collectionPointer = new CollectionPointer(parent, collection);
        when(collectionPointer.isContainer()).thenReturn(true);
        assertTrue(collectionPointer.isContainer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer1_VJCD0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        domNodePointer.getValuePointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer2_WNaD1() {
        VariablePointer variablePointer = new VariablePointer(null, null);
        DOMNodePointer domNodePointer = new DOMNodePointer(variablePointer, null);
        domNodePointer.getValuePointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName1_OIhY3() {
        new QName(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName2_UuBd4() {
        new QName(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointer1_RWMl5() {
        new VariablePointer(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointer2_yQwx6() {
        KeywordVariables keywordVariables = new KeywordVariables(null, null);
        new VariablePointer(keywordVariables, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeywordVariables1_mreW7() {
        new KeywordVariables(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild() throws Exception {
        collection = new Object();
        locale = Locale.getDefault();
        parent = mock(DOMNodePointer.class);
        index = 0;
        value = new Object();
        context = mock(JXPathContext.class);
        ptr = mock(NodePointer.class);
        when(parent.createPath(context, value)).thenReturn(ptr);
        collectionpointer = new CollectionPointer(parent, collection);
        collectionpointer.setIndex(index);
        NodePointer actualResult = collectionpointer.createChild(context, null, index, value);
        assertEquals(ptr, actualResult);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        collection = new Object();
        collectionpointer = new CollectionPointer(null, collection);
        assertEquals(collection, collectionpointer.getBaseValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setIndex(int index) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals() throws Exception {
        collection = new Object();
        collectionpointer = new CollectionPointer(null, collection);
        CollectionPointer other = new CollectionPointer(null, collection);
        assertTrue(collectionpointer.equals(other));
        other = new CollectionPointer(null, new Object());
        assertFalse(collectionpointer.equals(other));
        other = null;
        assertFalse(collectionpointer.equals(other));
    }
}