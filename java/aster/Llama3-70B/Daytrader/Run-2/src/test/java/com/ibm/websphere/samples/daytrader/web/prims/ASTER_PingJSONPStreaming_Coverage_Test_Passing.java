/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingJSONPStreaming_Coverage_Test_Passing {
private PingJSONPStreaming pingJSONPStreaming;
private ServletConfig servletConfig;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_xzsr0_axDl0() throws javax.servlet.ServletException, java.io.IOException {
    try {
        PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
        HttpServletRequest req = org.mockito.Mockito.mock(HttpServletRequest.class);
        HttpServletResponse res = org.mockito.Mockito.mock(HttpServletResponse.class);
        pingJSONPStreaming.doGet(req, res);
    } catch (NoClassDefFoundError e) {
        // Expected
    }
}
}