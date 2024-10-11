/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonMessage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_WeXZ0() {
        JsonMessage jsonMessage = new JsonMessage();
        String value = jsonMessage.getValue();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKey_pRnh0() {
        JsonMessage jsonMessage = new JsonMessage();
        String key = jsonMessage.getKey();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetKeyWithCoverage_jfmo1() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setKey("testKey");
        String key = jsonMessage.getKey();
        jsonMessage.setKey(null);
        key = jsonMessage.getKey();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetValue_lpHw0() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue("test");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetValue_JSdD1() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testSetValue_Tjik2() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue("");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withEmptyValue_CRNI1_UNdO0() {
        JsonMessage jsonMessage = new JsonMessage();
        String value = jsonMessage.getValue();
        assertEquals(null, value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withNoValue_XYCo2_vXBD0() {
        JsonMessage jsonMessage = new JsonMessage();
        String value = jsonMessage.getValue();
        org.junit.jupiter.api.Assertions.assertNull(value);
    }
}