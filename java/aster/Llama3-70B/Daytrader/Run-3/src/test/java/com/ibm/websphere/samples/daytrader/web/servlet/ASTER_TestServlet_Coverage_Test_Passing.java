/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import java.io.IOException;
import javax.enterprise.inject.Instance;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TestServlet_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_PerformTaskCalled_vAga1_qFqC0() throws ServletException, IOException {
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    TestServlet testServlet = spy(new TestServlet(mock(Instance.class)));
    doNothing().when(testServlet).performTask(any(HttpServletRequest.class), any(HttpServletResponse.class));
    testServlet.doGet(request, response);
    verify(testServlet).performTask(any(HttpServletRequest.class), any(HttpServletResponse.class));
}
}