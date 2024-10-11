/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingServlet2Session2EntityCollection_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_Cnct0() {
        PingServlet2Session2EntityCollection pingServlet2Session2EntityCollection = new PingServlet2Session2EntityCollection();
        String expected = "web primitive, tests Servlet to Session to Entity returning a collection of Entity EJBs";
        String actual = pingServlet2Session2EntityCollection.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_vdLf0() throws ServletException, IOException {
        PingServlet2Session2EntityCollection pingServlet2Session2EntityCollection = new PingServlet2Session2EntityCollection();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getMethod()).thenReturn("POST");
        pingServlet2Session2EntityCollection.doPost(request, response);
        verify(request).getMethod();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_InitialSetup_zqYh0_RTae0() throws java.io.IOException, javax.servlet.ServletException {
    PingServlet2Session2EntityCollection pingServlet2Session2EntityCollection = new PingServlet2Session2EntityCollection();
    MockHttpServletRequest req = new MockHttpServletRequest();
    MockHttpServletResponse res = new MockHttpServletResponse();
    pingServlet2Session2EntityCollection.doGet(req, res);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_RndUserID_XWuD16_hQEG0() throws java.io.IOException, javax.servlet.ServletException {
    PingServlet2Session2EntityCollection pingServlet2Session2EntityCollection = new PingServlet2Session2EntityCollection();
    HttpServletRequest req = new MockHttpServletRequest();
    HttpServletResponse res = new MockHttpServletResponse();
    pingServlet2Session2EntityCollection.doGet(req, res);
    Assertions.assertNotNull(TradeConfig.rndUserID());
}
}