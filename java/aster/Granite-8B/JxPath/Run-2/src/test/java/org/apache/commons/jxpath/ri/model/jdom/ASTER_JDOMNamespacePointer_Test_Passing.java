/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ExceptionHandler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNamespacePointer_Test_Passing {
    private static final Locale LOCALE = Locale.ENGLISH;
    private static final String PREFIX = "prefix";
    private static final String NAMESPACE_URI = "namespaceURI";
    private static final String KEY = "key";
    private static final String VALUE = "value";
    private static final String ID = "id";
    private static final String QUALIFIED_NAME = "qualifiedName";
    private static final String NODE_NAME = "nodeName";
    private static final String NODE_VALUE = "nodeValue";
    private static final int INDEX = 0;
    private static final NodePointer PARENT = mock(NodePointer.class);
    private static final NodePointer VALUE_POINTER = mock(NodePointer.class);
    private static final NamespaceResolver NAMESPACE_RESOLVER = mock(NamespaceResolver.class);
    private static final ExceptionHandler EXCEPTION_HANDLER = mock(ExceptionHandler.class);
    private static final Locale LOCALE_2 = mock(Locale.class);
    private static final NodePointer NODE_POINTER = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_2 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_3 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_4 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_5 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_6 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_7 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_8 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_9 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_10 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_11 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_12 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_13 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_14 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_15 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_16 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_17 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_18 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_19 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_20 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_21 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_22 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_23 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_24 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_25 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_26 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_27 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_28 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_29 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_30 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_31 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_32 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_33 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_34 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_35 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_36 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_37 = mock(NodePointer.class);
    private static final NodePointer NODE_POINTER_38 = mock(NodePointer.class);
    private String prefix;
    private JDOMNamespacePointer jdomnamespacepointer;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private static final VariablePointer VARIABLE_POINTER = mock(VariablePointer.class);
    private static final QName QNAME = mock(QName.class);
    private Locale locale;
    @Mock
    private KeywordVariables variables;
    @Mock
    private QName name;
    @Mock
    private QName qName;
    private static final String KEYWORD = "keyword";
    private static final Object OBJECT = new Object();
    private static final DOMNodePointer PARENT_DOM_NODE_POINTER = mock(DOMNodePointer.class);
    private static final DOMNodePointer DOM_NODE_POINTER = mock(DOMNodePointer.class);
    private static final JDOMNamespacePointer JDOM_NAMESPACE_POINTER = new JDOMNamespacePointer(PARENT_DOM_NODE_POINTER, PREFIX, NAMESPACE_URI);

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals() throws Exception {
        prefix = "examplePrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test when object is the same instance
        assertTrue(jdomnamespacepointer.equals(jdomnamespacepointer));
        // Test when object is not null and is a JDOMNamespacePointer
        JDOMNamespacePointer otherJDOMNamespacePointer = new JDOMNamespacePointer(null, prefix);
        assertTrue(jdomnamespacepointer.equals(otherJDOMNamespacePointer));
        // Test when object is not null but is not a JDOMNamespacePointer
        assertFalse(jdomnamespacepointer.equals(new Object()));
        // Test when object is null
        assertFalse(jdomnamespacepointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue() throws Exception {
        jdomnamespacepointer = new JDOMNamespacePointer(parent, "prefix", "namespaceURI");
        // arrange
        String value = "new value";
        // act
        jdomnamespacepointer.setValue(value);
        // assert
        verify(parent, times(1)).setValue(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_hLHB0() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, null);
        try {
            jDOMNamespacePointer.setValue(null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue2_uJVM1() {
        KeywordVariables keywordVariables = new KeywordVariables(null, null);
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, null, null);
        try {
            jDOMNamespacePointer.setValue(keywordVariables);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() {
        jdomnamespacepointer = new JDOMNamespacePointer(PARENT, PREFIX, NAMESPACE_URI);
        when(jdomnamespacepointer.isCollection()).thenReturn(true);
        assertTrue(jdomnamespacepointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_mpkW0() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, null);
        assertFalse(jDOMNamespacePointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() {
        jdomnamespacepointer = new JDOMNamespacePointer(parent, "prefix");
        when(parent.getNamespaceURI()).thenReturn("namespaceURI");
        assertEquals("namespaceURI", jdomnamespacepointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        prefix = "test";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        assertEquals(prefix.hashCode(), jdomnamespacepointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_yLEG0() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix");
        assertEquals(113, jDOMNamespacePointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName() throws Exception {
        prefix = "examplePrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        when(jdomnamespacepointer.getName()).thenReturn(new QName(prefix));
        assertEquals(new QName(prefix), jdomnamespacepointer.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_LHIT0() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix");
        QName name = jDOMNamespacePointer.getName();
        assertNotNull(name);
        assertEquals("prefix", name.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        when(parent.getNamespaceURI(prefix)).thenReturn("namespaceURI");
        assertEquals("namespaceURI", jdomnamespacepointer.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_gIub0() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, null);
        String namespaceURI = jDOMNamespacePointer.getNamespaceURI();
        assertEquals("", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_Gial1() {
        VariablePointer variablePointer = new VariablePointer(null, null);
        KeywordVariables keywordVariables = new KeywordVariables("", null);
        DOMNodePointer domNodePointer = new DOMNodePointer(variablePointer, null);
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(domNodePointer, "");
        String namespaceURI = jDOMNamespacePointer.getNamespaceURI();
        assertEquals("", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        parent = mock(DOMNodePointer.class);
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        when(parent.asPath()).thenReturn("path/to/parent");
        String result = jdomnamespacepointer.asPath();
        assertEquals("path/to/parent/namespace::" + prefix, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLength_ajhm0() {
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(null, null);
        assertEquals(1, pointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_gyvE0() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix");
        Object baseValue = jDOMNamespacePointer.getBaseValue();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue2_QyKt1() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix", "namespaceURI");
        Object baseValue = jDOMNamespacePointer.getBaseValue();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_rKYE0() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, null);
        assertTrue(jDOMNamespacePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1() throws Exception {
        prefix = "examplePrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test when object is the same instance
        // Test when object is not null and is a JDOMNamespacePointer
        JDOMNamespacePointer otherJDOMNamespacePointer = new JDOMNamespacePointer(null, prefix);
        // Test when object is not null but is not a JDOMNamespacePointer
        // Test when object is null
        assertTrue(jdomnamespacepointer.equals(jdomnamespacepointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2() throws Exception {
        prefix = "examplePrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test when object is the same instance
        // Test when object is not null and is a JDOMNamespacePointer
        JDOMNamespacePointer otherJDOMNamespacePointer = new JDOMNamespacePointer(null, prefix);
        // Test when object is not null but is not a JDOMNamespacePointer
        // Test when object is null
        assertTrue(jdomnamespacepointer.equals(otherJDOMNamespacePointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_3() throws Exception {
        prefix = "examplePrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test when object is the same instance
        // Test when object is not null and is a JDOMNamespacePointer
        JDOMNamespacePointer otherJDOMNamespacePointer = new JDOMNamespacePointer(null, prefix);
        // Test when object is not null but is not a JDOMNamespacePointer
        // Test when object is null
        assertFalse(jdomnamespacepointer.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_4() throws Exception {
        prefix = "examplePrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test when object is the same instance
        // Test when object is not null and is a JDOMNamespacePointer
        JDOMNamespacePointer otherJDOMNamespacePointer = new JDOMNamespacePointer(null, prefix);
        // Test when object is not null but is not a JDOMNamespacePointer
        // Test when object is null
        assertFalse(jdomnamespacepointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_LHIT0_1() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix");
        QName name = jDOMNamespacePointer.getName();
        assertNotNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_LHIT0_2() {
        JDOMNamespacePointer jDOMNamespacePointer = new JDOMNamespacePointer(null, "prefix");
        QName name = jDOMNamespacePointer.getName();
        assertEquals("prefix", name.getPrefix());
    }
}