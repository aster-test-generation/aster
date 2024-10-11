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

public class Aster_PingServlet2MDBTopic_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getServletInfoTest1_yUaU0() {
        PingServlet2MDBTopic testObject = new PingServlet2MDBTopic();
        String actualValue = testObject.getServletInfo();
        String expectedValue = "web primitive, configured with trade runtime configs, tests Servlet to Session EJB path";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_WlxD0() throws java.io.IOException, javax.servlet.ServletException {
        PingServlet2MDBTopic testObject = new PingServlet2MDBTopic();
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        try {
            testObject.doGet(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}