/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockServletConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletLargeContentLength_Test_Failing {
  PingServletLargeContentLength pingServletLargeContentLength;
  ServletConfig mockServletConfig;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;
  HttpServletRequest request;
  HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit() throws Exception {
    pingServletLargeContentLength = new PingServletLargeContentLength();
    mockServletConfig = mock(ServletConfig.class);
    pingServletLargeContentLength.init(mockServletConfig);
    verify(mockServletConfig, times(1)).getServletContext();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_qKLc0() {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    ServletConfig config = new MockServletConfig();
    try {
      servlet.init(config);
    } catch (ServletException e) {
      e.printStackTrace();
    }
    assertNotNull(servlet);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost() throws ServletException, IOException {
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    pingServletLargeContentLength = new PingServletLargeContentLength();
    // Arrange
    long expectedContentLength = 1500L;
    when(httpServletRequest.getContentLengthLong()).thenReturn(expectedContentLength);
    // Act
    pingServletLargeContentLength.doPost(httpServletRequest, httpServletResponse);
    // Assert
    verify(httpServletRequest).getContentLengthLong();
    assertEquals(expectedContentLength, httpServletRequest.getContentLengthLong());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostContentLength_jwlQ0() throws ServletException, IOException {
    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    HttpServletResponse mockResponse = mock(HttpServletResponse.class);
    when(mockRequest.getContentLengthLong()).thenReturn(1500L);
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    servlet.doPost(mockRequest, mockResponse);
    verify(mockRequest).getContentLengthLong();
    assertEquals(1500L, mockRequest.getContentLengthLong());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_uuEw0() {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    String expected = "Basic dynamic HTML generation through a servlet.";
    assertEquals(expected, servlet.getServletInfo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet() throws Exception {
    request = mock(HttpServletRequest.class);
    response = mock(HttpServletResponse.class);
    pingServletLargeContentLength = new PingServletLargeContentLength();
    // Setup
    doNothing().when(response).sendRedirect(anyString());
    // Execute
    pingServletLargeContentLength.doGet(request, response);
    // Verify
    verify(pingServletLargeContentLength, times(1)).doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetCallsDoPost_pkwp0() throws Exception {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    servlet.doGet(request, response);
    verify(servlet).doPost(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_uuEw0_fid1() {
    PingServletLargeContentLength servlet = new PingServletLargeContentLength();
    String expected = "Basic dynamic HTML generation through a servlet, with contentLength set by contentLength parameter.";
    assertEquals(expected, servlet.getServletInfo());
  }
}