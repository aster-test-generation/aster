/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletBeanValSimple1_Coverage_Test_Passing {
  PingServletBeanValSimple1 cut = new PingServletBeanValSimple1();

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_CBJc0() {
    PingServletBeanValSimple1 obj = new PingServletBeanValSimple1();
    String expected = "Basic dynamic HTML generation through a servlet";
    String actual = obj.getServletInfo();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testMain_tsGi10_vKfc0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingServletBeanValSimple1 pingServletBeanValSimple1 = new PingServletBeanValSimple1();
    pingServletBeanValSimple1.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_iQUB0_MCBK0() throws javax.servlet.ServletException, java.io.IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    try {
      cut.doPost(req, res);
      verify(cut).doGet(req, res);
    } catch (ServletException | IOException e) {
      fail("Unexpected exception: " + e.getMessage());
    }
    HttpServletRequest req2 = mock(HttpServletRequest.class);
    HttpServletResponse res2 = mock(HttpServletResponse.class);
    doThrow(ServletException.class).when(cut).doGet(req2, res2);
    try {
      cut.doPost(req2, res2);
      fail("Expected ServletException not thrown");
    } catch (ServletException e) {
    } catch (IOException e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }
}