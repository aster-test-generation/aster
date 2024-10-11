/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingServlet2Jsp_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_SendError_Dpzr8_GkNF0() throws ServletException, IOException {
    Exception ex = new Exception("Test Exception");
    PingServlet2Jsp pingServlet2Jsp = new PingServlet2Jsp();
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();
    pingServlet2Jsp.doGet(request, response);
    verify(response, times(1)).sendError(500, eq("PingServlet2Jsp.doGet(...): request error" + ex.toString()));
}
}