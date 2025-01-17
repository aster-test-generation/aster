/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_StringInstances_BAcq0() {
        String cs1 = "Hello";
        String cs2 = "Hello";
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_CharSequenceInstances_rtCM1() {
        StringBuilder cs1 = new StringBuilder("Hello");
        StringBuilder cs2 = new StringBuilder("Hello");
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUnchecked_NullString_kEDN1() {
        String string = null;
        String charsetName = "UTF-8";
        byte[] result = StringUtils.getBytesUnchecked(string, charsetName);
        assertNull(result);
    }
}