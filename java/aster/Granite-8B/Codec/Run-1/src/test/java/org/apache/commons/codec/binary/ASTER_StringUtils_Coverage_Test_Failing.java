/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_StringUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_WithNullInputs_ReturnsFalse_YtwB0() {
        CharSequence cs1 = null;
        CharSequence cs2 = null;
        boolean result = StringUtils.equals(cs1, cs2);
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewString_opVF0_LOIh0() {
        final byte[] bytes = new byte[0];
        final String charsetName = "";
        final IllegalStateException exception = new IllegalStateException(charsetName + ": " + new UnsupportedEncodingException(""));
        final String result = StringUtils.newString(bytes, charsetName);
        assertEquals(exception.getMessage(), result);
    }
}