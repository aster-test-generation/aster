/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_BothStrings_pEpr0() {
        assertTrue(StringUtils.equals("Hello", "Hello"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUncheckedNullString_rxnF0() {
        byte[] result = StringUtils.getBytesUnchecked(null, "UTF-8");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_AKKw0() throws UnsupportedEncodingException {
        byte[] bytes = "Hello, World!".getBytes("UTF-8");
        String charsetName = "UTF-8";
        String expected = "Hello, World!";
        String result = StringUtils.newString(bytes, charsetName);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringNullBytes_qLJe2() {
        String charsetName = "UTF-8";
        String result = StringUtils.newString(null, charsetName);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStringEmptyBytes_CKsQ4() {
        byte[] bytes = new byte[0];
        String charsetName = "UTF-8";
        String result = StringUtils.newString(bytes, charsetName);
        assertEquals("", result);
    }
}