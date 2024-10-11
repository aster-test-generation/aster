/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet2MDBTopic_Coverage_Test_Failing {
  private PingServlet2MDBTopic pingServlet2MDBTopic;
  private ServletConfig servletConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_jFny0() {
    try {
      PingServlet2MDBTopic pingServlet2MDBTopic = (PingServlet2MDBTopic) Class.forName("com.ibm.websphere.samples.daytrader.web.prims.ejb3.PingServlet2MDBTopic").getDeclaredConstructor().newInstance();
      String actual = pingServlet2MDBTopic.getServletInfo();
      assertNotNull(actual);
    } catch (Exception e) {
      fail("Exception occurred: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_CallsDoGet_WvXT0() throws Exception {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
    verify(request).getAttributeNames();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_NoException_oJBX1() throws Exception {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_appendInitTime_CpcC6() throws IOException, ServletException {
    PingServlet2MDBTopic pingServlet = new PingServlet2MDBTopic();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet.doGet(req, res);
    verify(res.getWriter(), times(1)).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_GwNB0() throws javax.servlet.ServletException {
    pingServlet2MDBTopic = new PingServlet2MDBTopic();
    servletConfig = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_SuperInitCalled_hDZy1() throws ServletException {
    pingServlet2MDBTopic.init(servletConfig);
    verify(servletConfig).getServletContext(); // assuming super.init(config) calls getServletContext()
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetServletInfo_jFny0_fid3() {
    PingServlet2MDBTopic pingServlet2MDBTopic = new PingServlet2MDBTopic();
    String expected = "web primitive, configured with trade runtime configs, tests Servlet to Session EJB path";
    String actual = pingServlet2MDBTopic.getServletInfo();
    assertEquals(expected, actual);
  }
}