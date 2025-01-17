/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_PingServlet2JNDI_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_Znqj0_QYOl0() {
        PingServlet2JNDI servlet = new PingServlet2JNDI();
        String expected = "Basic JNDI look up of a JDBC DataSource";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetWriter_vwOz2_zRTC0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2JNDI servlet = new PingServlet2JNDI();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        try {
            servlet.doGet(req, res);
            assertNotNull(res.getWriter());
        } catch (ServletException | IOException e) {
            fail("Exception caught: " + e.toString());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAppend3_aGXj6_sVJx0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2JNDI servlet = new PingServlet2JNDI();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        try {
            servlet.doGet(req, res);
            StringBuffer output = new StringBuffer(100);
            output.append("<HR></body></html>");
            assertEquals(output.toString(), res.getWriter().toString());
        } catch (ServletException | IOException e) {
            fail("Exception caught: " + e.toString());
        }
    }
}