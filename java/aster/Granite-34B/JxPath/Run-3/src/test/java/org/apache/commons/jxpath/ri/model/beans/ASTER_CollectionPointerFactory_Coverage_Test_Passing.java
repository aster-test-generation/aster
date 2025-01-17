/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CollectionPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWhenBeanIsCollection_MfKy1() {
        CollectionPointerFactory collectionPointerFactory = new CollectionPointerFactory();
        Object bean = new ArrayList<>();
        Locale locale = Locale.getDefault();
        NodePointer nodePointer = collectionPointerFactory.createNodePointer(new QName(" qualifiedName"), bean, locale);
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWhenBeanIsNotCollection_BVDz2() {
        CollectionPointerFactory collectionPointerFactory = new CollectionPointerFactory();
        Object bean = new Object();
        Locale locale = Locale.getDefault();
        NodePointer nodePointer = collectionPointerFactory.createNodePointer(new QName(" qualifiedName"), bean, locale);
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_gdUX0_2() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        JXPathContext context = null; // initialize the context
        NodePointer parent = null; // initialize the parent
        QName name = null; // initialize the name
        Object bean = null; // initialize the bean
        NodePointer nodePointer = factory.createNodePointer(parent, name, bean);
        if (ValueUtils.isCollection(bean)) {
        }
        else {
        }
        assertNull(nodePointer);
    }
}