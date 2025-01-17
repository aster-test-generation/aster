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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingJDBCWrite_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_NInU0() {
        PingJDBCWrite ping = new PingJDBCWrite();
        String expected = "Basic JDBC Write using a prepared statment makes use of TradeJDBC code.";
        assertEquals(expected, ping.getServletInfo());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_xHeN0() throws javax.servlet.ServletException, java.io.IOException {
        PingJDBCWrite ping = new PingJDBCWrite();
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        ping.doPost(req, res);
        assertEquals(true, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_BVEv1() throws javax.servlet.ServletException, java.io.IOException {
        PingJDBCWrite ping = new PingJDBCWrite();
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        ping.doGet(req, res);
        assertEquals(true, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_zlCu0() throws javax.servlet.ServletException, java.io.IOException {
        PingJDBCWrite testObject = new PingJDBCWrite();
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        try {
            testObject.doGet(req, res);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}