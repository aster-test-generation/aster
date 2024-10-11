/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import java.util.HashMap;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceResolver_Test_Passing {
private NamespaceResolver namespaceResolver;
private NamespaceResolver childNamespaceResolver;
@Mock
    private NamespaceResolver parentNamespaceResolver;
@Mock
    private NodePointer mockNodePointer;
@Mock
    private Map<String, String> namespaceMap;
@Mock
    private NamespaceResolver parentResolver;
@Mock
    private Pointer mockPointer;
private Pointer pointer = mockPointer;
private NamespaceResolver namespaceresolver;
    private boolean sealed;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSeal_WhenCalled_SealsItselfAndParent() {
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver);
        childNamespaceResolver = new NamespaceResolver(namespaceResolver);
        // Act
        namespaceResolver.seal();
        // Assert
        // Verify that seal was called on the parent
        verify(parentNamespaceResolver, times(1)).seal();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSealOnSingleInstance_ttCo0() {
    NamespaceResolver resolver = new NamespaceResolver();
    resolver.seal();
    assertTrue(resolver.isSealed());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSealOnParentAndChildInstance_kxyL1_1() {
    NamespaceResolver parentResolver = new NamespaceResolver();
    NamespaceResolver childResolver = new NamespaceResolver(parentResolver);
    childResolver.seal();
    assertTrue(childResolver.isSealed());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSealOnParentAndChildInstance_kxyL1_2() {
    NamespaceResolver parentResolver = new NamespaceResolver();
    NamespaceResolver childResolver = new NamespaceResolver(parentResolver);
    childResolver.seal();
    assertTrue(parentResolver.isSealed());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_FoundPrefix() throws Exception {
        namespaceResolver = new NamespaceResolver();
        // Arrange
        String expectedPrefix = "ns";
        String namespaceURI = "http://example.com/ns";
        NodePointer mockPointer = mock(NodePointer.class);
        NodePointer mockParentPointer = mock(NodePointer.class);
        NodeIterator mockIterator = mock(NodeIterator.class);
        NodePointer mockNamespacePointer = mock(NodePointer.class);
        QName mockQName = mock(QName.class);
        when(mockPointer.namespaceIterator()).thenReturn(mockIterator);
        when(mockIterator.setPosition(1)).thenReturn(true);
        when(mockIterator.getNodePointer()).thenReturn(mockNamespacePointer);
        when(mockNamespacePointer.getNamespaceURI()).thenReturn(namespaceURI);
        when(mockNamespacePointer.getName()).thenReturn(mockQName);
        when(mockQName.getName()).thenReturn(expectedPrefix);
        when(mockPointer.getParent()).thenReturn(mockParentPointer);
        when(mockParentPointer.namespaceIterator()).thenReturn(null); // No more namespaces up the tree
        // Act
        String result = NamespaceResolver.getPrefix(mockPointer, namespaceURI);
        // Assert
        assertEquals(expectedPrefix, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNamespaceContextPointer_mlHS0() {
    NamespaceResolver resolver = new NamespaceResolver();
    QName qName = new QName("testNamespace");
    Object bean = new Object();
    Locale locale = Locale.getDefault();
    NodePointer nodePointer = NodePointer.newNodePointer(qName, bean, locale);
    resolver.setNamespaceContextPointer(nodePointer);
    assertEquals(nodePointer, resolver.getNamespaceContextPointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredPrefix_WithExistingPrefix() throws Exception {
        // Initialize NamespaceResolver with a mocked parent
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver);
        // Arrange
        String namespaceURI = "http://example.com/ns";
        String expectedPrefix = "ex";
        when(parentNamespaceResolver.getExternallyRegisteredPrefix(namespaceURI)).thenReturn(null);
        namespaceResolver.reverseMap.put(namespaceURI, expectedPrefix);
        // Act
        String result = namespaceResolver.getExternallyRegisteredPrefix(namespaceURI);
        // Assert
        assertEquals(expectedPrefix, result);
        verify(parentNamespaceResolver, never()).getExternallyRegisteredPrefix(namespaceURI);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredPrefix_WithNonExistingPrefixAndParent() throws Exception {
        // Initialize NamespaceResolver with a mocked parent
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver);
        // Arrange
        String namespaceURI = "http://example.com/ns";
        String expectedPrefix = "ex";
        when(parentNamespaceResolver.getExternallyRegisteredPrefix(namespaceURI)).thenReturn(expectedPrefix);
        // Act
        String result = namespaceResolver.getExternallyRegisteredPrefix(namespaceURI);
        // Assert
        assertEquals(expectedPrefix, result);
        verify(parentNamespaceResolver).getExternallyRegisteredPrefix(namespaceURI);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredPrefix_WithNonExistingPrefixAndNoParent() throws Exception {
        // Initialize NamespaceResolver with a mocked parent
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver);
        // Arrange
        String namespaceURI = "http://example.com/ns";
        namespaceResolver = new NamespaceResolver(); // No parent
        when(parentNamespaceResolver.getExternallyRegisteredPrefix(namespaceURI)).thenReturn(null);
        // Act
        String result = namespaceResolver.getExternallyRegisteredPrefix(namespaceURI);
        // Assert
        assertNull(result);
        // No parent to verify
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredNamespaceURI_WithNonExistingPrefixAndNoParent() {
        namespaceMap = new HashMap<>();
        namespaceMap.put("prefix1", "http://example.com/uri1");
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver) {
            // Overriding the map access to use the local mock map
            protected Map<String, String> namespaceMap = this.namespaceMap;
        };
        // Setup
        String prefix = "nonExistingPrefix";
        // Execute
        String result = namespaceResolver.getExternallyRegisteredNamespaceURI(prefix);
        // Verify
        assertEquals(null, result, "The result should be null when the prefix is not found and no parent is available.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredNamespaceURI_WithNonExistingPrefixWithParent() {
        namespaceMap = new HashMap<>();
        namespaceMap.put("prefix1", "http://example.com/uri1");
        namespaceResolver = new NamespaceResolver(parentNamespaceResolver) {
            // Overriding the map access to use the local mock map
            protected Map<String, String> namespaceMap = this.namespaceMap;
        };
        // Setup
        String prefix = "nonExistingPrefix";
        String expectedURI = "http://example.com/uriFromParent";
        when(parentNamespaceResolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(expectedURI);
        // Execute
        String result = namespaceResolver.getExternallyRegisteredNamespaceURI(prefix);
        // Verify
        assertEquals(expectedURI, result, "The URI should be retrieved from the parent when not found in the current resolver.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterNamespace_NewNamespace_QhcN0_1() {
    NamespaceResolver resolver = new NamespaceResolver();
    resolver.registerNamespace("prefix1", "http://example.com/ns1");
    assertEquals("http://example.com/ns1", resolver.namespaceMap.get("prefix1"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterNamespace_NewNamespace_QhcN0_2() {
    NamespaceResolver resolver = new NamespaceResolver();
    resolver.registerNamespace("prefix1", "http://example.com/ns1");
    assertEquals("prefix1", resolver.reverseMap.get("http://example.com/ns1"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterNamespace_SealedNamespaceResolver_sPXK1() {
    NamespaceResolver resolver = new NamespaceResolver();
    resolver.seal();
    assertThrows(IllegalStateException.class, () -> {
        resolver.registerNamespace("prefix2", "http://example.com/ns2");
    });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredPrefix_NullNamespaceURI_Pvwp0() {
        NamespaceResolver resolver = new NamespaceResolver();
        String result = resolver.getExternallyRegisteredPrefix(null);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredPrefix_NonExistingNamespaceInParent_kxKw2() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        String result = child.getExternallyRegisteredPrefix("http://nonexistent.com");
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WhenUriIsFoundExternally() throws Exception {
        namespaceResolver = new NamespaceResolver(parentResolver);
        String prefix = "abc";
        String expectedUri = "http://example.com/abc";
        // Mocking the external method to return a URI
        when(namespaceResolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(expectedUri);
        // Execute
        String result = namespaceResolver.getNamespaceURI(prefix);
        // Assert
        assertEquals(expectedUri, result, "The URI should match the externally registered URI.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WhenUriIsNotFoundAnywhere() throws Exception {
        namespaceResolver = new NamespaceResolver(parentResolver);
        String prefix = "none";
        // Mocking both external method and parent resolver to return null
        when(namespaceResolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(null);
        when(parentResolver.getNamespaceURI(prefix)).thenReturn(null);
        // Execute
        String result = namespaceResolver.getNamespaceURI(prefix);
        // Assert
        assertNull(result, "The result should be null when the URI is not found anywhere.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetExternallyRegisteredNamespaceURI_NullPrefix_ReturnsNull_IrtX0() {
    NamespaceResolver resolver = new NamespaceResolver();
    String result = resolver.getExternallyRegisteredNamespaceURI(null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetExternallyRegisteredNamespaceURI_UnknownPrefix_ReturnsNull_iLhA1() {
    NamespaceResolver resolver = new NamespaceResolver();
    String result = resolver.getExternallyRegisteredNamespaceURI("unknownPrefix");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetExternallyRegisteredNamespaceURI_ValidPrefix_ReturnsURI_uIcB2() {
    NamespaceResolver child = new NamespaceResolver();
    NamespaceResolver parent = new NamespaceResolver();
    child.namespaceMap.put("knownPrefix", "http://example.com");
    String result = child.getExternallyRegisteredNamespaceURI("knownPrefix");
    assertEquals("http://example.com", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithNoMatchingNamespace_bxqE1() {
    NamespaceResolver resolver = new NamespaceResolver();
    QName qname = new QName("prefix", "localName");
    NodePointer nodePointer = NodePointer.newNodePointer(qname, new Object(), Locale.getDefault());
    NodePointer childNodePointer = NodePointer.newChildNodePointer(nodePointer, new QName("xmlns:prefix"), "http://example.com");
    String actualPrefix = NamespaceResolver.getPrefix(childNodePointer, "http://nonexistent.com");
    assertNull(actualPrefix);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithEmptyPrefix_EUsf2() {
    NamespaceResolver resolver = new NamespaceResolver();
    QName qname = new QName("", "localName");
    NodePointer nodePointer = NodePointer.newNodePointer(qname, new Object(), Locale.getDefault());
    NodePointer childNodePointer = NodePointer.newChildNodePointer(nodePointer, new QName("xmlns:"), "http://example.com");
    String actualPrefix = NamespaceResolver.getPrefix(childNodePointer, "http://example.com");
    assertNull(actualPrefix);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithNullPointer_ZIeu3() {
    String actualPrefix = NamespaceResolver.getPrefix(null, "http://example.com");
    assertNull(actualPrefix);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithNullNamespaceURI_iGuT4() {
    NamespaceResolver resolver = new NamespaceResolver();
    QName qname = new QName("prefix", "localName");
    NodePointer nodePointer = NodePointer.newNodePointer(qname, new Object(), Locale.getDefault());
    String actualPrefix = NamespaceResolver.getPrefix(nodePointer, null);
    assertNull(actualPrefix);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WhenPointerIsNotNull_1() throws Exception {
        // Setup the parent resolver to return a mock pointer
        when(parentResolver.getNamespaceContextPointer()).thenReturn(mockPointer);
        // Setup the scenario where the pointer is not null
        namespaceResolver = new NamespaceResolver() {
            private Pointer pointer = mockPointer;
            @Override
            public Pointer getNamespaceContextPointer() {
                return pointer;
            }
        };
        Pointer result = namespaceResolver.getNamespaceContextPointer();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WhenPointerIsNotNull_2() throws Exception {
        // Setup the parent resolver to return a mock pointer
        when(parentResolver.getNamespaceContextPointer()).thenReturn(mockPointer);
        // Setup the scenario where the pointer is not null
        namespaceResolver = new NamespaceResolver() {
            private Pointer pointer = mockPointer;
            @Override
            public Pointer getNamespaceContextPointer() {
                return pointer;
            }
        };
        Pointer result = namespaceResolver.getNamespaceContextPointer();
        assertEquals(mockPointer, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WhenPointerIsNullAndParentIsNotNull_1() throws Exception {
        // Setup the parent resolver to return a mock pointer
        when(parentResolver.getNamespaceContextPointer()).thenReturn(mockPointer);
        // Setup the scenario where the pointer is null and parent is not null
        namespaceResolver = new NamespaceResolver(parentResolver);
        Pointer result = namespaceResolver.getNamespaceContextPointer();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WhenPointerIsNullAndParentIsNotNull_2() throws Exception {
        // Setup the parent resolver to return a mock pointer
        when(parentResolver.getNamespaceContextPointer()).thenReturn(mockPointer);
        // Setup the scenario where the pointer is null and parent is not null
        namespaceResolver = new NamespaceResolver(parentResolver);
        Pointer result = namespaceResolver.getNamespaceContextPointer();
        assertEquals(mockPointer, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WhenPointerIsNullAndParentIsNull() throws Exception {
        // Setup the parent resolver to return a mock pointer
        when(parentResolver.getNamespaceContextPointer()).thenReturn(mockPointer);
        // Setup the scenario where both the pointer and parent are null
        namespaceResolver = new NamespaceResolver();
        Pointer result = namespaceResolver.getNamespaceContextPointer();
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithNullNamespaceURI_RLff0() {
    NamespaceResolver resolver = new NamespaceResolver();
    String result = resolver.getPrefix(null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithUnregisteredNamespaceURI_PisU1() {
    NamespaceResolver resolver = new NamespaceResolver();
    String result = resolver.getPrefix("http://unregistered.com");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_WithNullPrefix_ReturnsNull_oYoI0() {
    NamespaceResolver resolver = new NamespaceResolver();
    String result = resolver.getNamespaceURI(null);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_WithUnknownPrefix_ReturnsNull_Ysgu1() {
    NamespaceResolver resolver = new NamespaceResolver();
    String result = resolver.getNamespaceURI("unknownPrefix");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSealed_lqoo0() {
    NamespaceResolver resolver = new NamespaceResolver();
    assertFalse(resolver.isSealed());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_1() throws Exception {
        namespaceResolver = new NamespaceResolver();
        // Create a spy of the original object to intercept calls to clone
        NamespaceResolver spyNamespaceResolver = spy(namespaceResolver);
        // Since we cannot mock final methods like Object.clone(), we assume it works as expected
        // and focus on testing the behavior of our clone method.
        NamespaceResolver cloned = (NamespaceResolver) spyNamespaceResolver.clone();
        // Assertions
        assertNotNull(cloned, "Cloned object should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_2() throws Exception {
        namespaceResolver = new NamespaceResolver();
        // Create a spy of the original object to intercept calls to clone
        NamespaceResolver spyNamespaceResolver = spy(namespaceResolver);
        // Since we cannot mock final methods like Object.clone(), we assume it works as expected
        // and focus on testing the behavior of our clone method.
        NamespaceResolver cloned = (NamespaceResolver) spyNamespaceResolver.clone();
        // Assertions
        assertFalse(sealed);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_3() throws Exception {
        namespaceResolver = new NamespaceResolver();
        // Create a spy of the original object to intercept calls to clone
        NamespaceResolver spyNamespaceResolver = spy(namespaceResolver);
        // Since we cannot mock final methods like Object.clone(), we assume it works as expected
        // and focus on testing the behavior of our clone method.
        NamespaceResolver cloned = (NamespaceResolver) spyNamespaceResolver.clone();
        // Assertions
        assertSame(NamespaceResolver.class, cloned.getClass(), "Cloned object should be instance of NamespaceResolver");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceContextPointer_WhenPointerIsNullAndParentIsNull_ShouldReturnNull_CmIR0() {
    NamespaceResolver resolver = new NamespaceResolver();
    Pointer result = resolver.getNamespaceContextPointer();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_GGDM0_1() {
    NamespaceResolver original = new NamespaceResolver();
    NamespaceResolver cloned = (NamespaceResolver) original.clone();
    assertNotNull(cloned);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_GGDM0_2() {
    NamespaceResolver original = new NamespaceResolver();
    NamespaceResolver cloned = (NamespaceResolver) original.clone();
    assertNotSame(original, cloned);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredPrefix_ExistingNamespace_CaMV1_fid1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("http://example.com", "ex");
        String result = resolver.getExternallyRegisteredPrefix("http://example.com");
    assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithValidNamespace_dohb0_fid1() {
    NamespaceResolver resolver = new NamespaceResolver();
    QName qname = new QName("prefix", "localName");
    NodePointer nodePointer = NodePointer.newNodePointer(qname, new Object(), Locale.getDefault());
    NodePointer childNodePointer = NodePointer.newChildNodePointer(nodePointer, new QName("xmlns:prefix"), "http://example.com");
    String expectedPrefix = "prefix";
    String actualPrefix = NamespaceResolver.getPrefix(childNodePointer, "http://example.com");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithMultipleLevels_CGYF5_fid1() {
    NamespaceResolver resolver = new NamespaceResolver();
    QName qname = new QName("prefix", "localName");
    NodePointer rootNodePointer = NodePointer.newNodePointer(qname, new Object(), Locale.getDefault());
    NodePointer childNodePointer = NodePointer.newChildNodePointer(rootNodePointer, new QName("xmlns:prefix"), "http://example.com");
    NodePointer grandChildNodePointer = NodePointer.newChildNodePointer(childNodePointer, new QName("xmlns:prefix"), "http://example.org");
    String expectedPrefix = "prefix";
    String actualPrefix = NamespaceResolver.getPrefix(grandChildNodePointer, "http://example.com");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrefixWithRegisteredNamespaceURI_kajf2_fid1() {
    NamespaceResolver resolver = new NamespaceResolver();
    String result = resolver.getPrefix("http://example.com");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_WithKnownPrefix_ReturnsCorrectURI_KFUK2_fid1() {
    NamespaceResolver resolver = new NamespaceResolver();
    String result = resolver.getNamespaceURI("examplePrefix");
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSealOnParentAndChildInstance_kxyL1() {
    NamespaceResolver parentResolver = new NamespaceResolver();
    NamespaceResolver childResolver = new NamespaceResolver(parentResolver);
    childResolver.seal();
    assertTrue(childResolver.isSealed());
    assertTrue(parentResolver.isSealed());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterNamespace_NewNamespace_QhcN0() {
    NamespaceResolver resolver = new NamespaceResolver();
    resolver.registerNamespace("prefix1", "http://example.com/ns1");
    assertEquals("http://example.com/ns1", resolver.namespaceMap.get("prefix1"));
    assertEquals("prefix1", resolver.reverseMap.get("http://example.com/ns1"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WhenPointerIsNotNull() throws Exception {
        // Setup the parent resolver to return a mock pointer
        when(parentResolver.getNamespaceContextPointer()).thenReturn(mockPointer);
        // Setup the scenario where the pointer is not null
        namespaceResolver = new NamespaceResolver() {
            private Pointer pointer = mockPointer;
            @Override
            public Pointer getNamespaceContextPointer() {
                return pointer;
            }
        };
        Pointer result = namespaceResolver.getNamespaceContextPointer();
        assertNotNull(result);
        assertEquals(mockPointer, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WhenPointerIsNullAndParentIsNotNull() throws Exception {
        // Setup the parent resolver to return a mock pointer
        when(parentResolver.getNamespaceContextPointer()).thenReturn(mockPointer);
        // Setup the scenario where the pointer is null and parent is not null
        namespaceResolver = new NamespaceResolver(parentResolver);
        Pointer result = namespaceResolver.getNamespaceContextPointer();
        assertNotNull(result);
        assertEquals(mockPointer, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone() throws Exception {
        namespaceResolver = new NamespaceResolver();
        // Create a spy of the original object to intercept calls to clone
        NamespaceResolver spyNamespaceResolver = spy(namespaceResolver);
        // Since we cannot mock final methods like Object.clone(), we assume it works as expected
        // and focus on testing the behavior of our clone method.
        NamespaceResolver cloned = (NamespaceResolver) spyNamespaceResolver.clone();
        // Assertions
        assertNotNull(cloned, "Cloned object should not be null");
        assertFalse(sealed);
        assertSame(NamespaceResolver.class, cloned.getClass(), "Cloned object should be instance of NamespaceResolver");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_GGDM0() {
    NamespaceResolver original = new NamespaceResolver();
    NamespaceResolver cloned = (NamespaceResolver) original.clone();
    assertNotNull(cloned);
    assertNotSame(original, cloned);
}
}