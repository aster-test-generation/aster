/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionPointerFactory_Test_Passing {
    CollectionPointerFactory collectionpointerfactory;
    NodePointer parent;
    QName name;
    Object bean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNodePointerWhenBeanIsNoCollection_rfmr1() {
        CollectionPointerFactory collectionPointerFactory = new CollectionPointerFactory();
        Object bean = new Object();
        Locale locale = Locale.getDefault();
        NodePointer nodePointer = collectionPointerFactory.createNodePointer(new QName("name"), bean, locale);
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateNodePointer_WLTK0_2_fid1() {
        CollectionPointerFactory collectionPointerFactory = new CollectionPointerFactory();
        Object bean = new Object();
        Locale locale = Locale.getDefault();
        NodePointer nodePointer = collectionPointerFactory.createNodePointer(new QName("name"), bean, locale);
        assertFalse(nodePointer instanceof CollectionPointer);
    }
}