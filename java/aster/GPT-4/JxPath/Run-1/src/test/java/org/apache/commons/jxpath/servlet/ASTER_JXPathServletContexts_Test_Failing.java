/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathServletContexts_Test_Failing {
@Mock
    private static JXPathContextFactory factory;
@Mock
    private ServletContext servletContext;
@Mock
    private JXPathContext jXPathContext;
@InjectMocks
    private JXPathServletContexts jxpathservletcontexts;
@Mock
    private HttpSession session;
@Mock
    private JXPathContext mockContext;
@Mock
    private JXPathContext applicationContext;
@Mock
    private HttpSessionAndServletContext handle;
@Mock
    private PageContext pageContext;
@Mock
    private HttpServletRequest request;
@Mock
    private JXPathContext parentContext;
@Mock
    private JXPathContext context;
@Mock
    private KeywordVariables keywordVariables;
@Mock
    private HttpServletRequest httpServletRequest;
@Mock
    private HttpSession httpSession;
@Mock
    private JXPathContext existingContext;
@Mock
    private JXPathContext newContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetApplicationContext_NewContext_1() throws Exception {
        // Initialize mocks and inject mocks setup in @InjectMocks
        // Setup
        when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(factory.newContext(null, servletContext)).thenReturn(jXPathContext);
        // Execute
        JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
        // Verify
        verify(servletContext).setAttribute(Constants.JXPATH_CONTEXT, jXPathContext);
        assertNotNull(result, "Context should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetApplicationContext_NewContext_2() throws Exception {
        // Initialize mocks and inject mocks setup in @InjectMocks
        // Setup
        when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(factory.newContext(null, servletContext)).thenReturn(jXPathContext);
        // Execute
        JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
        // Verify
        verify(servletContext).setAttribute(Constants.JXPATH_CONTEXT, jXPathContext);
        assertSame(jXPathContext, result, "Should return the newly created context");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionContext_NewContext() throws Exception {
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(factory.newContext(any(JXPathContext.class), any(HttpSessionAndServletContext.class))).thenReturn(mockContext);
        when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(applicationContext);
        // Arrange
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        // Act
        JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
        // Assert
        assertNotNull(result, "Context should not be null");
        verify(session, times(1)).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        verify(factory, times(1)).newContext(eq(applicationContext), any(HttpSessionAndServletContext.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionContext_ExistingContext_1() throws Exception {
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(factory.newContext(any(JXPathContext.class), any(HttpSessionAndServletContext.class))).thenReturn(mockContext);
        when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(applicationContext);
        // Arrange
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(mockContext);
        // Act
        JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
        // Assert
        verify(session, never()).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        verify(factory, never()).newContext(any(JXPathContext.class), any(HttpSessionAndServletContext.class));
        assertNotNull(result, "Context should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionContext_ExistingContext_2() throws Exception {
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(factory.newContext(any(JXPathContext.class), any(HttpSessionAndServletContext.class))).thenReturn(mockContext);
        when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(applicationContext);
        // Arrange
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(mockContext);
        // Act
        JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
        // Assert
        verify(session, never()).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        verify(factory, never()).newContext(any(JXPathContext.class), any(HttpSessionAndServletContext.class));
        assertSame(mockContext, result, "Should return the existing context");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_ExistingContext_1() throws Exception {
        when(pageContext.getRequest()).thenReturn(request);
        when(pageContext.getServletContext()).thenReturn(servletContext);
        when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
        when(factory.newContext(parentContext, pageContext)).thenReturn(context);
        // Setup
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(context);
        // Execute
        JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
        // Verify
        verify(pageContext, never()).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        assertNotNull(result, "Context should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_ExistingContext_2() throws Exception {
        when(pageContext.getRequest()).thenReturn(request);
        when(pageContext.getServletContext()).thenReturn(servletContext);
        when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
        when(factory.newContext(parentContext, pageContext)).thenReturn(context);
        // Setup
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(context);
        // Execute
        JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
        // Verify
        verify(pageContext, never()).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        assertEquals(context, result, "Expected context to be the one retrieved from pageContext");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequestContext_NewContext_1() throws Exception {
        when(request.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(httpServletRequest.getSession(false)).thenReturn(httpSession);
        when(factory.newContext(any(), any())).thenReturn(newContext);
        when(request instanceof HttpServletRequest).thenReturn(true);
        when(httpServletRequest.getSession(false)).thenReturn(null);
        when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
        JXPathContext result = JXPathServletContexts.getRequestContext(httpServletRequest, servletContext);
        verify(request).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        assertNotNull(result, "Context should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequestContext_NewContext_2() throws Exception {
        when(request.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(httpServletRequest.getSession(false)).thenReturn(httpSession);
        when(factory.newContext(any(), any())).thenReturn(newContext);
        when(request instanceof HttpServletRequest).thenReturn(true);
        when(httpServletRequest.getSession(false)).thenReturn(null);
        when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
        JXPathContext result = JXPathServletContexts.getRequestContext(httpServletRequest, servletContext);
        verify(request).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        assertEquals(newContext, result, "Expected new context to be returned");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_NewContext_eZNw0_1() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext expectedContext = mock(JXPathContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    when(factory.newContext(parentContext, handle)).thenReturn(expectedContext);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    verify(session).setAttribute(Constants.JXPATH_CONTEXT, expectedContext);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_NewContext_eZNw0_2() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext expectedContext = mock(JXPathContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    when(factory.newContext(parentContext, handle)).thenReturn(expectedContext);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    verify(session).setAttribute(Constants.JXPATH_CONTEXT, expectedContext);
    assertEquals(expectedContext, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_NewContext_IoNV0_1() {
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
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_NewContext_IoNV0_2() {
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
        assertEquals(mockContext, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequestContext_NewContext_NOmT0_2() {
        ServletRequest request = mock(HttpServletRequest.class);
        ServletContext servletContext = mock(ServletContext.class);
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = mock(HttpSession.class);
        when(httpServletRequest.getSession(false)).thenReturn(session);
        JXPathContext expectedContext = JXPathServletContexts.getRequestContext(request, servletContext);
        assertSame(request.getAttribute(Constants.JXPATH_CONTEXT), expectedContext);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_NewContext_FRJO0_1() throws Exception {
    when(pageContext.getRequest()).thenReturn(request);
    when(pageContext.getServletContext()).thenReturn(servletContext);
    when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
    when(factory.newContext(parentContext, pageContext)).thenReturn(context);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    verify(pageContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    assertNotNull(result, "Context should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_NewContext_FRJO0_2() throws Exception {
    when(pageContext.getRequest()).thenReturn(request);
    when(pageContext.getServletContext()).thenReturn(servletContext);
    when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
    when(factory.newContext(parentContext, pageContext)).thenReturn(context);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    verify(pageContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    assertEquals(context, result, "Expected context to be the one created by factory");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetApplicationContext_NewContext() throws Exception {
        // Initialize mocks and inject mocks setup in @InjectMocks
        // Setup
        when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(factory.newContext(null, servletContext)).thenReturn(jXPathContext);
        // Execute
        JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
        // Verify
        verify(servletContext).setAttribute(Constants.JXPATH_CONTEXT, jXPathContext);
        assertNotNull(result, "Context should not be null");
        assertSame(jXPathContext, result, "Should return the newly created context");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionContext_ExistingContext() throws Exception {
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(factory.newContext(any(JXPathContext.class), any(HttpSessionAndServletContext.class))).thenReturn(mockContext);
        when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(applicationContext);
        // Arrange
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(mockContext);
        // Act
        JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
        // Assert
        assertNotNull(result, "Context should not be null");
        assertSame(mockContext, result, "Should return the existing context");
        verify(session, never()).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        verify(factory, never()).newContext(any(JXPathContext.class), any(HttpSessionAndServletContext.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_ExistingContext() throws Exception {
        when(pageContext.getRequest()).thenReturn(request);
        when(pageContext.getServletContext()).thenReturn(servletContext);
        when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
        when(factory.newContext(parentContext, pageContext)).thenReturn(context);
        // Setup
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(context);
        // Execute
        JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
        // Verify
        verify(pageContext, never()).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        assertNotNull(result, "Context should not be null");
        assertEquals(context, result, "Expected context to be the one retrieved from pageContext");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequestContext_NewContext() throws Exception {
        when(request.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(httpServletRequest.getSession(false)).thenReturn(httpSession);
        when(factory.newContext(any(), any())).thenReturn(newContext);
        when(request instanceof HttpServletRequest).thenReturn(true);
        when(httpServletRequest.getSession(false)).thenReturn(null);
        when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
        JXPathContext result = JXPathServletContexts.getRequestContext(httpServletRequest, servletContext);
        verify(request).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        assertNotNull(result, "Context should not be null");
        assertEquals(newContext, result, "Expected new context to be returned");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_NewContext_eZNw0() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext expectedContext = mock(JXPathContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    when(factory.newContext(parentContext, handle)).thenReturn(expectedContext);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    verify(session).setAttribute(Constants.JXPATH_CONTEXT, expectedContext);
    assertNotNull(result);
    assertEquals(expectedContext, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_NewContext_IoNV0() {
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
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRequestContext_NewContext_NOmT0() {
        ServletRequest request = mock(HttpServletRequest.class);
        ServletContext servletContext = mock(ServletContext.class);
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = mock(HttpSession.class);
        when(httpServletRequest.getSession(false)).thenReturn(session);
        JXPathContext expectedContext = JXPathServletContexts.getRequestContext(request, servletContext);
        assertNotNull(expectedContext);
        assertSame(request.getAttribute(Constants.JXPATH_CONTEXT), expectedContext);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_NewContext_eZNw0_2_fid2() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext expectedContext = mock(JXPathContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    when(factory.newContext(parentContext, handle)).thenReturn(expectedContext);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    verify(session).setAttribute(Constants.JXPATH_CONTEXT, expectedContext);
    assertSame(expectedContext, result);
}
}