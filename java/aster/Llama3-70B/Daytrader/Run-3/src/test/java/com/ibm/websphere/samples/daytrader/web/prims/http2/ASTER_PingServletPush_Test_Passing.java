/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;
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
public class Aster_PingServletPush_Test_Passing {
private static String initTime;
private static int hitCount;
PingServletPush pingservletpush;
HttpServlet httpservlet;
ServletConfig servletConfig;
HttpServletRequest httpservletrequest;
HttpServletResponse httpservletresponse;
PushBuilder pushBuilder;
PrintWriter printWriter;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoGet() throws Exception {
    httpservletrequest = mock(HttpServletRequest.class);
    httpservletresponse = mock(HttpServletResponse.class);
    pushBuilder = mock(PushBuilder.class);
    printWriter = mock(PrintWriter.class);
    pingservletpush = new PingServletPush();
    when(httpservletrequest.newPushBuilder()).thenReturn(pushBuilder);
    when(httpservletresponse.getWriter()).thenReturn(printWriter);
    pingservletpush.doGet(httpservletrequest, httpservletresponse);
    verify(pushBuilder).path("images/graph.gif");
    verify(pushBuilder).push();
    verify(printWriter).write(anyString());
  }
}