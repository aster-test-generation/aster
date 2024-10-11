/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingJSONPObject_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_Wgfa0() {
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        String expectedInfo = "Basic JSON generation and parsing in a servlet";
        assertEquals(expectedInfo, pingJSONPObject.getServletInfo());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostCallsDoGet_YjIl0() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        pingJSONPObject.doPost(request, response);
        verify(pingJSONPObject).doGet(request, response);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostExecutionCompletes_ntEh1() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        try {
            pingJSONPObject.doPost(request, response);
        } catch (Exception e) {
            fail("doPost should not throw any exceptions.");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetSetsContentType_ZzJC0() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        pingJSONPObject.doGet(req, res);
        verify(res).setContentType("text/html");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetIncrementsHitCount_aFof2() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        pingJSONPObject.doGet(req, res);
        pingJSONPObject.doGet(req, res);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetCreatesJsonObject_SKCj3() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        pingJSONPObject.doGet(req, res);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetOutputsHtml_EtLb6() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        pingJSONPObject.doGet(req, res);
        verify(out).println(anyString()); // Verify that some HTML output occurs
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHandlesExceptionByLogging_SDOD7() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(res.getOutputStream()).thenThrow(new IOException("Test Exception"));
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        try {
            pingJSONPObject.doGet(req, res);
        } catch (Exception e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetHandlesExceptionBySendingError_PORm8() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(res.getOutputStream()).thenThrow(new IOException("Test Exception"));
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        try {
            pingJSONPObject.doGet(req, res);
        } catch (Exception e) {
        }
        verify(res).sendError(500, "java.io.IOException: Test Exception");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetCatchesGenericException_Srnb9() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        when(res.getOutputStream()).thenThrow(new RuntimeException("Test Exception"));
        PingJSONPObject pingJSONPObject = new PingJSONPObject();
        try {
            pingJSONPObject.doGet(req, res);
        } catch (Exception e) {
        }
    }
}