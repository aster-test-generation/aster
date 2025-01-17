/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletBeanValCDI_Test_Passing {
    private static LocalDateTime initTime;
    @Mock
    private HttpServletRequest httpServletRequest;
    @Mock
    private HttpServletResponse httpServletResponse;
    @Mock
    HttpServletRequest req;
    @Mock
    HttpServletResponse res;
    @Mock
    HttpServlet httpServlet;
    @Mock
    ServletOutputStream servletOutputStream;
    @InjectMocks
    PingServletBeanValCDI pingServletBeanValCDI;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit() throws ServletException {
        pingServletBeanValCDI = new PingServletBeanValCDI();
        pingServletBeanValCDI.init(null);
        verify(httpServlet).init(any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost() throws ServletException, IOException {
        pingServletBeanValCDI = new PingServletBeanValCDI();
        when(res.getOutputStream()).thenReturn(servletOutputStream);
        pingServletBeanValCDI.doPost(req, res);
        verify(res).getOutputStream();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_qpMV0() {
        String servletInfo = pingServletBeanValCDI.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", servletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_tsHD0() throws ServletException, IOException {
        pingServletBeanValCDI = new PingServletBeanValCDI();
        when(res.getOutputStream()).thenReturn(servletOutputStream);
        pingServletBeanValCDI.doPost(req, res);
        verify(res, times(1)).getOutputStream();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_qpMV0_KQYS0() {
        PingServletBeanValCDI pingServletBeanValCDI = new PingServletBeanValCDI();
        String servletInfo = pingServletBeanValCDI.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", servletInfo);
    }
}