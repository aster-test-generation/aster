/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_OBJECT_VALUE_Tmqq0() {
        char ch = '@';
        Class<?> expected = PatternOptionBuilder.OBJECT_VALUE;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_STRING_VALUE_Bxax1() {
        char ch = ':';
        Class<?> expected = PatternOptionBuilder.STRING_VALUE;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_NUMBER_VALUE_UgTJ2() {
        char ch = '%';
        Class<?> expected = PatternOptionBuilder.NUMBER_VALUE;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_CLASS_VALUE_YQMm3() {
        char ch = '+';
        Class<?> expected = PatternOptionBuilder.CLASS_VALUE;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_DATE_VALUE_CMpD4() {
        char ch = '#';
        Class<?> expected = PatternOptionBuilder.DATE_VALUE;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_EXISTING_FILE_VALUE_VyFs5() {
        char ch = '<';
        Class<?> expected = PatternOptionBuilder.EXISTING_FILE_VALUE;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_FILE_VALUE_Yhgs6() {
        char ch = '>';
        Class<?> expected = PatternOptionBuilder.FILE_VALUE;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_FILES_VALUE_kwgR7() {
        char ch = '*';
        Class<?> expected = PatternOptionBuilder.FILES_VALUE;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_URL_VALUE_EYSu8() {
        char ch = '/';
        Class<?> expected = PatternOptionBuilder.URL_VALUE;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_null_iHUr9() {
        char ch = ' ';
        Class<?> expected = null;
        Class<?> actual = PatternOptionBuilder.getValueType(ch);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_ARdE0_1() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_ARdE0_2() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_ARdE0_3() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_ARdE0_4() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_aLum1_1() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_aLum1_2() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_aLum1_3() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_aLum1_4() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_aLum1_5() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_ebhQ2_1() {
        String pattern = "abc!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(4, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_ebhQ2_2() {
        String pattern = "abc!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_ebhQ2_3() {
        String pattern = "abc!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_ebhQ2_4() {
        String pattern = "abc!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_ebhQ2_5() {
        String pattern = "abc!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("d"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_ebhQ2_6() {
        String pattern = "abc!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_gYxZ3_1() {
        String pattern = "abc!d!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(4, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_gYxZ3_2() {
        String pattern = "abc!d!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_gYxZ3_3() {
        String pattern = "abc!d!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_gYxZ3_4() {
        String pattern = "abc!d!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_gYxZ3_5() {
        String pattern = "abc!d!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("d"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_gYxZ3_6() {
        String pattern = "abc!d!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_gYxZ3_7() {
        String pattern = "abc!d!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("d").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_fyaf4_1() {
        String pattern = "abc!d!e";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(5, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_fyaf4_2() {
        String pattern = "abc!d!e";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_fyaf4_3() {
        String pattern = "abc!d!e";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_fyaf4_4() {
        String pattern = "abc!d!e";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_fyaf4_5() {
        String pattern = "abc!d!e";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("d"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_fyaf4_6() {
        String pattern = "abc!d!e";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("e"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_fyaf4_7() {
        String pattern = "abc!d!e";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_fyaf4_8() {
        String pattern = "abc!d!e";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("d").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5_1() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(5, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5_2() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5_3() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5_4() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5_5() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("d"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5_6() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("e"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5_7() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5_8() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("d").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5_9() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("e").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_1() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(6, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_2() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_3() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_4() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_5() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("d"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_6() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("e"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_7() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.hasOption("f"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_8() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_9() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("d").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_10() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertTrue(options.getOption("e").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_lsMo6_11() {
        String pattern = "abc!d!e!f";
        Options options = PatternOptionBuilder.parsePattern(pattern);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_ARdE0() {
        String pattern = "abc";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_aLum1() {
        String pattern = "abc!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(3, options.getOptions().size());
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("c"));
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_ebhQ2() {
        String pattern = "abc!d";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(4, options.getOptions().size());
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("d"));
        assertTrue(options.getOption("c").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_gYxZ3() {
        String pattern = "abc!d!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(4, options.getOptions().size());
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("d"));
        assertTrue(options.getOption("c").isRequired());
        assertTrue(options.getOption("d").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_fyaf4() {
        String pattern = "abc!d!e";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(5, options.getOptions().size());
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("d"));
        assertTrue(options.hasOption("e"));
        assertTrue(options.getOption("c").isRequired());
        assertTrue(options.getOption("d").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_ttix5() {
        String pattern = "abc!d!e!";
        Options options = PatternOptionBuilder.parsePattern(pattern);
        assertEquals(5, options.getOptions().size());
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("d"));
        assertTrue(options.hasOption("e"));
        assertTrue(options.getOption("c").isRequired());
        assertTrue(options.getOption("d").isRequired());
        assertTrue(options.getOption("e").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_at_UbhP0() {
        assertTrue(PatternOptionBuilder.isValueCode('@'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_colon_EmQl1() {
        assertTrue(PatternOptionBuilder.isValueCode(':'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_percent_GLfM2() {
        assertTrue(PatternOptionBuilder.isValueCode('%'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_plus_tEAY3() {
        assertTrue(PatternOptionBuilder.isValueCode('+'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_hash_imot4() {
        assertTrue(PatternOptionBuilder.isValueCode('#'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_lessThan_sgBK5() {
        assertTrue(PatternOptionBuilder.isValueCode('<'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_greaterThan_uMVg6() {
        assertTrue(PatternOptionBuilder.isValueCode('>'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_asterisk_LpAn7() {
        assertTrue(PatternOptionBuilder.isValueCode('*'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_slash_cMKY8() {
        assertTrue(PatternOptionBuilder.isValueCode('/'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_exclamation_avlN9() {
        assertTrue(PatternOptionBuilder.isValueCode('!'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_other_Ogbc10() {
        assertFalse(PatternOptionBuilder.isValueCode('a'));
    }
}