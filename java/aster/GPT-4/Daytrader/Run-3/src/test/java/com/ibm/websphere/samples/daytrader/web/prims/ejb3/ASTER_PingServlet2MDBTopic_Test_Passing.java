/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.jms.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2MDBTopic_Test_Passing {
  @Mock
  private ServletConfig servletConfig;
  @InjectMocks
  private PingServlet2MDBTopic pingServlet2MDBTopic;
  @Mock
  private HttpServletRequest httpServletRequest;
  @Mock
  private HttpServletResponse httpServletResponse;
  @Mock
  private ConnectionFactory topicConnectionFactory;
  @Mock
  private Topic tradeStreamerTopic;
  @Mock
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;
  @Mock
  private Connection connection;
  @Mock
  private JMSContext jmsContext;
  @Mock
  private TextMessage textMessage;
  @InjectMocks
  private static int hitCount;
  private static String initTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws ServletException, IOException {
    // All necessary mocking setup is handled by annotations and MockitoExtension
    // Call the method under test
    pingServlet2MDBTopic.doPost(httpServletRequest, httpServletResponse);
    // Verify that doGet was called with the same request and response objects
    verify(pingServlet2MDBTopic).doGet(httpServletRequest, httpServletResponse);
    // Since doPost delegates to doGet, there are no direct outputs or state changes to assert on
    // The correctness of the delegation is asserted by verifying the call to doGet
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_VkHq0() throws ServletException, IOException {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    servlet.doPost(request, response);
    verify(servlet).doGet(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_XFFL0() {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    String result = servlet.getServletInfo();
    assertEquals("web primitive, configured with trade runtime configs, tests Servlet to Session EJB path", result);
  }
}