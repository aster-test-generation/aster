/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingUpgradeServlet_Test_Passing {
PingUpgradeServlet pingupgradeservlet;
HttpServletRequest httpservletrequest;
HttpServletResponse httpservletresponse;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        pingupgradeservlet = new PingUpgradeServlet();
        // Given
        when(httpservletrequest.getMethod()).thenReturn("GET");
        // When
        pingupgradeservlet.doGet(httpservletrequest, httpservletresponse);
        // Then
        verify(httpservletrequest, times(1)).getMethod();
        verify(httpservletresponse, times(1)).sendError(HttpServletResponse.SC_OK);
        verify(httpservletresponse, times(1)).flushBuffer();
    }
}