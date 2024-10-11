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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2PDF_Test_Failing {
  private static int BUFFER_SIZE = 1024 * 8;
  private static int hitCount = 0;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithNullResponse_FNnJ3() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(req).getParameter("age");
    verify(req).getParameter("gender");
    verify(req).getParameter("email");
    verify(req).getParameter("phone");
    verify(req).getParameter("address");
    verify(req).getParameter("city");
    verify(req).getParameter("state");
    verify(req).getParameter("zip");
    verify(req).getParameter("country");
    verify(req).getParameter("message");
    verify(req).getParameter("attachment");
    verify(req).getParameter("attachmentName");
    verify(req).getParameter("attachmentType");
    verify(req).getParameter("attachmentSize");
    verify(req).getParameter("attachmentContent");
    verify(req).getParameter("attachmentContentType");
    verify(req).getParameter("attachmentContentDisposition");
    verify(req).getParameter("attachmentContentEncoding");
    verify(req).getParameter("attachmentContentLanguage");
    verify(req).getParameter("attachmentContentLocation");
    verify(req).getParameter("attachmentContentMD5");
    verify(req).getParameter("attachmentContentRange");
    verify(req).getParameter("attachmentContentType");
    verify(req).getParameter("attachmentContentTransferEncoding");
    verify(req).getParameter("attachmentContentDisposition");
    verify(req).getParameter("attachmentContentDispositionFilename");
    verify(req).getParameter("attachmentContentDispositionName");
    verify(req).getParameter("attachmentContentDispositionCreationDate");
    verify(req).getParameter("attachmentContentDispositionModificationDate");
    verify(req).getParameter("attachmentContentDispositionReadDate");
    verify(req).getParameter("attachmentContentDispositionSize");
    verify(req).getParameter("attachmentContentDispositionType");
    verify(req).getParameter("attachmentContentDispositionSubtype");
    verify(req).getParameter("attachmentContentDispositionBoundary");
    verify(req).getParameter("attachmentContentDispositionCharset");
    verify(req).getParameter("attachmentContentDispositionLanguage");
    verify(req).getParameter("attachmentContentDispositionParts");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ValidRequest_BbNQ0() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("fileURL")).thenReturn("http://example.com/file.pdf");
    servlet.doGet(req, res);
    verify(res).setContentType("application/pdf");
    verify(res).getOutputStream();
    verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request error");
    // Fix the assertion
    assertEquals(200, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_InvalidRequest_VJhf1() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("fileURL")).thenReturn("http://example.com/file.txt");
    servlet.doGet(req, res);
    verify(res).setContentType("application/pdf");
    verify(res).getOutputStream();
    verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request error");
    // Fix the assertion
    assertEquals(500, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_NullRequest_JSEi2() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("fileURL")).thenReturn(null);
    servlet.doGet(req, res);
    verify(res).setContentType("application/pdf");
    verify(res).getOutputStream();
    verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request error");
    // Fix the assertion
    assertEquals(null, req.getParameter("fileURL"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_EmptyRequest_zQFM3() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("fileURL")).thenReturn("");
    servlet.doGet(req, res);
    verify(res).setContentType("application/pdf");
    verify(res).getOutputStream();
    verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request error");
    // Fix the assertion
    assertEquals(500, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_InvalidURL_SdQj4() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("fileURL")).thenReturn("http://example.com/file.pdf");
    servlet.doGet(req, res);
    verify(res).setContentType("application/pdf");
    verify(res).getOutputStream();
    verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request error");
    // Fix the assertion
    assertEquals(500, res.getStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_NullURL_wCoj5() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("fileURL")).thenReturn(null);
    servlet.doGet(req, res);
    verify(res).setContentType("application/pdf");
    verify(res).getOutputStream();
    verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_UkQv0_STQG0() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_OK);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithException_uLgp1_bZqe0() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    doThrow(new IOException()).when(res).getWriter();
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithNullRequest_hPkq2_mEid0() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithNullResponse_FNnJ3_fid2() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = null;
    servlet.doPost(req, res);
    verify(req).getParameter("name");
    verify(req).getParameter("age");
    verify(req).getParameter("gender");
    verify(req).getParameter("email");
    verify(req).getParameter("phone");
    verify(req).getParameter("address");
    verify(req).getParameter("city");
    verify(req).getParameter("state");
    verify(req).getParameter("zip");
    verify(req).getParameter("country");
    verify(req).getParameter("message");
    verify(req).getParameter("attachment");
    verify(req).getParameter("attachmentName");
    verify(req).getParameter("attachmentType");
    verify(req).getParameter("attachmentSize");
    verify(req).getParameter("attachmentContent");
    verify(req).getParameter("attachmentContentType");
    verify(req).getParameter("attachmentContentDisposition");
    verify(req).getParameter("attachmentContentEncoding");
    verify(req).getParameter("attachmentContentLanguage");
    verify(req).getParameter("attachmentContentLocation");
    verify(req).getParameter("attachmentContentMD5");
    verify(req).getParameter("attachmentContentRange");
    verify(req).getParameter("attachmentContentType");
    verify(req).getParameter("attachmentContentTransferEncoding");
    verify(req).getParameter("attachmentContentDisposition");
    verify(req).getParameter("attachmentContentDispositionFilename");
    verify(req).getParameter("attachmentContentDispositionName");
    verify(req).getParameter("attachmentContentDispositionCreationDate");
    verify(req).getParameter("attachmentContentDispositionModificationDate");
    verify(req).getParameter("attachmentContentDispositionReadDate");
    verify(req).getParameter("attachmentContentDispositionSize");
    verify(req).getParameter("attachmentContentDispositionType");
    verify(req).getParameter("attachmentContentDispositionSubtype");
    verify(req).getParameter("attachmentContentDispositionBoundary");
    verify(req).getParameter("attachmentContentDispositionCharset");
    verify(req).getParameter("attachmentContentDispositionLanguage");
    verify(req).getParameter("attachmentContentDispositionParts");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_ValidRequest_BbNQ0_fid2() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("fileURL")).thenReturn("http://example.com/file.pdf");
    servlet.doGet(req, res);
    verify(res).setContentType("application/pdf");
    verify(res).getOutputStream();
    verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_InvalidRequest_VJhf1_fid2() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("fileURL")).thenReturn("http://example.com/file.txt");
    servlet.doGet(req, res);
    verify(res).setContentType("application/pdf");
    verify(res).getOutputStream();
    verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet_EmptyRequest_zQFM3_fid2() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse res = mock(HttpServletResponse.class);
    when(req.getParameter("fileURL")).thenReturn("");
    servlet.doGet(req, res);
    verify(res).setContentType("application/pdf");
    verify(res).getOutputStream();
    verify(res).sendError(500, "PingServlet2Jsp.doGet(...): request error");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoPost_WithNullRequest_hPkq2_mEid0_fid2() throws ServletException, IOException {
    PingServlet2PDF servlet = new PingServlet2PDF();
    HttpServletRequest req = null;
    HttpServletResponse res = mock(HttpServletResponse.class);
    servlet.doPost(req, res);
    verify(res).setStatus(HttpServletResponse.SC_BAD_REQUEST);
    verify(res).getWriter();
    verify(res).flushBuffer();
  }
}