/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingServlet2DB_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_SRxx0() {
        PingServlet2DB pingServlet2DB = new PingServlet2DB();
        String expected = "Basic JDBC Read using a prepared statment, makes use of TradeJDBC class";
        String actual = pingServlet2DB.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoPost_IOgC1_dWNp0() throws ServletException, IOException {
    PingServlet2DB pingServlet2DB = new PingServlet2DB();
    MockHttpServletRequest request = mock(MockHttpServletRequest.class);
    when(request.getMethod()).thenReturn("POST");
    when(request.getParameter("param")).thenReturn("value");
    MockHttpServletResponse response = mock(MockHttpServletResponse.class);
    pingServlet2DB.doPost(request, response);
    verify(request, times(1)).getMethod(); 
    verify(request, times(1)).getParameter("param");
}
}