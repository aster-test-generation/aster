/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.websocket.DecodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionDecoder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWillDecode_zeuU0() {
        ActionDecoder actionDecoder = new ActionDecoder();
        boolean result = actionDecoder.willDecode("exampleString");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_IJRk0_vHWW0_fid2() {
        ActionDecoder actionDecoder = new ActionDecoder();
        String jsonText = "{\"action\":\"turnOn\",\"device\":\"light\"}";
        ActionMessage actionMessage = null;
        try {
            actionMessage = actionDecoder.decode(jsonText);
        } catch (DecodeException e) {
            e.printStackTrace();
        }
        assertNull(actionMessage.getDecodedAction());
    }
}