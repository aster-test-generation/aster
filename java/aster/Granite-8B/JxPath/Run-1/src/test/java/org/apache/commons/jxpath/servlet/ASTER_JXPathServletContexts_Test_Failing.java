/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathContextFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathServletContexts_Test_Failing {
    private static JXPathContextFactory factory;
    @Mock
    private ServletContext servletContext;
    @Mock
    private JXPathContext jxpathContext;
    @Mock
    private JXPathContext parentContext;
    @Mock
    private HttpSession session;
    @Mock
    private HttpSessionAndServletContext handle;
    @Mock
    private KeywordVariables keywordVariables;
    private JXPathServletContexts jxpathservletcontexts;
    @Mock
    private PageContext pageContext;
    @Mock
    private ServletRequest servletRequest;
    @Mock
    private HttpSession httpSession;
    @Mock
    private HttpServletRequest httpServletRequest;
    @Mock
    private ServletRequestAndContext servletRequestAndContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetApplicationContext() throws Exception {
        factory = Mockito.mock(JXPathContextFactory.class);
        Mockito.when(factory.newContext(null, servletContext)).thenReturn(jxpathContext);
        jxpathservletcontexts = new JXPathServletContexts();
        Mockito.when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
        Mockito.verify(servletContext).setAttribute(Constants.JXPATH_CONTEXT, jxpathContext);
        Mockito.verify(factory).newContext(null, servletContext);
        Assertions.assertEquals(jxpathContext, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPageContext_PGSC0() throws Exception {
        factory = mock(JXPathContextFactory.class);
        when(factory.newContext(parentContext, pageContext)).thenReturn(jxpathContext);
        jxpathservletcontexts = new JXPathServletContexts();
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        JXPathContext result = JXPathServletContexts.getRequestContext(pageContext.getRequest(), pageContext.getServletContext());
        assertEquals(jxpathContext, result);
        verify(pageContext).setAttribute(Constants.JXPATH_CONTEXT, jxpathContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_GDlA0_Yqsb0() {
        ServletContext servletContext = new MockServletContext();
        HttpServletRequest request = new MockHttpServletRequest();
        JXPathContext context = JXPathServletContexts.getRequestContext(request, servletContext);
        assertNotNull(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequestContextWithExistingContext_kGWx0_Wrkg0() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletContext servletContext = Mockito.mock(ServletContext.class);
        JXPathContext context = (JXPathContext) request.getAttribute(Constants.JXPATH_CONTEXT);
        JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
        assertEquals(context, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequestContextWithoutExistingContext_sZWi1_hlVm0() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletContext servletContext = Mockito.mock(ServletContext.class);
        JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
        assertNotNull(result);
    }
}