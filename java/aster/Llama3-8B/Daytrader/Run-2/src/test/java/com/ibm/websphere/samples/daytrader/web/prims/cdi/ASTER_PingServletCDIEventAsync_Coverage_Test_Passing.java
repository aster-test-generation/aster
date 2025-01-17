/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletCDIEventAsync_Coverage_Test_Passing {

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_YVcU0_GLgc0() {
    PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGetCdiEventProducer_bBJO1_gGeq0() throws ServletException, IOException {
    PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(response.getWriter()).thenReturn(new PrintWriter("test"));
    pingServletCDIEventAsync.doGet((HttpServletRequest) request, (HttpServletResponse) response);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGetException_Hhvb9_lBnW0() throws ServletException, IOException {
    PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    when(response.getWriter()).thenReturn(new PrintWriter("test"));
    pingServletCDIEventAsync.doGet(request, response);
}
}