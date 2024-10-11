/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletLargeContentLength_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWithPostRedirectAndRedirectAndRedirectAndRedirectAndRedirectAndRedirectAndRedirectAndRedirectAndRedirectAndRedirectAndRedirectAndRedirectAndRedirectAndRedirect_NNoC16() throws ServletException, IOException {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGet_NGnl1_sVZy0() throws ServletException, IOException {
    PingServletLargeContentLength pingServletLargeContentLength = mock(PingServletLargeContentLength.class);
    HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
    pingServletLargeContentLength.doGet(request, response);
    verify(response, times(1)).sendRedirect(anyString());
}
}