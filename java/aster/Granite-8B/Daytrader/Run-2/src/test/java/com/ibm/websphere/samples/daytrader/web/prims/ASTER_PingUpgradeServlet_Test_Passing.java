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
    @Mock
    HttpServletRequest httpServletRequest;
    @Mock
    HttpServletResponse httpServletResponse;
    @InjectMocks
    PingUpgradeServlet pingUpgradeServlet;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_WithoutEchoUpgradeHeader_ShouldNotUpgradeAndWriteResponse() throws ServletException, IOException {
        // Given
        when(httpServletRequest.getHeader("Upgrade")).thenReturn("something else");
        // When
        pingUpgradeServlet.doPost(httpServletRequest, httpServletResponse);
        // Then
        verify(httpServletResponse).getWriter().println("No upgrade: something else");
        verifyNoMoreInteractions(httpServletResponse);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet() throws ServletException, IOException {
        pingUpgradeServlet = new PingUpgradeServlet();
        pingUpgradeServlet.doGet(httpServletRequest, httpServletResponse);
        verify(httpServletResponse).sendRedirect("upgrade");
    }
}