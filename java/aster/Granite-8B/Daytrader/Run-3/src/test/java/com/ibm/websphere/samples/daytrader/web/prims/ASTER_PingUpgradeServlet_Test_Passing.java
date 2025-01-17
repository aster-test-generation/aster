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
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingUpgradeServlet_Test_Passing {
    private HttpServletResponse res;
    @Mock
    HttpServletRequest httpServletRequest;
    @Mock
    HttpServletResponse httpServletResponse;
    @InjectMocks
    PingUpgradeServlet pingUpgradeServlet;
    private PingUpgradeServlet servlet;
    private HttpServletRequest req;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet() throws ServletException, IOException {
        pingUpgradeServlet = new PingUpgradeServlet();
        pingUpgradeServlet.doGet(httpServletRequest, httpServletResponse);
        verify(httpServletRequest).getAttribute("attributeName");
        verify(httpServletResponse).setStatus(200);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_BXKJ1() {
        httpServletRequest = mock(HttpServletRequest.class);
        httpServletResponse = mock(HttpServletResponse.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void tearDown_roZB1() {
        servlet = null;
        req = null;
        res = null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithoutEchoUpgrade_iVbp3() throws ServletException, IOException {
        when(req.getHeader("Upgrade")).thenReturn("something else");
        servlet.doPost(req, res);
        verify(res, times(1)).getWriter().println("No upgrade: " + req.getHeader("Upgrade"));
    }
}