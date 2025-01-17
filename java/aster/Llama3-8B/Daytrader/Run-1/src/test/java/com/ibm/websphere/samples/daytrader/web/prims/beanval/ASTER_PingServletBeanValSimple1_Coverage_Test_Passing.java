/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;
import java.io.IOException;
import javax.servlet.ServletException;
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
public class Aster_PingServletBeanValSimple1_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_XNGX0() {
        PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
        String expected = "Basic dynamic HTML generation through a servlet";
        String actual = pingServletBeanValSimple1.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_PWhw0_XYqo0() throws javax.servlet.ServletException, java.io.IOException {
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_setContentType_dqka1_xHqc0() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    pingServletBeanValSimple1.doGet(request, response);
    verify(response).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_getOutputStream_nItt4_OiEi0() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    pingServletBeanValSimple1.doGet(request, response);
    verify(response).getWriter();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_checkInjectionValidation_pwwx3_MCCD0() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    pingServletBeanValSimple1.doGet(request, response);
    verify(pingServletBeanValSimple1, times(1)).doGet(request, response);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_printHtml_tlcm6_ZlGQ0() throws ServletException, IOException {
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(response.getOutputStream()).thenReturn(out);
    when(request.getMethod()).thenReturn("GET");
    pingServletBeanValSimple1.doGet(request, response);
    verify(out).println(eq("<html><head><title>Ping Servlet Bean Validation Simple</title></head>"));
    verify(out).println(eq("<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet Bean Validation Simple<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + anyString() + "<BR><BR></FONT>  <B>Hit Count: " + anyInt() + "</B></body></html>"));
    verify(out, times(1)).println(anyString());
    verify(out, times(1)).flush();
    verify(out, times(1)).close();
}
}