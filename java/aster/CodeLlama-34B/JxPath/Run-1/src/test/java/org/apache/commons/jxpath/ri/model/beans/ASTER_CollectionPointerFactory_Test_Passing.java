/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
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
public class Aster_CollectionPointerFactory_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithCollection_cIHT0_1() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("test");
        List<String> collection = Arrays.asList("a", "b", "c");
        NodePointer pointer = factory.createNodePointer(name, collection, Locale.ENGLISH);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithCollection_cIHT0_2() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("test");
        List<String> collection = Arrays.asList("a", "b", "c");
        NodePointer pointer = factory.createNodePointer(name, collection, Locale.ENGLISH);
        assertEquals(name, pointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithCollection_cIHT0_3() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("test");
        List<String> collection = Arrays.asList("a", "b", "c");
        NodePointer pointer = factory.createNodePointer(name, collection, Locale.ENGLISH);
        assertEquals(collection, pointer.getNodeValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithCollection_cIHT0_4() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("test");
        List<String> collection = Arrays.asList("a", "b", "c");
        NodePointer pointer = factory.createNodePointer(name, collection, Locale.ENGLISH);
        assertEquals(Locale.ENGLISH, pointer.getLocale());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonCollection_DObc1() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("test");
        Object bean = new Object();
        NodePointer pointer = factory.createNodePointer(name, bean, Locale.ENGLISH);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithNullCollectionPointerFactory_fHuF2() {
        CollectionPointerFactory collectionPointerFactory = null;
        try {
            int order = collectionPointerFactory.getOrder();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_OtEb0_KQVR0() {
        CollectionPointerFactory collectionPointerFactory = new CollectionPointerFactory();
        int order = collectionPointerFactory.getOrder();
        assertEquals(CollectionPointerFactory.COLLECTION_POINTER_FACTORY_ORDER, order);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithCollection_cIHT0() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        QName name = new QName("test");
        List<String> collection = Arrays.asList("a", "b", "c");
        NodePointer pointer = factory.createNodePointer(name, collection, Locale.ENGLISH);
        assertNotNull(pointer);
        assertEquals(name, pointer.getName());
        assertEquals(collection, pointer.getNodeValue());
        assertEquals(Locale.ENGLISH, pointer.getLocale());
    }
}