/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TypeUtils_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapPrimitive_esTO0_1() {
        Class primitiveClass = int.class;
        Class result = TypeUtils.wrapPrimitive(primitiveClass);
        Class nonPrimitiveClass = String.class;
        result = TypeUtils.wrapPrimitive(nonPrimitiveClass);
        assertEquals(int.class, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrapPrimitive_esTO0_1_fid1() {
        Class primitiveClass =java.lang.String.class;
        Class result = TypeUtils.wrapPrimitive(primitiveClass);
        Class nonPrimitiveClass = String.class;
        result = TypeUtils.wrapPrimitive(nonPrimitiveClass);
        assertEquals(int.class, result);}
}