/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
public class Aster_PingServletCDIEventAsync_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_ceka0_buop0() {
    PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGetCdiEventProducer_owQO0_mIbJ0() throws IOException {
    PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();
    pingServletCDIEventAsync.doGet(request, response);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoGetMultipleCalls_XKhd9_ZrxT0() throws IOException {
    PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();
    pingServletCDIEventAsync.doGet(request, response);
    pingServletCDIEventAsync.doGet(request, response);
}
}