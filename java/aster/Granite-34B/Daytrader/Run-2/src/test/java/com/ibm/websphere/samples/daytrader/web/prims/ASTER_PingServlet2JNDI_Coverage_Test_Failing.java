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

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingServlet2JNDI_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_Wdzx0_Mkmc0() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        PingServlet2JNDI servlet = new PingServlet2JNDI();
        try {
            servlet.doGet(req, res);
        } catch (ServletException | IOException e) {
            fail("Exception occurred");
        }
    }
}