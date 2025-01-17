/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_JSFLoginFilter_Coverage_Test_Passing {
  private HttpServletRequest request;
  private HttpServletResponse response;
  private FilterChain chain;

  @BeforeEach
  @Test
  public void testDoFilter_FdJM1() throws IOException, ServletException {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilter_UserIDIsNullAndUrlContainsHome_bJar1_oLdK0() throws IOException, ServletException {
    JSFLoginFilter jsfLoginFilter = new JSFLoginFilter(); // Initialize the JSFLoginFilter
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    FilterChain chain = mock(FilterChain.class);
    when(request.getSession()).thenReturn(session);
    when(session.getAttribute("uidBean")).thenReturn(null);
    when(request.getServletPath()).thenReturn("/home");
    jsfLoginFilter.doFilter(request, response, chain);
    verify(response).sendRedirect("welcome.faces");
    verify(chain, never()).doFilter(any(ServletRequest.class), any(ServletResponse.class));
  }
}