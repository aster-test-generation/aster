/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.drive;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletDrive_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_dewZ0_QHwZ0() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        PingServletDrive pingServlet = new PingServletDrive();
        doNothing().when(res).setContentType("text/html");
        ServletOutputStream out = mock(ServletOutputStream.class);
        doReturn(out).when(res).getOutputStream();
        pingServlet.doPost(req, res);
    }
}