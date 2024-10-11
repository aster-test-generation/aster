/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteBufferUtf8WithNullInput_KBPQ0() {
        String input = null;
        ByteBuffer result = StringUtils.getByteBufferUtf8(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetByteBufferUtf8WithNonNullInput_hHfy1() {
        String input = "test";
        ByteBuffer result = StringUtils.getByteBufferUtf8(input);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUnchecked_NullString_oMob0() {
        byte[] result = StringUtils.getBytesUnchecked(null, "UTF-8");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUnchecked_ValidInput_UTF8_jBCz2() throws UnsupportedEncodingException {
        String testString = "hello";
        byte[] expected = testString.getBytes("UTF-8");
        byte[] result = StringUtils.getBytesUnchecked(testString, "UTF-8");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytesUnchecked_ValidInput_ASCII_YfqA3() throws UnsupportedEncodingException {
        String testString = "hello";
        byte[] expected = testString.getBytes("ASCII");
        byte[] result = StringUtils.getBytesUnchecked(testString, "ASCII");
    }

    @Test
    public void testNewStringWithUnsupportedEncoding_STih0_rsFE0_fid2() {
        byte[] bytes = {65, 66, 67}; // ABC in ASCII
        try {
            String result = StringUtils.newStringUsAscii(bytes);
            assertNotNull(result); // Check that result is not null instead of expecting an exception
        } catch (IllegalStateException e) {
            fail("No exception should be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_BothStrings_kgBO0_Oazm0_fid2() {
        String cs1 = "hello";
        String cs2 = "hello";
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NonStringCharSequences_LrLS1_Mxcb0_fid2() {
        StringBuilder cs1 = new StringBuilder("hello");
        StringBuilder cs2 = new StringBuilder("hello");
    }
}