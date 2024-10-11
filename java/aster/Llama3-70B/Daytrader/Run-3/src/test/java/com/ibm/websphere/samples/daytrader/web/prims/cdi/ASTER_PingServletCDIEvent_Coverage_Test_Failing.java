/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import java.io.IOException;
import java.io.PrintWriter;
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
public class Aster_PingServletCDIEvent_Coverage_Test_Failing {
private ServletConfig servletConfig;
private PrintWriter printWriter;
private PingServletCDIEvent pingServletCDIEvent;
    private PrintWriter pw;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_GetWriter_gTbt2_EIBD0() throws IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter pw = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(pw);
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
    pingServletCDIEvent.doGet(request, response);
    verify(response, times(1)).getWriter();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_SRBN0() throws javax.servlet.ServletException {
        pingServletCDIEvent = new PingServletCDIEvent();
        servletConfig = mock(ServletConfig.class);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_ojzg0_lrig0_fid3() throws java.io.IOException {
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent();
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter printWriter = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(printWriter);
    HttpServletRequest request = mock(HttpServletRequest.class);
    pingServletCDIEvent.doGet(request, response);
}
}