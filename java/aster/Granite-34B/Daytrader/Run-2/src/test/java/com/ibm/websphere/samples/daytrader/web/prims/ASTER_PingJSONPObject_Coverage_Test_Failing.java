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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingJSONPObject_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_lDaK0() {
        PingJSONPObject obj = new PingJSONPObject();
        String expected = "Basic JSON generation and parsing in a servlet";
        String actual = obj.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_oUVu0() throws javax.servlet.ServletException {
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        pingJSONPObject.init(null);
        assertNotNull(pingJSONPObject);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_SjaL0() throws javax.servlet.ServletException, java.io.IOException {
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        try {
            pingJSONPObject.doPost(req, res);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_RDZR1() throws javax.servlet.ServletException, java.io.IOException {
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        try {
            pingJSONPObject.doGet(req, res);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet0_NFyg0() throws Exception {
        PingJSONPObject obj = new PingJSONPObject();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        obj.doGet(req, res);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet1_tRvy1() throws Exception {
        PingJSONPObject obj = new PingJSONPObject();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        obj.doGet(req, res);
        assertEquals(0, res.getStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet2_DNAZ2_2() throws Exception {
        PingJSONPObject obj = new PingJSONPObject();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        obj.doGet(req, res);
        assertEquals("text/html", res.getContentType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet2_DNAZ2() throws Exception {
        PingJSONPObject obj = new PingJSONPObject();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        obj.doGet(req, res);
        assertEquals(0, res.getStatus());
        assertEquals("text/html", res.getContentType());
    }
}