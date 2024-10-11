/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TypeUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertTrue_gnAD0() throws Exception {
        TypeUtils typeUtils = new TypeUtils();
        Object object = "Hello";
        Class toType = String.class;
        boolean result = typeUtils.canConvert(object, toType);
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertFalse_peuR1() throws Exception {
        TypeUtils typeUtils = new TypeUtils();
        Object object = new Integer(1);
        Class toType = String.class;
        boolean result = typeUtils.canConvert(object, toType);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTypeConverter_pJOG0() throws Exception {
        TypeConverter typeConverter = TypeUtils.getTypeConverter();
        assertNotNull(typeConverter);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapPrimitiveNonPrimitiveType_GbGl1() throws Exception {
        Class nonPrimitiveType = String.class;
        Class result = TypeUtils.wrapPrimitive(nonPrimitiveType);
        assertEquals(nonPrimitiveType, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToInt_doNT1_1() throws Exception {
        Object object = "123";
        Class toType = Integer.class;
        Object result = TypeUtils.convert(object, toType);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToInt_doNT1_2() throws Exception {
        Object object = "123";
        Class toType = Integer.class;
        Object result = TypeUtils.convert(object, toType);
        assertEquals(123, (int) result);}
}