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
public void testCanConvertWithValidConversion_qRIH0() {
    Object testObject = "123";
    Class<?> targetType = Integer.class;
    boolean result = TypeUtils.canConvert(testObject, targetType);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTypeConverterNotNull_EqQt0() {
    TypeConverter result = TypeUtils.getTypeConverter();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testConvertObjectToString_atpK0() {
    Integer input = 123;
    String expected = "123";
    String result = (String) TypeUtils.convert(input, String.class);
    assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapPrimitiveWithInt_sGyc0() {
        Class result = TypeUtils.wrapPrimitive(int.class);
        assertEquals(Integer.class, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapPrimitiveWithNonPrimitive_zWFG1() {
        Class result = TypeUtils.wrapPrimitive(String.class);
        assertEquals(String.class, result);
    }
}