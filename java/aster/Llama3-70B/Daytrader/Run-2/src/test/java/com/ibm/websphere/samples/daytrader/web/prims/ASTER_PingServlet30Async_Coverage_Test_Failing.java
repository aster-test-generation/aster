/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet30Async_Coverage_Test_Failing {
private PingServlet30Async servlet;
private ServletConfig config;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_ufuQ0() {
        PingServlet30Async pingServlet30Async = new PingServlet30Async();
        String expected = "Basic dynamic HTML generation through a servlet";
        String actual = pingServlet30Async.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_StartAsync_zJcS1() throws ServletException, IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        AsyncContext ac = mock(AsyncContext.class);
        when(req.startAsync()).thenReturn(ac);
        servlet.doPost(req, res);
        verify(req).startAsync();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_ServletInputStream_taRc3() throws ServletException, IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletInputStream input = mock(ServletInputStream.class);
        when(req.getInputStream()).thenReturn(input);
        servlet.doPost(req, res);
        verify(req).getInputStream();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_ReadInput_GBGx5() throws ServletException, IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletInputStream input = mock(ServletInputStream.class);
        when(req.getInputStream()).thenReturn(input);
        when(input.read(any(byte[].class))).thenReturn(10);
        servlet.doPost(req, res);
        verify(input).read(any(byte[].class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_ServletOutputStream_YpJv8() throws ServletException, IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream output = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(output);
        servlet.doPost(req, res);
        verify(res).getOutputStream();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_Println_BYjB9() throws ServletException, IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream output = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(output);
        servlet.doPost(req, res);
        verify(output).println(anyString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_StringBuilder_cTOL2_ZHAY0() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async() {
        @Override
        public void init(ServletConfig config) throws ServletException {
            // Initialize servlet
        }
    };
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.init(null);
    servlet.doGet(req, res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_StringData_iCHs6_QvTb0() throws ServletException, IOException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletInputStream input = mock(ServletInputStream.class);
    when(req.getInputStream()).thenReturn(input);
    when(input.read(any(byte[].class))).thenReturn(10);
    servlet.doGet(req, res);
    verify(res).setStatus(200);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_ContentType_gixt0_BWyw0() throws ServletException, IOException {
    PingServlet servlet = new PingServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(res).setContentType("application/json");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_NoException_cSru2_PWzs0() throws Exception {
    // Assume PingServlet30Async is in the package com.ibm.websphere.samples.daytrader.web.prims
    com.ibm.websphere.samples.daytrader.web.prims.PingServlet30Async servlet = new com.ibm.websphere.samples.daytrader.web.prims.PingServlet30Async();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doGet(request, response);
    // No assertion is needed as the test case is checking for NoException
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_StringBuilder_cTOL2_ZHAY0_fid2() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doGet(req, res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_StringData_iCHs6_QvTb0_fid2() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletInputStream input = mock(ServletInputStream.class);
    when(req.getInputStream()).thenReturn(input);
    when(input.read(any(byte[].class))).thenReturn(10);
    servlet.doGet(req, res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_ContentType_gixt0_BWyw0_fid2() throws ServletException, IOException {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(res).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_NoException_cSru2_PWzs0_fid2() throws Exception {
    PingServlet30Async servlet = new PingServlet30Async();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doGet(request, response);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_fkvf0() throws javax.servlet.ServletException {
        servlet = new PingServlet30Async();
        config = mock(ServletConfig.class);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_SuperInitCalled_YgBG1() throws ServletException {
        servlet.init(config);
        verify(config).getServletContext();
    }
}