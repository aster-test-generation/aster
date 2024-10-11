/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletBeanValCDI_Coverage_Test_Failing {
private HttpServletResponse res;
private PingServletBeanValCDI pingServletBeanValCDI;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_SuperInitCalled_TNLX1_njCq0() throws ServletException {
    PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
    ServletConfig servletConfig = mock(ServletConfig.class);
    when(servletConfig.getServletContext()).thenReturn(null);
    pingServletBeanValCDI.init(servletConfig);
    verify(servletConfig, times(1)).getServletContext(); 
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_CallsDoGet_fpkx1_aovs0() throws Exception {
    PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServletBeanValCDI.doGet(req, res); 
    verify(req, times(1)).getAttributeNames();
    verify(res, times(1)).getOutputStream();
}
}