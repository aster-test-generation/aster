/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_CollectionPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_pruC0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        boolean actual = collectionPointer.isCollection();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator1_SMMS0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        collectionPointer.attributeIterator(new QName(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_Jssb0() {
        final Object value = new CollectionPointer(new Object(), new Locale("")).getNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeWithNullTest_JwcX0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        boolean actual = collectionPointer.testNode(null);
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeWithNodeTypeTest_OLoB2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        boolean actual = collectionPointer.testNode(test);
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_xQUa0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        boolean actual = collectionPointer.isContainer();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer1_qIPD0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        NodePointer nodePointer = collectionPointer.getValuePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void namespacePointerTest1_WmpF0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        NodePointer nodePointer = collectionPointer.namespacePointer("namespace");
        Assertions.assertEquals(null, nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void namespacePointerTest4_BaAO3() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        NodePointer nodePointer = collectionPointer.namespacePointer("namespace");
        Assertions.assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void namespacePointerTest5_jnqw4() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        NodePointer nodePointer = collectionPointer.namespacePointer("namespace");
        Assertions.assertTrue(nodePointer == null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath1_xTLc0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath3_hmep2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertEquals("/", "/", collectionPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_equals_1_Gbfa0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        Object object = new Object();
        boolean result = collectionPointer.equals(object);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_equals_2_OnkK1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        boolean result = collectionPointer.equals(collectionPointer);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_equals_3_dzsr2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        Object object = new CollectionPointer(new Object(), new Locale(""));
        boolean result = collectionPointer.equals(object);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_jGxa0_oEGJ0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ROOT);
        NodeIterator nodeIterator = collectionPointer.namespaceIterator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_rtSC0_LRIS0() {
        Object collection = new Object();
        Locale locale = new Locale("en");
        int index = 1;
        CollectionPointer collectionPointer = new CollectionPointer(collection, locale);
        collectionPointer.setIndex(index);
        Object actual = collectionPointer.getImmediateNode();
        Object expected = ValueUtils.getValue(collection, index);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_TrqD1_JxzW0() {
        Object collection = new Object();
        Locale locale = new Locale("en");
        int index = 2;
        CollectionPointer collectionPointer = new CollectionPointer(collection, locale);
        collectionPointer.setIndex(index);
        Object actual = collectionPointer.getImmediateNode();
        Object expected = ValueUtils.getValue(collection);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers6_ZqkB6_KgGi0() {
        final NodePointer pointer1 = mock(NodePointer.class);
        final NodePointer pointer2 = mock(NodePointer.class);
        final CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertNotEquals(5, collectionPointer.compareChildNodePointers(pointer1, pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers11_mPSi11_RtoF0() {
        final NodePointer pointer1 = mock(NodePointer.class);
        final NodePointer pointer2 = mock(NodePointer.class);
        final CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertNotEquals(10, collectionPointer.compareChildNodePointers(pointer1, pointer2));
    }
}