/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingManagedThread_Test_Passing {
  PingManagedThread pingManagedThread;
  ServletConfig servletConfig;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  @Mock
  private ManagedThreadFactory managedThreadFactory;
  @Mock
  private HttpServletRequest httpservletrequest;
  @Mock
  private HttpServletResponse httpservletresponse;
  @Mock
  private ServletOutputStream servletoutputstream;
  @Mock
  private AsyncContext asyncContext;
  private static String initTime;
  private static int hitCount;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws Exception {
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    pingManagedThread = new PingManagedThread();
    // Setup the environment to capture the delegation to doGet
    pingManagedThread.doPost(httpServletRequest, httpServletResponse);
    // Verify that doGet is called exactly once with the same request and response objects
    verify(pingManagedThread, times(1)).doGet(httpServletRequest, httpServletResponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostCallsDoGet_JDAW0() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingManagedThread pingManagedThread = new PingManagedThread();
    pingManagedThread.doPost(request, response);
    verify(request, atLeastOnce()).getMethod();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_OAoU0() {
    PingManagedThread pingManagedThread = new PingManagedThread();
    String result = pingManagedThread.getServletInfo();
    assertEquals("Tests a ManagedThread asynchronous servlet", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet() throws Exception {
    when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
    when(httpservletrequest.startAsync()).thenReturn(asyncContext);
    // Arrange
    Thread mockThread = new Thread();
    when(managedThreadFactory.newThread(any(Runnable.class))).thenReturn(mockThread);
    // Act
    pingManagedThread.doGet(httpservletrequest, httpservletresponse);
    // Assert
    verify(httpservletresponse).setContentType("text/html");
    verify(httpservletresponse.getOutputStream()).println(startsWith("<html><head><title>Ping ManagedThread</title></head>"));
    verify(managedThreadFactory).newThread(any(Runnable.class));
    verify(mockThread).start();
    verify(asyncContext, never()).complete(); // Should not be completed synchronously
    // Check that the output stream was used to write the initial HTML content
    verify(servletoutputstream).println(contains("Init time :"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_aRcP0() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext asyncContext = mock(AsyncContext.class);
    ServletOutputStream servletOutputStream = mock(ServletOutputStream.class);
    when(req.startAsync()).thenReturn(asyncContext);
    when(res.getOutputStream()).thenReturn(servletOutputStream);
    PingManagedThread servlet = new PingManagedThread();
    servlet.doGet(req, res);
    verify(req).startAsync();
    verify(res).setContentType("text/html");
    verify(servletOutputStream).println(anyString());
    verify(asyncContext).complete();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_ORhC0_1() throws ServletException {
    servletConfig = mock(ServletConfig.class);
    pingManagedThread = new PingManagedThread();
    pingManagedThread.init(servletConfig);
    assertNotNull(initTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_ORhC0_2() throws ServletException {
    servletConfig = mock(ServletConfig.class);
    pingManagedThread = new PingManagedThread();
    pingManagedThread.init(servletConfig);
    assertEquals(0, hitCount);
  }
}