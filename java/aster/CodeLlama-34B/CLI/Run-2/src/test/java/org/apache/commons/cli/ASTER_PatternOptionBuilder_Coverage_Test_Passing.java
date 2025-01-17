/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_WgyG0() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
        assertEquals("a", options.getOption("a").getOpt());
        assertEquals("b", options.getOption("b").getOpt());
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_dNgk1() {
        String pattern = "a!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
        assertEquals("a", options.getOption("a").getOpt());
        assertTrue(options.getOption("a").isRequired());
        assertEquals("b", options.getOption("b").getOpt());
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_uVSQ2() {
        String pattern = "a:bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
        assertEquals("a", options.getOption("a").getOpt());
        assertTrue(options.getOption("a").hasArg());
        assertEquals("b", options.getOption("b").getOpt());
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_FMgB3() {
        String pattern = "a:!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
        assertEquals("a", options.getOption("a").getOpt());
        assertTrue(options.getOption("a").hasArg());
        assertTrue(options.getOption("a").isRequired());
        assertEquals("b", options.getOption("b").getOpt());
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_siLl4() {
        String pattern = "a:bc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
        assertEquals("a", options.getOption("a").getOpt());
        assertTrue(options.getOption("a").hasArg());
        assertEquals("b", options.getOption("b").getOpt());
        assertEquals("c", options.getOption("c").getOpt());
        assertTrue(options.getOption("c").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_plrk5() {
        String pattern = "a:bc:!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
        assertEquals("a", options.getOption("a").getOpt());
        assertTrue(options.getOption("a").hasArg());
        assertEquals("b", options.getOption("b").getOpt());
        assertEquals("c", options.getOption("c").getOpt());
        assertTrue(options.getOption("c").hasArg());
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_rJTn6() {
        String pattern = "a:bc:!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(4, options.getOptions().size());
        assertEquals("a", options.getOption("a").getOpt());
        assertTrue(options.getOption("a").hasArg());
        assertEquals("b", options.getOption("b").getOpt());
        assertEquals("c", options.getOption("c").getOpt());
        assertTrue(options.getOption("c").hasArg());
        assertTrue(options.getOption("c").isRequired());
        assertEquals("d", options.getOption("d").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_WgyG0_1() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_WgyG0_2() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("a", options.getOption("a").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_WgyG0_3() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("b", options.getOption("b").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_WgyG0_4() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_dNgk1_1() {
        String pattern = "a!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_dNgk1_2() {
        String pattern = "a!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("a", options.getOption("a").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_dNgk1_3() {
        String pattern = "a!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_dNgk1_4() {
        String pattern = "a!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("b", options.getOption("b").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_dNgk1_5() {
        String pattern = "a!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_uVSQ2_1() {
        String pattern = "a:bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_uVSQ2_2() {
        String pattern = "a:bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("a", options.getOption("a").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_uVSQ2_3() {
        String pattern = "a:bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_uVSQ2_4() {
        String pattern = "a:bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("b", options.getOption("b").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_uVSQ2_5() {
        String pattern = "a:bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_FMgB3_1() {
        String pattern = "a:!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_FMgB3_2() {
        String pattern = "a:!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("a", options.getOption("a").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_FMgB3_3() {
        String pattern = "a:!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_FMgB3_4() {
        String pattern = "a:!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_FMgB3_5() {
        String pattern = "a:!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("b", options.getOption("b").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_FMgB3_6() {
        String pattern = "a:!bc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_siLl4_1() {
        String pattern = "a:bc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_siLl4_2() {
        String pattern = "a:bc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("a", options.getOption("a").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_siLl4_3() {
        String pattern = "a:bc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_siLl4_4() {
        String pattern = "a:bc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("b", options.getOption("b").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_siLl4_5() {
        String pattern = "a:bc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_siLl4_6() {
        String pattern = "a:bc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_plrk5_1() {
        String pattern = "a:bc:!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_plrk5_2() {
        String pattern = "a:bc:!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("a", options.getOption("a").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_plrk5_3() {
        String pattern = "a:bc:!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_plrk5_4() {
        String pattern = "a:bc:!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("b", options.getOption("b").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_plrk5_5() {
        String pattern = "a:bc:!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_plrk5_6() {
        String pattern = "a:bc:!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_plrk5_7() {
        String pattern = "a:bc:!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_rJTn6_1() {
        String pattern = "a:bc:!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(4, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_rJTn6_2() {
        String pattern = "a:bc:!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("a", options.getOption("a").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_rJTn6_3() {
        String pattern = "a:bc:!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_rJTn6_4() {
        String pattern = "a:bc:!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("b", options.getOption("b").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_rJTn6_5() {
        String pattern = "a:bc:!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("c", options.getOption("c").getOpt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_rJTn6_6() {
        String pattern = "a:bc:!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_rJTn6_7() {
        String pattern = "a:bc:!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_rJTn6_8() {
        String pattern = "a:bc:!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals("d", options.getOption("d").getOpt());
    }
}