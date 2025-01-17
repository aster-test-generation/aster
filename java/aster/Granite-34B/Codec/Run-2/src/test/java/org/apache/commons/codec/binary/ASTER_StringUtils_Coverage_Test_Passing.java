/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_StringUtils_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_wfNo0() {
        StringUtils stringUtils = new StringUtils();
        String string = null;
        ByteBuffer byteBuffer = stringUtils.getByteBufferUtf8(string);
        Assertions.assertNull(byteBuffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_gISN1() {
        StringUtils stringUtils = new StringUtils();
        String string = "Hello";
        ByteBuffer byteBuffer = stringUtils.getByteBufferUtf8(string);
        Assertions.assertNotNull(byteBuffer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1_cPau0() {
        StringUtils utils = new StringUtils();
        String cs1 = "test";
        String cs2 = "test";
        boolean expected = true;
        boolean actual = utils.equals(cs1, cs2);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2_xiIH1() {
        StringUtils utils = new StringUtils();
        String cs1 = null;
        String cs2 = "test";
        boolean expected = false;
        boolean actual = utils.equals(cs1, cs2);
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_4_VJHv3() {
        StringUtils utils = new StringUtils();
        String cs1 = "test";
        String cs2 = "test1";
        boolean expected = false;
        boolean actual = utils.equals(cs1, cs2);
        assert actual == expected;
    }
}