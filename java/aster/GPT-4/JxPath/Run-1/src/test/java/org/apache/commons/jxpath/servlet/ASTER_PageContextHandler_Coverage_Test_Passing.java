/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import java.util.Enumeration;
import javax.servlet.jsp.PageContext;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Enumeration;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PageContextHandler_Coverage_Test_Passing {
    private Enumeration<String> emptyEnumeration() {
        return new Vector<String>().elements();
    }
    private Enumeration<String> enumerationOf(String... elements) {
        Vector<String> vector = new Vector<>();
        for (String element : elements) {
            vector.add(element);
        }
        return vector.elements();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProperty_OiTR0() {
        PageContext mockPageContext = mock(PageContext.class);
        String property = "testAttribute";
        Object expectedValue = new Object();
        when(mockPageContext.findAttribute(property)).thenReturn(expectedValue);
        PageContextHandler handler = new PageContextHandler();
        Object result = handler.getProperty(mockPageContext, property);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyValidInputs_ToXr0() {
        PageContext mockPageContext = mock(PageContext.class);
        PageContextHandler handler = new PageContextHandler();
        String property = "testProperty";
        String value = "testValue";
        handler.setProperty(mockPageContext, property, value);
        verify(mockPageContext).setAttribute(property, value, PageContext.PAGE_SCOPE);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithEmptyScopes_ZJwp0() {
        PageContext mockPageContext = mock(PageContext.class);
        when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration());
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertArrayEquals(new String[]{}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithPageScopeAttributes_sfIt1() {
        PageContext mockPageContext = mock(PageContext.class);
        when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(enumerationOf("attr1", "attr2"));
        when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration());
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertArrayEquals(new String[]{"attr1", "attr2"}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithRequestScopeAttributes_ZIDL2() {
        PageContext mockPageContext = mock(PageContext.class);
        when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(enumerationOf("attr3"));
        when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration());
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertArrayEquals(new String[]{"attr3"}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithSessionScopeAttributes_PkrU3() {
        PageContext mockPageContext = mock(PageContext.class);
        when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(enumerationOf("attr4", "attr5"));
        when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration());
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertArrayEquals(new String[]{"attr4", "attr5"}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithApplicationScopeAttributes_uYuD4() {
        PageContext mockPageContext = mock(PageContext.class);
        when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration());
        when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(enumerationOf("attr6"));
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertArrayEquals(new String[]{"attr6"}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesWithAllScopesAttributes_ttOt5() {
        PageContext mockPageContext = mock(PageContext.class);
        when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(enumerationOf("attr1", "attr2"));
        when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(enumerationOf("attr3"));
        when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(enumerationOf("attr4", "attr5"));
        when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(enumerationOf("attr6"));
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertArrayEquals(new String[]{"attr1", "attr2", "attr3", "attr4", "attr5", "attr6"}, result);
    }
}