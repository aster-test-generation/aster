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
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathServletContexts_Test_Passing {
private static JXPathContextFactory factory;
@Mock
    private ServletContext servletContext;
@Mock
    private JXPathContext jXPathContext;
private JXPathServletContexts jXPathServletContexts;
JXPathServletContexts jxpathservletcontexts;
ServletContext servletcontext;
HttpSession httpsession;
JXPathContext jxpathcontext;
PageContext pagecontext;
HttpServletRequest httprequest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetApplicationContext() throws Exception {
        factory = mock(JXPathContextFactory.class);
        jXPathServletContexts = new JXPathServletContexts();
        when(factory.newContext(null, servletContext)).thenReturn(jXPathContext);
        when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
        assertEquals(jXPathContext, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetApplicationContext_ContextAlreadyExists() throws Exception {
        when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(jXPathContext);
        factory = mock(JXPathContextFactory.class);
        jXPathServletContexts = new JXPathServletContexts();
        when(factory.newContext(null, servletContext)).thenReturn(jXPathContext);
        when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
        assertEquals(jXPathContext, result);
    }
}