/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletCDIEventAsync_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_onAsyncEvent2_1_OQTW0() {
	PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
	pingServletCDIEventAsync.onAsyncEvent2("test_onAsyncEvent2_1");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_onAsyncEvent2_2_blgA1() {
	PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
	pingServletCDIEventAsync.onAsyncEvent2("test_onAsyncEvent2_2");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_onAsyncEvent2_3_DNGc2() {
	PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
	pingServletCDIEventAsync.onAsyncEvent2("test_onAsyncEvent2_3");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_onAsyncEvent2_4_NnTA3() {
	PingServletCDIEventAsync pingServletCDIEventAsync = new PingServletCDIEventAsync();
	pingServletCDIEventAsync.onAsyncEvent2("test_onAsyncEvent2_4");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test_doGet_0_poQh0() throws Exception {
	PingServletCDIEventAsync tested = new PingServletCDIEventAsync();
	tested.doGet(null, null);
	tested.doGet(null, null);
}
}