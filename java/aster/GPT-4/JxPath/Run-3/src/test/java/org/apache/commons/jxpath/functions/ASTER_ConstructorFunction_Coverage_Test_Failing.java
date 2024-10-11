/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;
import java.lang.reflect.Constructor;
import org.apache.commons.jxpath.ExpressionContext;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ConstructorFunction_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullContext_kLXT9() {
        try {
            Constructor<ExpressionContext> constructor = ExpressionContext.class.getConstructor();
            ConstructorFunction constructorFunction = new ConstructorFunction(constructor);
            constructorFunction.invoke(null, new Object[]{});
            fail("Exception should have been thrown");
        } catch (NullPointerException e) {
        } catch (Exception e) {
            fail("Wrong exception type thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInvokeWithEmptyParameters_HQmV1_RPgO0() {
    try {
        Constructor<ExpressionContext> constructor = ExpressionContext.class.getConstructor();
        ConstructorFunction constructorFunction = new ConstructorFunction(constructor);
        ExpressionContext mockContext = mock(ExpressionContext.class);
        Object result = constructorFunction.invoke(mockContext, new Object[]{});
        assertNotNull(result);
        assertTrue(result instanceof ExpressionContext);
    } catch (Exception e) {
        fail("Exception should not be thrown");
    }
}
}