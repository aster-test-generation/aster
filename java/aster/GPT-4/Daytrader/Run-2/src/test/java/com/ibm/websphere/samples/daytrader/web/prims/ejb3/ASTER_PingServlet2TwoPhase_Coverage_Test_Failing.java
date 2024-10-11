/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import java.io.IOException;
import javax.servlet.ServletConfig;
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
public class Aster_PingServlet2TwoPhase_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_mdAc0() {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        String expected = "web primitive, tests Servlet to Session to Entity EJB and JMS -- 2-phase commit path";
        assertEquals(expected, servlet.getServletInfo());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitCompletesWithoutException_nMgs4() throws javax.servlet.ServletException {
        ServletConfig mockConfig = org.mockito.Mockito.mock(ServletConfig.class);
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        try {
            servlet.init(mockConfig);
        } catch (ServletException e) {
            fail("Init should not throw ServletException");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCompletesWithoutException_vegP1() throws ServletException, IOException {
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        HttpServletResponse mockResponse = mock(HttpServletResponse.class);
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        servlet.doPost(mockRequest, mockResponse);
    }
}