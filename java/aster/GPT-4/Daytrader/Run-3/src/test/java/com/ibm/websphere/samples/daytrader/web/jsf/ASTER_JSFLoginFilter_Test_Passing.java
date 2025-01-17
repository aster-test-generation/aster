/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JSFLoginFilter_Test_Passing {
  @Mock
  private FilterConfig filterConfig;
  @Mock
  private HttpServletRequest httpservletrequest;
  @Mock
  private HttpSession httpsession;
  @Mock
  private HttpServletResponse httpservletresponse;
  @Mock
  private FilterChain filterChain;
  private JSFLoginFilter jsfLoginFilter;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilter_WithNullFilterConfig_SVRr0() throws IOException, ServletException {
    JSFLoginFilter filter = new JSFLoginFilter();
    ServletRequest req = mock(HttpServletRequest.class);
    ServletResponse resp = mock(HttpServletResponse.class);
    FilterChain chain = mock(FilterChain.class);
    filter.doFilter(req, resp, chain);
    verify(chain, never()).doFilter(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_GdvY0_ihdH0() {
    JSFLoginFilter jsfLoginFilter = new JSFLoginFilter();
    FilterConfig mockFilterConfig = org.mockito.Mockito.mock(FilterConfig.class);
    try {
      jsfLoginFilter.init(mockFilterConfig);
      Field filterConfigField = JSFLoginFilter.class.getDeclaredField("filterConfig");
      filterConfigField.setAccessible(true);
      assertNotNull(filterConfigField.get(jsfLoginFilter));
    } catch (ServletException | NoSuchFieldException | IllegalAccessException e) {
      fail("Exception was thrown");
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilter_UserLoggedIn_ProceedsChain_RlkD0() throws Exception {
    JSFLoginFilter jsfLoginFilter = new JSFLoginFilter();
    FilterConfig filterConfig = mock(FilterConfig.class);
    HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
    HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
    HttpSession httpsession = mock(HttpSession.class);
    FilterChain filterChain = mock(FilterChain.class);
    when(filterConfig.getInitParameter(anyString())).thenReturn("someValue");
    Field field = JSFLoginFilter.class.getDeclaredField("filterConfig");
    field.setAccessible(true);
    field.set(jsfLoginFilter, filterConfig);
    when(httpservletrequest.getSession()).thenReturn(httpsession);
    when(httpsession.getAttribute("uidBean")).thenReturn("user123");
    jsfLoginFilter.doFilter(httpservletrequest, httpservletresponse, filterChain);
    verify(filterChain).doFilter(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, never()).sendRedirect(anyString());
  }
}