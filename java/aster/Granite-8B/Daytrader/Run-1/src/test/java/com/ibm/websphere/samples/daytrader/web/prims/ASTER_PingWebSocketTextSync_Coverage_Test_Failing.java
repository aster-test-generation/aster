/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingWebSocketTextSync_Coverage_Test_Failing {
    PingWebSocketTextSync target = new PingWebSocketTextSync();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPing_Sijw0() {
        target.ping("text");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnError1_iLPg1()
{
	PingWebSocketTextSync obj = new PingWebSocketTextSync();
	Throwable t = null;
	obj.onError(t);
}
}