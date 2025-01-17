/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingServlet2Entity_Coverage_Test_Failing {
    private PingServlet2Entity pingServlet2Entity;
    private EntityManager em;
    private HttpServletRequest req;
    private HttpServletResponse res;
    private QuoteDataBean quote;
    private StringBuffer output;
    private int iter;
    private int ii;
    private Exception e;
    private int hitCount;
    private long initTime;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_CZYM0() {
        PingServlet2Entity pingServlet2Entity = new PingServlet2Entity();
        assertEquals("web primitive, tests Servlet to Entity EJB path", pingServlet2Entity.getServletInfo());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost1_lVNT0() throws ServletException, IOException {
        PingServlet2Entity servlet = new PingServlet2Entity();
        HttpServletRequest mockHttpServletRequest = null;
        HttpServletResponse mockHttpServletResponse = null;
        servlet.doPost(mockHttpServletRequest, mockHttpServletResponse);
    }
}