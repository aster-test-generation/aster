/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockServletContext;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Include_Test_Passing {
@Mock
    private PingServlet2Include pingservlet2include;
@Mock
    private HttpServletResponse httpservletresponse;
@Mock
    private ServletConfig servletconfig;
@Mock
    private HttpServletRequest httprequest;
private static int hitCount;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception{
        httpservletresponse = mock(HttpServletResponse.class);
        servletconfig = mock(ServletConfig.class);
        httprequest = mock(HttpServletRequest.class);
        pingservlet2include = mock(PingServlet2Include.class);
        when(httprequest.getMethod()).thenReturn("POST");
        when(servletconfig.getServletContext()).thenReturn(new MockServletContext());
        pingservlet2include.doPost(httprequest, httpservletresponse);
        verify(httpservletresponse, times(1)).setStatus(HttpServletResponse.SC_OK);
    }
}