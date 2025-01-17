/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2PDF_Test_Failing {
    PingServlet2PDF pingservlet2pdf;
    HttpServletRequest httpservletrequest;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;
    private static int BUFFER_SIZE = 1024 * 8;
    private static int hitCount = 0;
    @Mock
    private PingBean pingbean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_ndFe0() throws ServletException, IOException {
        PingServlet2PDF pingServlet2PDF = new PingServlet2PDF();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getAttribute("ab")).thenReturn(new PingBean());
        pingServlet2PDF.doGet(request, response);
        verify(request, times(1)).setAttribute("ab", any(PingBean.class));
        verify(response, times(1)).setContentType("application/pdf");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetException_qifA1() throws ServletException, IOException {
        PingServlet2PDF pingServlet2PDF = new PingServlet2PDF();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getAttribute("ab")).thenReturn(new PingBean());
        IOException ioException = new IOException("Test Exception");
        doThrow(ioException).when(response).sendError(500, "PingServlet2Jsp.doGet(...): request error" + ioException.toString());
        pingServlet2PDF.doGet(request, response);
        verify(response, times(1)).sendError(500, "PingServlet2Jsp.doGet(...): request error" + ioException.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetClose_fFBG2() throws ServletException, IOException {
        PingServlet2PDF pingServlet2PDF = new PingServlet2PDF();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getAttribute("ab")).thenReturn(new PingBean());
        pingServlet2PDF.doGet(request, response);
        verify(response, times(1)).getOutputStream();
        verify(response, times(1)).getOutputStream().close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetSetContentType_czib3() throws ServletException, IOException {
        PingServlet2PDF pingServlet2PDF = new PingServlet2PDF();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getAttribute("ab")).thenReturn(new PingBean());
        pingServlet2PDF.doGet(request, response);
        verify(response, times(1)).setContentType("application/pdf");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetSetAttribute_hNUB4() throws ServletException, IOException {
        PingServlet2PDF pingServlet2PDF = new PingServlet2PDF();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingBean pingBean = new PingBean();
        pingServlet2PDF.doGet(request, response);
        verify(request, times(1)).setAttribute("ab", pingBean);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetGetOutputStream_qUDr5() throws ServletException, IOException {
        PingServlet2PDF pingServlet2PDF = new PingServlet2PDF();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getAttribute("ab")).thenReturn(new PingBean());
        pingServlet2PDF.doGet(request, response);
        verify(response, times(1)).getOutputStream();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetGetInputStream_IxPW6() throws ServletException, IOException {
        PingServlet2PDF pingServlet2PDF = new PingServlet2PDF();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getAttribute("ab")).thenReturn(new PingBean());
        pingServlet2PDF.doGet(request, response);
        verify(request, times(1)).getAttribute("ab");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost_gOpB0() throws Exception {
        HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
        HttpServletResponse httpservletresponse = mock(HttpServletResponse.class);
        ServletOutputStream servletoutputstream = mock(ServletOutputStream.class);
        PingServlet2PDF pingservlet2pdf = new PingServlet2PDF();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingservlet2pdf.doGet(httpservletrequest, httpservletresponse);
        verify(httpservletresponse).setStatus(200);
        verify(servletoutputstream).write(any(byte[].class));
        verify(servletoutputstream).flush();
        verify(servletoutputstream).close();
    }
}