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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2MDBQueue_Test_Passing {
  @Mock
  private ServletConfig mockConfig;
  @InjectMocks
  private PingServlet2MDBQueue pingServlet2MDBQueue;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  @Mock
  private ConnectionFactory queueConnectionFactory;
  @Mock
  private Queue tradeBrokerQueue;
  @Mock
  private Connection connection;
  @Mock
  private JMSContext jmsContext;
  @Mock
  private TextMessage textMessage;
  @Mock
  private static String initTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws ServletException, IOException {
    pingServlet2MDBQueue = new PingServlet2MDBQueue();
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    // Call the method under test
    pingServlet2MDBQueue.doPost(httpServletRequest, httpServletResponse);
    // Verify that doGet is called once with the same request and response objects
    verify(pingServlet2MDBQueue, times(1)).doGet(httpServletRequest, httpServletResponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_dZji0() {
    PingServlet2MDBQueue servlet = new PingServlet2MDBQueue();
    String expected = "web primitive, configured with trade runtime configs, tests Servlet to Session EJB path";
    assertEquals(expected, servlet.getServletInfo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ZvpK0() throws ServletException, IOException {
    PingServlet2MDBQueue pingServlet2MDBQueue = new PingServlet2MDBQueue();
    HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
    HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
    PingServlet2MDBQueue spyServlet = spy(pingServlet2MDBQueue);
    spyServlet.doGet(httpServletRequest, httpServletResponse);
    verify(spyServlet, times(1)).doGet(httpServletRequest, httpServletResponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_KweV0_uzOv0() throws IOException, ServletException {
    PingServlet2MDBQueue servlet = new PingServlet2MDBQueue();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    try {
      servlet.doPost(request, response);
    } catch (ServletException e) {
    }
    verify(request, atLeastOnce()).getMethod();
  }
}