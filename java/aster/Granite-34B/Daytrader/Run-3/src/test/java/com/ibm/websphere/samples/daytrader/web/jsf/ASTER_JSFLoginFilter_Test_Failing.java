/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.util.concurrent.TimeUnit;
import javax.servlet.FilterConfig;
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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JSFLoginFilter_Test_Failing {
  private FilterConfig filterConfig = null;
  JSFLoginFilter jsfloginfilter;
  HttpServletRequest httpservletrequest;
  HttpSession httpsession;
  HttpServletResponse httpservletresponse;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoFilter() throws Exception {
    httpservletrequest = mock(HttpServletRequest.class);
    httpsession = mock(HttpSession.class);
    httpservletresponse = mock(HttpServletResponse.class);
    jsfloginfilter = new JSFLoginFilter();
    when(httpservletrequest.getSession()).thenReturn(httpsession);
    when(httpsession.getAttribute("uidBean")).thenReturn(null);
    when(httpservletrequest.getServletPath()).thenReturn("/home");
    jsfloginfilter.doFilter(httpservletrequest, httpservletresponse, null);
    verify(httpservletresponse).sendRedirect("welcome.faces");
  }
}