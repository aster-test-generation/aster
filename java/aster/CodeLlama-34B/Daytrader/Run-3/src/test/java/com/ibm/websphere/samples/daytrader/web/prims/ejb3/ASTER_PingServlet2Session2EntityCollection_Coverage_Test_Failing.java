/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingServlet2Session2EntityCollection_Coverage_Test_Failing {
  private HoldingDataBean holdingDataBean;
  private ServletConfig config;
  private HttpServletResponse response;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_pmuJ0() {
    PingServlet2Session2EntityCollection servlet = new PingServlet2Session2EntityCollection();
    String expected = "web primitive, tests Servlet to Session to Entity returning a collection of Entity EJBs";
    String actual = servlet.getServletInfo();
    assertEquals(expected, actual);
  }
}