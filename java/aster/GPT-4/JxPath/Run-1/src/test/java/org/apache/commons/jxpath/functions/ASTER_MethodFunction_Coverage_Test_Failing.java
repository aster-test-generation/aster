/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.ExpressionContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MethodFunction_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
        public void methodThatThrows_jFxk10() throws Exception {
            throw new Exception("Intentional Exception");
        }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInvokeWithNullParametersArray_byCf3_mHlE0() throws Exception {
    Method method = ExpressionContext.class.getMethod("staticMethodWithParams", ExpressionContext.class, int.class);
    MethodFunction function = new MethodFunction(method);
}
}