/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletCDIBeanManagerViaJNDI_Coverage_Test_Passing {
  private PingServletCDIBeanManagerViaJNDI pingServlet;
  private ServletConfig mockConfig;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testWriteHtmlHeader_kjdM2_jOjN0() throws IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    PingServletCDIBeanManagerViaJNDI pingServlet = new PingServletCDIBeanManagerViaJNDI();
    pingServlet.doGet(request, response);
    verify(writer).write(contains("<html><head><title>Ping Servlet CDI Bean Manager</title></head>")); // Cover line 2
    verify(writer).write(contains("<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet CDI Bean Manager<BR></FONT>")); // Additional verification for body content
    verify(writer).write(contains("Init time : ")); // Verify init time content
  }
}