/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.EncoderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Metaphone_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithNonStringObject_IghA0() throws org.apache.commons.codec.EncoderException {
        Metaphone metaphone = new Metaphone();
        Object obj = new Object();
        try {
            metaphone.encode(obj);
        } catch (EncoderException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithStringObject_MunL1() throws org.apache.commons.codec.EncoderException {
        Metaphone metaphone = new Metaphone();
        String obj = "test";
        Object encoded = metaphone.encode(obj);
    }
}