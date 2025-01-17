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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJSONPObject_Test_Failing {
  private static String initTime;
  private static int hitCount;
  private HttpServletRequest request;
  @Mock
  private HttpServletResponse response;
  private HttpServletRequest req;
  @Mock
  private HttpServletResponse res;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_Exception_DPFr1() throws Exception {
    PingJSONPObject pingJSONPObject = new PingJSONPObject();
    Mockito.doThrow(new Exception()).when(request).getInputStream();
    pingJSONPObject.doGet(request, response);
    Mockito.verify(response).sendError(500, Mockito.anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_HsVG0_EMNe0() {
    PingJSONPObject pingJSONPObject = new PingJSONPObject();
    assertNotNull(pingJSONPObject);
  }

  @Test
  public void testDoGet_NTRz1() throws ServletException, IOException {
    PingJSONPObject pingJSONPObject = new PingJSONPObject();
    HttpServletRequest request = mock(HttpServletRequest.class);
    when(request.getParameter("callback")).thenReturn("callback");
    when(request.getParameter("initTime")).thenReturn("1000");
    when(request.getParameter("hitCount")).thenReturn("1");
    pingJSONPObject.doGet(request, response);
    verify(response).setContentType("text/html");
    verify(response).getOutputStream();
    verify(response).sendError(500, "PingJSONPObject.doGet(...): general exception caught");
  }
}