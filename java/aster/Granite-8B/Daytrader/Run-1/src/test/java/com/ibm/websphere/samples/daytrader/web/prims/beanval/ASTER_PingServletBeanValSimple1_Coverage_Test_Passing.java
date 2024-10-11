/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletBeanValSimple1_Coverage_Test_Passing {
PingServletBeanValSimple1 servlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_2_WZEG1_NOJd0() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingServletBeanValSimple1 servlet = new PingServletBeanValSimple1();
        servlet.init();
        when(request.getContentType()).thenReturn("text/html");
        response.setContentType("text/html");
        SimpleBean1 simpleBean1 = new SimpleBean1();
        simpleBean1.checkInjectionValidation();
        servlet.doGet(request, response);
        verify(request, atLeastOnce()).getContentType();
        verify(response, atLeastOnce()).setContentType(anyString());
    }
}