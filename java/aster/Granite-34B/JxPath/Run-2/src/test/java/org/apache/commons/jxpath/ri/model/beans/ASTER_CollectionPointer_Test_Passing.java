/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionPointer_Test_Passing {
    CollectionPointer collectionpointer;
    private Object collection;
    private DOMNodePointer parent;
    private int index;
    private Object value;
    private Locale locale;
    private ValueUtils valueUtils;
    NodeIterator nodeIterator;
    NodeIterator nodeIterator2;
    NodeIterator nodeIterator3;
    NodeIterator nodeIterator4;
    NodeIterator nodeIterator5;
    NodeIterator nodeIterator6;
    NodeIterator nodeIterator7;
    NodeIterator nodeIterator8;
    NodeIterator nodeIterator9;
    NodeIterator nodeIterator10;
    NodeIterator nodeIterator11;
    NodeIterator nodeIterator12;
    NodeIterator nodeIterator13;
    NodeIterator nodeIterator14;
    NodeIterator nodeIterator15;
    NodeIterator nodeIterator16;
    NodeIterator nodeIterator17;
    NodeIterator nodeIterator18;
    NodeIterator nodeIterator19;
    NodeIterator nodeIterator20;
    NodeIterator nodeIterator21;
    NodeIterator nodeIterator22;
    NodeIterator nodeIterator23;
    NodeIterator nodeIterator24;
    NodeIterator nodeIterator25;
    NodeIterator nodeIterator26;
    NodeIterator nodeIterator27;
    NodeIterator nodeIterator28;
    NodeIterator nodeIterator29;
    NodeIterator nodeIterator30;
    NodeIterator nodeIterator31;
    NodeIterator nodeIterator32;
    NodeIterator nodeIterator33;
    NodeIterator nodeIterator34;
    NodeIterator nodeIterator35;
    NodeIterator nodeIterator36;
    NodeIterator nodeIterator37;
    NodeIterator nodeIterator38;
    NodeIterator nodeIterator39;
    NodeIterator nodeIterator40;
    NodeIterator nodeIterator41;
    NodeIterator nodeIterator42;
    NodeIterator nodeIterator43;
    NodeIterator nodeIterator44;
    NodeIterator nodeIterator45;
    NodeIterator nodeIterator46;
    NodeIterator nodeIterator47;
    NodeIterator nodeIterator48;
    NodeIterator nodeIterator49;
    NodeIterator nodeIterator50;
    NodeIterator nodeIterator51;
    NodeIterator nodeIterator52;
    NodeIterator nodeIterator53;
    NodeIterator nodeIterator54;
    NodeIterator nodeIterator55;
    NodeIterator nodeIterator56;
    NodeIterator nodeIterator57;
    NodeIterator nodeIterator58;
    NodeIterator nodeIterator59;
    NodeIterator nodeIterator60;
    NodeIterator nodeIterator61;
    NodeIterator nodeIterator62;
    NodeIterator nodeIterator63;
    NodeIterator nodeIterator64;
    NodeIterator nodeIterator65;
    NodeIterator nodeIterator66;
    NodeIterator nodeIterator67;
    NodeIterator nodeIterator68;
    NodeIterator nodeIterator69;
    NodeIterator nodeIterator70;
    NodeIterator nodeIterator71;
    NodeIterator nodeIterator72;
    NodeIterator nodeIterator73;
    NodeIterator nodeIterator74;
    NodeIterator nodeIterator75;
    NodeIterator nodeIterator76;
    NodeIterator nodeIterator77;
    NodeIterator nodeIterator78;
    NodeIterator nodeIterator79;
    NodeIterator nodeIterator80;
    NodeIterator nodeIterator81;
    NodeIterator nodeIterator82;
    NodeIterator nodeIterator83;
    NodeIterator nodeIterator84;
    NodeIterator nodeIterator85;
    NodeIterator nodeIterator86;
    NodeIterator nodeIterator87;
    NodeIterator nodeIterator88;
    NodeIterator nodeIterator89;
    NodeIterator nodeIterator90;
    NodeIterator nodeIterator91;
    NodeIterator nodeIterator92;
    NodeIterator nodeIterator93;
    NodeIterator nodeIterator94;
    NodeIterator nodeIterator95;
    NodeIterator nodeIterator96;
    NodeIterator nodeIterator97;
    NodeIterator nodeIterator98;
    NodeIterator nodeIterator99;
    NodeIterator nodeIterator100;
    NodeIterator nodeIterator101;
    NodeIterator nodeIterator102;
    NodeIterator nodeIterator103;
    NodeIterator nodeIterator104;
    NodeIterator nodeIterator105;
    NodeIterator nodeIterator106;
    NodeIterator nodeIterator107;
    NodeIterator nodeIterator108;
    NodeIterator nodeIterator109;
    NodeIterator nodeIterator110;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getImmediateNode_whenIndexIsWholeCollection_voVu0() {
        Object collection = new Object();
        Locale locale = new Locale("en");
        CollectionPointer collectionPointer = new CollectionPointer(collection, locale);
        Object actual = collectionPointer.getImmediateNode();
        Object expected = ValueUtils.getValue(collection);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getImmediateNode_whenIndexIsNotWholeCollection_opsf1() {
        Object collection = new Object();
        Locale locale = new Locale("en");
        int index = 1;
        CollectionPointer collectionPointer = new CollectionPointer(collection, locale);
        Object actual = collectionPointer.getImmediateNode();
        Object expected = ValueUtils.getValue(collection, index);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_uNBH0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        collectionPointer.setIndex(1);
        assertEquals(1, collectionPointer.getIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ihVM0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        assertEquals(null, collectionPointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getLengthTest_fllo0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        int expectedLength = ValueUtils.getLength(collectionPointer.getBaseValue());
        int actualLength = collectionPointer.getLength();
        assertEquals(expectedLength, actualLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        collectionpointer = new CollectionPointer(new Object(), new Locale("en"));
        final Object value = collectionpointer.getNode();
        final boolean isLeaf = JXPathIntrospector.getBeanInfo(value.getClass()).isAtomic();
        assertEquals(isLeaf, collectionpointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals() throws Exception {
        collectionpointer = new CollectionPointer(collection, locale);
        Object object = new Object();
        boolean expected = false;
        boolean actual = collectionpointer.equals(object);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_ZOgH0() {
        final CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        assertTrue(collectionPointer.equals(collectionPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_bpnl1() {
        final CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        assertFalse(collectionPointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClass_gQLt2() {
        final CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        assertFalse(collectionPointer.equals(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentCollection_fRKu3() {
        final Object collection1 = new Object();
        final Object collection2 = new Object();
        final CollectionPointer collectionPointer1 = new CollectionPointer(collection1, new Locale(""));
        final CollectionPointer collectionPointer2 = new CollectionPointer(collection2, new Locale(""));
        assertFalse(collectionPointer1.equals(collectionPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_2_hvPy2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        boolean result = collectionPointer.isContainer();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_IUqF0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        String namespace = "test";
        NodePointer result = collectionPointer.namespacePointer(namespace);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        collectionpointer = new CollectionPointer(collection, null);
        assertEquals(collection, collectionpointer.getBaseValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBaseValueTest_NcjC0() {
        Object collection = new Object();
        Locale locale = new Locale("en", "US");
        CollectionPointer collectionPointer = new CollectionPointer(collection, locale);
        Object expected = collection;
        Object actual = collectionPointer.getBaseValue();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeWithNullTest_mbzZ0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertTrue(collectionPointer.testNode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeWithNodeTypeTest_qSfC2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertTrue(collectionPointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
    }
}