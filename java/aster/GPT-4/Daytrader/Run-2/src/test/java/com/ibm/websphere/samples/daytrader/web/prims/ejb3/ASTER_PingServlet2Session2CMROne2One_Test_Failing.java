/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2Session2CMROne2One_Test_Failing {
  @InjectMocks
  private static int hitCount;
  @Mock
  private ServletConfig servletConfig;
  @InjectMocks
  private PingServlet2Session2CMROne2One pingServlet;
  HttpServletRequest request;
  HttpServletResponse response;
  @Mock
  private TradeServices tradeSLSBLocal;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetServletInfo_GTTL0() {
    PingServlet2Session2CMROne2One servlet = new PingServlet2Session2CMROne2One();
    String expected = "web primitive, tests Servlet to Entity EJB path";
    assertEquals(expected, servlet.getServletInfo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_tYUt0() throws ServletException, IOException {
    PingServlet2Session2CMROne2One pingServlet = new PingServlet2Session2CMROne2One();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PingServlet2Session2CMROne2One spyServlet = spy(pingServlet);
    spyServlet.doGet(request, response);
    verify(spyServlet).doGet(request, response);
  }
}