/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletPush_Test_Passing {
private static String initTime;
private static int hitCount;
@Mock
    private ServletConfig servletConfig;
@InjectMocks
    private PingServletPush pingservletpush;
@Mock
    private HttpServletRequest httpservletrequest;
@Mock
    private HttpServletResponse httpservletresponse;
@Mock
    private HttpServlet httpservlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_jhCc1_1() throws ServletException {
    initTime = null;
    hitCount = 0;
    pingservletpush = new PingServletPush();
    pingservletpush.init(servletConfig);
    assertEquals(null, initTime);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_jhCc1_2() throws ServletException {
    initTime = null;
    hitCount = 0;
    pingservletpush = new PingServletPush();
    pingservletpush.init(servletConfig);
    assertEquals(0, hitCount);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoGet_QVfD0_1() throws Exception {
    hitCount = 0;
    initTime = "someInitTime";
    pingservletpush = new PingServletPush();
    when(httpservletrequest.getMethod()).thenReturn("GET");
    when(httpservletrequest.getProtocol()).thenReturn("HTTP/1.1");
    PrintWriter mockPrintWriter = mock(PrintWriter.class);
    when(httpservletresponse.getWriter()).thenReturn(mockPrintWriter);
        pingservletpush.doGet(httpservletrequest, httpservletresponse);
        String responseContent = mockPrintWriter.toString();
        assertEquals(1, hitCount);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoGet_QVfD0_2() throws Exception {
    hitCount = 0;
    initTime = "someInitTime";
    pingservletpush = new PingServletPush();
    when(httpservletrequest.getMethod()).thenReturn("GET");
    when(httpservletrequest.getProtocol()).thenReturn("HTTP/1.1");
    PrintWriter mockPrintWriter = mock(PrintWriter.class);
    when(httpservletresponse.getWriter()).thenReturn(mockPrintWriter);
        pingservletpush.doGet(httpservletrequest, httpservletresponse);
        String responseContent = mockPrintWriter.toString();
        assertTrue(responseContent.contains("<html><head><title>Ping Servlet HTTP/2</title></head>"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoGet_QVfD0_3() throws Exception {
    hitCount = 0;
    initTime = "someInitTime";
    pingservletpush = new PingServletPush();
    when(httpservletrequest.getMethod()).thenReturn("GET");
    when(httpservletrequest.getProtocol()).thenReturn("HTTP/1.1");
    PrintWriter mockPrintWriter = mock(PrintWriter.class);
    when(httpservletresponse.getWriter()).thenReturn(mockPrintWriter);
        pingservletpush.doGet(httpservletrequest, httpservletresponse);
        String responseContent = mockPrintWriter.toString();
        assertTrue(responseContent.contains("<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet HTTP/2<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoGet_QVfD0_4() throws Exception {
    hitCount = 0;
    initTime = "someInitTime";
    pingservletpush = new PingServletPush();
    when(httpservletrequest.getMethod()).thenReturn("GET");
    when(httpservletrequest.getProtocol()).thenReturn("HTTP/1.1");
    PrintWriter mockPrintWriter = mock(PrintWriter.class);
    when(httpservletresponse.getWriter()).thenReturn(mockPrintWriter);
        pingservletpush.doGet(httpservletrequest, httpservletresponse);
        String responseContent = mockPrintWriter.toString();
        assertTrue(responseContent.contains("<B>Hit Count: 1</B><br>"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoGet_QVfD0_5() throws Exception {
    hitCount = 0;
    initTime = "someInitTime";
    pingservletpush = new PingServletPush();
    when(httpservletrequest.getMethod()).thenReturn("GET");
    when(httpservletrequest.getProtocol()).thenReturn("HTTP/1.1");
    PrintWriter mockPrintWriter = mock(PrintWriter.class);
    when(httpservletresponse.getWriter()).thenReturn(mockPrintWriter);
        pingservletpush.doGet(httpservletrequest, httpservletresponse);
        String responseContent = mockPrintWriter.toString();
        assertTrue(responseContent.contains("<img src='images/graph.gif'>"));}
}