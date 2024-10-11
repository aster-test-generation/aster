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
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_PatternOptionBuilder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeForCharColon_BDPv0() {
        Class<?> result = PatternOptionBuilder.getValueType(':');
        assertEquals(PatternOptionBuilder.STRING_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeForCharPlus_Aizt1() {
        Class<?> result = PatternOptionBuilder.getValueType('+');
        assertEquals(PatternOptionBuilder.CLASS_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeForCharLessThan_ezKl2() {
        Class<?> result = PatternOptionBuilder.getValueType('<');
        assertEquals(PatternOptionBuilder.EXISTING_FILE_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeForCharGreaterThan_dXRy3() {
        Class<?> result = PatternOptionBuilder.getValueType('>');
        assertEquals(PatternOptionBuilder.FILE_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeForCharAsterisk_oRsT4() {
        Class<?> result = PatternOptionBuilder.getValueType('*');
        assertEquals(PatternOptionBuilder.FILES_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeForCharSlash_YJhe5() {
        Class<?> result = PatternOptionBuilder.getValueType('/');
        assertEquals(PatternOptionBuilder.URL_VALUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueTypeSwitchEntry_ZLRi6() {
        Class<?> result = PatternOptionBuilder.getValueType('A'); // 'A' is not defined in switch
        assertNull(result);
    }
}