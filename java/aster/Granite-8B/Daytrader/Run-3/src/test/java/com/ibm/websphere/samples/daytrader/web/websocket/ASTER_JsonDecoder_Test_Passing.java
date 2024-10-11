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

public class Aster_JsonDecoder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDestroy_lLOZ0() {
        JsonDecoder decoder = new JsonDecoder();
        decoder.destroy();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWillDecode_yElD0() {
        JsonDecoder decoder = new JsonDecoder();
        String validJson = "{\"name\": \"John\", \"age\": 30}";
        boolean result = decoder.willDecode(validJson);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWillDecodeInvalidJson_JTqz1() {
        JsonDecoder decoder = new JsonDecoder();
        String invalidJson = "{name: \"John\", age: 30}";
        boolean result = decoder.willDecode(invalidJson);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWillDecodeNullJson_fOws2() {
        JsonDecoder decoder = new JsonDecoder();
        String nullJson = null;
        boolean result = decoder.willDecode(nullJson);
        assertFalse(result);
    }
}