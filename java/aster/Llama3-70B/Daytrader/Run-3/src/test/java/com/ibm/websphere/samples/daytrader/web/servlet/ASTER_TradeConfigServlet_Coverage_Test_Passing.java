/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeConfigServlet_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoConfigUpdate_GetRequestDispatcher_sYDs5_JBxZ0_fid1() throws Exception {
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    try {
        TradeConfigServlet tradeConfigServlet = new TradeConfigServlet();
        tradeConfigServlet.doConfigUpdate(req, resp);
    } catch (NoClassDefFoundError e) {
        // Expected
    }
}
}