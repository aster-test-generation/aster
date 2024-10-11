/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import java.util.Enumeration;
import javax.servlet.jsp.PageContext;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Enumeration;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PageContextHandler_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_emptyContext_vDXe0_1() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Enumeration<String> emptyEnumeration = new Vector<String>().elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_emptyContext_vDXe0_2() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Enumeration<String> emptyEnumeration = new Vector<String>().elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertEquals(0, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_singleScopeSingleAttribute_UHGE1_1() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> attributes = new Vector<>();
        attributes.add("attribute1");
        Enumeration<String> attributeEnumeration = attributes.elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(attributeEnumeration);
        Enumeration<String> emptyEnumeration = new Vector<String>().elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_singleScopeSingleAttribute_UHGE1_2() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> attributes = new Vector<>();
        attributes.add("attribute1");
        Enumeration<String> attributeEnumeration = attributes.elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(attributeEnumeration);
        Enumeration<String> emptyEnumeration = new Vector<String>().elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertEquals(1, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_singleScopeSingleAttribute_UHGE1_3() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> attributes = new Vector<>();
        attributes.add("attribute1");
        Enumeration<String> attributeEnumeration = attributes.elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(attributeEnumeration);
        Enumeration<String> emptyEnumeration = new Vector<String>().elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertEquals("attribute1", result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_multipleScopesMultipleAttributes_osVJ2_1() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> pageAttributes = new Vector<>();
        pageAttributes.add("pageAttribute");
        Vector<String> requestAttributes = new Vector<>();
        requestAttributes.add("requestAttribute");
        Vector<String> sessionAttributes = new Vector<>();
        sessionAttributes.add("sessionAttribute");
        Vector<String> applicationAttributes = new Vector<>();
        applicationAttributes.add("applicationAttribute");
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(pageAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(requestAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(sessionAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(applicationAttributes.elements());
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_multipleScopesMultipleAttributes_osVJ2_2() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> pageAttributes = new Vector<>();
        pageAttributes.add("pageAttribute");
        Vector<String> requestAttributes = new Vector<>();
        requestAttributes.add("requestAttribute");
        Vector<String> sessionAttributes = new Vector<>();
        sessionAttributes.add("sessionAttribute");
        Vector<String> applicationAttributes = new Vector<>();
        applicationAttributes.add("applicationAttribute");
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(pageAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(requestAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(sessionAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(applicationAttributes.elements());
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertEquals(4, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_multipleScopesMultipleAttributes_osVJ2_3() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> pageAttributes = new Vector<>();
        pageAttributes.add("pageAttribute");
        Vector<String> requestAttributes = new Vector<>();
        requestAttributes.add("requestAttribute");
        Vector<String> sessionAttributes = new Vector<>();
        sessionAttributes.add("sessionAttribute");
        Vector<String> applicationAttributes = new Vector<>();
        applicationAttributes.add("applicationAttribute");
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(pageAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(requestAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(sessionAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(applicationAttributes.elements());
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertArrayEquals(new String[]{"pageAttribute", "requestAttribute", "sessionAttribute", "applicationAttribute"}, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_duplicateAttributesAcrossScopes_RFjK3_1() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> attributes = new Vector<>();
        attributes.add("sharedAttribute");
        Enumeration<String> attributeEnumeration = attributes.elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(attributeEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_duplicateAttributesAcrossScopes_RFjK3_2() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> attributes = new Vector<>();
        attributes.add("sharedAttribute");
        Enumeration<String> attributeEnumeration = attributes.elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(attributeEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertEquals(1, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_duplicateAttributesAcrossScopes_RFjK3_3() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> attributes = new Vector<>();
        attributes.add("sharedAttribute");
        Enumeration<String> attributeEnumeration = attributes.elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(attributeEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertEquals("sharedAttribute", result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_emptyContext_vDXe0() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Enumeration<String> emptyEnumeration = new Vector<String>().elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertNotNull(result);
        assertEquals(0, result.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_singleScopeSingleAttribute_UHGE1() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> attributes = new Vector<>();
        attributes.add("attribute1");
        Enumeration<String> attributeEnumeration = attributes.elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(attributeEnumeration);
        Enumeration<String> emptyEnumeration = new Vector<String>().elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(emptyEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(emptyEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("attribute1", result[0]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_multipleScopesMultipleAttributes_osVJ2() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> pageAttributes = new Vector<>();
        pageAttributes.add("pageAttribute");
        Vector<String> requestAttributes = new Vector<>();
        requestAttributes.add("requestAttribute");
        Vector<String> sessionAttributes = new Vector<>();
        sessionAttributes.add("sessionAttribute");
        Vector<String> applicationAttributes = new Vector<>();
        applicationAttributes.add("applicationAttribute");
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(pageAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(requestAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(sessionAttributes.elements());
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(applicationAttributes.elements());
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertNotNull(result);
        assertEquals(4, result.length);
        assertArrayEquals(new String[]{"pageAttribute", "requestAttribute", "sessionAttribute", "applicationAttribute"}, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_duplicateAttributesAcrossScopes_RFjK3() {
        PageContext mockPageContext = org.mockito.Mockito.mock(PageContext.class);
        Vector<String> attributes = new Vector<>();
        attributes.add("sharedAttribute");
        Enumeration<String> attributeEnumeration = attributes.elements();
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.PAGE_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.REQUEST_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.SESSION_SCOPE)).thenReturn(attributeEnumeration);
        org.mockito.Mockito.when(mockPageContext.getAttributeNamesInScope(PageContext.APPLICATION_SCOPE)).thenReturn(attributeEnumeration);
        PageContextHandler handler = new PageContextHandler();
        String[] result = handler.getPropertyNames(mockPageContext);
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals("sharedAttribute", result[0]);
    }
}