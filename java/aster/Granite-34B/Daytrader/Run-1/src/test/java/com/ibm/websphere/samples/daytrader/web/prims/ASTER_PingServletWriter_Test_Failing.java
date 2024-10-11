/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

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
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletWriter_Test_Failing {
    private static int hitCount;
    private static String initTime;
    PingServletWriter pingservletwriter;
    @Mock
    HttpServletRequest mockHttpServletRequest;
    @Mock
    HttpServletResponse mockHttpServletResponse;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithNullConfig_VAvA1() {
        PingServletWriter servlet = new PingServletWriter();
        try {
            servlet.init(null);
            fail("Expected ServletException");
        } catch (ServletException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        MockitoAnnotations.openMocks(this);
        // Set up expected behavior for the mocks
        Mockito.when(mockHttpServletRequest.getParameter("paramName")).thenReturn("paramValue");
        // Call the method we want to test
        pingservletwriter.doPost(mockHttpServletRequest, mockHttpServletResponse);
        // Add meaningful assertions here
        Mockito.verify(mockHttpServletResponse).setStatus(HttpServletResponse.SC_OK);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullRequestAndResponse_ZwnZ3() throws ServletException, IOException {
        PingServletWriter servlet = new PingServletWriter();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_iCFB0() {
        PingServletWriter servlet = new PingServletWriter();
        String expected = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfoWithNullInput_BhUe1() {
        PingServletWriter servlet = new PingServletWriter();
        String expected = null;
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfoWithEmptyInput_CACv2() {
        PingServletWriter servlet = new PingServletWriter();
        String expected = "";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfoWithInvalidInput_jVGh3() {
        PingServletWriter servlet = new PingServletWriter();
        String expected = "Invalid input";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfoWithMultipleValidInputs_wcQe5() {
        PingServletWriter servlet = new PingServletWriter();
        String expected1 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual1 = servlet.getServletInfo();
        assertEquals(expected1, actual1);
        String expected2 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual2 = servlet.getServletInfo();
        assertEquals(expected2, actual2);
        String expected3 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual3 = servlet.getServletInfo();
        assertEquals(expected3, actual3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfoWithMultipleValidInputs_wcQe5_1() {
        PingServletWriter servlet = new PingServletWriter();
        String expected1 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual1 = servlet.getServletInfo();
        String expected2 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual2 = servlet.getServletInfo();
        String expected3 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual3 = servlet.getServletInfo();
        assertEquals(expected1, actual1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfoWithMultipleValidInputs_wcQe5_2() {
        PingServletWriter servlet = new PingServletWriter();
        String expected1 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual1 = servlet.getServletInfo();
        String expected2 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual2 = servlet.getServletInfo();
        String expected3 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual3 = servlet.getServletInfo();
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfoWithMultipleValidInputs_wcQe5_3() {
        PingServletWriter servlet = new PingServletWriter();
        String expected1 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual1 = servlet.getServletInfo();
        String expected2 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual2 = servlet.getServletInfo();
        String expected3 = "Basic dynamic HTML generation through a servlet using a PrintWriter";
        String actual3 = servlet.getServletInfo();
        assertEquals(expected3, actual3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_QipY0_1() throws Exception {
        pingservletwriter = mock(PingServletWriter.class);
        ServletConfig config = mock(ServletConfig.class);
        doCallRealMethod().when(pingservletwriter).init(config);
        pingservletwriter.init(config);
        verify(pingservletwriter, times(1)).init(config);
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_QipY0_2() throws Exception {
        pingservletwriter = mock(PingServletWriter.class);
        ServletConfig config = mock(ServletConfig.class);
        doCallRealMethod().when(pingservletwriter).init(config);
        pingservletwriter.init(config);
        verify(pingservletwriter, times(1)).init(config);
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_ofRo0_XxTc0() throws ServletException, IOException {
        PingServletWriter servlet = new PingServletWriter();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullRequest_tZDh1_JfgK0() throws ServletException, IOException {
        PingServletWriter servlet = new PingServletWriter();
        HttpServletRequest request = null;
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullResponse_tNnz2_TaiM0() throws ServletException, IOException {
        PingServletWriter servlet = new PingServletWriter();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = null;
        servlet.doPost(request, response);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost_fid2() throws Exception {
        MockitoAnnotations.openMocks(this);
        // Set up expected behavior for the mocks
        Mockito.when(mockHttpServletRequest.getParameter("paramName")).thenReturn("paramValue");
        // Create a new instance of PingServletWriter
        PingServletWriter pingServletWriter = new PingServletWriter();
        // Call the method we want to test
        pingServletWriter.doPost(mockHttpServletRequest, mockHttpServletResponse);
        // Add meaningful assertions here
        Mockito.verify(mockHttpServletResponse).setStatus(HttpServletResponse.SC_OK);
    }
}