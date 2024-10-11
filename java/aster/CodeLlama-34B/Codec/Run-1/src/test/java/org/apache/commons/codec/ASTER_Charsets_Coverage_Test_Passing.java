/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Charsets_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToCharsetWithValidCharset_fDiU1() {
        Charset charset = Charsets.toCharset("UTF-8");
        Assertions.assertEquals(Charset.forName("UTF-8"), charset);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToCharset_null_RFOs0() {
        Charset charset = null;
        Charset result = Charsets.toCharset(charset);
        assertEquals(Charset.defaultCharset(), result);
    }
}