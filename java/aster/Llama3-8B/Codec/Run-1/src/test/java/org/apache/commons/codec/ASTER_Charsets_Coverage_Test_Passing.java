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
    public void testToCharsetValid_sHTH1() {
        assertEquals(Charset.forName("UTF-8"), Charsets.toCharset("UTF-8"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToCharsetNull_ZrHL0_GqpL0() {
        assertEquals(Charset.defaultCharset(), Charsets.toCharset((java.nio.charset.Charset) null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToCharsetNotNullInput_AGVj1_fThU0() {
        Charsets charsets = new Charsets();
        Charset validCharset = Charset.forName("UTF-8");
        assertEquals(Charset.forName("UTF-8"), charsets.toCharset(validCharset));
    }
}