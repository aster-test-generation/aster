/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JSFLoginFilter_Test_Passing {
private FilterConfig filterConfig = null;
JSFLoginFilter jsfloginfilter;
HttpServletRequest httpservletrequest;
HttpSession httpsession;
HttpServletResponse httpservletresponse;
FilterChain filterChain;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDestroy_ckIp0_uqBN0() {
    JSFLoginFilter jsfLoginFilter = new JSFLoginFilter();
    jsfLoginFilter.destroy();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoFilter_UserLoggedIn_NOPa0() throws Exception {
    httpservletrequest = mock(HttpServletRequest.class);
    httpsession = mock(HttpSession.class);
    httpservletresponse = mock(HttpServletResponse.class);
    filterChain = mock(FilterChain.class);
    jsfloginfilter = new JSFLoginFilter();
    Field filterConfigField = JSFLoginFilter.class.getDeclaredField("filterConfig");
    filterConfigField.setAccessible(true);
    filterConfigField.set(jsfloginfilter, mock(FilterConfig.class));
    when(httpservletrequest.getSession()).thenReturn(httpsession);
    when(httpsession.getAttribute("uidBean")).thenReturn("someUserId");
    when(httpservletrequest.getServletPath()).thenReturn("home");
    jsfloginfilter.doFilter(httpservletrequest, httpservletresponse, filterChain);
    verify(filterChain).doFilter(httpservletrequest, httpservletresponse);
    verify(httpservletresponse, never()).sendRedirect("welcome.faces");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoFilter_UserNotLoggedIn_OebZ0() throws Exception {
    HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
    HttpSession httpsession = mock(HttpSession.class);
    HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
    FilterChain filterChain = mock(FilterChain.class);
    JSFLoginFilter jsfloginfilter = new JSFLoginFilter();
    Field filterConfigField = JSFLoginFilter.class.getDeclaredField("filterConfig");
    filterConfigField.setAccessible(true);
    filterConfigField.set(jsfloginfilter, mock(FilterConfig.class));
    when(httpservletrequest.getSession()).thenReturn(httpsession);
    when(httpsession.getAttribute("uidBean")).thenReturn(null);
    when(httpservletrequest.getServletPath()).thenReturn("home");
    jsfloginfilter.doFilter(httpservletrequest, httpservletresponse, filterChain);
    verify(httpservletresponse).sendRedirect("welcome.faces");
    verify(filterChain, never()).doFilter(any(ServletRequest.class), any(ServletResponse.class));
}
}