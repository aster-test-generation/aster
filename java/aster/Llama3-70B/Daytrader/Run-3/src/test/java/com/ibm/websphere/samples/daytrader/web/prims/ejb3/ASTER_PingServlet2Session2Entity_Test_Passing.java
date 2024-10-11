/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.fail;
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
public class Aster_PingServlet2Session2Entity_Test_Passing {
private static int hitCount;
private static String initTime;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_MGPd0() throws ServletException, IOException {
    PingServlet2Session2Entity pingServlet2Session2Entity = new PingServlet2Session2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingServlet2Session2Entity.doPost(req, res);
    verify(req, times(1)).getMethod();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetServletInfo_LybU0() {
    PingServlet2Session2Entity pingServlet2Session2Entity = new PingServlet2Session2Entity();
    String result = pingServlet2Session2Entity.getServletInfo();
    assert "web primitive, tests Servlet to Session to Entity EJB path".equals(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_IOException_doGs1() {
    PingServlet2Session2Entity pingServlet2Session2Entity = new PingServlet2Session2Entity();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
        when(req.getContentType()).thenReturn("text/html");
        when(res.getWriter()).thenThrow(new IOException());
        pingServlet2Session2Entity.doGet(req, res);
        fail("IOException should be thrown");
    } catch (IOException e) {
        assert true;
    } catch (ServletException e) {
        fail("ServletException should not be thrown");
    }
}
}