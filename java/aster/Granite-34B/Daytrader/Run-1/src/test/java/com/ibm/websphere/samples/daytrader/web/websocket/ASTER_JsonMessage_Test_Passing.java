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

public class Aster_JsonMessage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withEmptyValue_PHZT1() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue("");
        String expected = "";
        String actual = jsonMessage.getValue();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withNull_gfap2() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue(null);
        String expected = null;
        String actual = jsonMessage.getValue();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withValidValue_DWFR3() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue("validValue");
        String expected = "validValue";
        String actual = jsonMessage.getValue();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withMultipleValues_mzDY7() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue("value1");
        jsonMessage.setValue("value2");
        String expected = "value2";
        String actual = jsonMessage.getValue();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withMultipleInstances_xiWF8_1() {
        JsonMessage jsonMessage1 = new JsonMessage();
        jsonMessage1.setValue("value1");
        JsonMessage jsonMessage2 = new JsonMessage();
        jsonMessage2.setValue("value2");
        String expected1 = "value1";
        String actual1 = jsonMessage1.getValue();
        String expected2 = "value2";
        String actual2 = jsonMessage2.getValue();
        assertEquals(expected1, actual1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_withMultipleInstances_xiWF8_2() {
        JsonMessage jsonMessage1 = new JsonMessage();
        jsonMessage1.setValue("value1");
        JsonMessage jsonMessage2 = new JsonMessage();
        jsonMessage2.setValue("value2");
        String expected1 = "value1";
        String actual1 = jsonMessage1.getValue();
        String expected2 = "value2";
        String actual2 = jsonMessage2.getValue();
        assertEquals(expected2, actual2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getKeyTest_xbrd0() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setKey("exampleKey");
        String key = jsonMessage.getKey();
        assertEquals("exampleKey", key);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getKeyNullTest_Eepw1() {
        JsonMessage jsonMessage = new JsonMessage();
        String key = jsonMessage.getKey();
        assertEquals(null, key);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getKeyEmptyTest_CGWx2() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setKey("");
        String key = jsonMessage.getKey();
        assertEquals("", key);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ZKaK0() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue("test");
        assertEquals("test", jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNull_wRhU1() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue(null);
        assertEquals(null, jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithEmpty_zkTb2() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue("");
        assertEquals("", jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithSpecialCharacters_hojW3() {
        JsonMessage jsonMessage = new JsonMessage();
        jsonMessage.setValue("!@#$%^&*()_+");
        assertEquals("!@#$%^&*()_+", jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithLength100_NECn5() {
        JsonMessage jsonMessage = new JsonMessage();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("a");
        }
        jsonMessage.setValue(sb.toString());
        assertEquals(sb.toString(), jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithLength1000_pmtR6() {
        JsonMessage jsonMessage = new JsonMessage();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }
        jsonMessage.setValue(sb.toString());
        assertEquals(sb.toString(), jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithLength10000_GNeQ7() {
        JsonMessage jsonMessage = new JsonMessage();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        jsonMessage.setValue(sb.toString());
        assertEquals(sb.toString(), jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithLength100000_LVTI8() {
        JsonMessage jsonMessage = new JsonMessage();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        jsonMessage.setValue(sb.toString());
        assertEquals(sb.toString(), jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithLength1000000_BKEF9() {
        JsonMessage jsonMessage = new JsonMessage();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        jsonMessage.setValue(sb.toString());
        assertEquals(sb.toString(), jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithLength10000000_wpTs10() {
        JsonMessage jsonMessage = new JsonMessage();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sb.append("a");
        }
        jsonMessage.setValue(sb.toString());
        assertEquals(sb.toString(), jsonMessage.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithLength100000000_FrNu11() {
        JsonMessage jsonMessage = new JsonMessage();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000000; i++) {
            sb.append("a");
        }
        jsonMessage.setValue(sb.toString());
        assertEquals(sb.toString(), jsonMessage.getValue());
    }
}