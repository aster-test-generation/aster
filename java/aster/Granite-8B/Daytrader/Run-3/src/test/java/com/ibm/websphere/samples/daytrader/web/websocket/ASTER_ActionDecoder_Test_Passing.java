/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.websocket.DecodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionDecoder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDestroy_uVVL0() {
        ActionDecoder actionDecoder = new ActionDecoder();
        actionDecoder.destroy();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWillDecode_EARv0() {
        ActionDecoder actionDecoder = new ActionDecoder();
        String s = "exampleString";
        boolean result = actionDecoder.willDecode(s);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_ADXw0_mjvB0() {
        ActionDecoder decoder = new ActionDecoder();
        String jsonText = "example json text";
        ActionMessage message = null;
        try {
            message = decoder.decode(jsonText);
        } catch (DecodeException e) {
            e.printStackTrace();
        }
        assertNotNull(message);
    }
}