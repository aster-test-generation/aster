/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet2IncludeRcv_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_jMZW0() throws ServletException, IOException {
        PingServlet2IncludeRcv pingServlet2IncludeRcv = new PingServlet2IncludeRcv();
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        pingServlet2IncludeRcv.doGet(req, res);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_JqGv0() throws ServletException, IOException {
        PingServlet2IncludeRcv servlet = new PingServlet2IncludeRcv();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        servlet.doPost(req, res);
        verify(req).getAttributeNames(); // or any other method to verify doGet is called
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_IOException_ZFSv1() throws ServletException, IOException {
        PingServlet2IncludeRcv servlet = new PingServlet2IncludeRcv();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        try {
            servlet.doPost(req, res);
        } catch (IOException e) {
            assert false; // or any other assertion
        }
    }
}