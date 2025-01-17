/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathContextFactory;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathServletContexts_Coverage_Test_Failing {
    private HttpSession mockHttpSession;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_SetVariables_XEvq2() {
        PageContext mockPageContext = mock(PageContext.class);
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        ServletContext mockServletContext = mock(ServletContext.class);
        JXPathContext mockParentContext = mock(JXPathContext.class);
        JXPathContext mockContext = mock(JXPathContext.class);
        JXPathContextFactory factory = mock(JXPathContextFactory.class);
        when(mockPageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(mockPageContext.getRequest()).thenReturn(mockRequest);
        when(mockPageContext.getServletContext()).thenReturn(mockServletContext);
        when(JXPathServletContexts.getRequestContext(mockRequest, mockServletContext)).thenReturn(mockParentContext);
        when(factory.newContext(mockParentContext, mockPageContext)).thenReturn(mockContext);
        JXPathContext result = JXPathServletContexts.getPageContext(mockPageContext);
        verify(mockContext).setVariables(any(KeywordVariables.class));
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_NullParentContext_loMZ3() {
        PageContext mockPageContext = mock(PageContext.class);
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        ServletContext mockServletContext = mock(ServletContext.class);
        when(mockPageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(mockPageContext.getRequest()).thenReturn(mockRequest);
        when(mockPageContext.getServletContext()).thenReturn(mockServletContext);
        when(JXPathServletContexts.getRequestContext(mockRequest, mockServletContext)).thenReturn(null);
        JXPathContext result = JXPathServletContexts.getPageContext(mockPageContext);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_ContextIsNull_CreateNewContext_IzLW1_CKfi0() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    JXPathContext newContext = mock(JXPathContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    when(JXPathContext.newContext(parentContext, handle)).thenReturn(newContext);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    verify(session).getAttribute(Constants.JXPATH_CONTEXT);
    verify(session).setAttribute(Constants.JXPATH_CONTEXT, newContext);
    assertSame(newContext, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_SetVariables_xCtU2_unBo0() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    JXPathContext newContext = mock(JXPathContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    when(JXPathContext.newContext(parentContext, handle)).thenReturn(newContext);
    JXPathServletContexts.getSessionContext(session, servletContext);
    verify(newContext).setVariables(any(KeywordVariables.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_SetAttributeInSession_ZwFS5_crFi0() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    JXPathContext newContext = mock(JXPathContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    when(JXPathContext.newContext(parentContext, handle)).thenReturn(newContext);
    JXPathServletContexts.getSessionContext(session, servletContext);
    verify(session).setAttribute(Constants.JXPATH_CONTEXT, newContext);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_CreateNewContext_Nvab4_smqm0() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    JXPathContext newContext = mock(JXPathContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    when(JXPathContext.newContext(parentContext, handle)).thenReturn(newContext);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    verify(JXPathContext.newContext(parentContext, handle));
    assertSame(newContext, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_ContextIsNull_CreateNewContext_IzLW1_CKfi0_fid1() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    JXPathContext newContext = mock(JXPathContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    when(JXPathContext.newContext(parentContext, handle)).thenReturn(newContext); // Corrected the static method call
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    verify(session).getAttribute(Constants.JXPATH_CONTEXT);
    verify(session).setAttribute(Constants.JXPATH_CONTEXT, newContext);
    assertSame(newContext, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_NewContext_oTYt0() {
        PageContext mockPageContext = mock(PageContext.class);
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        ServletContext mockServletContext = mock(ServletContext.class);
        JXPathContext mockParentContext = mock(JXPathContext.class);
        JXPathContext mockContext = mock(JXPathContext.class);
        JXPathContextFactory factory = mock(JXPathContextFactory.class);
        when(mockPageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(mockPageContext.getRequest()).thenReturn(mockRequest);
        when(mockPageContext.getServletContext()).thenReturn(mockServletContext);
        when(JXPathServletContexts.getRequestContext(mockRequest, mockServletContext)).thenReturn(mockParentContext);
        when(factory.newContext(mockParentContext, mockPageContext)).thenReturn(mockContext);
        JXPathContext result = JXPathServletContexts.getPageContext(mockPageContext);
        verify(mockPageContext).setAttribute(Constants.JXPATH_CONTEXT, mockContext);
        assertNotNull(result);
        assertEquals(mockContext, result);
    }
}