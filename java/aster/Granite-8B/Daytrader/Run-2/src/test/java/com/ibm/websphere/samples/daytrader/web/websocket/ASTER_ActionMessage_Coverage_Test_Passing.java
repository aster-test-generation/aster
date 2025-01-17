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
    void testDoDecoding1_bFzZ0() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"login\"}";
        am.doDecoding(jsonText);
        assertEquals("login", am.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoDecoding2_DbKk1() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"register\"}";
        am.doDecoding(jsonText);
        assertEquals("register", am.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoDecoding3_mZsX2() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"logout\"}";
        am.doDecoding(jsonText);
        assertEquals("logout", am.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoDecoding4_FjBo3() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"search\"}";
        am.doDecoding(jsonText);
        assertEquals("search", am.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoDecoding5_uVti4() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"edit\"}";
        am.doDecoding(jsonText);
        assertEquals("edit", am.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoDecoding6_GvdG5() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"delete\"}";
        am.doDecoding(jsonText);
        assertEquals("delete", am.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoDecoding7_FwlI6() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"create\"}";
        am.doDecoding(jsonText);
        assertEquals("create", am.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoDecoding8_dDKn7() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"update\"}";
        am.doDecoding(jsonText);
        assertEquals("update", am.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoDecoding9_ppBO8() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"view\"}";
        am.doDecoding(jsonText);
        assertEquals("view", am.decodedAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoDecoding10_JKkp9() {
        ActionMessage am = new ActionMessage();
        String jsonText = "{\"action\":\"download\"}";
        am.doDecoding(jsonText);
        assertEquals("download", am.decodedAction);
    }
}