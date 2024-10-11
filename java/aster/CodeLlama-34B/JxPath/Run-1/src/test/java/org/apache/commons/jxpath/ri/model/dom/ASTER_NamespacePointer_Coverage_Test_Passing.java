/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NamespacePointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithoutParent_cNvL1() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        String path = namespacePointer.asPath();
        assertEquals("namespace::prefix", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeWithNullNodeTest_BCQo0_MOsg0() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, new Locale("en"), "id"), "prefix");
        assertTrue(namespacePointer.testNode(null));
    }
}