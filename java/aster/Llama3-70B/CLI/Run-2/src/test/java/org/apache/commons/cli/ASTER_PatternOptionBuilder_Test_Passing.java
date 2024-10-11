/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueType_AtSign_DqRI0() {
        assertEquals(PatternOptionBuilder.OBJECT_VALUE, PatternOptionBuilder.getValueType('@'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnsupported_swRg0() {
        PatternOptionBuilder builder = new PatternOptionBuilder();
        Object result = PatternOptionBuilder.unsupported();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_qfjI0() {
        Options options = PatternOptionBuilder.parsePattern("a");
        assertTrue(options.hasOption("a"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_xhrz1() {
        Options options = PatternOptionBuilder.parsePattern("a!");
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_vVjq2() {
        Options options = PatternOptionBuilder.parsePattern("a:");
        assertTrue(options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern8_TmYY7() {
        Options options = PatternOptionBuilder.parsePattern("a:s");
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_At_AcnN0() {
        assertTrue(PatternOptionBuilder.isValueCode('@'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Colon_jsGM1() {
        assertTrue(PatternOptionBuilder.isValueCode(':'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Percent_iiXj2() {
        assertTrue(PatternOptionBuilder.isValueCode('%'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Plus_XkjT3() {
        assertTrue(PatternOptionBuilder.isValueCode('+'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Hash_EBWr4() {
        assertTrue(PatternOptionBuilder.isValueCode('#'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_LessThan_Ievf5() {
        assertTrue(PatternOptionBuilder.isValueCode('<'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_GreaterThan_vrWq6() {
        assertTrue(PatternOptionBuilder.isValueCode('>'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Asterisk_VlAy7() {
        assertTrue(PatternOptionBuilder.isValueCode('*'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_ForwardSlash_Bype8() {
        assertTrue(PatternOptionBuilder.isValueCode('/'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_ExclamationMark_COhq9() {
        assertTrue(PatternOptionBuilder.isValueCode('!'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCode_Other_ieiC10() {
        assertFalse(PatternOptionBuilder.isValueCode('a'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_UVvB3_fid1() {
        Options options = PatternOptionBuilder.parsePattern("a:i");
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_PpQQ4_fid1() {
        Options options = PatternOptionBuilder.parsePattern("a:l");
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_vwAJ5_fid1() {
        Options options = PatternOptionBuilder.parsePattern("a:f");
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_NnVo6_fid1() {
        Options options = PatternOptionBuilder.parsePattern("a:d");
        assertEquals(String.class, options.getOption("a").getType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueClass_LfTF0_fid1() {
        Object result = PatternOptionBuilder.getValueClass('a');
        assertNull(result);
    }
}