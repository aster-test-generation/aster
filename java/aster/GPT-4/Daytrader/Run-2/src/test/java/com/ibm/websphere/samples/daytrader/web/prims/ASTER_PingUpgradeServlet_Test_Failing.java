/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpUpgradeHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingUpgradeServlet_Test_Failing {
  PingUpgradeServlet pingUpgradeServlet;
  HttpServletRequest httpServletRequest;
  HttpServletResponse httpServletResponse;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet() throws ServletException, IOException {
    httpServletRequest = mock(HttpServletRequest.class);
    httpServletResponse = mock(HttpServletResponse.class);
    pingUpgradeServlet = new PingUpgradeServlet();
    // Arrange
    // No specific setup required for this test beyond the initial mocks
    // Act
    pingUpgradeServlet.doGet(httpServletRequest, httpServletResponse);
    // Assert
    // Verify that doGet method internally calls doPost method
    verify(pingUpgradeServlet).doPost(httpServletRequest, httpServletResponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithUpgradeHeader_esDa0_CpIL0() throws IOException, ServletException {
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getHeader("Upgrade")).thenReturn("echo");
    servlet.doPost(request, response);
    verify(response).setStatus(101);
    verify(response).setHeader("Upgrade", "echo");
    verify(response).setHeader("Connection", "Upgrade");
    verify(request).upgrade(HttpUpgradeHandler.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGetCallsDoPost_Edmw0_hgoJ0() throws Exception {
    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    HttpServletResponse mockResponse = mock(HttpServletResponse.class);
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    servlet.doGet(mockRequest, mockResponse);
    verify(mockResponse, times(1)).sendRedirect(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPostWithUpgradeHeader_esDa0_CpIL0_fid2() throws IOException, ServletException {
    // Assuming PingUpgradeServlet is now accessible or correctly imported
    PingUpgradeServlet servlet = new PingUpgradeServlet();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(request.getHeader("Upgrade")).thenReturn("echo");
    servlet.doPost(request, response);
    verify(response).setStatus(101);
    verify(response).setHeader("Upgrade", "echo");
    verify(response).setHeader("Connection", "Upgrade");
    verify(request).upgrade(HttpUpgradeHandler.class);
  }
}