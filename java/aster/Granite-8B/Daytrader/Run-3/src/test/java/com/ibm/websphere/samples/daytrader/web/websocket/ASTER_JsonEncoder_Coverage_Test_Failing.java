/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.EncodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JsonEncoder_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeJsonObject_FrUo0() throws javax.websocket.EncodeException {
        JsonEncoder encoder = new JsonEncoder();
        JsonMessage message = new JsonMessage();
        message.setKey("key");
        message.setValue("value");
        JsonObject jsonObject = Json.createObjectBuilder()
        .add("key", message.getKey())
        .add("value", message.getValue())
        .build();
        String expected = jsonObject.toString();
        String actual = encoder.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeJsonObjectWithNullKey_xVSK1() throws javax.websocket.EncodeException {
        JsonEncoder encoder = new JsonEncoder();
        JsonMessage message = new JsonMessage();
        message.setKey(null);
        message.setValue("value");
        JsonObject jsonObject = Json.createObjectBuilder()
        .add("key", message.getKey())
        .add("value", message.getValue())
        .build();
        String expected = jsonObject.toString();
        String actual = encoder.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeJsonObjectWithNullValue_DeWQ2() throws javax.websocket.EncodeException {
        JsonEncoder encoder = new JsonEncoder();
        JsonMessage message = new JsonMessage();
        message.setKey("key");
        message.setValue(null);
        JsonObject jsonObject = Json.createObjectBuilder()
        .add("key", message.getKey())
        .add("value", message.getValue())
        .build();
        String expected = jsonObject.toString();
        String actual = encoder.encode(message);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeJsonObjectWithNullKeyAndValue_wLYw3() throws javax.websocket.EncodeException {
        JsonEncoder encoder = new JsonEncoder();
        JsonMessage message = new JsonMessage();
        message.setKey(null);
        message.setValue(null);
        JsonObject jsonObject = Json.createObjectBuilder()
        .add("key", message.getKey())
        .add("value", message.getValue())
        .build();
        String expected = jsonObject.toString();
        String actual = encoder.encode(message);
        assertEquals(expected, actual);
    }
}