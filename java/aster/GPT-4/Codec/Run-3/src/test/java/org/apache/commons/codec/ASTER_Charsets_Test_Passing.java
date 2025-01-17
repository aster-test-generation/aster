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

public class Aster_Charsets_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToCharsetWithValidName_DTLa1() throws Exception {
        Charset result = Charsets.toCharset("UTF-8");
        Charset expected = Charset.forName("UTF-8");
        assertEquals(expected, result);
    }
}