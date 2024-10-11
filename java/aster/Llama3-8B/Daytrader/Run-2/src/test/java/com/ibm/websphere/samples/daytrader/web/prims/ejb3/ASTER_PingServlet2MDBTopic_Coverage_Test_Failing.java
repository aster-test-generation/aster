/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingServlet2MDBTopic_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_Vmaz0() {
        PingServlet2MDBTopic pingServlet2MDBTopic = new PingServlet2MDBTopic();
        String result = pingServlet2MDBTopic.getServletInfo();
        assertEquals("web primitive, configured with trade runtime configs, tests Servlet to Session EJB path", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_InitTime_Tohd0() throws java.io.IOException, javax.servlet.ServletException {
        PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        servlet.doGet(req, res);
        assertEquals("<HR>initTime: ", res.getWriter().toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_HitCount_shGJ1() throws java.io.IOException, javax.servlet.ServletException {
        PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        servlet.doGet(req, res);
        assertEquals("<BR>Hit Count: 1", res.getWriter().toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_MessageText_kxzD2() throws java.io.IOException, javax.servlet.ServletException {
        PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        servlet.doGet(req, res);
        assertEquals("<BR>Message text: Ping message for topic java:comp/env/jms/TradeStreamerTopic sent from PingServlet2MDBTopic at ", res.getWriter().toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_OutputAppend_wAOg9() throws java.io.IOException, javax.servlet.ServletException {
        PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        servlet.doGet(req, res);
        assertEquals("<HR>Posted Text message to java:comp/env/jms/TradeStreamerTopic topic", res.getWriter().toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_LogError_bswT10_OWaf0() throws java.io.IOException, javax.servlet.ServletException {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest req = new MockHttpServletRequest();
    HttpServletResponse res = new MockHttpServletResponse();
    servlet.doGet(req, res);
    assertEquals("PingServlet2MDBTopic.doGet(...):exception posting message to TradeStreamerTopic topic", res.getWriter().toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SendError_Buvz12_qPpS0() throws java.io.IOException, javax.servlet.ServletException {
    PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
    HttpServletRequest req = new MockHttpServletRequest();
    HttpServletResponse res = new MockHttpServletResponse();
    servlet.doGet(req, res);
    assertEquals(500, res.getStatus());
}
}