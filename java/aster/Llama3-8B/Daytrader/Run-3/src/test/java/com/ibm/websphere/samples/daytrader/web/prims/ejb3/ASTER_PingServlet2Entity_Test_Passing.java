/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
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
public class Aster_PingServlet2Entity_Test_Passing {
PingServlet2Entity pingservlet2entity;
HttpServletResponse httpservletresponse;
HttpServletRequest httpServletRequest;
HttpServlet httpservlet;
private static String initTime;
private static int hitCount;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        httpServletRequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingservlet2entity = new PingServlet2Entity();
        // Given
        when(httpServletRequest.getMethod()).thenReturn("POST");
        // When
        pingservlet2entity.doPost(httpServletRequest, httpservletresponse);
        // Then
        verify(httpservletresponse, times(1)).sendRedirect(any(String.class));
        verify(httpservletresponse, times(1)).setStatus(HttpServletResponse.SC_OK);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
    }
}