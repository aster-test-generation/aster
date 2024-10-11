/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DOMNodePointer_Coverage_Test_Failing {
    private QName name;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLanguage_currentIsNull_ZtSf0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        String lang = "en";
        boolean result = domNodePointer.isLanguage(lang);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLanguage_currentIsNotNull_Ownx1() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        String lang = "en";
        boolean result = domNodePointer.isLanguage(lang);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithEmptyPrefix_EieC1() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, null, null);
        String namespaceURI = nodePointer.getNamespaceURI("");
        assertNull(NodePointer.UNKNOWN_NAMESPACE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNullNode_ThNO5() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, null, null);
        String namespaceURI = nodePointer.getNamespaceURI("prefix");
        assertNull(NodePointer.UNKNOWN_NAMESPACE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNullPrefix_nGyX0_gnTV1() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, null, null);
        String namespaceURI = nodePointer.getNamespaceURI((String) null);
        assertNull(NodePointer.UNKNOWN_NAMESPACE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithEmptyPrefix_EieC1_fid1() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, null, null);
        String namespaceURI = nodePointer.getNamespaceURI("");
        assertEquals(NodePointer.UNKNOWN_NAMESPACE, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNullNode_ThNO5_fid1() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, null, null);
        String namespaceURI = nodePointer.getNamespaceURI("prefix");
        assertEquals(NodePointer.UNKNOWN_NAMESPACE, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNullPrefix_nGyX0_gnTV1_fid1() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, null, null);
        String namespaceURI = nodePointer.getNamespaceURI((String) null);
        assertEquals(NodePointer.UNKNOWN_NAMESPACE, namespaceURI);
    }
}