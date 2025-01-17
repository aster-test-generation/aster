/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionDecoder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDestroy_AbCg0() {
        ActionDecoder actionDecoder = new ActionDecoder();
        actionDecoder.destroy();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWillDecode_ryMK0() {
        ActionDecoder actionDecoder = new ActionDecoder();
        String s = "example";
        boolean result = actionDecoder.willDecode(s);
        assert result;
    }
}