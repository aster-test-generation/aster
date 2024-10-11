/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet31AsyncRead_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_FEjU0() {
        PingServlet31AsyncRead pingServlet31AsyncRead = new PingServlet31AsyncRead();
        String expected = "Basic dynamic HTML generation through a servlet";
        String actual = pingServlet31AsyncRead.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_yXPO0_RzBb1() throws ServletException, IOException {
    PingServlet31AsyncRead pingServlet31AsyncRead = new PingServlet31AsyncRead();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPostContentType_yqUw1_Pnxx0() throws ServletException, IOException {
    PingServlet31AsyncRead pingServlet31AsyncRead = new PingServlet31AsyncRead();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(res.getContentType()).thenReturn("text/html");
    pingServlet31AsyncRead.doGet(req, res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPostStartAsync_RWgm2_PcDr0() throws ServletException, IOException {
    PingServlet31AsyncRead pingServlet31AsyncRead = new PingServlet31AsyncRead();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    AsyncContext ac = mock(AsyncContext.class);
    when(req.startAsync()).thenReturn(ac);
    pingServlet31AsyncRead.doGet(req, res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
        public void dispatch_QLxG1() throws IOException {
        }
}