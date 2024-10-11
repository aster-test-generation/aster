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
    public void testGetValueTypeWithAtSymbol_juSF0() {
        Class<?> result = PatternOptionBuilder.getValueType('@');
        assertEquals(PatternOptionBuilder.OBJECT_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithColonSymbol_BexL1() {
        Class<?> result = PatternOptionBuilder.getValueType(':');
        assertEquals(PatternOptionBuilder.STRING_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithPercentSymbol_ZjYM2() {
        Class<?> result = PatternOptionBuilder.getValueType('%');
        assertEquals(PatternOptionBuilder.NUMBER_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithPlusSymbol_Hqbu3() {
        Class<?> result = PatternOptionBuilder.getValueType('+');
        assertEquals(PatternOptionBuilder.CLASS_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithHashSymbol_Jbgz4() {
        Class<?> result = PatternOptionBuilder.getValueType('#');
        assertEquals(PatternOptionBuilder.DATE_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithLessThanSymbol_iLXL5() {
        Class<?> result = PatternOptionBuilder.getValueType('<');
        assertEquals(PatternOptionBuilder.EXISTING_FILE_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithGreaterThanSymbol_OkTM6() {
        Class<?> result = PatternOptionBuilder.getValueType('>');
        assertEquals(PatternOptionBuilder.FILE_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithAsteriskSymbol_Zunh7() {
        Class<?> result = PatternOptionBuilder.getValueType('*');
        assertEquals(PatternOptionBuilder.FILES_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithSlashSymbol_IrpH8() {
        Class<?> result = PatternOptionBuilder.getValueType('/');
        assertEquals(PatternOptionBuilder.URL_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeWithInvalidSymbol_ehls9() {
        Class<?> result = PatternOptionBuilder.getValueType('?');
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithAtSymbol_tePu0() {
        assertTrue(PatternOptionBuilder.isValueCode('@'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithColonSymbol_yERJ1() {
        assertTrue(PatternOptionBuilder.isValueCode(':'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithPercentSymbol_yrSQ2() {
        assertTrue(PatternOptionBuilder.isValueCode('%'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithPlusSymbol_wOXp3() {
        assertTrue(PatternOptionBuilder.isValueCode('+'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithHashSymbol_mLwT4() {
        assertTrue(PatternOptionBuilder.isValueCode('#'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithLessThanSymbol_msct5() {
        assertTrue(PatternOptionBuilder.isValueCode('<'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithMoreThanSymbol_aEtJ6() {
        assertTrue(PatternOptionBuilder.isValueCode('>'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithAsteriskSymbol_IRQk7() {
        assertTrue(PatternOptionBuilder.isValueCode('*'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithSlashSymbol_qZUb8() {
        assertTrue(PatternOptionBuilder.isValueCode('/'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithExclamationSymbol_lALH9() {
        assertTrue(PatternOptionBuilder.isValueCode('!'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithRandomSymbol_FrCs10() {
        assertFalse(PatternOptionBuilder.isValueCode('?'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithSpaceSymbol_VLKv11() {
        assertFalse(PatternOptionBuilder.isValueCode(' '));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithTabSymbol_nQXD12() {
        assertFalse(PatternOptionBuilder.isValueCode('\t'));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsValueCodeWithNewlineSymbol_eENu13() {
        assertFalse(PatternOptionBuilder.isValueCode('\n'));
    }
}