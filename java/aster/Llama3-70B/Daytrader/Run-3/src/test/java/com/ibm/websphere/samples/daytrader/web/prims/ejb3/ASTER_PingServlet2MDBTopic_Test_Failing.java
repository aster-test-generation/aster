/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2MDBTopic_Test_Failing {
private static String initTime;
private static int hitCount;
PingServlet2MDBTopic pingservlet2mdbtopic;
ServletConfig servletConfig;
HttpServlet httpservlet;
HttpServletResponse httpservletresponse;
HttpServletRequest httpservletrequest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpservletrequest = mock(HttpServletRequest.class);
        pingservlet2mdbtopic = new PingServlet2MDBTopic();
        pingservlet2mdbtopic.doPost(httpservletrequest, httpservletresponse);
        verify(pingservlet2mdbtopic).doGet(httpservletrequest, httpservletresponse);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_oWUU0() {
    PingServlet2MDBTopic pingServlet2MDBTopic = new PingServlet2MDBTopic();
    String result = pingServlet2MDBTopic.getServletInfo();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_oWUU0_fid1() {
    PingServlet2MDBTopic pingServlet2MDBTopic = new PingServlet2MDBTopic();
    String result = pingServlet2MDBTopic.getServletInfo();
    assertEquals("web primitive, configured with trade runtime configs, tests Servlet to Session EJB path", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_nCvU0_MkDy0() throws ServletException, IOException {
    PingServlet2MDBTopic pingServlet2MDBTopic = new PingServlet2MDBTopic();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2MDBTopic.doGet(req, res);
    verify(req, times(1)).getMethod();
}
}