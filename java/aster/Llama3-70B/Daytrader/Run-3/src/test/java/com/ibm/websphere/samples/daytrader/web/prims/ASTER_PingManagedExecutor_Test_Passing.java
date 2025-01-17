/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletOutputStream;
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
public class Aster_PingManagedExecutor_Test_Passing {
private static String initTime;
private static int hitCount;
PingManagedExecutor pingmanagedexecutor;
ServletConfig servletConfig;
HttpServletRequest httpservletrequest;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServlet httpservlet;
private ManagedExecutorService mes;
AsyncContext asyncContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httpservlet = mock(HttpServlet.class);
        pingmanagedexecutor = new PingManagedExecutor();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingmanagedexecutor.doPost(httpservletrequest, httpservletresponse);
        verify(pingmanagedexecutor).doGet(httpservletrequest, httpservletresponse);
    }
}