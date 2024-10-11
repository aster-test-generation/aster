/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFile_iSMx0_1() {
        File file = TypeHandler.createFile("test.txt");
        assertNotNull(file);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFile_iSMx0_2() {
        File file = TypeHandler.createFile("test.txt");
        assertEquals("test.txt", file.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefault_NqMh0() {
        TypeHandler typeHandler = TypeHandler.getDefault();
        assertNotNull(typeHandler);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateDefaultMap_uzbR0() {
        Map<Class<?>, Converter<?, ? extends Throwable>> result = TypeHandler.createDefaultMap();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValue_hXaa0_AqTn0() {
        TypeHandler typeHandler = new TypeHandler();
        String string = "test";
        Class<String> clazz = String.class;
        try {
            String result = typeHandler.createValue(string, clazz);
            assertEquals(string, result);
        } catch (ParseException e) {
            fail("ParseException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateFile_iSMx0() {
        File file = TypeHandler.createFile("test.txt");
        assertNotNull(file);
        assertEquals("test.txt", file.getName());
    }
}