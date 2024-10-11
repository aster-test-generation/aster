/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ServletRequestAndContext_Test_Passing {
@Mock
    private HttpServletRequest httpServletRequest;
@Mock
    private ServletRequest nonHttpServletRequest;
@Mock
    private HttpSession httpSession;
@Mock
    private ServletContext servletContext;
private ServletRequestAndContext servletRequestAndContext;
private ServletRequest request;
private ServletContext context;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSession_ReturnsHttpSession_WhenServletRequestIsHttpServletRequest() throws Exception {
        // Setup for HttpServletRequest
        when(httpServletRequest.getSession(false)).thenReturn(httpSession);
        servletRequestAndContext = new ServletRequestAndContext(httpServletRequest, servletContext);
        HttpSession session = servletRequestAndContext.getSession();
        assertNotNull(session, "Session should not be null when ServletRequest is an HttpServletRequest");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSession_ReturnsNull_WhenServletRequestIsNotHttpServletRequest() throws Exception {
        // Setup for HttpServletRequest
        when(httpServletRequest.getSession(false)).thenReturn(httpSession);
        servletRequestAndContext = new ServletRequestAndContext(httpServletRequest, servletContext);
        // Setup for non-HttpServletRequest
        ServletRequestAndContext nonHttpServletReqAndContext = new ServletRequestAndContext(nonHttpServletRequest, servletContext);
        HttpSession session = nonHttpServletReqAndContext.getSession();
        assertNull(session, "Session should be null when ServletRequest is not an HttpServletRequest");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionWithHttpServletRequest_obLQ0_1() {
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        ServletContext mockContext = mock(ServletContext.class);
        HttpSession mockSession = mock(HttpSession.class);
        when(mockRequest.getSession(false)).thenReturn(mockSession);
        ServletRequestAndContext src = new ServletRequestAndContext(mockRequest, mockContext);
        HttpSession result = src.getSession();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionWithHttpServletRequest_obLQ0_2() {
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        ServletContext mockContext = mock(ServletContext.class);
        HttpSession mockSession = mock(HttpSession.class);
        when(mockRequest.getSession(false)).thenReturn(mockSession);
        ServletRequestAndContext src = new ServletRequestAndContext(mockRequest, mockContext);
        HttpSession result = src.getSession();
        assertEquals(mockSession, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionWithNonHttpServletRequest_gdCY1() {
        ServletRequest mockRequest = mock(ServletRequest.class);
        ServletContext mockContext = mock(ServletContext.class);
        ServletRequestAndContext src = new ServletRequestAndContext(mockRequest, mockContext);
        HttpSession result = src.getSession();
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletRequest_TCWS0() {
    ServletRequest mockRequest = mock(ServletRequest.class);
    ServletContext mockContext = mock(ServletContext.class);
    ServletRequestAndContext servletRequestAndContext = new ServletRequestAndContext(mockRequest, mockContext);
    ServletRequest result = servletRequestAndContext.getServletRequest();
    assertSame(mockRequest, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletRequest_BoLi0() throws Exception {
    ServletRequest mockRequest = mock(ServletRequest.class);
    ServletContext mockContext = mock(ServletContext.class);
    ServletRequestAndContext servletRequestAndContext = new ServletRequestAndContext(mockRequest, mockContext);
    ServletRequest result = servletRequestAndContext.getServletRequest();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionWithHttpServletRequest_obLQ0() {
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        ServletContext mockContext = mock(ServletContext.class);
        HttpSession mockSession = mock(HttpSession.class);
        when(mockRequest.getSession(false)).thenReturn(mockSession);
        ServletRequestAndContext src = new ServletRequestAndContext(mockRequest, mockContext);
        HttpSession result = src.getSession();
        assertNotNull(result);
        assertEquals(mockSession, result);
    }
}