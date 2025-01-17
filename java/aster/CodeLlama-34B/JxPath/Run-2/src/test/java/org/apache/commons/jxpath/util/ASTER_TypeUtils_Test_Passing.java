/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TypeUtils_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_nullObject_zaPQ0() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_StringToDouble_ydgE3() {
        Object result = TypeUtils.convert("1.23", Double.class);
        assertEquals(1.23, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_DoubleToInteger_fYie7() {
        Object result = TypeUtils.convert(1.23, Integer.class);
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_DoubleToCharacter_chxr11() {
        Object result = TypeUtils.convert(1.23, Character.class);
        assertEquals('1', result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_ObjectToInteger_HnOL16() {
        Object result = TypeUtils.convert(new Object(), Integer.class);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapPrimitive_primitive_kbvg0() {
        Class<?> wrapped = TypeUtils.wrapPrimitive(int.class);
        assertEquals(Integer.class, wrapped);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapPrimitive_nonPrimitive_ilxw1() {
        Class<?> wrapped = TypeUtils.wrapPrimitive(String.class);
        assertEquals(String.class, wrapped);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetTypeConverterWithNull_Hulu1_IPqp0() {
        TypeUtils.setTypeConverter(null);
        assertNull(TypeUtils.getTypeConverter());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_StringToCharacter_wljy5_fid2() {
        Object result = TypeUtils.convert("a", Character.class);
        assertEquals('a', result);
    }
}