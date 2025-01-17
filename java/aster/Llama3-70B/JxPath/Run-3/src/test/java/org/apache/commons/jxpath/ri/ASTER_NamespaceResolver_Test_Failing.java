/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceResolver_Test_Failing {
    private NamespaceResolver namespaceresolver;
    private NamespaceResolver parentResolver;
    NamespaceResolver namespaceResolver;
    NodePointer nodePointer;
    NodeIterator nodeIterator;
    NodePointer nsPointer;
    QName qName;
    Map<String, String> reverseMap;
    Map<String, String> namespaceMap;
    @Mock
    private NamespaceResolver parent;
    Pointer pointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrefix() throws Exception {
        namespaceResolver = new NamespaceResolver();
        nodePointer = Mockito.mock(NodePointer.class);
        nodeIterator = Mockito.mock(NodeIterator.class);
        nsPointer = Mockito.mock(NodePointer.class);
        qName = new QName("prefix", "localName");
        // Given
        Mockito.when(nodePointer.namespaceIterator()).thenReturn(nodeIterator);
        Mockito.when(nodeIterator.setPosition(1)).thenReturn(true);
        Mockito.when(nodeIterator.getNodePointer()).thenReturn(nsPointer);
        Mockito.when(nsPointer.getNamespaceURI()).thenReturn("namespaceURI");
        Mockito.when(nsPointer.getName()).thenReturn(qName);
        // When
        String prefix = NamespaceResolver.getPrefix(nodePointer, "namespaceURI");
        // Then
        assertEquals("prefix", prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetExternallyRegisteredNamespaceURI_1() throws Exception {
        namespaceMap = new HashMap<>();
        parentResolver = mock(NamespaceResolver.class);
        namespaceResolver = new NamespaceResolver(parentResolver);
        // Case 1: prefix is found in namespaceMap
        String prefix = "prefix1";
        String uri = "uri1";
        namespaceMap.put(prefix, uri);
        // Case 2: prefix is not found in namespaceMap, but found in parent
        prefix = "prefix2";
        uri = "uri2";
        when(parentResolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(uri);
        // Case 3: prefix is not found in namespaceMap or parent
        prefix = "prefix3";
        assertEquals(uri, namespaceResolver.getExternallyRegisteredNamespaceURI(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        parentResolver = mock(NamespaceResolver.class);
        namespaceResolver = new NamespaceResolver(parentResolver);
        // given
        String prefix = "prefix";
        String uri = "uri";
        when(namespaceResolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(null);
        when(parentResolver.getNamespaceURI(prefix)).thenReturn(uri);
        // when
        String result = namespaceResolver.getNamespaceURI(prefix);
        // then
        assertEquals(uri, result);
        verify(namespaceResolver).getExternallyRegisteredNamespaceURI(prefix);
        verify(parentResolver).getNamespaceURI(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_2_cRAC1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver namespaceResolver = new NamespaceResolver(parent);
        String prefix = "prefix";
        String uri = "uri";
        when(namespaceResolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(uri);
        String result = namespaceResolver.getNamespaceURI(prefix);
        assertEquals(uri, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetExternallyRegisteredNamespaceURI() throws Exception {
        namespaceMap = new HashMap<>();
        parentResolver = mock(NamespaceResolver.class);
        namespaceResolver = new NamespaceResolver(parentResolver);
        // Case 1: prefix is found in namespaceMap
        String prefix = "prefix1";
        String uri = "uri1";
        namespaceMap.put(prefix, uri);
        assertEquals(uri, namespaceResolver.getExternallyRegisteredNamespaceURI(prefix));
        // Case 2: prefix is not found in namespaceMap, but found in parent
        prefix = "prefix2";
        uri = "uri2";
        when(parentResolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(uri);
        assertEquals(uri, namespaceResolver.getExternallyRegisteredNamespaceURI(prefix));
        // Case 3: prefix is not found in namespaceMap or parent
        prefix = "prefix3";
        assertNull(namespaceResolver.getExternallyRegisteredNamespaceURI(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetExternallyRegisteredNamespaceURI_1_fid2() throws Exception {
        namespaceMap = new HashMap<>();
        parentResolver = mock(NamespaceResolver.class);
        namespaceResolver = new NamespaceResolver(parentResolver);
        // Case 1: prefix is found in namespaceMap
        String prefix = "prefix1";
        String uri = "uri1";
        namespaceMap.put(prefix, uri);
        // Case 2: prefix is not found in namespaceMap, but found in parent
        prefix = "prefix2";
        uri = "uri2";
        when(parentResolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(uri);
        // Case 3: prefix is not found in namespaceMap or parent
        prefix = "prefix3";
        assertNull(uri);
    }
}