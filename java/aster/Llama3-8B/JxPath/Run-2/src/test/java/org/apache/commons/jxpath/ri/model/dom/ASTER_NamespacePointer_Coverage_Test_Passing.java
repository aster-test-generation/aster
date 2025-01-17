/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NamespacePointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameObject_Rzvz0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        boolean result = namespacePointer.equals(namespacePointer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentObject_lvdy1() {
        NamespacePointer namespacePointer1 = new NamespacePointer(null, "prefix");
        NamespacePointer namespacePointer2 = new NamespacePointer(null, "prefix");
        boolean result = namespacePointer1.equals(namespacePointer2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentClass_lMgF2() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        Object object = new Object();
        boolean result = namespacePointer.equals(object);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsNull_kYKu3() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        boolean result = namespacePointer.equals(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_Gaaf0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        try {
            namespacePointer.setValue("value");
            assert false; // This line should not be executed
        } catch (UnsupportedOperationException e) {
            assert e.getMessage().equals("Cannot modify DOM trees");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_UdeO0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        assertFalse(namespacePointer.isCollection());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_BufferLengthIsZero_GVxo0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        String result = namespacePointer.asPath();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_BufferLengthIsNotZeroAndLastCharIsNotSlash_PHGE1() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, null, "id"), "prefix");
        String result = namespacePointer.asPath();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_HqOg0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        int length = namespacePointer.getLength();
        assert(length == 1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareChildNodePointers_vUpk0_ZTQp0() {
    NamespacePointer namespacePointer = new NamespacePointer(null, "prefix", "namespaceURI");
    DOMNodePointer nodePointer1 = new DOMNodePointer(namespacePointer, null);
    DOMNodePointer nodePointer2 = new DOMNodePointer(namespacePointer, null);
    assertEquals(0, namespacePointer.compareChildNodePointers(nodePointer1, nodePointer2));
}
}