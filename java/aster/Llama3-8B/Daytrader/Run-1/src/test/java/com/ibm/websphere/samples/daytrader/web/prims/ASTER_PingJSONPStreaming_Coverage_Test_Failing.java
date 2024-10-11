/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingJSONPStreaming_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_IFQm0() {
        PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
        String expected = "Basic JSON generation and parsing in a servlet";
        String actual = pingJSONPStreaming.getServletInfo();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_BOdX0() throws ServletException, IOException {
        PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(request.getMethod()).thenReturn("POST");
        pingJSONPStreaming.doPost(request, response);
        verify(response, times(1)).setStatus(HttpServletResponse.SC_OK);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_SuperInitCalled_cpen0() throws ServletException {
        PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
        pingJSONPStreaming.init(null);
        assertEquals("init", pingJSONPStreaming.getClass().getSuperclass().getName());
}
}