/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.util.Log;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletSetContentLength_Coverage_Test_Passing {
private HttpServletResponse res;
    private Log log;
    private PingServletSetContentLength pingServletSetContentLength;    
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_GetParameter_IdmK1_RPNR0_fid2() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    ServletOutputStream out = mock(ServletOutputStream.class);
    when(req.getParameter("contentLength")).thenReturn("10");
    when(res.getOutputStream()).thenReturn(out);
    PingServlet pingServlet = new PingServlet() {
        @Override
        public void init() throws ServletException {
            // Initialize servlet
        }
    };
    pingServlet.doGet(req, res);
    verify(req, times(1)).getParameter("contentLength");
}
}