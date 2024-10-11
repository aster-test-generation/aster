/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ActionMessage_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_JsonParserCreation_nXWB0() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "{}";
        actionMessage.doDecoding(jsonText);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_HasNext_oGNx1() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "{\"key\":\"value\"}";
        actionMessage.doDecoding(jsonText);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_Event_KEY_NAME_zXPp2() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "{\"action\":\"myAction\"}";
        actionMessage.doDecoding(jsonText);
    }

@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_DecodedActionAssignment_kmTV5() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "{\"action\":\"myAction\"}";
        actionMessage.doDecoding(jsonText);
        assertEquals("myAction", actionMessage.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_DefaultCase_XOuc6() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "{\"key\":{\"innerKey\":\"innerValue\"}}";
        actionMessage.doDecoding(jsonText);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_ExceptionHandling_EXtV7() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "invalid json";
        actionMessage.doDecoding(jsonText);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecoding_MultipleEvents_EqZM8() {
        ActionMessage actionMessage = new ActionMessage();
        String jsonText = "{\"key\":\"value\",\"action\":\"myAction\"}";
        actionMessage.doDecoding(jsonText);
    }
}