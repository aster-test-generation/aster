/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import org.apache.commons.jxpath.JXPathContext;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPathServletContexts_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetApplicationContext_ContextNotNull_BDRx1() throws Exception {
        ServletContext servletContext = mock(ServletContext.class);
        JXPathContext context = mock(JXPathContext.class);
        servletContext.setAttribute(Constants.JXPATH_CONTEXT, context);
        JXPathServletContexts factory = new JXPathServletContexts();
        JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
        verify(servletContext).getAttribute(Constants.JXPATH_CONTEXT);
        assertEquals(context, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetApplicationContext_ContextNull_ThrowsException_PeFl3() throws Exception {
        ServletContext servletContext = mock(ServletContext.class);
        JXPathContext context = null;
        JXPathServletContexts factory = new JXPathServletContexts();
        try {
            JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("context", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParentContext_Zfue2() {
        ServletContext servletContext = mock(ServletContext.class);
        JXPathContext parentContext = mock(JXPathContext.class);
        JXPathContext context = JXPathServletContexts.getSessionContext(null, servletContext);
        assertEquals(parentContext, context);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariables_fucb4() {
        ServletContext servletContext = mock(ServletContext.class);
        HttpSession session = mock(HttpSession.class);
        JXPathContext context = JXPathServletContexts.getSessionContext(session, servletContext);
        Map<String, Object> variables = new HashMap<>();
        variables.put(Constants.SESSION_SCOPE, new HttpSessionAndServletContext(session, servletContext));
        assertEquals(variables, context.getVariables());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReturnContext_mxKN7() {
        ServletContext servletContext = mock(ServletContext.class);
        HttpSession session = mock(HttpSession.class);
        JXPathContext context = JXPathServletContexts.getSessionContext(session, servletContext);
        assertEquals(context, JXPathServletContexts.getSessionContext(session, servletContext));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReturnNull_cgRN8() {
        ServletContext servletContext = mock(ServletContext.class);
        HttpSession session = mock(HttpSession.class);
        JXPathContext context = JXPathServletContexts.getSessionContext(null, servletContext);
        assertNull(context);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_PageContextDoesNotHaveJXPathContext_Mizv1() {
        PageContext pageContext = mock(PageContext.class);
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_ContextIsSetToPageContext_lSeB7() {
        PageContext pageContext = mock(PageContext.class);
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
        verify(pageContext).setAttribute(Constants.JXPATH_CONTEXT, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_ContextIsReturned_XgeE8() {
        PageContext pageContext = mock(PageContext.class);
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
        assertEquals(result, JXPathServletContexts.getPageContext(pageContext));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_ContextIsSetToNull_gDfX10() {
        PageContext pageContext = mock(PageContext.class);
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
        verify(pageContext, never()).setAttribute(Constants.JXPATH_CONTEXT, null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_PageContextHasJXPathContext_MPHE0_VCdz0() {
    PageContext pageContext = mock(PageContext.class);
    JXPathContext jxpathContext = mock(JXPathContext.class);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(jxpathContext);
    JXPathContext result = JXPathServletContexts.getRequestContext(null, null);
    assertEquals(jxpathContext, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_ContextIsNotSetToNull_ZPCG9_KIOv0() {
    PageContext pageContext = mock(PageContext.class);
    JXPathContext context = mock(JXPathContext.class);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(context);
    JXPathContext result = JXPathServletContexts.getRequestContext(null, null);
    verify(pageContext, never()).setAttribute(Constants.JXPATH_CONTEXT, null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_ContextIsSetToSameInstance_VDNS11_kRhB0() {
    PageContext pageContext = mock(PageContext.class);
    JXPathContext context = mock(JXPathContext.class);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    assertEquals(context, result);
}
}