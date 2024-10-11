/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingServlet2Session2Entity2JSP_Coverage_Test_Failing {
  private ServletConfig config;
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_IxHa0() {
    PingServlet2Session2Entity2JSP servlet = new PingServlet2Session2Entity2JSP();
    String expected = "web primitive, tests Servlet to Session to Entity EJB to JSP path";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }
}