/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletCDI_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_RapG0_DcBe0() throws java.io.IOException {
    PingServletCDI pingServletCDI = new PingServletCDI();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetWriter_CFWO1_GgDB0() throws IOException {
    PingServletCDI pingServletCDI = new PingServletCDI();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(response.getWriter()).thenReturn(new PrintWriter("output"));
    pingServletCDI.doGet((HttpServletRequest) request, (HttpServletResponse) response);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteHtml_QveM2_TSHO0() throws IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    PingServletCDI pingServletCDI = new PingServletCDI();
    pingServletCDI.doGet(request, response);
    verify(writer).write(eq("<html><head><title>Ping Servlet CDI</title></head>"));
    verify(writer, atLeastOnce()).flush();
    verify(writer, atLeastOnce()).close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFlush_UjeW6_EkhF0() throws IOException {
    PingServletCDI pingServletCDI = new PingServletCDI();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    pingServletCDI.doGet((HttpServletRequest) request, (HttpServletResponse) response);
    verify(writer).flush();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_gMMk7_vxPN0() throws IOException {
    PingServletCDI pingServletCDI = new PingServletCDI();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    pingServletCDI.doGet(request, response);
    verify(writer).close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_hDBz3_lQeK0() throws IOException {
    PingServletCDI pingServletCDI = new PingServletCDI();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    PrintWriter writer = mock(PrintWriter.class);
    when(response.getWriter()).thenReturn(writer);
    pingServletCDI.doGet(request, response);
    verify(writer).write(eq("<html><head><title>Ping Servlet CDI</title></head><body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet CDI<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + anyString() + "<BR><BR></FONT>"));
    verify(writer).write(eq("<B>hitCount: " + anyString() + "</B><BR>"));
    verify(writer).write(eq("<B>hitCount: " + anyString() + "</B><BR>"));
    verify(writer).flush();
    verify(writer).close();
}
}