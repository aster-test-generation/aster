/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CollectionPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode1_uOeN0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale(""));
        Object immediateNode = collectionPointer.getImmediateNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode2_ZXQu1() {
        CollectionPointer collectionPointer = new CollectionPointer(new DOMNodePointer(null, null, ""), new Object());
        Object immediateNode = collectionPointer.getImmediateNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashcode_jSKw0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        int hashCode = collectionPointer.hashCode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_UrUS0_oLhg0() {
        DOMNodePointer parent = null;
        Object collection = null;
        CollectionPointer collectionPointer = new CollectionPointer(parent, collection);
        NodeIterator actualNodeIterator = collectionPointer.namespaceIterator();
        NodeIterator expectedNodeIterator = null;
        assertEquals(expectedNodeIterator, actualNodeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_JRqT0_fid2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.getDefault());
        boolean isContainer = collectionPointer.isContainer();
        assertFalse(isContainer);
    }
}