/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletCDIBeanManagerViaCDICurrent_Coverage_Test_Failing {
  private ServletConfig mockConfig;
  private PingServletCDIBeanManagerViaCDICurrent pingServlet;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_GetWriter_qMqS1_GJqo0() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent pingServlet = mock(PingServletCDIBeanManagerViaCDICurrent.class);
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    pingServlet.doGet(request, response);
    verify(response, times(1)).getWriter(); // Cover line 1
    verify(writer, times(1)).write(anyString()); // Verify that write was called on the writer
    verify(writer, times(1)).flush(); // Verify that flush was called on the writer
    verify(writer, times(1)).close(); // Verify that close was called on the writer
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_WriteHtmlHeader_oydR2_QlJy0() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent pingServlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    // Simulate the behavior of the method under test
    when(writer.toString()).thenReturn("<html><head><title>Ping Servlet CDI Bean Manager</title></head><body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet CDI Bean Manager<BR></FONT></body></html>");
    pingServlet.doGet(request, response);
    verify(writer).write(contains("<html><head><title>Ping Servlet CDI Bean Manager</title></head>")); // Cover line 2
    verify(writer).write(contains("<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet CDI Bean Manager<BR></FONT>")); // Additional verification for body content
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_FlushWriter_KGlD6_RoFN0() throws IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    PingServletCDIBeanManagerViaCDICurrent pingServlet = new PingServletCDIBeanManagerViaCDICurrent();
    pingServlet.doGet(request, response);
    verify(writer).write(anyString()); // Cover line 5
    verify(writer).flush(); // Cover line 7
    verify(writer).close(); // Ensure writer is closed
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CloseWriter_AhOz7_OTbT0() throws IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    PingServletCDIBeanManagerViaCDICurrent pingServlet = new PingServletCDIBeanManagerViaCDICurrent();
    pingServlet.doGet(request, response);
    verify(writer).flush(); // Verify flush is called
    verify(writer).close(); // Cover line 8
    verify(writer, times(1)).write(eq("Expected output")); // Ensure write is called with expected output
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_Sfrd0() throws javax.servlet.ServletException {
    pingServlet = new PingServletCDIBeanManagerViaCDICurrent();
    mockConfig = mock(ServletConfig.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInitCallsSuperInit_wqXr1() throws ServletException {
    PingServletCDIBeanManagerViaCDICurrent spyPingServlet = spy(pingServlet);
    spyPingServlet.init(mockConfig);
    verify(spyPingServlet).init(mockConfig); // Verifying that init was called
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_GetWriter_qMqS1_GJqo0_fid3() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent pingServlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    pingServlet.doGet(request, response);
    verify(response, times(1)).getWriter(); // Cover line 1
    verify(writer, times(1)).write(anyString()); // Verify that write was called on the writer
    verify(writer, times(1)).flush(); // Verify that flush was called on the writer
    verify(writer, times(1)).close(); // Verify that close was called on the writer
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_WriteHtmlHeader_oydR2_QlJy0_fid3() throws IOException {
    PingServletCDIBeanManagerViaCDICurrent pingServlet = new PingServletCDIBeanManagerViaCDICurrent();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    pingServlet.doGet(request, response);
    verify(writer).write(contains("<html><head><title>Ping Servlet CDI Bean Manager</title></head>")); // Cover line 2
    verify(writer).write(contains("<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet CDI Bean Manager<BR></FONT>")); // Additional verification for body content
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_CloseWriter_AhOz7_OTbT0_fid3() throws IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    PingServletCDIBeanManagerViaCDICurrent pingServlet = new PingServletCDIBeanManagerViaCDICurrent();
    pingServlet.doGet(request, response);
    verify(writer).flush(); // Verify flush is called
    verify(writer).close(); // Cover line 8
    verify(writer, times(1)).write(anyString()); // Ensure write is called at least once
  }
}