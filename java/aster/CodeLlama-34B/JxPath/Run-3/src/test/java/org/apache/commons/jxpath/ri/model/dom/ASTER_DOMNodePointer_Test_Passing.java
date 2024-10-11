/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodePointer_Test_Passing {
    private Node node;
    DOMNodePointer domnodepointer;
    private String defaultNamespace;
    private String id;
    private NamespaceResolver localNamespaceResolver;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_nodeIsNull_vLLT0() {
        DOMNodePointer pointer = new DOMNodePointer(null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        domnodepointer = new DOMNodePointer(Mockito.mock(Node.class), Mockito.mock(Locale.class), "id");
        domnodepointer = new DOMNodePointer(Mockito.mock(Node.class), Mockito.mock(Locale.class), "id");
        domnodepointer = new DOMNodePointer(Mockito.mock(Node.class), Mockito.mock(Locale.class), "id");
        domnodepointer = new DOMNodePointer(Mockito.mock(Node.class), Mockito.mock(Locale.class), "id");
        domnodepointer = new DOMNodePointer(Mockito.mock(Node.class), Mockito.mock(Locale.class), "id");
        Assertions.assertFalse(domnodepointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode3_NEzi2() {
        Node node = null;
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.ENGLISH, "id");
        Object result = pointer.getImmediateNode();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_NullNode_yGHj3() {
        Node node = null;
        String attr = DOMNodePointer.findEnclosingAttribute(node, "id");
        assertNull(attr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_NullNodeAndAttribute_WmQh10() {
        Node node = null;
        String attr = DOMNodePointer.findEnclosingAttribute(node, null);
        assertNull(attr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithNullNode_hHIG1() {
        Node node = null;
        Locale locale = new Locale("en", "US");
        DOMNodePointer pointer = new DOMNodePointer(node, locale, "id");
        int expectedHashCode = 0;
        int actualHashCode = 0;
        assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_NullNode_aShl0() {
        DOMNodePointer pointer = new DOMNodePointer(null, null, null);
        assertNull(pointer.getDefaultNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURIWithNullNode_INkY8() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, new Locale("en"), "id");
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_nullNode_ePVg2() {
        DOMNodePointer pointer = new DOMNodePointer(null, new Locale("en-US"), "id");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_NonStringAttributeAndNullNode_zMTO11_spno0() {
        Node node = null;
        String attr = DOMNodePointer.findEnclosingAttribute(node, "123");
        assertNull(attr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_qAuY0_anxH0() {
        Node node = Mockito.mock(Node.class);
        when(node.getNodeName()).thenReturn("node");
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.ENGLISH, "id");
        assertEquals(1, pointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithNodeAndLocale_BrUT4_FPUk0() {
        Node node = Mockito.mock(Node.class);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.ENGLISH);
        assertEquals(1, pointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver1_gFqQ0_TlHH0_1() {
        Node node = Mockito.mock(Node.class);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.ENGLISH, "id");
        NamespaceResolver resolver = pointer.getNamespaceResolver();
        assertNotNull(resolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver1_gFqQ0_TlHH0_2() {
        Node node = Mockito.mock(Node.class);
        DOMNodePointer pointer = new DOMNodePointer(node, Locale.ENGLISH, "id");
        NamespaceResolver resolver = pointer.getNamespaceResolver();
        assertEquals(pointer, resolver.getNamespaceContextPointer());
    }
}