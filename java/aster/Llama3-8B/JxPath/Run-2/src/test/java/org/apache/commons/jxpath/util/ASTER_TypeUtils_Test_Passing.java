/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TypeUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertTrue_uNgz0() {
        TypeUtils typeUtils = new TypeUtils();
        Object object = "Hello";
        Class toType = String.class;
        boolean result = typeUtils.canConvert(object, toType);
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertFalse_NDiI1() {
        TypeUtils typeUtils = new TypeUtils();
        Object object = new Integer(1);
        Class toType = String.class;
        boolean result = typeUtils.canConvert(object, toType);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTypeConverter_dCiS0() {
        TypeConverter typeConverter = TypeUtils.getTypeConverter();
        assertNotNull(typeConverter);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_qsAz1_1() {
        Object object = new Integer(1);
        Object result = TypeUtils.convert(object, Integer.class);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_qsAz1_2() {
        Object object = new Integer(1);
        Object result = TypeUtils.convert(object, Integer.class);
        assertEquals(1, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrapPrimitiveForNonPrimitiveType_lYPg1() {
    Class nonPrimitiveClass = String.class;
    Class result = TypeUtils.wrapPrimitive(nonPrimitiveClass);
    Assertions.assertEquals(nonPrimitiveClass, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrapPrimitiveForPrimitiveType_Uoti0_kySQ0() {
    Class primitiveClass =java.lang.Integer.class;
    Class result = TypeUtils.wrapPrimitive(primitiveClass);
    Class<?> expected = primitiveClass;
    Assertions.assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_qsAz1() {
        Object object = new Integer(1);
        Object result = TypeUtils.convert(object, Integer.class);
        assertNotNull(result);
        assertEquals(1, result);
    }
}