/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import javax.websocket.EncodeException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JsonEncoder_Coverage_Test_Passing {
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_build_ngwu3() throws javax.websocket.EncodeException {
        JsonEncoder jsonEncoder = new JsonEncoder();
        JsonMessage jsonMessage = null;
        jsonEncoder.encode(jsonMessage);
    }

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_JsonObjectCreation_dNik0() throws javax.websocket.EncodeException {
        JsonEncoder jsonEncoder = new JsonEncoder();
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setKey("key");
        jsonMessage.setValue("value");
        String result = jsonEncoder.encode(jsonMessage);
        assertEquals("{\"key\":\"key\",\"value\":\"value\"}", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_addKey_KRJN1() throws javax.websocket.EncodeException {
        JsonEncoder jsonEncoder = new JsonEncoder();
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setKey("testKey");
        jsonMessage.setValue("value");
        String result = jsonEncoder.encode(jsonMessage);
        assertEquals("{\"key\":\"testKey\",\"value\":\"value\"}", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_addValue_IrJQ2() throws javax.websocket.EncodeException {
        JsonEncoder jsonEncoder = new JsonEncoder();
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setKey("key");
        jsonMessage.setValue("testValue");
        String result = jsonEncoder.encode(jsonMessage);
        assertEquals("{\"key\":\"key\",\"value\":\"testValue\"}", result);
    }
}