/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithAtSymbol_gQnZ0() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType('@');
        Assertions.assertEquals(PatternOptionBuilder.OBJECT_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithColonSymbol_vHAe1() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType(':');
        Assertions.assertEquals(PatternOptionBuilder.STRING_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithPercentSymbol_iUgw2() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType('%');
        Assertions.assertEquals(PatternOptionBuilder.NUMBER_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithPlusSymbol_bZKu3() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType('+');
        Assertions.assertEquals(PatternOptionBuilder.CLASS_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithHashSymbol_OaWs4() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType('#');
        Assertions.assertEquals(PatternOptionBuilder.DATE_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithLessThanSymbol_jEsC5() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType('<');
        Assertions.assertEquals(PatternOptionBuilder.EXISTING_FILE_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithGreaterThanSymbol_WtYq6() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType('>');
        Assertions.assertEquals(PatternOptionBuilder.FILE_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithAsteriskSymbol_lLeZ7() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType('*');
        Assertions.assertEquals(PatternOptionBuilder.FILES_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithSlashSymbol_mFWZ8() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType('/');
        Assertions.assertEquals(PatternOptionBuilder.URL_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithInvalidSymbol_YPBS9() throws Exception {
        Class<?> result = PatternOptionBuilder.getValueType('?');
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParsePattern_zGgY0_1() throws Exception {
        Options options = PatternOptionBuilder.parsePattern("a");
        options = PatternOptionBuilder.parsePattern("a:b");
        options = PatternOptionBuilder.parsePattern("a:b:c");
        options = PatternOptionBuilder.parsePattern("a::b");
        options = PatternOptionBuilder.parsePattern("a::b");
        options = PatternOptionBuilder.parsePattern("a::b");
        options = PatternOptionBuilder.parsePattern("a::b");
        options = PatternOptionBuilder.parsePattern("a::b");
        options = PatternOptionBuilder.parsePattern("a::b");
        assertEquals(1, options.getOptions().size());
    }
}