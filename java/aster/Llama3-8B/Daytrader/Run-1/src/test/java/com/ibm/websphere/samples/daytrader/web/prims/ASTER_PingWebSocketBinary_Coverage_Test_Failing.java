/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import java.nio.ByteBuffer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingWebSocketBinary_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPing_lvsC0_zyrr0() {
    PingWebSocketBinary pingWebSocketBinary = new PingWebSocketBinary();
    ByteBuffer data = ByteBuffer.wrap(new byte[10]);
    pingWebSocketBinary.onOpen(null, null);
    pingWebSocketBinary.ping(data);
}
}