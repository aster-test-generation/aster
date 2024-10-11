/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MethodFunction_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_dDca0() throws NoSuchMethodException {
        Method method = String.class.getMethod("toString");
        MethodFunction methodFunction = new MethodFunction(method);
        String result = methodFunction.toString();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInvoke_InvocationTargetException_GAkA8_FGga0() {
}
}