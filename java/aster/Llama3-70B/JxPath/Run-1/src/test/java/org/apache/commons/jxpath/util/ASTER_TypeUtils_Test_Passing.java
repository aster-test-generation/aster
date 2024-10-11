/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TypeUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_eHTS0() {
        TypeUtils typeUtils = new TypeUtils();
        Object object = new Object();
        Class toType = Object.class;
        boolean result = TypeUtils.canConvert(object, toType);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTypeConverter_Lfkp0() {
        TypeUtils typeUtils = new TypeUtils();
        TypeConverter typeConverter = TypeUtils.getTypeConverter();
        assertNotNull(typeConverter);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_ZJnZ0() {
        TypeUtils typeUtils = new TypeUtils();
        Object object = "123";
        Class toType = Integer.class;
        Object result = TypeUtils.convert(object, toType);
        assertEquals(123, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapPrimitive_primitive_ched0() {
        Class<?> result = TypeUtils.wrapPrimitive(int.class);
        assertEquals(Integer.class, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapPrimitive_nonPrimitive_aLld1() {
        Class<?> result = TypeUtils.wrapPrimitive(String.class);
        assertEquals(String.class, result);
    }
}