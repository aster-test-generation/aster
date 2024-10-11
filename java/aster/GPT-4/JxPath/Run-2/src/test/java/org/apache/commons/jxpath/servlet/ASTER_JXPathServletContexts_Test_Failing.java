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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockServletContext;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import org.springframework.mock.web.MockHttpServletRequest;   
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
    private KeywordVariables keywordVariables;
@Mock
    private PageContext pageContext;
@Mock
    private HttpServletRequest request;
@Mock
    private JXPathContext parentContext;
@Mock
    private JXPathContext context;
@Mock
    private ServletRequest mockServletRequest;
@Mock
    private ServletContext mockServletContext;
@Mock
    private HttpServletRequest mockHttpServletRequest;
@Mock
    private HttpSession mockHttpSession;
@Mock
    private JXPathContext mockJXPathContext;
@Mock
    private JXPathContextFactory mockFactory;
@Mock
    private ServletRequestAndContext mockServletRequestAndContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetApplicationContext_NewContext() throws Exception {
        when(factory.newContext(null, servletContext)).thenReturn(jXPathContext);
        when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        doNothing().when(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
        assertNotNull(result, "Context should not be null");
        verify(servletContext).setAttribute(Constants.JXPATH_CONTEXT, jXPathContext);
        verify(factory).newContext(null, servletContext);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionContext_NewContextCreated() throws Exception {
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(factory.newContext(any(JXPathContext.class), any(HttpSessionAndServletContext.class))).thenReturn(mockContext);
        when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(applicationContext);
        // Arrange
        when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        // Act
        JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
        // Assert
        assertNotNull(result);
        verify(session).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
        verify(factory).newContext(eq(applicationContext), any(HttpSessionAndServletContext.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionContext_ExistingContextReturned_1() throws Exception {
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
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionContext_ExistingContextReturned_2() throws Exception {
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
        assertSame(mockContext, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_ExistingContextReturned_1() throws Exception {
        when(pageContext.getRequest()).thenReturn(request);
        when(pageContext.getServletContext()).thenReturn(servletContext);
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
        when(factory.newContext(parentContext, pageContext)).thenReturn(context);
        // Setup
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(context);
        // Execute
        JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
        // Verify
        verify(pageContext, never()).setAttribute(anyString(), any());
        assertNotNull(result, "Context should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_ExistingContextReturned_2() throws Exception {
        when(pageContext.getRequest()).thenReturn(request);
        when(pageContext.getServletContext()).thenReturn(servletContext);
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
        when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
        when(factory.newContext(parentContext, pageContext)).thenReturn(context);
        // Setup
        when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(context);
        // Execute
        JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
        // Verify
        verify(pageContext, never()).setAttribute(anyString(), any());
        assertEquals(context, result, "Returned context should be the existing one from attribute");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPageContext_NewContext_qrny0_1() {
        PageContext mockPageContext = mock(PageContext.class);
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        ServletContext mockServletContext = mock(ServletContext.class);
        JXPathContext mockParentContext = mock(JXPathContext.class);
        JXPathContext mockContext = mock(JXPathContext.class);
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
    public void testGetPageContext_NewContext_qrny0_2() {
        PageContext mockPageContext = mock(PageContext.class);
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        ServletContext mockServletContext = mock(ServletContext.class);
        JXPathContext mockParentContext = mock(JXPathContext.class);
        JXPathContext mockContext = mock(JXPathContext.class);
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
public void testGetRequestContext_NewRequest_Ijnu0_1() {
    ServletRequest request = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_HttpServletRequestWithSession_iyqI3() {
    HttpServletRequest request = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    HttpSession session = new MockHttpSession();
    ((MockHttpServletRequest) request).setSession(session);
    JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
    assertTrue(result instanceof JXPathContext);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_NewContext_XMnq0_DBhH0() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext expectedContext = mock(JXPathContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    when(factory.newContext(parentContext, handle)).thenReturn(expectedContext);
    KeywordVariables variables = new KeywordVariables(Constants.SESSION_SCOPE, handle);
    when(new KeywordVariables(Constants.SESSION_SCOPE, handle)).thenReturn(variables);
    expectedContext.setVariables(variables);
    doNothing().when(session).setAttribute(Constants.JXPATH_CONTEXT, expectedContext);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    verify(session).setAttribute(Constants.JXPATH_CONTEXT, expectedContext);
    assertSame(expectedContext, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_NewContextCreated_HOlc0_1() throws Exception {
    when(pageContext.getRequest()).thenReturn(request);
    when(pageContext.getServletContext()).thenReturn(servletContext);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
    when(factory.newContext(parentContext, pageContext)).thenReturn(context);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    verify(pageContext).setAttribute(Constants.JXPATH_CONTEXT, context);
    assertSame(result, context, "Context should be the same as the one created");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_NewContextCreated_HOlc0_2() throws Exception {
    when(pageContext.getRequest()).thenReturn(request);
    when(pageContext.getServletContext()).thenReturn(servletContext);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
    when(factory.newContext(parentContext, pageContext)).thenReturn(context);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    verify(pageContext).setAttribute(Constants.JXPATH_CONTEXT, context);
    assertSame(context, result, "Returned context should be the one created by factory");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_ExistingRequestContext_QTSO1_KHkJ0() {
    ServletRequest request = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    JXPathContext existingContext = mock(JXPathContext.class);
    when(existingContext.getContextBean()).thenReturn(new ServletRequestAndContext(request, servletContext));
    request.setAttribute(Constants.JXPATH_CONTEXT, existingContext);
    JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_ExistingRequestContextDifferentRequest_kDaJ2_Suiq0_1() {
    ServletRequest request1 = new MockHttpServletRequest();
    ServletRequest request2 = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    JXPathContext existingContext = mock(JXPathContext.class);
    ServletRequestAndContext handle = new ServletRequestAndContext(request1, servletContext);
    when(existingContext.getContextBean()).thenReturn(handle);
    request1.setAttribute(Constants.JXPATH_CONTEXT, existingContext);
    JXPathContext result = JXPathServletContexts.getRequestContext(request2, servletContext);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_ExistingRequestContextDifferentRequest_kDaJ2_Suiq0_2() {
    ServletRequest request1 = new MockHttpServletRequest();
    ServletRequest request2 = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    JXPathContext existingContext = mock(JXPathContext.class);
    ServletRequestAndContext handle = new ServletRequestAndContext(request1, servletContext);
    when(existingContext.getContextBean()).thenReturn(handle);
    request1.setAttribute(Constants.JXPATH_CONTEXT, existingContext);
    JXPathContext result = JXPathServletContexts.getRequestContext(request2, servletContext);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_ExistingContextReturned_wkuq0_1() throws Exception {
    when(pageContext.getRequest()).thenReturn(request);
    when(pageContext.getServletContext()).thenReturn(servletContext);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(context);
    when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    verify(pageContext, never()).setAttribute(anyString(), any());
    assertSame(result, context, "Returned context should be the same as the existing one");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_NewContextCreated_LEYa0() throws Exception {
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(factory.newContext(any(JXPathContext.class), any(ServletRequestAndContext.class))).thenReturn(mockContext);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(applicationContext);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    assertNotNull(result);
    verify(session).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    verify(factory).newContext(eq(applicationContext), any(ServletRequestAndContext.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetApplicationContext_NewContext_WvEf0() throws Exception {
    when(factory.newContext(null, servletContext)).thenReturn(jXPathContext);
    when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    doNothing().when(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
    assertNotNull(result, "Context should not be null");
    verify(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    verify(factory, times(1)).newContext(null, servletContext);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetApplicationContext_ExistingContext_KUpj0_1() throws Exception {
    when(factory.newContext(any(), any())).thenReturn(jXPathContext);
    when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null).thenReturn(jXPathContext);
    doNothing().when(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
    verify(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    verify(factory).newContext(null, servletContext);
    assertNotNull(result, "Context should not be null");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetApplicationContext_ExistingContext_KUpj0_2() throws Exception {
    when(factory.newContext(any(), any())).thenReturn(jXPathContext);
    when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null).thenReturn(jXPathContext);
    doNothing().when(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
    verify(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    verify(factory).newContext(null, servletContext);
    assertSame(jXPathContext, result, "Should return the existing context");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_NewContext_qrny0_xQes0_1() {
    PageContext mockPageContext = mock(PageContext.class);
    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    ServletContext mockServletContext = mock(ServletContext.class);
    JXPathContext mockParentContext = mock(JXPathContext.class);
    JXPathContext mockContext = mock(JXPathContext.class);
    ServletRequestAndContext handle = new ServletRequestAndContext(mockRequest, mockServletContext);
    when(mockPageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(mockPageContext.getRequest()).thenReturn(mockRequest);
    when(mockPageContext.getServletContext()).thenReturn(mockServletContext);
    when(JXPathServletContexts.getRequestContext(mockRequest, mockServletContext)).thenReturn(mockParentContext);
    when(factory.newContext(mockParentContext, handle)).thenReturn(mockContext);
    JXPathContext result = JXPathServletContexts.getPageContext(mockPageContext);
    verify(mockPageContext).setAttribute(Constants.JXPATH_CONTEXT, mockContext);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_NewContext_qrny0_xQes0_2() {
    PageContext mockPageContext = mock(PageContext.class);
    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    ServletContext mockServletContext = mock(ServletContext.class);
    JXPathContext mockParentContext = mock(JXPathContext.class);
    JXPathContext mockContext = mock(JXPathContext.class);
    ServletRequestAndContext handle = new ServletRequestAndContext(mockRequest, mockServletContext);
    when(mockPageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(mockPageContext.getRequest()).thenReturn(mockRequest);
    when(mockPageContext.getServletContext()).thenReturn(mockServletContext);
    when(JXPathServletContexts.getRequestContext(mockRequest, mockServletContext)).thenReturn(mockParentContext);
    when(factory.newContext(mockParentContext, handle)).thenReturn(mockContext);
    JXPathContext result = JXPathServletContexts.getPageContext(mockPageContext);
    verify(mockPageContext).setAttribute(Constants.JXPATH_CONTEXT, mockContext);
    assertSame(mockContext, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_NewRequest_Ijnu0() {
    ServletRequest request = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
    assertNotNull(result);
    assertEquals(result.getContextBean(), new ServletRequestAndContext(request, servletContext));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_HttpServletRequestWithSession_iyqI3_fid1() {
    HttpServletRequest request = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    HttpSession session = new MockHttpSession();
    ((MockHttpServletRequest) request).setSession(session);
    JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_HttpServletRequestNoSession_Ovrx4_fid1() {
    HttpServletRequest request = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    ((MockHttpServletRequest) request).setSession(null);
    JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_NewRequest_Ijnu0_2() {
    ServletRequest request = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
    assertEquals(result.getContextBean(), new ServletRequestAndContext(request, servletContext));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_NewContext_Kcbm0_2() throws Exception {
    when(mockHttpServletRequest.getSession(false)).thenReturn(mockHttpSession);
    when(mockFactory.newContext(any(), any())).thenReturn(mockJXPathContext);
    when(mockServletRequest.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(mockServletRequestAndContext.getServletRequest()).thenReturn(mockServletRequest);
    when(mockJXPathContext.getContextBean()).thenReturn(mockServletRequestAndContext);
    JXPathContext result = JXPathServletContexts.getRequestContext(mockServletRequest, mockServletContext);
    verify(mockServletRequest).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    assertEquals(mockJXPathContext, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSessionContext_NewContext_XMnq0_DBhH0_fid2() {
    HttpSession session = mock(HttpSession.class);
    ServletContext servletContext = mock(ServletContext.class);
    when(session.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    JXPathContext expectedContext = mock(JXPathContext.class);
    JXPathContext parentContext = mock(JXPathContext.class);
    when(JXPathServletContexts.getApplicationContext(servletContext)).thenReturn(parentContext);
    HttpSessionAndServletContext handle = new HttpSessionAndServletContext(session, servletContext);
    when(factory.newContext(parentContext, handle)).thenReturn(expectedContext);
    KeywordVariables variables = new KeywordVariables(Constants.SESSION_SCOPE, handle);
    when(new KeywordVariables(Constants.SESSION_SCOPE, handle)).thenReturn(variables);
    expectedContext.setVariables(variables);
    doNothing().when(session).setAttribute(Constants.JXPATH_CONTEXT, expectedContext);
    JXPathContext result = JXPathServletContexts.getSessionContext(session, servletContext);
    verify(session).setAttribute(Constants.JXPATH_CONTEXT, expectedContext);
    assertEquals(expectedContext, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_NewContextCreated_HOlc0_1_fid2() throws Exception {
    when(pageContext.getRequest()).thenReturn(request);
    when(pageContext.getServletContext()).thenReturn(servletContext);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
    when(factory.newContext(parentContext, pageContext)).thenReturn(context);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    verify(pageContext).setAttribute(Constants.JXPATH_CONTEXT, context);
    assertNotNull(result, "Context should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_NewContextCreated_HOlc0_2_fid2() throws Exception {
    when(pageContext.getRequest()).thenReturn(request);
    when(pageContext.getServletContext()).thenReturn(servletContext);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
    when(factory.newContext(parentContext, pageContext)).thenReturn(context);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    verify(pageContext).setAttribute(Constants.JXPATH_CONTEXT, context);
    assertEquals(context, result, "Returned context should be the one created by factory");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_ExistingRequestContext_QTSO1_KHkJ0_fid2() {
    ServletRequest request = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    JXPathContext existingContext = mock(JXPathContext.class);
    when(existingContext.getContextBean()).thenReturn(new ServletRequestAndContext(request, servletContext));
    request.setAttribute(Constants.JXPATH_CONTEXT, existingContext);
    JXPathContext result = JXPathServletContexts.getRequestContext(request, servletContext);
    assertSame(result, existingContext);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRequestContext_ExistingRequestContextDifferentRequest_kDaJ2_Suiq0_1_fid2() {
    ServletRequest request1 = new MockHttpServletRequest();
    ServletRequest request2 = new MockHttpServletRequest();
    ServletContext servletContext = new MockServletContext();
    JXPathContext existingContext = mock(JXPathContext.class);
    ServletRequestAndContext handle = new ServletRequestAndContext(request1, servletContext);
    when(existingContext.getContextBean()).thenReturn(handle);
    request1.setAttribute(Constants.JXPATH_CONTEXT, existingContext);
    JXPathContext result = JXPathServletContexts.getRequestContext(request2, servletContext);
    assertNotSame(result, existingContext);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_ExistingContextReturned_wkuq0_1_fid2() throws Exception {
    when(pageContext.getRequest()).thenReturn(request);
    when(pageContext.getServletContext()).thenReturn(servletContext);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(context);
    when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    verify(pageContext, never()).setAttribute(anyString(), any());
    assertNotNull(result, "Context should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_ExistingContextReturned_wkuq0_2() throws Exception {
    when(pageContext.getRequest()).thenReturn(request);
    when(pageContext.getServletContext()).thenReturn(servletContext);
    when(pageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(context);
    when(JXPathServletContexts.getRequestContext(request, servletContext)).thenReturn(parentContext);
    JXPathContext result = JXPathServletContexts.getPageContext(pageContext);
    verify(pageContext, never()).setAttribute(anyString(), any());
    assertSame(context, result, "Returned context should be the existing one from attribute");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetApplicationContext_NewContext_WvEf0_fid2() throws Exception {
    when(factory.newContext(null, servletContext)).thenReturn(jXPathContext);
    when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    doNothing().when(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
    assertNotNull(result, "Context should not be null");
    verify(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    verify(factory).newContext(null, servletContext);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetApplicationContext_ExistingContext_KUpj0_1_fid2() throws Exception {
    when(factory.newContext(any(), any())).thenReturn(jXPathContext);
    when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null).thenReturn(jXPathContext);
    doNothing().when(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
    verify(servletContext, never()).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    verify(factory, never()).newContext(null, servletContext);
    assertNotNull(result, "Context should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetApplicationContext_ExistingContext_KUpj0_2_fid2() throws Exception {
    when(factory.newContext(any(), any())).thenReturn(jXPathContext);
    when(servletContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null).thenReturn(jXPathContext);
    doNothing().when(servletContext).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    JXPathContext result = JXPathServletContexts.getApplicationContext(servletContext);
    verify(servletContext, never()).setAttribute(eq(Constants.JXPATH_CONTEXT), any(JXPathContext.class));
    verify(factory, never()).newContext(null, servletContext);
    assertSame(result, jXPathContext, "Should return the existing context");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPageContext_NewContext_qrny0_xQes0_2_fid2() {
    PageContext mockPageContext = mock(PageContext.class);
    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    ServletContext mockServletContext = mock(ServletContext.class);
    JXPathContext mockParentContext = mock(JXPathContext.class);
    JXPathContext mockContext = mock(JXPathContext.class);
    ServletRequestAndContext handle = new ServletRequestAndContext(mockRequest, mockServletContext);
    when(mockPageContext.getAttribute(Constants.JXPATH_CONTEXT)).thenReturn(null);
    when(mockPageContext.getRequest()).thenReturn(mockRequest);
    when(mockPageContext.getServletContext()).thenReturn(mockServletContext);
    when(JXPathServletContexts.getRequestContext(mockRequest, mockServletContext)).thenReturn(mockParentContext);
    when(factory.newContext(mockParentContext, handle)).thenReturn(mockContext);
    JXPathContext result = JXPathServletContexts.getPageContext(mockPageContext);
    verify(mockPageContext).setAttribute(Constants.JXPATH_CONTEXT, mockContext);
    assertEquals(mockContext, result);}
}