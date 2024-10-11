/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import java.io.IOException;
import java.lang.reflect.Field;
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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JSFLoginFilter_Test_Passing {
  private JSFLoginFilter jsfLoginFilter;
  private HttpServletRequest httpServletRequest;
  private HttpServletResponse httpServletResponse;
  private HttpSession httpSession;
  private FilterChain filterChain;
  private FilterConfig filterConfig = null;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilterWithNullFilterConfig_NHZC0() throws IOException, ServletException {
    JSFLoginFilter filter = new JSFLoginFilter();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    FilterChain chain = mock(FilterChain.class);
    filter.doFilter(request, response, chain);
    verify(chain, never()).doFilter(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoFilterWithNullUserIDAndNonProtectedUrl_qIUR2_fid1() throws IOException, ServletException {
    JSFLoginFilter filter = new JSFLoginFilter();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    FilterChain chain = mock(FilterChain.class);
    when(request.getSession()).thenReturn(session);
    when(session.getAttribute("uidBean")).thenReturn(null);
    when(request.getServletPath()).thenReturn("login.faces");
    filter.doFilter(request, response, chain);
    verify(chain, never()).doFilter(request, response);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_rDhP0_jTur0() {
    JSFLoginFilter jsfLoginFilter = new JSFLoginFilter();
    FilterConfig mockFilterConfig = org.mockito.Mockito.mock(FilterConfig.class);
    try {
      jsfLoginFilter.init(mockFilterConfig);
      Field filterConfigField = JSFLoginFilter.class.getDeclaredField("filterConfig");
      filterConfigField.setAccessible(true);
      assertEquals(mockFilterConfig, filterConfigField.get(jsfLoginFilter));
    } catch (ServletException | NoSuchFieldException | IllegalAccessException e) {
      fail("Exception should not be thrown");
    }
  }
}