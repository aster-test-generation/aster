/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class Aster_PingServlet2Session2EntityCollection_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_Llzm0() {
        PingServlet2Session2EntityCollection pingServlet2Session2EntityCollection = new PingServlet2Session2EntityCollection();
        String expected = "web primitive, tests Servlet to Session to Entity returning a collection of Entity EJBs";
        String actual = pingServlet2Session2EntityCollection.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_VUeO0_dnJh0() throws javax.servlet.ServletException, java.io.IOException {
    PingServlet2Session2EntityCollection pingServlet2Session2EntityCollection = new PingServlet2Session2EntityCollection();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_HROC1_vvcy0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServlet2Session2EntityCollection pingServlet2Session2EntityCollection = new PingServlet2Session2EntityCollection();
    try {
        pingServlet2Session2EntityCollection.doGet(req, res);
    } catch (Exception e) {
        fail("doGet should not throw any exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_Hqjt0_EbWm0() throws IOException, ServletException {
    PingServlet2Session2EntityCollection pingServlet2Session2EntityCollection = new PingServlet2Session2EntityCollection();
    MockHttpServletRequest req = new MockHttpServletRequest();
    MockHttpServletResponse res = new MockHttpServletResponse();
    pingServlet2Session2EntityCollection.doGet(req, res);
}
}