/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
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
    private Object collection;
    private NodePointer valuePointer;
    CollectionPointer collectionpointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NullTest_UcmW0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        assertTrue(collectionPointer.testNode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NodeNameTest_CQpq1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        NodeNameTest nodeNameTest = new NodeNameTest(new QName("name"));
        assertFalse(collectionPointer.testNode(nodeNameTest));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NodeTypeTest_NodeTypeNode_BYuc2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(collectionPointer.testNode(nodeTypeTest));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithKeywordVariables_FPNY1() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(keywordVariables, new QName("prefix", "localName"));
        CollectionPointer collectionPointer = new CollectionPointer(variablePointer, new Object());
        assertTrue(collectionPointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionWithoutKeywordVariables_xkuf2() {
        QName qName = new QName("qualifiedName");
        VariablePointer variablePointer = new VariablePointer(qName);
        CollectionPointer collectionPointer = new CollectionPointer(variablePointer, new Object());
        assertTrue(collectionPointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_EYhA0() {
        QName name = new QName("name");
        CollectionPointer collectionPointer = new CollectionPointer(new ArrayList<>(), Locale.ENGLISH);
        NodeIterator iterator = collectionPointer.attributeIterator(name);
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIteratorWithWholeCollection_sUzg2() {
        QName name = new QName("name");
        CollectionPointer collectionPointer = new CollectionPointer(new ArrayList<>(), Locale.ENGLISH);
        collectionPointer.setIndex(CollectionPointer.WHOLE_COLLECTION);
        NodeIterator iterator = collectionPointer.attributeIterator(name);
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_emptyCollection_WbSx0() {
        CollectionPointer collectionPointer = new CollectionPointer(new ArrayList<>(), Locale.ENGLISH);
        int length = collectionPointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_nonEmptyCollection_YwfF1() {
        CollectionPointer collectionPointer = new CollectionPointer(Arrays.asList(1, 2, 3), Locale.ENGLISH);
        int length = collectionPointer.getLength();
        assertEquals(3, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_WholeCollection_HIcM0() {
        CollectionPointer collectionPointer = new CollectionPointer(new ArrayList<>(), Locale.ENGLISH);
        NodeIterator iterator = collectionPointer.namespaceIterator();
        assertNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_kpNl0() {
        CollectionPointer pointer = new CollectionPointer(new ArrayList<>(), Locale.ENGLISH);
        assertTrue(pointer.equals(pointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentObject_XaUp1() {
        CollectionPointer pointer1 = new CollectionPointer(new ArrayList<>(), Locale.ENGLISH);
        CollectionPointer pointer2 = new CollectionPointer(new ArrayList<>(), Locale.FRENCH);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_RPJp2() {
        CollectionPointer pointer = new CollectionPointer(new ArrayList<>(), Locale.ENGLISH);
        assertFalse(pointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_KOgt3() {
        CollectionPointer pointer = new CollectionPointer(new ArrayList<>(), Locale.ENGLISH);
        assertFalse(pointer.equals("not a collection pointer"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameCollectionAndIndex_dTBB4() {
        List<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        CollectionPointer pointer1 = new CollectionPointer(collection, Locale.ENGLISH);
        CollectionPointer pointer2 = new CollectionPointer(collection, Locale.FRENCH);
        assertTrue(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentCollection_HmEl5() {
        List<String> collection1 = new ArrayList<>();
        collection1.add("item1");
        collection1.add("item2");
        CollectionPointer pointer1 = new CollectionPointer(collection1, Locale.ENGLISH);
        List<String> collection2 = new ArrayList<>();
        collection2.add("item3");
        collection2.add("item4");
        CollectionPointer pointer2 = new CollectionPointer(collection2, Locale.FRENCH);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentIndex_VEUf6() {
        List<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        CollectionPointer pointer1 = new CollectionPointer(collection, Locale.ENGLISH);
        CollectionPointer pointer2 = new CollectionPointer(collection, Locale.FRENCH);
        pointer1.setIndex(1);
        pointer2.setIndex(2);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_WholeCollection_PviQ0() {
        CollectionPointer collectionPointer = new CollectionPointer(new ArrayList<Object>(), Locale.ENGLISH);
        NodePointer valuePointer = collectionPointer.getValuePointer();
        assertSame(collectionPointer, valuePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_WholeCollection_HxsR0() {
        CollectionPointer collectionPointer = new CollectionPointer(new ArrayList<>(), Locale.ENGLISH);
        assertFalse(collectionPointer.isContainer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WholeCollection_jzxa0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        String path = collectionPointer.asPath();
        assertEquals("/", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_IndexedCollection_AFJV1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        collectionPointer.setIndex(1);
        String path = collectionPointer.asPath();
        assertEquals("/.[2]", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValueWithCollection_yxVl0() {
        CollectionPointer collectionPointer = new CollectionPointer(new ArrayList<String>(), Locale.ENGLISH);
        Object baseValue = collectionPointer.getBaseValue();
        assertEquals(new ArrayList<String>(), baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValueWithKeywordVariables_iCzR2() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(keywordVariables, new QName("prefix", "localName"));
        CollectionPointer collectionPointer = new CollectionPointer(variablePointer, new ArrayList<String>());
        Object baseValue = collectionPointer.getBaseValue();
        assertEquals(new ArrayList<String>(), baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_oHYc0_3() {
        CollectionPointer collectionPointer = new CollectionPointer(new ArrayList<String>(), Locale.ENGLISH);
        int index = 0;
        collectionPointer.setIndex(index);
        index = -1;
        collectionPointer.setIndex(index);
        index = 0;
        collectionPointer.setIndex(index);
        assertNotNull(collectionPointer.getValuePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals_1() throws Exception {
        collectionpointer = new CollectionPointer(collection, Locale.ENGLISH);
        assertEquals(collectionpointer, collectionpointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testequals_3() throws Exception {
        collectionpointer = new CollectionPointer(collection, Locale.ENGLISH);
        assertNotEquals(collectionpointer, new CollectionPointer(new Object(), Locale.ENGLISH));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameCollectionAndIndex_DifferentLocale_XJzy7_fid2() {
        List<String> collection = new ArrayList<>();
        collection.add("item1");
        collection.add("item2");
        CollectionPointer pointer1 = new CollectionPointer(collection, Locale.ENGLISH);
        CollectionPointer pointer2 = new CollectionPointer(collection, Locale.FRENCH);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_Index_ypmL1_2_fid2() {
        CollectionPointer collectionPointer = new CollectionPointer(new ArrayList<Object>(), Locale.ENGLISH);
        NodePointer valuePointer = collectionPointer.getValuePointer();
        assertEquals(-2147483648, valuePointer.getIndex());
    }
}