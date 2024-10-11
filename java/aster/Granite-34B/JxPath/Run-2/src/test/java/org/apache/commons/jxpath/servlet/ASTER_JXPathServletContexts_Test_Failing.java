/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathContextFactory;
import org.apache.commons.jxpath.Variables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathServletContexts_Test_Failing {
    private static JXPathContextFactory factory;
    JXPathServletContexts jxpathservletcontexts;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApplicationContextWithExistingContext_HxOU1_1() {
        MockServletContext servletContext = new MockServletContext();
        JXPathContext existingContext = mock(JXPathContext.class);
        when(existingContext.getVariables()).thenReturn(new KeywordVariables(Constants.APPLICATION_SCOPE, servletContext));
        servletContext.setAttribute(Constants.JXPATH_CONTEXT, existingContext);
        JXPathContext context = JXPathServletContexts.getApplicationContext(servletContext);
        assertNotNull(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApplicationContextWithExistingContext_HxOU1_2() {
        MockServletContext servletContext = new MockServletContext();
        JXPathContext existingContext = mock(JXPathContext.class);
        when(existingContext.getVariables()).thenReturn(new KeywordVariables(Constants.APPLICATION_SCOPE, servletContext));
        servletContext.setAttribute(Constants.JXPATH_CONTEXT, existingContext);
        JXPathContext context = JXPathServletContexts.getApplicationContext(servletContext);
        assertSame(context, existingContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApplicationContext_JIwZ0() throws Exception {
        JXPathServletContexts jxpathservletcontexts = new JXPathServletContexts();
        ServletContext servletContext = mock(ServletContext.class);
        JXPathContext context = (JXPathContext) servletContext.getAttribute(Constants.JXPATH_CONTEXT);
        if (context == null) {
            context = factory.newContext(null, servletContext);
            context.setVariables(new KeywordVariables(Constants.APPLICATION_SCOPE, servletContext));
            servletContext.setAttribute(Constants.JXPATH_CONTEXT, context);
        }
        assertEquals(context, jxpathservletcontexts.getApplicationContext(servletContext));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSessionContext_rdDl0() throws Exception {
        JXPathServletContexts jxpathservletcontexts = new JXPathServletContexts();
        HttpSession session = mock(HttpSession.class);
        ServletContext servletContext = mock(ServletContext.class);
        JXPathContext parentContext = mock(JXPathContext.class);
        JXPathContext context = mock(JXPathContext.class);
        when(factory.newContext(parentContext, new HttpSessionAndServletContext(session, servletContext))).thenReturn(context);
        when(context.getVariables()).thenReturn(new KeywordVariables(Constants.SESSION_SCOPE, new HttpSessionAndServletContext(session, servletContext)));
        JXPathContext result = jxpathservletcontexts.getSessionContext(session, servletContext);
        assertEquals(context, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPageContext_IebR0() throws Exception {
        JXPathServletContexts jxpathservletcontexts = new JXPathServletContexts();
        JXPathContext context = jxpathservletcontexts.getPageContext(Mockito.mock(PageContext.class));
        assertNotNull(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRequestContext_Mcew0() throws Exception {
        jxpathservletcontexts = new JXPathServletContexts();
        final ServletRequest request = mock(ServletRequest.class);
        final ServletContext servletContext = mock(ServletContext.class);
        final JXPathContext parentContext = mock(JXPathContext.class);
        final ServletRequestAndContext handle = new ServletRequestAndContext(request, servletContext);
        final JXPathContext context = factory.newContext(parentContext, handle);
        context.setVariables(new KeywordVariables(Constants.REQUEST_SCOPE, handle));
        request.setAttribute(Constants.JXPATH_CONTEXT, context);
        final JXPathContext result = jxpathservletcontexts.getRequestContext(request, servletContext);
        assertEquals(context, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariables_TTFy0_IJoU0() {
        JXPathContext context = mock(JXPathContext.class);
        Variables variables = context.getVariables();
        assertNotNull(variables);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFactory_IjnP1_MObu0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        AbstractFactory factory = context.getFactory();
        assertNotNull(factory);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApplicationContextWithExistingContext_HxOU1() {
        MockServletContext servletContext = new MockServletContext();
        JXPathContext existingContext = mock(JXPathContext.class);
        when(existingContext.getVariables()).thenReturn(new KeywordVariables(Constants.APPLICATION_SCOPE, servletContext));
        servletContext.setAttribute(Constants.JXPATH_CONTEXT, existingContext);
        JXPathContext context = JXPathServletContexts.getApplicationContext(servletContext);
        assertNotNull(context);
        assertSame(context, existingContext);
    }
}