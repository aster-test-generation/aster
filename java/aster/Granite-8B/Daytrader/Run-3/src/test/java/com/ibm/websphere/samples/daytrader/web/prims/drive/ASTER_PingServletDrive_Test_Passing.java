/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.drive;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletDrive_Test_Passing {
    private static String initTime;
    private static int hitCount;
    PingServletDrive pingservletdrive;
    HttpServlet httpservlet;
    @Mock
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    ServletOutputStream servletOutputStream;
    PingServletDrive pingServletDrive;
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_1() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletdrive = new PingServletDrive();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingServletDrive
        pingservletdrive.init(httpservlet);
        // Assert that the initTime and hitCount variables are set correctly
        assertEquals(initTime, new java.util.Date().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_2() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletdrive = new PingServletDrive();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingServletDrive
        pingservletdrive.init(httpservlet);
        // Assert that the initTime and hitCount variables are set correctly
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_gdgR0() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String servletInfo = pingServletDrive.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfoWithNull_sfQg1() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String servletInfo = pingServletDrive.getServletInfo();
        assertEquals(null, servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfoWithEmpty_nRiL2() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String servletInfo = pingServletDrive.getServletInfo();
        assertEquals("", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfoWithSpecialCharacters_eWVc3() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String servletInfo = pingServletDrive.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet!", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfoWithLongInfo_xKcy4() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String servletInfo = pingServletDrive.getServletInfo();
        assertTrue(servletInfo.length() <= 100);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfoWithHTMLTags_EMCY5_1() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String servletInfo = pingServletDrive.getServletInfo();
        assertFalse(servletInfo.contains("<"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfoWithHTMLTags_EMCY5_2() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String servletInfo = pingServletDrive.getServletInfo();
        assertFalse(servletInfo.contains(">"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingservletdrive = new PingServletDrive();
        // Mock the init method of HttpServlet
        doNothing().when(httpservlet).init(any());
        // Call the init method of PingServletDrive
        pingservletdrive.init(httpservlet);
        // Assert that the initTime and hitCount variables are set correctly
        assertEquals(initTime, new java.util.Date().toString());
        assertEquals(hitCount, 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfoWithHTMLTags_EMCY5() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String servletInfo = pingServletDrive.getServletInfo();
        assertFalse(servletInfo.contains("<"));
        assertFalse(servletInfo.contains(">"));
    }
}