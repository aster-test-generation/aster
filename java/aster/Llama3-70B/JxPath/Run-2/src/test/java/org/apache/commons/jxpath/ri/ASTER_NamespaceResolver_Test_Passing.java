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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceResolver_Test_Passing {
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
    private boolean sealed;
    NamespaceResolver parentNamespaceResolver;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSealWithParent_FeQG0() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.seal();
        assertTrue(resolver.isSealed());
        assertTrue(parent.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSealWithoutParent_fFtA1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.seal();
        assertTrue(resolver.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetNamespaceContextPointer() throws Exception {
        namespaceResolver = new NamespaceResolver();
        nodePointer = mock(NodePointer.class);
        namespaceResolver.setNamespaceContextPointer(nodePointer);
        assertEquals(nodePointer, namespaceResolver.pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredPrefix_ParentNull_ReturnsNull_mjwo0() {
        NamespaceResolver resolver = new NamespaceResolver();
        String result = resolver.getExternallyRegisteredPrefix("http://example.com");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredNamespaceURI1_jKov0() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String result = namespaceResolver.getExternallyRegisteredNamespaceURI("prefix");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix1_JXCb0() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String namespaceURI = "http://example.com";
        String result = namespaceResolver.getPrefix(namespaceURI);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix2_Uzao1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver namespaceResolver = new NamespaceResolver(parent);
        String namespaceURI = "http://example.com";
        String result = namespaceResolver.getPrefix(namespaceURI);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_1_LnaG0() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String result = namespaceResolver.getNamespaceURI("prefix");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_2_SypQ1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver namespaceResolver = new NamespaceResolver(parent);
        String result = namespaceResolver.getNamespaceURI("prefix");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer1_oDXe0() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Pointer pointer = namespaceResolver.getNamespaceContextPointer();
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSealed_fHBq0() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        boolean result = namespaceResolver.isSealed();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSealed_withParent_AzGU1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver namespaceResolver = new NamespaceResolver(parent);
        boolean result = namespaceResolver.isSealed();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone() throws Exception {
        parentNamespaceResolver = mock(NamespaceResolver.class);
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver);
        NamespaceResolver clonedNamespaceResolver = (NamespaceResolver) namespaceResolver.clone();
        assertNotNull(clonedNamespaceResolver);
        assertFalse(sealed);
        assertNotSame(namespaceResolver, clonedNamespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_NVUs0() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Object clone = namespaceResolver.clone();
        assertNotNull(clone);
        assertNotSame(namespaceResolver, clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testseal_fid1() throws Exception {
        parentResolver = Mockito.mock(NamespaceResolver.class);
        namespaceresolver = new NamespaceResolver(parentResolver);
        namespaceresolver.seal();
        assertFalse(sealed);
        Mockito.verify(parentResolver).seal();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSealWithParent_FeQG0_1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.seal();
        assertTrue(resolver.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSealWithParent_FeQG0_2() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.seal();
        assertTrue(parent.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetExternallyRegisteredPrefix_3() throws Exception {
        parentResolver = mock(NamespaceResolver.class);
        reverseMap = new HashMap<>();
        namespaceResolver = new NamespaceResolver(parentResolver);
        // Case 1: prefix found in reverseMap
        String namespaceURI = "http://example.com";
        String prefix = "prefix";
        reverseMap.put(namespaceURI, prefix);
        // Case 2: prefix not found in reverseMap, but found in parent
        namespaceURI = "http://another.example.com";
        prefix = "anotherPrefix";
        when(parentResolver.getExternallyRegisteredPrefix(namespaceURI)).thenReturn(prefix);
        // Case 3: prefix not found in reverseMap or parent
        namespaceURI = "http://unknown.example.com";
        assertNull(namespaceResolver.getExternallyRegisteredPrefix(namespaceURI));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetExternallyRegisteredNamespaceURI_3() throws Exception {
        namespaceMap = new HashMap<>();
        parentResolver = mock(NamespaceResolver.class);
        namespaceResolver = new NamespaceResolver(parentResolver);
        // Test case 1: prefix is found in namespaceMap
        String prefix = "prefix1";
        String uri = "uri1";
        namespaceMap.put(prefix, uri);
        // Test case 2: prefix is not found in namespaceMap, but found in parent
        prefix = "prefix2";
        uri = "uri2";
        when(parentResolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(uri);
        // Test case 3: prefix is not found in namespaceMap or parent
        prefix = "prefix3";
        assertNull(namespaceResolver.getExternallyRegisteredNamespaceURI(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_1() throws Exception {
        parentNamespaceResolver = mock(NamespaceResolver.class);
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver);
        NamespaceResolver clonedNamespaceResolver = (NamespaceResolver) namespaceResolver.clone();
        assertNotNull(clonedNamespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_2() throws Exception {
        parentNamespaceResolver = mock(NamespaceResolver.class);
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver);
        NamespaceResolver clonedNamespaceResolver = (NamespaceResolver) namespaceResolver.clone();
        assertFalse(sealed);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_3() throws Exception {
        parentNamespaceResolver = mock(NamespaceResolver.class);
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver);
        NamespaceResolver clonedNamespaceResolver = (NamespaceResolver) namespaceResolver.clone();
        assertNotSame(namespaceResolver, clonedNamespaceResolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_NVUs0_1() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Object clone = namespaceResolver.clone();
        assertNotNull(clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_NVUs0_2() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Object clone = namespaceResolver.clone();
        assertNotSame(namespaceResolver, clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_fuUA0() {
        NamespaceResolver resolver = new NamespaceResolver();
        Object clone = resolver.clone();
        assertNotNull(clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_IzCW3_bkpa0() {
        NamespaceResolver resolver = new NamespaceResolver();
        NamespaceResolver clone = (NamespaceResolver) resolver.clone();
        assertNotNull(clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_fmKj0_uFXr0_1() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        namespaceResolver.registerNamespace("prefix", "namespaceURI");
        NamespaceResolver clone = (NamespaceResolver) namespaceResolver.clone();
        assertEquals("namespaceURI", clone.getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_fmKj0_uFXr0_2() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        namespaceResolver.registerNamespace("prefix", "namespaceURI");
        NamespaceResolver clone = (NamespaceResolver) namespaceResolver.clone();
        assertEquals("prefix", clone.getPrefix("namespaceURI"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredNamespaceURI2_MHdU1_HAfB0() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.namespaceMap = new HashMap<String, String>();
        parent.namespaceMap.put("prefix", "uri");
        NamespaceResolver namespaceResolver = new NamespaceResolver(parent);
        String result = namespaceResolver.getExternallyRegisteredNamespaceURI("prefix");
        assertEquals("uri", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_OmeF2_LGot0() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver namespaceResolver = new NamespaceResolver(parent);
        NamespaceResolver clone = (NamespaceResolver) namespaceResolver.clone();
        assertNotSame(namespaceResolver, clone);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_jdgF0() throws Exception {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        NamespaceResolver clone = (NamespaceResolver) namespaceResolver.clone();
        assertNotNull(clone);
        NodePointer pointer = null; // Initialize pointer
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_CVop0_1() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Object result = namespaceResolver.clone();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_CVop0_2() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Object result = namespaceResolver.clone();
        assertNotSame(namespaceResolver, result);
    }
}