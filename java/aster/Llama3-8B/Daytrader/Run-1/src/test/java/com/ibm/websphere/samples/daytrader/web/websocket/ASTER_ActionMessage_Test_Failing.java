/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ActionMessage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingValidJson_bOgF0_fid1() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "{\"action\":\"doSomething\"}";
        actionMessage.doDecoding(jsonText);
        assertEquals("doSomething", actionMessage.getDecodedAction());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDecodedAction_yEwj0_fid1() {
        ActionMessage actionMessage = new ActionMessage();
        String decodedAction = actionMessage.getDecodedAction();
        assertEquals("", decodedAction);
    }
}