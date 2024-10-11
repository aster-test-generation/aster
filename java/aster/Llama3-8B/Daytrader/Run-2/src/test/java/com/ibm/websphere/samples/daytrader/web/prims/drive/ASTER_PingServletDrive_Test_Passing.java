/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.drive;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletDrive_Test_Passing {
    private static String initTime;
    private static int hitCount;
    @Mock
    private ServletConfig servletConfig;
    @InjectMocks
    private PingServletDrive pingservletdrive;
    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    @Mock
    ServletOutputStream outputStream;
    @Mock
    private HttpServletRequest httpServletRequest;
    @Mock
    private HttpServletResponse httpServletResponse;
    @Mock
    private ServletOutputStream servletOutputStream;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        pingservletdrive = new PingServletDrive();
        when(response.getOutputStream()).thenReturn(outputStream);
        pingservletdrive.doPost(request, response);
        verify(response).setStatus(HttpServletResponse.SC_OK);
        verify(outputStream).write("Hello, World!".getBytes());
        verify(outputStream).flush();
        verify(outputStream).close();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_IDLK0() {
        PingServletDrive pingServletDrive = new PingServletDrive();
        String result = pingServletDrive.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_CCcj0() throws ServletException {
        initTime = null;
        hitCount = 0;
        pingservletdrive = new PingServletDrive();
        pingservletdrive.init(servletConfig);
        assertEquals(0, hitCount);
    }
}