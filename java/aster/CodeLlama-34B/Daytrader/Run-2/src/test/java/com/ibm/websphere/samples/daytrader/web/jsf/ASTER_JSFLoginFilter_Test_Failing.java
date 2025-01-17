/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JSFLoginFilter_Test_Failing {
  private FilterConfig filterConfig = null;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilter_ValidRequest_UserLoggedIn_Redirect_Flun7_pLhY0_1() throws IOException, ServletException {
    JSFLoginFilter filter = new JSFLoginFilter();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    FilterChain chain = mock(FilterChain.class);
    when(request.getSession()).thenReturn(mock(HttpSession.class));
    when(request.getServletPath()).thenReturn("home");
    filter.doFilter(request, response, chain);
    verify(response).sendRedirect("welcome.faces");
    assertNotNull(request);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilter_ValidRequest_UserLoggedIn_Redirect_Flun7_pLhY0_2() throws IOException, ServletException {
    JSFLoginFilter filter = new JSFLoginFilter();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    FilterChain chain = mock(FilterChain.class);
    when(request.getSession()).thenReturn(mock(HttpSession.class));
    when(request.getServletPath()).thenReturn("home");
    filter.doFilter(request, response, chain);
    verify(response).sendRedirect("welcome.faces");
    assertNotNull(response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilter_ValidRequest_UserLoggedIn_Redirect_Flun7_pLhY0_3() throws IOException, ServletException {
    JSFLoginFilter filter = new JSFLoginFilter();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    FilterChain chain = mock(FilterChain.class);
    when(request.getSession()).thenReturn(mock(HttpSession.class));
    when(request.getServletPath()).thenReturn("home");
    filter.doFilter(request, response, chain);
    verify(response).sendRedirect("welcome.faces");
    assertNotNull(chain);
  }
}