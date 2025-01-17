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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ExplicitGC_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_Euwp0() throws javax.servlet.ServletException {
    ExplicitGC explicitGC = new ExplicitGC();
    explicitGC.init(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_wSez0() throws ServletException, IOException {
    ExplicitGC explicitGC = new ExplicitGC();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    explicitGC.doPost(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SVnM1() throws ServletException, IOException {
    ExplicitGC explicitGC = new ExplicitGC();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
    explicitGC.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet14_CoPI13() throws ServletException, IOException {
    ExplicitGC explicitGC = new ExplicitGC();
    HttpServletRequest req = null;
    HttpServletResponse res = null;
  }
}