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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CollectionPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_4_ELGx3() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        boolean actual = collectionPointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE));
        Assertions.assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_efqu0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        boolean actual = collectionPointer.isLeaf();
        boolean expected = false;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator1_hgEO0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        collectionPointer.namespaceIterator();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer2_iacv1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        boolean actual = collectionPointer.isContainer();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_dSxd0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        Object object = collectionPointer;
        boolean actual = collectionPointer.equals(object);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_elzf1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        Object object = new Object();
        boolean actual = collectionPointer.equals(object);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_zPoX2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        Object object = new CollectionPointer(new Object(), new Locale("en"));
        boolean actual = collectionPointer.equals(object);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator1_nSdl0_DCon0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ROOT);
        NodeIterator nodeIterator = collectionPointer.attributeIterator(new QName(""));
    }
}