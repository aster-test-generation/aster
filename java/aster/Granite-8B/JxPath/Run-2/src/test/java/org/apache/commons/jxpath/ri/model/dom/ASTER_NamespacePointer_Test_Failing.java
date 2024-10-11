/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespacePointer_Test_Failing {
    private NamespacePointer namespacePointer;
    private DOMNodePointer parent;
    private String prefix;
    private String namespaceURI;
    @Mock
    private NamespacePointer namespacePointerMock;
    private NamespacePointer namespacepointer;
    @Mock
    Locale locale;
    @Mock
    KeywordVariables variables;
    @Mock
    QName name;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue() {
        namespacePointer = new NamespacePointer(parent, "prefix");
        // arrange
        final Object value = "new value";
        // act
        namespacePointer.setValue(value);
        // assert
        verify(parent, times(1)).setValue(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName() throws Exception {
        prefix = "examplePrefix";
        namespacepointer = new NamespacePointer(Mockito.mock(DOMNodePointer.class), prefix);
        Mockito.when(namespacepointer.getName()).thenReturn(new QName(prefix));
        Assertions.assertEquals(namespacepointer.getName(), new QName(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() {
        namespacepointer = new NamespacePointer(parent, prefix);
        when(parent.getNamespaceURI(prefix)).thenReturn("http://example.com");
        assertEquals("http://example.com", namespacepointer.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath3_PuZD2() {
        DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault());
        NamespacePointer namespacePointer = new NamespacePointer(parent, "prefix", "namespaceURI");
        String actual = namespacePointer.asPath();
        String expected = "/namespace::prefix";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() throws Exception {
        MockitoAnnotations.openMocks(this);
        namespacepointer = new NamespacePointer(parent, "prefix");
        Mockito.when(parent.getLength()).thenReturn(1);
        assertEquals(1, namespacepointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        MockitoAnnotations.openMocks(this);
        namespacepointer = new NamespacePointer(parent, "prefix");
        Mockito.when(parent.getBaseValue()).thenReturn("expectedValue");
        assertEquals("expectedValue", namespacepointer.getBaseValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers_fid1() {
        parent = mock(DOMNodePointer.class);
        prefix = "example";
        namespaceURI = "http://example.com";
        namespacePointer = new NamespacePointer(parent, prefix, namespaceURI);
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        when(pointer1.getNamespaceURI()).thenReturn("http://example.com");
        when(pointer2.getNamespaceURI()).thenReturn("http://other.com");
        int result = namespacePointer.compareChildNodePointers(pointer1, pointer2);
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_eaJl0_2() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, null, null), "prefix");
        QName name = namespacePointer.getName();
        assertEquals("prefix", name.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_BkSg1_fid1() {
        DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), "id");
        NamespacePointer namespacePointer = new NamespacePointer(parent, "prefix");
        String actual = namespacePointer.asPath();
        String expected = "/namespace::prefix";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_hNtF0_OqRp0_2_fid1() {
        NamespacePointer namespacePointer1 = new NamespacePointer(new DOMNodePointer(null, null, "id1"), "prefix1", "namespaceURI1");
        NamespacePointer namespacePointer2 = new NamespacePointer(new DOMNodePointer(null, null, "id2"), "prefix2", "namespaceURI2");
        assertTrue(namespacePointer1.compareChildNodePointers(namespacePointer1, namespacePointer2) < 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_hNtF0_OqRp0_3() {
        NamespacePointer namespacePointer1 = new NamespacePointer(new DOMNodePointer(null, null, "id1"), "prefix1", "namespaceURI1");
        NamespacePointer namespacePointer2 = new NamespacePointer(new DOMNodePointer(null, null, "id2"), "prefix2", "namespaceURI2");
        assertTrue(namespacePointer1.compareChildNodePointers(namespacePointer2, namespacePointer1) > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_eaJl0() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, null, null), "prefix");
        QName name = namespacePointer.getName();
        assertNotNull(name);
        assertEquals("prefix", name.getPrefix());
    }
}