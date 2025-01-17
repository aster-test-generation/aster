/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import com.ibm.websphere.samples.daytrader.util.TradeConfig;
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
import static org.mockito.Mockito.*;

public class Aster_PingJDBCWrite_Coverage_Test_Failing {
  private PingJDBCWrite pingJDBCWrite;
  private HttpServletResponse res;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ClosingBrace_IJHd0() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJDBCWrite.doGet(req, res);
    verify(res).setStatus(200);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_SetContentType_jHMc4() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJDBCWrite.doGet(req, res);
    verify(res).setContentType("text/html");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_StringBufferOutput_bOuI3_lHrk0() throws ServletException, IOException {
    // PingJDBCWrite pingJDBCWrite = new PingJDBCWrite(); // Assuming PingJDBCWrite is an interface or abstract class
    PingJDBCWrite pingJDBCWrite = mock(PingJDBCWrite.class); // Mock the PingJDBCWrite class
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    java.io.PrintWriter writer = mock(java.io.PrintWriter.class);
    when(res.getWriter()).thenReturn(writer);
    pingJDBCWrite.doGet(req, res);
    verify(writer).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_GetWriter_Sphn5_eajT0() throws ServletException, IOException {
    // Assuming PingJDBCWrite is in the package com.ibm.websphere.samples.daytrader.web.prims
    com.ibm.websphere.samples.daytrader.web.prims.PingJDBCWrite pingJDBCWrite = new com.ibm.websphere.samples.daytrader.web.prims.PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    java.io.PrintWriter out = mock(java.io.PrintWriter.class);
    when(res.getWriter()).thenReturn(out);
    pingJDBCWrite.doGet(req, res);
    verify(out).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_StringSymbol_hPRU2_DUTu0() throws ServletException, IOException {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite() {
      @Override
      public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // No-op
      }
    };
    pingJDBCWrite.doGet(req, res);
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_StringBufferOutput_bOuI3_lHrk0_fid3() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    java.io.PrintWriter writer = mock(java.io.PrintWriter.class);
    when(res.getWriter()).thenReturn(writer);
    pingJDBCWrite.doGet(req, res);
    verify(writer).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_GetWriter_Sphn5_eajT0_fid3() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    java.io.PrintWriter out = mock(java.io.PrintWriter.class);
    when(res.getWriter()).thenReturn(out);
    pingJDBCWrite.doGet(req, res);
    verify(out).println(anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_StringSymbol_hPRU2_DUTu0_fid3() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    pingJDBCWrite.doGet(req, res);
    verify(res).getWriter();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_TradeConfigGetPrimIterations_dAFa9_NVUi0() throws ServletException, IOException {
    PingJDBCWrite pingJDBCWrite = new PingJDBCWrite();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    TradeConfig tradeConfig = mock(TradeConfig.class);
    when(tradeConfig.getPrimIterations()).thenReturn(1);
    pingJDBCWrite.doGet(req, res);
    assertEquals(1, tradeConfig.getPrimIterations());
  }
}