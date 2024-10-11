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
public class Aster_PingServletCDIEvent_Coverage_Test_Passing {
private ServletConfig servletConfig;
private PrintWriter printWriter;
private PingServletCDIEvent pingServletCDIEvent;
    private PrintWriter pw;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_ojzg0_lrig0() throws java.io.IOException {
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter printWriter = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(printWriter);
    HttpServletRequest request = mock(HttpServletRequest.class);
    PingServletCDIEvent pingServletCDIEvent = new PingServletCDIEvent() {
        @Override
        public void init() throws ServletException {
            // Initialize the servlet
        }
    };
    pingServletCDIEvent.doGet(request, response);
    verify(response).getWriter();
}
}