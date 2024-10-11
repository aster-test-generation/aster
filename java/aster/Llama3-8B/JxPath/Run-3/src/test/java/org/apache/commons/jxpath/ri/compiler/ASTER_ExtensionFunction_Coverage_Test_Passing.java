/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExtensionFunction_Coverage_Test_Passing {
    private Object computeValue(EvalContext context) {
        return null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringNullArguments_KInJ0() {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("functionName"), null);
        String result = extensionFunction.toString();
        assertEquals("functionName()", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringEmptyArguments_GvxX1() {
        ExtensionFunction extensionFunction = new ExtensionFunction(new QName("functionName"), new Expression[0]);
        String result = extensionFunction.toString();
        assertEquals("functionName()", result);
}
}