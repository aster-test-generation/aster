/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingSession3_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_mFMM0() {
        PingSession3 pingSession3 = new PingSession3();
        String expected = "HTTP Session Object: Tests management of a large custom session class";
        String actual = pingSession3.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_GYER0_MjJO0() throws javax.servlet.ServletException {
    PingSession3 pingSession3 = new PingSession3();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_PsAS1_tTJn0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingSession3 pingSession3 = new PingSession3();
    try {
        pingSession3.doGet(req, res);
    } catch (Exception e) {
        fail("doGet method should not throw any exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGetValidRequestParameter_nUmR3_fMuk0() throws ServletException, IOException {
    PingSession3 pingSession3 = new PingSession3();
    HttpServletRequest request = new MockHttpServletRequest();
    request.getParameterMap().put("num_objects", new String[]{"5"});
    HttpServletResponse response = new MockHttpServletResponse();
    pingSession3.doGet(request, response);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGetSessionDataNotNull_Obvy6_ditB0() throws javax.servlet.ServletException, java.io.IOException {
    PingSession3 pingSession3 = new PingSession3();
    HttpServletRequest request = new MockHttpServletRequest();
    request.getParameterMap().put("num_objects", new String[] {"5"});
    HttpServletResponse response = new MockHttpServletResponse();
    HttpSession session = request.getSession(true);
    session.setAttribute("sessiontest.sessionData", new PingSession3Object[5]);
    pingSession3.doGet(request, response);
}
}