/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Charsets_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToCharsetWithNull_nBnj0_WWiF0() {
        Charset expected = Charset.defaultCharset();
        Charset actual = Charsets.toCharset((Charset) null);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToCharsetWithNull_lCnC0_CkUt0() {
        Charset result = Charsets.toCharset((Charset) null);
        assertEquals(Charset.defaultCharset(), result);
    }
}