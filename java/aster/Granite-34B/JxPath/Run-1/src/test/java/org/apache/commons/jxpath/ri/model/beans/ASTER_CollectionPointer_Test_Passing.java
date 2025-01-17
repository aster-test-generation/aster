/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionPointer_Test_Passing {
    CollectionPointer collectionpointer;
    private NodePointer valuePointer;
    @Mock
    JXPathContext context;
    @Mock
    NodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeWithNullTest_yLHS0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        boolean result = collectionPointer.testNode(null);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeWithNodeTypeTest_fXTM2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        NodeTest nodeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        boolean result = collectionPointer.testNode(nodeTest);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        collectionpointer = new CollectionPointer(new Object(), new Locale(""));
        assertTrue(collectionpointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_xseN0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        assertTrue(collectionPointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithKeywordVariables_RYtY2() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer parent = new VariablePointer(variables, new QName("name"));
        Object collection = new Object();
        CollectionPointer collectionPointer = new CollectionPointer(parent, collection);
        int expected = System.identityHashCode(collection) + collectionPointer.getIndex();
        int actual = collectionPointer.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_wMIH0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        collectionPointer.setIndex(5);
        assertEquals(5, collectionPointer.getIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_pvLd0_1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertNotNull(collectionPointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        collectionpointer = new CollectionPointer(new Object(), new Locale(""));
        final Object value = collectionpointer.getNode();
        boolean expected = value == null || JXPathIntrospector.getBeanInfo(value.getClass()).isAtomic();
        boolean actual = collectionpointer.isLeaf();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWhenNodeIsNotAtomic_UfhQ1() {
        Object value = new Object();
        boolean result = JXPathIntrospector.getBeanInfo(value.getClass()).isAtomic();
        assertTrue(!result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_hAvv0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        NodeIterator nodeIterator = collectionPointer.namespaceIterator();
        assertEquals(null, nodeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetValuePointer() throws Exception {
        collectionpointer = mock(CollectionPointer.class);
        valuePointer = mock(NodePointer.class);
        when(collectionpointer.getValuePointer()).thenReturn(valuePointer);
        NodePointer result = collectionpointer.getValuePointer();
        assertEquals(valuePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisContainer() throws Exception {
        collectionpointer = new CollectionPointer(new Object(), new Locale("en"));
        collectionpointer.setIndex(1);
        assertTrue(collectionpointer.isContainer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_eMDu0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        NodePointer nodePointer = collectionPointer.namespacePointer("namespace");
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBaseValueTest_TmzW0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        Object baseValue = collectionPointer.getBaseValue();
        assertNotNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithOneArgument_bVmz4_nCTD0() {
        Object collection = new Object();
        CollectionPointer collectionPointer = new CollectionPointer(collection, null);
        int expected = System.identityHashCode(collection) + collectionPointer.getIndex();
        int actual = collectionPointer.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLength_0_mAEl0_fid2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        int result = collectionPointer.getLength();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getLength_4_NDzN4_fid2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        int result = collectionPointer.getLength();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWhenNodeIsAtomic_FjoS0_fid2() {
        Object value = new Object();
        boolean result = JXPathIntrospector.getBeanInfo(value.getClass()).isAtomic();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_OUOi0_fid2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        boolean result = collectionPointer.isContainer();
        assertEquals(false, result);
    }
}