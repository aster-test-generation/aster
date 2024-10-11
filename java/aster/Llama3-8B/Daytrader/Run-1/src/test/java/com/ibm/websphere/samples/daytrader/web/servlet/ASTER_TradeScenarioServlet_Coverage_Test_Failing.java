/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Enumeration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
public class Aster_TradeScenarioServlet_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_ZeER0() {
        TradeScenarioServlet servlet = new TradeScenarioServlet();
        String expected = "TradeScenarioServlet emulates a population of web users";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_GetInitParameterNamesCalled_pgwy1() throws ServletException {
        TradeScenarioServlet servlet = new TradeScenarioServlet();
        ServletConfig config = mock(ServletConfig.class);
        when(config.getInitParameterNames()).thenReturn(mock(Enumeration.class));
        servlet.init(config);
        verify(config, times(1)).getInitParameterNames();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_HasMoreElements_ReturnsTrue_dDck2() throws ServletException {
        TradeScenarioServlet servlet = new TradeScenarioServlet();
        ServletConfig config = mock(ServletConfig.class);
        Enumeration<String> en = mock(Enumeration.class);
        when(en.hasMoreElements()).thenReturn(true);
        when(config.getInitParameterNames()).thenReturn(en);
        servlet.init(config);
        verify(en, times(1)).hasMoreElements();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_HasMoreElements_ReturnsFalse_uhyy3() throws ServletException {
        TradeScenarioServlet servlet = new TradeScenarioServlet();
        ServletConfig config = mock(ServletConfig.class);
        Enumeration<String> en = mock(Enumeration.class);
        when(en.hasMoreElements()).thenReturn(false);
        when(config.getInitParameterNames()).thenReturn(en);
        servlet.init(config);
        verify(en, times(1)).hasMoreElements();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_GetNextElementCalled_UtLs4() throws ServletException {
        TradeScenarioServlet servlet = new TradeScenarioServlet();
        ServletConfig config = mock(ServletConfig.class);
        Enumeration<String> en = mock(Enumeration.class);
        String parm = "param";
        when(en.nextElement()).thenReturn(parm);
        when(config.getInitParameterNames()).thenReturn(en);
        servlet.init(config);
        verify(en, times(1)).nextElement();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_GetInitParameterCalled_sKKB5() throws ServletException {
        TradeScenarioServlet servlet = new TradeScenarioServlet();
        ServletConfig config = mock(ServletConfig.class);
        Enumeration<String> en = mock(Enumeration.class);
        String parm = "param";
        String value = "value";
        when(config.getInitParameter(parm)).thenReturn(value);
        when(config.getInitParameterNames()).thenReturn(en);
        servlet.init(config);
        verify(config, times(1)).getInitParameter(parm);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testActionNull_nZEd0() throws javax.servlet.ServletException, java.io.IOException {
        TradeScenarioServlet servlet = new TradeScenarioServlet();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        servlet.performTask(req, resp);
        verify(req).getParameter("action");
        verify(resp).setContentType("text/html");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_rlKY0_OMbS0() throws javax.servlet.ServletException, java.io.IOException {
    TradeScenarioServlet tradeScenarioServlet = new TradeScenarioServlet();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPostWithException_nkLv2_yomy0() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    TradeScenarioServlet tradeScenarioServlet = new TradeScenarioServlet();
    tradeScenarioServlet.performTask(request, response);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_SuperInitCalled_uEXA0_sOgi0() throws ServletException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    ServletConfig config = mock(ServletConfig.class);
    servlet.init(config);
    verify(config, times(1)).getServletContext();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testScenarioActionLogout_gTMj5_oMwg0() throws javax.servlet.ServletException, java.io.IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    ((HttpServletResponse) resp).setContentType("text/html");
    when(req.getParameter("action")).thenReturn("o");
    servlet.performTask(req, resp);
    verify(resp, times(1)).sendError(200, "Logout");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testScenarioActionUpdateProfile_FHbv10_mmut0() throws javax.servlet.ServletException, java.io.IOException {
    TradeScenarioServlet servlet = new TradeScenarioServlet();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    ((MockHttpServletRequest) req).setParameter("action", "u");
    servlet.performTask(req, resp);
    verify(resp).setContentType("text/html");
    verify(new PrintWriter(resp.getOutputStream())).println("<HTML><HEAD>TradeScenarioServlet</HEAD><BODY>Hello</BODY></HTML>");
}
}