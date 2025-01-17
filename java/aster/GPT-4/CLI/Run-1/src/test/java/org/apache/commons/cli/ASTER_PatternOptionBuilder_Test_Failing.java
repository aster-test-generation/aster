/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithMultipleOptionsAndTypes_Otag4_1() {
        Options options = PatternOptionBuilder.parsePattern("a%d");
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithMultipleOptionsAndTypes_Otag4_2() {
        Options options = PatternOptionBuilder.parsePattern("a%d");
        assertEquals(Integer.class, options.getOption("d").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithRequiredAndType_dzEX5_2() {
        Options options = PatternOptionBuilder.parsePattern("a!%");
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithAllComplexities_sBNB6_2() {
        Options options = PatternOptionBuilder.parsePattern("a!%b@");
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithAllComplexities_sBNB6_4() {
        Options options = PatternOptionBuilder.parsePattern("a!%b@");
        assertEquals(File.class, options.getOption("b").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithOptionAndType_ddAR3_fid1() {
        Options options = PatternOptionBuilder.parsePattern("a%");
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithMultipleOptionsAndTypes_Otag4() {
        Options options = PatternOptionBuilder.parsePattern("a%d");
        assertEquals(String.class, options.getOption("a").getType());
        assertEquals(Integer.class, options.getOption("d").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithRequiredAndType_dzEX5() {
        Options options = PatternOptionBuilder.parsePattern("a!%");
        assertTrue(options.getOption("a").isRequired());
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithAllComplexities_sBNB6() {
        Options options = PatternOptionBuilder.parsePattern("a!%b@");
        assertTrue(options.getOption("a").isRequired());
        assertEquals(String.class, options.getOption("a").getType());
        assertTrue(options.hasOption("b"));
        assertEquals(File.class, options.getOption("b").getType());
    }
}