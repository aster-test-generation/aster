/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import javax.websocket.DecodeException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ActionDecoder_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDecode_OjEV0_CivQ1() throws javax.websocket.DecodeException {
    ActionDecoder actionDecoder = new ActionDecoder();
    ActionMessage actionMessage = actionDecoder.decode("{\"action\":\"test\"}");
    assertEquals("test", actionMessage.getDecodedAction());
}
}