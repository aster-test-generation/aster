/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingSession1_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_rRgn0() {
        PingSession1 testee = new PingSession1();
        String expected = "HTTP Session Key: Tests management of a read only unique id";
        String actual = testee.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_kCiU0() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        PingSession1 pingSession1 = new PingSession1();
        pingSession1.doPost(req, res);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponse_HYHJ0() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PingSession1 testObject = new PingSession1();
        try {
            testObject.doGet(request, response);
        } catch (ServletException | IOException e) {
            fail("Exception is not expected.");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponseException_EJuT1() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PingSession1 testObject = new PingSession1();
        try {
            testObject.doGet(request, response);
        } catch (ServletException | IOException e) {
            assertEquals("Exception is expected.", e.getMessage(), "Exception is expected.");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponseSession_CyhV2() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PingSession1 testObject = new PingSession1();
        try {
            HttpSession session = request.getSession(true);
            testObject.doGet(request, response);
        } catch (ServletException | IOException e) {
            fail("Exception is not expected.");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponseSessionException_rkCP3() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PingSession1 testObject = new PingSession1();
        try {
            HttpSession session = request.getSession(true);
            testObject.doGet(request, response);
        } catch (ServletException | IOException e) {
            assertEquals("Exception is expected.", e.getMessage(), "Exception is expected.");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponseSessionhitCount_HBtF4() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PingSession1 testObject = new PingSession1();
        try {
            HttpSession session = request.getSession(true);
            Integer ival = (Integer) session.getAttribute("sessiontest.counter");
            testObject.doGet(request, response);
        } catch (ServletException | IOException e) {
            fail("Exception is not expected.");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponseSessionhitCountException_oQal5() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PingSession1 testObject = new PingSession1();
        try {
            HttpSession session = request.getSession(true);
            Integer ival = (Integer) session.getAttribute("sessiontest.counter");
            testObject.doGet(request, response);
        } catch (ServletException | IOException e) {
            assertEquals("Exception is expected.", e.getMessage(), "Exception is expected.");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHttpServletRequestHttpServletResponseSessionhitCountSessionID_ZWpY6() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PingSession1 testObject = new PingSession1();
        try {
            HttpSession session = request.getSession(true);
            Integer ival = (Integer) session.getAttribute("sessiontest.counter");
            String SessionID = "SessionID:" + ival.toString();
            testObject.doGet(request, response);
        } catch (ServletException | IOException e) {
            fail("Exception is not expected.");
        }
    }
}