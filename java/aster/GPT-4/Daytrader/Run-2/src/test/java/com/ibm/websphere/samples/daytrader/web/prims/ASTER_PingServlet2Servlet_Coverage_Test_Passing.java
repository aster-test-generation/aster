/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet2Servlet_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_SetMessageInPingBean_lbRx5() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        PingServlet2Servlet servlet = new PingServlet2Servlet();
        servlet.doGet(req, res);
        verify(req).setAttribute(eq("ab"), argThat(bean -> ((PingBean)bean).getMsg().contains("Hit Count:")));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPostCompletesWithoutException_vTts1_Oobw0() throws javax.servlet.ServletException, java.io.IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServlet2Servlet servlet = new PingServlet2Servlet();
    try {
        servlet.doPost(request, response);
        assertTrue(true);
    } catch (ServletException | IOException e) {
        fail("doPost threw an exception: " + e.getMessage());
    }
}
}