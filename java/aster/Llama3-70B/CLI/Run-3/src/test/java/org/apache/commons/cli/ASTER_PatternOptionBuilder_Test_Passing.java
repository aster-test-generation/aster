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
    public void testUnsupported_AocO0() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        Object result = PatternOptionBuilder.unsupported();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_UQwh0() throws Exception {
        Object result = PatternOptionBuilder.getValueClass('a');
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_AtSign_KUdn0() throws Exception {
        assertEquals(PatternOptionBuilder.OBJECT_VALUE, PatternOptionBuilder.getValueType('@'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_Colon_oShe1() throws Exception {
        assertEquals(PatternOptionBuilder.STRING_VALUE, PatternOptionBuilder.getValueType(':'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_Percent_lCcc2() throws Exception {
        assertEquals(PatternOptionBuilder.NUMBER_VALUE, PatternOptionBuilder.getValueType('%'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_Plus_JWXq3() throws Exception {
        assertEquals(PatternOptionBuilder.CLASS_VALUE, PatternOptionBuilder.getValueType('+'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_NumberSign_kZcs4() throws Exception {
        assertEquals(PatternOptionBuilder.DATE_VALUE, PatternOptionBuilder.getValueType('#'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_LessThan_SJfN5() throws Exception {
        assertEquals(PatternOptionBuilder.EXISTING_FILE_VALUE, PatternOptionBuilder.getValueType('<'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_GreaterThan_ZZlT6() throws Exception {
        assertEquals(PatternOptionBuilder.FILE_VALUE, PatternOptionBuilder.getValueType('>'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_Asterisk_UQOq7() throws Exception {
        assertEquals(PatternOptionBuilder.FILES_VALUE, PatternOptionBuilder.getValueType('*'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_ForwardSlash_CNpR8() throws Exception {
        assertEquals(PatternOptionBuilder.URL_VALUE, PatternOptionBuilder.getValueType('/'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_Default_WuFg9() throws Exception {
        assertNull(PatternOptionBuilder.getValueType(' '));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_EmptyPattern_rrcG0() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("");
        assertTrue(options.getOptions().isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_SingleOption_cYSY1_1() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a");
        Option option = options.getOption("a");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_SingleOption_cYSY1_2() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a");
        Option option = options.getOption("a");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_SingleOption_cYSY1_3() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a");
        Option option = options.getOption("a");
        assertFalse(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_SingleOption_cYSY1_4() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a");
        Option option = options.getOption("a");
        assertNull(option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_RequiredOption_oiau2_1() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a!");
        Option option = options.getOption("a");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_RequiredOption_oiau2_2() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a!");
        Option option = options.getOption("a");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_RequiredOption_oiau2_3() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a!");
        Option option = options.getOption("a");
        assertTrue(option.isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_RequiredOption_oiau2_4() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a!");
        Option option = options.getOption("a");
        assertNull(option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_OptionWithValue_ICcO3_1() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:i");
        Option option = options.getOption("a");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_OptionWithValue_ICcO3_2() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:i");
        Option option = options.getOption("a");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_OptionWithValue_ICcO3_3() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:i");
        Option option = options.getOption("a");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_OptionWithValue_ICcO3_4() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:i");
        Option option = options.getOption("a");
        assertEquals(Integer.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_MultipleOptions_VyFY4_1() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a b c");
        assertEquals(3, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_MultipleOptions_VyFY4_2() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a b c");
        assertNotNull(options.getOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_MultipleOptions_VyFY4_3() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a b c");
        assertNotNull(options.getOption("b"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_MultipleOptions_VyFY4_4() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a b c");
        assertNotNull(options.getOption("c"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_OptionWithConverter_zpJh5_1() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:f");
        Option option = options.getOption("a");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_OptionWithConverter_zpJh5_2() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:f");
        Option option = options.getOption("a");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_OptionWithConverter_zpJh5_3() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:f");
        Option option = options.getOption("a");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_OptionWithConverter_zpJh5_4() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:f");
        Option option = options.getOption("a");
        assertEquals(Float.class, option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_OptionWithConverter_zpJh5_5() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:f");
        Option option = options.getOption("a");
        assertNotNull(option.getConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_InvalidPattern_NJqj6_1() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:");
        Option option = options.getOption("a");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_InvalidPattern_NJqj6_2() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:");
        Option option = options.getOption("a");
        assertNotNull(option);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_InvalidPattern_NJqj6_3() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:");
        Option option = options.getOption("a");
        assertTrue(option.hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_InvalidPattern_NJqj6_4() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a:");
        Option option = options.getOption("a");
        assertNull(option.getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_NullPattern_xwBZ7() throws Exception {
        Options options = PatternOptionBuilder.parsePattern(null);
        assertNull(options);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_At_JABY0() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('@');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Colon_kgDP1() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode(':');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Percent_cZXH2() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('%');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Plus_DtdI3() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('+');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Hash_EJNR4() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('#');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_LessThan_qcaf5() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('<');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_GreaterThan_Thuu6() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('>');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Asterisk_XohL7() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('*');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_ForwardSlash_zkwn8() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('/');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_ExclamationMark_RoEE9() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('!');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Other_hIbd10() throws Exception {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        boolean result = PatternOptionBuilder.isValueCode('a');
        assert !result;
    }
}