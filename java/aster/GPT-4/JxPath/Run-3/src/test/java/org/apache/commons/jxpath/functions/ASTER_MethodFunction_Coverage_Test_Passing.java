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
    public void testToString_pLOY0() throws NoSuchMethodException {
        Method exampleMethod = String.class.getMethod("length");
        MethodFunction methodFunction = new MethodFunction(exampleMethod);
    }
}