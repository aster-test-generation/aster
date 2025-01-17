/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ConstructorFunction_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullParameters_ftPC0() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = null;
        try {
            constructorFunction.invoke(null, parameters);
            fail("Expected JXPathInvalidAccessException to be thrown");
        } catch (JXPathInvalidAccessException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithEmptyParameters_wkGl1() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[0];
        try {
            constructorFunction.invoke(null, parameters);
            fail("Expected JXPathInvalidAccessException to be thrown");
        } catch (JXPathInvalidAccessException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullContextAndOneParameter_WLqx3() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[1];
        try {
            constructorFunction.invoke(null, parameters);
            fail("Expected JXPathInvalidAccessException to be thrown");
        } catch (JXPathInvalidAccessException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullContextAndTwoParameters_RRhj6() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[2];
        try {
            constructorFunction.invoke(null, parameters);
            fail("Expected JXPathInvalidAccessException to be thrown");
        } catch (JXPathInvalidAccessException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullContextAndThreeParameters_AjmR8() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[3];
        try {
            constructorFunction.invoke(null, parameters);
            fail("Expected JXPathInvalidAccessException to be thrown");
        } catch (JXPathInvalidAccessException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullContextAndFourParameters_Rpzk10() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[4];
        try {
            constructorFunction.invoke(null, parameters);
            fail("Expected JXPathInvalidAccessException to be thrown");
        } catch (JXPathInvalidAccessException e) {
        }
}
}