/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingWebSocketJson_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testOnClose_shuQ0()
	{
		PingWebSocketJson obj = new PingWebSocketJson();
		obj.onClose(null, null);
	}
}