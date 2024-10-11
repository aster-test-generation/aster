/**
 * Generated by Aster
 */
package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_TypeHandler_Coverage_Test_Passing {
    {
    }

    {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateValueWithStringAndObject_BHQG0() throws ParseException {
        final String string = "test";
        final Object obj = String.class;
        final Object expected = "test";
        final Object actual = TypeHandler.createValue(string, obj);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateObject_QlvL0() throws ParseException {
        String className = "java.lang.String";
        Object object = TypeHandler.createObject(className);
        assertEquals(String.class, object.getClass());
    }
}