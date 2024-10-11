/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_bOZt0_5_fid1() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionA.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_bOZt0_6_fid1() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionA.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_bOZt0_9_fid1() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionB.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_bOZt0_10_fid1() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionB.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_bOZt0_13_fid1() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionC.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_bOZt0_14_fid1() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionC.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithRequiredOption_zDtQ1_5_fid1() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionA.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithRequiredOption_zDtQ1_6_fid1() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionA.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithRequiredOption_zDtQ1_9_fid1() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionB.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithRequiredOption_zDtQ1_10_fid1() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionB.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithRequiredOption_zDtQ1_13_fid1() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionC.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithType_ovYM2_5_fid1() {
        String pattern = "abc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionA.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithType_ovYM2_6_fid1() {
        String pattern = "abc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionA.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithType_ovYM2_9_fid1() {
        String pattern = "abc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionB.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithType_ovYM2_10_fid1() {
        String pattern = "abc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionB.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePatternWithType_ovYM2_14_fid1() {
        String pattern = "abc:";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        Option optionA = options.getOption("a");
        Option optionB = options.getOption("b");
        Option optionC = options.getOption("c");
        assertTrue(optionC.isRequired());
    }
}