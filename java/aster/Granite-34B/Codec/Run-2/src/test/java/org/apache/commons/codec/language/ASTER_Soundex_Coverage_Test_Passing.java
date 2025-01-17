/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Soundex_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLength_jEGJ0() {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(10);
        assertEquals(10, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetMaxLengthWithNegativeValue_TdbI1() {
        Soundex soundex = new Soundex();
        soundex.setMaxLength(-5);
        assertEquals(-5, soundex.getMaxLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_JZgA0_1() throws org.apache.commons.codec.EncoderException {
        Soundex soundex = new Soundex();
        Object obj = new Object();
        EncoderException exception = Assertions.assertThrows(EncoderException.class, () -> soundex.encode(obj));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullObject_VfoK1_1() throws org.apache.commons.codec.EncoderException {
        Soundex soundex = new Soundex();
        Object obj = null;
        EncoderException exception = Assertions.assertThrows(EncoderException.class, () -> soundex.encode(obj));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_JZgA0() throws org.apache.commons.codec.EncoderException {
        Soundex soundex = new Soundex();
        Object obj = new Object();
        EncoderException exception = Assertions.assertThrows(EncoderException.class, () -> soundex.encode(obj));
        assertEquals("Parameter supplied to Soundex encode is not of type java.lang.String", exception.getMessage());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNullObject_VfoK1() throws org.apache.commons.codec.EncoderException {
        Soundex soundex = new Soundex();
        Object obj = null;
        EncoderException exception = Assertions.assertThrows(EncoderException.class, () -> soundex.encode(obj));
        assertEquals("Parameter supplied to Soundex encode is not of type java.lang.String", exception.getMessage());
    }
}