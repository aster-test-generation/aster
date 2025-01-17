/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JsonDecoder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDestroy_QMzG0() {
    JsonDecoder jsonDecoder = new JsonDecoder();
    jsonDecoder.destroy();
    assertTrue(true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWillDecodeValidJson_oqLW0() {
    JsonDecoder jsonDecoder = new JsonDecoder();
    String json = "{\"key\":\"value\"}";
    assertFalse(jsonDecoder.willDecode(json));
}
}