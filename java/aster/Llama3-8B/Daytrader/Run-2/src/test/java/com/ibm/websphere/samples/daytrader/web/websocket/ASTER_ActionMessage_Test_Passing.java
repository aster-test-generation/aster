/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionMessage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingNoActionKey_ciHk2() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "{\"otherKey\":\"otherValue\"}";
        actionMessage.doDecoding(jsonText);
        assertNull(actionMessage.getDecodedAction());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingValidJson_fyUn0_fid1() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "{\"action\":\"doSomething\"}";
        actionMessage.doDecoding(jsonText);
        assertNull(actionMessage.getDecodedAction());
    }
}