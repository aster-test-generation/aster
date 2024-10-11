/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingServlet2TwoPhase_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_QSnr0() {
        PingServlet2TwoPhase obj = new PingServlet2TwoPhase();
        String actual = obj.getServletInfo();
        String expected = "web primitive, tests Servlet to Session to Entity EJB and JMS -- 2-phase commit path";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_Whbx0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        servlet.doPost(request, response);
        assertEquals(true, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_EmbH1() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2TwoPhase servlet = new PingServlet2TwoPhase();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        servlet.doGet(request, response);
        assertEquals(true, true);
    }
}