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

public class Aster_TypeHandler_Coverage_Test_Passing {
    private TypeHandler typeHandler;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValueWithClass_Zvfw0() throws ParseException {
        TypeHandler typeHandler = new TypeHandler();
        String string = "test";
        Class<?> clazz = String.class;
        Object result = typeHandler.createValue(string, clazz);
        assertEquals(string, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOpenFileWithInvalidFileName_quAP1() throws org.apache.commons.cli.ParseException {
        String fileName = "invalid_file_name";
        try {
            TypeHandler.openFile(fileName);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertFalse(e.getMessage().contains("Invalid file name"));
        }
    }
}