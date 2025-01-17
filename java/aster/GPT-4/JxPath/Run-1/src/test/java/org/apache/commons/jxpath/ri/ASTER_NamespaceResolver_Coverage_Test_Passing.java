/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NamespaceResolver_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_NamespaceIteratorReturnsNull_mpCR0() {
        NodePointer mockPointer = mock(NodePointer.class);
        when(mockPointer.namespaceIterator()).thenReturn(null);
        when(mockPointer.getParent()).thenReturn(null);
        String result = NamespaceResolver.getPrefix(mockPointer, "http://example.com");
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_NamespaceUriMatches_Wkwf1() {
        NodePointer mockPointer = mock(NodePointer.class);
        NodeIterator mockIterator = mock(NodeIterator.class);
        NodePointer mockNsPointer = mock(NodePointer.class);
        QName mockQName = new QName("ex");
        when(mockPointer.namespaceIterator()).thenReturn(mockIterator);
        when(mockIterator.setPosition(1)).thenReturn(true);
        when(mockIterator.getNodePointer()).thenReturn(mockNsPointer);
        when(mockNsPointer.getNamespaceURI()).thenReturn("http://example.com");
        when(mockNsPointer.getName()).thenReturn(mockQName);
        when(mockPointer.getParent()).thenReturn(null);
        String result = NamespaceResolver.getPrefix(mockPointer, "http://example.com");
        assertEquals("ex", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_NamespaceUriMatchesButPrefixIsEmpty_dpin2() {
        NodePointer mockPointer = mock(NodePointer.class);
        NodeIterator mockIterator = mock(NodeIterator.class);
        NodePointer mockNsPointer = mock(NodePointer.class);
        QName mockQName = new QName("");
        when(mockPointer.namespaceIterator()).thenReturn(mockIterator);
        when(mockIterator.setPosition(1)).thenReturn(true);
        when(mockIterator.getNodePointer()).thenReturn(mockNsPointer);
        when(mockNsPointer.getNamespaceURI()).thenReturn("http://example.com");
        when(mockNsPointer.getName()).thenReturn(mockQName);
        when(mockPointer.getParent()).thenReturn(null);
        String result = NamespaceResolver.getPrefix(mockPointer, "http://example.com");
        assertNull(result);
    }
}