/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ActionDecoder_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDestroyWithNull_fmFK1() {
    ActionDecoder actionDecoder = new ActionDecoder();
    actionDecoder.destroy();
    assertNull(actionDecoder);
}
}