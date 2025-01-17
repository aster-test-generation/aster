/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionPointer_Test_Passing {
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
    public void testcompareChildNodePointers() throws Exception {
        collectionpointer = new CollectionPointer(new Object(), Locale.US);
        when(pointer1.getIndex()).thenReturn(1);
        when(pointer2.getIndex()).thenReturn(2);
        int result = collectionpointer.compareChildNodePointers(pointer1, pointer2);
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        Object collection = Mockito.mock(Object.class);
        Locale locale = Mockito.mock(Locale.class);
        collectionpointer = new CollectionPointer(collection, locale);
        boolean result = collectionpointer.isCollection();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_WHOLE_COLLECTION_qdWM0() {
        Locale locale = new Locale("en", "US");
        Object collection = new Object();
        CollectionPointer collectionPointer = new CollectionPointer(collection, locale);
        QName name = new QName("qualifiedName");
        NodeIterator iterator = collectionPointer.attributeIterator(name);
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode2_dTjc1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertTrue(collectionPointer.testNode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_WHOLE_COLLECTION_fLur0() {
        Locale locale = new Locale("en", "US");
        Object collection = new Object();
        CollectionPointer collectionPointer = new CollectionPointer(collection, locale);
        collectionPointer.setIndex(CollectionPointer.WHOLE_COLLECTION);
        NodeIterator nodeIterator = collectionPointer.namespaceIterator();
        assertNull(nodeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        collection = new Object();
        collectionpointer = new CollectionPointer(collection, Locale.US);
        Object result = collectionpointer.getBaseValue();
        assertEquals(collection, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_GZXM0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertTrue(collectionPointer.equals(collectionPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_ZufB1() {
        Object object = new Object();
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertFalse(collectionPointer.equals(object));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameCollection_QfHR2() {
        Object collection = new Object();
        CollectionPointer collectionPointer1 = new CollectionPointer(collection, new Locale("en"));
        CollectionPointer collectionPointer2 = new CollectionPointer(collection, new Locale("en"));
        assertTrue(collectionPointer1.equals(collectionPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentCollection_DZwS3() {
        CollectionPointer collectionPointer1 = new CollectionPointer(new Object(), new Locale("en"));
        CollectionPointer collectionPointer2 = new CollectionPointer(new Object(), new Locale("en"));
        assertFalse(collectionPointer1.equals(collectionPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_iWgB4() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        assertFalse(collectionPointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_WHOLE_COLLECTION_DYJC0() {
        Locale locale = new Locale("en", "US");
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), locale);
        collectionPointer.setIndex(CollectionPointer.WHOLE_COLLECTION);
        NodePointer valuePointer = collectionPointer.getValuePointer();
        assertSame(collectionPointer, valuePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_false_QMOT1() {
        Locale locale = new Locale("en", "US");
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), locale);
        collectionPointer.setIndex(CollectionPointer.WHOLE_COLLECTION);
        assertFalse(collectionPointer.isContainer());
    }
}