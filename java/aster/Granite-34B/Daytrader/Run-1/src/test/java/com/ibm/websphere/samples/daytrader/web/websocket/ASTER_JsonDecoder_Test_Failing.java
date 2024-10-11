/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.websocket.DecodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonDecoder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWillDecode_ZIoe0() {
        JsonDecoder jsonDecoder = new JsonDecoder();
        String json = "valid json string";
        boolean expected = true;
        boolean actual = jsonDecoder.willDecode(json);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDecode_fzBw0_yBkd0() {
        JsonDecoder jsonDecoder = new JsonDecoder();
        String json = "{\"key\": \"testKey\", \"value\": \"testValue\"}";
        JsonMessage expected = new JsonMessage();
        expected.setKey("testKey");
        expected.setValue("testValue");
        try {
            assertEquals(expected, jsonDecoder.decode(json));
        } catch (DecodeException e) {
            fail("Exception should not be thrown");
        }
    }
}