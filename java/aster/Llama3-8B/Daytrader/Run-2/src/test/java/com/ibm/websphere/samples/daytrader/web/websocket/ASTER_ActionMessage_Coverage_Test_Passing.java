/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ActionMessage_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingNullJsonText_poIy0() {
        ActionMessage actionMessage = new ActionMessage();
        actionMessage.doDecoding(null);
        assertNull(actionMessage.getDecodedAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingEmptyJsonText_dQGe1() {
        ActionMessage actionMessage = new ActionMessage();
        actionMessage.doDecoding("");
        assertNull(actionMessage.getDecodedAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingJsonTextWithoutActionKey_MHRO2() {
        ActionMessage actionMessage = new ActionMessage();
        actionMessage.doDecoding("{\"key\":\"value\"}");
        assertNull(actionMessage.getDecodedAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingJsonTextWithoutActionValue_SnPH3() {
        ActionMessage actionMessage = new ActionMessage();
        actionMessage.doDecoding("{\"action\":\"\"}");
        assertNull(actionMessage.getDecodedAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingJsonTextWithActionKeyButNoValue_xGYK4() {
        ActionMessage actionMessage = new ActionMessage();
        actionMessage.doDecoding("{\"action\":null}");
        assertNull(actionMessage.getDecodedAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingJsonTextWithActionValue_UBdw5() {
        ActionMessage actionMessage = new ActionMessage();
        actionMessage.doDecoding("{\"action\":\"test\"}");
        assertEquals("test", actionMessage.getDecodedAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingJsonTextWithMultipleValues_vyQf6() {
        ActionMessage actionMessage = new ActionMessage();
        actionMessage.doDecoding("{\"action\":\"test\",\"anotherKey\":\"anotherValue\"}");
        assertEquals("test", actionMessage.getDecodedAction());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoDecodingJsonTextWithInvalidJson_jHXU7() {
        ActionMessage actionMessage = new ActionMessage();
        actionMessage.doDecoding(" invalid json ");
        assertNull(actionMessage.getDecodedAction());
}
}