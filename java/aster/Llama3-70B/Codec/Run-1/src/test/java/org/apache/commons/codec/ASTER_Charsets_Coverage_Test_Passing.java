/**
 * Generated by Aster
 */
package org.apache.commons.codec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Charsets_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToCharsetValidCharset_zjzP1() {
        Charset utf8Charset = Charset.forName("UTF-8");
        assertEquals(utf8Charset, Charsets.toCharset("UTF-8"));
    }

    @Test
    public void testToCharsetInvalidCharset_DOBg2_EbRI0() {
        Charset charset = null;
        Charset result = Charsets.toCharset(charset);
        assertEquals(Charset.defaultCharset(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToCharsetNull_JdyE0_yxnE0() {
        Charset defaultCharset = Charset.defaultCharset();
        assertEquals(defaultCharset, Charsets.toCharset((java.nio.charset.Charset) null));
    }
}