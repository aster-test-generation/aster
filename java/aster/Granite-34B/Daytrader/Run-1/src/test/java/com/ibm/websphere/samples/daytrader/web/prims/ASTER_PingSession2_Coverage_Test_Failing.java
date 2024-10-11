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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingSession2_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_1_ItBC0() {
        PingSession2 testee = new PingSession2();
        String actual = testee.getServletInfo();
        assertEquals("HTTP Session Key: Tests management of a read/write unique id", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_KrpR0() throws javax.servlet.ServletException, java.io.IOException {
        PingSession2 testee = new PingSession2();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        try {
            testee.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_dHXJ1() throws javax.servlet.ServletException, java.io.IOException {
        PingSession2 testee = new PingSession2();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpSession session = null;
        try {
            session = request.getSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            testee.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_ZidI2() throws javax.servlet.ServletException, java.io.IOException {
        PingSession2 testee = new PingSession2();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpSession session = null;
        try {
            session = request.getSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer ival = (Integer) session.getAttribute("sessiontest.counter");
        try {
            testee.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_jNzJ3() throws javax.servlet.ServletException, java.io.IOException {
        PingSession2 testee = new PingSession2();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpSession session = null;
        try {
            session = request.getSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer ival = (Integer) session.getAttribute("sessiontest.counter");
        if (ival == null) {
            ival = new Integer(1);
        }
        try {
            testee.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_VWRv4() throws javax.servlet.ServletException, java.io.IOException {
        PingSession2 testee = new PingSession2();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpSession session = null;
        try {
            session = request.getSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer ival = (Integer) session.getAttribute("sessiontest.counter");
        if (ival == null) {
            ival = new Integer(1);
        } else {
            ival = new Integer(ival.intValue() + 1);
        }
        try {
            testee.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_LQKu5() throws javax.servlet.ServletException, java.io.IOException {
        PingSession2 testee = new PingSession2();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpSession session = null;
        try {
            session = request.getSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer ival = (Integer) session.getAttribute("sessiontest.counter");
        if (ival == null) {
            ival = new Integer(1);
        } else {
            ival = new Integer(ival.intValue() + 1);
        }
        session.setAttribute("sessiontest.counter", ival);
        try {
            testee.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test7_lUAe6() throws javax.servlet.ServletException, java.io.IOException {
        PingSession2 testee = new PingSession2();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        HttpSession session = null;
        try {
            session = request.getSession(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Integer ival = (Integer) session.getAttribute("sessiontest.counter");
        if (ival == null) {
            ival = new Integer(1);
        } else {
            ival = new Integer(ival.intValue() + 1);
        }
        session.setAttribute("sessiontest.counter", ival);
        if (ival.intValue() == 5) {
            session.invalidate();
        }
        try {
            testee.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}