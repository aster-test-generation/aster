/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingWebSocketTextAsync_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testOnClose_hzpf0()
	{
		PingWebSocketTextAsync obj = new PingWebSocketTextAsync();
		obj.onClose(null,null);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPing1_iLHT2() {
    PingWebSocketTextAsync obj = new PingWebSocketTextAsync();
    obj.ping("text");
}
}