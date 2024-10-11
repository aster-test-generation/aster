/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespacePointer_Test_Passing {
    NamespacePointer namespacepointer;
    NodePointer parent;
    Locale locale;
    String prefix;
    String namespaceURI;
    private KeywordVariables variables;
    @Mock
    private QName name;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers() {
        parent = mock(NodePointer.class);
        locale = Locale.getDefault();
        prefix = "prefix";
        namespaceURI = "namespaceURI";
        namespacepointer = new NamespacePointer(parent, prefix, namespaceURI);
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        // Mock the behavior of the compareChildNodePointers method
        when(pointer1.getNamespaceURI()).thenReturn("namespaceURI1");
        when(pointer2.getNamespaceURI()).thenReturn("namespaceURI2");
        // Call the method under test
        int result = namespacepointer.compareChildNodePointers(pointer1, pointer2);
        // Assert the expected behavior
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_qKgu0() {
        NamespacePointer namespacePointer1 = new NamespacePointer(new DOMNodePointer(null, null, null), "prefix1", "namespaceURI1");
        NamespacePointer namespacePointer2 = new NamespacePointer(new DOMNodePointer(null, null, null), "prefix2", "namespaceURI2");
        int result = namespacePointer1.compareChildNodePointers(namespacePointer1, namespacePointer2);
        assertTrue(result < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_Xtsq0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null);
        namespacePointer.setValue(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() {
        namespacepointer = new NamespacePointer(parent, "prefix");
        when(parent.isCollection()).thenReturn(true);
        assertTrue(namespacepointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        parent = mock(DOMNodePointer.class);
        prefix = "examplePrefix";
        namespaceURI = "http://example.com";
        namespacepointer = new NamespacePointer(parent, prefix, namespaceURI);
        when(parent.getNamespaceURI()).thenReturn(namespaceURI);
        assertEquals(namespaceURI, namespacepointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_hVwd0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null);
        boolean result = namespacePointer.isCollection();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection2_Uncu1() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null, null);
        boolean result = namespacePointer.isCollection();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection3_UbcO2() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        boolean result = namespacePointer.isCollection();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection4_jnpD3() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix", "namespaceURI");
        boolean result = namespacePointer.isCollection();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_tUCJ0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, null);
        assert namespacePointer.testNode(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode2_iCto1() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, null);
        assert namespacePointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode3_CTSv2() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, null);
        assert namespacePointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode4_ahWR3() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, null);
        assert namespacePointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        prefix = "examplePrefix";
        namespacepointer = new NamespacePointer(null, prefix);
        assertEquals(prefix.hashCode(), namespacepointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_ohhW0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null);
        Object immediateNode = namespacePointer.getImmediateNode();
        assertEquals("NamespaceURI", immediateNode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_xmaq0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        assertEquals(1135347031l, namespacePointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        namespacepointer = new NamespacePointer(parent, prefix);
        // Mock the behavior of the parent object
        when(parent.getNamespaceURI(prefix)).thenReturn("expectedNamespaceURI");
        // Call the method under test
        String actualNamespaceURI = namespacepointer.getNamespaceURI();
        // Assert that the actual result matches the expected result
        assertEquals("expectedNamespaceURI", actualNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_KwSt0_1() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, null, null), "prefix");
        QName name = namespacePointer.getName();
        assertNotNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_KwSt0_2() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, null, null), "prefix");
        QName name = namespacePointer.getName();
        assertEquals("prefix", name.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        prefix = "examplePrefix";
        namespacepointer = new NamespacePointer(null, prefix);
        String expectedPath = "/namespace::examplePrefix";
        String actualPath = namespacepointer.asPath();
        assertEquals(expectedPath, actualPath);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullParentAndNullPrefix_kkuk0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null);
        String path = namespacePointer.asPath();
        assertEquals("/", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullParentAndNullPrefix_elnS1() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        NamespacePointer namespacePointer = new NamespacePointer(parent, null);
        String path = namespacePointer.asPath();
        assertEquals("/", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullParentAndNonNullPrefix_DwXc2() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        String path = namespacePointer.asPath();
        assertEquals("namespace::prefix", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullParentAndNonNullPrefix_dHLr3() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        NamespacePointer namespacePointer = new NamespacePointer(parent, "prefix");
        String path = namespacePointer.asPath();
        assertEquals("namespace::prefix", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_nTLC0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null);
        Object baseValue = namespacePointer.getBaseValue();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_azoS0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        boolean isLeaf = namespacePointer.isLeaf();
        assertTrue(isLeaf);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithParentAndPrefix_gdrh1() {
        DOMNodePointer parent = new DOMNodePointer(null, null, "id");
        NamespacePointer namespacePointer = new NamespacePointer(parent, "prefix");
        boolean isLeaf = namespacePointer.isLeaf();
        assertTrue(isLeaf);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithParentAndPrefixAndNamespaceURI_NaMq2() {
        DOMNodePointer parent = new DOMNodePointer(null, null, "id");
        NamespacePointer namespacePointer = new NamespacePointer(parent, "prefix", "namespaceURI");
        boolean isLeaf = namespacePointer.isLeaf();
        assertTrue(isLeaf);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_KwSt0() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, null, null), "prefix");
        QName name = namespacePointer.getName();
        assertNotNull(name);
        assertEquals("prefix", name.getPrefix());
    }
}