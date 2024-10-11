/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.*;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.apache.commons.jxpath.servlet.PageContextHandler;
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
public class Aster_DynamicPropertyPointer_Test_Passing {
    private DynamicPropertyHandler handler;
    private DynamicPropertyPointer dynamicpropertypointer;
    @Mock
    private PageContextHandler pageContextHandler;
    @Mock
    private KeywordVariables keywordVariables;
    @Mock
    private QName qName;
    private String[] names;
    private String name;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private KeywordVariables variables;
    private JXPathContext context;
    private Object value;
    @Mock
    private Locale locale;
    @Mock
    private JXPathContextReferenceImpl parentContext;
    @Mock
    private Object contextBean;
    @Mock
    private NodePointer contextPointer;
    @Mock
    private Variables vars;
    @Mock
    private IdentityManager idManager;
    @Mock
    private AbstractFactory factory;
    @Mock
    private ExceptionHandler exceptionHandler;
    @Mock
    private Functions functions;
    @Mock
    private KeyManager keyManager;
    @Mock
    private Pointer namespaceContextPointer;
    @Mock
    private Pointer pointer;
    @Mock
    private NodeSet nodeSet;
    @Mock
    private Iterator iterator;
    @Mock
    private CompiledExpression compiledExpression;
    @Mock
    private NamespaceResolver namespaceResolver;
    @Mock
    private NodePointer parentPointer;
    @Mock
    private NodePointer immediateParentPointer;
    @Mock
    private NodePointer immediateValuePointer;
    @Mock
    private Pointer pointerById;
    @Mock
    private Pointer pointerByKey;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private Object baseValue;
    @Mock
    private Object rootNode;
    @Mock
    private Object immediateNode;
    @Mock
    private Object nodeValue;
    @Mock
    private String namespaceURI;
    @Mock
    private String prefix;
    @Mock
    private String qualifiedName;
    @Mock
    private String key;
    @Mock
    private Object object;
    @Mock
    private DynamicPropertyHandler handlerMock;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        handler = mock(DynamicPropertyHandler.class);
        dynamicpropertypointer = new DynamicPropertyPointer(null, handler);
        // Mock the behavior of the handler's getProperty method
        when(handler.getProperty(any(), anyString())).thenReturn("expected value");
        // Call the getImmediateNode method and assert the result
        Object value = dynamicpropertypointer.getImmediateNode();
        assertEquals("expected value", value);
        // Verify that the handler's getProperty method was called with the correct arguments
        verify(handler).getProperty(any(), anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_RLZC0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        VariablePointer variablePointer = new VariablePointer(null, null);
        PageContextHandler pageContextHandler = new PageContextHandler();
        KeywordVariables keywordVariables = new KeywordVariables(null, null);
        QName qName = new QName(null, null);
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        Object value1 = dynamicPropertyPointer.getImmediateNode();
        Object value2 = dynamicPropertyPointer.getImmediateNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove() throws Exception {
        handler = mock(DynamicPropertyHandler.class);
        dynamicpropertypointer = new DynamicPropertyPointer(null, handler);
        // Set up expectations
        when(handler.getProperty(any(), any())).thenReturn(null);
        // Call the method under test
        dynamicpropertypointer.remove();
        // Verify that the expected method was called
        verify(handler).setProperty(any(), any(), any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_nRVe0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        domNodePointer.remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove2_zmxF1() {
        VariablePointer variablePointer = new VariablePointer(null, null);
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        DOMNodePointer domNodePointer2 = new DOMNodePointer(variablePointer, null);
        domNodePointer2.remove();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath3_Chov2() {
        VariablePointer parent = new VariablePointer(mock(QName.class));
        PageContextHandler handler = new PageContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
        assertEquals("/.[@name='']", dynamicPropertyPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath4_CGPA3() {
        VariablePointer parent = new VariablePointer(mock(KeywordVariables.class), mock(QName.class));
        PageContextHandler handler = new PageContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
        assertEquals("/.[@name='']", dynamicPropertyPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyNames() throws Exception {
        dynamicpropertypointer = new DynamicPropertyPointer(null, handlerMock);
        // Mock the behavior of the handler
        when(handlerMock.getPropertyNames(any())).thenReturn(new String[]{"property1", "property2", "property3"});
        // Call the method under test
        names = dynamicpropertypointer.getPropertyNames();
        // Assert that the method returns the expected array of property names
        assertArrayEquals(new String[]{"property1", "property2", "property3"}, names);
        // Verify that the handler's getPropertyNames method was called with the correct argument
        verify(handlerMock).getPropertyNames(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_jFge0() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        PageContextHandler handler = new PageContextHandler();
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
        String[] propertyNames = dynamicPropertyPointer.getPropertyNames();
        assertNotNull(propertyNames);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithNullHandler_dTAy3_1() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        PageContextHandler handler = null;
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
        String[] propertyNames = dynamicPropertyPointer.getPropertyNames();
        assertNotNull(propertyNames);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithNullHandler_dTAy3_2() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        PageContextHandler handler = null;
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
        String[] propertyNames = dynamicPropertyPointer.getPropertyNames();
        assertEquals(0, propertyNames.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyIndex1_brlA0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        VariablePointer variablePointer = new VariablePointer(null, null);
        PageContextHandler pageContextHandler = new PageContextHandler();
        KeywordVariables keywordVariables = new KeywordVariables(null, null);
        QName qName = new QName(null, null);
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        dynamicPropertyPointer.setPropertyIndex(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyIndex2_jrLo1() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        VariablePointer variablePointer = new VariablePointer(null, null);
        PageContextHandler pageContextHandler = new PageContextHandler();
        KeywordVariables keywordVariables = new KeywordVariables(null, null);
        QName qName = new QName(null, null);
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        dynamicPropertyPointer.setPropertyIndex(2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualProperty_lbwl0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        VariablePointer variablePointer = new VariablePointer(null, null);
        PageContextHandler pageContextHandler = new PageContextHandler();
        KeywordVariables keywordVariables = new KeywordVariables(null, null);
        QName qName = new QName(null, null);
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        boolean actual = dynamicPropertyPointer.isActualProperty();
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_Lrgj0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        VariablePointer variablePointer = new VariablePointer(null, null);
        PageContextHandler pageContextHandler = new PageContextHandler();
        KeywordVariables keywordVariables = new KeywordVariables(null, null);
        QName qName = new QName(null, null);
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        int propertyCount = dynamicPropertyPointer.getPropertyCount();
        assertEquals(0, propertyCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithNullHandler_dTAy3() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        PageContextHandler handler = null;
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
        String[] propertyNames = dynamicPropertyPointer.getPropertyNames();
        assertNotNull(propertyNames);
        assertEquals(0, propertyNames.length);
    }
}