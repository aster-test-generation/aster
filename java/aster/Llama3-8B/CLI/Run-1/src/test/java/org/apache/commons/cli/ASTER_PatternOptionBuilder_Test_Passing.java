/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void testGetValueTypeAtSymbol_Pxvx0() {
        assertEquals(PatternOptionBuilder.OBJECT_VALUE, PatternOptionBuilder.getValueType('@'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeColonSymbol_cflr1() {
        assertEquals(PatternOptionBuilder.STRING_VALUE, PatternOptionBuilder.getValueType(':'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypePercentSymbol_OxZq2() {
        assertEquals(PatternOptionBuilder.NUMBER_VALUE, PatternOptionBuilder.getValueType('%'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypePlusSymbol_IOEk3() {
        assertEquals(PatternOptionBuilder.CLASS_VALUE, PatternOptionBuilder.getValueType('+'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeNumberSymbol_FjHh4() {
        assertEquals(PatternOptionBuilder.DATE_VALUE, PatternOptionBuilder.getValueType('#'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeLessThanSymbol_VFUE5() {
        assertEquals(PatternOptionBuilder.EXISTING_FILE_VALUE, PatternOptionBuilder.getValueType('<'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeGreaterThanSymbol_Peyb6() {
        assertEquals(PatternOptionBuilder.FILE_VALUE, PatternOptionBuilder.getValueType('>'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeAsteriskSymbol_anYn7() {
        assertEquals(PatternOptionBuilder.FILES_VALUE, PatternOptionBuilder.getValueType('*'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeForwardSlashSymbol_jQKc8() {
        assertEquals(PatternOptionBuilder.URL_VALUE, PatternOptionBuilder.getValueType('/'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeInvalidSymbol_VmQT9() {
        assertEquals(null, PatternOptionBuilder.getValueType('a'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern1_MAmz0_1() {
        Options options = PatternOptionBuilder.parsePattern("a");
        assertEquals(1, options.getOptions().size());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_mQgP1_1() {
        Options options = PatternOptionBuilder.parsePattern("a:b");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeAtSymbol_ljNG0() {
        boolean result = PatternOptionBuilder.isValueCode('@');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeColonSymbol_aQKk1() {
        boolean result = PatternOptionBuilder.isValueCode(':');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodePercentSymbol_xnPu2() {
        boolean result = PatternOptionBuilder.isValueCode('%');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodePlusSymbol_sMDd3() {
        boolean result = PatternOptionBuilder.isValueCode('+');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeNumberSymbol_DSzl4() {
        boolean result = PatternOptionBuilder.isValueCode('#');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeLessThanSymbol_TukL5() {
        boolean result = PatternOptionBuilder.isValueCode('<');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeGreaterThanSymbol_XlCt6() {
        boolean result = PatternOptionBuilder.isValueCode('>');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeAsteriskSymbol_wUqv7() {
        boolean result = PatternOptionBuilder.isValueCode('*');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeForwardSlashSymbol_RRAD8() {
        boolean result = PatternOptionBuilder.isValueCode('/');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeExclamationSymbol_JERl9() {
        boolean result = PatternOptionBuilder.isValueCode('!');
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeOtherSymbol_RZtL10() {
        boolean result = PatternOptionBuilder.isValueCode('a');
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern2_mQgP1_3() {
        Options options = PatternOptionBuilder.parsePattern("a:b");
        assertEquals(true, options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern3_xoSM2_3() {
        Options options = PatternOptionBuilder.parsePattern("a:b!");
        assertEquals(true, options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern4_wsOI3_3() {
        Options options = PatternOptionBuilder.parsePattern("a:b:c");
        assertEquals(true, options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern5_NZsh4_3() {
        Options options = PatternOptionBuilder.parsePattern("a:b:c!");
        assertEquals(true, options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern6_KtCg5_3() {
        Options options = PatternOptionBuilder.parsePattern("a:b:c:d");
        assertEquals(true, options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern7_JDGI6_3() {
        Options options = PatternOptionBuilder.parsePattern("a:b:c:d!");
        assertEquals(true, options.getOption("a").hasArg());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnsupported_RhuP1_IWio1() {
        boolean result = PatternOptionBuilder.isValueCode('@');
        assertEquals(true, result);
    }
}