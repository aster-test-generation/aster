/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.ExpressionContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MethodFunction_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInvokeInstanceMethodWithNoParameters_tSnw4_PdtX0() throws Exception {
    Method method = String.class.getMethod("length");
    MethodFunction function = new MethodFunction(method);
    ExpressionContext context = mock(ExpressionContext.class);
    Object[] parameters = new Object[]{"test"};
    int result = (int) function.invoke(context, parameters);
    assertEquals(4, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInvokeStaticMethodWithNoParameters_wJhe0_mUIA0() throws Exception {
    Method method = String.class.getMethod("valueOf", int.class);
    MethodFunction function = new MethodFunction(method);
    ExpressionContext context = mock(ExpressionContext.class);
    Object[] parameters = new Object[]{123};
    Object result = function.invoke(context, parameters);
    assertEquals("123", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInvokeInstanceMethodWithExpressionContextParameter_RuAs5_mUlc0() throws Exception {
    Method method = String.class.getMethod("substring", int.class);
    MethodFunction function = new MethodFunction(method);
    ExpressionContext context = mock(ExpressionContext.class);
    Object[] parameters = new Object[]{"test", 1};
    Object result = function.invoke(context, parameters);
    assertEquals("est", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInvokeStaticMethodWithConversion_BovS3_kgnd0() throws Exception {
    Method method = String.class.getMethod("valueOf", int.class);
    MethodFunction function = new MethodFunction(method);
    ExpressionContext context = mock(ExpressionContext.class);
    Object[] parameters = new Object[]{123}; // Corrected to pass an integer since method expects int
    Object result = function.invoke(context, parameters);
    assertEquals("123", result); // Asserting the expected result of String.valueOf(123)
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInvokeInstanceMethodWithConversion_zaMp6_ECLf0() throws Exception {
    Method method = String.class.getMethod("substring", int.class);
    when(method.getModifiers()).thenReturn(0);
    MethodFunction function = new MethodFunction(method);
    ExpressionContext context = mock(ExpressionContext.class);
    Object[] parameters = new Object[]{"test", "1"};
    function.invoke(context, parameters);
}
}