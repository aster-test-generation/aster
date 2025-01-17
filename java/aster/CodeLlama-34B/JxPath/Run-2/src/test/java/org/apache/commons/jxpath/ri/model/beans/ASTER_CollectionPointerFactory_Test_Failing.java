/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.ArrayList;
import java.util.Collection;
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
public class Aster_CollectionPointerFactory_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithCollection_AEXG0_3() {
        CollectionPointerFactory collectionPointerFactory = new CollectionPointerFactory();
        QName name = new QName("test");
        Collection<String> collection = new ArrayList<>();
        collection.add("test1");
        collection.add("test2");
        NodePointer nodePointer = collectionPointerFactory.createNodePointer(name, collection, Locale.ENGLISH);
        assertEquals(name, nodePointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_NullParent_RqJE2() {
        CollectionPointerFactory collectionPointerFactory = new CollectionPointerFactory();
        QName name = new QName("name");
        Object bean = new ArrayList<>();
        NodePointer nodePointer = collectionPointerFactory.createNodePointer(null, name, bean);
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithCollection_AEXG0() {
        CollectionPointerFactory collectionPointerFactory = new CollectionPointerFactory();
        QName name = new QName("test");
        Collection<String> collection = new ArrayList<>();
        collection.add("test1");
        collection.add("test2");
        NodePointer nodePointer = collectionPointerFactory.createNodePointer(name, collection, Locale.ENGLISH);
        assertNotNull(nodePointer);
        assertEquals(collection, nodePointer.getNodeValue());
        assertEquals(name, nodePointer.getName());
        assertEquals(Locale.ENGLISH, nodePointer.getLocale());
    }
}