/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_sPMo0() {
        Object result = PatternOptionBuilder.getValueClass('a');
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_oIxR3() {
        Options options = PatternOptionBuilder.parsePattern("a:i");
        assertEquals(Integer.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_moIe4() {
        Options options = PatternOptionBuilder.parsePattern("a:l");
        assertEquals(Long.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_zSnN5() {
        Options options = PatternOptionBuilder.parsePattern("a:f");
        assertEquals(Float.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_CCOX6() {
        Options options = PatternOptionBuilder.parsePattern("a:d");
        assertEquals(Double.class, options.getOption("a").getType());
    }
}