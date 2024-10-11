/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DoubleMetaphone_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_JUaY0() throws org.apache.commons.codec.EncoderException {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        Object obj = new Object();
        try {
            doubleMetaphone.encode(obj);
            fail("EncoderException expected");
        } catch (EncoderException e) {
            assertEquals("DoubleMetaphone encode parameter is not of type String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullObject_rkbK1() throws org.apache.commons.codec.EncoderException {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        Object obj = null;
        try {
            doubleMetaphone.encode(obj);
            fail("EncoderException expected");
        } catch (EncoderException e) {
            assertEquals("DoubleMetaphone encode parameter is not of type String", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleCH10_RiTt10() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
        String value = "CH";
        int index = 4;
        int expectedIndex = 2;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHandleAEIOUY_kTnC1() {
        DoubleMetaphone doubleMetaphone = new DoubleMetaphone();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void append(char c) {
    }
}