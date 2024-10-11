/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonDecoder_Coverage_Test_Passing {
    JsonDecoder jsonDecoder = new JsonDecoder();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_YNAg0() {
        JsonDecoder jsonDecoder = new JsonDecoder();
        jsonDecoder.init(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWillDecode_RnHP0() {
        String json = "{\"name\":\"John\",\"age\":30}";
        boolean result = jsonDecoder.willDecode(json);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWillDecodeInvalidJson_UnkG1() {
        String json = "{\"name\":\"John\",\"age\":30,}";
        boolean result = jsonDecoder.willDecode(json);
        assertFalse(result);
    }
}